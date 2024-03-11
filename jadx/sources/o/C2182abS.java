package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C1376Za;
import o.C2507ahQ;

/* renamed from: o.abS  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2182abS {
    public static final C2182abS b = new C2182abS();

    /* renamed from: o.abS$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1376Za.a> {
        private static final List<String> b;
        public static final e c = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("fetchPinotSearchPage");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1376Za.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1376Za.e eVar = null;
            while (jsonReader.a(b) == 0) {
                eVar = (C1376Za.e) C8953gT.d(C8953gT.a(d.c, true)).b(jsonReader, c9028hp);
            }
            return new C1376Za.a(eVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1376Za.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("fetchPinotSearchPage");
            C8953gT.d(C8953gT.a(d.c, true)).e(interfaceC9069id, c9028hp, aVar.a());
        }
    }

    private C2182abS() {
    }

    /* renamed from: o.abS$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1376Za.e> {
        private static final List<String> a;
        public static final d c = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1376Za.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1376Za.d dVar = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = a.e.b(jsonReader, c9028hp);
            }
            return new C1376Za.e(str, dVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1376Za.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.c());
            if (eVar.a() != null) {
                a.e.e(interfaceC9069id, c9028hp, eVar.a());
            }
        }
    }

    /* renamed from: o.abS$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1376Za.d> {
        public static final a e = new a();

        private a() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1376Za.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C1376Za.d(C2507ahQ.c.c.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1376Za.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            C2507ahQ.c.c.e(interfaceC9069id, c9028hp, dVar.c());
        }
    }
}
