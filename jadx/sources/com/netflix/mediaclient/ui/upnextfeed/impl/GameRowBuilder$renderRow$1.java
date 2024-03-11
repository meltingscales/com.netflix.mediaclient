package com.netflix.mediaclient.ui.upnextfeed.impl;

import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.upnextfeed.impl.GameRowBuilder$renderRow$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.AbstractC3073as;
import o.AbstractC7938dau;
import o.C1729aMb;
import o.C4002bSp;
import o.C8569dql;
import o.C8572dqo;
import o.C8632dsu;
import o.C9935zP;
import o.InterfaceC3825bMa;
import o.InterfaceC5222bug;
import o.bJE;
import o.cYQ;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes5.dex */
public final class GameRowBuilder$renderRow$1 extends Lambda implements drM<bJE, dpR> {
    final /* synthetic */ List<Long> a;
    final /* synthetic */ cYQ b;
    final /* synthetic */ C9935zP c;
    final /* synthetic */ LoMo d;
    final /* synthetic */ C1729aMb e;
    final /* synthetic */ cYQ f;
    final /* synthetic */ List<C4002bSp> g;
    final /* synthetic */ TrackingInfoHolder i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameRowBuilder$renderRow$1(cYQ cyq, LoMo loMo, C1729aMb c1729aMb, List<C4002bSp> list, cYQ cyq2, TrackingInfoHolder trackingInfoHolder, List<Long> list2, C9935zP c9935zP) {
        super(1);
        this.b = cyq;
        this.d = loMo;
        this.e = c1729aMb;
        this.g = list;
        this.f = cyq2;
        this.i = trackingInfoHolder;
        this.a = list2;
        this.c = c9935zP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(int i, int i2, int i3) {
        return i;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(bJE bje) {
        b(bje);
        return dpR.c;
    }

    public final void b(bJE bje) {
        int e;
        int d;
        TrackingInfoHolder a;
        C8632dsu.c((Object) bje, "");
        bje.b("row-upnext-games");
        e = this.b.e();
        bje.c(e);
        bje.d(this.d.getListPos());
        bje.b(this.e);
        bje.b(new AbstractC3073as.b() { // from class: o.cZa
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int c;
                c = GameRowBuilder$renderRow$1.c(i, i2, i3);
                return c;
            }
        });
        bje.a(new InterfaceC3825bMa.a(this.d.getListId(), this.d.getRequestId(), Integer.valueOf(this.d.getTrackId())));
        List<C4002bSp> list = this.g;
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C4002bSp c4002bSp : list) {
            arrayList.add(c4002bSp.a());
        }
        cYQ cyq = this.b;
        LoMo loMo = this.d;
        C1729aMb c1729aMb = this.e;
        TrackingInfoHolder trackingInfoHolder = this.i;
        List<Long> list2 = this.a;
        int i = 0;
        for (Object obj : arrayList) {
            if (i < 0) {
                C8569dql.h();
            }
            InterfaceC5222bug interfaceC5222bug = (InterfaceC5222bug) obj;
            a = cyq.a(loMo, trackingInfoHolder, interfaceC5222bug, i);
            cyq.b(bje, loMo, interfaceC5222bug, i, c1729aMb, a, list2);
            i++;
        }
        if (this.g.size() < this.d.getLength()) {
            int listPos = this.d.getListPos();
            int length = this.d.getLength();
            int o2 = this.e.o();
            int m = this.e.m();
            int size = this.g.size();
            cYQ cyq2 = this.f;
            LoMo loMo2 = this.d;
            C1729aMb c1729aMb2 = this.e;
            int i2 = o2 * m;
            final C9935zP c9935zP = this.c;
            final List<C4002bSp> list3 = this.g;
            cyq2.b(bje, loMo2, listPos, length, size, i2, c1729aMb2, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.GameRowBuilder$renderRow$1.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    a();
                    return dpR.c;
                }

                public final void a() {
                    C9935zP.this.b(AbstractC7938dau.class, new AbstractC7938dau.e(list3.size(), false, 2, null));
                }
            });
        }
    }
}
