package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C2421afp;
import o.YD;

/* renamed from: o.abf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2195abf {
    public static final C2195abf b = new C2195abf();

    /* renamed from: o.abf$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<YD.b> {
        public static final b a = new b();
        private static final List<String> b;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("pinotQuerySearchPage");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YD.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YD.e eVar = null;
            while (jsonReader.a(b) == 0) {
                eVar = (YD.e) C8953gT.d(C8953gT.a(d.c, true)).b(jsonReader, c9028hp);
            }
            return new YD.b(eVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YD.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("pinotQuerySearchPage");
            C8953gT.d(C8953gT.a(d.c, true)).e(interfaceC9069id, c9028hp, bVar.a());
        }
    }

    private C2195abf() {
    }

    /* renamed from: o.abf$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<YD.e> {
        public static final d c = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public YD.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YD.c cVar = null;
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                cVar = a.e.b(jsonReader, c9028hp);
            }
            return new YD.e(str, cVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YD.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.e());
            if (eVar.b() != null) {
                a.e.e(interfaceC9069id, c9028hp, eVar.b());
            }
        }
    }

    /* renamed from: o.abf$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<YD.c> {
        public static final a e = new a();

        private a() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YD.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new YD.c(C2421afp.d.d.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YD.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            C2421afp.d.d.e(interfaceC9069id, c9028hp, cVar.c());
        }
    }
}
