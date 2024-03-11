package o;

import java.util.Iterator;
import java.util.List;
import o.C8569dql;

/* renamed from: o.aDk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1495aDk implements InterfaceC9103jK {
    private final String b;
    private final InterfaceC8554dpx c;

    public C1495aDk(String str) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) str, "");
        this.b = str;
        b = dpB.b(new drO<List<? extends String>>() { // from class: com.netflix.mediaclient.graphqlrepo.impl.client.network.http.InterstitialDgsOverrideInterceptor$interstitialOperationNames$2
            @Override // o.drO
            /* renamed from: c */
            public final List<String> invoke() {
                List<String> j;
                j = C8569dql.j("InterstitialDemo", "InterstitialForUnspecifiedLocationQuery", "InterstitialForPlaybackError", "InterstitialHook", "InterstitialRestoreScreen", "InterstitialSubmitAction", "InterstitialSendFeedback", "InterstitialScreenUpdate");
                return j;
            }
        });
        this.c = b;
    }

    private final List<String> d() {
        return (List) this.c.getValue();
    }

    @Override // o.InterfaceC9103jK
    public Object e(C9008hV c9008hV, InterfaceC9102jJ interfaceC9102jJ, InterfaceC8585dra<? super C9009hW> interfaceC8585dra) {
        Object obj;
        boolean b;
        boolean d;
        Iterator<T> it = c9008hV.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d = C8691duz.d(((C9006hT) obj).b(), C9003hQ.a.c(), true);
            if (d) {
                break;
            }
        }
        C9006hT c9006hT = (C9006hT) obj;
        b = C8576dqs.b((Iterable<? extends String>) d(), c9006hT != null ? c9006hT.a() : null);
        if (b) {
            return interfaceC9102jJ.a(C9008hV.e(c9008hV, null, this.b, 1, null).a(), interfaceC8585dra);
        }
        return interfaceC9102jJ.a(c9008hV, interfaceC8585dra);
    }
}
