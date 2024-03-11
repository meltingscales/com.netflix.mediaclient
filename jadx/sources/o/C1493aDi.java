package o;

import com.apollographql.apollo3.network.http.HttpNetworkTransport;

/* renamed from: o.aDi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1493aDi {
    private static InterfaceC9095jC a;
    public static final C1493aDi c = new C1493aDi();
    private static aCJ e;

    private C1493aDi() {
    }

    public final InterfaceC9095jC d(aCJ acj, InterfaceC1471aCn interfaceC1471aCn, InterfaceC1473aCp interfaceC1473aCp) {
        C8632dsu.c((Object) acj, "");
        C8632dsu.c((Object) interfaceC1471aCn, "");
        C8632dsu.c((Object) interfaceC1473aCp, "");
        if (!C8632dsu.c(acj, e)) {
            HttpNetworkTransport.d a2 = new HttpNetworkTransport.d().b(new C1499aDo(acj.c())).a(acj.j()).a(new C1496aDl(interfaceC1471aCn));
            String a3 = interfaceC1473aCp.a();
            if (a3 != null) {
                a2.a(new C1495aDk(a3));
            }
            a = a2.b();
            e = acj;
        }
        InterfaceC9095jC interfaceC9095jC = a;
        if (interfaceC9095jC == null) {
            C8632dsu.d("");
            return null;
        }
        return interfaceC9095jC;
    }
}
