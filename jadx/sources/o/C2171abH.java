package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C2509ahS;
import o.YU;

/* renamed from: o.abH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2171abH {
    public static final C2171abH d = new C2171abH();

    /* renamed from: o.abH$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<YU.c> {
        public static final d b = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("pinotPreQuerySearchPage");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public YU.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YU.e eVar = null;
            while (jsonReader.a(e) == 0) {
                eVar = (YU.e) C8953gT.d(C8953gT.a(c.b, true)).b(jsonReader, c9028hp);
            }
            return new YU.c(eVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YU.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("pinotPreQuerySearchPage");
            C8953gT.d(C8953gT.a(c.b, true)).e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    private C2171abH() {
    }

    /* renamed from: o.abH$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<YU.e> {
        private static final List<String> a;
        public static final c b = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YU.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YU.a aVar = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = b.d.b(jsonReader, c9028hp);
            }
            return new YU.e(str, aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YU.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.d());
            if (eVar.b() != null) {
                b.d.e(interfaceC9069id, c9028hp, eVar.b());
            }
        }
    }

    /* renamed from: o.abH$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<YU.a> {
        public static final b d = new b();

        private b() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YU.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new YU.a(C2509ahS.a.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YU.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            C2509ahS.a.e.e(interfaceC9069id, c9028hp, aVar.c());
        }
    }
}
