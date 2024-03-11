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
import o.C0784Cl;

/* renamed from: o.Ck  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0783Ck {
    public static final C0783Ck c = new C0783Ck();

    /* renamed from: o.Ck$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<C0784Cl> {
        private static final List<String> a;
        public static final e c = new e();
        public static final int d;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "contentJustification", "contentSpacing", "contentSpacingSize", "contentStretch", "itemAlignment", "style", "children");
            a = j;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0784Cl b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            CLCSStackContentJustification cLCSStackContentJustification = null;
            CLCSSpaceSize cLCSSpaceSize = null;
            C0784Cl.c cVar = null;
            Boolean bool = null;
            CLCSItemAlignment cLCSItemAlignment = null;
            C0784Cl.a aVar = null;
            List list = null;
            while (true) {
                switch (jsonReader.a(a)) {
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
                        cVar = (C0784Cl.c) C8953gT.d(C8953gT.a(a.a, true)).b(jsonReader, c9028hp);
                        break;
                    case 4:
                        bool = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        cLCSItemAlignment = (CLCSItemAlignment) C8953gT.d(C0855Fe.e).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        aVar = (C0784Cl.a) C8953gT.d(C8953gT.a(c.e, true)).b(jsonReader, c9028hp);
                        break;
                    case 7:
                        list = C8953gT.a(C8953gT.c(d.c, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (list != null) {
                            return new C0784Cl(str, cLCSStackContentJustification, cLCSSpaceSize, cVar, bool, cLCSItemAlignment, aVar, list);
                        } else {
                            C8956gW.a(jsonReader, "children");
                            throw new KotlinNothingValueException();
                        }
                }
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0784Cl c0784Cl) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c0784Cl, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c0784Cl.g());
            interfaceC9069id.e("contentJustification");
            C8953gT.d(C0860Fj.e).e(interfaceC9069id, c9028hp, c0784Cl.a());
            interfaceC9069id.e("contentSpacing");
            C8953gT.d(C0858Fh.b).e(interfaceC9069id, c9028hp, c0784Cl.c());
            interfaceC9069id.e("contentSpacingSize");
            C8953gT.d(C8953gT.a(a.a, true)).e(interfaceC9069id, c9028hp, c0784Cl.b());
            interfaceC9069id.e("contentStretch");
            C8953gT.l.e(interfaceC9069id, c9028hp, c0784Cl.d());
            interfaceC9069id.e("itemAlignment");
            C8953gT.d(C0855Fe.e).e(interfaceC9069id, c9028hp, c0784Cl.j());
            interfaceC9069id.e("style");
            C8953gT.d(C8953gT.a(c.e, true)).e(interfaceC9069id, c9028hp, c0784Cl.i());
            interfaceC9069id.e("children");
            C8953gT.a(C8953gT.c(d.c, false, 1, null)).e(interfaceC9069id, c9028hp, c0784Cl.e());
        }
    }

    private C0783Ck() {
    }

    /* renamed from: o.Ck$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<C0784Cl.c> {
        public static final a a = new a();
        public static final int d;
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0784Cl.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0784Cl.c(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0784Cl.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.c());
            AZ.c.d.e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    /* renamed from: o.Ck$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<C0784Cl.a> {
        private static final List<String> c;
        public static final int d;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0784Cl.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AU b = C0745Ba.f.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0784Cl.a(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0784Cl.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            C0745Ba.f.e.e(interfaceC9069id, c9028hp, aVar.b());
        }
    }

    /* renamed from: o.Ck$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<C0784Cl.e> {
        public static final int a;
        public static final d c = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY);
            d = j;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0784Cl.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C0784Cl.e(str, str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Error.DEBUG_FIELD_KEY);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0784Cl.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, eVar.e());
        }
    }
}
