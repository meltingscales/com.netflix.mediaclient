package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2379afD;
import o.C2380afE;
import o.C2434afx;
import o.C2460agW;
import o.C2529ahm;
import o.C2632ajj;

/* renamed from: o.ahl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2528ahl {
    public static final C2528ahl a = new C2528ahl();

    /* renamed from: o.ahl$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2529ahm> {
        private static final List<String> d;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "videoEntities");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2529ahm b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2529ahm.n nVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    nVar = (C2529ahm.n) C8953gT.d(C8953gT.c(k.d, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2454agQ b = C2460agW.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2529ahm(str, nVar, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2529ahm c2529ahm) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2529ahm, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2529ahm.e());
            interfaceC9069id.e("videoEntities");
            C8953gT.d(C8953gT.c(k.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2529ahm.c());
            C2460agW.d.a.e(interfaceC9069id, c9028hp, c2529ahm.b());
        }
    }

    private C2528ahl() {
    }

    /* renamed from: o.ahl$k */
    /* loaded from: classes3.dex */
    public static final class k implements InterfaceC8949gP<C2529ahm.n> {
        private static final List<String> c;
        public static final k d = new k();

        private k() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount", "edges");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2529ahm.n b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(d.a, true)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2529ahm.n(str, num, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2529ahm.n nVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) nVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, nVar.a());
            interfaceC9069id.e("totalCount");
            C8953gT.n.e(interfaceC9069id, c9028hp, nVar.c());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(d.a, true)))).e(interfaceC9069id, c9028hp, nVar.d());
        }
    }

    /* renamed from: o.ahl$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2529ahm.e> {
        public static final d a = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "cursor", "index", "node", "impressionToken");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2529ahm.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            Integer num = null;
            C2529ahm.c cVar = null;
            String str3 = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    cVar = (C2529ahm.c) C8953gT.d(C8953gT.a(b.d, true)).b(jsonReader, c9028hp);
                } else if (a2 != 4) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2433afw b = C2434afx.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2529ahm.e(str, str2, num, cVar, str3, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2529ahm.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.h());
            interfaceC9069id.e("cursor");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("index");
            C8953gT.n.e(interfaceC9069id, c9028hp, eVar.d());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(b.d, true)).e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("impressionToken");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.e());
            C2434afx.c.d.e(interfaceC9069id, c9028hp, eVar.a());
        }
    }

    /* renamed from: o.ahl$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2529ahm.c> {
        private static final List<String> a;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2529ahm.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C2529ahm.a aVar;
            C2529ahm.b bVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2529ahm.h hVar = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("LolomoDefaultNode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = g.d.b(jsonReader, c9028hp);
            } else {
                aVar = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoBillboardNode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = c.c.b(jsonReader, c9028hp);
            } else {
                bVar = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoRecentlyWatchedNode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                hVar = h.b.b(jsonReader, c9028hp);
            }
            return new C2529ahm.c(str, aVar, bVar, hVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2529ahm.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            if (cVar.e() != null) {
                g.d.e(interfaceC9069id, c9028hp, cVar.e());
            }
            if (cVar.b() != null) {
                c.c.e(interfaceC9069id, c9028hp, cVar.b());
            }
            if (cVar.d() != null) {
                h.b.e(interfaceC9069id, c9028hp, cVar.d());
            }
        }
    }

    /* renamed from: o.ahl$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<C2529ahm.a> {
        private static final List<String> b;
        public static final g d = new g();

        private g() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("reference");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2529ahm.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2529ahm.g gVar = null;
            while (jsonReader.a(b) == 0) {
                gVar = (C2529ahm.g) C8953gT.d(C8953gT.a(l.d, true)).b(jsonReader, c9028hp);
            }
            return new C2529ahm.a(gVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2529ahm.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(l.d, true)).e(interfaceC9069id, c9028hp, aVar.a());
        }
    }

    /* renamed from: o.ahl$l */
    /* loaded from: classes3.dex */
    public static final class l implements InterfaceC8949gP<C2529ahm.g> {
        private static final List<String> b;
        public static final l d = new l();

        private l() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2529ahm.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C2529ahm.j jVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2529ahm.d dVar = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                jVar = i.d.b(jsonReader, c9028hp);
            } else {
                jVar = null;
            }
            if (C9014hb.d(C9014hb.c("GenericContainer"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = a.a.b(jsonReader, c9028hp);
            }
            return new C2529ahm.g(str, jVar, dVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2529ahm.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.e());
            if (gVar.b() != null) {
                i.d.e(interfaceC9069id, c9028hp, gVar.b());
            }
            if (gVar.c() != null) {
                a.a.e(interfaceC9069id, c9028hp, gVar.c());
            }
        }
    }

    /* renamed from: o.ahl$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<C2529ahm.j> {
        public static final i d = new i();

        private i() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2529ahm.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C2383afH c2383afH;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            C2630ajh b = C2632ajj.e.b.b(jsonReader, c9028hp);
            C2382afG c2382afG = null;
            if (C9014hb.d(C9014hb.e("includeLiveData"), c9028hp.f, null, c9028hp.d, null)) {
                jsonReader.q();
                c2383afH = C2379afD.c.a.b(jsonReader, c9028hp);
            } else {
                c2383afH = null;
            }
            if (C9014hb.d(C9014hb.e("includeLiveData"), c9028hp.f, null, c9028hp.d, null)) {
                jsonReader.q();
                c2382afG = C2380afE.c.a.b(jsonReader, c9028hp);
            }
            return new C2529ahm.j(b, c2383afH, c2382afG);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2529ahm.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, jVar.e());
            if (jVar.a() != null) {
                C2379afD.c.a.e(interfaceC9069id, c9028hp, jVar.a());
            }
            if (jVar.c() != null) {
                C2380afE.c.a.e(interfaceC9069id, c9028hp, jVar.c());
            }
        }
    }

    /* renamed from: o.ahl$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2529ahm.d> {
        public static final a a = new a();
        private static final List<String> b;

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e(SignupConstants.Field.LANG_ID);
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2529ahm.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str != null) {
                return new C2529ahm.d(str);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.LANG_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2529ahm.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    /* renamed from: o.ahl$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2529ahm.b> {
        public static final c c = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("reference");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2529ahm.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2529ahm.k kVar = null;
            while (jsonReader.a(d) == 0) {
                kVar = (C2529ahm.k) C8953gT.d(C8953gT.a(o.e, true)).b(jsonReader, c9028hp);
            }
            return new C2529ahm.b(kVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2529ahm.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(o.e, true)).e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    /* renamed from: o.ahl$o */
    /* loaded from: classes3.dex */
    public static final class o implements InterfaceC8949gP<C2529ahm.k> {
        private static final List<String> d;
        public static final o e = new o();

        private o() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            d = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2529ahm.k b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2529ahm.f fVar = null;
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                fVar = f.d.b(jsonReader, c9028hp);
            }
            return new C2529ahm.k(str, fVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2529ahm.k kVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) kVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, kVar.d());
            if (kVar.c() != null) {
                f.d.e(interfaceC9069id, c9028hp, kVar.c());
            }
        }
    }

    /* renamed from: o.ahl$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C2529ahm.f> {
        public static final f d = new f();

        private f() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2529ahm.f b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            C2630ajh b = C2632ajj.e.b.b(jsonReader, c9028hp);
            C2383afH c2383afH = null;
            if (C9014hb.d(C9014hb.e("includeLiveData"), c9028hp.f, null, c9028hp.d, null)) {
                jsonReader.q();
                c2383afH = C2379afD.c.a.b(jsonReader, c9028hp);
            }
            return new C2529ahm.f(b, c2383afH);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2529ahm.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, fVar.a());
            if (fVar.d() != null) {
                C2379afD.c.a.e(interfaceC9069id, c9028hp, fVar.d());
            }
        }
    }

    /* renamed from: o.ahl$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC8949gP<C2529ahm.h> {
        public static final h b = new h();
        private static final List<String> d;

        private h() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("reference");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2529ahm.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2529ahm.m mVar = null;
            while (jsonReader.a(d) == 0) {
                mVar = (C2529ahm.m) C8953gT.d(C8953gT.a(m.b, true)).b(jsonReader, c9028hp);
            }
            return new C2529ahm.h(mVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2529ahm.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(m.b, true)).e(interfaceC9069id, c9028hp, hVar.a());
        }
    }

    /* renamed from: o.ahl$m */
    /* loaded from: classes3.dex */
    public static final class m implements InterfaceC8949gP<C2529ahm.m> {
        public static final m b = new m();
        private static final List<String> e;

        private m() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2529ahm.m b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2529ahm.i iVar = null;
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                iVar = j.a.b(jsonReader, c9028hp);
            }
            return new C2529ahm.m(str, iVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2529ahm.m mVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) mVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, mVar.a());
            if (mVar.e() != null) {
                j.a.e(interfaceC9069id, c9028hp, mVar.e());
            }
        }
    }

    /* renamed from: o.ahl$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC8949gP<C2529ahm.i> {
        public static final j a = new j();

        private j() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2529ahm.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C2383afH c2383afH;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            C2630ajh b = C2632ajj.e.b.b(jsonReader, c9028hp);
            C2382afG c2382afG = null;
            if (C9014hb.d(C9014hb.e("includeLiveData"), c9028hp.f, null, c9028hp.d, null)) {
                jsonReader.q();
                c2383afH = C2379afD.c.a.b(jsonReader, c9028hp);
            } else {
                c2383afH = null;
            }
            if (C9014hb.d(C9014hb.e("includeLiveData"), c9028hp.f, null, c9028hp.d, null)) {
                jsonReader.q();
                c2382afG = C2380afE.c.a.b(jsonReader, c9028hp);
            }
            return new C2529ahm.i(b, c2383afH, c2382afG);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2529ahm.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, iVar.a());
            if (iVar.b() != null) {
                C2379afD.c.a.e(interfaceC9069id, c9028hp, iVar.b());
            }
            if (iVar.e() != null) {
                C2380afE.c.a.e(interfaceC9069id, c9028hp, iVar.e());
            }
        }
    }
}
