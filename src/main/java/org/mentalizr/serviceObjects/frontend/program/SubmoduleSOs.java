package org.mentalizr.serviceObjects.frontend.program;

public class SubmoduleSOs {

    public static StepSO getFirstStep(SubmoduleSO submoduleSO) {
        return submoduleSO.getSteps().get(0);
    }

}
