package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSInputSize;
import com.netflix.clcs.codegen.type.CLCSInputType;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.BC;
import o.BH;
import o.C0748Bd;
import o.C0749Be;
import o.C0774Cb;

/* renamed from: o.By  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0769By {
    public static final C0769By d = new C0769By();

    /* renamed from: o.By$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<BC> {
        public static final a a = new a();
        private static final List<String> c;
        public static final int e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "accessibilityDescription", "trackingInfo", "field", "inputSize", "inputType", "icon", "placeholder", "onChange", "initialErrorMessage");
            c = j;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BC b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            BC.c cVar = null;
            String str2 = null;
            BC.e eVar = null;
            CLCSInputSize cLCSInputSize = null;
            CLCSInputType cLCSInputType = null;
            BC.a aVar = null;
            BC.i iVar = null;
            BC.d dVar = null;
            BC.b bVar = null;
            while (true) {
                switch (jsonReader.a(c)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        cVar = (BC.c) C8953gT.d(C8953gT.a(b.b, true)).b(jsonReader, c9028hp);
                        break;
                    case 2:
                        str2 = (String) C8953gT.d(C8953gT.p).b(jsonReader, c9028hp);
                        break;
                    case 3:
                        eVar = (BC.e) C8953gT.d(C8953gT.a(e.c, true)).b(jsonReader, c9028hp);
                        break;
                    case 4:
                        cLCSInputSize = (CLCSInputSize) C8953gT.d(EX.b).b(jsonReader, c9028hp);
                        break;
                    case 5:
                        cLCSInputType = (CLCSInputType) C8953gT.d(EY.d).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        aVar = (BC.a) C8953gT.d(C8953gT.a(c.a, true)).b(jsonReader, c9028hp);
                        break;
                    case 7:
                        iVar = (BC.i) C8953gT.d(C8953gT.a(g.a, true)).b(jsonReader, c9028hp);
                        break;
                    case 8:
                        dVar = (BC.d) C8953gT.d(C8953gT.a(f.b, true)).b(jsonReader, c9028hp);
                        break;
                    case 9:
                        bVar = (BC.b) C8953gT.d(C8953gT.a(d.c, true)).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str != null) {
                            return new BC(str, cVar, str2, eVar, cLCSInputSize, cLCSInputType, aVar, iVar, dVar, bVar);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BC bc) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bc, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bc.g());
            interfaceC9069id.e("accessibilityDescription");
            C8953gT.d(C8953gT.a(b.b, true)).e(interfaceC9069id, c9028hp, bc.c());
            interfaceC9069id.e("trackingInfo");
            C8953gT.d(interfaceC8949gP).e(interfaceC9069id, c9028hp, bc.h());
            interfaceC9069id.e("field");
            C8953gT.d(C8953gT.a(e.c, true)).e(interfaceC9069id, c9028hp, bc.b());
            interfaceC9069id.e("inputSize");
            C8953gT.d(EX.b).e(interfaceC9069id, c9028hp, bc.e());
            interfaceC9069id.e("inputType");
            C8953gT.d(EY.d).e(interfaceC9069id, c9028hp, bc.j());
            interfaceC9069id.e("icon");
            C8953gT.d(C8953gT.a(c.a, true)).e(interfaceC9069id, c9028hp, bc.d());
            interfaceC9069id.e("placeholder");
            C8953gT.d(C8953gT.a(g.a, true)).e(interfaceC9069id, c9028hp, bc.f());
            interfaceC9069id.e("onChange");
            C8953gT.d(C8953gT.a(f.b, true)).e(interfaceC9069id, c9028hp, bc.i());
            interfaceC9069id.e("initialErrorMessage");
            C8953gT.d(C8953gT.a(d.c, true)).e(interfaceC9069id, c9028hp, bc.a());
        }
    }

    private C0769By() {
    }

    /* renamed from: o.By$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<BC.c> {
        public static final int a;
        public static final b b = new b();
        private static final List<String> c;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BC.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b2 = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BC.c(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BC.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.d());
            BH.b.d.e(interfaceC9069id, c9028hp, cVar.e());
        }
    }

    /* renamed from: o.By$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<BC.e> {
        public static final int a;
        private static final List<String> b;
        public static final e c = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BC.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BU b2 = C0774Cb.b.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new BC.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BC.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.e());
            C0774Cb.b.e.e(interfaceC9069id, c9028hp, eVar.a());
        }
    }

    /* renamed from: o.By$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<BC.a> {
        public static final c a = new c();
        public static final int b;
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public BC.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0746Bb b2 = C0748Bd.a.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BC.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BC.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            C0748Bd.a.d.e(interfaceC9069id, c9028hp, aVar.c());
        }
    }

    /* renamed from: o.By$g */
    /* loaded from: classes2.dex */
    public static final class g implements InterfaceC8949gP<BC.i> {
        public static final g a = new g();
        private static final List<String> b;
        public static final int d;

        private g() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public BC.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b2 = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BC.i(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BC.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.b());
            BH.b.d.e(interfaceC9069id, c9028hp, iVar.e());
        }
    }

    /* renamed from: o.By$f */
    /* loaded from: classes2.dex */
    public static final class f implements InterfaceC8949gP<BC.d> {
        public static final f b = new f();
        private static final List<String> d;
        public static final int e;

        private f() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            d = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BC.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0753Bi b2 = C0749Be.c.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new BC.d(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BC.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.c());
            C0749Be.c.c.e(interfaceC9069id, c9028hp, dVar.d());
        }
    }

    /* renamed from: o.By$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<BC.b> {
        private static final List<String> a;
        public static final d c = new d();
        public static final int d;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BC.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BC.b(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BC.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            BH.b.d.e(interfaceC9069id, c9028hp, bVar.a());
        }
    }
}
