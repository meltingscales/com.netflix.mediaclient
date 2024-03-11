package com.airbnb.epoxy;

import o.AbstractC3073as;

/* loaded from: classes2.dex */
public class ImmutableModelException extends RuntimeException {
    public ImmutableModelException(AbstractC3073as abstractC3073as, int i) {
        this(abstractC3073as, "", i);
    }

    public ImmutableModelException(AbstractC3073as abstractC3073as, String str, int i) {
        super(a(abstractC3073as, str, i));
    }

    private static String a(AbstractC3073as abstractC3073as, String str, int i) {
        return str + " Position: " + i + " Model: " + abstractC3073as.toString() + "\n\nEpoxy attribute fields on a model cannot be changed once the model is added to a controller. Check that these fields are not updated, or that the assigned objects are not mutated, outside of the buildModels method. The only exception is if the change is made inside an Interceptor callback. Consider using an interceptor if you need to change a model after it is added to the controller and before it is set on the adapter. If the model is already set on the adapter then you must call `requestModelBuild` instead to recreate all models.";
    }
}
