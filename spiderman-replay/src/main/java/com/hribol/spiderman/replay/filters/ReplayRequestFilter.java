package com.hribol.spiderman.replay.filters;

import com.hribol.spiderman.replay.LockCallback;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static com.hribol.spiderman.replay.config.utils.Constants.CONDITION_NOT_SATISFIED_URL;
import static com.hribol.spiderman.replay.config.utils.Constants.CONDITION_SATISFIED_URL;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayRequestFilter extends ReplayBaseFilter implements RequestFilter {
    private Set<String> conditionsSatisfied;
    private Optional<String> optionalEvent;
    private Optional<Object> optionalLock;
    private boolean httpLock;

    public ReplayRequestFilter(String baseURI, Set<HttpRequest> httpRequestQueue) throws URISyntaxException {
        super(baseURI, httpRequestQueue);
        this.conditionsSatisfied = Collections.synchronizedSet(new HashSet<>());
        this.optionalEvent = Optional.empty();
        this.optionalLock = Optional.empty();
        this.httpLock = false;
    }

    @Override
    public HttpResponse filterRequest(HttpRequest httpRequest, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        addHttpRequestToQueue(httpMessageInfo.getOriginalRequest());
        this.httpLock = false;

        if (httpRequest.getUri().contains(CONDITION_SATISFIED_URL)) {
            try {
                URL url = new URL(httpRequest.getUri());
                String event = url.getQuery();
                conditionsSatisfied.add(event);
                System.out.println("Satisfied " + conditionsSatisfied.size());

                if (optionalEvent.isPresent() && optionalEvent.get().equals(event)) {
                    if (optionalLock.isPresent()) {
                        Object lock = optionalLock.get();
                        synchronized (lock) {
                            lock.notify();
                        }
                    }
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        if (httpRequest.getUri().contains(CONDITION_NOT_SATISFIED_URL)) {
            try {
                URL url = new URL(httpRequest.getUri());
                conditionsSatisfied.remove(url.getQuery());
                System.out.println("Not Satisfied " + conditionsSatisfied.size());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public boolean isSatisfied(String event) {
        return conditionsSatisfied.contains(event);
    }

    public boolean waitsForPrecondition() {
        return optionalEvent.isPresent() && !isSatisfied(optionalEvent.get());
    }

    public boolean setWaitingEvent(String event, Object lock) {
        optionalEvent = Optional.of(event);
        optionalLock = Optional.ofNullable(lock);

        return isSatisfied(event);
    }

    public void signalizeEventIsDone() {
        optionalEvent = Optional.empty();
        optionalLock = Optional.empty();
    }

    public void setHttpLock(boolean lock) {
        this.httpLock = lock;
    }

    public boolean isHttpLocked() {
        return this.httpLock;
    }
}
