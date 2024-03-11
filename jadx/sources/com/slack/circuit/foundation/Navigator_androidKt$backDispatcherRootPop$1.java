package com.slack.circuit.foundation;

import androidx.activity.OnBackPressedDispatcher;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.dpR;
import o.drO;

/* loaded from: classes5.dex */
public final /* synthetic */ class Navigator_androidKt$backDispatcherRootPop$1 extends FunctionReferenceImpl implements drO<dpR> {
    public Navigator_androidKt$backDispatcherRootPop$1(Object obj) {
        super(0, obj, OnBackPressedDispatcher.class, "onBackPressed", "onBackPressed()V", 0);
    }

    public final void b() {
        ((OnBackPressedDispatcher) this.receiver).onBackPressed();
    }

    @Override // o.drO
    public /* synthetic */ dpR invoke() {
        b();
        return dpR.c;
    }
}
