package o;

import java.util.List;
import java.util.Map;
import o.InterfaceC9034hv;

/* loaded from: classes3.dex */
public abstract class aCU implements InterfaceC9046iG {
    public List<C9043iD> a(C9018hf c9018hf, InterfaceC9034hv.c cVar) {
        C8632dsu.c((Object) c9018hf, "");
        C8632dsu.c((Object) cVar, "");
        return null;
    }

    public abstract C9043iD d(C9018hf c9018hf, InterfaceC9034hv.c cVar);

    @Override // o.InterfaceC9046iG
    public Object d(C9018hf c9018hf, InterfaceC9034hv.c cVar, Map<String, Object> map, String str) {
        List<C9043iD> a;
        C9043iD d;
        C8632dsu.c((Object) c9018hf, "");
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) str, "");
        AbstractC9026hn g = c9018hf.g();
        if (g instanceof C9024hl) {
            g = ((C9024hl) g).c();
        }
        if ((g instanceof AbstractC9023hk) && C9019hg.a((AbstractC9023hk) g) && (d = d(c9018hf, cVar)) != null) {
            return d;
        }
        if (g instanceof C9022hj) {
            AbstractC9026hn b = ((C9022hj) g).b();
            if (b instanceof C9024hl) {
                b = ((C9024hl) b).c();
            }
            if ((b instanceof AbstractC9023hk) && C9019hg.a((AbstractC9023hk) b) && (a = a(c9018hf, cVar)) != null) {
                return a;
            }
        }
        return C9047iH.e.d(c9018hf, cVar, map, str);
    }
}
