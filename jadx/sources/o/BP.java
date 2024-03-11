package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSDesignTheme;
import com.netflix.clcs.codegen.type.CLCSFieldValueProvider;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AY;
import o.BR;
import o.C0749Be;
import o.C0756Bl;

/* loaded from: classes2.dex */
public final class BP {
    public static final BP c = new BP();

    /* loaded from: classes2.dex */
    public static final class j implements InterfaceC8949gP<BR> {
        public static final int a;
        private static final List<String> b;
        public static final j e = new j();

        private j() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "serverState", "componentTree", "theme", "onBackControl", "onRender", "onUnload", "trackingInfo", "loggingViewName", "fieldInitialization", "navigationMarker");
            b = j;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BR b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            BR.a aVar = null;
            CLCSDesignTheme cLCSDesignTheme = null;
            BR.e eVar = null;
            BR.j jVar = null;
            BR.f fVar = null;
            String str3 = null;
            String str4 = null;
            List list = null;
            String str5 = null;
            while (true) {
                switch (jsonReader.a(b)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        str2 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        aVar = (BR.a) C8953gT.c(e.c, false, 1, null).b(jsonReader, c9028hp);
                        break;
                    case 3:
                        cLCSDesignTheme = (CLCSDesignTheme) C8953gT.d(EV.d).b(jsonReader, c9028hp);
                        break;
                    case 4:
                        eVar = (BR.e) C8953gT.d(C8953gT.a(c.b, true)).b(jsonReader, c9028hp);
                        break;
                    case 5:
                        jVar = (BR.j) C8953gT.d(C8953gT.a(i.c, true)).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        fVar = (BR.f) C8953gT.d(C8953gT.a(h.d, true)).b(jsonReader, c9028hp);
                        break;
                    case 7:
                        str3 = (String) C8953gT.d(C8953gT.p).b(jsonReader, c9028hp);
                        break;
                    case 8:
                        str4 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 9:
                        list = (List) C8953gT.d(C8953gT.a(C8953gT.c(b.b, false, 1, null))).b(jsonReader, c9028hp);
                        break;
                    case 10:
                        str5 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (str2 == null) {
                            C8956gW.a(jsonReader, "serverState");
                            throw new KotlinNothingValueException();
                        } else if (aVar != null) {
                            return new BR(str, str2, aVar, cLCSDesignTheme, eVar, jVar, fVar, str3, str4, list, str5);
                        } else {
                            C8956gW.a(jsonReader, "componentTree");
                            throw new KotlinNothingValueException();
                        }
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BR br) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) br, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, br.l());
            interfaceC9069id.e("serverState");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, br.h());
            interfaceC9069id.e("componentTree");
            C8953gT.c(e.c, false, 1, null).e(interfaceC9069id, c9028hp, br.e());
            interfaceC9069id.e("theme");
            C8953gT.d(EV.d).e(interfaceC9069id, c9028hp, br.i());
            interfaceC9069id.e("onBackControl");
            C8953gT.d(C8953gT.a(c.b, true)).e(interfaceC9069id, c9028hp, br.b());
            interfaceC9069id.e("onRender");
            C8953gT.d(C8953gT.a(i.c, true)).e(interfaceC9069id, c9028hp, br.g());
            interfaceC9069id.e("onUnload");
            C8953gT.d(C8953gT.a(h.d, true)).e(interfaceC9069id, c9028hp, br.j());
            interfaceC9069id.e("trackingInfo");
            C8953gT.d(interfaceC8949gP).e(interfaceC9069id, c9028hp, br.f());
            interfaceC9069id.e("loggingViewName");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, br.c());
            interfaceC9069id.e("fieldInitialization");
            C8953gT.d(C8953gT.a(C8953gT.c(b.b, false, 1, null))).e(interfaceC9069id, c9028hp, br.a());
            interfaceC9069id.e("navigationMarker");
            c8994hH.e(interfaceC9069id, c9028hp, br.d());
        }
    }

    private BP() {
    }

    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<BR.a> {
        public static final e c = new e();
        private static final List<String> d;
        public static final int e;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "nodes", "root", "initialFocusKey");
            d = j;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BR.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            BR.i iVar = null;
            List list = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.a(d.d, true))).b(jsonReader, c9028hp);
                } else if (a == 2) {
                    iVar = (BR.i) C8953gT.c(f.d, false, 1, null).b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (iVar != null) {
                return new BR.a(str, list, iVar, str2);
            } else {
                C8956gW.a(jsonReader, "root");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BR.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e("nodes");
            C8953gT.d(C8953gT.a(C8953gT.a(d.d, true))).e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e("root");
            C8953gT.c(f.d, false, 1, null).e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e("initialFocusKey");
            C8953gT.t.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<BR.b> {
        private static final List<String> c;
        public static final d d = new d();
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
        /* renamed from: a */
        public BR.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AV b = AY.b.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new BR.b(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BR.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.d());
            AY.b.b.e(interfaceC9069id, c9028hp, bVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements InterfaceC8949gP<BR.i> {
        public static final int b;
        private static final List<String> c;
        public static final f d = new f();

        private f() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY);
            c = j;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BR.i b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new BR.i(str, str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Error.DEBUG_FIELD_KEY);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BR.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, iVar.d());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, iVar.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<BR.e> {
        public static final int a;
        public static final c b = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public BR.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0753Bi b2 = C0749Be.c.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new BR.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BR.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.c());
            C0749Be.c.c.e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class i implements InterfaceC8949gP<BR.j> {
        public static final int b;
        public static final i c = new i();
        private static final List<String> e;

        private i() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BR.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0753Bi b2 = C0749Be.c.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new BR.j(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BR.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.e());
            C0749Be.c.c.e(interfaceC9069id, c9028hp, jVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class h implements InterfaceC8949gP<BR.f> {
        public static final int a;
        private static final List<String> b;
        public static final h d = new h();

        private h() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BR.f b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0753Bi b2 = C0749Be.c.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new BR.f(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BR.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, fVar.e());
            C0749Be.c.c.e(interfaceC9069id, c9028hp, fVar.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<BR.d> {
        public static final int a;
        public static final b b = new b();
        private static final List<String> c;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "field", "valueProvider");
            c = j;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BR.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            BR.c cVar = null;
            CLCSFieldValueProvider cLCSFieldValueProvider = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    cVar = (BR.c) C8953gT.d(C8953gT.a(a.a, true)).b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    cLCSFieldValueProvider = (CLCSFieldValueProvider) C8953gT.d(EU.e).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new BR.d(str, cVar, cLCSFieldValueProvider);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BR.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e("field");
            C8953gT.d(C8953gT.a(a.a, true)).e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("valueProvider");
            C8953gT.d(EU.e).e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<BR.c> {
        public static final a a = new a();
        private static final List<String> b;
        public static final int c;

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BR.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0751Bg b2 = C0756Bl.b.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new BR.c(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BR.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.c());
            C0756Bl.b.b.e(interfaceC9069id, c9028hp, cVar.b());
        }
    }
}
