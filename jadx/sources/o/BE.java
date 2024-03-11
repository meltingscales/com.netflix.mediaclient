package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSButtonType;
import com.netflix.clcs.codegen.type.CLCSModalPresentation;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.BD;
import o.C0745Ba;
import o.C0749Be;
import o.C0765Bu;

/* loaded from: classes2.dex */
public final class BE {
    public static final BE c = new BE();

    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<BD> {
        public static final int a;
        private static final List<String> b;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "presentation", "backgroundImage", "style", "closeButtonType", "onClose", "content");
            b = j;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BD b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            CLCSModalPresentation cLCSModalPresentation = null;
            BD.e eVar = null;
            BD.a aVar = null;
            CLCSButtonType cLCSButtonType = null;
            BD.d dVar = null;
            BD.c cVar = null;
            while (true) {
                switch (jsonReader.a(b)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        cLCSModalPresentation = (CLCSModalPresentation) C8953gT.d(C0856Ff.a).b(jsonReader, c9028hp);
                        break;
                    case 2:
                        eVar = (BD.e) C8953gT.d(C8953gT.a(e.b, true)).b(jsonReader, c9028hp);
                        break;
                    case 3:
                        aVar = (BD.a) C8953gT.d(C8953gT.a(b.d, true)).b(jsonReader, c9028hp);
                        break;
                    case 4:
                        cLCSButtonType = (CLCSButtonType) C8953gT.d(EP.c).b(jsonReader, c9028hp);
                        break;
                    case 5:
                        dVar = (BD.d) C8953gT.d(C8953gT.a(c.d, true)).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        cVar = (BD.c) C8953gT.c(d.d, false, 1, null).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (cVar != null) {
                            return new BD(str, cLCSModalPresentation, eVar, aVar, cLCSButtonType, dVar, cVar);
                        } else {
                            C8956gW.a(jsonReader, "content");
                            throw new KotlinNothingValueException();
                        }
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BD bd) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bd, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bd.h());
            interfaceC9069id.e("presentation");
            C8953gT.d(C0856Ff.a).e(interfaceC9069id, c9028hp, bd.b());
            interfaceC9069id.e("backgroundImage");
            C8953gT.d(C8953gT.a(e.b, true)).e(interfaceC9069id, c9028hp, bd.a());
            interfaceC9069id.e("style");
            C8953gT.d(C8953gT.a(b.d, true)).e(interfaceC9069id, c9028hp, bd.f());
            interfaceC9069id.e("closeButtonType");
            C8953gT.d(EP.c).e(interfaceC9069id, c9028hp, bd.e());
            interfaceC9069id.e("onClose");
            C8953gT.d(C8953gT.a(c.d, true)).e(interfaceC9069id, c9028hp, bd.c());
            interfaceC9069id.e("content");
            C8953gT.c(d.d, false, 1, null).e(interfaceC9069id, c9028hp, bd.d());
        }
    }

    private BE() {
    }

    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<BD.e> {
        public static final e b = new e();
        public static final int d;
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BD.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0767Bw b2 = C0765Bu.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BD.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BD.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            C0765Bu.c.d.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<BD.a> {
        public static final int b;
        public static final b d = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BD.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AU b2 = C0745Ba.f.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new BD.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BD.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            C0745Ba.f.e.e(interfaceC9069id, c9028hp, aVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<BD.d> {
        private static final List<String> a;
        public static final int c;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BD.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0753Bi b = C0749Be.c.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new BD.d(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BD.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.b());
            C0749Be.c.c.e(interfaceC9069id, c9028hp, dVar.d());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<BD.c> {
        public static final int b;
        private static final List<String> c;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY);
            c = j;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public BD.c b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new BD.c(str, str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Error.DEBUG_FIELD_KEY);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BD.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.b());
        }
    }
}
