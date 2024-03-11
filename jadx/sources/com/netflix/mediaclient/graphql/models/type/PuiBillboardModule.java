package com.netflix.mediaclient.graphql.models.type;

import java.util.Iterator;
import java.util.List;
import o.C8569dql;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9033hu;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PuiBillboardModule {

    /* renamed from: J  reason: collision with root package name */
    private static final /* synthetic */ InterfaceC8598drn f13181J;
    private static final C9033hu K;
    private static final /* synthetic */ PuiBillboardModule[] N;
    public static final e e;
    private final String Q;
    public static final PuiBillboardModule c = new PuiBillboardModule("CategoryCraversMosaic", 0, "CategoryCraversMosaic");
    public static final PuiBillboardModule b = new PuiBillboardModule("CategoryCraversPivots", 1, "CategoryCraversPivots");
    public static final PuiBillboardModule d = new PuiBillboardModule("CurationAControl", 2, "CurationAControl");
    public static final PuiBillboardModule a = new PuiBillboardModule("CurationAControlPlayButton", 3, "CurationAControlPlayButton");
    public static final PuiBillboardModule g = new PuiBillboardModule("CurationARewatchers", 4, "CurationARewatchers");
    public static final PuiBillboardModule f = new PuiBillboardModule("CurationARewatchersV2", 5, "CurationARewatchersV2");
    public static final PuiBillboardModule i = new PuiBillboardModule("CurationAShallowBrowsers", 6, "CurationAShallowBrowsers");
    public static final PuiBillboardModule j = new PuiBillboardModule("CurationBControl", 7, "CurationBControl");
    public static final PuiBillboardModule h = new PuiBillboardModule("CurationBShallowBrowsers", 8, "CurationBShallowBrowsers");
    public static final PuiBillboardModule n = new PuiBillboardModule("CurationBSocialProof", 9, "CurationBSocialProof");
    public static final PuiBillboardModule k = new PuiBillboardModule("CurationBSocialProofMostLiked", 10, "CurationBSocialProofMostLiked");
    public static final PuiBillboardModule l = new PuiBillboardModule("DiscoveryShallowBrowsersScreener", 11, "DiscoveryShallowBrowsersScreener");
    public static final PuiBillboardModule m = new PuiBillboardModule("DpImmersiveInfoDensity", 12, "DpImmersiveInfoDensity");

    /* renamed from: o  reason: collision with root package name */
    public static final PuiBillboardModule f13182o = new PuiBillboardModule("EvidenceImmersiveMovieLovers", 13, "EvidenceImmersiveMovieLovers");
    public static final PuiBillboardModule t = new PuiBillboardModule("EvidenceImmersiveRiskAverse", 14, "EvidenceImmersiveRiskAverse");
    public static final PuiBillboardModule s = new PuiBillboardModule("EvidenceImmersiveTalent", 15, "EvidenceImmersiveTalent");
    public static final PuiBillboardModule r = new PuiBillboardModule("EvidenceImmersiveTalentV2", 16, "EvidenceImmersiveTalentV2");
    public static final PuiBillboardModule p = new PuiBillboardModule("ListContentControl", 17, "ListContentControl");
    public static final PuiBillboardModule q = new PuiBillboardModule("LocalContentMosaic", 18, "LocalContentMosaic");
    public static final PuiBillboardModule w = new PuiBillboardModule("LocalLanguageMosaic", 19, "LocalLanguageMosaic");
    public static final PuiBillboardModule v = new PuiBillboardModule("MosaicContentControl", 20, "MosaicContentControl");
    public static final PuiBillboardModule y = new PuiBillboardModule("MovieLoversControl", 21, "MovieLoversControl");
    public static final PuiBillboardModule u = new PuiBillboardModule("MovieLoversPoster", 22, "MovieLoversPoster");
    public static final PuiBillboardModule x = new PuiBillboardModule("NewnessPoster", 23, "NewnessPoster");
    public static final PuiBillboardModule z = new PuiBillboardModule("PosterContentControl", 24, "PosterContentControl");
    public static final PuiBillboardModule C = new PuiBillboardModule("RiskAversePivots", 25, "RiskAversePivots");
    public static final PuiBillboardModule A = new PuiBillboardModule("ScreenerContentControl", 26, "ScreenerContentControl");
    public static final PuiBillboardModule D = new PuiBillboardModule("ShallowBrowsersScreener", 27, "ShallowBrowsersScreener");
    public static final PuiBillboardModule B = new PuiBillboardModule("ShallowBrowsersScreenerNoIntro", 28, "ShallowBrowsersScreenerNoIntro");
    public static final PuiBillboardModule E = new PuiBillboardModule("SocialProofList", 29, "SocialProofList");
    public static final PuiBillboardModule F = new PuiBillboardModule("SocialProofListMostLiked", 30, "SocialProofListMostLiked");
    public static final PuiBillboardModule G = new PuiBillboardModule("TalentList", 31, "TalentList");
    public static final PuiBillboardModule H = new PuiBillboardModule("TalentListNoClips", 32, "TalentListNoClips");
    public static final PuiBillboardModule I = new PuiBillboardModule("TalentPoster", 33, "TalentPoster");
    public static final PuiBillboardModule L = new PuiBillboardModule("TalentScreener", 34, "TalentScreener");
    public static final PuiBillboardModule M = new PuiBillboardModule("UNKNOWN__", 35, "UNKNOWN__");

    private static final /* synthetic */ PuiBillboardModule[] d() {
        return new PuiBillboardModule[]{c, b, d, a, g, f, i, j, h, n, k, l, m, f13182o, t, s, r, p, q, w, v, y, u, x, z, C, A, D, B, E, F, G, H, I, L, M};
    }

    public static InterfaceC8598drn<PuiBillboardModule> e() {
        return f13181J;
    }

    public static PuiBillboardModule valueOf(String str) {
        return (PuiBillboardModule) Enum.valueOf(PuiBillboardModule.class, str);
    }

    public static PuiBillboardModule[] values() {
        return (PuiBillboardModule[]) N.clone();
    }

    public final String b() {
        return this.Q;
    }

    private PuiBillboardModule(String str, int i2, String str2) {
        this.Q = str2;
    }

    static {
        List j2;
        PuiBillboardModule[] d2 = d();
        N = d2;
        f13181J = C8600drp.e(d2);
        e = new e(null);
        j2 = C8569dql.j("CategoryCraversMosaic", "CategoryCraversPivots", "CurationAControl", "CurationAControlPlayButton", "CurationARewatchers", "CurationARewatchersV2", "CurationAShallowBrowsers", "CurationBControl", "CurationBShallowBrowsers", "CurationBSocialProof", "CurationBSocialProofMostLiked", "DiscoveryShallowBrowsersScreener", "DpImmersiveInfoDensity", "EvidenceImmersiveMovieLovers", "EvidenceImmersiveRiskAverse", "EvidenceImmersiveTalent", "EvidenceImmersiveTalentV2", "ListContentControl", "LocalContentMosaic", "LocalLanguageMosaic", "MosaicContentControl", "MovieLoversControl", "MovieLoversPoster", "NewnessPoster", "PosterContentControl", "RiskAversePivots", "ScreenerContentControl", "ShallowBrowsersScreener", "ShallowBrowsersScreenerNoIntro", "SocialProofList", "SocialProofListMostLiked", "TalentList", "TalentListNoClips", "TalentPoster", "TalentScreener");
        K = new C9033hu("PuiBillboardModule", j2);
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final PuiBillboardModule d(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = PuiBillboardModule.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((PuiBillboardModule) obj).b(), (Object) str)) {
                    break;
                }
            }
            PuiBillboardModule puiBillboardModule = (PuiBillboardModule) obj;
            return puiBillboardModule == null ? PuiBillboardModule.M : puiBillboardModule;
        }
    }
}
