package o;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonException;
import o.AbstractC7715dCr;
import o.AbstractC7716dCs;
import o.C7792dFn;
import o.C7801dFw;
import o.InterfaceC7707dCj;

/* renamed from: o.dFw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7801dFw {
    private static final C7792dFn.c<Map<String, Integer>> a = new C7792dFn.c<>();
    private static final C7792dFn.c<String[]> c = new C7792dFn.c<>();

    public static final C7792dFn.c<Map<String, Integer>> d() {
        return a;
    }

    private static final void b(Map<String, Integer> map, InterfaceC7707dCj interfaceC7707dCj, String str, int i) {
        Object e;
        String str2 = C8632dsu.c(interfaceC7707dCj.b(), AbstractC7715dCr.b.a) ? "enum value" : "property";
        if (map.containsKey(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The suggested name '");
            sb.append(str);
            sb.append("' for ");
            sb.append(str2);
            sb.append(' ');
            sb.append(interfaceC7707dCj.a(i));
            sb.append(" is already one of the names for ");
            sb.append(str2);
            sb.append(' ');
            e = dqE.e(map, str);
            sb.append(interfaceC7707dCj.a(((Number) e).intValue()));
            sb.append(" in ");
            sb.append(interfaceC7707dCj);
            throw new JsonException(sb.toString());
        }
        map.put(str, Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Integer> a(InterfaceC7707dCj interfaceC7707dCj, AbstractC7773dEv abstractC7773dEv) {
        Map<String, Integer> d;
        Object z;
        String b;
        String[] e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean a2 = a(abstractC7773dEv, interfaceC7707dCj);
        dES e2 = e(interfaceC7707dCj, abstractC7773dEv);
        int e3 = interfaceC7707dCj.e();
        for (int i = 0; i < e3; i++) {
            List<Annotation> d2 = interfaceC7707dCj.d(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : d2) {
                if (obj instanceof dEO) {
                    arrayList.add(obj);
                }
            }
            z = C8576dqs.z((List<? extends Object>) arrayList);
            dEO deo = (dEO) z;
            if (deo != null && (e = deo.e()) != null) {
                for (String str : e) {
                    if (a2) {
                        str = str.toLowerCase(Locale.ROOT);
                        C8632dsu.a(str, "");
                    }
                    b(linkedHashMap, interfaceC7707dCj, str, i);
                }
            }
            if (a2) {
                b = interfaceC7707dCj.a(i).toLowerCase(Locale.ROOT);
                C8632dsu.a(b, "");
            } else {
                b = e2 != null ? e2.b(interfaceC7707dCj, i, interfaceC7707dCj.a(i)) : null;
            }
            if (b != null) {
                b(linkedHashMap, interfaceC7707dCj, b, i);
            }
        }
        if (linkedHashMap.isEmpty()) {
            d = dqE.d();
            return d;
        }
        return linkedHashMap;
    }

    public static final Map<String, Integer> e(final AbstractC7773dEv abstractC7773dEv, final InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) abstractC7773dEv, "");
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return (Map) dEX.c(abstractC7773dEv).c(interfaceC7707dCj, a, new drO<Map<String, ? extends Integer>>() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt$deserializationNamesMap$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final Map<String, Integer> invoke() {
                Map<String, Integer> a2;
                a2 = C7801dFw.a(InterfaceC7707dCj.this, abstractC7773dEv);
                return a2;
            }
        });
    }

    public static final String[] c(final InterfaceC7707dCj interfaceC7707dCj, AbstractC7773dEv abstractC7773dEv, final dES des) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) abstractC7773dEv, "");
        C8632dsu.c((Object) des, "");
        return (String[]) dEX.c(abstractC7773dEv).c(interfaceC7707dCj, c, new drO<String[]>() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt$serializationNamesIndices$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final String[] invoke() {
                int e = InterfaceC7707dCj.this.e();
                String[] strArr = new String[e];
                for (int i = 0; i < e; i++) {
                    strArr[i] = des.b(InterfaceC7707dCj.this, i, InterfaceC7707dCj.this.a(i));
                }
                return strArr;
            }
        });
    }

    public static final String b(InterfaceC7707dCj interfaceC7707dCj, AbstractC7773dEv abstractC7773dEv, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) abstractC7773dEv, "");
        dES e = e(interfaceC7707dCj, abstractC7773dEv);
        return e == null ? interfaceC7707dCj.a(i) : c(interfaceC7707dCj, abstractC7773dEv, e)[i];
    }

    public static final dES e(InterfaceC7707dCj interfaceC7707dCj, AbstractC7773dEv abstractC7773dEv) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) abstractC7773dEv, "");
        if (C8632dsu.c(interfaceC7707dCj.b(), AbstractC7716dCs.b.d)) {
            return abstractC7773dEv.a().h();
        }
        return null;
    }

    private static final int c(InterfaceC7707dCj interfaceC7707dCj, AbstractC7773dEv abstractC7773dEv, String str) {
        Integer num = e(abstractC7773dEv, interfaceC7707dCj).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    private static final boolean a(AbstractC7773dEv abstractC7773dEv, InterfaceC7707dCj interfaceC7707dCj) {
        return abstractC7773dEv.a().c() && C8632dsu.c(interfaceC7707dCj.b(), AbstractC7715dCr.b.a);
    }

    public static final int e(InterfaceC7707dCj interfaceC7707dCj, AbstractC7773dEv abstractC7773dEv, String str) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) abstractC7773dEv, "");
        C8632dsu.c((Object) str, "");
        if (a(abstractC7773dEv, interfaceC7707dCj)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C8632dsu.a(lowerCase, "");
            return c(interfaceC7707dCj, abstractC7773dEv, lowerCase);
        } else if (e(interfaceC7707dCj, abstractC7773dEv) != null) {
            return c(interfaceC7707dCj, abstractC7773dEv, str);
        } else {
            int b = interfaceC7707dCj.b(str);
            return (b == -3 && abstractC7773dEv.a().m()) ? c(interfaceC7707dCj, abstractC7773dEv, str) : b;
        }
    }

    public static /* synthetic */ int d(InterfaceC7707dCj interfaceC7707dCj, AbstractC7773dEv abstractC7773dEv, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return b(interfaceC7707dCj, abstractC7773dEv, str, str2);
    }

    public static final int b(InterfaceC7707dCj interfaceC7707dCj, AbstractC7773dEv abstractC7773dEv, String str, String str2) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) abstractC7773dEv, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        int e = e(interfaceC7707dCj, abstractC7773dEv, str);
        if (e != -3) {
            return e;
        }
        throw new SerializationException(interfaceC7707dCj.d() + " does not contain element with name '" + str + '\'' + str2);
    }
}
