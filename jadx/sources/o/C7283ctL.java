package o;

import com.netflix.cl.model.CachedVideoInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.ctL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7283ctL extends CachedVideoInfo {
    private final String d;
    private final C4240bal e;
    public static final b c = new b(null);
    public static final int b = 8;

    public static final C7283ctL[] d(Map<String, C4240bal> map) {
        return c.b(map);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7283ctL(java.lang.String r5, o.C4240bal r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r5, r0)
            o.C8632dsu.c(r6, r0)
            java.lang.String r1 = r6.d()
            o.C8632dsu.a(r1, r0)
            long r0 = java.lang.Long.parseLong(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            com.netflix.cl.model.CachedVideoPlayableStatus r1 = r6.b()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            long r2 = java.lang.Long.parseLong(r5)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.<init>(r0, r1, r7, r2)
            r4.d = r5
            r4.e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7283ctL.<init>(java.lang.String, o.bal, boolean):void");
    }

    /* renamed from: o.ctL$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("OfflinePlayableCachedVideoInfo");
        }

        public final C7283ctL[] b(Map<String, C4240bal> map) {
            C8632dsu.c((Object) map, "");
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, C4240bal>> it = map.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry<String, C4240bal> next = it.next();
                    boolean z = C7353cuc.e(next.getKey()) == null;
                    C4240bal c4240bal = map.get(next.getKey());
                    C8632dsu.d(c4240bal);
                    C4240bal c4240bal2 = c4240bal;
                    boolean a = c4240bal2.a();
                    C7283ctL c7283ctL = new C7283ctL(next.getKey(), c4240bal2, a);
                    if (!a || !z) {
                        arrayList.add(c7283ctL);
                    }
                } else {
                    return (C7283ctL[]) arrayList.toArray(new C7283ctL[0]);
                }
            }
        }
    }
}
