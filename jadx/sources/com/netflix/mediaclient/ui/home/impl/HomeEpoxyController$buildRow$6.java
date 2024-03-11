package com.netflix.mediaclient.ui.home.impl;

import android.view.View;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.home.impl.HomeEpoxyController;
import com.netflix.mediaclient.ui.home.impl.HomeEpoxyController$buildRow$6;
import kotlin.jvm.internal.Lambda;
import o.AbstractC3073as;
import o.C1729aMb;
import o.C3794bKx;
import o.C8168dfL;
import o.C8632dsu;
import o.C9834xU;
import o.bJE;
import o.bSJ;
import o.bSY;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes4.dex */
public final class HomeEpoxyController$buildRow$6 extends Lambda implements drM<bJE, dpR> {
    final /* synthetic */ HomeEpoxyController a;
    final /* synthetic */ C1729aMb b;
    final /* synthetic */ int c;
    final /* synthetic */ LoMo d;
    final /* synthetic */ TrackingInfoHolder e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeEpoxyController$buildRow$6(LoMo loMo, C1729aMb c1729aMb, int i, HomeEpoxyController homeEpoxyController, TrackingInfoHolder trackingInfoHolder) {
        super(1);
        this.d = loMo;
        this.b = c1729aMb;
        this.c = i;
        this.a = homeEpoxyController;
        this.e = trackingInfoHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i, int i2, int i3) {
        return i;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(bJE bje) {
        c(bje);
        return dpR.c;
    }

    public final void c(bJE bje) {
        C8632dsu.c((Object) bje, "");
        int listPos = this.d.getListPos();
        bje.b("row-" + listPos);
        bje.d(this.d.getListPos());
        bje.b(this.b);
        bje.b(new AbstractC3073as.b() { // from class: o.bSH
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int e;
                e = HomeEpoxyController$buildRow$6.e(i, i2, i3);
                return e;
            }
        });
        int i = this.c;
        final HomeEpoxyController homeEpoxyController = this.a;
        final LoMo loMo = this.d;
        final TrackingInfoHolder trackingInfoHolder = this.e;
        C3794bKx c3794bKx = new C3794bKx();
        c3794bKx.b((CharSequence) ("error-row-" + i + "-retry"));
        c3794bKx.e((CharSequence) C8168dfL.d(C9834xU.h.f));
        c3794bKx.d(new View.OnClickListener() { // from class: o.bSF
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeEpoxyController$buildRow$6.d(HomeEpoxyController.this, loMo, view);
            }
        });
        c3794bKx.a(bSY.a(homeEpoxyController.getHomeModelTracking(), false, 1, null));
        c3794bKx.c((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.HomeEpoxyController$buildRow$6$2$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final TrackingInfo invoke() {
                return TrackingInfoHolder.this.c();
            }
        });
        bje.add(c3794bKx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(HomeEpoxyController homeEpoxyController, LoMo loMo, View view) {
        C8632dsu.c((Object) homeEpoxyController, "");
        C8632dsu.c((Object) loMo, "");
        homeEpoxyController.emit(new bSJ.n(loMo, 0, 2, null));
        Logger.INSTANCE.logEvent(new Selected(AppView.tryAgainButton, null, CommandValue.RetryCommand, null));
    }
}
