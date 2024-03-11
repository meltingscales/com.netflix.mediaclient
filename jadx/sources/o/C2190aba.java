package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C2421afp;
import o.YE;

/* renamed from: o.aba  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2190aba {
    public static final C2190aba e = new C2190aba();

    /* renamed from: o.aba$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<YE.e> {
        public static final d b = new d();
        private static final List<String> c;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("pinotPreQuerySearchPage");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YE.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YE.a aVar = null;
            while (jsonReader.a(c) == 0) {
                aVar = (YE.a) C8953gT.d(C8953gT.a(c.c, true)).b(jsonReader, c9028hp);
            }
            return new YE.e(aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YE.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("pinotPreQuerySearchPage");
            C8953gT.d(C8953gT.a(c.c, true)).e(interfaceC9069id, c9028hp, eVar.a());
        }
    }

    private C2190aba() {
    }

    /* renamed from: o.aba$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<YE.a> {
        private static final List<String> a;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YE.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YE.d dVar = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = e.c.b(jsonReader, c9028hp);
            }
            return new YE.a(str, dVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YE.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.e());
            if (aVar.b() != null) {
                e.c.e(interfaceC9069id, c9028hp, aVar.b());
            }
        }
    }

    /* renamed from: o.aba$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<YE.d> {
        public static final e c = new e();

        private e() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YE.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new YE.d(C2421afp.d.d.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YE.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            C2421afp.d.d.e(interfaceC9069id, c9028hp, dVar.e());
        }
    }
}
