package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2451agN;
import o.C2528ahl;
import o.C2632ajj;

/* renamed from: o.agS  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2456agS {
    public static final C2456agS a = new C2456agS();

    /* renamed from: o.agS$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2451agN> {
        private static final List<String> a;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "recentlyWatchedEntities");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2451agN b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2451agN.f fVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    fVar = (C2451agN.f) C8953gT.d(C8953gT.c(f.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2529ahm b = C2528ahl.e.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2451agN(str, fVar, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2451agN c2451agN) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2451agN, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2451agN.d());
            interfaceC9069id.e("recentlyWatchedEntities");
            C8953gT.d(C8953gT.c(f.b, false, 1, null)).e(interfaceC9069id, c9028hp, c2451agN.b());
            C2528ahl.e.e.e(interfaceC9069id, c9028hp, c2451agN.a());
        }
    }

    private C2456agS() {
    }

    /* renamed from: o.agS$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C2451agN.f> {
        public static final f b = new f();
        private static final List<String> e;

        private f() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2451agN.f b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.a, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2451agN.f(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2451agN.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, fVar.b());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.a, false, 1, null)))).e(interfaceC9069id, c9028hp, fVar.c());
        }
    }

    /* renamed from: o.agS$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2451agN.d> {
        public static final a a = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2451agN.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2451agN.a aVar = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    aVar = (C2451agN.a) C8953gT.d(C8953gT.c(d.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2451agN.d(str, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2451agN.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.c(d.a, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.e());
        }
    }

    /* renamed from: o.agS$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2451agN.a> {
        public static final d a = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "reference");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2451agN.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2451agN.g gVar = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    gVar = (C2451agN.g) C8953gT.d(C8953gT.a(h.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2451agN.a(str, gVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2451agN.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.e());
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(h.c, true)).e(interfaceC9069id, c9028hp, aVar.d());
        }
    }

    /* renamed from: o.agS$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC8949gP<C2451agN.g> {
        private static final List<String> a;
        public static final h c = new h();

        private h() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2451agN.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C2451agN.b bVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2451agN.e eVar = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = e.a.b(jsonReader, c9028hp);
            } else {
                bVar = null;
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                eVar = g.e.b(jsonReader, c9028hp);
            }
            return new C2451agN.g(str, bVar, eVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2451agN.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.d());
            if (gVar.e() != null) {
                e.a.e(interfaceC9069id, c9028hp, gVar.e());
            }
            if (gVar.b() != null) {
                g.e.e(interfaceC9069id, c9028hp, gVar.b());
            }
        }
    }

    /* renamed from: o.agS$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2451agN.b> {
        public static final e a = new e();
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j(SignupConstants.Field.VIDEO_ID, "number", "hiddenEpisodeNumbers", "parentSeason", "parentShow");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2451agN.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            Integer num2 = null;
            Boolean bool = null;
            C2451agN.i iVar = null;
            C2451agN.h hVar = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    iVar = (C2451agN.i) C8953gT.d(C8953gT.c(i.d, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a2 != 4) {
                    break;
                } else {
                    hVar = (C2451agN.h) C8953gT.d(C8953gT.a(j.a, true)).b(jsonReader, c9028hp);
                }
            }
            if (num != null) {
                return new C2451agN.b(num.intValue(), num2, bool, iVar, hVar);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2451agN.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(bVar.b()));
            interfaceC9069id.e("number");
            C8953gT.n.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("hiddenEpisodeNumbers");
            C8953gT.l.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e("parentSeason");
            C8953gT.d(C8953gT.c(i.d, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e("parentShow");
            C8953gT.d(C8953gT.a(j.a, true)).e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* renamed from: o.agS$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<C2451agN.i> {
        private static final List<String> c;
        public static final i d = new i();

        private i() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "number", "numberLabelV2");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2451agN.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Integer num2 = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2451agN.i(str, num.intValue(), num2, str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2451agN.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.e());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(iVar.b()));
            interfaceC9069id.e("number");
            C8953gT.n.e(interfaceC9069id, c9028hp, iVar.a());
            interfaceC9069id.e("numberLabelV2");
            C8953gT.t.e(interfaceC9069id, c9028hp, iVar.c());
        }
    }

    /* renamed from: o.agS$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC8949gP<C2451agN.h> {
        public static final j a = new j();
        private static final List<String> c;

        private j() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2451agN.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2630ajh b = C2632ajj.e.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2451agN.h(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2451agN.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.d());
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, hVar.b());
        }
    }

    /* renamed from: o.agS$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<C2451agN.e> {
        private static final List<String> c;
        public static final g e = new g();

        private g() {
        }

        static {
            List<String> j;
            j = C8569dql.j(SignupConstants.Field.VIDEO_ID, "artwork", "titleTreatment");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2451agN.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            C2451agN.c cVar = null;
            C2451agN.j jVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    cVar = (C2451agN.c) C8953gT.d(C8953gT.c(b.a, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    jVar = (C2451agN.j) C8953gT.d(C8953gT.c(o.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (num != null) {
                return new C2451agN.e(num.intValue(), cVar, jVar);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2451agN.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(eVar.d()));
            interfaceC9069id.e("artwork");
            C8953gT.d(C8953gT.c(b.a, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e("titleTreatment");
            C8953gT.d(C8953gT.c(o.a, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    /* renamed from: o.agS$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2451agN.c> {
        public static final b a = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2451agN.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2451agN.c(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2451agN.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.b());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, cVar.c());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    /* renamed from: o.agS$o */
    /* loaded from: classes3.dex */
    public static final class o implements InterfaceC8949gP<C2451agN.j> {
        public static final o a = new o();
        private static final List<String> b;

        private o() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2451agN.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2451agN.j(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2451agN.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.a());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, jVar.b());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, jVar.d());
        }
    }
}
