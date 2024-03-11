package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2346aeX;
import o.C2416afo;
import o.C2511ahU;
import o.C2632ajj;

/* renamed from: o.afq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2422afq {
    public static final C2422afq d = new C2422afq();

    /* renamed from: o.afq$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<C2416afo> {
        private static final List<String> b;
        public static final g d = new g();

        private g() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2416afo b(JsonReader jsonReader, C9028hp c9028hp) {
            C2416afo.o oVar;
            C2416afo.m mVar;
            C2416afo.l lVar;
            C2416afo.s sVar;
            C2416afo.n nVar;
            C2416afo.q qVar;
            C2416afo.x xVar;
            C2416afo.p pVar;
            C2416afo.r rVar;
            C2416afo.t tVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2416afo.u uVar = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("IrmaBoxShotEntityTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                oVar = l.e.b(jsonReader, c9028hp);
            } else {
                oVar = null;
            }
            if (C9014hb.d(C9014hb.c("IrmaHorizontalArtworkWithPlaybackEntityTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                mVar = s.a.b(jsonReader, c9028hp);
            } else {
                mVar = null;
            }
            if (C9014hb.d(C9014hb.c("IrmaAppIconEntityTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                lVar = n.e.b(jsonReader, c9028hp);
            } else {
                lVar = null;
            }
            if (C9014hb.d(C9014hb.c("PinotSuggestionEntityTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                sVar = x.d.b(jsonReader, c9028hp);
            } else {
                sVar = null;
            }
            if (C9014hb.d(C9014hb.c("IrmaAndroidPreQuerySearchEntityTreatment", "IrmaAppIconBillboardEntityTreatment", "IrmaAppIconEntityTreatment", "IrmaAwardsBillboardEntityTreatment", "IrmaBannerWithTrailerEntityTreatment", "IrmaBoxShotEntityTreatment", "IrmaBoxShotWithRankEntityTreatment", "IrmaBoxshotWithReminderEntityTreatment", "IrmaCharacterCircleEntityTreatment", "IrmaContinueWatchingEntityTreatment", "IrmaCreatorHomeSectionTreatment", "IrmaEpisodicBillboardEntityTreatment", "IrmaHorizontalArtworkWithPlaybackEntityTreatment", "IrmaStandardBillboardEntityTreatment", "IrmaSuggestionEntityTreatment", "IrmaTallPanelEntityTreatment", "IrmaTitleCardWithCharacterEntityTreatment", "IrmaTrailerWithAppIconEntityTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                nVar = k.e.b(jsonReader, c9028hp);
            } else {
                nVar = null;
            }
            if (C9014hb.d(C9014hb.c("IrmaAndroidPreQuerySearchEntityTreatment", "IrmaAppIconBillboardEntityTreatment", "IrmaAppIconEntityTreatment", "IrmaAwardsBillboardEntityTreatment", "IrmaBannerWithTrailerEntityTreatment", "IrmaBoxShotEntityTreatment", "IrmaBoxShotWithRankEntityTreatment", "IrmaBoxshotWithReminderEntityTreatment", "IrmaCharacterCircleEntityTreatment", "IrmaContinueWatchingEntityTreatment", "IrmaEpisodicBillboardEntityTreatment", "IrmaHorizontalArtworkWithPlaybackEntityTreatment", "IrmaStandardBillboardEntityTreatment", "IrmaTallPanelEntityTreatment", "IrmaTitleCardWithCharacterEntityTreatment", "IrmaTrailerWithAppIconEntityTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                qVar = q.e.b(jsonReader, c9028hp);
            } else {
                qVar = null;
            }
            if (C9014hb.d(C9014hb.c("PinotTextEntity"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                xVar = y.b.b(jsonReader, c9028hp);
            } else {
                xVar = null;
            }
            if (C9014hb.d(C9014hb.c("PinotBoxShotEntityTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                pVar = r.e.b(jsonReader, c9028hp);
            } else {
                pVar = null;
            }
            if (C9014hb.d(C9014hb.c("PinotHorizontalArtworkWithPlaybackEntityTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                rVar = t.a.b(jsonReader, c9028hp);
            } else {
                rVar = null;
            }
            if (C9014hb.d(C9014hb.c("PinotAppIconEntityTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                tVar = p.b.b(jsonReader, c9028hp);
            } else {
                tVar = null;
            }
            C2416afo.t tVar2 = tVar;
            if (C9014hb.d(C9014hb.c("PinotAppIconBillboardEntityTreatment", "PinotAppIconEntityTreatment", "PinotAwardsBillboardEntityTreatment", "PinotBannerWithTrailerEntityTreatment", "PinotBasicSearchEntity", "PinotBoxShotEntityTreatment", "PinotBoxShotWithRankEntityTreatment", "PinotBoxshotWithReminderEntityTreatment", "PinotCharacterCircleEntityTreatment", "PinotContinueWatchingEntityTreatment", "PinotCreatorHomeEntityTreatment", "PinotDoubleWideBoxshotEntityTreatment", "PinotEpisodicBillboardEntityTreatment", "PinotHorizontalArtworkWithPlaybackEntityTreatment", "PinotStandardBillboardEntityTreatment", "PinotTallPanelEntityTreatment", "PinotTitleCardWithCharacterEntityTreatment", "PinotTrailerWithAppIconEntityTreatment", "PinotTripleWideBoxshotEntityTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                uVar = w.e.b(jsonReader, c9028hp);
            }
            return new C2416afo(str, oVar, mVar, lVar, sVar, nVar, qVar, xVar, pVar, rVar, tVar2, uVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo c2416afo) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2416afo, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2416afo.l());
            if (c2416afo.e() != null) {
                l.e.e(interfaceC9069id, c9028hp, c2416afo.e());
            }
            if (c2416afo.b() != null) {
                s.a.e(interfaceC9069id, c9028hp, c2416afo.b());
            }
            if (c2416afo.a() != null) {
                n.e.e(interfaceC9069id, c9028hp, c2416afo.a());
            }
            if (c2416afo.h() != null) {
                x.d.e(interfaceC9069id, c9028hp, c2416afo.h());
            }
            if (c2416afo.d() != null) {
                k.e.e(interfaceC9069id, c9028hp, c2416afo.d());
            }
            if (c2416afo.c() != null) {
                q.e.e(interfaceC9069id, c9028hp, c2416afo.c());
            }
            if (c2416afo.i() != null) {
                y.b.e(interfaceC9069id, c9028hp, c2416afo.i());
            }
            if (c2416afo.f() != null) {
                r.e.e(interfaceC9069id, c9028hp, c2416afo.f());
            }
            if (c2416afo.j() != null) {
                t.a.e(interfaceC9069id, c9028hp, c2416afo.j());
            }
            if (c2416afo.g() != null) {
                p.b.e(interfaceC9069id, c9028hp, c2416afo.g());
            }
            if (c2416afo.k() != null) {
                w.e.e(interfaceC9069id, c9028hp, c2416afo.k());
            }
        }
    }

    private C2422afq() {
    }

    /* renamed from: o.afq$l */
    /* loaded from: classes3.dex */
    public static final class l implements InterfaceC8949gP<C2416afo.o> {
        private static final List<String> a;
        public static final l e = new l();

        private l() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "image");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2416afo.o b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2416afo.f fVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    fVar = (C2416afo.f) C8953gT.d(C8953gT.c(j.d, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2416afo.o(str, fVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.o oVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) oVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, oVar.d());
            interfaceC9069id.e("image");
            C8953gT.d(C8953gT.c(j.d, false, 1, null)).e(interfaceC9069id, c9028hp, oVar.e());
        }
    }

    /* renamed from: o.afq$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC8949gP<C2416afo.f> {
        private static final List<String> b;
        public static final j d = new j();

        private j() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2416afo.f b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(b);
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
                return new C2416afo.f(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, fVar.c());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, fVar.b());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, fVar.e());
        }
    }

    /* renamed from: o.afq$s */
    /* loaded from: classes3.dex */
    public static final class s implements InterfaceC8949gP<C2416afo.m> {
        public static final s a = new s();
        private static final List<String> e;

        private s() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntity", "image");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2416afo.m b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2416afo.D d = null;
            C2416afo.i iVar = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    d = (C2416afo.D) C8953gT.d(C8953gT.a(z.c, true)).b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    iVar = (C2416afo.i) C8953gT.d(C8953gT.c(i.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2416afo.m(str, d, iVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.m mVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) mVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, mVar.a());
            interfaceC9069id.e("unifiedEntity");
            C8953gT.d(C8953gT.a(z.c, true)).e(interfaceC9069id, c9028hp, mVar.e());
            interfaceC9069id.e("image");
            C8953gT.d(C8953gT.c(i.e, false, 1, null)).e(interfaceC9069id, c9028hp, mVar.d());
        }
    }

    /* renamed from: o.afq$z */
    /* loaded from: classes3.dex */
    public static final class z implements InterfaceC8949gP<C2416afo.D> {
        public static final z c = new z();
        private static final List<String> d;

        private z() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntityId");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2416afo.D b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2416afo.y yVar = null;
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(d);
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
                yVar = v.e.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new C2416afo.D(str, str2, yVar);
            }
            C8956gW.a(jsonReader, "unifiedEntityId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.D d2) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) d2, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, d2.b());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, d2.d());
            if (d2.a() != null) {
                v.e.e(interfaceC9069id, c9028hp, d2.a());
            }
        }
    }

    /* renamed from: o.afq$v */
    /* loaded from: classes3.dex */
    public static final class v implements InterfaceC8949gP<C2416afo.y> {
        public static final v e = new v();

        private v() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2416afo.y b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C2416afo.y(C2511ahU.e.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.y yVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) yVar, "");
            C2511ahU.e.e.e(interfaceC9069id, c9028hp, yVar.d());
        }
    }

    /* renamed from: o.afq$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<C2416afo.i> {
        private static final List<String> b;
        public static final i e = new i();

        private i() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2416afo.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(b);
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
                return new C2416afo.i(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.a());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, iVar.b());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, iVar.e());
        }
    }

    /* renamed from: o.afq$n */
    /* loaded from: classes3.dex */
    public static final class n implements InterfaceC8949gP<C2416afo.l> {
        private static final List<String> b;
        public static final n e = new n();

        private n() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "image");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2416afo.l b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2416afo.g gVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    gVar = (C2416afo.g) C8953gT.d(C8953gT.c(h.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2416afo.l(str, gVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.l lVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) lVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, lVar.e());
            interfaceC9069id.e("image");
            C8953gT.d(C8953gT.c(h.e, false, 1, null)).e(interfaceC9069id, c9028hp, lVar.d());
        }
    }

    /* renamed from: o.afq$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC8949gP<C2416afo.g> {
        private static final List<String> a;
        public static final h e = new h();

        private h() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2416afo.g b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C2416afo.g(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.d());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, gVar.e());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, gVar.b());
        }
    }

    /* renamed from: o.afq$x */
    /* loaded from: classes3.dex */
    public static final class x implements InterfaceC8949gP<C2416afo.s> {
        private static final List<String> c;
        public static final x d = new x();

        private x() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "displayString", "showCollectionIcon", "suggestionEntityId");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2416afo.s b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2416afo.s(str, str3, bool, str2);
            } else {
                C8956gW.a(jsonReader, "suggestionEntityId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.s sVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) sVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, sVar.e());
            interfaceC9069id.e("displayString");
            C8953gT.t.e(interfaceC9069id, c9028hp, sVar.a());
            interfaceC9069id.e("showCollectionIcon");
            C8953gT.l.e(interfaceC9069id, c9028hp, sVar.b());
            interfaceC9069id.e("suggestionEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, sVar.c());
        }
    }

    /* renamed from: o.afq$k */
    /* loaded from: classes3.dex */
    public static final class k implements InterfaceC8949gP<C2416afo.n> {
        private static final List<String> b;
        public static final k e = new k();

        private k() {
        }

        static {
            List<String> j;
            j = C8569dql.j("recipeId", "unifiedEntityId");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2416afo.n b(JsonReader jsonReader, C9028hp c9028hp) {
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
                C8956gW.a(jsonReader, "recipeId");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2416afo.n(str, str2);
            } else {
                C8956gW.a(jsonReader, "unifiedEntityId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.n nVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) nVar, "");
            interfaceC9069id.e("recipeId");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, nVar.c());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, nVar.e());
        }
    }

    /* renamed from: o.afq$q */
    /* loaded from: classes3.dex */
    public static final class q implements InterfaceC8949gP<C2416afo.q> {
        private static final List<String> a;
        public static final q e = new q();

        private q() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntity");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2416afo.q b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2416afo.z zVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    zVar = (C2416afo.z) C8953gT.d(C8953gT.a(A.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2416afo.q(str, zVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.q qVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) qVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, qVar.c());
            interfaceC9069id.e("unifiedEntity");
            C8953gT.d(C8953gT.a(A.c, true)).e(interfaceC9069id, c9028hp, qVar.b());
        }
    }

    /* renamed from: o.afq$A */
    /* loaded from: classes3.dex */
    public static final class A implements InterfaceC8949gP<C2416afo.z> {
        private static final List<String> a;
        public static final A c = new A();

        private A() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntityId");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2416afo.z b(JsonReader jsonReader, C9028hp c9028hp) {
            C2416afo.v vVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2416afo.j jVar = null;
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
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                vVar = u.b.b(jsonReader, c9028hp);
            } else {
                vVar = null;
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                jVar = m.e.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new C2416afo.z(str, str2, vVar, jVar);
            }
            C8956gW.a(jsonReader, "unifiedEntityId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.z zVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) zVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, zVar.d());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, zVar.a());
            if (zVar.e() != null) {
                u.b.e(interfaceC9069id, c9028hp, zVar.e());
            }
            if (zVar.c() != null) {
                m.e.e(interfaceC9069id, c9028hp, zVar.c());
            }
        }
    }

    /* renamed from: o.afq$u */
    /* loaded from: classes3.dex */
    public static final class u implements InterfaceC8949gP<C2416afo.v> {
        public static final u b = new u();

        private u() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2416afo.v b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C2416afo.v(C2632ajj.e.b.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.v vVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) vVar, "");
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, vVar.c());
        }
    }

    /* renamed from: o.afq$m */
    /* loaded from: classes3.dex */
    public static final class m implements InterfaceC8949gP<C2416afo.j> {
        public static final m e = new m();

        private m() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2416afo.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C2416afo.j(C2346aeX.e.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            C2346aeX.e.e.e(interfaceC9069id, c9028hp, jVar.d());
        }
    }

    /* renamed from: o.afq$y */
    /* loaded from: classes3.dex */
    public static final class y implements InterfaceC8949gP<C2416afo.x> {
        public static final y b = new y();
        private static final List<String> d;

        private y() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "displayString", "unifiedEntityId");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2416afo.x b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C2416afo.x(str, str3, str2);
            } else {
                C8956gW.a(jsonReader, "unifiedEntityId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.x xVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) xVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, xVar.d());
            interfaceC9069id.e("displayString");
            C8953gT.t.e(interfaceC9069id, c9028hp, xVar.c());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, xVar.e());
        }
    }

    /* renamed from: o.afq$r */
    /* loaded from: classes3.dex */
    public static final class r implements InterfaceC8949gP<C2416afo.p> {
        private static final List<String> a;
        public static final r e = new r();

        private r() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "contextualArtwork");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2416afo.p b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2416afo.C2419c c2419c = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    c2419c = (C2416afo.C2419c) C8953gT.d(C8953gT.c(C2425c.d, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2416afo.p(str, c2419c);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.p pVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) pVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, pVar.d());
            interfaceC9069id.e("contextualArtwork");
            C8953gT.d(C8953gT.c(C2425c.d, false, 1, null)).e(interfaceC9069id, c9028hp, pVar.e());
        }
    }

    /* renamed from: o.afq$c  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C2425c implements InterfaceC8949gP<C2416afo.C2419c> {
        private static final List<String> c;
        public static final C2425c d = new C2425c();

        private C2425c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "artwork");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2416afo.C2419c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2416afo.e eVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    eVar = (C2416afo.e) C8953gT.d(C8953gT.c(C2424b.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2416afo.C2419c(str, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.C2419c c2419c) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2419c, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2419c.a());
            interfaceC9069id.e("artwork");
            C8953gT.d(C8953gT.c(C2424b.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2419c.c());
        }
    }

    /* renamed from: o.afq$b  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C2424b implements InterfaceC8949gP<C2416afo.e> {
        public static final C2424b a = new C2424b();
        private static final List<String> d;

        private C2424b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2416afo.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a2 = jsonReader.a(d);
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
                return new C2416afo.e(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, eVar.e());
        }
    }

    /* renamed from: o.afq$t */
    /* loaded from: classes3.dex */
    public static final class t implements InterfaceC8949gP<C2416afo.r> {
        public static final t a = new t();
        private static final List<String> c;

        private t() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "contextualArtwork", "unifiedEntity");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2416afo.r b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2416afo.C2417a c2417a = null;
            C2416afo.B b = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    c2417a = (C2416afo.C2417a) C8953gT.d(C8953gT.c(C2426d.a, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    b = (C2416afo.B) C8953gT.d(C8953gT.a(B.e, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2416afo.r(str, c2417a, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.r rVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) rVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, rVar.b());
            interfaceC9069id.e("contextualArtwork");
            C8953gT.d(C8953gT.c(C2426d.a, false, 1, null)).e(interfaceC9069id, c9028hp, rVar.d());
            interfaceC9069id.e("unifiedEntity");
            C8953gT.d(C8953gT.a(B.e, true)).e(interfaceC9069id, c9028hp, rVar.c());
        }
    }

    /* renamed from: o.afq$d  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C2426d implements InterfaceC8949gP<C2416afo.C2417a> {
        public static final C2426d a = new C2426d();
        private static final List<String> d;

        private C2426d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "artwork");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2416afo.C2417a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2416afo.C2420d c2420d = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    c2420d = (C2416afo.C2420d) C8953gT.d(C8953gT.c(e.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2416afo.C2417a(str, c2420d);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.C2417a c2417a) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2417a, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2417a.c());
            interfaceC9069id.e("artwork");
            C8953gT.d(C8953gT.c(e.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2417a.d());
        }
    }

    /* renamed from: o.afq$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2416afo.C2420d> {
        private static final List<String> b;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2416afo.C2420d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(b);
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
                return new C2416afo.C2420d(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.C2420d c2420d) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2420d, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2420d.b());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, c2420d.a());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, c2420d.c());
        }
    }

    /* renamed from: o.afq$B */
    /* loaded from: classes3.dex */
    public static final class B implements InterfaceC8949gP<C2416afo.B> {
        private static final List<String> d;
        public static final B e = new B();

        private B() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntityId");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2416afo.B b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2416afo.w wVar = null;
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(d);
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
                wVar = C.c.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new C2416afo.B(str, str2, wVar);
            }
            C8956gW.a(jsonReader, "unifiedEntityId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.B b) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) b, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, b.b());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, b.e());
            if (b.c() != null) {
                C.c.e(interfaceC9069id, c9028hp, b.c());
            }
        }
    }

    /* renamed from: o.afq$C */
    /* loaded from: classes3.dex */
    public static final class C implements InterfaceC8949gP<C2416afo.w> {
        public static final C c = new C();

        private C() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2416afo.w b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C2416afo.w(C2511ahU.e.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.w wVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) wVar, "");
            C2511ahU.e.e.e(interfaceC9069id, c9028hp, wVar.a());
        }
    }

    /* renamed from: o.afq$p */
    /* loaded from: classes3.dex */
    public static final class p implements InterfaceC8949gP<C2416afo.t> {
        public static final p b = new p();
        private static final List<String> c;

        private p() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "contextualArtwork");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2416afo.t b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2416afo.h hVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    hVar = (C2416afo.h) C8953gT.d(C8953gT.c(C2427f.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2416afo.t(str, hVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.t tVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) tVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, tVar.e());
            interfaceC9069id.e("contextualArtwork");
            C8953gT.d(C8953gT.c(C2427f.e, false, 1, null)).e(interfaceC9069id, c9028hp, tVar.c());
        }
    }

    /* renamed from: o.afq$f  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C2427f implements InterfaceC8949gP<C2416afo.h> {
        private static final List<String> c;
        public static final C2427f e = new C2427f();

        private C2427f() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "artwork");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2416afo.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2416afo.C2418b c2418b = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    c2418b = (C2416afo.C2418b) C8953gT.d(C8953gT.c(C2423a.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2416afo.h(str, c2418b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.b());
            interfaceC9069id.e("artwork");
            C8953gT.d(C8953gT.c(C2423a.b, false, 1, null)).e(interfaceC9069id, c9028hp, hVar.c());
        }
    }

    /* renamed from: o.afq$a  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C2423a implements InterfaceC8949gP<C2416afo.C2418b> {
        private static final List<String> a;
        public static final C2423a b = new C2423a();

        private C2423a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2416afo.C2418b b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C2416afo.C2418b(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.C2418b c2418b) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2418b, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2418b.b());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, c2418b.d());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, c2418b.c());
        }
    }

    /* renamed from: o.afq$w */
    /* loaded from: classes3.dex */
    public static final class w implements InterfaceC8949gP<C2416afo.u> {
        private static final List<String> c;
        public static final w e = new w();

        private w() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntity", "displayString");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2416afo.u b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2416afo.C c2 = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    c2 = (C2416afo.C) C8953gT.d(C8953gT.a(F.e, true)).b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2416afo.u(str, c2, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.u uVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) uVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, uVar.a());
            interfaceC9069id.e("unifiedEntity");
            C8953gT.d(C8953gT.a(F.e, true)).e(interfaceC9069id, c9028hp, uVar.b());
            interfaceC9069id.e("displayString");
            C8953gT.t.e(interfaceC9069id, c9028hp, uVar.e());
        }
    }

    /* renamed from: o.afq$F */
    /* loaded from: classes3.dex */
    public static final class F implements InterfaceC8949gP<C2416afo.C> {
        private static final List<String> d;
        public static final F e = new F();

        private F() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntityId");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2416afo.C b(JsonReader jsonReader, C9028hp c9028hp) {
            C2416afo.A a;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2416afo.k kVar = null;
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
                a = D.b.b(jsonReader, c9028hp);
            } else {
                a = null;
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                kVar = o.d.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new C2416afo.C(str, str2, a, kVar);
            }
            C8956gW.a(jsonReader, "unifiedEntityId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.C c) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c.c());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c.a());
            if (c.b() != null) {
                D.b.e(interfaceC9069id, c9028hp, c.b());
            }
            if (c.d() != null) {
                o.d.e(interfaceC9069id, c9028hp, c.d());
            }
        }
    }

    /* renamed from: o.afq$D */
    /* loaded from: classes3.dex */
    public static final class D implements InterfaceC8949gP<C2416afo.A> {
        public static final D b = new D();

        private D() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2416afo.A b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C2416afo.A(C2632ajj.e.b.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.A a) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) a, "");
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, a.c());
        }
    }

    /* renamed from: o.afq$o */
    /* loaded from: classes3.dex */
    public static final class o implements InterfaceC8949gP<C2416afo.k> {
        public static final o d = new o();

        private o() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2416afo.k b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C2416afo.k(C2346aeX.e.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2416afo.k kVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) kVar, "");
            C2346aeX.e.e.e(interfaceC9069id, c9028hp, kVar.d());
        }
    }
}
