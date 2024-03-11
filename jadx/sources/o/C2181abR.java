package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C2507ahQ;
import o.YW;

/* renamed from: o.abR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2181abR {
    public static final C2181abR e = new C2181abR();

    /* renamed from: o.abR$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<YW.c> {
        public static final e b = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("pinotQuerySearchPage");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YW.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YW.b bVar = null;
            while (jsonReader.a(e) == 0) {
                bVar = (YW.b) C8953gT.d(C8953gT.a(d.b, true)).b(jsonReader, c9028hp);
            }
            return new YW.c(bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YW.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("pinotQuerySearchPage");
            C8953gT.d(C8953gT.a(d.b, true)).e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    private C2181abR() {
    }

    /* renamed from: o.abR$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<YW.b> {
        private static final List<String> a;
        public static final d b = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YW.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YW.a aVar = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = a.c.b(jsonReader, c9028hp);
            }
            return new YW.b(str, aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YW.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.d());
            if (bVar.e() != null) {
                a.c.e(interfaceC9069id, c9028hp, bVar.e());
            }
        }
    }

    /* renamed from: o.abR$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<YW.a> {
        public static final a c = new a();

        private a() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YW.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new YW.a(C2507ahQ.c.c.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YW.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            C2507ahQ.c.c.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }
}
