package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import j$.time.Instant;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2326aeD;
import o.C2327aeE;
import o.C2367aes;

/* renamed from: o.aez  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2374aez {
    public static final C2374aez b = new C2374aez();

    /* renamed from: o.aez$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2367aes> {
        public static final b b = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "description", "videoMerchComputeId", "actions", "launchDate", "promotedVideoId", "contextualSynopsis", "brandAndGenreArtwork", "topNode", "horzDispImage", "titleTreatmentUnbranded");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2367aes b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            List list = null;
            Instant instant = null;
            Integer num = null;
            C2367aes.d dVar = null;
            C2367aes.e eVar = null;
            C2367aes.g gVar = null;
            C2367aes.b bVar = null;
            C2367aes.h hVar = null;
            while (true) {
                switch (jsonReader.a(e)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.d, false, 1, null)))).b(jsonReader, c9028hp);
                        break;
                    case 4:
                        instant = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                        break;
                    case 5:
                        num = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        dVar = (C2367aes.d) C8953gT.d(C8953gT.c(e.b, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 7:
                        eVar = (C2367aes.e) C8953gT.d(C8953gT.c(d.e, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 8:
                        gVar = (C2367aes.g) C8953gT.d(C8953gT.a(j.e, true)).b(jsonReader, c9028hp);
                        break;
                    case 9:
                        bVar = (C2367aes.b) C8953gT.d(C8953gT.c(f.e, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 10:
                        hVar = (C2367aes.h) C8953gT.d(C8953gT.c(h.a, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str != null) {
                            return new C2367aes(str, str2, str3, list, instant, num, dVar, eVar, gVar, bVar, hVar);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2367aes c2367aes) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2367aes, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2367aes.l());
            interfaceC9069id.e("description");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, c2367aes.b());
            interfaceC9069id.e("videoMerchComputeId");
            c8994hH.e(interfaceC9069id, c9028hp, c2367aes.g());
            interfaceC9069id.e("actions");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.d, false, 1, null)))).e(interfaceC9069id, c9028hp, c2367aes.a());
            interfaceC9069id.e("launchDate");
            C8953gT.d(C8950gQ.c).e(interfaceC9069id, c9028hp, c2367aes.h());
            interfaceC9069id.e("promotedVideoId");
            C8953gT.n.e(interfaceC9069id, c9028hp, c2367aes.j());
            interfaceC9069id.e("contextualSynopsis");
            C8953gT.d(C8953gT.c(e.b, false, 1, null)).e(interfaceC9069id, c9028hp, c2367aes.c());
            interfaceC9069id.e("brandAndGenreArtwork");
            C8953gT.d(C8953gT.c(d.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2367aes.e());
            interfaceC9069id.e("topNode");
            C8953gT.d(C8953gT.a(j.e, true)).e(interfaceC9069id, c9028hp, c2367aes.f());
            interfaceC9069id.e("horzDispImage");
            C8953gT.d(C8953gT.c(f.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2367aes.d());
            interfaceC9069id.e("titleTreatmentUnbranded");
            C8953gT.d(C8953gT.c(h.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2367aes.i());
        }
    }

    private C2374aez() {
    }

    /* renamed from: o.aez$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2367aes.c> {
        public static final a d = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "actionKind");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2367aes.c b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2367aes.c(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2367aes.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e("actionKind");
            C8953gT.t.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    /* renamed from: o.aez$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2367aes.d> {
        public static final e b = new e();
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "text", "evidenceKey");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2367aes.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2367aes.d(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2367aes.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e("text");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("evidenceKey");
            c8994hH.e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    /* renamed from: o.aez$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2367aes.e> {
        private static final List<String> a;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY, "available");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2367aes.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2367aes.e(str, str2, str3, bool);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2367aes.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.d());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("available");
            C8953gT.l.e(interfaceC9069id, c9028hp, eVar.e());
        }
    }

    /* renamed from: o.aez$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC8949gP<C2367aes.g> {
        private static final List<String> a;
        public static final j e = new j();

        private j() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            a = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2367aes.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C2367aes.i iVar;
            C2324aeB c2324aeB;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2371aew c2371aew = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                iVar = g.a.b(jsonReader, c9028hp);
            } else {
                iVar = null;
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2324aeB = C2326aeD.d.c.b(jsonReader, c9028hp);
            } else {
                c2324aeB = null;
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2371aew = C2327aeE.e.b.b(jsonReader, c9028hp);
            }
            return new C2367aes.g(str, iVar, c2324aeB, c2371aew);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2367aes.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.c());
            if (gVar.b() != null) {
                g.a.e(interfaceC9069id, c9028hp, gVar.b());
            }
            if (gVar.d() != null) {
                C2326aeD.d.c.e(interfaceC9069id, c9028hp, gVar.d());
            }
            if (gVar.e() != null) {
                C2327aeE.e.b.e(interfaceC9069id, c9028hp, gVar.e());
            }
        }
    }

    /* renamed from: o.aez$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<C2367aes.i> {
        public static final g a = new g();
        private static final List<String> d;

        private g() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("features");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2367aes.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2367aes.a aVar = null;
            while (jsonReader.a(d) == 0) {
                aVar = (C2367aes.a) C8953gT.d(C8953gT.c(c.e, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C2367aes.i(aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2367aes.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("features");
            C8953gT.d(C8953gT.c(c.e, false, 1, null)).e(interfaceC9069id, c9028hp, iVar.b());
        }
    }

    /* renamed from: o.aez$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2367aes.a> {
        private static final List<String> b;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "modes");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2367aes.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.p)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2367aes.a(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2367aes.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.e());
            interfaceC9069id.e("modes");
            C8953gT.d(C8953gT.a(interfaceC8949gP)).e(interfaceC9069id, c9028hp, aVar.c());
        }
    }

    /* renamed from: o.aez$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C2367aes.b> {
        private static final List<String> b;
        public static final f e = new f();

        private f() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY, "available");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2367aes.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2367aes.b(str, str2, str3, bool);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2367aes.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("available");
            C8953gT.l.e(interfaceC9069id, c9028hp, bVar.b());
        }
    }

    /* renamed from: o.aez$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC8949gP<C2367aes.h> {
        public static final h a = new h();
        private static final List<String> d;

        private h() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY, "available");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2367aes.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2367aes.h(str, str2, str3, bool);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2367aes.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.a());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, hVar.e());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, hVar.b());
            interfaceC9069id.e("available");
            C8953gT.l.e(interfaceC9069id, c9028hp, hVar.c());
        }
    }
}
