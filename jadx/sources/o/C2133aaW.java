package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C1374Yy;
import o.C2421afp;

/* renamed from: o.aaW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2133aaW {
    public static final C2133aaW e = new C2133aaW();

    /* renamed from: o.aaW$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1374Yy.d> {
        public static final d a = new d();
        private static final List<String> c;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("pinotEntitySearchPage");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1374Yy.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1374Yy.a aVar = null;
            while (jsonReader.a(c) == 0) {
                aVar = (C1374Yy.a) C8953gT.d(C8953gT.a(c.e, true)).b(jsonReader, c9028hp);
            }
            return new C1374Yy.d(aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1374Yy.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("pinotEntitySearchPage");
            C8953gT.d(C8953gT.a(c.e, true)).e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    private C2133aaW() {
    }

    /* renamed from: o.aaW$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1374Yy.a> {
        private static final List<String> d;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            d = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1374Yy.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1374Yy.c cVar = null;
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                cVar = e.c.b(jsonReader, c9028hp);
            }
            return new C1374Yy.a(str, cVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1374Yy.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            if (aVar.c() != null) {
                e.c.e(interfaceC9069id, c9028hp, aVar.c());
            }
        }
    }

    /* renamed from: o.aaW$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1374Yy.c> {
        public static final e c = new e();

        private e() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1374Yy.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C1374Yy.c(C2421afp.d.d.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1374Yy.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            C2421afp.d.d.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }
}
