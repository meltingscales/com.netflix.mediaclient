package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import j$.time.Instant;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2491ahA;
import o.C2493ahC;
import o.C2500ahJ;
import o.C2503ahM;

/* renamed from: o.ahQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2507ahQ {
    public static final C2507ahQ b = new C2507ahQ();

    /* renamed from: o.ahQ$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2500ahJ> {
        public static final c c = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.LANG_ID, "sessionId", "expires", "trackingInfo", "sections");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2500ahJ b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Instant instant = null;
            C2500ahJ.c cVar = null;
            C2500ahJ.a aVar = null;
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
                    cVar = (C2500ahJ.c) C8953gT.d(C8953gT.c(i.c, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    aVar = (C2500ahJ.a) C8953gT.d(C8953gT.c(b.d, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2500ahJ(str, str2, str3, instant, cVar, aVar);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.LANG_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2500ahJ c2500ahJ) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2500ahJ, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2500ahJ.f());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2500ahJ.c());
            interfaceC9069id.e("sessionId");
            C8953gT.d(interfaceC8949gP).e(interfaceC9069id, c9028hp, c2500ahJ.a());
            interfaceC9069id.e("expires");
            C8953gT.d(C8950gQ.c).e(interfaceC9069id, c9028hp, c2500ahJ.e());
            interfaceC9069id.e("trackingInfo");
            C8953gT.d(C8953gT.c(i.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2500ahJ.b());
            interfaceC9069id.e("sections");
            C8953gT.d(C8953gT.c(b.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2500ahJ.d());
        }
    }

    private C2507ahQ() {
    }

    /* renamed from: o.ahQ$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<C2500ahJ.c> {
        public static final i c = new i();
        private static final List<String> e;

        private i() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", Payload.PARAM_RENO_REQUEST_ID);
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2500ahJ.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(e);
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
                return new C2500ahJ.c(str, str2);
            } else {
                C8956gW.a(jsonReader, Payload.PARAM_RENO_REQUEST_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2500ahJ.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.a());
            interfaceC9069id.e(Payload.PARAM_RENO_REQUEST_ID);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    /* renamed from: o.ahQ$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2500ahJ.a> {
        private static final List<String> a;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount", "edges", "pageInfo");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2500ahJ.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            C2500ahJ.e eVar = null;
            List list = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(e.c, false, 1, null))).b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    eVar = (C2500ahJ.e) C8953gT.c(d.d, false, 1, null).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                int intValue = num.intValue();
                if (eVar != null) {
                    return new C2500ahJ.a(str, intValue, list, eVar);
                }
                C8956gW.a(jsonReader, "pageInfo");
                throw new KotlinNothingValueException();
            } else {
                C8956gW.a(jsonReader, "totalCount");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2500ahJ.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e("totalCount");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(aVar.a()));
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.c(e.c, false, 1, null))).e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e("pageInfo");
            C8953gT.c(d.d, false, 1, null).e(interfaceC9069id, c9028hp, aVar.e());
        }
    }

    /* renamed from: o.ahQ$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2500ahJ.b> {
        private static final List<String> a;
        public static final e c = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "cursor", "node");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2500ahJ.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            C2500ahJ.d dVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    dVar = (C2500ahJ.d) C8953gT.d(C8953gT.a(a.e, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2500ahJ.b(str, str2, dVar);
            } else {
                C8956gW.a(jsonReader, "cursor");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2500ahJ.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e("cursor");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(a.e, true)).e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* renamed from: o.ahQ$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2500ahJ.d> {
        private static final List<String> d;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            d = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2500ahJ.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C2494ahD c2494ahD;
            C2504ahN c2504ahN;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2542ahz c2542ahz = null;
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotCarouselSection", "PinotCreatorHomeSection", "PinotEntityNameListSection", "PinotGallerySection", "PinotListSection", "PinotPopularSearchesListSection", "PinotSearchHintsSection"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2494ahD = C2493ahC.a.a.b(jsonReader, c9028hp);
            } else {
                c2494ahD = null;
            }
            if (C9014hb.d(C9014hb.c("PinotPopularSearchesListSection"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2504ahN = C2503ahM.e.d.b(jsonReader, c9028hp);
            } else {
                c2504ahN = null;
            }
            if (C9014hb.d(C9014hb.c("PinotCreatorHomeSection"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2542ahz = C2491ahA.a.b.b(jsonReader, c9028hp);
            }
            return new C2500ahJ.d(str, c2494ahD, c2504ahN, c2542ahz);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2500ahJ.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.d());
            if (dVar.a() != null) {
                C2493ahC.a.a.e(interfaceC9069id, c9028hp, dVar.a());
            }
            if (dVar.c() != null) {
                C2503ahM.e.d.e(interfaceC9069id, c9028hp, dVar.c());
            }
            if (dVar.b() != null) {
                C2491ahA.a.b.e(interfaceC9069id, c9028hp, dVar.b());
            }
        }
    }

    /* renamed from: o.ahQ$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2500ahJ.e> {
        private static final List<String> a;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "hasNextPage");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2500ahJ.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(a);
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
                return new C2500ahJ.e(str, bool.booleanValue());
            } else {
                C8956gW.a(jsonReader, "hasNextPage");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2500ahJ.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("hasNextPage");
            C8953gT.i.e(interfaceC9069id, c9028hp, Boolean.valueOf(eVar.c()));
        }
    }
}
