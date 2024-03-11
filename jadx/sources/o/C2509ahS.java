package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import j$.time.Instant;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2496ahF;
import o.C2497ahG;
import o.C2508ahR;

/* renamed from: o.ahS  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2509ahS {
    public static final C2509ahS c = new C2509ahS();

    /* renamed from: o.ahS$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2508ahR> {
        private static final List<String> d;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.LANG_ID, "sessionId", "expires", "trackingInfo", "sections");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2508ahR b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Instant instant = null;
            C2508ahR.d dVar = null;
            C2508ahR.b bVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str3 = (String) C8953gT.d(C8953gT.p).b(jsonReader, c9028hp);
                } else if (a == 3) {
                    instant = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                } else if (a == 4) {
                    dVar = (C2508ahR.d) C8953gT.d(C8953gT.c(g.c, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    bVar = (C2508ahR.b) C8953gT.d(C8953gT.c(b.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2508ahR(str, str2, str3, instant, dVar, bVar);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.LANG_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2508ahR c2508ahR) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2508ahR, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2508ahR.i());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2508ahR.d());
            interfaceC9069id.e("sessionId");
            C8953gT.d(interfaceC8949gP).e(interfaceC9069id, c9028hp, c2508ahR.e());
            interfaceC9069id.e("expires");
            C8953gT.d(C8950gQ.c).e(interfaceC9069id, c9028hp, c2508ahR.c());
            interfaceC9069id.e("trackingInfo");
            C8953gT.d(C8953gT.c(g.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2508ahR.a());
            interfaceC9069id.e("sections");
            C8953gT.d(C8953gT.c(b.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2508ahR.b());
        }
    }

    private C2509ahS() {
    }

    /* renamed from: o.ahS$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<C2508ahR.d> {
        private static final List<String> a;
        public static final g c = new g();

        private g() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", Payload.PARAM_RENO_REQUEST_ID);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2508ahR.d b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2508ahR.d(str, str2);
            } else {
                C8956gW.a(jsonReader, Payload.PARAM_RENO_REQUEST_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2508ahR.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e(Payload.PARAM_RENO_REQUEST_ID);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    /* renamed from: o.ahS$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2508ahR.b> {
        private static final List<String> c;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount", "edges", "pageInfo");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2508ahR.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            C2508ahR.e eVar = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(c.e, false, 1, null))).b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    eVar = (C2508ahR.e) C8953gT.c(d.a, false, 1, null).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                int intValue = num.intValue();
                if (eVar != null) {
                    return new C2508ahR.b(str, intValue, list, eVar);
                }
                C8956gW.a(jsonReader, "pageInfo");
                throw new KotlinNothingValueException();
            } else {
                C8956gW.a(jsonReader, "totalCount");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2508ahR.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e("totalCount");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(bVar.a()));
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.c(c.e, false, 1, null))).e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e("pageInfo");
            C8953gT.c(d.a, false, 1, null).e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* renamed from: o.ahS$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2508ahR.c> {
        private static final List<String> a;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "cursor", "node");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2508ahR.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            C2508ahR.a aVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    aVar = (C2508ahR.a) C8953gT.d(C8953gT.a(e.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2508ahR.c(str, str2, aVar);
            } else {
                C8956gW.a(jsonReader, "cursor");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2508ahR.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e("cursor");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.c());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(e.c, true)).e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    /* renamed from: o.ahS$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2508ahR.a> {
        private static final List<String> b;
        public static final e c = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2508ahR.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C2499ahI c2499ahI;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2498ahH c2498ahH = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotCarouselSection", "PinotCreatorHomeSection", "PinotEntityNameListSection", "PinotGallerySection", "PinotListSection", "PinotPopularSearchesListSection", "PinotSearchHintsSection"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2499ahI = C2497ahG.e.b.b(jsonReader, c9028hp);
            } else {
                c2499ahI = null;
            }
            if (C9014hb.d(C9014hb.c("PinotCarouselSection", "PinotGallerySection", "PinotListSection", "PinotSingleItemSection"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2498ahH = C2496ahF.a.e.b(jsonReader, c9028hp);
            }
            return new C2508ahR.a(str, c2499ahI, c2498ahH);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2508ahR.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.b());
            if (aVar.e() != null) {
                C2497ahG.e.b.e(interfaceC9069id, c9028hp, aVar.e());
            }
            if (aVar.c() != null) {
                C2496ahF.a.e.e(interfaceC9069id, c9028hp, aVar.c());
            }
        }
    }

    /* renamed from: o.ahS$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2508ahR.e> {
        public static final d a = new d();
        private static final List<String> b;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "hasNextPage");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2508ahR.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    bool = C8953gT.i.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (bool != null) {
                return new C2508ahR.e(str, bool.booleanValue());
            } else {
                C8956gW.a(jsonReader, "hasNextPage");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2508ahR.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("hasNextPage");
            C8953gT.i.e(interfaceC9069id, c9028hp, Boolean.valueOf(eVar.a()));
        }
    }
}
