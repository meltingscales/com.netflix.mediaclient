package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSTextAlignment;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AX;
import o.BF;
import o.BH;
import o.C0777Ce;
import o.C0780Ch;

/* renamed from: o.Cc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0775Cc {
    public static final C0775Cc e = new C0775Cc();

    /* renamed from: o.Cc$f */
    /* loaded from: classes2.dex */
    public static final class f implements InterfaceC8949gP<C0777Ce> {
        private static final List<String> b;
        public static final int d;
        public static final f e = new f();

        private f() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "accessibilityDescription", "typography", "typographyResponsive", "color", "alignment", "alignmentResponsive", "plainContent", "richContent");
            b = j;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0777Ce b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C0777Ce.c cVar = null;
            C0777Ce.g gVar = null;
            C0777Ce.j jVar = null;
            C0777Ce.b bVar = null;
            CLCSTextAlignment cLCSTextAlignment = null;
            C0777Ce.e eVar = null;
            C0777Ce.h hVar = null;
            C0777Ce.f fVar = null;
            while (true) {
                switch (jsonReader.a(b)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        cVar = (C0777Ce.c) C8953gT.d(C8953gT.a(e.b, true)).b(jsonReader, c9028hp);
                        break;
                    case 2:
                        gVar = (C0777Ce.g) C8953gT.d(C8953gT.a(h.e, true)).b(jsonReader, c9028hp);
                        break;
                    case 3:
                        jVar = (C0777Ce.j) C8953gT.d(C8953gT.c(o.e, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 4:
                        bVar = (C0777Ce.b) C8953gT.d(C8953gT.a(b.b, true)).b(jsonReader, c9028hp);
                        break;
                    case 5:
                        cLCSTextAlignment = (CLCSTextAlignment) C8953gT.d(C0865Fo.d).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        eVar = (C0777Ce.e) C8953gT.d(C8953gT.c(d.a, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 7:
                        hVar = (C0777Ce.h) C8953gT.d(C8953gT.a(j.c, true)).b(jsonReader, c9028hp);
                        break;
                    case 8:
                        fVar = (C0777Ce.f) C8953gT.d(C8953gT.a(g.e, true)).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str != null) {
                            return new C0777Ce(str, cVar, gVar, jVar, bVar, cLCSTextAlignment, eVar, hVar, fVar);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0777Ce c0777Ce) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c0777Ce, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c0777Ce.g());
            interfaceC9069id.e("accessibilityDescription");
            C8953gT.d(C8953gT.a(e.b, true)).e(interfaceC9069id, c9028hp, c0777Ce.e());
            interfaceC9069id.e("typography");
            C8953gT.d(C8953gT.a(h.e, true)).e(interfaceC9069id, c9028hp, c0777Ce.i());
            interfaceC9069id.e("typographyResponsive");
            C8953gT.d(C8953gT.c(o.e, false, 1, null)).e(interfaceC9069id, c9028hp, c0777Ce.j());
            interfaceC9069id.e("color");
            C8953gT.d(C8953gT.a(b.b, true)).e(interfaceC9069id, c9028hp, c0777Ce.a());
            interfaceC9069id.e("alignment");
            C8953gT.d(C0865Fo.d).e(interfaceC9069id, c9028hp, c0777Ce.d());
            interfaceC9069id.e("alignmentResponsive");
            C8953gT.d(C8953gT.c(d.a, false, 1, null)).e(interfaceC9069id, c9028hp, c0777Ce.b());
            interfaceC9069id.e("plainContent");
            C8953gT.d(C8953gT.a(j.c, true)).e(interfaceC9069id, c9028hp, c0777Ce.c());
            interfaceC9069id.e("richContent");
            C8953gT.d(C8953gT.a(g.e, true)).e(interfaceC9069id, c9028hp, c0777Ce.f());
        }
    }

    private C0775Cc() {
    }

    /* renamed from: o.Cc$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<C0777Ce.c> {
        public static final e b = new e();
        private static final List<String> c;
        public static final int d;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0777Ce.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b2 = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0777Ce.c(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0777Ce.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            BH.b.d.e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    /* renamed from: o.Cc$h */
    /* loaded from: classes2.dex */
    public static final class h implements InterfaceC8949gP<C0777Ce.g> {
        private static final List<String> c;
        public static final int d;
        public static final h e = new h();

        private h() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0777Ce.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0779Cg b = C0780Ch.c.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0777Ce.g(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0777Ce.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.b());
            C0780Ch.c.b.e(interfaceC9069id, c9028hp, gVar.e());
        }
    }

    /* renamed from: o.Cc$o */
    /* loaded from: classes2.dex */
    public static final class o implements InterfaceC8949gP<C0777Ce.j> {
        private static final List<String> a;
        public static final int c;
        public static final o e = new o();

        private o() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "xs", "s", "m", "l", "xl");
            a = j;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0777Ce.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C0777Ce.o oVar = null;
            C0777Ce.i iVar = null;
            C0777Ce.d dVar = null;
            C0777Ce.a aVar = null;
            C0777Ce.k kVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    oVar = (C0777Ce.o) C8953gT.d(C8953gT.a(m.c, true)).b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    iVar = (C0777Ce.i) C8953gT.d(C8953gT.a(i.a, true)).b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    dVar = (C0777Ce.d) C8953gT.d(C8953gT.a(c.b, true)).b(jsonReader, c9028hp);
                } else if (a2 == 4) {
                    aVar = (C0777Ce.a) C8953gT.d(C8953gT.a(a.b, true)).b(jsonReader, c9028hp);
                } else if (a2 != 5) {
                    break;
                } else {
                    kVar = (C0777Ce.k) C8953gT.d(C8953gT.a(n.b, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C0777Ce.j(str, oVar, iVar, dVar, aVar, kVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0777Ce.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.j());
            interfaceC9069id.e("xs");
            C8953gT.d(C8953gT.a(m.c, true)).e(interfaceC9069id, c9028hp, jVar.a());
            interfaceC9069id.e("s");
            C8953gT.d(C8953gT.a(i.a, true)).e(interfaceC9069id, c9028hp, jVar.c());
            interfaceC9069id.e("m");
            C8953gT.d(C8953gT.a(c.b, true)).e(interfaceC9069id, c9028hp, jVar.b());
            interfaceC9069id.e("l");
            C8953gT.d(C8953gT.a(a.b, true)).e(interfaceC9069id, c9028hp, jVar.e());
            interfaceC9069id.e("xl");
            C8953gT.d(C8953gT.a(n.b, true)).e(interfaceC9069id, c9028hp, jVar.d());
        }
    }

    /* renamed from: o.Cc$m */
    /* loaded from: classes2.dex */
    public static final class m implements InterfaceC8949gP<C0777Ce.o> {
        public static final m c = new m();
        private static final List<String> d;
        public static final int e;

        private m() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            d = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0777Ce.o b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0779Cg b = C0780Ch.c.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0777Ce.o(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0777Ce.o oVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) oVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, oVar.d());
            C0780Ch.c.b.e(interfaceC9069id, c9028hp, oVar.c());
        }
    }

    /* renamed from: o.Cc$i */
    /* loaded from: classes2.dex */
    public static final class i implements InterfaceC8949gP<C0777Ce.i> {
        public static final i a = new i();
        private static final List<String> b;
        public static final int c;

        private i() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0777Ce.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0779Cg b2 = C0780Ch.c.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0777Ce.i(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0777Ce.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.e());
            C0780Ch.c.b.e(interfaceC9069id, c9028hp, iVar.a());
        }
    }

    /* renamed from: o.Cc$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<C0777Ce.d> {
        private static final List<String> a;
        public static final c b = new c();
        public static final int e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            a = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0777Ce.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0779Cg b2 = C0780Ch.c.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0777Ce.d(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0777Ce.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.c());
            C0780Ch.c.b.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    /* renamed from: o.Cc$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<C0777Ce.a> {
        private static final List<String> a;
        public static final a b = new a();
        public static final int e;

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            a = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0777Ce.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0779Cg b2 = C0780Ch.c.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0777Ce.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0777Ce.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.e());
            C0780Ch.c.b.e(interfaceC9069id, c9028hp, aVar.d());
        }
    }

    /* renamed from: o.Cc$n */
    /* loaded from: classes2.dex */
    public static final class n implements InterfaceC8949gP<C0777Ce.k> {
        public static final n b = new n();
        public static final int d;
        private static final List<String> e;

        private n() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0777Ce.k b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0779Cg b2 = C0780Ch.c.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0777Ce.k(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0777Ce.k kVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) kVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, kVar.b());
            C0780Ch.c.b.e(interfaceC9069id, c9028hp, kVar.a());
        }
    }

    /* renamed from: o.Cc$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<C0777Ce.b> {
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
        /* renamed from: c */
        public C0777Ce.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AW b2 = AX.a.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0777Ce.b(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0777Ce.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            AX.a.e.e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    /* renamed from: o.Cc$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<C0777Ce.e> {
        public static final d a = new d();
        public static final int d;
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "xs", "s", "m", "l", "xl");
            e = j;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0777Ce.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            CLCSTextAlignment cLCSTextAlignment = null;
            CLCSTextAlignment cLCSTextAlignment2 = null;
            CLCSTextAlignment cLCSTextAlignment3 = null;
            CLCSTextAlignment cLCSTextAlignment4 = null;
            CLCSTextAlignment cLCSTextAlignment5 = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    cLCSTextAlignment = (CLCSTextAlignment) C8953gT.d(C0865Fo.d).b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    cLCSTextAlignment2 = (CLCSTextAlignment) C8953gT.d(C0865Fo.d).b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    cLCSTextAlignment3 = (CLCSTextAlignment) C8953gT.d(C0865Fo.d).b(jsonReader, c9028hp);
                } else if (a2 == 4) {
                    cLCSTextAlignment4 = (CLCSTextAlignment) C8953gT.d(C0865Fo.d).b(jsonReader, c9028hp);
                } else if (a2 != 5) {
                    break;
                } else {
                    cLCSTextAlignment5 = (CLCSTextAlignment) C8953gT.d(C0865Fo.d).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C0777Ce.e(str, cLCSTextAlignment, cLCSTextAlignment2, cLCSTextAlignment3, cLCSTextAlignment4, cLCSTextAlignment5);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0777Ce.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.g());
            interfaceC9069id.e("xs");
            C0865Fo c0865Fo = C0865Fo.d;
            C8953gT.d(c0865Fo).e(interfaceC9069id, c9028hp, eVar.e());
            interfaceC9069id.e("s");
            C8953gT.d(c0865Fo).e(interfaceC9069id, c9028hp, eVar.d());
            interfaceC9069id.e("m");
            C8953gT.d(c0865Fo).e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("l");
            C8953gT.d(c0865Fo).e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("xl");
            C8953gT.d(c0865Fo).e(interfaceC9069id, c9028hp, eVar.a());
        }
    }

    /* renamed from: o.Cc$j */
    /* loaded from: classes2.dex */
    public static final class j implements InterfaceC8949gP<C0777Ce.h> {
        private static final List<String> b;
        public static final j c = new j();
        public static final int d;

        private j() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0777Ce.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b2 = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0777Ce.h(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0777Ce.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.a());
            BH.b.d.e(interfaceC9069id, c9028hp, hVar.d());
        }
    }

    /* renamed from: o.Cc$g */
    /* loaded from: classes2.dex */
    public static final class g implements InterfaceC8949gP<C0777Ce.f> {
        public static final int a;
        private static final List<String> d;
        public static final g e = new g();

        private g() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            d = e2;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0777Ce.f b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BB b = BF.e.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0777Ce.f(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0777Ce.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, fVar.b());
            BF.e.a.e(interfaceC9069id, c9028hp, fVar.c());
        }
    }
}
