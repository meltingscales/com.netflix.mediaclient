package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C2507ahQ;
import o.YS;

/* renamed from: o.abK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2174abK {
    public static final C2174abK d = new C2174abK();

    /* renamed from: o.abK$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<YS.a> {
        public static final c d = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("pinotEntitySearchPage");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YS.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YS.d dVar = null;
            while (jsonReader.a(e) == 0) {
                dVar = (YS.d) C8953gT.d(C8953gT.a(e.a, true)).b(jsonReader, c9028hp);
            }
            return new YS.a(dVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YS.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("pinotEntitySearchPage");
            C8953gT.d(C8953gT.a(e.a, true)).e(interfaceC9069id, c9028hp, aVar.c());
        }
    }

    private C2174abK() {
    }

    /* renamed from: o.abK$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<YS.d> {
        public static final e a = new e();
        private static final List<String> b;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YS.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YS.c cVar = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                cVar = b.b.b(jsonReader, c9028hp);
            }
            return new YS.d(str, cVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YS.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            if (dVar.e() != null) {
                b.b.e(interfaceC9069id, c9028hp, dVar.e());
            }
        }
    }

    /* renamed from: o.abK$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<YS.c> {
        public static final b b = new b();

        private b() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YS.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new YS.c(C2507ahQ.c.c.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YS.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            C2507ahQ.c.c.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }
}
