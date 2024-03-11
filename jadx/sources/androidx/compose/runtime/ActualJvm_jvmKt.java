package androidx.compose.runtime;

import o.C8632dsu;
import o.dpR;
import o.drX;
import o.dsH;

/* loaded from: classes.dex */
public final class ActualJvm_jvmKt {
    public static final int identityHashCode(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void invokeComposable(Composer composer, drX<? super Composer, ? super Integer, dpR> drx) {
        C8632dsu.d(drx);
        ((drX) dsH.a(drx, 2)).invoke(composer, 1);
    }

    public static final long currentThreadId() {
        return Thread.currentThread().getId();
    }

    public static final String currentThreadName() {
        return Thread.currentThread().getName();
    }
}
