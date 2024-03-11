package com.airbnb.epoxy;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import o.C1484aD;
import o.C1538aF;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC2023aX;
import o.InterfaceC8554dpx;
import o.dpB;
import o.dpR;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class LifecycleAwareEpoxyViewBinder implements LifecycleObserver {
    private View a;
    private final LifecycleOwner b;
    private final drO<View> c;
    private final boolean d;
    private final drX<InterfaceC2023aX, Context, dpR> e;
    private final boolean g;
    private final int h;
    private final C1538aF i;
    private final InterfaceC8554dpx j;

    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleAwareEpoxyViewBinder(LifecycleOwner lifecycleOwner, drO<? extends View> dro, int i, boolean z, boolean z2, drX<? super InterfaceC2023aX, ? super Context, dpR> drx) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) drx, "");
        this.b = lifecycleOwner;
        this.c = dro;
        this.h = i;
        this.g = z;
        this.d = z2;
        this.e = drx;
        this.i = new C1538aF();
        b = dpB.b(new drO<C1484aD>() { // from class: com.airbnb.epoxy.LifecycleAwareEpoxyViewBinder$visibilityTracker$2
            @Override // o.drO
            /* renamed from: d */
            public final C1484aD invoke() {
                C1484aD c1484aD = new C1484aD();
                c1484aD.e((Integer) 100);
                return c1484aD;
            }
        });
        this.j = b;
    }

    public /* synthetic */ LifecycleAwareEpoxyViewBinder(LifecycleOwner lifecycleOwner, drO dro, int i, boolean z, boolean z2, drX drx, int i2, C8627dsp c8627dsp) {
        this(lifecycleOwner, dro, i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, drx);
    }

    private final C1484aD a() {
        return (C1484aD) this.j.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View c() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.LifecycleAwareEpoxyViewBinder.c():android.view.View");
    }

    public final void e() {
        View c = this.i.c(c(), this.e);
        if (this.g) {
            a().b(c);
        }
        this.a = c;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onViewDestroyed() {
        View view = this.a;
        if (view != null) {
            this.i.c(view);
        }
        this.a = null;
        if (this.g) {
            a().c();
        }
    }
}
