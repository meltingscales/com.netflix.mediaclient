package com.netflix.mediaclient.ui.upnextfeed.impl;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.epoxymodels.api.RowModel;
import com.netflix.mediaclient.ui.upnextfeed.impl.CWRowBuilder$renderRow$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.AbstractC3073as;
import o.AbstractC7938dau;
import o.C1596aHd;
import o.C1729aMb;
import o.C4002bSp;
import o.C6238cYz;
import o.C8569dql;
import o.C8572dqo;
import o.C8632dsu;
import o.C9935zP;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC3825bMa;
import o.InterfaceC4414be;
import o.InterfaceC4467bf;
import o.InterfaceC5179btq;
import o.InterfaceC5222bug;
import o.bJE;
import o.bKK;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes5.dex */
public final class CWRowBuilder$renderRow$1 extends Lambda implements drM<bJE, dpR> {
    final /* synthetic */ drO<dpR> a;
    final /* synthetic */ C6238cYz b;
    final /* synthetic */ LoMo c;
    final /* synthetic */ drO<dpR> d;
    final /* synthetic */ C9935zP e;
    final /* synthetic */ C6238cYz g;
    final /* synthetic */ List<C4002bSp> h;
    final /* synthetic */ TrackingInfoHolder j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CWRowBuilder$renderRow$1(C6238cYz c6238cYz, LoMo loMo, C6238cYz c6238cYz2, List<C4002bSp> list, TrackingInfoHolder trackingInfoHolder, drO<dpR> dro, drO<dpR> dro2, C9935zP c9935zP) {
        super(1);
        this.b = c6238cYz;
        this.c = loMo;
        this.g = c6238cYz2;
        this.h = list;
        this.j = trackingInfoHolder;
        this.d = dro;
        this.a = dro2;
        this.e = c9935zP;
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
        int b;
        C1729aMb c1729aMb;
        int d;
        C1729aMb c1729aMb2;
        C1729aMb c1729aMb3;
        C1729aMb c1729aMb4;
        TrackingInfoHolder e;
        Throwable th;
        C8632dsu.c((Object) bje, "");
        bje.b("row-cw-videos");
        b = this.b.b();
        bje.c(b);
        bje.d(this.c.getListPos());
        c1729aMb = this.g.b;
        bje.b(c1729aMb);
        bje.b(new AbstractC3073as.b() { // from class: o.cYI
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int e2;
                e2 = CWRowBuilder$renderRow$1.e(i, i2, i3);
                return e2;
            }
        });
        bje.a(new InterfaceC3825bMa.a(this.c.getListId(), this.c.getRequestId(), Integer.valueOf(this.c.getTrackId())));
        List<C4002bSp> list = this.h;
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C4002bSp c4002bSp : list) {
            arrayList.add(c4002bSp.a());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((InterfaceC5222bug) obj).getVideo() instanceof InterfaceC5179btq) {
                arrayList2.add(obj);
            }
        }
        if (arrayList.size() != arrayList2.size()) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            C1596aHd c1596aHd = new C1596aHd("Received non CW video in CW row of Up Next", null, ErrorType.l, false, null, true, false, 82, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c = dVar2.c();
            if (c != null) {
                c.d(c1596aHd, th);
            } else {
                dVar2.e().b(c1596aHd, th);
            }
        }
        C6238cYz c6238cYz = this.b;
        LoMo loMo = this.c;
        TrackingInfoHolder trackingInfoHolder = this.j;
        int i = 0;
        for (Object obj2 : arrayList2) {
            if (i < 0) {
                C8569dql.h();
            }
            InterfaceC5222bug interfaceC5222bug = (InterfaceC5222bug) obj2;
            e = c6238cYz.e(loMo, trackingInfoHolder, interfaceC5222bug, i);
            c6238cYz.a(bje, loMo, interfaceC5222bug, i, e);
            i++;
        }
        final drO<dpR> dro = this.d;
        bje.c(new InterfaceC4467bf() { // from class: o.cYK
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj3, int i2) {
                CWRowBuilder$renderRow$1.d(drO.this, (bKK) abstractC3073as, (RowModel.b) obj3, i2);
            }
        });
        final drO<dpR> dro2 = this.a;
        bje.d(new InterfaceC4414be() { // from class: o.cYM
            @Override // o.InterfaceC4414be
            public final void d(AbstractC3073as abstractC3073as, Object obj3) {
                CWRowBuilder$renderRow$1.d(drO.this, (bKK) abstractC3073as, (RowModel.b) obj3);
            }
        });
        if (arrayList.size() != arrayList2.size() || this.h.size() >= this.c.getLength()) {
            return;
        }
        int listPos = this.c.getListPos();
        int length = this.c.getLength();
        c1729aMb2 = this.g.b;
        int o2 = c1729aMb2.o();
        c1729aMb3 = this.g.b;
        int m = c1729aMb3.m();
        int size = this.h.size();
        c1729aMb4 = this.g.b;
        C6238cYz c6238cYz2 = this.g;
        int i2 = o2 * m;
        final C9935zP c9935zP = this.e;
        final List<C4002bSp> list2 = this.h;
        c6238cYz2.c(bje, listPos, length, size, i2, c1729aMb4, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.CWRowBuilder$renderRow$1.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                b();
                return dpR.c;
            }

            public final void b() {
                C9935zP.this.b(AbstractC7938dau.class, new AbstractC7938dau.d(list2.size(), false, 2, null));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drO dro, bKK bkk, RowModel.b bVar, int i) {
        C8632dsu.c((Object) dro, "");
        dro.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drO dro, bKK bkk, RowModel.b bVar) {
        C8632dsu.c((Object) dro, "");
        dro.invoke();
    }
}
