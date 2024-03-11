package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSInputSize;
import com.netflix.clcs.codegen.type.CLCSInputStyle;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.BH;
import o.BJ;
import o.C0749Be;
import o.C0774Cb;

/* loaded from: classes2.dex */
public final class BL {
    public static final BL d = new BL();

    /* loaded from: classes2.dex */
    public static final class g implements InterfaceC8949gP<BJ> {
        public static final g a = new g();
        private static final List<String> c;
        public static final int d;

        private g() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "accessibilityDescription", "trackingInfo", "loggingViewName", "countries", "countryCodeField", "phoneNumberField", "inputSize", "inputStyle", "phoneNumberPlaceholder", "onChange", "onFocus", "initialErrorMessage");
            c = j;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public BJ b(JsonReader jsonReader, C9028hp c9028hp) {
            BJ.i iVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            BJ.b bVar = null;
            String str2 = null;
            String str3 = null;
            List list = null;
            BJ.e eVar = null;
            BJ.h hVar = null;
            CLCSInputSize cLCSInputSize = null;
            CLCSInputStyle cLCSInputStyle = null;
            BJ.f fVar = null;
            BJ.g gVar = null;
            BJ.i iVar2 = null;
            BJ.a aVar = null;
            while (true) {
                switch (jsonReader.a(c)) {
                    case 0:
                        iVar = iVar2;
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        iVar = iVar2;
                        bVar = (BJ.b) C8953gT.d(C8953gT.a(d.d, true)).b(jsonReader, c9028hp);
                        break;
                    case 2:
                        iVar = iVar2;
                        str2 = (String) C8953gT.d(C8953gT.p).b(jsonReader, c9028hp);
                        break;
                    case 3:
                        iVar = iVar2;
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        iVar = iVar2;
                        list = (List) C8953gT.d(C8953gT.a(C8953gT.c(c.e, false, 1, null))).b(jsonReader, c9028hp);
                        break;
                    case 5:
                        eVar = (BJ.e) C8953gT.d(C8953gT.a(b.b, true)).b(jsonReader, c9028hp);
                        continue;
                    case 6:
                        hVar = (BJ.h) C8953gT.d(C8953gT.a(h.a, true)).b(jsonReader, c9028hp);
                        continue;
                    case 7:
                        cLCSInputSize = (CLCSInputSize) C8953gT.d(EX.b).b(jsonReader, c9028hp);
                        continue;
                    case 8:
                        cLCSInputStyle = (CLCSInputStyle) C8953gT.d(EZ.d).b(jsonReader, c9028hp);
                        continue;
                    case 9:
                        fVar = (BJ.f) C8953gT.d(C8953gT.a(i.c, true)).b(jsonReader, c9028hp);
                        continue;
                    case 10:
                        gVar = (BJ.g) C8953gT.d(C8953gT.a(j.e, true)).b(jsonReader, c9028hp);
                        continue;
                    case 11:
                        iVar2 = (BJ.i) C8953gT.d(C8953gT.a(f.e, true)).b(jsonReader, c9028hp);
                        continue;
                    case 12:
                        aVar = (BJ.a) C8953gT.d(C8953gT.a(e.d, true)).b(jsonReader, c9028hp);
                        continue;
                    default:
                        BJ.i iVar3 = iVar2;
                        if (str != null) {
                            return new BJ(str, bVar, str2, str3, list, eVar, hVar, cLCSInputSize, cLCSInputStyle, fVar, gVar, iVar3, aVar);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
                iVar2 = iVar;
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BJ bj) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bj, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bj.l());
            interfaceC9069id.e("accessibilityDescription");
            C8953gT.d(C8953gT.a(d.d, true)).e(interfaceC9069id, c9028hp, bj.a());
            interfaceC9069id.e("trackingInfo");
            C8953gT.d(interfaceC8949gP).e(interfaceC9069id, c9028hp, bj.k());
            interfaceC9069id.e("loggingViewName");
            C8953gT.t.e(interfaceC9069id, c9028hp, bj.g());
            interfaceC9069id.e("countries");
            C8953gT.d(C8953gT.a(C8953gT.c(c.e, false, 1, null))).e(interfaceC9069id, c9028hp, bj.b());
            interfaceC9069id.e("countryCodeField");
            C8953gT.d(C8953gT.a(b.b, true)).e(interfaceC9069id, c9028hp, bj.e());
            interfaceC9069id.e("phoneNumberField");
            C8953gT.d(C8953gT.a(h.a, true)).e(interfaceC9069id, c9028hp, bj.h());
            interfaceC9069id.e("inputSize");
            C8953gT.d(EX.b).e(interfaceC9069id, c9028hp, bj.d());
            interfaceC9069id.e("inputStyle");
            C8953gT.d(EZ.d).e(interfaceC9069id, c9028hp, bj.i());
            interfaceC9069id.e("phoneNumberPlaceholder");
            C8953gT.d(C8953gT.a(i.c, true)).e(interfaceC9069id, c9028hp, bj.n());
            interfaceC9069id.e("onChange");
            C8953gT.d(C8953gT.a(j.e, true)).e(interfaceC9069id, c9028hp, bj.j());
            interfaceC9069id.e("onFocus");
            C8953gT.d(C8953gT.a(f.e, true)).e(interfaceC9069id, c9028hp, bj.f());
            interfaceC9069id.e("initialErrorMessage");
            C8953gT.d(C8953gT.a(e.d, true)).e(interfaceC9069id, c9028hp, bj.c());
        }
    }

    private BL() {
    }

    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<BJ.b> {
        private static final List<String> b;
        public static final int c;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BJ.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b2 = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BJ.b(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BJ.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.c());
            BH.b.d.e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<BJ.d> {
        public static final int c;
        private static final List<String> d;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "code", "name", "phoneCodePrefix");
            d = j;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BJ.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            BJ.c cVar = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    cVar = (BJ.c) C8953gT.d(C8953gT.a(a.d, true)).b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new BJ.d(str, str2, cVar, str3);
            } else {
                C8956gW.a(jsonReader, "code");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BJ.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("code");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e("name");
            C8953gT.d(C8953gT.a(a.d, true)).e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("phoneCodePrefix");
            C8953gT.t.e(interfaceC9069id, c9028hp, dVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<BJ.c> {
        public static final int b;
        private static final List<String> c;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BJ.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b2 = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BJ.c(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BJ.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.c());
            BH.b.d.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<BJ.e> {
        public static final int a;
        public static final b b = new b();
        private static final List<String> d;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BJ.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BU b2 = C0774Cb.b.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new BJ.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BJ.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            C0774Cb.b.e.e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class h implements InterfaceC8949gP<BJ.h> {
        public static final h a = new h();
        private static final List<String> c;
        public static final int d;

        private h() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BJ.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BU b = C0774Cb.b.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new BJ.h(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BJ.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.a());
            C0774Cb.b.e.e(interfaceC9069id, c9028hp, hVar.c());
        }
    }

    /* loaded from: classes2.dex */
    public static final class i implements InterfaceC8949gP<BJ.f> {
        public static final i c = new i();
        private static final List<String> d;
        public static final int e;

        private i() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            d = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BJ.f b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BJ.f(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BJ.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, fVar.c());
            BH.b.d.e(interfaceC9069id, c9028hp, fVar.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class j implements InterfaceC8949gP<BJ.g> {
        public static final int a;
        private static final List<String> c;
        public static final j e = new j();

        private j() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BJ.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0753Bi b = C0749Be.c.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new BJ.g(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BJ.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.c());
            C0749Be.c.c.e(interfaceC9069id, c9028hp, gVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements InterfaceC8949gP<BJ.i> {
        public static final int b;
        private static final List<String> c;
        public static final f e = new f();

        private f() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public BJ.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0753Bi b2 = C0749Be.c.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new BJ.i(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BJ.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.d());
            C0749Be.c.c.e(interfaceC9069id, c9028hp, iVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<BJ.a> {
        public static final int c;
        public static final e d = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BJ.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BJ.a(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BJ.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            BH.b.d.e(interfaceC9069id, c9028hp, aVar.c());
        }
    }
}
