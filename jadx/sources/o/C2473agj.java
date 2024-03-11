package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2345aeW;
import o.C2346aeX;
import o.C2460agW;
import o.C2475agl;

/* renamed from: o.agj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2473agj {
    public static final C2473agj b = new C2473agj();

    /* renamed from: o.agj$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2475agl> {
        private static final List<String> c;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "gameEntities");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2475agl b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2475agl.d dVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    dVar = (C2475agl.d) C8953gT.d(C8953gT.c(d.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2454agQ b = C2460agW.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2475agl(str, dVar, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2475agl c2475agl) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2475agl, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2475agl.b());
            interfaceC9069id.e("gameEntities");
            C8953gT.d(C8953gT.c(d.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2475agl.a());
            C2460agW.d.a.e(interfaceC9069id, c9028hp, c2475agl.c());
        }
    }

    private C2473agj() {
    }

    /* renamed from: o.agj$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2475agl.d> {
        public static final d a = new d();
        private static final List<String> b;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2475agl.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(b.b, true)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2475agl.d(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2475agl.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(b.b, true)))).e(interfaceC9069id, c9028hp, dVar.e());
        }
    }

    /* renamed from: o.agj$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2475agl.b> {
        public static final b b = new b();
        private static final List<String> c;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "cursor", "index", "node");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2475agl.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            Integer num = null;
            C2475agl.c cVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    cVar = (C2475agl.c) C8953gT.d(C8953gT.a(c.e, true)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2342aeT b2 = C2345aeW.d.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2475agl.b(str, str2, num, cVar, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2475agl.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.c());
            interfaceC9069id.e("cursor");
            C8953gT.t.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("index");
            C8953gT.n.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(c.e, true)).e(interfaceC9069id, c9028hp, bVar.a());
            C2345aeW.d.d.e(interfaceC9069id, c9028hp, bVar.b());
        }
    }

    /* renamed from: o.agj$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2475agl.c> {
        private static final List<String> b;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2475agl.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C2475agl.j jVar;
            C2475agl.h hVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2475agl.f fVar = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("LolomoDefaultNode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                jVar = g.c.b(jsonReader, c9028hp);
            } else {
                jVar = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoBillboardNode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                hVar = j.a.b(jsonReader, c9028hp);
            } else {
                hVar = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoGameNode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                fVar = h.c.b(jsonReader, c9028hp);
            }
            return new C2475agl.c(str, jVar, hVar, fVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2475agl.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            if (cVar.c() != null) {
                g.c.e(interfaceC9069id, c9028hp, cVar.c());
            }
            if (cVar.d() != null) {
                j.a.e(interfaceC9069id, c9028hp, cVar.d());
            }
            if (cVar.e() != null) {
                h.c.e(interfaceC9069id, c9028hp, cVar.e());
            }
        }
    }

    /* renamed from: o.agj$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<C2475agl.j> {
        private static final List<String> a;
        public static final g c = new g();

        private g() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("reference");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2475agl.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2475agl.g gVar = null;
            while (jsonReader.a(a) == 0) {
                gVar = (C2475agl.g) C8953gT.d(C8953gT.a(m.d, true)).b(jsonReader, c9028hp);
            }
            return new C2475agl.j(gVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2475agl.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(m.d, true)).e(interfaceC9069id, c9028hp, jVar.d());
        }
    }

    /* renamed from: o.agj$m */
    /* loaded from: classes3.dex */
    public static final class m implements InterfaceC8949gP<C2475agl.g> {
        public static final m d = new m();
        private static final List<String> e;

        private m() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2475agl.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2475agl.e eVar = null;
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                eVar = e.e.b(jsonReader, c9028hp);
            }
            return new C2475agl.g(str, eVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2475agl.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.c());
            if (gVar.e() != null) {
                e.e.e(interfaceC9069id, c9028hp, gVar.e());
            }
        }
    }

    /* renamed from: o.agj$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2475agl.e> {
        public static final e e = new e();

        private e() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2475agl.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C2475agl.e(C2346aeX.e.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2475agl.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            C2346aeX.e.e.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    /* renamed from: o.agj$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC8949gP<C2475agl.h> {
        public static final j a = new j();
        private static final List<String> b;

        private j() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("reference");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2475agl.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2475agl.k kVar = null;
            while (jsonReader.a(b) == 0) {
                kVar = (C2475agl.k) C8953gT.d(C8953gT.a(l.c, true)).b(jsonReader, c9028hp);
            }
            return new C2475agl.h(kVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2475agl.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(l.c, true)).e(interfaceC9069id, c9028hp, hVar.b());
        }
    }

    /* renamed from: o.agj$l */
    /* loaded from: classes3.dex */
    public static final class l implements InterfaceC8949gP<C2475agl.k> {
        public static final l c = new l();
        private static final List<String> e;

        private l() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2475agl.k b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2475agl.a aVar = null;
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = f.a.b(jsonReader, c9028hp);
            }
            return new C2475agl.k(str, aVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2475agl.k kVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) kVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, kVar.d());
            if (kVar.c() != null) {
                f.a.e(interfaceC9069id, c9028hp, kVar.c());
            }
        }
    }

    /* renamed from: o.agj$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C2475agl.a> {
        public static final f a = new f();

        private f() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2475agl.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C2475agl.a(C2346aeX.e.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2475agl.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            C2346aeX.e.e.e(interfaceC9069id, c9028hp, aVar.b());
        }
    }

    /* renamed from: o.agj$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC8949gP<C2475agl.f> {
        public static final h c = new h();
        private static final List<String> e;

        private h() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("reference");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2475agl.f b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2475agl.m mVar = null;
            while (jsonReader.a(e) == 0) {
                mVar = (C2475agl.m) C8953gT.d(C8953gT.a(n.e, true)).b(jsonReader, c9028hp);
            }
            return new C2475agl.f(mVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2475agl.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(n.e, true)).e(interfaceC9069id, c9028hp, fVar.a());
        }
    }

    /* renamed from: o.agj$n */
    /* loaded from: classes3.dex */
    public static final class n implements InterfaceC8949gP<C2475agl.m> {
        private static final List<String> a;
        public static final n e = new n();

        private n() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            a = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2475agl.m b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2475agl.i iVar = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                iVar = i.d.b(jsonReader, c9028hp);
            }
            return new C2475agl.m(str, iVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2475agl.m mVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) mVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, mVar.e());
            if (mVar.a() != null) {
                i.d.e(interfaceC9069id, c9028hp, mVar.a());
            }
        }
    }

    /* renamed from: o.agj$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<C2475agl.i> {
        public static final i d = new i();

        private i() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2475agl.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C2475agl.i(C2346aeX.e.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2475agl.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            C2346aeX.e.e.e(interfaceC9069id, c9028hp, iVar.c());
        }
    }
}
