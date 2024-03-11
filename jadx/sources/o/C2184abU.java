package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C2509ahS;
import o.YY;

/* renamed from: o.abU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2184abU {
    public static final C2184abU d = new C2184abU();

    /* renamed from: o.abU$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<YY.d> {
        public static final b a = new b();
        private static final List<String> c;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("pinotPageById");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YY.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YY.e eVar = null;
            while (jsonReader.a(c) == 0) {
                eVar = (YY.e) C8953gT.d(C8953gT.a(d.a, true)).b(jsonReader, c9028hp);
            }
            return new YY.d(eVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YY.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("pinotPageById");
            C8953gT.d(C8953gT.a(d.a, true)).e(interfaceC9069id, c9028hp, dVar.e());
        }
    }

    private C2184abU() {
    }

    /* renamed from: o.abU$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<YY.e> {
        public static final d a = new d();
        private static final List<String> b;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YY.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YY.b bVar = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = c.b.b(jsonReader, c9028hp);
            }
            return new YY.e(str, bVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YY.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.c());
            if (eVar.a() != null) {
                c.b.e(interfaceC9069id, c9028hp, eVar.a());
            }
        }
    }

    /* renamed from: o.abU$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<YY.b> {
        public static final c b = new c();

        private c() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YY.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new YY.b(C2509ahS.a.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YY.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            C2509ahS.a.e.e(interfaceC9069id, c9028hp, bVar.c());
        }
    }
}
