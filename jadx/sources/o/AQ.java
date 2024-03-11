package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AG;
import o.AR;
import o.BH;
import o.C0749Be;

/* loaded from: classes2.dex */
public final class AQ {
    public static final AQ c = new AQ();

    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<AR> {
        public static final int b;
        public static final e c = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "accessibilityDescription", "trackingInfo", "loggingViewName", "label", "field", "onChange");
            e = j;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public AR b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            AR.c cVar = null;
            String str2 = null;
            String str3 = null;
            AR.d dVar = null;
            AR.e eVar = null;
            AR.a aVar = null;
            while (true) {
                switch (jsonReader.a(e)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        cVar = (AR.c) C8953gT.d(C8953gT.a(a.a, true)).b(jsonReader, c9028hp);
                        break;
                    case 2:
                        str2 = (String) C8953gT.d(C8953gT.p).b(jsonReader, c9028hp);
                        break;
                    case 3:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        dVar = (AR.d) C8953gT.d(C8953gT.a(b.e, true)).b(jsonReader, c9028hp);
                        break;
                    case 5:
                        eVar = (AR.e) C8953gT.d(C8953gT.a(d.d, true)).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        aVar = (AR.a) C8953gT.d(C8953gT.a(c.a, true)).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str != null) {
                            return new AR(str, cVar, str2, str3, dVar, eVar, aVar);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AR ar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) ar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, ar.g());
            interfaceC9069id.e("accessibilityDescription");
            C8953gT.d(C8953gT.a(a.a, true)).e(interfaceC9069id, c9028hp, ar.e());
            interfaceC9069id.e("trackingInfo");
            C8953gT.d(interfaceC8949gP).e(interfaceC9069id, c9028hp, ar.j());
            interfaceC9069id.e("loggingViewName");
            C8953gT.t.e(interfaceC9069id, c9028hp, ar.a());
            interfaceC9069id.e("label");
            C8953gT.d(C8953gT.a(b.e, true)).e(interfaceC9069id, c9028hp, ar.d());
            interfaceC9069id.e("field");
            C8953gT.d(C8953gT.a(d.d, true)).e(interfaceC9069id, c9028hp, ar.c());
            interfaceC9069id.e("onChange");
            C8953gT.d(C8953gT.a(c.a, true)).e(interfaceC9069id, c9028hp, ar.b());
        }
    }

    private AQ() {
    }

    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<AR.c> {
        public static final a a = new a();
        public static final int b;
        private static final List<String> d;

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public AR.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b2 = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new AR.c(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AR.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            BH.b.d.e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<AR.d> {
        public static final int b;
        private static final List<String> d;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            d = e2;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public AR.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b2 = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new AR.d(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AR.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.d());
            BH.b.d.e(interfaceC9069id, c9028hp, dVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<AR.e> {
        private static final List<String> a;
        public static final int b;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public AR.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AI b2 = AG.c.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new AR.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AR.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.d());
            AG.c.a.e(interfaceC9069id, c9028hp, eVar.c());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<AR.a> {
        public static final c a = new c();
        private static final List<String> c;
        public static final int e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public AR.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0753Bi b = C0749Be.c.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new AR.a(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AR.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            C0749Be.c.c.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }
}
