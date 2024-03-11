package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C2509ahS;
import o.YR;

/* renamed from: o.abD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2167abD {
    public static final C2167abD b = new C2167abD();

    /* renamed from: o.abD$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<YR.c> {
        private static final List<String> b;
        public static final a c = new a();

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("pinotEntitySearchPage");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public YR.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YR.a aVar = null;
            while (jsonReader.a(b) == 0) {
                aVar = (YR.a) C8953gT.d(C8953gT.a(d.d, true)).b(jsonReader, c9028hp);
            }
            return new YR.c(aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YR.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("pinotEntitySearchPage");
            C8953gT.d(C8953gT.a(d.d, true)).e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    private C2167abD() {
    }

    /* renamed from: o.abD$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<YR.a> {
        public static final d d = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public YR.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YR.e eVar = null;
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                eVar = e.c.b(jsonReader, c9028hp);
            }
            return new YR.a(str, eVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YR.a aVar) {
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

    /* renamed from: o.abD$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<YR.e> {
        public static final e c = new e();

        private e() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YR.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new YR.e(C2509ahS.a.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YR.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            C2509ahS.a.e.e(interfaceC9069id, c9028hp, eVar.a());
        }
    }
}
