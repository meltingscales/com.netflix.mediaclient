package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C2507ahQ;
import o.YX;

/* renamed from: o.abN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2177abN {
    public static final C2177abN c = new C2177abN();

    /* renamed from: o.abN$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<YX.d> {
        private static final List<String> a;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("pinotPreQuerySearchPage");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YX.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YX.b bVar = null;
            while (jsonReader.a(a) == 0) {
                bVar = (YX.b) C8953gT.d(C8953gT.a(c.b, true)).b(jsonReader, c9028hp);
            }
            return new YX.d(bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YX.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("pinotPreQuerySearchPage");
            C8953gT.d(C8953gT.a(c.b, true)).e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    private C2177abN() {
    }

    /* renamed from: o.abN$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<YX.b> {
        public static final c b = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public YX.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YX.c cVar = null;
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                cVar = b.b.b(jsonReader, c9028hp);
            }
            return new YX.b(str, cVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YX.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.d());
            if (bVar.b() != null) {
                b.b.e(interfaceC9069id, c9028hp, bVar.b());
            }
        }
    }

    /* renamed from: o.abN$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<YX.c> {
        public static final b b = new b();

        private b() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public YX.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new YX.c(C2507ahQ.c.c.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YX.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            C2507ahQ.c.c.e(interfaceC9069id, c9028hp, cVar.b());
        }
    }
}
