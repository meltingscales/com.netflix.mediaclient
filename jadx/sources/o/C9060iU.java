package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC9034hv;

/* renamed from: o.iU  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9060iU {
    private final InterfaceC9034hv.c a;
    private final Map<String, C9053iN> b;
    private final InterfaceC9042iC c;
    private final String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.iU$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private final List<C9018hf> c = new ArrayList();

        public final List<C9018hf> b() {
            return this.c;
        }
    }

    public C9060iU(InterfaceC9034hv.c cVar, String str, InterfaceC9042iC interfaceC9042iC) {
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC9042iC, "");
        this.a = cVar;
        this.d = str;
        this.c = interfaceC9042iC;
        this.b = new LinkedHashMap();
    }

    public final Map<String, C9053iN> a(Map<String, ? extends Object> map, List<? extends AbstractC9025hm> list, String str) {
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) str, "");
        b(map, this.d, list, str);
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0022 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final o.C9043iD b(java.util.Map<java.lang.String, ? extends java.lang.Object> r10, java.lang.String r11, java.util.List<? extends o.AbstractC9025hm> r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9060iU.b(java.util.Map, java.lang.String, java.util.List, java.lang.String):o.iD");
    }

    private final Object b(Object obj, C9018hf c9018hf, AbstractC9026hn abstractC9026hn, String str) {
        String c;
        int d2;
        if (abstractC9026hn instanceof C9024hl) {
            if (obj == null) {
                throw new IllegalStateException("Check failed.".toString());
            }
            abstractC9026hn = ((C9024hl) abstractC9026hn).c();
        } else if (obj == null) {
            return null;
        }
        if (abstractC9026hn instanceof C9022hj) {
            if (!(obj instanceof List)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Iterable iterable = (Iterable) obj;
            d2 = C8572dqo.d(iterable, 10);
            ArrayList arrayList = new ArrayList(d2);
            int i = 0;
            for (Object obj2 : iterable) {
                if (i < 0) {
                    C8569dql.h();
                }
                arrayList.add(b(obj2, c9018hf, ((C9022hj) abstractC9026hn).b(), b(str, String.valueOf(i))));
                i++;
            }
            return arrayList;
        } else if ((abstractC9026hn instanceof AbstractC9023hk) && C9019hg.a((AbstractC9023hk) abstractC9026hn)) {
            if (!(obj instanceof Map)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Map<String, ? extends Object> map = (Map) obj;
            C9043iD d3 = this.c.d(map, new C9048iI(c9018hf, this.a));
            if (d3 != null && (c = d3.c()) != null) {
                str = c;
            }
            return b(map, str, c9018hf.j(), c9018hf.g().a().b());
        } else {
            return obj;
        }
    }

    private final List<C9018hf> c(List<? extends AbstractC9025hm> list, String str, String str2) {
        d dVar = new d();
        b(list, str, str2, dVar);
        return dVar.b();
    }

    private final String b(String str, String str2) {
        if (str == null) {
            return str2;
        }
        return str + '.' + str2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [o.hm, java.lang.Object] */
    private final void b(List<? extends AbstractC9025hm> list, String str, String str2, d dVar) {
        boolean b;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ?? r0 = (AbstractC9025hm) it.next();
            if (r0 instanceof C9018hf) {
                dVar.b().add(r0);
            } else if (r0 instanceof C9017he) {
                C9017he c9017he = (C9017he) r0;
                b = C8576dqs.b((Iterable<? extends String>) c9017he.a(), str2);
                if (b || C8632dsu.c((Object) c9017he.b(), (Object) str)) {
                    b(c9017he.e(), str, str2, dVar);
                }
            }
        }
    }
}
