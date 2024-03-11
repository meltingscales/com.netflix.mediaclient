package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSItemAlignment;
import com.netflix.clcs.codegen.type.CLCSLayoutDirection;
import com.netflix.clcs.codegen.type.CLCSStackContentJustification;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AZ;
import o.BA;
import o.C0745Ba;
import o.C0773Ca;

/* renamed from: o.Bz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0770Bz {
    public static final C0770Bz d = new C0770Bz();

    /* renamed from: o.Bz$i */
    /* loaded from: classes2.dex */
    public static final class i implements InterfaceC8949gP<BA> {
        public static final int b;
        private static final List<String> c;
        public static final i d = new i();

        private i() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "direction", "directionResponsive", "contentJustification", "contentJustificationResponsive", "itemAlignment", "itemAlignmentResponsive", "template", "templateResponsive", "columnSpacing", "columnSpacingResponsive", "rowSpacing", "rowSpacingResponsive", "style", "children");
            c = j;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BA b(JsonReader jsonReader, C9028hp c9028hp) {
            BA.l lVar;
            BA.e eVar;
            BA.e eVar2;
            BA.e eVar3;
            BA.l lVar2;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            CLCSLayoutDirection cLCSLayoutDirection = null;
            BA.d dVar = null;
            CLCSStackContentJustification cLCSStackContentJustification = null;
            BA.b bVar = null;
            CLCSItemAlignment cLCSItemAlignment = null;
            BA.g gVar = null;
            List list = null;
            BA.q qVar = null;
            BA.c cVar = null;
            BA.e eVar4 = null;
            BA.l lVar3 = null;
            BA.n nVar = null;
            BA.t tVar = null;
            List list2 = null;
            while (true) {
                switch (jsonReader.a(c)) {
                    case 0:
                        lVar = lVar3;
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        lVar3 = lVar;
                        break;
                    case 1:
                        eVar3 = eVar4;
                        lVar2 = lVar3;
                        cLCSLayoutDirection = (CLCSLayoutDirection) C8953gT.d(C0852Fb.c).b(jsonReader, c9028hp);
                        lVar3 = lVar2;
                        eVar4 = eVar3;
                        break;
                    case 2:
                        eVar = eVar4;
                        lVar = lVar3;
                        dVar = (BA.d) C8953gT.d(C8953gT.c(e.d, false, 1, null)).b(jsonReader, c9028hp);
                        eVar4 = eVar;
                        lVar3 = lVar;
                        break;
                    case 3:
                        eVar3 = eVar4;
                        lVar2 = lVar3;
                        cLCSStackContentJustification = (CLCSStackContentJustification) C8953gT.d(C0860Fj.e).b(jsonReader, c9028hp);
                        lVar3 = lVar2;
                        eVar4 = eVar3;
                        break;
                    case 4:
                        eVar = eVar4;
                        lVar = lVar3;
                        bVar = (BA.b) C8953gT.d(C8953gT.c(C0772c.e, false, 1, null)).b(jsonReader, c9028hp);
                        eVar4 = eVar;
                        lVar3 = lVar;
                        break;
                    case 5:
                        eVar3 = eVar4;
                        lVar2 = lVar3;
                        cLCSItemAlignment = (CLCSItemAlignment) C8953gT.d(C0855Fe.e).b(jsonReader, c9028hp);
                        lVar3 = lVar2;
                        eVar4 = eVar3;
                        break;
                    case 6:
                        eVar = eVar4;
                        lVar = lVar3;
                        gVar = (BA.g) C8953gT.d(C8953gT.c(j.e, false, 1, null)).b(jsonReader, c9028hp);
                        eVar4 = eVar;
                        lVar3 = lVar;
                        break;
                    case 7:
                        list = (List) C8953gT.d(C8953gT.a(C8953gT.a(s.c, true))).b(jsonReader, c9028hp);
                        break;
                    case 8:
                        eVar2 = eVar4;
                        lVar = lVar3;
                        qVar = (BA.q) C8953gT.d(C8953gT.c(w.e, false, 1, null)).b(jsonReader, c9028hp);
                        eVar4 = eVar2;
                        lVar3 = lVar;
                        break;
                    case 9:
                        cVar = (BA.c) C8953gT.d(C8953gT.a(C0771a.c, true)).b(jsonReader, c9028hp);
                        break;
                    case 10:
                        lVar = lVar3;
                        eVar4 = (BA.e) C8953gT.d(C8953gT.c(d.b, false, 1, null)).b(jsonReader, c9028hp);
                        lVar3 = lVar;
                        break;
                    case 11:
                        lVar3 = (BA.l) C8953gT.d(C8953gT.a(m.b, true)).b(jsonReader, c9028hp);
                        break;
                    case 12:
                        eVar2 = eVar4;
                        lVar = lVar3;
                        nVar = (BA.n) C8953gT.d(C8953gT.c(k.c, false, 1, null)).b(jsonReader, c9028hp);
                        eVar4 = eVar2;
                        lVar3 = lVar;
                        break;
                    case 13:
                        eVar3 = eVar4;
                        lVar2 = lVar3;
                        tVar = (BA.t) C8953gT.d(C8953gT.a(p.e, true)).b(jsonReader, c9028hp);
                        lVar3 = lVar2;
                        eVar4 = eVar3;
                        break;
                    case 14:
                        eVar = eVar4;
                        lVar = lVar3;
                        list2 = C8953gT.a(C8953gT.c(b.e, false, 1, null)).b(jsonReader, c9028hp);
                        eVar4 = eVar;
                        lVar3 = lVar;
                        break;
                    default:
                        BA.e eVar5 = eVar4;
                        BA.l lVar4 = lVar3;
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (list2 != null) {
                            return new BA(str, cLCSLayoutDirection, dVar, cLCSStackContentJustification, bVar, cLCSItemAlignment, gVar, list, qVar, cVar, eVar5, lVar4, nVar, tVar, list2);
                        } else {
                            C8956gW.a(jsonReader, "children");
                            throw new KotlinNothingValueException();
                        }
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA ba) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) ba, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, ba.l());
            interfaceC9069id.e("direction");
            C8953gT.d(C0852Fb.c).e(interfaceC9069id, c9028hp, ba.h());
            interfaceC9069id.e("directionResponsive");
            C8953gT.d(C8953gT.c(e.d, false, 1, null)).e(interfaceC9069id, c9028hp, ba.i());
            interfaceC9069id.e("contentJustification");
            C8953gT.d(C0860Fj.e).e(interfaceC9069id, c9028hp, ba.c());
            interfaceC9069id.e("contentJustificationResponsive");
            C8953gT.d(C8953gT.c(C0772c.e, false, 1, null)).e(interfaceC9069id, c9028hp, ba.b());
            interfaceC9069id.e("itemAlignment");
            C8953gT.d(C0855Fe.e).e(interfaceC9069id, c9028hp, ba.j());
            interfaceC9069id.e("itemAlignmentResponsive");
            C8953gT.d(C8953gT.c(j.e, false, 1, null)).e(interfaceC9069id, c9028hp, ba.f());
            interfaceC9069id.e("template");
            C8953gT.d(C8953gT.a(C8953gT.a(s.c, true))).e(interfaceC9069id, c9028hp, ba.k());
            interfaceC9069id.e("templateResponsive");
            C8953gT.d(C8953gT.c(w.e, false, 1, null)).e(interfaceC9069id, c9028hp, ba.n());
            interfaceC9069id.e("columnSpacing");
            C8953gT.d(C8953gT.a(C0771a.c, true)).e(interfaceC9069id, c9028hp, ba.d());
            interfaceC9069id.e("columnSpacingResponsive");
            C8953gT.d(C8953gT.c(d.b, false, 1, null)).e(interfaceC9069id, c9028hp, ba.a());
            interfaceC9069id.e("rowSpacing");
            C8953gT.d(C8953gT.a(m.b, true)).e(interfaceC9069id, c9028hp, ba.g());
            interfaceC9069id.e("rowSpacingResponsive");
            C8953gT.d(C8953gT.c(k.c, false, 1, null)).e(interfaceC9069id, c9028hp, ba.o());
            interfaceC9069id.e("style");
            C8953gT.d(C8953gT.a(p.e, true)).e(interfaceC9069id, c9028hp, ba.m());
            interfaceC9069id.e("children");
            C8953gT.a(C8953gT.c(b.e, false, 1, null)).e(interfaceC9069id, c9028hp, ba.e());
        }
    }

    private C0770Bz() {
    }

    /* renamed from: o.Bz$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<BA.d> {
        public static final int a;
        private static final List<String> c;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "xs", "s", "m", "l", "xl");
            c = j;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BA.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            CLCSLayoutDirection cLCSLayoutDirection = null;
            CLCSLayoutDirection cLCSLayoutDirection2 = null;
            CLCSLayoutDirection cLCSLayoutDirection3 = null;
            CLCSLayoutDirection cLCSLayoutDirection4 = null;
            CLCSLayoutDirection cLCSLayoutDirection5 = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    cLCSLayoutDirection = (CLCSLayoutDirection) C8953gT.d(C0852Fb.c).b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    cLCSLayoutDirection2 = (CLCSLayoutDirection) C8953gT.d(C0852Fb.c).b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    cLCSLayoutDirection3 = (CLCSLayoutDirection) C8953gT.d(C0852Fb.c).b(jsonReader, c9028hp);
                } else if (a2 == 4) {
                    cLCSLayoutDirection4 = (CLCSLayoutDirection) C8953gT.d(C0852Fb.c).b(jsonReader, c9028hp);
                } else if (a2 != 5) {
                    break;
                } else {
                    cLCSLayoutDirection5 = (CLCSLayoutDirection) C8953gT.d(C0852Fb.c).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new BA.d(str, cLCSLayoutDirection, cLCSLayoutDirection2, cLCSLayoutDirection3, cLCSLayoutDirection4, cLCSLayoutDirection5);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.g());
            interfaceC9069id.e("xs");
            C0852Fb c0852Fb = C0852Fb.c;
            C8953gT.d(c0852Fb).e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("s");
            C8953gT.d(c0852Fb).e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e("m");
            C8953gT.d(c0852Fb).e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("l");
            C8953gT.d(c0852Fb).e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e("xl");
            C8953gT.d(c0852Fb).e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    /* renamed from: o.Bz$c  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C0772c implements InterfaceC8949gP<BA.b> {
        private static final List<String> a;
        public static final int d;
        public static final C0772c e = new C0772c();

        private C0772c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "xs", "s", "m", "l", "xl");
            a = j;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BA.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            CLCSStackContentJustification cLCSStackContentJustification = null;
            CLCSStackContentJustification cLCSStackContentJustification2 = null;
            CLCSStackContentJustification cLCSStackContentJustification3 = null;
            CLCSStackContentJustification cLCSStackContentJustification4 = null;
            CLCSStackContentJustification cLCSStackContentJustification5 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    cLCSStackContentJustification = (CLCSStackContentJustification) C8953gT.d(C0860Fj.e).b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    cLCSStackContentJustification2 = (CLCSStackContentJustification) C8953gT.d(C0860Fj.e).b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    cLCSStackContentJustification3 = (CLCSStackContentJustification) C8953gT.d(C0860Fj.e).b(jsonReader, c9028hp);
                } else if (a2 == 4) {
                    cLCSStackContentJustification4 = (CLCSStackContentJustification) C8953gT.d(C0860Fj.e).b(jsonReader, c9028hp);
                } else if (a2 != 5) {
                    break;
                } else {
                    cLCSStackContentJustification5 = (CLCSStackContentJustification) C8953gT.d(C0860Fj.e).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new BA.b(str, cLCSStackContentJustification, cLCSStackContentJustification2, cLCSStackContentJustification3, cLCSStackContentJustification4, cLCSStackContentJustification5);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.f());
            interfaceC9069id.e("xs");
            C0860Fj c0860Fj = C0860Fj.e;
            C8953gT.d(c0860Fj).e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e("s");
            C8953gT.d(c0860Fj).e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e("m");
            C8953gT.d(c0860Fj).e(interfaceC9069id, c9028hp, bVar.c());
            interfaceC9069id.e("l");
            C8953gT.d(c0860Fj).e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("xl");
            C8953gT.d(c0860Fj).e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    /* renamed from: o.Bz$j */
    /* loaded from: classes2.dex */
    public static final class j implements InterfaceC8949gP<BA.g> {
        private static final List<String> a;
        public static final int c;
        public static final j e = new j();

        private j() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "xs", "s", "m", "l", "xl");
            a = j;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BA.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            CLCSItemAlignment cLCSItemAlignment = null;
            CLCSItemAlignment cLCSItemAlignment2 = null;
            CLCSItemAlignment cLCSItemAlignment3 = null;
            CLCSItemAlignment cLCSItemAlignment4 = null;
            CLCSItemAlignment cLCSItemAlignment5 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    cLCSItemAlignment = (CLCSItemAlignment) C8953gT.d(C0855Fe.e).b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    cLCSItemAlignment2 = (CLCSItemAlignment) C8953gT.d(C0855Fe.e).b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    cLCSItemAlignment3 = (CLCSItemAlignment) C8953gT.d(C0855Fe.e).b(jsonReader, c9028hp);
                } else if (a2 == 4) {
                    cLCSItemAlignment4 = (CLCSItemAlignment) C8953gT.d(C0855Fe.e).b(jsonReader, c9028hp);
                } else if (a2 != 5) {
                    break;
                } else {
                    cLCSItemAlignment5 = (CLCSItemAlignment) C8953gT.d(C0855Fe.e).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new BA.g(str, cLCSItemAlignment, cLCSItemAlignment2, cLCSItemAlignment3, cLCSItemAlignment4, cLCSItemAlignment5);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.g());
            interfaceC9069id.e("xs");
            C0855Fe c0855Fe = C0855Fe.e;
            C8953gT.d(c0855Fe).e(interfaceC9069id, c9028hp, gVar.a());
            interfaceC9069id.e("s");
            C8953gT.d(c0855Fe).e(interfaceC9069id, c9028hp, gVar.d());
            interfaceC9069id.e("m");
            C8953gT.d(c0855Fe).e(interfaceC9069id, c9028hp, gVar.e());
            interfaceC9069id.e("l");
            C8953gT.d(c0855Fe).e(interfaceC9069id, c9028hp, gVar.c());
            interfaceC9069id.e("xl");
            C8953gT.d(c0855Fe).e(interfaceC9069id, c9028hp, gVar.b());
        }
    }

    /* renamed from: o.Bz$s */
    /* loaded from: classes2.dex */
    public static final class s implements InterfaceC8949gP<BA.p> {
        private static final List<String> a;
        public static final int b;
        public static final s c = new s();

        private s() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BA.p b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BX b2 = C0773Ca.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.p(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.p pVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) pVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, pVar.a());
            C0773Ca.d.a.e(interfaceC9069id, c9028hp, pVar.d());
        }
    }

    /* renamed from: o.Bz$w */
    /* loaded from: classes2.dex */
    public static final class w implements InterfaceC8949gP<BA.q> {
        private static final List<String> c;
        public static final int d;
        public static final w e = new w();

        private w() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "xs", "small", "m", "l", "xl");
            c = j;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BA.q b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            List list2 = null;
            List list3 = null;
            List list4 = null;
            List list5 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.a(v.c, true))).b(jsonReader, c9028hp);
                } else if (a == 2) {
                    list2 = (List) C8953gT.d(C8953gT.a(C8953gT.a(r.b, true))).b(jsonReader, c9028hp);
                } else if (a == 3) {
                    list3 = (List) C8953gT.d(C8953gT.a(C8953gT.a(n.e, true))).b(jsonReader, c9028hp);
                } else if (a == 4) {
                    list4 = (List) C8953gT.d(C8953gT.a(C8953gT.a(g.a, true))).b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    list5 = (List) C8953gT.d(C8953gT.a(C8953gT.a(x.b, true))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new BA.q(str, list, list2, list3, list4, list5);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.q qVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) qVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, qVar.j());
            interfaceC9069id.e("xs");
            C8953gT.d(C8953gT.a(C8953gT.a(v.c, true))).e(interfaceC9069id, c9028hp, qVar.b());
            interfaceC9069id.e("small");
            C8953gT.d(C8953gT.a(C8953gT.a(r.b, true))).e(interfaceC9069id, c9028hp, qVar.a());
            interfaceC9069id.e("m");
            C8953gT.d(C8953gT.a(C8953gT.a(n.e, true))).e(interfaceC9069id, c9028hp, qVar.d());
            interfaceC9069id.e("l");
            C8953gT.d(C8953gT.a(C8953gT.a(g.a, true))).e(interfaceC9069id, c9028hp, qVar.c());
            interfaceC9069id.e("xl");
            C8953gT.d(C8953gT.a(C8953gT.a(x.b, true))).e(interfaceC9069id, c9028hp, qVar.e());
        }
    }

    /* renamed from: o.Bz$v */
    /* loaded from: classes2.dex */
    public static final class v implements InterfaceC8949gP<BA.y> {
        public static final int a;
        private static final List<String> b;
        public static final v c = new v();

        private v() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BA.y b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BX b2 = C0773Ca.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.y(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.y yVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) yVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, yVar.d());
            C0773Ca.d.a.e(interfaceC9069id, c9028hp, yVar.b());
        }
    }

    /* renamed from: o.Bz$r */
    /* loaded from: classes2.dex */
    public static final class r implements InterfaceC8949gP<BA.s> {
        public static final int a;
        public static final r b = new r();
        private static final List<String> e;

        private r() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BA.s b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BX b2 = C0773Ca.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.s(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.s sVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) sVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, sVar.e());
            C0773Ca.d.a.e(interfaceC9069id, c9028hp, sVar.d());
        }
    }

    /* renamed from: o.Bz$n */
    /* loaded from: classes2.dex */
    public static final class n implements InterfaceC8949gP<BA.h> {
        public static final int a;
        private static final List<String> b;
        public static final n e = new n();

        private n() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BA.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BX b2 = C0773Ca.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.h(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.d());
            C0773Ca.d.a.e(interfaceC9069id, c9028hp, hVar.c());
        }
    }

    /* renamed from: o.Bz$g */
    /* loaded from: classes2.dex */
    public static final class g implements InterfaceC8949gP<BA.f> {
        public static final g a = new g();
        private static final List<String> c;
        public static final int e;

        private g() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public BA.f b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BX b = C0773Ca.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.f(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, fVar.e());
            C0773Ca.d.a.e(interfaceC9069id, c9028hp, fVar.c());
        }
    }

    /* renamed from: o.Bz$x */
    /* loaded from: classes2.dex */
    public static final class x implements InterfaceC8949gP<BA.v> {
        public static final x b = new x();
        private static final List<String> c;
        public static final int e;

        private x() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BA.v b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BX b2 = C0773Ca.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.v(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.v vVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) vVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, vVar.b());
            C0773Ca.d.a.e(interfaceC9069id, c9028hp, vVar.e());
        }
    }

    /* renamed from: o.Bz$a  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C0771a implements InterfaceC8949gP<BA.c> {
        public static final int b;
        public static final C0771a c = new C0771a();
        private static final List<String> e;

        private C0771a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BA.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b2 = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.c(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.c());
            AZ.c.d.e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    /* renamed from: o.Bz$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<BA.e> {
        public static final d b = new d();
        private static final List<String> c;
        public static final int d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "xs", "s", "m", "l", "xl");
            c = j;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BA.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            BA.x xVar = null;
            BA.k kVar = null;
            BA.o oVar = null;
            BA.j jVar = null;
            BA.u uVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    xVar = (BA.x) C8953gT.d(C8953gT.a(A.b, true)).b(jsonReader, c9028hp);
                } else if (a == 2) {
                    kVar = (BA.k) C8953gT.d(C8953gT.a(q.b, true)).b(jsonReader, c9028hp);
                } else if (a == 3) {
                    oVar = (BA.o) C8953gT.d(C8953gT.a(l.a, true)).b(jsonReader, c9028hp);
                } else if (a == 4) {
                    jVar = (BA.j) C8953gT.d(C8953gT.a(f.b, true)).b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    uVar = (BA.u) C8953gT.d(C8953gT.a(y.b, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new BA.e(str, xVar, kVar, oVar, jVar, uVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.h());
            interfaceC9069id.e("xs");
            C8953gT.d(C8953gT.a(A.b, true)).e(interfaceC9069id, c9028hp, eVar.d());
            interfaceC9069id.e("s");
            C8953gT.d(C8953gT.a(q.b, true)).e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("m");
            C8953gT.d(C8953gT.a(l.a, true)).e(interfaceC9069id, c9028hp, eVar.e());
            interfaceC9069id.e("l");
            C8953gT.d(C8953gT.a(f.b, true)).e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("xl");
            C8953gT.d(C8953gT.a(y.b, true)).e(interfaceC9069id, c9028hp, eVar.a());
        }
    }

    /* renamed from: o.Bz$A */
    /* loaded from: classes2.dex */
    public static final class A implements InterfaceC8949gP<BA.x> {
        private static final List<String> a;
        public static final A b = new A();
        public static final int e;

        private A() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            a = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BA.x b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b2 = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.x(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.x xVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) xVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, xVar.d());
            AZ.c.d.e(interfaceC9069id, c9028hp, xVar.b());
        }
    }

    /* renamed from: o.Bz$q */
    /* loaded from: classes2.dex */
    public static final class q implements InterfaceC8949gP<BA.k> {
        public static final q b = new q();
        public static final int d;
        private static final List<String> e;

        private q() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BA.k b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b2 = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.k(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.k kVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) kVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, kVar.c());
            AZ.c.d.e(interfaceC9069id, c9028hp, kVar.e());
        }
    }

    /* renamed from: o.Bz$l */
    /* loaded from: classes2.dex */
    public static final class l implements InterfaceC8949gP<BA.o> {
        public static final l a = new l();
        public static final int b;
        private static final List<String> d;

        private l() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BA.o b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b2 = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.o(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.o oVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) oVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, oVar.c());
            AZ.c.d.e(interfaceC9069id, c9028hp, oVar.e());
        }
    }

    /* renamed from: o.Bz$f */
    /* loaded from: classes2.dex */
    public static final class f implements InterfaceC8949gP<BA.j> {
        public static final f b = new f();
        private static final List<String> c;
        public static final int e;

        private f() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BA.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b2 = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.j(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.b());
            AZ.c.d.e(interfaceC9069id, c9028hp, jVar.d());
        }
    }

    /* renamed from: o.Bz$y */
    /* loaded from: classes2.dex */
    public static final class y implements InterfaceC8949gP<BA.u> {
        public static final y b = new y();
        private static final List<String> c;
        public static final int e;

        private y() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BA.u b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b2 = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.u(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.u uVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) uVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, uVar.d());
            AZ.c.d.e(interfaceC9069id, c9028hp, uVar.a());
        }
    }

    /* renamed from: o.Bz$m */
    /* loaded from: classes2.dex */
    public static final class m implements InterfaceC8949gP<BA.l> {
        public static final m b = new m();
        private static final List<String> c;
        public static final int e;

        private m() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BA.l b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b2 = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.l(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.l lVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) lVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, lVar.e());
            AZ.c.d.e(interfaceC9069id, c9028hp, lVar.b());
        }
    }

    /* renamed from: o.Bz$k */
    /* loaded from: classes2.dex */
    public static final class k implements InterfaceC8949gP<BA.n> {
        private static final List<String> a;
        public static final int b;
        public static final k c = new k();

        private k() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "xs", "s", "m", "l", "xl");
            a = j;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BA.n b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            BA.A a2 = null;
            BA.r rVar = null;
            BA.m mVar = null;
            BA.i iVar = null;
            BA.w wVar = null;
            while (true) {
                int a3 = jsonReader.a(a);
                if (a3 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a3 == 1) {
                    a2 = (BA.A) C8953gT.d(C8953gT.a(C.b, true)).b(jsonReader, c9028hp);
                } else if (a3 == 2) {
                    rVar = (BA.r) C8953gT.d(C8953gT.a(t.e, true)).b(jsonReader, c9028hp);
                } else if (a3 == 3) {
                    mVar = (BA.m) C8953gT.d(C8953gT.a(o.e, true)).b(jsonReader, c9028hp);
                } else if (a3 == 4) {
                    iVar = (BA.i) C8953gT.d(C8953gT.a(h.b, true)).b(jsonReader, c9028hp);
                } else if (a3 != 5) {
                    break;
                } else {
                    wVar = (BA.w) C8953gT.d(C8953gT.a(u.a, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new BA.n(str, a2, rVar, mVar, iVar, wVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.n nVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) nVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, nVar.i());
            interfaceC9069id.e("xs");
            C8953gT.d(C8953gT.a(C.b, true)).e(interfaceC9069id, c9028hp, nVar.d());
            interfaceC9069id.e("s");
            C8953gT.d(C8953gT.a(t.e, true)).e(interfaceC9069id, c9028hp, nVar.e());
            interfaceC9069id.e("m");
            C8953gT.d(C8953gT.a(o.e, true)).e(interfaceC9069id, c9028hp, nVar.c());
            interfaceC9069id.e("l");
            C8953gT.d(C8953gT.a(h.b, true)).e(interfaceC9069id, c9028hp, nVar.a());
            interfaceC9069id.e("xl");
            C8953gT.d(C8953gT.a(u.a, true)).e(interfaceC9069id, c9028hp, nVar.b());
        }
    }

    /* renamed from: o.Bz$C */
    /* loaded from: classes2.dex */
    public static final class C implements InterfaceC8949gP<BA.A> {
        private static final List<String> a;
        public static final C b = new C();
        public static final int c;

        private C() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BA.A b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b2 = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.A(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.A a2) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) a2, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, a2.c());
            AZ.c.d.e(interfaceC9069id, c9028hp, a2.a());
        }
    }

    /* renamed from: o.Bz$t */
    /* loaded from: classes2.dex */
    public static final class t implements InterfaceC8949gP<BA.r> {
        public static final int b;
        private static final List<String> c;
        public static final t e = new t();

        private t() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BA.r b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b2 = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.r(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.r rVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) rVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, rVar.e());
            AZ.c.d.e(interfaceC9069id, c9028hp, rVar.b());
        }
    }

    /* renamed from: o.Bz$o */
    /* loaded from: classes2.dex */
    public static final class o implements InterfaceC8949gP<BA.m> {
        public static final int b;
        private static final List<String> c;
        public static final o e = new o();

        private o() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BA.m b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b2 = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.m(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.m mVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) mVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, mVar.d());
            AZ.c.d.e(interfaceC9069id, c9028hp, mVar.b());
        }
    }

    /* renamed from: o.Bz$h */
    /* loaded from: classes2.dex */
    public static final class h implements InterfaceC8949gP<BA.i> {
        public static final h b = new h();
        public static final int c;
        private static final List<String> d;

        private h() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BA.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b2 = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.i(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.b());
            AZ.c.d.e(interfaceC9069id, c9028hp, iVar.e());
        }
    }

    /* renamed from: o.Bz$u */
    /* loaded from: classes2.dex */
    public static final class u implements InterfaceC8949gP<BA.w> {
        public static final u a = new u();
        public static final int c;
        private static final List<String> e;

        private u() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public BA.w b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.w(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.w wVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) wVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, wVar.a());
            AZ.c.d.e(interfaceC9069id, c9028hp, wVar.e());
        }
    }

    /* renamed from: o.Bz$p */
    /* loaded from: classes2.dex */
    public static final class p implements InterfaceC8949gP<BA.t> {
        private static final List<String> a;
        public static final int d;
        public static final p e = new p();

        private p() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            a = e2;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public BA.t b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AU b = C0745Ba.f.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new BA.t(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.t tVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) tVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, tVar.d());
            C0745Ba.f.e.e(interfaceC9069id, c9028hp, tVar.b());
        }
    }

    /* renamed from: o.Bz$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<BA.C0744a> {
        private static final List<String> c;
        public static final int d;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY);
            c = j;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BA.C0744a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new BA.C0744a(str, str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Error.DEBUG_FIELD_KEY);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BA.C0744a c0744a) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c0744a, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c0744a.b());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c0744a.a());
        }
    }
}
