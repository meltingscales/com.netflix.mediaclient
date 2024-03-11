package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C2571aib;
import o.C2578aii;
import o.C2632ajj;
import o.C2634ajl;

/* renamed from: o.aim  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2582aim {
    public static final C2582aim b = new C2582aim();

    /* renamed from: o.aim$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2579aij> {
        public static final d a = new d();
        private static final List<String> c;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2579aij b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2637ajo c2637ajo = null;
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            jsonReader.q();
            C2630ajh b = C2632ajj.e.b.b(jsonReader, c9028hp);
            jsonReader.q();
            C2580aik b2 = C2578aii.a.c.b(jsonReader, c9028hp);
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2637ajo = C2634ajl.a.a.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            return new C2579aij(str, b, b2, c2637ajo, C2571aib.b.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2579aij c2579aij) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2579aij, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2579aij.a());
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, c2579aij.b());
            C2578aii.a.c.e(interfaceC9069id, c9028hp, c2579aij.d());
            if (c2579aij.c() != null) {
                C2634ajl.a.a.e(interfaceC9069id, c9028hp, c2579aij.c());
            }
            C2571aib.b.e.e(interfaceC9069id, c9028hp, c2579aij.e());
        }
    }

    private C2582aim() {
    }
}
