package com.hribol.bromium.common.generation.helper;

import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.GenerationInformation;

import java.util.List;
import java.util.Map;

/**
 * Created by hvrigazov on 01.07.17.
 */
public class StepsAndConfiguration implements GenerationInformation {
    private TestScenarioSteps testCaseSteps;
    private ApplicationConfiguration applicationConfiguration;

    public StepsAndConfiguration(TestScenarioSteps testCaseSteps, ApplicationConfiguration applicationConfiguration) {
        this.testCaseSteps = testCaseSteps;
        this.applicationConfiguration = applicationConfiguration;
    }

    public ApplicationConfiguration getApplicationConfiguration() {
        return applicationConfiguration;
    }

    public TestScenarioSteps getTestCaseSteps() {
        return testCaseSteps;
    }
}