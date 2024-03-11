package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2387afL;
import o.C2528ahl;
import o.C2568aiY;

/* renamed from: o.afJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2385afJ {
    public static final C2385afJ e = new C2385afJ();

    /* renamed from: o.afJ$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2387afL> {
        public static final a c = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "tudumEntities");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2387afL b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2387afL.i iVar = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    iVar = (C2387afL.i) C8953gT.d(C8953gT.c(h.d, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2529ahm b = C2528ahl.e.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2387afL(str, iVar, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2387afL c2387afL) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2387afL, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2387afL.a());
            interfaceC9069id.e("tudumEntities");
            C8953gT.d(C8953gT.c(h.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2387afL.b());
            C2528ahl.e.e.e(interfaceC9069id, c9028hp, c2387afL.c());
        }
    }

    private C2385afJ() {
    }

    /* renamed from: o.afJ$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC8949gP<C2387afL.i> {
        public static final h d = new h();
        private static final List<String> e;

        private h() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2387afL.i b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(c.a, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2387afL.i(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2387afL.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.a());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(c.a, false, 1, null)))).e(interfaceC9069id, c9028hp, iVar.e());
        }
    }

    /* renamed from: o.afJ$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2387afL.e> {
        public static final c a = new c();
        private static final List<String> b;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2387afL.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2387afL.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    cVar = (C2387afL.c) C8953gT.d(C8953gT.c(e.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2387afL.e(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2387afL.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.c(e.b, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.c());
        }
    }

    /* renamed from: o.afJ$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2387afL.c> {
        public static final e b = new e();
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "reference");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2387afL.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2387afL.a aVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    aVar = (C2387afL.a) C8953gT.d(C8953gT.a(g.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2387afL.c(str, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2387afL.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.b());
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(g.d, true)).e(interfaceC9069id, c9028hp, cVar.c());
        }
    }

    /* renamed from: o.afJ$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<C2387afL.a> {
        public static final g d = new g();
        private static final List<String> e;

        private g() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2387afL.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C2387afL.b bVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2387afL.d dVar = null;
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Movie"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = d.e.b(jsonReader, c9028hp);
            } else {
                bVar = null;
            }
            if (C9014hb.d(C9014hb.c("Show"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = b.e.b(jsonReader, c9028hp);
            }
            return new C2387afL.a(str, bVar, dVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2387afL.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            if (aVar.b() != null) {
                d.e.e(interfaceC9069id, c9028hp, aVar.b());
            }
            if (aVar.c() != null) {
                b.e.e(interfaceC9069id, c9028hp, aVar.c());
            }
        }
    }

    /* renamed from: o.afJ$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2387afL.b> {
        private static final List<String> a;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j(SignupConstants.Field.VIDEO_ID, "tudumTitle");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2387afL.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            C2387afL.g gVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    gVar = (C2387afL.g) C8953gT.d(C8953gT.a(f.a, true)).b(jsonReader, c9028hp);
                }
            }
            if (num != null) {
                return new C2387afL.b(num.intValue(), gVar);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2387afL.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(bVar.b()));
            interfaceC9069id.e("tudumTitle");
            C8953gT.d(C8953gT.a(f.a, true)).e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    /* renamed from: o.afJ$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C2387afL.g> {
        public static final f a = new f();
        private static final List<String> e;

        private f() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2387afL.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2563aiT b = C2568aiY.a.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2387afL.g(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2387afL.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.b());
            C2568aiY.a.c.e(interfaceC9069id, c9028hp, gVar.c());
        }
    }

    /* renamed from: o.afJ$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2387afL.d> {
        private static final List<String> a;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j(SignupConstants.Field.VIDEO_ID, "tudumTitle");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2387afL.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            C2387afL.j jVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    jVar = (C2387afL.j) C8953gT.d(C8953gT.a(j.b, true)).b(jsonReader, c9028hp);
                }
            }
            if (num != null) {
                return new C2387afL.d(num.intValue(), jVar);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2387afL.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(dVar.d()));
            interfaceC9069id.e("tudumTitle");
            C8953gT.d(C8953gT.a(j.b, true)).e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    /* renamed from: o.afJ$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC8949gP<C2387afL.j> {
        private static final List<String> a;
        public static final j b = new j();

        private j() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2387afL.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2563aiT b2 = C2568aiY.a.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2387afL.j(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2387afL.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.d());
            C2568aiY.a.c.e(interfaceC9069id, c9028hp, jVar.b());
        }
    }
}
