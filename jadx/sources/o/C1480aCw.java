package o;

import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.CacheMissException;
import com.netflix.mediaclient.latencytracker.api.UiLatencyMarker;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import java.util.ArrayList;
import java.util.List;
import o.C8632dsu;
import o.InterfaceC8991hE;
import o.InterfaceC8999hM;
import o.aCS;

/* renamed from: o.aCw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1480aCw implements InterfaceC1471aCn {
    public static final c e = new c(null);

    /* renamed from: o.aCw$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("GraphQLRepositoryApisImpl");
        }
    }

    @Override // o.InterfaceC1471aCn
    public void e(String str, String str2) {
        C8632dsu.c((Object) str2, "");
        aCF.c.a(str, str2);
    }

    @Override // o.InterfaceC1471aCn
    public <O extends InterfaceC8991hE.b> String c(C8942gI<O> c8942gI) {
        C8632dsu.c((Object) c8942gI, "");
        aCF acf = aCF.c;
        C1665aJs d = acf.d();
        if (d != null) {
            d.d("GraphQLQuery");
            if (ConfigFastPropertyFeatureControlConfig.Companion.n().getSendDataAccessPerfTrace()) {
                d.d(c8942gI.f().f());
            }
            d.d("beforeQuery");
        } else {
            d = null;
        }
        String a = acf.a(d);
        acf.c(a);
        acf.g(a);
        return a;
    }

    @Override // o.InterfaceC1471aCn
    public <O extends InterfaceC8991hE.b> void b(C8942gI<O> c8942gI, C8954gU<O> c8954gU, String str) {
        String message;
        String str2;
        ArrayList arrayList;
        int d;
        C8632dsu.c((Object) c8942gI, "");
        C8632dsu.c((Object) c8954gU, "");
        aCF acf = aCF.c;
        acf.a(str);
        String f = c8942gI.f().f();
        boolean c2 = c8954gU.d instanceof InterfaceC8999hM.c ? C9083ir.c(c8954gU) : false;
        if (c8954gU.a() || c8954gU.a != null || c8954gU.d == null) {
            if (!c8954gU.a()) {
                ApolloException apolloException = c8954gU.a;
                if (apolloException instanceof CacheMissException) {
                    message = "Apollo CacheMissException";
                } else {
                    if (apolloException != null) {
                        message = apolloException.getMessage();
                    }
                    str2 = null;
                }
                str2 = message;
            } else {
                List<C9035hw> list = c8954gU.e;
                if (list != null) {
                    d = C8572dqo.d(list, 10);
                    ArrayList arrayList2 = new ArrayList(d);
                    for (C9035hw c9035hw : list) {
                        arrayList2.add(new aCS(c9035hw));
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    message = C8576dqs.d(arrayList, "\n", null, null, 0, null, new drM<aCS, CharSequence>() { // from class: com.netflix.mediaclient.graphqlplatform.impl.GraphQLRepositoryApisPerformanceTrackerImpl$onResponseLogging$errorString$1
                        @Override // o.drM
                        /* renamed from: e */
                        public final CharSequence invoke(aCS acs) {
                            C8632dsu.c((Object) acs, "");
                            return acs.a();
                        }
                    }, 30, null);
                    str2 = message;
                }
                str2 = null;
            }
            aCF.c.e(str, f, c2, c8954gU.a(), c8954gU.d == null, str2);
            return;
        }
        aCF.d(acf, str, f, c2, false, false, null, 32, null);
    }

    @Override // o.InterfaceC1471aCn
    public void e(String str) {
        C8632dsu.c((Object) str, "");
        aCF.c.d(str);
    }

    @Override // o.InterfaceC1471aCn
    public void b(String str) {
        C8632dsu.c((Object) str, "");
        aCF.c.b(str);
    }

    @Override // o.InterfaceC1471aCn
    public void a(String str) {
        C8632dsu.c((Object) str, "");
        aCF.c.h(str);
    }

    @Override // o.InterfaceC1471aCn
    public void c(String str, InterfaceC1474aCq interfaceC1474aCq) {
        C8632dsu.c((Object) interfaceC1474aCq, "");
        aCF.c.a(str, e(interfaceC1474aCq));
    }

    @Override // o.InterfaceC1471aCn
    public void a(String str, InterfaceC1474aCq interfaceC1474aCq) {
        C8632dsu.c((Object) interfaceC1474aCq, "");
        aCF.c.d(str, e(interfaceC1474aCq));
    }

    @Override // o.InterfaceC1471aCn
    public void c(String str) {
        aCF.c.e(str);
    }

    @Override // o.InterfaceC1471aCn
    public void b(String str, String str2, InterfaceC1474aCq interfaceC1474aCq) {
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) interfaceC1474aCq, "");
        aCF.c.d(str, str2, e(interfaceC1474aCq));
    }

    @Override // o.InterfaceC1471aCn
    public void e(String str, String str2, InterfaceC1474aCq interfaceC1474aCq) {
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) interfaceC1474aCq, "");
        aCF.c.a(str, str2, e(interfaceC1474aCq));
    }

    private final UiLatencyMarker e(InterfaceC1474aCq interfaceC1474aCq) {
        C8632dsu.d(interfaceC1474aCq);
        return ((C1478aCu) interfaceC1474aCq).e();
    }
}
