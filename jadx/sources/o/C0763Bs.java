package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSItemAlignment;
import com.netflix.clcs.codegen.type.CLCSSpaceSize;
import com.netflix.clcs.codegen.type.CLCSStackContentJustification;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AZ;
import o.C0745Ba;
import o.C0759Bo;

/* renamed from: o.Bs  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0763Bs {
    public static final C0763Bs a = new C0763Bs();

    /* renamed from: o.Bs$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<C0759Bo> {
        public static final a a = new a();
        private static final List<String> b;
        public static final int e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "contentJustification", "contentSpacing", "contentSpacingSize", "contentStretch", "itemAlignment", "style", "children");
            b = j;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0759Bo b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            CLCSStackContentJustification cLCSStackContentJustification = null;
            CLCSSpaceSize cLCSSpaceSize = null;
            C0759Bo.d dVar = null;
            Boolean bool = null;
            CLCSItemAlignment cLCSItemAlignment = null;
            C0759Bo.e eVar = null;
            List list = null;
            while (true) {
                switch (jsonReader.a(b)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        cLCSStackContentJustification = (CLCSStackContentJustification) C8953gT.d(C0860Fj.e).b(jsonReader, c9028hp);
                        break;
                    case 2:
                        cLCSSpaceSize = (CLCSSpaceSize) C8953gT.d(C0858Fh.b).b(jsonReader, c9028hp);
                        break;
                    case 3:
                        dVar = (C0759Bo.d) C8953gT.d(C8953gT.a(c.c, true)).b(jsonReader, c9028hp);
                        break;
                    case 4:
                        bool = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        cLCSItemAlignment = (CLCSItemAlignment) C8953gT.d(C0855Fe.e).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        eVar = (C0759Bo.e) C8953gT.d(C8953gT.a(d.b, true)).b(jsonReader, c9028hp);
                        break;
                    case 7:
                        list = C8953gT.a(C8953gT.c(b.d, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (list != null) {
                            return new C0759Bo(str, cLCSStackContentJustification, cLCSSpaceSize, dVar, bool, cLCSItemAlignment, eVar, list);
                        } else {
                            C8956gW.a(jsonReader, "children");
                            throw new KotlinNothingValueException();
                        }
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0759Bo c0759Bo) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c0759Bo, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c0759Bo.j());
            interfaceC9069id.e("contentJustification");
            C8953gT.d(C0860Fj.e).e(interfaceC9069id, c9028hp, c0759Bo.e());
            interfaceC9069id.e("contentSpacing");
            C8953gT.d(C0858Fh.b).e(interfaceC9069id, c9028hp, c0759Bo.a());
            interfaceC9069id.e("contentSpacingSize");
            C8953gT.d(C8953gT.a(c.c, true)).e(interfaceC9069id, c9028hp, c0759Bo.d());
            interfaceC9069id.e("contentStretch");
            C8953gT.l.e(interfaceC9069id, c9028hp, c0759Bo.c());
            interfaceC9069id.e("itemAlignment");
            C8953gT.d(C0855Fe.e).e(interfaceC9069id, c9028hp, c0759Bo.h());
            interfaceC9069id.e("style");
            C8953gT.d(C8953gT.a(d.b, true)).e(interfaceC9069id, c9028hp, c0759Bo.i());
            interfaceC9069id.e("children");
            C8953gT.a(C8953gT.c(b.d, false, 1, null)).e(interfaceC9069id, c9028hp, c0759Bo.b());
        }
    }

    private C0763Bs() {
    }

    /* renamed from: o.Bs$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<C0759Bo.d> {
        public static final int a;
        private static final List<String> b;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0759Bo.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b2 = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0759Bo.d(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0759Bo.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            AZ.c.d.e(interfaceC9069id, c9028hp, dVar.a());
        }
    }

    /* renamed from: o.Bs$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<C0759Bo.e> {
        public static final d b = new d();
        private static final List<String> c;
        public static final int e;

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0759Bo.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AU b2 = C0745Ba.f.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0759Bo.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0759Bo.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.d());
            C0745Ba.f.e.e(interfaceC9069id, c9028hp, eVar.e());
        }
    }

    /* renamed from: o.Bs$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<C0759Bo.b> {
        private static final List<String> b;
        public static final int c;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY);
            b = j;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0759Bo.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(b);
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
                return new C0759Bo.b(str, str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Error.DEBUG_FIELD_KEY);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0759Bo.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bVar.c());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bVar.d());
        }
    }
}
