package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSSpaceSize;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AN;
import o.AO;
import o.AU;
import o.AX;
import o.BI;

/* renamed from: o.Ba  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0745Ba {
    public static final C0745Ba e = new C0745Ba();

    /* renamed from: o.Ba$f */
    /* loaded from: classes2.dex */
    public static final class f implements InterfaceC8949gP<AU> {
        private static final List<String> b;
        public static final int c;
        public static final f e = new f();

        private f() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "padding", "paddingSize", "paddingSizeResponsive", "backgroundColor", "borderColor", "borderWidth", "borderRadius");
            b = j;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public AU b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            AU.o oVar = null;
            AU.l lVar = null;
            AU.n nVar = null;
            AU.c cVar = null;
            AU.a aVar = null;
            AU.e eVar = null;
            AU.d dVar = null;
            while (true) {
                switch (jsonReader.a(b)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        oVar = (AU.o) C8953gT.d(C8953gT.c(n.d, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 2:
                        lVar = (AU.l) C8953gT.d(C8953gT.a(m.d, true)).b(jsonReader, c9028hp);
                        break;
                    case 3:
                        nVar = (AU.n) C8953gT.d(C8953gT.c(l.c, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 4:
                        cVar = (AU.c) C8953gT.d(C8953gT.a(c.a, true)).b(jsonReader, c9028hp);
                        break;
                    case 5:
                        aVar = (AU.a) C8953gT.d(C8953gT.a(a.e, true)).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        eVar = (AU.e) C8953gT.d(C8953gT.c(b.e, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 7:
                        dVar = (AU.d) C8953gT.d(C8953gT.c(e.d, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str != null) {
                            return new AU(str, oVar, lVar, nVar, cVar, aVar, eVar, dVar);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU au) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) au, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, au.h());
            interfaceC9069id.e("padding");
            C8953gT.d(C8953gT.c(n.d, false, 1, null)).e(interfaceC9069id, c9028hp, au.e());
            interfaceC9069id.e("paddingSize");
            C8953gT.d(C8953gT.a(m.d, true)).e(interfaceC9069id, c9028hp, au.g());
            interfaceC9069id.e("paddingSizeResponsive");
            C8953gT.d(C8953gT.c(l.c, false, 1, null)).e(interfaceC9069id, c9028hp, au.f());
            interfaceC9069id.e("backgroundColor");
            C8953gT.d(C8953gT.a(c.a, true)).e(interfaceC9069id, c9028hp, au.c());
            interfaceC9069id.e("borderColor");
            C8953gT.d(C8953gT.a(a.e, true)).e(interfaceC9069id, c9028hp, au.b());
            interfaceC9069id.e("borderWidth");
            C8953gT.d(C8953gT.c(b.e, false, 1, null)).e(interfaceC9069id, c9028hp, au.a());
            interfaceC9069id.e("borderRadius");
            C8953gT.d(C8953gT.c(e.d, false, 1, null)).e(interfaceC9069id, c9028hp, au.d());
        }
    }

    private C0745Ba() {
    }

    /* renamed from: o.Ba$n */
    /* loaded from: classes2.dex */
    public static final class n implements InterfaceC8949gP<AU.o> {
        public static final int c;
        public static final n d = new n();
        private static final List<String> e;

        private n() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "top", "bottom", "start", "end");
            e = j;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public AU.o b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            CLCSSpaceSize cLCSSpaceSize = null;
            CLCSSpaceSize cLCSSpaceSize2 = null;
            CLCSSpaceSize cLCSSpaceSize3 = null;
            CLCSSpaceSize cLCSSpaceSize4 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    cLCSSpaceSize = (CLCSSpaceSize) C8953gT.d(C0858Fh.b).b(jsonReader, c9028hp);
                } else if (a == 2) {
                    cLCSSpaceSize2 = (CLCSSpaceSize) C8953gT.d(C0858Fh.b).b(jsonReader, c9028hp);
                } else if (a == 3) {
                    cLCSSpaceSize3 = (CLCSSpaceSize) C8953gT.d(C0858Fh.b).b(jsonReader, c9028hp);
                } else if (a != 4) {
                    break;
                } else {
                    cLCSSpaceSize4 = (CLCSSpaceSize) C8953gT.d(C0858Fh.b).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new AU.o(str, cLCSSpaceSize, cLCSSpaceSize2, cLCSSpaceSize3, cLCSSpaceSize4);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.o oVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) oVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, oVar.c());
            interfaceC9069id.e("top");
            C0858Fh c0858Fh = C0858Fh.b;
            C8953gT.d(c0858Fh).e(interfaceC9069id, c9028hp, oVar.d());
            interfaceC9069id.e("bottom");
            C8953gT.d(c0858Fh).e(interfaceC9069id, c9028hp, oVar.e());
            interfaceC9069id.e("start");
            C8953gT.d(c0858Fh).e(interfaceC9069id, c9028hp, oVar.b());
            interfaceC9069id.e("end");
            C8953gT.d(c0858Fh).e(interfaceC9069id, c9028hp, oVar.a());
        }
    }

    /* renamed from: o.Ba$m */
    /* loaded from: classes2.dex */
    public static final class m implements InterfaceC8949gP<AU.l> {
        private static final List<String> b;
        public static final m d = new m();
        public static final int e;

        private m() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public AU.l b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BK b2 = BI.b.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new AU.l(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.l lVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) lVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, lVar.c());
            BI.b.e.e(interfaceC9069id, c9028hp, lVar.d());
        }
    }

    /* renamed from: o.Ba$l */
    /* loaded from: classes2.dex */
    public static final class l implements InterfaceC8949gP<AU.n> {
        private static final List<String> b;
        public static final l c = new l();
        public static final int e;

        private l() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "xs", "s", "m", "l", "xl");
            b = j;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public AU.n b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            AU.s sVar = null;
            AU.k kVar = null;
            AU.f fVar = null;
            AU.i iVar = null;
            AU.r rVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    sVar = (AU.s) C8953gT.d(C8953gT.a(u.e, true)).b(jsonReader, c9028hp);
                } else if (a == 2) {
                    kVar = (AU.k) C8953gT.d(C8953gT.a(k.e, true)).b(jsonReader, c9028hp);
                } else if (a == 3) {
                    fVar = (AU.f) C8953gT.d(C8953gT.a(o.d, true)).b(jsonReader, c9028hp);
                } else if (a == 4) {
                    iVar = (AU.i) C8953gT.d(C8953gT.a(j.e, true)).b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    rVar = (AU.r) C8953gT.d(C8953gT.a(p.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new AU.n(str, sVar, kVar, fVar, iVar, rVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.n nVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) nVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, nVar.g());
            interfaceC9069id.e("xs");
            C8953gT.d(C8953gT.a(u.e, true)).e(interfaceC9069id, c9028hp, nVar.b());
            interfaceC9069id.e("s");
            C8953gT.d(C8953gT.a(k.e, true)).e(interfaceC9069id, c9028hp, nVar.c());
            interfaceC9069id.e("m");
            C8953gT.d(C8953gT.a(o.d, true)).e(interfaceC9069id, c9028hp, nVar.d());
            interfaceC9069id.e("l");
            C8953gT.d(C8953gT.a(j.e, true)).e(interfaceC9069id, c9028hp, nVar.a());
            interfaceC9069id.e("xl");
            C8953gT.d(C8953gT.a(p.c, true)).e(interfaceC9069id, c9028hp, nVar.e());
        }
    }

    /* renamed from: o.Ba$u */
    /* loaded from: classes2.dex */
    public static final class u implements InterfaceC8949gP<AU.s> {
        private static final List<String> b;
        public static final int c;
        public static final u e = new u();

        private u() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public AU.s b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BK b2 = BI.b.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new AU.s(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.s sVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) sVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, sVar.d());
            BI.b.e.e(interfaceC9069id, c9028hp, sVar.e());
        }
    }

    /* renamed from: o.Ba$k */
    /* loaded from: classes2.dex */
    public static final class k implements InterfaceC8949gP<AU.k> {
        private static final List<String> a;
        public static final int d;
        public static final k e = new k();

        private k() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            a = e2;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public AU.k b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BK b = BI.b.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new AU.k(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.k kVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) kVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, kVar.d());
            BI.b.e.e(interfaceC9069id, c9028hp, kVar.c());
        }
    }

    /* renamed from: o.Ba$o */
    /* loaded from: classes2.dex */
    public static final class o implements InterfaceC8949gP<AU.f> {
        private static final List<String> b;
        public static final o d = new o();
        public static final int e;

        private o() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public AU.f b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BK b2 = BI.b.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new AU.f(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, fVar.d());
            BI.b.e.e(interfaceC9069id, c9028hp, fVar.e());
        }
    }

    /* renamed from: o.Ba$j */
    /* loaded from: classes2.dex */
    public static final class j implements InterfaceC8949gP<AU.i> {
        private static final List<String> b;
        public static final int c;
        public static final j e = new j();

        private j() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public AU.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BK b2 = BI.b.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new AU.i(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.d());
            BI.b.e.e(interfaceC9069id, c9028hp, iVar.a());
        }
    }

    /* renamed from: o.Ba$p */
    /* loaded from: classes2.dex */
    public static final class p implements InterfaceC8949gP<AU.r> {
        private static final List<String> b;
        public static final p c = new p();
        public static final int e;

        private p() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public AU.r b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BK b2 = BI.b.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new AU.r(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.r rVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) rVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, rVar.d());
            BI.b.e.e(interfaceC9069id, c9028hp, rVar.e());
        }
    }

    /* renamed from: o.Ba$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<AU.c> {
        public static final c a = new c();
        private static final List<String> d;
        public static final int e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            d = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public AU.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AW b = AX.a.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new AU.c(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            AX.a.e.e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    /* renamed from: o.Ba$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<AU.a> {
        public static final int c;
        private static final List<String> d;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            d = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public AU.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AW b = AX.a.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new AU.a(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            AX.a.e.e(interfaceC9069id, c9028hp, aVar.a());
        }
    }

    /* renamed from: o.Ba$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<AU.e> {
        public static final int a;
        private static final List<String> c;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "top", "bottom", "start", "end");
            c = j;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public AU.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            AU.p pVar = null;
            AU.b bVar = null;
            AU.m mVar = null;
            AU.h hVar = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    pVar = (AU.p) C8953gT.d(C8953gT.a(t.e, true)).b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    bVar = (AU.b) C8953gT.d(C8953gT.a(d.c, true)).b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    mVar = (AU.m) C8953gT.d(C8953gT.a(r.e, true)).b(jsonReader, c9028hp);
                } else if (a2 != 4) {
                    break;
                } else {
                    hVar = (AU.h) C8953gT.d(C8953gT.a(h.e, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new AU.e(str, pVar, bVar, mVar, hVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e("top");
            C8953gT.d(C8953gT.a(t.e, true)).e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("bottom");
            C8953gT.d(C8953gT.a(d.c, true)).e(interfaceC9069id, c9028hp, eVar.d());
            interfaceC9069id.e("start");
            C8953gT.d(C8953gT.a(r.e, true)).e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("end");
            C8953gT.d(C8953gT.a(h.e, true)).e(interfaceC9069id, c9028hp, eVar.e());
        }
    }

    /* renamed from: o.Ba$t */
    /* loaded from: classes2.dex */
    public static final class t implements InterfaceC8949gP<AU.p> {
        public static final int c;
        private static final List<String> d;
        public static final t e = new t();

        private t() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            d = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public AU.p b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AK b = AN.d.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new AU.p(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.p pVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) pVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, pVar.b());
            AN.d.b.e(interfaceC9069id, c9028hp, pVar.a());
        }
    }

    /* renamed from: o.Ba$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<AU.b> {
        public static final d c = new d();
        private static final List<String> d;
        public static final int e;

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            d = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public AU.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AK b = AN.d.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new AU.b(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            AN.d.b.e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* renamed from: o.Ba$r */
    /* loaded from: classes2.dex */
    public static final class r implements InterfaceC8949gP<AU.m> {
        private static final List<String> a;
        public static final int b;
        public static final r e = new r();

        private r() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            a = e2;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public AU.m b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AK b2 = AN.d.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new AU.m(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.m mVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) mVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, mVar.c());
            AN.d.b.e(interfaceC9069id, c9028hp, mVar.e());
        }
    }

    /* renamed from: o.Ba$h */
    /* loaded from: classes2.dex */
    public static final class h implements InterfaceC8949gP<AU.h> {
        public static final int a;
        private static final List<String> b;
        public static final h e = new h();

        private h() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public AU.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AK b2 = AN.d.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new AU.h(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.b());
            AN.d.b.e(interfaceC9069id, c9028hp, hVar.c());
        }
    }

    /* renamed from: o.Ba$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<AU.d> {
        private static final List<String> a;
        public static final int c;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "topStart", "topEnd", "bottomStart", "bottomEnd");
            a = j;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public AU.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            AU.t tVar = null;
            AU.q qVar = null;
            AU.g gVar = null;
            AU.j jVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    tVar = (AU.t) C8953gT.d(C8953gT.a(q.e, true)).b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    qVar = (AU.q) C8953gT.d(C8953gT.a(s.a, true)).b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    gVar = (AU.g) C8953gT.d(C8953gT.a(g.d, true)).b(jsonReader, c9028hp);
                } else if (a2 != 4) {
                    break;
                } else {
                    jVar = (AU.j) C8953gT.d(C8953gT.a(i.a, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new AU.d(str, tVar, qVar, gVar, jVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e("topStart");
            C8953gT.d(C8953gT.a(q.e, true)).e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("topEnd");
            C8953gT.d(C8953gT.a(s.a, true)).e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e("bottomStart");
            C8953gT.d(C8953gT.a(g.d, true)).e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("bottomEnd");
            C8953gT.d(C8953gT.a(i.a, true)).e(interfaceC9069id, c9028hp, dVar.a());
        }
    }

    /* renamed from: o.Ba$q */
    /* loaded from: classes2.dex */
    public static final class q implements InterfaceC8949gP<AU.t> {
        private static final List<String> b;
        public static final int c;
        public static final q e = new q();

        private q() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public AU.t b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AL b2 = AO.d.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new AU.t(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.t tVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) tVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, tVar.c());
            AO.d.e.e(interfaceC9069id, c9028hp, tVar.e());
        }
    }

    /* renamed from: o.Ba$s */
    /* loaded from: classes2.dex */
    public static final class s implements InterfaceC8949gP<AU.q> {
        public static final s a = new s();
        private static final List<String> b;
        public static final int c;

        private s() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public AU.q b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AL b2 = AO.d.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new AU.q(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.q qVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) qVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, qVar.c());
            AO.d.e.e(interfaceC9069id, c9028hp, qVar.e());
        }
    }

    /* renamed from: o.Ba$g */
    /* loaded from: classes2.dex */
    public static final class g implements InterfaceC8949gP<AU.g> {
        public static final int b;
        public static final g d = new g();
        private static final List<String> e;

        private g() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public AU.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AL b2 = AO.d.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new AU.g(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.a());
            AO.d.e.e(interfaceC9069id, c9028hp, gVar.c());
        }
    }

    /* renamed from: o.Ba$i */
    /* loaded from: classes2.dex */
    public static final class i implements InterfaceC8949gP<AU.j> {
        public static final i a = new i();
        public static final int c;
        private static final List<String> e;

        private i() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public AU.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AL b = AO.d.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new AU.j(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AU.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.d());
            AO.d.e.e(interfaceC9069id, c9028hp, jVar.e());
        }
    }
}
