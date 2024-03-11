package com.netflix.mediaclient.ui.home.impl;

import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.home.impl.HomeEpoxyController$addRowLoadingState$1;
import kotlin.jvm.internal.Lambda;
import o.AbstractC3073as;
import o.C1729aMb;
import o.C8632dsu;
import o.bJE;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes4.dex */
public final class HomeEpoxyController$addRowLoadingState$1 extends Lambda implements drM<bJE, dpR> {
    final /* synthetic */ LoMo a;
    final /* synthetic */ HomeEpoxyController b;
    final /* synthetic */ int c;
    final /* synthetic */ drO<dpR> d;
    final /* synthetic */ C1729aMb e;
    final /* synthetic */ int i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeEpoxyController$addRowLoadingState$1(LoMo loMo, C1729aMb c1729aMb, HomeEpoxyController homeEpoxyController, int i, int i2, drO<dpR> dro) {
        super(1);
        this.a = loMo;
        this.e = c1729aMb;
        this.b = homeEpoxyController;
        this.i = i;
        this.c = i2;
        this.d = dro;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(int i, int i2, int i3) {
        return i;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(bJE bje) {
        c(bje);
        return dpR.c;
    }

    public final void c(bJE bje) {
        C8632dsu.c((Object) bje, "");
        int listPos = this.a.getListPos();
        bje.b("row-" + listPos);
        bje.d(this.a.getListPos());
        bje.b(this.e);
        bje.b(new AbstractC3073as.b() { // from class: o.bSB
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int d;
                d = HomeEpoxyController$addRowLoadingState$1.d(i, i2, i3);
                return d;
            }
        });
        bje.e(true);
        this.b.getRowLoadingCreator().a(bje, this.a, this.i, this.a.getLength(), (r22 & 16) != 0 ? 0 : 0, this.c, this.e, (r22 & 128) != 0, this.d);
    }
}
