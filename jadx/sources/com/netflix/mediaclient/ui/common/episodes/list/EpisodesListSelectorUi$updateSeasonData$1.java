package com.netflix.mediaclient.ui.common.episodes.list;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorUi$updateSeasonData$1;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.AbstractC3646bFo;
import o.C1596aHd;
import o.C3622bEr;
import o.C8632dsu;
import o.C9935zP;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC3617bEm;
import o.InterfaceC5227bul;
import o.bDW;
import o.bFZ;
import o.dpR;
import o.dqE;
import o.drM;

/* loaded from: classes4.dex */
public final class EpisodesListSelectorUi$updateSeasonData$1 extends Lambda implements drM<ServiceManager, dpR> {
    final /* synthetic */ C3622bEr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpisodesListSelectorUi$updateSeasonData$1(C3622bEr c3622bEr) {
        super(1);
        this.c = c3622bEr;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
        e(serviceManager);
        return dpR.c;
    }

    public final void e(ServiceManager serviceManager) {
        InterfaceC3617bEm interfaceC3617bEm;
        String str;
        Observable observable;
        C8632dsu.c((Object) serviceManager, "");
        interfaceC3617bEm = this.c.w;
        str = this.c.g;
        Observable<bDW> e = interfaceC3617bEm.e(str);
        observable = this.c.j;
        Observable<bDW> observeOn = e.takeUntil(observable).observeOn(AndroidSchedulers.mainThread());
        final C3622bEr c3622bEr = this.c;
        final drM<bDW, dpR> drm = new drM<bDW, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorUi$updateSeasonData$1.1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(bDW bdw) {
                d(bdw);
                return dpR.c;
            }

            public final void d(bDW bdw) {
                int a;
                int i;
                C9935zP c9935zP;
                long j;
                String str2;
                int i2;
                Integer num;
                int i3;
                int i4;
                C9935zP c9935zP2;
                int i5;
                if (bdw instanceof bDW.b) {
                    bDW.b bVar = (bDW.b) bdw;
                    InterfaceC5227bul b = bVar.b();
                    if (bVar.d().i() || b == null || b.x() == -1) {
                        C3622bEr.this.h();
                        return;
                    }
                    C3622bEr c3622bEr2 = C3622bEr.this;
                    a = c3622bEr2.a(b.x());
                    c3622bEr2.e = a;
                    C3622bEr c3622bEr3 = C3622bEr.this;
                    i = c3622bEr3.e;
                    c3622bEr3.i = Integer.valueOf(i);
                    C3622bEr.this.h = Integer.valueOf(b.aw_());
                    c9935zP = C3622bEr.this.k;
                    int trackId = PlayContextImp.h.getTrackId();
                    j = C3622bEr.this.t;
                    str2 = C3622bEr.this.g;
                    i2 = C3622bEr.this.e;
                    num = C3622bEr.this.h;
                    c9935zP.b(bFZ.class, new bFZ.e(trackId, j, str2, Integer.valueOf(i2), num, Long.valueOf(b.aq_())));
                    i3 = C3622bEr.this.e;
                    if (i3 < 0) {
                        C3622bEr.this.h();
                        return;
                    }
                    C3622bEr c3622bEr4 = C3622bEr.this;
                    i4 = c3622bEr4.e;
                    c3622bEr4.e(i4);
                    c9935zP2 = C3622bEr.this.k;
                    i5 = C3622bEr.this.e;
                    c9935zP2.b(AbstractC3646bFo.class, new AbstractC3646bFo.b(i5));
                }
            }
        };
        Consumer<? super bDW> consumer = new Consumer() { // from class: o.bEB
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EpisodesListSelectorUi$updateSeasonData$1.b(drM.this, obj);
            }
        };
        final AnonymousClass2 anonymousClass2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorUi$updateSeasonData$1.2
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }

            public final void b(Throwable th) {
                Map d2;
                Map k;
                Throwable th2;
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd(null, th, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    th2 = c1596aHd.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            }
        };
        observeOn.subscribe(consumer, new Consumer() { // from class: o.bEz
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EpisodesListSelectorUi$updateSeasonData$1.d(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }
}
