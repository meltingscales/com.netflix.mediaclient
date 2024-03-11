package com.netflix.mediaclient.ui.adsplan.impl;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApiImpl$1;
import o.C5305bwJ;
import o.C5311bwP;
import o.C8157dfA;
import o.C8187dfe;
import o.C8632dsu;
import o.InterfaceC5304bwI;
import o.InterfaceC6675chl;

/* loaded from: classes4.dex */
public final class AdsPlanApiImpl$1 implements DefaultLifecycleObserver {
    final /* synthetic */ C5305bwJ b;
    private final Runnable d;
    private final Runnable e;

    public AdsPlanApiImpl$1(final C5305bwJ c5305bwJ) {
        this.b = c5305bwJ;
        this.e = new Runnable() { // from class: o.bwN
            @Override // java.lang.Runnable
            public final void run() {
                AdsPlanApiImpl$1.c(C5305bwJ.this);
            }
        };
        this.d = new Runnable() { // from class: o.bwK
            @Override // java.lang.Runnable
            public final void run() {
                AdsPlanApiImpl$1.e(C5305bwJ.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C5305bwJ c5305bwJ) {
        C8632dsu.c((Object) c5305bwJ, "");
        if (c5305bwJ.d(c5305bwJ.g())) {
            C8157dfA.e(c5305bwJ.o(), "PENDING_CFOUR_PLAN_ALERT");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5305bwJ c5305bwJ) {
        C8632dsu.c((Object) c5305bwJ, "");
        c5305bwJ.r();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        C5311bwP c5311bwP;
        InterfaceC5304bwI interfaceC5304bwI;
        C8632dsu.c((Object) lifecycleOwner, "");
        c5311bwP = this.b.b;
        c5311bwP.e();
        interfaceC5304bwI = this.b.a;
        interfaceC5304bwI.d(this.b);
        super.onDestroy(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner lifecycleOwner) {
        InterfaceC6675chl interfaceC6675chl;
        C8632dsu.c((Object) lifecycleOwner, "");
        C8187dfe.e(this.e);
        C8187dfe.e(this.d);
        String e = C8157dfA.e(this.b.o(), "CFOUR_UPSELL_GROUP_WHILE_LINK_COPIED_PREF", (String) null);
        if (e != null) {
            C5305bwJ c5305bwJ = this.b;
            interfaceC6675chl = c5305bwJ.m;
            interfaceC6675chl.e(e);
            C8157dfA.e(c5305bwJ.o(), "CFOUR_UPSELL_GROUP_WHILE_LINK_COPIED_PREF");
        }
        super.onPause(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner lifecycleOwner) {
        InterfaceC5304bwI interfaceC5304bwI;
        C8632dsu.c((Object) lifecycleOwner, "");
        super.onCreate(lifecycleOwner);
        interfaceC5304bwI = this.b.a;
        interfaceC5304bwI.b(this.b);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner lifecycleOwner) {
        AdsPlanApplicationImpl n;
        C8632dsu.c((Object) lifecycleOwner, "");
        super.onResume(lifecycleOwner);
        n = this.b.n();
        if (n.c()) {
            C8187dfe.c(this.d);
        } else if (this.b.l()) {
            C8187dfe.c(this.e);
        }
    }
}
