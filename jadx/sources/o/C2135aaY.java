package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C2421afp;
import o.YC;

/* renamed from: o.aaY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2135aaY {
    public static final C2135aaY c = new C2135aaY();

    /* renamed from: o.aaY$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<YC.a> {
        private static final List<String> a;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("pinotPageById");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public YC.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YC.d dVar = null;
            while (jsonReader.a(a) == 0) {
                dVar = (YC.d) C8953gT.d(C8953gT.a(d.a, true)).b(jsonReader, c9028hp);
            }
            return new YC.a(dVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YC.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("pinotPageById");
            C8953gT.d(C8953gT.a(d.a, true)).e(interfaceC9069id, c9028hp, aVar.e());
        }
    }

    private C2135aaY() {
    }

    /* renamed from: o.aaY$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<YC.d> {
        public static final d a = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public YC.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YC.e eVar = null;
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                eVar = e.b.b(jsonReader, c9028hp);
            }
            return new YC.d(str, eVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YC.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.b());
            if (dVar.d() != null) {
                e.b.e(interfaceC9069id, c9028hp, dVar.d());
            }
        }
    }

    /* renamed from: o.aaY$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<YC.e> {
        public static final e b = new e();

        private e() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YC.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new YC.e(C2421afp.d.d.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YC.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            C2421afp.d.d.e(interfaceC9069id, c9028hp, eVar.b());
        }
    }
}
