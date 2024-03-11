package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2535ahs;
import o.YN;

/* renamed from: o.abt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2209abt {
    public static final C2209abt a = new C2209abt();

    /* renamed from: o.abt$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<YN.c> {
        private static final List<String> b;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("myListGames");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YN.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YN.e eVar = null;
            while (jsonReader.a(b) == 0) {
                eVar = (YN.e) C8953gT.d(C8953gT.c(d.c, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new YN.c(eVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YN.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("myListGames");
            C8953gT.d(C8953gT.c(d.c, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    private C2209abt() {
    }

    /* renamed from: o.abt$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<YN.e> {
        private static final List<String> b;
        public static final d c = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.LANG_ID, "totalCount", "trackId", "pageInfo", "edges");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YN.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            Integer num = null;
            Integer num2 = null;
            YN.g gVar = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = (String) C8953gT.d(C8953gT.p).b(jsonReader, c9028hp);
                } else if (a == 2) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 4) {
                    gVar = (YN.g) C8953gT.d(C8953gT.c(c.b, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(b.c, false, 1, null))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new YN.e(str, str2, num, num2, gVar, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YN.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, eVar.f());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            C8953gT.d(interfaceC8949gP).e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("totalCount");
            C8994hH<Integer> c8994hH = C8953gT.n;
            c8994hH.e(interfaceC9069id, c9028hp, eVar.e());
            interfaceC9069id.e("trackId");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("pageInfo");
            C8953gT.d(C8953gT.c(c.b, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.c(b.c, false, 1, null))).e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    /* renamed from: o.abt$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<YN.g> {
        public static final c b = new c();
        private static final List<String> c;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "startCursor", "endCursor", "hasNextPage");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YN.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    bool = C8953gT.i.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (bool != null) {
                return new YN.g(str, str2, str3, bool.booleanValue());
            } else {
                C8956gW.a(jsonReader, "hasNextPage");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YN.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.c());
            interfaceC9069id.e("startCursor");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, gVar.e());
            interfaceC9069id.e("endCursor");
            c8994hH.e(interfaceC9069id, c9028hp, gVar.b());
            interfaceC9069id.e("hasNextPage");
            C8953gT.i.e(interfaceC9069id, c9028hp, Boolean.valueOf(gVar.d()));
        }
    }

    /* renamed from: o.abt$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<YN.b> {
        private static final List<String> b;
        public static final b c = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YN.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            YN.d dVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    dVar = (YN.d) C8953gT.d(C8953gT.a(e.a, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new YN.b(str, dVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YN.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(e.a, true)).e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    /* renamed from: o.abt$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<YN.d> {
        public static final e a = new e();
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "gameId");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public YN.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2534ahr b = C2535ahs.c.e.b(jsonReader, c9028hp);
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new YN.d(str, num.intValue(), b);
            } else {
                C8956gW.a(jsonReader, "gameId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YN.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e("gameId");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(dVar.c()));
            C2535ahs.c.e.e(interfaceC9069id, c9028hp, dVar.e());
        }
    }
}
