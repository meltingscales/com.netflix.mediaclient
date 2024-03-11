package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSPinEntrySize;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AX;
import o.BH;
import o.BM;
import o.C0749Be;
import o.C0774Cb;
import o.C0780Ch;

/* loaded from: classes2.dex */
public final class BN {
    public static final BN c = new BN();

    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<BM> {
        private static final List<String> a;
        public static final c c = new c();
        public static final int e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "accessibilityDescription", "trackingInfo", "loggingViewName", "typography", "textColor", "length", "pinEntrySize", "field", "onChange");
            a = j;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BM b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            BM.e eVar = null;
            String str2 = null;
            String str3 = null;
            BM.b bVar = null;
            BM.a aVar = null;
            Integer num = null;
            CLCSPinEntrySize cLCSPinEntrySize = null;
            BM.c cVar = null;
            BM.d dVar = null;
            while (true) {
                switch (jsonReader.a(a)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        eVar = (BM.e) C8953gT.d(C8953gT.a(d.a, true)).b(jsonReader, c9028hp);
                        break;
                    case 2:
                        str2 = (String) C8953gT.d(C8953gT.p).b(jsonReader, c9028hp);
                        break;
                    case 3:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        bVar = (BM.b) C8953gT.d(C8953gT.a(f.c, true)).b(jsonReader, c9028hp);
                        break;
                    case 5:
                        aVar = (BM.a) C8953gT.d(C8953gT.a(e.d, true)).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        num = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 7:
                        cLCSPinEntrySize = (CLCSPinEntrySize) C8953gT.d(C0861Fk.b).b(jsonReader, c9028hp);
                        break;
                    case 8:
                        cVar = (BM.c) C8953gT.d(C8953gT.a(a.a, true)).b(jsonReader, c9028hp);
                        break;
                    case 9:
                        dVar = (BM.d) C8953gT.d(C8953gT.a(b.c, true)).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str != null) {
                            return new BM(str, eVar, str2, str3, bVar, aVar, num, cLCSPinEntrySize, cVar, dVar);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BM bm) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bm, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bm.f());
            interfaceC9069id.e("accessibilityDescription");
            C8953gT.d(C8953gT.a(d.a, true)).e(interfaceC9069id, c9028hp, bm.e());
            interfaceC9069id.e("trackingInfo");
            C8953gT.d(interfaceC8949gP).e(interfaceC9069id, c9028hp, bm.h());
            interfaceC9069id.e("loggingViewName");
            C8953gT.t.e(interfaceC9069id, c9028hp, bm.b());
            interfaceC9069id.e("typography");
            C8953gT.d(C8953gT.a(f.c, true)).e(interfaceC9069id, c9028hp, bm.j());
            interfaceC9069id.e("textColor");
            C8953gT.d(C8953gT.a(e.d, true)).e(interfaceC9069id, c9028hp, bm.i());
            interfaceC9069id.e("length");
            C8953gT.n.e(interfaceC9069id, c9028hp, bm.d());
            interfaceC9069id.e("pinEntrySize");
            C8953gT.d(C0861Fk.b).e(interfaceC9069id, c9028hp, bm.g());
            interfaceC9069id.e("field");
            C8953gT.d(C8953gT.a(a.a, true)).e(interfaceC9069id, c9028hp, bm.a());
            interfaceC9069id.e("onChange");
            C8953gT.d(C8953gT.a(b.c, true)).e(interfaceC9069id, c9028hp, bm.c());
        }
    }

    private BN() {
    }

    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<BM.e> {
        public static final d a = new d();
        public static final int c;
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BM.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BM.e(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BM.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            BH.b.d.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements InterfaceC8949gP<BM.b> {
        private static final List<String> b;
        public static final f c = new f();
        public static final int d;

        private f() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BM.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0779Cg b2 = C0780Ch.c.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new BM.b(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BM.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.c());
            C0780Ch.c.b.e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<BM.a> {
        private static final List<String> a;
        public static final int b;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public BM.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AW b2 = AX.a.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new BM.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BM.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.a());
            AX.a.e.e(interfaceC9069id, c9028hp, aVar.d());
        }
    }

    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<BM.c> {
        public static final a a = new a();
        public static final int c;
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public BM.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BU b = C0774Cb.b.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new BM.c(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BM.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            C0774Cb.b.e.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<BM.d> {
        private static final List<String> a;
        public static final b c = new b();
        public static final int d;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BM.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0753Bi b = C0749Be.c.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new BM.d(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BM.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            C0749Be.c.c.e(interfaceC9069id, c9028hp, dVar.d());
        }
    }
}
