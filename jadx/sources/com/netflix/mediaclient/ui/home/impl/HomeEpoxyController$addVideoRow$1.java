package com.netflix.mediaclient.ui.home.impl;

import android.view.View;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.epoxymodels.api.RowModel;
import com.netflix.mediaclient.ui.home.impl.HomeEpoxyController;
import com.netflix.mediaclient.ui.home.impl.HomeEpoxyController$addVideoRow$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import o.AbstractC3073as;
import o.AbstractC3179au;
import o.C1596aHd;
import o.C1729aMb;
import o.C3794bKx;
import o.C4049bUi;
import o.C8168dfL;
import o.C8569dql;
import o.C8572dqo;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC4414be;
import o.InterfaceC4467bf;
import o.InterfaceC5155btS;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.bJE;
import o.bKK;
import o.bSI;
import o.bSJ;
import o.bSY;
import o.bVV;
import o.dpD;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes4.dex */
public final class HomeEpoxyController$addVideoRow$1 extends Lambda implements drM<bJE, dpR> {
    final /* synthetic */ C1729aMb a;
    final /* synthetic */ HomeEpoxyController b;
    final /* synthetic */ boolean c;
    final /* synthetic */ LoMo d;
    final /* synthetic */ InterfaceC5155btS e;
    final /* synthetic */ drO<dpR> f;
    final /* synthetic */ C4049bUi g;
    final /* synthetic */ drO<dpR> h;
    final /* synthetic */ List<Long> i;
    final /* synthetic */ TrackingInfoHolder j;
    final /* synthetic */ List<InterfaceC5222bug<? extends InterfaceC5223buh>> m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HomeEpoxyController$addVideoRow$1(LoMo loMo, HomeEpoxyController homeEpoxyController, C1729aMb c1729aMb, List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>> list, TrackingInfoHolder trackingInfoHolder, boolean z, C4049bUi c4049bUi, InterfaceC5155btS interfaceC5155btS, List<Long> list2, drO<dpR> dro, drO<dpR> dro2) {
        super(1);
        this.d = loMo;
        this.b = homeEpoxyController;
        this.a = c1729aMb;
        this.m = list;
        this.j = trackingInfoHolder;
        this.c = z;
        this.g = c4049bUi;
        this.e = interfaceC5155btS;
        this.i = list2;
        this.f = dro;
        this.h = dro2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i, int i2, int i3) {
        return i;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(bJE bje) {
        e(bje);
        return dpR.c;
    }

    public final void e(bJE bje) {
        boolean z;
        String str;
        int d;
        Map i;
        Throwable th;
        TrackingInfoHolder updateTrackingInfoHolder;
        int i2;
        List<Long> list;
        TrackingInfoHolder trackingInfoHolder;
        LoMo loMo;
        InterfaceC5155btS interfaceC5155btS;
        C4049bUi c4049bUi;
        C8632dsu.c((Object) bje, "");
        bje.b("row-" + this.d.getListPos());
        bje.c(this.b.getRowLayoutId(this.d));
        bje.d(this.d.getListPos());
        bje.b(this.a);
        bje.b(new AbstractC3073as.b() { // from class: o.bSC
            @Override // o.AbstractC3073as.b
            public final int b(int i3, int i4, int i5) {
                int e;
                e = HomeEpoxyController$addVideoRow$1.e(i3, i4, i5);
                return e;
            }
        });
        bje.a(bSI.c(this.d));
        List<InterfaceC5222bug<? extends InterfaceC5223buh>> list2 = this.m;
        C1729aMb c1729aMb = this.a;
        HomeEpoxyController homeEpoxyController = this.b;
        C4049bUi c4049bUi2 = this.g;
        InterfaceC5155btS interfaceC5155btS2 = this.e;
        LoMo loMo2 = this.d;
        TrackingInfoHolder trackingInfoHolder2 = this.j;
        List<Long> list3 = this.i;
        ClassCastException e = null;
        int i3 = 0;
        for (Object obj : list2) {
            if (i3 < 0) {
                C8569dql.h();
            }
            InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug = (InterfaceC5222bug) obj;
            if (i3 >= c1729aMb.t()) {
                try {
                    updateTrackingInfoHolder = homeEpoxyController.updateTrackingInfoHolder(loMo2, trackingInfoHolder2, interfaceC5222bug, i3);
                    i2 = i3;
                    list = list3;
                    trackingInfoHolder = trackingInfoHolder2;
                    loMo = loMo2;
                    interfaceC5155btS = interfaceC5155btS2;
                    c4049bUi = c4049bUi2;
                    try {
                        homeEpoxyController.addVideo(bje, c4049bUi2, interfaceC5155btS2, loMo2, interfaceC5222bug, i2, c1729aMb, updateTrackingInfoHolder, true, list);
                    } catch (ClassCastException e2) {
                        e = e2;
                    }
                } catch (ClassCastException e3) {
                    e = e3;
                }
                i3 = i2 + 1;
                interfaceC5155btS2 = interfaceC5155btS;
                c4049bUi2 = c4049bUi;
                list3 = list;
                trackingInfoHolder2 = trackingInfoHolder;
                loMo2 = loMo;
            }
            i2 = i3;
            list = list3;
            trackingInfoHolder = trackingInfoHolder2;
            loMo = loMo2;
            interfaceC5155btS = interfaceC5155btS2;
            c4049bUi = c4049bUi2;
            i3 = i2 + 1;
            interfaceC5155btS2 = interfaceC5155btS;
            c4049bUi2 = c4049bUi;
            list3 = list;
            trackingInfoHolder2 = trackingInfoHolder;
            loMo2 = loMo;
        }
        final drO<dpR> dro = this.f;
        bje.c(new InterfaceC4467bf() { // from class: o.bSD
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj2, int i4) {
                HomeEpoxyController$addVideoRow$1.d(drO.this, (bKK) abstractC3073as, (RowModel.b) obj2, i4);
            }
        });
        final drO<dpR> dro2 = this.h;
        bje.d(new InterfaceC4414be() { // from class: o.bSA
            @Override // o.InterfaceC4414be
            public final void d(AbstractC3073as abstractC3073as, Object obj2) {
                HomeEpoxyController$addVideoRow$1.e(drO.this, (bKK) abstractC3073as, (RowModel.b) obj2);
            }
        });
        if (e != null) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            str = "SPY-34830 - " + e;
            Pair[] pairArr = new Pair[5];
            z = false;
            pairArr[0] = dpD.a("lomo.type", String.valueOf(this.d.getType()));
            pairArr[1] = dpD.a("lomo.id", String.valueOf(this.d.getId()));
            pairArr[2] = dpD.a("lomo.listPos", String.valueOf(this.d.getListPos()));
            pairArr[3] = dpD.a("trackingInfo", String.valueOf(TrackingInfoHolder.a(this.j, null, null, null, 7, null).toJSONObject()));
            List<InterfaceC5222bug<? extends InterfaceC5223buh>> list4 = this.m;
            d = C8572dqo.d(list4, 10);
            ArrayList arrayList = new ArrayList(d);
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC5222bug) it.next()).mo3081getEntity().getClass().getName());
            }
            pairArr[4] = dpD.a("videoEntityModels", String.valueOf(arrayList));
            i = dqE.i(pairArr);
            C1596aHd c1596aHd = new C1596aHd(str, null, null, false, i, false, false, 110, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType.c() + " " + b);
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
        } else {
            z = false;
        }
        if (!this.c) {
            if (this.m.size() < this.d.getLength()) {
                bVV rowLoadingCreator = this.b.getRowLoadingCreator();
                int listPos = this.d.getListPos();
                int length = this.d.getLength();
                int o2 = this.a.o();
                int m = this.a.m();
                int size = this.m.size();
                final LoMo loMo3 = this.d;
                C1729aMb c1729aMb2 = this.a;
                int i4 = o2 * m;
                final HomeEpoxyController homeEpoxyController2 = this.b;
                final List<InterfaceC5222bug<? extends InterfaceC5223buh>> list5 = this.m;
                rowLoadingCreator.a(bje, loMo3, listPos, length, (r22 & 16) != 0 ? 0 : size, i4, c1729aMb2, (r22 & 128) != 0, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.HomeEpoxyController$addVideoRow$1.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        c();
                        return dpR.c;
                    }

                    public final void c() {
                        HomeEpoxyController.this.emit(new bSJ.j(loMo3, list5.size()));
                    }
                });
            }
        } else {
            final LoMo loMo4 = this.d;
            final HomeEpoxyController homeEpoxyController3 = this.b;
            final List<InterfaceC5222bug<? extends InterfaceC5223buh>> list6 = this.m;
            final TrackingInfoHolder trackingInfoHolder3 = this.j;
            C3794bKx c3794bKx = new C3794bKx();
            c3794bKx.b((CharSequence) ("error-row-" + loMo4.getListPos() + "-retry"));
            c3794bKx.e((CharSequence) C8168dfL.d(C9834xU.h.f));
            c3794bKx.d(new View.OnClickListener() { // from class: o.bSE
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeEpoxyController$addVideoRow$1.b(HomeEpoxyController.this, loMo4, list6, view);
                }
            });
            c3794bKx.a(bSY.a(homeEpoxyController3.getHomeModelTracking(), z, 1, null));
            c3794bKx.c((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.HomeEpoxyController$addVideoRow$1$6$2
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
        final HomeEpoxyController homeEpoxyController4 = this.b;
        final LoMo loMo5 = this.d;
        bje.c(new drX<AbstractC3179au, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.HomeEpoxyController$addVideoRow$1.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(AbstractC3179au abstractC3179au, Integer num) {
                a(abstractC3179au, num);
                return dpR.c;
            }

            public final void a(AbstractC3179au abstractC3179au, Integer num) {
                drX<LoMo, Integer, dpR> onRowScrollStateChanged = HomeEpoxyController.this.getOnRowScrollStateChanged();
                LoMo loMo6 = loMo5;
                C8632dsu.d(num);
                onRowScrollStateChanged.invoke(loMo6, num);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drO dro, bKK bkk, RowModel.b bVar, int i) {
        C8632dsu.c((Object) dro, "");
        dro.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drO dro, bKK bkk, RowModel.b bVar) {
        C8632dsu.c((Object) dro, "");
        dro.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(HomeEpoxyController homeEpoxyController, LoMo loMo, List list, View view) {
        C8632dsu.c((Object) homeEpoxyController, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) list, "");
        homeEpoxyController.emit(new bSJ.n(loMo, list.size()));
        Logger.INSTANCE.logEvent(new Selected(AppView.tryAgainButton, null, CommandValue.RetryCommand, null));
    }
}
