package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2379afD;
import o.C2380afE;
import o.C2511ahU;
import o.C2632ajj;
import o.YO;

/* renamed from: o.abu  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2210abu {
    public static final C2210abu a = new C2210abu();

    /* renamed from: o.abu$d */
    /* loaded from: classes6.dex */
    public static final class d implements InterfaceC8949gP<YO.a> {
        public static final d a = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("myList", "gatewayRequestDetails", "trackId");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YO.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            YO.g gVar = null;
            YO.d dVar = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    gVar = (YO.g) C8953gT.d(C8953gT.c(e.c, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    dVar = (YO.d) C8953gT.d(C8953gT.c(a.d, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                }
            }
            if (num != null) {
                return new YO.a(gVar, dVar, num.intValue());
            }
            C8956gW.a(jsonReader, "trackId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YO.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("myList");
            C8953gT.d(C8953gT.c(e.c, false, 1, null)).e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e("gatewayRequestDetails");
            C8953gT.d(C8953gT.c(a.d, false, 1, null)).e(interfaceC9069id, c9028hp, aVar.e());
            interfaceC9069id.e("trackId");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(aVar.c()));
        }
    }

    private C2210abu() {
    }

    /* renamed from: o.abu$e */
    /* loaded from: classes6.dex */
    public static final class e implements InterfaceC8949gP<YO.g> {
        public static final e c = new e();
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount", "pageInfo", "edges");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public YO.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            YO.h hVar = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    hVar = (YO.h) C8953gT.d(C8953gT.c(f.e, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(b.b, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new YO.g(str, num, hVar, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YO.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.b());
            interfaceC9069id.e("totalCount");
            C8953gT.n.e(interfaceC9069id, c9028hp, gVar.d());
            interfaceC9069id.e("pageInfo");
            C8953gT.d(C8953gT.c(f.e, false, 1, null)).e(interfaceC9069id, c9028hp, gVar.a());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(b.b, false, 1, null)))).e(interfaceC9069id, c9028hp, gVar.c());
        }
    }

    /* renamed from: o.abu$f */
    /* loaded from: classes6.dex */
    public static final class f implements InterfaceC8949gP<YO.h> {
        private static final List<String> c;
        public static final f e = new f();

        private f() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "startCursor", "endCursor", "hasNextPage");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public YO.h b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new YO.h(str, str2, str3, bool.booleanValue());
            } else {
                C8956gW.a(jsonReader, "hasNextPage");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YO.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.a());
            interfaceC9069id.e("startCursor");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, hVar.b());
            interfaceC9069id.e("endCursor");
            c8994hH.e(interfaceC9069id, c9028hp, hVar.c());
            interfaceC9069id.e("hasNextPage");
            C8953gT.i.e(interfaceC9069id, c9028hp, Boolean.valueOf(hVar.e()));
        }
    }

    /* renamed from: o.abu$b */
    /* loaded from: classes6.dex */
    public static final class b implements InterfaceC8949gP<YO.b> {
        public static final b b = new b();
        private static final List<String> d;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "cursor", "node");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YO.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            YO.j jVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    jVar = (YO.j) C8953gT.d(C8953gT.a(g.e, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new YO.b(str, str2, jVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YO.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e("cursor");
            C8953gT.t.e(interfaceC9069id, c9028hp, bVar.c());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(g.e, true)).e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    /* renamed from: o.abu$g */
    /* loaded from: classes6.dex */
    public static final class g implements InterfaceC8949gP<YO.j> {
        private static final List<String> a;
        public static final g e = new g();

        private g() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_TITLE, "artwork");
            a = j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YO.j b(JsonReader jsonReader, C9028hp c9028hp) {
            List list;
            C2630ajh c2630ajh;
            C2514ahX c2514ahX;
            C2383afH c2383afH;
            C2382afG c2382afG;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list2 = null;
            String str = null;
            String str2 = null;
            YO.e eVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    list = list2;
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    list = list2;
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    list = null;
                    eVar = (YO.e) C8953gT.d(C8953gT.c(c.d, false, 1, null)).b(jsonReader, c9028hp);
                }
                list2 = list;
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, list2)) {
                jsonReader.q();
                c2630ajh = C2632ajj.e.b.b(jsonReader, c9028hp);
            } else {
                c2630ajh = list2;
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, list2)) {
                jsonReader.q();
                c2514ahX = C2511ahU.e.e.b(jsonReader, c9028hp);
            } else {
                c2514ahX = list2;
            }
            C2514ahX c2514ahX2 = c2514ahX;
            if (C9014hb.d(C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), C9014hb.e("includeLiveData")), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2383afH = C2379afD.c.a.b(jsonReader, c9028hp);
            } else {
                c2383afH = null;
            }
            if (C9014hb.d(C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), C9014hb.e("includeLiveData")), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2382afG = C2380afE.c.a.b(jsonReader, c9028hp);
            } else {
                c2382afG = null;
            }
            return new YO.j(str, str2, eVar, c2630ajh, c2514ahX2, c2383afH, c2382afG);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YO.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.i());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, jVar.c());
            interfaceC9069id.e("artwork");
            C8953gT.d(C8953gT.c(c.d, false, 1, null)).e(interfaceC9069id, c9028hp, jVar.d());
            if (jVar.g() != null) {
                C2632ajj.e.b.e(interfaceC9069id, c9028hp, jVar.g());
            }
            if (jVar.e() != null) {
                C2511ahU.e.e.e(interfaceC9069id, c9028hp, jVar.e());
            }
            if (jVar.b() != null) {
                C2379afD.c.a.e(interfaceC9069id, c9028hp, jVar.b());
            }
            if (jVar.a() != null) {
                C2380afE.c.a.e(interfaceC9069id, c9028hp, jVar.a());
            }
        }
    }

    /* renamed from: o.abu$c */
    /* loaded from: classes6.dex */
    public static final class c implements InterfaceC8949gP<YO.e> {
        private static final List<String> a;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YO.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a2 = jsonReader.a(a);
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
                return new YO.e(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YO.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    /* renamed from: o.abu$a */
    /* loaded from: classes6.dex */
    public static final class a implements InterfaceC8949gP<YO.d> {
        private static final List<String> c;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", Payload.PARAM_RENO_REQUEST_ID);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YO.d b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new YO.d(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YO.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e(Payload.PARAM_RENO_REQUEST_ID);
            C8953gT.t.e(interfaceC9069id, c9028hp, dVar.d());
        }
    }
}
