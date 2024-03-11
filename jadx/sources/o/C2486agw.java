package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2338aeP;
import o.C2341aeS;
import o.C2343aeU;
import o.C2473agj;
import o.C2489agz;

/* renamed from: o.agw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2486agw {
    public static final C2486agw b = new C2486agw();

    /* renamed from: o.agw$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2489agz> {
        public static final d a = new d();
        private static final List<String> b;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "ipBasedGameEntities");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2489agz b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2489agz.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    cVar = (C2489agz.c) C8953gT.d(C8953gT.c(c.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2475agl b2 = C2473agj.a.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2489agz(str, cVar, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2489agz c2489agz) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2489agz, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2489agz.b());
            interfaceC9069id.e("ipBasedGameEntities");
            C8953gT.d(C8953gT.c(c.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2489agz.e());
            C2473agj.a.d.e(interfaceC9069id, c9028hp, c2489agz.d());
        }
    }

    private C2486agw() {
    }

    /* renamed from: o.agw$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2489agz.c> {
        public static final c c = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2489agz.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(e.a, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2489agz.c(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2489agz.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.c());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(e.a, false, 1, null)))).e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    /* renamed from: o.agw$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2489agz.b> {
        public static final e a = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node", "bannerArtwork", "logoArtwork");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2489agz.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2489agz.e eVar = null;
            C2489agz.a aVar = null;
            C2489agz.d dVar = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    eVar = (C2489agz.e) C8953gT.d(C8953gT.c(j.e, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    aVar = (C2489agz.a) C8953gT.d(C8953gT.c(a.c, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    dVar = (C2489agz.d) C8953gT.d(C8953gT.c(b.d, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2489agz.b(str, eVar, aVar, dVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2489agz.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.c(j.e, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.c());
            interfaceC9069id.e("bannerArtwork");
            C8953gT.d(C8953gT.c(a.c, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e("logoArtwork");
            C8953gT.d(C8953gT.c(b.d, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    /* renamed from: o.agw$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC8949gP<C2489agz.e> {
        private static final List<String> b;
        public static final j e = new j();

        private j() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "reference");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2489agz.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2489agz.i iVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    iVar = (C2489agz.i) C8953gT.d(C8953gT.a(f.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2489agz.e(str, iVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2489agz.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(f.d, true)).e(interfaceC9069id, c9028hp, eVar.a());
        }
    }

    /* renamed from: o.agw$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C2489agz.i> {
        private static final List<String> a;
        public static final f d = new f();

        private f() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2489agz.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C2339aeQ c2339aeQ;
            C2347aeY c2347aeY;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2340aeR c2340aeR = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2339aeQ = C2341aeS.b.e.b(jsonReader, c9028hp);
            } else {
                c2339aeQ = null;
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2347aeY = C2343aeU.d.a.b(jsonReader, c9028hp);
            } else {
                c2347aeY = null;
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2340aeR = C2338aeP.b.d.b(jsonReader, c9028hp);
            }
            return new C2489agz.i(str, c2339aeQ, c2347aeY, c2340aeR);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2489agz.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.a());
            if (iVar.b() != null) {
                C2341aeS.b.e.e(interfaceC9069id, c9028hp, iVar.b());
            }
            if (iVar.d() != null) {
                C2343aeU.d.a.e(interfaceC9069id, c9028hp, iVar.d());
            }
            if (iVar.c() != null) {
                C2338aeP.b.d.e(interfaceC9069id, c9028hp, iVar.c());
            }
        }
    }

    /* renamed from: o.agw$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2489agz.a> {
        private static final List<String> b;
        public static final a c = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2489agz.a b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2489agz.a(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2489agz.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8953gT.t.e(interfaceC9069id, c9028hp, aVar.c());
        }
    }

    /* renamed from: o.agw$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2489agz.d> {
        private static final List<String> a;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2489agz.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2489agz.d(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2489agz.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8953gT.t.e(interfaceC9069id, c9028hp, dVar.e());
        }
    }
}
