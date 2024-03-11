package com.airbnb.epoxy;

import android.os.Handler;
import o.AbstractC2914ap;
import o.C2808an;

/* loaded from: classes5.dex */
public abstract class AsyncEpoxyController extends AbstractC2914ap {
    public AsyncEpoxyController() {
        this(true);
    }

    public AsyncEpoxyController(boolean z) {
        this(z, z);
    }

    public AsyncEpoxyController(boolean z, boolean z2) {
        super(getHandler(z), getHandler(z2));
    }

    private static Handler getHandler(boolean z) {
        return z ? C2808an.a() : C2808an.b;
    }
}
