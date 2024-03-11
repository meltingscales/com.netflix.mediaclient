package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import j$.time.Instant;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2414afm;
import o.C2428afr;
import o.C2429afs;

/* renamed from: o.afp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2421afp {
    public static final C2421afp b = new C2421afp();

    /* renamed from: o.afp$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2428afr> {
        private static final List<String> a;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.LANG_ID, "sessionId", "expires", "trackingInfo", "sections");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2428afr b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Instant instant = null;
            C2428afr.e eVar = null;
            C2428afr.d dVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    str3 = (String) C8953gT.d(C8953gT.p).b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    instant = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                } else if (a2 == 4) {
                    eVar = (C2428afr.e) C8953gT.d(C8953gT.c(f.d, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a2 != 5) {
                    break;
                } else {
                    dVar = (C2428afr.d) C8953gT.d(C8953gT.c(c.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2428afr(str, str2, str3, instant, eVar, dVar);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.LANG_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2428afr c2428afr) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2428afr, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2428afr.g());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2428afr.c());
            interfaceC9069id.e("sessionId");
            C8953gT.d(interfaceC8949gP).e(interfaceC9069id, c9028hp, c2428afr.e());
            interfaceC9069id.e("expires");
            C8953gT.d(C8950gQ.c).e(interfaceC9069id, c9028hp, c2428afr.a());
            interfaceC9069id.e("trackingInfo");
            C8953gT.d(C8953gT.c(f.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2428afr.b());
            interfaceC9069id.e("sections");
            C8953gT.d(C8953gT.c(c.b, false, 1, null)).e(interfaceC9069id, c9028hp, c2428afr.d());
        }
    }

    private C2421afp() {
    }

    /* renamed from: o.afp$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C2428afr.e> {
        private static final List<String> b;
        public static final f d = new f();

        private f() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", Payload.PARAM_RENO_REQUEST_ID);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2428afr.e b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2428afr.e(str, str2);
            } else {
                C8956gW.a(jsonReader, Payload.PARAM_RENO_REQUEST_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2428afr.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e(Payload.PARAM_RENO_REQUEST_ID);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    /* renamed from: o.afp$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2428afr.d> {
        private static final List<String> a;
        public static final c b = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount", "edges", "pageInfo");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2428afr.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            C2428afr.b bVar = null;
            List list = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(e.b, false, 1, null))).b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    bVar = (C2428afr.b) C8953gT.c(a.c, false, 1, null).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                int intValue = num.intValue();
                if (bVar != null) {
                    return new C2428afr.d(str, intValue, list, bVar);
                }
                C8956gW.a(jsonReader, "pageInfo");
                throw new KotlinNothingValueException();
            } else {
                C8956gW.a(jsonReader, "totalCount");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2428afr.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e("totalCount");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(dVar.d()));
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.c(e.b, false, 1, null))).e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("pageInfo");
            C8953gT.c(a.c, false, 1, null).e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    /* renamed from: o.afp$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2428afr.c> {
        public static final e b = new e();
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "cursor", "node");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2428afr.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            C2428afr.a aVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    aVar = (C2428afr.a) C8953gT.d(C8953gT.a(b.b, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2428afr.c(str, str2, aVar);
            } else {
                C8956gW.a(jsonReader, "cursor");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2428afr.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.c());
            interfaceC9069id.e("cursor");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.b());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(b.b, true)).e(interfaceC9069id, c9028hp, cVar.e());
        }
    }

    /* renamed from: o.afp$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2428afr.a> {
        public static final b b = new b();
        private static final List<String> c;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2428afr.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C2415afn c2415afn;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2411afj c2411afj = null;
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotCarouselSection", "PinotCreatorHomeSection", "PinotEntityNameListSection", "PinotGallerySection", "PinotListSection", "PinotPopularSearchesListSection", "PinotSearchHintsSection"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2415afn = C2429afs.b.e.b(jsonReader, c9028hp);
            } else {
                c2415afn = null;
            }
            if (C9014hb.d(C9014hb.c("PinotCarouselSection", "PinotGallerySection", "PinotListSection", "PinotSingleItemSection"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2411afj = C2414afm.d.a.b(jsonReader, c9028hp);
            }
            return new C2428afr.a(str, c2415afn, c2411afj);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2428afr.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            if (aVar.a() != null) {
                C2429afs.b.e.e(interfaceC9069id, c9028hp, aVar.a());
            }
            if (aVar.d() != null) {
                C2414afm.d.a.e(interfaceC9069id, c9028hp, aVar.d());
            }
        }
    }

    /* renamed from: o.afp$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2428afr.b> {
        private static final List<String> a;
        public static final a c = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "hasNextPage");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2428afr.b b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C2428afr.b(str, bool.booleanValue());
            } else {
                C8956gW.a(jsonReader, "hasNextPage");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2428afr.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.c());
            interfaceC9069id.e("hasNextPage");
            C8953gT.i.e(interfaceC9069id, c9028hp, Boolean.valueOf(bVar.b()));
        }
    }
}
