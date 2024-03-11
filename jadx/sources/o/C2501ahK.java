package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2346aeX;
import o.C2502ahL;
import o.C2511ahU;
import o.C2632ajj;

/* renamed from: o.ahK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2501ahK {
    public static final C2501ahK b = new C2501ahK();

    /* renamed from: o.ahK$r */
    /* loaded from: classes3.dex */
    public static final class r implements InterfaceC8949gP<C2502ahL> {
        private static final List<String> c;
        public static final r e = new r();

        private r() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2502ahL b(JsonReader jsonReader, C9028hp c9028hp) {
            C2502ahL.g gVar;
            C2502ahL.h hVar;
            C2502ahL.i iVar;
            C2502ahL.k kVar;
            C2502ahL.n nVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2502ahL.o oVar = null;
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotBoxShotEntityTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                gVar = h.c.b(jsonReader, c9028hp);
            } else {
                gVar = null;
            }
            if (C9014hb.d(C9014hb.c("PinotHorizontalArtworkWithPlaybackEntityTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                hVar = f.a.b(jsonReader, c9028hp);
            } else {
                hVar = null;
            }
            if (C9014hb.d(C9014hb.c("PinotAppIconEntityTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                iVar = i.d.b(jsonReader, c9028hp);
            } else {
                iVar = null;
            }
            if (C9014hb.d(C9014hb.c("PinotSuggestionEntityTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                kVar = n.a.b(jsonReader, c9028hp);
            } else {
                kVar = null;
            }
            if (C9014hb.d(C9014hb.c("PinotAppIconBillboardEntityTreatment", "PinotAppIconEntityTreatment", "PinotAwardsBillboardEntityTreatment", "PinotBannerWithTrailerEntityTreatment", "PinotBasicSearchEntity", "PinotBoxShotEntityTreatment", "PinotBoxShotWithRankEntityTreatment", "PinotBoxshotWithReminderEntityTreatment", "PinotCharacterCircleEntityTreatment", "PinotContinueWatchingEntityTreatment", "PinotCreatorHomeEntityTreatment", "PinotDoubleWideBoxshotEntityTreatment", "PinotEpisodicBillboardEntityTreatment", "PinotHorizontalArtworkWithPlaybackEntityTreatment", "PinotStandardBillboardEntityTreatment", "PinotTallPanelEntityTreatment", "PinotTitleCardWithCharacterEntityTreatment", "PinotTrailerWithAppIconEntityTreatment", "PinotTripleWideBoxshotEntityTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                nVar = k.b.b(jsonReader, c9028hp);
            } else {
                nVar = null;
            }
            if (C9014hb.d(C9014hb.c("PinotTextEntity"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                oVar = m.c.b(jsonReader, c9028hp);
            }
            return new C2502ahL(str, gVar, hVar, iVar, kVar, nVar, oVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2502ahL c2502ahL) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2502ahL, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2502ahL.j());
            if (c2502ahL.a() != null) {
                h.c.e(interfaceC9069id, c9028hp, c2502ahL.a());
            }
            if (c2502ahL.b() != null) {
                f.a.e(interfaceC9069id, c9028hp, c2502ahL.b());
            }
            if (c2502ahL.c() != null) {
                i.d.e(interfaceC9069id, c9028hp, c2502ahL.c());
            }
            if (c2502ahL.d() != null) {
                n.a.e(interfaceC9069id, c9028hp, c2502ahL.d());
            }
            if (c2502ahL.h() != null) {
                k.b.e(interfaceC9069id, c9028hp, c2502ahL.h());
            }
            if (c2502ahL.e() != null) {
                m.c.e(interfaceC9069id, c9028hp, c2502ahL.e());
            }
        }
    }

    private C2501ahK() {
    }

    /* renamed from: o.ahK$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC8949gP<C2502ahL.g> {
        private static final List<String> a;
        public static final h c = new h();

        private h() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "contextualArtwork");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2502ahL.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2502ahL.d dVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    dVar = (C2502ahL.d) C8953gT.d(C8953gT.c(b.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2502ahL.g(str, dVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2502ahL.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.c());
            interfaceC9069id.e("contextualArtwork");
            C8953gT.d(C8953gT.c(b.c, false, 1, null)).e(interfaceC9069id, c9028hp, gVar.d());
        }
    }

    /* renamed from: o.ahK$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2502ahL.d> {
        private static final List<String> a;
        public static final b c = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "artwork");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2502ahL.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2502ahL.e eVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    eVar = (C2502ahL.e) C8953gT.d(C8953gT.c(c.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2502ahL.d(str, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2502ahL.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e("artwork");
            C8953gT.d(C8953gT.c(c.a, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    /* renamed from: o.ahK$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2502ahL.e> {
        public static final c a = new c();
        private static final List<String> b;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2502ahL.e b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C2502ahL.e(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2502ahL.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, eVar.a());
        }
    }

    /* renamed from: o.ahK$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C2502ahL.h> {
        public static final f a = new f();
        private static final List<String> e;

        private f() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "contextualArtwork", "unifiedEntity");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2502ahL.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2502ahL.a aVar = null;
            C2502ahL.q qVar = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    aVar = (C2502ahL.a) C8953gT.d(C8953gT.c(d.e, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    qVar = (C2502ahL.q) C8953gT.d(C8953gT.a(s.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2502ahL.h(str, aVar, qVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2502ahL.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.a());
            interfaceC9069id.e("contextualArtwork");
            C8953gT.d(C8953gT.c(d.e, false, 1, null)).e(interfaceC9069id, c9028hp, hVar.b());
            interfaceC9069id.e("unifiedEntity");
            C8953gT.d(C8953gT.a(s.c, true)).e(interfaceC9069id, c9028hp, hVar.d());
        }
    }

    /* renamed from: o.ahK$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2502ahL.a> {
        private static final List<String> a;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "artwork");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2502ahL.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2502ahL.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    cVar = (C2502ahL.c) C8953gT.d(C8953gT.c(a.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2502ahL.a(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2502ahL.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e("artwork");
            C8953gT.d(C8953gT.c(a.e, false, 1, null)).e(interfaceC9069id, c9028hp, aVar.d());
        }
    }

    /* renamed from: o.ahK$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2502ahL.c> {
        private static final List<String> d;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2502ahL.c b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C2502ahL.c(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2502ahL.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    /* renamed from: o.ahK$s */
    /* loaded from: classes3.dex */
    public static final class s implements InterfaceC8949gP<C2502ahL.q> {
        public static final s c = new s();
        private static final List<String> e;

        private s() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntityId");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2502ahL.q b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2502ahL.m mVar = null;
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
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                mVar = o.a.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new C2502ahL.q(str, str2, mVar);
            }
            C8956gW.a(jsonReader, "unifiedEntityId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2502ahL.q qVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) qVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, qVar.b());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, qVar.e());
            if (qVar.c() != null) {
                o.a.e(interfaceC9069id, c9028hp, qVar.c());
            }
        }
    }

    /* renamed from: o.ahK$o */
    /* loaded from: classes3.dex */
    public static final class o implements InterfaceC8949gP<C2502ahL.m> {
        public static final o a = new o();

        private o() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2502ahL.m b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C2502ahL.m(C2511ahU.e.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2502ahL.m mVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) mVar, "");
            C2511ahU.e.e.e(interfaceC9069id, c9028hp, mVar.a());
        }
    }

    /* renamed from: o.ahK$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<C2502ahL.i> {
        private static final List<String> a;
        public static final i d = new i();

        private i() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "contextualArtwork");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2502ahL.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2502ahL.f fVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    fVar = (C2502ahL.f) C8953gT.d(C8953gT.c(j.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2502ahL.i(str, fVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2502ahL.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.e());
            interfaceC9069id.e("contextualArtwork");
            C8953gT.d(C8953gT.c(j.b, false, 1, null)).e(interfaceC9069id, c9028hp, iVar.a());
        }
    }

    /* renamed from: o.ahK$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC8949gP<C2502ahL.f> {
        public static final j b = new j();
        private static final List<String> c;

        private j() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "artwork");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2502ahL.f b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2502ahL.b bVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    bVar = (C2502ahL.b) C8953gT.d(C8953gT.c(e.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2502ahL.f(str, bVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2502ahL.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, fVar.b());
            interfaceC9069id.e("artwork");
            C8953gT.d(C8953gT.c(e.b, false, 1, null)).e(interfaceC9069id, c9028hp, fVar.e());
        }
    }

    /* renamed from: o.ahK$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2502ahL.b> {
        public static final e b = new e();
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2502ahL.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(c);
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
                return new C2502ahL.b(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2502ahL.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* renamed from: o.ahK$n */
    /* loaded from: classes3.dex */
    public static final class n implements InterfaceC8949gP<C2502ahL.k> {
        public static final n a = new n();
        private static final List<String> b;

        private n() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "displayString", "showCollectionIcon", "suggestionEntityId");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2502ahL.k b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2502ahL.k(str, str3, bool, str2);
            } else {
                C8956gW.a(jsonReader, "suggestionEntityId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2502ahL.k kVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) kVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, kVar.b());
            interfaceC9069id.e("displayString");
            C8953gT.t.e(interfaceC9069id, c9028hp, kVar.d());
            interfaceC9069id.e("showCollectionIcon");
            C8953gT.l.e(interfaceC9069id, c9028hp, kVar.e());
            interfaceC9069id.e("suggestionEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, kVar.c());
        }
    }

    /* renamed from: o.ahK$k */
    /* loaded from: classes3.dex */
    public static final class k implements InterfaceC8949gP<C2502ahL.n> {
        private static final List<String> a;
        public static final k b = new k();

        private k() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntity", "displayString");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2502ahL.n b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2502ahL.p pVar = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    pVar = (C2502ahL.p) C8953gT.d(C8953gT.a(p.a, true)).b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2502ahL.n(str, pVar, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2502ahL.n nVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) nVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, nVar.a());
            interfaceC9069id.e("unifiedEntity");
            C8953gT.d(C8953gT.a(p.a, true)).e(interfaceC9069id, c9028hp, nVar.c());
            interfaceC9069id.e("displayString");
            C8953gT.t.e(interfaceC9069id, c9028hp, nVar.d());
        }
    }

    /* renamed from: o.ahK$p */
    /* loaded from: classes3.dex */
    public static final class p implements InterfaceC8949gP<C2502ahL.p> {
        public static final p a = new p();
        private static final List<String> d;

        private p() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntityId");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2502ahL.p b(JsonReader jsonReader, C9028hp c9028hp) {
            C2502ahL.l lVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2502ahL.j jVar = null;
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                lVar = l.b.b(jsonReader, c9028hp);
            } else {
                lVar = null;
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                jVar = g.b.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new C2502ahL.p(str, str2, lVar, jVar);
            }
            C8956gW.a(jsonReader, "unifiedEntityId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2502ahL.p pVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) pVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, pVar.c());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, pVar.e());
            if (pVar.a() != null) {
                l.b.e(interfaceC9069id, c9028hp, pVar.a());
            }
            if (pVar.d() != null) {
                g.b.e(interfaceC9069id, c9028hp, pVar.d());
            }
        }
    }

    /* renamed from: o.ahK$l */
    /* loaded from: classes3.dex */
    public static final class l implements InterfaceC8949gP<C2502ahL.l> {
        public static final l b = new l();

        private l() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2502ahL.l b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C2502ahL.l(C2632ajj.e.b.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2502ahL.l lVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) lVar, "");
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, lVar.b());
        }
    }

    /* renamed from: o.ahK$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<C2502ahL.j> {
        public static final g b = new g();

        private g() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2502ahL.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C2502ahL.j(C2346aeX.e.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2502ahL.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            C2346aeX.e.e.e(interfaceC9069id, c9028hp, jVar.c());
        }
    }

    /* renamed from: o.ahK$m */
    /* loaded from: classes3.dex */
    public static final class m implements InterfaceC8949gP<C2502ahL.o> {
        public static final m c = new m();
        private static final List<String> e;

        private m() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "displayString", "unifiedEntityId");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2502ahL.o b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2502ahL.o(str, str3, str2);
            } else {
                C8956gW.a(jsonReader, "unifiedEntityId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2502ahL.o oVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) oVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, oVar.b());
            interfaceC9069id.e("displayString");
            C8953gT.t.e(interfaceC9069id, c9028hp, oVar.a());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, oVar.e());
        }
    }
}
