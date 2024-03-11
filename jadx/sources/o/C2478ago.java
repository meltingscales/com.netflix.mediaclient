package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2473agj;
import o.C2476agm;

/* renamed from: o.ago  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2478ago {
    public static final C2478ago a = new C2478ago();

    /* renamed from: o.ago$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2476agm> {
        public static final b a = new b();
        private static final List<String> d;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "gamesGenreEntities");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2476agm b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2476agm.d dVar = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    dVar = (C2476agm.d) C8953gT.d(C8953gT.c(c.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2475agl b = C2473agj.a.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2476agm(str, dVar, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2476agm c2476agm) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2476agm, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2476agm.d());
            interfaceC9069id.e("gamesGenreEntities");
            C8953gT.d(C8953gT.c(c.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2476agm.e());
            C2473agj.a.d.e(interfaceC9069id, c9028hp, c2476agm.a());
        }
    }

    private C2478ago() {
    }

    /* renamed from: o.ago$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2476agm.d> {
        public static final c c = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2476agm.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(d.b, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2476agm.d(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2476agm.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(d.b, false, 1, null)))).e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    /* renamed from: o.ago$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2476agm.c> {
        public static final d b = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2476agm.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2476agm.e eVar = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    eVar = (C2476agm.e) C8953gT.d(C8953gT.c(a.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2476agm.c(str, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2476agm.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.c(a.c, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.c());
        }
    }

    /* renamed from: o.ago$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2476agm.e> {
        public static final a c = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "reference");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2476agm.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2476agm.a aVar = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    aVar = (C2476agm.a) C8953gT.d(C8953gT.a(i.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2476agm.e(str, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2476agm.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(i.c, true)).e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    /* renamed from: o.ago$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<C2476agm.a> {
        private static final List<String> a;
        public static final i c = new i();

        private i() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2476agm.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2476agm.b bVar = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = e.d.b(jsonReader, c9028hp);
            }
            return new C2476agm.a(str, bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2476agm.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.b());
            if (aVar.e() != null) {
                e.d.e(interfaceC9069id, c9028hp, aVar.e());
            }
        }
    }

    /* renamed from: o.ago$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2476agm.b> {
        private static final List<String> a;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("gameId", "tags");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2476agm.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            List list = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(f.b, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (num != null) {
                return new C2476agm.b(num.intValue(), list);
            }
            C8956gW.a(jsonReader, "gameId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2476agm.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("gameId");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(bVar.d()));
            interfaceC9069id.e("tags");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(f.b, false, 1, null)))).e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* renamed from: o.ago$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C2476agm.g> {
        public static final f b = new f();
        private static final List<String> c;

        private f() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.LANG_ID, "displayName");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2476agm.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2476agm.g(str, num, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2476agm.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.b());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            C8953gT.n.e(interfaceC9069id, c9028hp, gVar.a());
            interfaceC9069id.e("displayName");
            C8953gT.t.e(interfaceC9069id, c9028hp, gVar.d());
        }
    }
}
