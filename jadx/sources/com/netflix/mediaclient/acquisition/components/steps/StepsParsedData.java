package com.netflix.mediaclient.acquisition.components.steps;

import o.C8632dsu;

/* loaded from: classes3.dex */
public final class StepsParsedData {
    public static final int $stable = 0;
    private final Integer currentStep;
    private final Integer totalSteps;

    public static /* synthetic */ StepsParsedData copy$default(StepsParsedData stepsParsedData, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = stepsParsedData.currentStep;
        }
        if ((i & 2) != 0) {
            num2 = stepsParsedData.totalSteps;
        }
        return stepsParsedData.copy(num, num2);
    }

    public final Integer component1() {
        return this.currentStep;
    }

    public final Integer component2() {
        return this.totalSteps;
    }

    public final StepsParsedData copy(Integer num, Integer num2) {
        return new StepsParsedData(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StepsParsedData) {
            StepsParsedData stepsParsedData = (StepsParsedData) obj;
            return C8632dsu.c(this.currentStep, stepsParsedData.currentStep) && C8632dsu.c(this.totalSteps, stepsParsedData.totalSteps);
        }
        return false;
    }

    public final Integer getCurrentStep() {
        return this.currentStep;
    }

    public final Integer getTotalSteps() {
        return this.totalSteps;
    }

    public int hashCode() {
        Integer num = this.currentStep;
        int hashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.totalSteps;
        return (hashCode * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.currentStep;
        Integer num2 = this.totalSteps;
        return "StepsParsedData(currentStep=" + num + ", totalSteps=" + num2 + ")";
    }

    public StepsParsedData(Integer num, Integer num2) {
        this.currentStep = num;
        this.totalSteps = num2;
    }
}
