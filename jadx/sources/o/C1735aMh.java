package o;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.ReplaySubject;
import java.util.List;
import java.util.Map;
import o.C1596aHd;
import o.C1735aMh;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dpR;
import o.dqE;

/* renamed from: o.aMh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1735aMh {
    @SuppressLint({"StaticFieldLeak"})
    private static InterfaceC4942bpR a;
    private static List<NetflixDataRequest> b;
    private static aMG c;
    private static final ReplaySubject<C1735aMh> d;
    public static final C1735aMh e = new C1735aMh();

    private C1735aMh() {
    }

    static {
        ReplaySubject<C1735aMh> create = ReplaySubject.create();
        C8632dsu.a(create, "");
        d = create;
    }

    public final void e(List<NetflixDataRequest> list, InterfaceC4942bpR interfaceC4942bpR, aMG amg) {
        synchronized (this) {
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) interfaceC4942bpR, "");
            C8632dsu.c((Object) amg, "");
            b = list;
            a = interfaceC4942bpR;
            c = amg;
            d.onNext(this);
        }
    }

    public final boolean b(final NetflixDataRequest netflixDataRequest) {
        boolean z;
        synchronized (this) {
            C8632dsu.c((Object) netflixDataRequest, "");
            List<NetflixDataRequest> list = b;
            InterfaceC4942bpR interfaceC4942bpR = a;
            aMG amg = c;
            if (list != null && interfaceC4942bpR != null && amg != null) {
                if ((netflixDataRequest instanceof InterfaceC5089bsF) && !amg.isReady()) {
                    C1044Mm.e("DataRequestQueue", "Add MSL request to queue since Crypto initialization is delayed...");
                    list.add(netflixDataRequest);
                } else {
                    z = interfaceC4942bpR.a(netflixDataRequest);
                }
            } else {
                Observable<C1735aMh> take = d.take(1L);
                C8632dsu.a(take, "");
                SubscribersKt.subscribeBy$default(take, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.service.DataRequestQueue$add$1
                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        c(th);
                        return dpR.c;
                    }

                    public final void c(Throwable th) {
                        Map d2;
                        Map k;
                        Throwable th2;
                        C8632dsu.c((Object) th, "");
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        d2 = dqE.d();
                        k = dqE.k(d2);
                        C1596aHd c1596aHd = new C1596aHd(null, th, null, true, k, false, false, 96, null);
                        ErrorType errorType = c1596aHd.a;
                        if (errorType != null) {
                            c1596aHd.e.put("errorType", errorType.c());
                            String b2 = c1596aHd.b();
                            if (b2 != null) {
                                String c2 = errorType.c();
                                c1596aHd.a(c2 + " " + b2);
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
                        InterfaceC1598aHf a2 = dVar.a();
                        if (a2 != null) {
                            a2.e(c1596aHd, th2);
                        } else {
                            dVar.e().b(c1596aHd, th2);
                        }
                    }
                }, (drO) null, new drM<C1735aMh, dpR>() { // from class: com.netflix.mediaclient.service.DataRequestQueue$add$2
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C1735aMh c1735aMh) {
                        d(c1735aMh);
                        return dpR.c;
                    }

                    public final void d(C1735aMh c1735aMh) {
                        C1735aMh.e.b(NetflixDataRequest.this);
                    }
                }, 2, (Object) null);
            }
            z = true;
        }
        return z;
    }
}
