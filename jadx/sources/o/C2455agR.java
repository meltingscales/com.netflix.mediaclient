package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2304adi;
import o.C2311adp;
import o.C2384afI;
import o.C2385afJ;
import o.C2390afO;
import o.C2391afP;
import o.C2396afU;
import o.C2397afV;
import o.C2398afW;
import o.C2401afZ;
import o.C2441agD;
import o.C2442agE;
import o.C2444agG;
import o.C2447agJ;
import o.C2448agK;
import o.C2449agL;
import o.C2452agO;
import o.C2456agS;
import o.C2460agW;
import o.C2464aga;
import o.C2466agc;
import o.C2468age;
import o.C2470agg;
import o.C2474agk;
import o.C2478ago;
import o.C2479agp;
import o.C2480agq;
import o.C2483agt;
import o.C2485agv;
import o.C2486agw;
import o.C2487agx;
import o.C2488agy;
import o.C2517aha;
import o.C2523ahg;
import o.C2524ahh;
import o.C2530ahn;
import o.C2531aho;

/* renamed from: o.agR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2455agR {
    public static final C2455agR c = new C2455agR();

    /* renamed from: o.agR$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2457agT> {
        public static final a b = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", Payload.PARAM_RENO_REFRESH_LIST_CONTEXT);
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2457agT b(JsonReader jsonReader, C9028hp c9028hp) {
            C2399afX c2399afX;
            C2394afS c2394afS;
            C2519ahc c2519ahc;
            C2522ahf c2522ahf;
            C2392afQ c2392afQ;
            C2438agA c2438agA;
            C2386afK c2386afK;
            C2450agM c2450agM;
            C2489agz c2489agz;
            C2465agb c2465agb;
            C2395afT c2395afT;
            C2484agu c2484agu;
            C2471agh c2471agh;
            C2453agP c2453agP;
            C2482ags c2482ags;
            C2472agi c2472agi;
            C2309adn c2309adn;
            C2305adj c2305adj;
            C2467agd c2467agd;
            C2526ahj c2526ahj;
            C2400afY c2400afY;
            C2481agr c2481agr;
            C2476agm c2476agm;
            C2477agn c2477agn;
            C2439agB c2439agB;
            C2527ahk c2527ahk;
            C2393afR c2393afR;
            C2446agI c2446agI;
            C2525ahi c2525ahi;
            C2387afL c2387afL;
            C2443agF c2443agF;
            C2440agC c2440agC;
            C2469agf c2469agf;
            C2451agN c2451agN;
            C2445agH c2445agH;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2389afN c2389afN = null;
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                    dpR dpr = dpR.c;
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                    dpR dpr2 = dpR.c;
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            jsonReader.q();
            C2454agQ b2 = C2460agW.d.a.b(jsonReader, c9028hp);
            if (C9014hb.d(C9014hb.c("LolomoDefaultRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2399afX = C2464aga.b.c.b(jsonReader, c9028hp);
            } else {
                c2399afX = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoContinueWatchingRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2394afS = C2396afU.d.a.b(jsonReader, c9028hp);
            } else {
                c2394afS = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoTallPanelRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2519ahc = C2517aha.d.b.b(jsonReader, c9028hp);
            } else {
                c2519ahc = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoTopTenRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2522ahf = C2524ahh.d.e.b(jsonReader, c9028hp);
            } else {
                c2522ahf = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoCharacterRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2392afQ = C2391afP.b.b.b(jsonReader, c9028hp);
            } else {
                c2392afQ = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoKidsFavoritesRowV2"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2438agA = C2487agx.e.d.b(jsonReader, c9028hp);
            } else {
                c2438agA = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoBillboardRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2386afK = C2384afI.e.a.b(jsonReader, c9028hp);
            } else {
                c2386afK = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoPopularGamesRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2450agM = C2452agO.c.b.b(jsonReader, c9028hp);
            } else {
                c2450agM = null;
            }
            C2450agM c2450agM2 = c2450agM;
            if (C9014hb.d(C9014hb.c("LolomoIPBasedGamesRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2489agz = C2486agw.d.a.b(jsonReader, c9028hp);
            } else {
                c2489agz = null;
            }
            C2489agz c2489agz2 = c2489agz;
            if (C9014hb.d(C9014hb.c("LolomoDownloadsForYouRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2465agb = C2466agc.a.e.b(jsonReader, c9028hp);
            } else {
                c2465agb = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoContainerPageEvidenceRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2395afT = C2398afW.e.e.b(jsonReader, c9028hp);
            } else {
                c2395afT = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoGenreGalleryRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2484agu = C2488agy.e.b.b(jsonReader, c9028hp);
            } else {
                c2484agu = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoGamesBillboardRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2471agh = C2474agk.c.a.b(jsonReader, c9028hp);
            } else {
                c2471agh = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoReadyToPlayGamesRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2453agP = C2449agL.c.c.b(jsonReader, c9028hp);
            } else {
                c2453agP = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoGamesTrailersRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2482ags = C2485agv.a.a.b(jsonReader, c9028hp);
            } else {
                c2482ags = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoGamesFeatureEducationBillboardRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2472agi = C2479agp.c.e.b(jsonReader, c9028hp);
            } else {
                c2472agi = null;
            }
            if (C9014hb.d(C9014hb.c("ABBulkRaterRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2309adn = C2311adp.d.c.b(jsonReader, c9028hp);
            } else {
                c2309adn = null;
            }
            if (C9014hb.d(C9014hb.c("ABBulkRaterRecommendationRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2305adj = C2304adi.b.e.b(jsonReader, c9028hp);
            } else {
                c2305adj = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoFeedRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2467agd = C2470agg.a.a.b(jsonReader, c9028hp);
            } else {
                c2467agd = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoTopTenFeedRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2526ahj = C2523ahg.c.a.b(jsonReader, c9028hp);
            } else {
                c2526ahj = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoDefaultGamesRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2400afY = C2401afZ.e.c.b(jsonReader, c9028hp);
            } else {
                c2400afY = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoGamesPlaylistRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2481agr = C2483agt.e.b.b(jsonReader, c9028hp);
            } else {
                c2481agr = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoGamesGenreRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2476agm = C2478ago.b.a.b(jsonReader, c9028hp);
            } else {
                c2476agm = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoGamesIdentityRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2477agn = C2480agq.d.c.b(jsonReader, c9028hp);
            } else {
                c2477agn = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoMyListRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2439agB = C2442agE.a.e.b(jsonReader, c9028hp);
            } else {
                c2439agB = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoTrendingNowRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2527ahk = C2531aho.b.b.b(jsonReader, c9028hp);
            } else {
                c2527ahk = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoComingSoonRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2393afR = C2397afV.d.c.b(jsonReader, c9028hp);
            } else {
                c2393afR = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoMyRemindersRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2446agI = C2447agJ.d.a.b(jsonReader, c9028hp);
            } else {
                c2446agI = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoTrailersYouWatchedRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2525ahi = C2530ahn.b.b.b(jsonReader, c9028hp);
            } else {
                c2525ahi = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoBehindTheScenesRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2387afL = C2385afJ.a.c.b(jsonReader, c9028hp);
            } else {
                c2387afL = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoMyProfilesMarkerRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2443agF = C2448agK.c.b.b(jsonReader, c9028hp);
            } else {
                c2443agF = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoMyDownloadsMarkerRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2440agC = C2441agD.e.b.b(jsonReader, c9028hp);
            } else {
                c2440agC = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoFavoriteTitlesRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2469agf = C2468age.c.a.b(jsonReader, c9028hp);
            } else {
                c2469agf = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoRecentlyWatchedRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2451agN = C2456agS.c.e.b(jsonReader, c9028hp);
            } else {
                c2451agN = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoNotificationMarkerRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2445agH = C2444agG.e.e.b(jsonReader, c9028hp);
            } else {
                c2445agH = null;
            }
            if (C9014hb.d(C9014hb.c("LolomoCategoryCraversRow"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2389afN = C2390afO.d.a.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new C2457agT(str, str2, b2, c2399afX, c2394afS, c2519ahc, c2522ahf, c2392afQ, c2438agA, c2386afK, c2450agM2, c2489agz2, c2465agb, c2395afT, c2484agu, c2471agh, c2453agP, c2482ags, c2472agi, c2309adn, c2305adj, c2467agd, c2526ahj, c2400afY, c2481agr, c2476agm, c2477agn, c2439agB, c2527ahk, c2393afR, c2446agI, c2525ahi, c2387afL, c2443agF, c2440agC, c2469agf, c2451agN, c2445agH, c2389afN);
            }
            C8956gW.a(jsonReader, Payload.PARAM_RENO_REFRESH_LIST_CONTEXT);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2457agT c2457agT) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2457agT, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2457agT.N());
            interfaceC9069id.e(Payload.PARAM_RENO_REFRESH_LIST_CONTEXT);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2457agT.e());
            C2460agW.d.a.e(interfaceC9069id, c9028hp, c2457agT.I());
            if (c2457agT.m() != null) {
                C2464aga.b.c.e(interfaceC9069id, c9028hp, c2457agT.m());
            }
            if (c2457agT.f() != null) {
                C2396afU.d.a.e(interfaceC9069id, c9028hp, c2457agT.f());
            }
            if (c2457agT.E() != null) {
                C2517aha.d.b.e(interfaceC9069id, c9028hp, c2457agT.E());
            }
            if (c2457agT.J() != null) {
                C2524ahh.d.e.e(interfaceC9069id, c9028hp, c2457agT.J());
            }
            if (c2457agT.h() != null) {
                C2391afP.b.b.e(interfaceC9069id, c9028hp, c2457agT.h());
            }
            if (c2457agT.w() != null) {
                C2487agx.e.d.e(interfaceC9069id, c9028hp, c2457agT.w());
            }
            if (c2457agT.c() != null) {
                C2384afI.e.a.e(interfaceC9069id, c9028hp, c2457agT.c());
            }
            if (c2457agT.B() != null) {
                C2452agO.c.b.e(interfaceC9069id, c9028hp, c2457agT.B());
            }
            if (c2457agT.x() != null) {
                C2486agw.d.a.e(interfaceC9069id, c9028hp, c2457agT.x());
            }
            if (c2457agT.n() != null) {
                C2466agc.a.e.e(interfaceC9069id, c9028hp, c2457agT.n());
            }
            if (c2457agT.g() != null) {
                C2398afW.e.e.e(interfaceC9069id, c9028hp, c2457agT.g());
            }
            if (c2457agT.v() != null) {
                C2488agy.e.b.e(interfaceC9069id, c9028hp, c2457agT.v());
            }
            if (c2457agT.t() != null) {
                C2474agk.c.a.e(interfaceC9069id, c9028hp, c2457agT.t());
            }
            if (c2457agT.F() != null) {
                C2449agL.c.c.e(interfaceC9069id, c9028hp, c2457agT.F());
            }
            if (c2457agT.u() != null) {
                C2485agv.a.a.e(interfaceC9069id, c9028hp, c2457agT.u());
            }
            if (c2457agT.p() != null) {
                C2479agp.c.e.e(interfaceC9069id, c9028hp, c2457agT.p());
            }
            if (c2457agT.a() != null) {
                C2311adp.d.c.e(interfaceC9069id, c9028hp, c2457agT.a());
            }
            if (c2457agT.b() != null) {
                C2304adi.b.e.e(interfaceC9069id, c9028hp, c2457agT.b());
            }
            if (c2457agT.k() != null) {
                C2470agg.a.a.e(interfaceC9069id, c9028hp, c2457agT.k());
            }
            if (c2457agT.G() != null) {
                C2523ahg.c.a.e(interfaceC9069id, c9028hp, c2457agT.G());
            }
            if (c2457agT.l() != null) {
                C2401afZ.e.c.e(interfaceC9069id, c9028hp, c2457agT.l());
            }
            if (c2457agT.q() != null) {
                C2483agt.e.b.e(interfaceC9069id, c9028hp, c2457agT.q());
            }
            if (c2457agT.r() != null) {
                C2478ago.b.a.e(interfaceC9069id, c9028hp, c2457agT.r());
            }
            if (c2457agT.s() != null) {
                C2480agq.d.c.e(interfaceC9069id, c9028hp, c2457agT.s());
            }
            if (c2457agT.z() != null) {
                C2442agE.a.e.e(interfaceC9069id, c9028hp, c2457agT.z());
            }
            if (c2457agT.K() != null) {
                C2531aho.b.b.e(interfaceC9069id, c9028hp, c2457agT.K());
            }
            if (c2457agT.i() != null) {
                C2397afV.d.c.e(interfaceC9069id, c9028hp, c2457agT.i());
            }
            if (c2457agT.D() != null) {
                C2447agJ.d.a.e(interfaceC9069id, c9028hp, c2457agT.D());
            }
            if (c2457agT.L() != null) {
                C2530ahn.b.b.e(interfaceC9069id, c9028hp, c2457agT.L());
            }
            if (c2457agT.d() != null) {
                C2385afJ.a.c.e(interfaceC9069id, c9028hp, c2457agT.d());
            }
            if (c2457agT.A() != null) {
                C2448agK.c.b.e(interfaceC9069id, c9028hp, c2457agT.A());
            }
            if (c2457agT.y() != null) {
                C2441agD.e.b.e(interfaceC9069id, c9028hp, c2457agT.y());
            }
            if (c2457agT.o() != null) {
                C2468age.c.a.e(interfaceC9069id, c9028hp, c2457agT.o());
            }
            if (c2457agT.H() != null) {
                C2456agS.c.e.e(interfaceC9069id, c9028hp, c2457agT.H());
            }
            if (c2457agT.C() != null) {
                C2444agG.e.e.e(interfaceC9069id, c9028hp, c2457agT.C());
            }
            if (c2457agT.j() != null) {
                C2390afO.d.a.e(interfaceC9069id, c9028hp, c2457agT.j());
            }
        }
    }

    private C2455agR() {
    }
}
