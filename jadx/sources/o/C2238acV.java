package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2408afg;
import o.C2511ahU;
import o.C2540ahx;
import o.C2541ahy;
import o.C2554aiK;
import o.ZB;

/* renamed from: o.acV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2238acV {
    public static final C2238acV d = new C2238acV();

    /* renamed from: o.acV$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<ZB.d> {
        private static final List<String> b;
        public static final b c = new b();

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e(SignupConstants.Field.VIDEOS);
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public ZB.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(b) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(a.c, true)))).b(jsonReader, c9028hp);
            }
            return new ZB.d(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZB.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(a.c, true)))).e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    private C2238acV() {
    }

    /* renamed from: o.acV$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<ZB.e> {
        public static final a c = new a();
        private static final List<String> d;

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public ZB.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2553aiJ c2553aiJ = null;
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            jsonReader.q();
            ZB.c b = c.a.b(jsonReader, c9028hp);
            if (C9014hb.d(C9014hb.c("Show"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2553aiJ = C2554aiK.e.b.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            return new ZB.e(str, b, c2553aiJ, C2408afg.e.a.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZB.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.e());
            c.a.e(interfaceC9069id, c9028hp, eVar.b());
            if (eVar.d() != null) {
                C2554aiK.e.b.e(interfaceC9069id, c9028hp, eVar.d());
            }
            C2408afg.e.a.e(interfaceC9069id, c9028hp, eVar.a());
        }
    }

    /* renamed from: o.acV$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<ZB.c> {
        public static final c a = new c();

        private c() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public ZB.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            C2514ahX b = C2511ahU.e.e.b(jsonReader, c9028hp);
            jsonReader.q();
            C2539ahw b2 = C2541ahy.a.d.b(jsonReader, c9028hp);
            jsonReader.q();
            return new ZB.c(b, b2, C2540ahx.c.a.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZB.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            C2511ahU.e.e.e(interfaceC9069id, c9028hp, cVar.a());
            C2541ahy.a.d.e(interfaceC9069id, c9028hp, cVar.b());
            C2540ahx.c.a.e(interfaceC9069id, c9028hp, cVar.e());
        }
    }
}
