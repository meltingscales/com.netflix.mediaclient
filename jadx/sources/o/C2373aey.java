package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C2346aeX;
import o.C2372aex;
import o.C2632ajj;
import o.C2641ajs;

/* renamed from: o.aey  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2373aey {
    public static final C2373aey e = new C2373aey();

    /* renamed from: o.aey$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2372aex> {
        private static final List<String> c;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2372aex b(JsonReader jsonReader, C9028hp c9028hp) {
            C2372aex.d dVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2372aex.e eVar = null;
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = d.c.b(jsonReader, c9028hp);
            } else {
                dVar = null;
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                eVar = e.e.b(jsonReader, c9028hp);
            }
            return new C2372aex(str, dVar, eVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2372aex c2372aex) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2372aex, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2372aex.d());
            if (c2372aex.a() != null) {
                d.c.e(interfaceC9069id, c9028hp, c2372aex.a());
            }
            if (c2372aex.c() != null) {
                e.e.e(interfaceC9069id, c9028hp, c2372aex.c());
            }
        }
    }

    private C2373aey() {
    }

    /* renamed from: o.aey$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2372aex.d> {
        public static final d c = new d();

        private d() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2372aex.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            String b = C9070ie.b(jsonReader);
            jsonReader.q();
            C2630ajh b2 = C2632ajj.e.b.b(jsonReader, c9028hp);
            C2638ajp c2638ajp = null;
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Supplemental"), c9028hp.f, b, c9028hp.d, null)) {
                jsonReader.q();
                c2638ajp = C2641ajs.c.b.b(jsonReader, c9028hp);
            }
            return new C2372aex.d(b2, c2638ajp);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2372aex.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, dVar.b());
            if (dVar.a() != null) {
                C2641ajs.c.b.e(interfaceC9069id, c9028hp, dVar.a());
            }
        }
    }

    /* renamed from: o.aey$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2372aex.e> {
        private static final List<String> d;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("isDeviceSupported");
            d = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2372aex.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Boolean bool = null;
            while (jsonReader.a(d) == 0) {
                bool = C8953gT.l.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            return new C2372aex.e(bool, C2346aeX.e.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2372aex.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("isDeviceSupported");
            C8953gT.l.e(interfaceC9069id, c9028hp, eVar.d());
            C2346aeX.e.e.e(interfaceC9069id, c9028hp, eVar.c());
        }
    }
}
