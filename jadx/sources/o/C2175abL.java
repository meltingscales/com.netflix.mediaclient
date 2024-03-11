package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C2509ahS;
import o.YZ;

/* renamed from: o.abL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2175abL {
    public static final C2175abL b = new C2175abL();

    /* renamed from: o.abL$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<YZ.e> {
        public static final c b = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("pinotQuerySearchPage");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YZ.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YZ.b bVar = null;
            while (jsonReader.a(e) == 0) {
                bVar = (YZ.b) C8953gT.d(C8953gT.a(d.c, true)).b(jsonReader, c9028hp);
            }
            return new YZ.e(bVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YZ.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("pinotQuerySearchPage");
            C8953gT.d(C8953gT.a(d.c, true)).e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    private C2175abL() {
    }

    /* renamed from: o.abL$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<YZ.b> {
        private static final List<String> b;
        public static final d c = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public YZ.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YZ.c cVar = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                cVar = e.a.b(jsonReader, c9028hp);
            }
            return new YZ.b(str, cVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YZ.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            if (bVar.e() != null) {
                e.a.e(interfaceC9069id, c9028hp, bVar.e());
            }
        }
    }

    /* renamed from: o.abL$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<YZ.c> {
        public static final e a = new e();

        private e() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YZ.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new YZ.c(C2509ahS.a.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YZ.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            C2509ahS.a.e.e(interfaceC9069id, c9028hp, cVar.b());
        }
    }
}
