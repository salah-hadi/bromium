package com.hribol.bromium.replay.execution.synchronization;

/**
 * Created by hvrigazov on 03.06.17.
 */
public interface EventDispatcher {
    void awaitUntil(SynchronizationEvent synchronizationEvent);
}
