package o;

import androidx.lifecycle.Lifecycle;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.Maybe;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC1608aHp;
import o.C1596aHd;
import o.C7017coI;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.cVS;
import o.dpR;
import o.dqE;

/* renamed from: o.cWb  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6160cWb implements cVS {
    public static final b a = new b(null);

    @Inject
    public C6160cWb() {
        C7017coI.c.e().b(AbstractC1608aHp.i.a, new drM<C7017coI.e<NetflixActivity, AbstractC1608aHp.i.b>, dpR>() { // from class: com.netflix.mediaclient.ui.tvconnect.impl.discovery.TvDiscoveryImpl$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7017coI.e<NetflixActivity, AbstractC1608aHp.i.b> eVar) {
                d(eVar);
                return dpR.c;
            }

            /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
                if (r5.e() == true) goto L5;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void d(o.C7017coI.e<com.netflix.mediaclient.android.activity.NetflixActivity, o.AbstractC1608aHp.i.b> r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = ""
                    o.C8632dsu.c(r5, r0)
                    o.cVT r0 = new o.cVT
                    r0.<init>()
                    o.cVV r1 = new o.cVV
                    java.lang.Object r2 = r5.e()
                    com.netflix.mediaclient.android.activity.NetflixActivity r2 = (com.netflix.mediaclient.android.activity.NetflixActivity) r2
                    r1.<init>(r2, r0)
                    o.cWb r0 = o.C6160cWb.this
                    java.lang.Object r2 = r5.e()
                    com.netflix.mediaclient.android.activity.NetflixActivity r2 = (com.netflix.mediaclient.android.activity.NetflixActivity) r2
                    java.lang.Object r5 = r5.b()
                    o.aHp$i$b r5 = (o.AbstractC1608aHp.i.b) r5
                    if (r5 == 0) goto L2d
                    boolean r5 = r5.e()
                    r3 = 1
                    if (r5 != r3) goto L2d
                    goto L2e
                L2d:
                    r3 = 0
                L2e:
                    com.netflix.mediaclient.ui.tvconnect.impl.discovery.TvDiscoveryImpl$1$1 r5 = new com.netflix.mediaclient.ui.tvconnect.impl.discovery.TvDiscoveryImpl$1$1
                    r5.<init>()
                    o.C6160cWb.a(r0, r2, r1, r3, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.tvconnect.impl.discovery.TvDiscoveryImpl$1.d(o.coI$e):void");
            }
        });
    }

    /* renamed from: o.cWb$b */
    /* loaded from: classes6.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("TvDiscoveryImpl");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(NetflixActivity netflixActivity, cVV cvv, boolean z, final drM<? super cVS.d, dpR> drm) {
        Maybe<cVS.d> d = new cQM().d(cvv);
        AndroidLifecycleScopeProvider a2 = AndroidLifecycleScopeProvider.a(netflixActivity, Lifecycle.Event.ON_DESTROY);
        C8632dsu.a(a2, "");
        Object as = d.as(AutoDispose.b(a2));
        C8632dsu.b(as, "");
        C9725vn.d((MaybeSubscribeProxy) as, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.tvconnect.impl.discovery.TvDiscoveryImpl$onTvDiscoveryReadyToBeShown$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
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
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b2);
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
                InterfaceC1598aHf a3 = dVar.a();
                if (a3 != null) {
                    a3.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            }
        }, null, new drM<cVS.d, dpR>() { // from class: com.netflix.mediaclient.ui.tvconnect.impl.discovery.TvDiscoveryImpl$onTvDiscoveryReadyToBeShown$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cVS.d dVar) {
                e(dVar);
                return dpR.c;
            }

            public final void e(cVS.d dVar) {
                C8632dsu.c((Object) dVar, "");
                drm.invoke(dVar);
            }
        }, 2, null);
    }
}
