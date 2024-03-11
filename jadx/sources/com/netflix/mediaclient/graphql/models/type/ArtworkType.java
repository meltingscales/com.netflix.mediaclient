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
public final class ArtworkType {
    private static final /* synthetic */ InterfaceC8598drn al;
    private static final /* synthetic */ ArtworkType[] an;
    private static final C9033hu aq;
    public static final c r;
    private final String ap;
    public static final ArtworkType e = new ArtworkType("APP_ICON", 0, "APP_ICON");
    public static final ArtworkType d = new ArtworkType("AVATAR_KIDS_NMHP_NO_BG", 1, "AVATAR_KIDS_NMHP_NO_BG");
    public static final ArtworkType a = new ArtworkType("BADGE_ANY_TEXT", 2, "BADGE_ANY_TEXT");
    public static final ArtworkType c = new ArtworkType("BADGE_NEW", 3, "BADGE_NEW");
    public static final ArtworkType b = new ArtworkType("BB2_OG_LOGO_PLUS_CROPPED", 4, "BB2_OG_LOGO_PLUS_CROPPED");
    public static final ArtworkType h = new ArtworkType("BILLBOARD", 5, "BILLBOARD");
    public static final ArtworkType j = new ArtworkType("BOXSHOT", 6, "BOXSHOT");
    public static final ArtworkType g = new ArtworkType("BOXSHOT_BACKGROUND", 7, "BOXSHOT_BACKGROUND");
    public static final ArtworkType f = new ArtworkType("CHARACTER_198HOVER", 8, "CHARACTER_198HOVER");
    public static final ArtworkType i = new ArtworkType("CHARACTER_CIRCLE_HALF", 9, "CHARACTER_CIRCLE_HALF");

    /* renamed from: o  reason: collision with root package name */
    public static final ArtworkType f13173o = new ArtworkType("CHARACTER_COMPACT", 10, "CHARACTER_COMPACT");
    public static final ArtworkType k = new ArtworkType("CHARACTER_STORY_ART", 11, "CHARACTER_STORY_ART");
    public static final ArtworkType m = new ArtworkType("CREATOR_CARD_LOGO", 12, "CREATOR_CARD_LOGO");
    public static final ArtworkType n = new ArtworkType("CREATOR_CARD_SHORT_BACKGROUND", 13, "CREATOR_CARD_SHORT_BACKGROUND");
    public static final ArtworkType q = new ArtworkType("CREATOR_CARD_SHORT_COMBO", 14, "CREATOR_CARD_SHORT_COMBO");
    public static final ArtworkType p = new ArtworkType("CREATOR_CARD_TALL_BACKGROUND", 15, "CREATOR_CARD_TALL_BACKGROUND");
    public static final ArtworkType t = new ArtworkType("CREATOR_CARD_TALL_COMBO", 16, "CREATOR_CARD_TALL_COMBO");
    public static final ArtworkType w = new ArtworkType("EVIDENCE_ICON", 17, "EVIDENCE_ICON");
    public static final ArtworkType D = new ArtworkType("GAME_ACHIEVEMENT_ICON", 18, "GAME_ACHIEVEMENT_ICON");
    public static final ArtworkType z = new ArtworkType("GAME_ACHIEVEMENT_ICON_GRAYSCALE", 19, "GAME_ACHIEVEMENT_ICON_GRAYSCALE");
    public static final ArtworkType B = new ArtworkType("GAME_ART_HORIZONTAL", 20, "GAME_ART_HORIZONTAL");
    public static final ArtworkType C = new ArtworkType("GAME_ART_VERTICAL", 21, "GAME_ART_VERTICAL");
    public static final ArtworkType A = new ArtworkType("GAME_BILLBOARD", 22, "GAME_BILLBOARD");
    public static final ArtworkType G = new ArtworkType("GAME_CLOUD_BOXART_SQUARE", 23, "GAME_CLOUD_BOXART_SQUARE");
    public static final ArtworkType H = new ArtworkType("HERO_THREE_QUARTER_CROPPED", 24, "HERO_THREE_QUARTER_CROPPED");
    public static final ArtworkType E = new ArtworkType("KIDS_MYSTERY_BOX", 25, "KIDS_MYSTERY_BOX");
    public static final ArtworkType I = new ArtworkType("KUBRIC_KIDS_FULL_BODY", 26, "KUBRIC_KIDS_FULL_BODY");
    public static final ArtworkType F = new ArtworkType("LOGO_BRANDED_HORIZONTAL", 27, "LOGO_BRANDED_HORIZONTAL");
    public static final ArtworkType K = new ArtworkType("LOGO_BRANDED_STACKED", 28, "LOGO_BRANDED_STACKED");
    public static final ArtworkType M = new ArtworkType("LOGO_BRANDED_STACKED_AWARDS_BOTTOM", 29, "LOGO_BRANDED_STACKED_AWARDS_BOTTOM");
    public static final ArtworkType L = new ArtworkType("LOGO_BRANDED_STACKED_AWARDS_TOP", 30, "LOGO_BRANDED_STACKED_AWARDS_TOP");
    public static final ArtworkType N = new ArtworkType("LOGO_BRANDED_STACKED_ROAR", 31, "LOGO_BRANDED_STACKED_ROAR");

    /* renamed from: J  reason: collision with root package name */
    public static final ArtworkType f13172J = new ArtworkType("LOGO_HORIZONTAL_CROPPED", 32, "LOGO_HORIZONTAL_CROPPED");
    public static final ArtworkType Q = new ArtworkType("LOGO_STACKED_CROPPED", 33, "LOGO_STACKED_CROPPED");
    public static final ArtworkType S = new ArtworkType("MERCH_STILL", 34, "MERCH_STILL");
    public static final ArtworkType R = new ArtworkType("MERCH_STILL_9_16", 35, "MERCH_STILL_9_16");
    public static final ArtworkType O = new ArtworkType("MOBILE_PREVIEW", 36, "MOBILE_PREVIEW");
    public static final ArtworkType P = new ArtworkType("NETFLIX_ORIGINAL_CROPPED", 37, "NETFLIX_ORIGINAL_CROPPED");
    public static final ArtworkType U = new ArtworkType("NEW_CONTENT_BADGE_CROPPED", 38, "NEW_CONTENT_BADGE_CROPPED");
    public static final ArtworkType X = new ArtworkType("SCREENSAVER_BACKGROUND", 39, "SCREENSAVER_BACKGROUND");
    public static final ArtworkType W = new ArtworkType("SCREENSAVER_FOREGROUND", 40, "SCREENSAVER_FOREGROUND");
    public static final ArtworkType T = new ArtworkType("SCREENSAVER_MIDGROUND", 41, "SCREENSAVER_MIDGROUND");
    public static final ArtworkType V = new ArtworkType("SDP", 42, "SDP");
    public static final ArtworkType Y = new ArtworkType("SDP_ADDITIONAL", 43, "SDP_ADDITIONAL");
    public static final ArtworkType aa = new ArtworkType("SHORT_PANEL", 44, "SHORT_PANEL");
    public static final ArtworkType ab = new ArtworkType("SHORT_PANEL_VERTICAL_TV", 45, "SHORT_PANEL_VERTICAL_TV");
    public static final ArtworkType Z = new ArtworkType("SQUAREHEADSHOT_1000x1000", 46, "SQUAREHEADSHOT_1000x1000");
    public static final ArtworkType ac = new ArtworkType("STORY_ART", 47, "STORY_ART");
    public static final ArtworkType ag = new ArtworkType("TALL_PANEL_COMBO", 48, "TALL_PANEL_COMBO");
    public static final ArtworkType ae = new ArtworkType("TCARD", 49, "TCARD");
    public static final ArtworkType af = new ArtworkType("TITLE_TREATMENT", 50, "TITLE_TREATMENT");
    public static final ArtworkType ad = new ArtworkType("TITLE_TREATMENT_CROPPED", 51, "TITLE_TREATMENT_CROPPED");
    public static final ArtworkType ah = new ArtworkType("UNIVERSAL_BASE", 52, "UNIVERSAL_BASE");
    public static final ArtworkType am = new ArtworkType("VERTICAL_BILLBOARD", 53, "VERTICAL_BILLBOARD");
    public static final ArtworkType ak = new ArtworkType("VERTICAL_STORY_ART", 54, "VERTICAL_STORY_ART");
    public static final ArtworkType ai = new ArtworkType("WORDMARK_KIDS_CROPPED", 55, "WORDMARK_KIDS_CROPPED");
    public static final ArtworkType l = new ArtworkType("COLLECTION_DOUBLEWIDE_COMBO", 56, "COLLECTION_DOUBLEWIDE_COMBO");
    public static final ArtworkType u = new ArtworkType("ECLIPSE_BILLBOARD", 57, "ECLIPSE_BILLBOARD");
    public static final ArtworkType x = new ArtworkType("ECLIPSE_BOXART_MEDIUM", 58, "ECLIPSE_BOXART_MEDIUM");
    public static final ArtworkType y = new ArtworkType("ECLIPSE_BOXART_SMALL", 59, "ECLIPSE_BOXART_SMALL");
    public static final ArtworkType v = new ArtworkType("ECLIPSE_BOXART_GAME_CLOUD", 60, "ECLIPSE_BOXART_GAME_CLOUD");
    public static final ArtworkType s = new ArtworkType("ECLIPSE_BACKGROUND", 61, "ECLIPSE_BACKGROUND");
    public static final ArtworkType aj = new ArtworkType("UNKNOWN__", 62, "UNKNOWN__");

    private static final /* synthetic */ ArtworkType[] a() {
        return new ArtworkType[]{e, d, a, c, b, h, j, g, f, i, f13173o, k, m, n, q, p, t, w, D, z, B, C, A, G, H, E, I, F, K, M, L, N, f13172J, Q, S, R, O, P, U, X, W, T, V, Y, aa, ab, Z, ac, ag, ae, af, ad, ah, am, ak, ai, l, u, x, y, v, s, aj};
    }

    public static InterfaceC8598drn<ArtworkType> d() {
        return al;
    }

    public static ArtworkType valueOf(String str) {
        return (ArtworkType) Enum.valueOf(ArtworkType.class, str);
    }

    public static ArtworkType[] values() {
        return (ArtworkType[]) an.clone();
    }

    public final String e() {
        return this.ap;
    }

    private ArtworkType(String str, int i2, String str2) {
        this.ap = str2;
    }

    static {
        List j2;
        ArtworkType[] a2 = a();
        an = a2;
        al = C8600drp.e(a2);
        r = new c(null);
        j2 = C8569dql.j("APP_ICON", "AVATAR_KIDS_NMHP_NO_BG", "BADGE_ANY_TEXT", "BADGE_NEW", "BB2_OG_LOGO_PLUS_CROPPED", "BILLBOARD", "BOXSHOT", "BOXSHOT_BACKGROUND", "CHARACTER_198HOVER", "CHARACTER_CIRCLE_HALF", "CHARACTER_COMPACT", "CHARACTER_STORY_ART", "CREATOR_CARD_LOGO", "CREATOR_CARD_SHORT_BACKGROUND", "CREATOR_CARD_SHORT_COMBO", "CREATOR_CARD_TALL_BACKGROUND", "CREATOR_CARD_TALL_COMBO", "EVIDENCE_ICON", "GAME_ACHIEVEMENT_ICON", "GAME_ACHIEVEMENT_ICON_GRAYSCALE", "GAME_ART_HORIZONTAL", "GAME_ART_VERTICAL", "GAME_BILLBOARD", "GAME_CLOUD_BOXART_SQUARE", "HERO_THREE_QUARTER_CROPPED", "KIDS_MYSTERY_BOX", "KUBRIC_KIDS_FULL_BODY", "LOGO_BRANDED_HORIZONTAL", "LOGO_BRANDED_STACKED", "LOGO_BRANDED_STACKED_AWARDS_BOTTOM", "LOGO_BRANDED_STACKED_AWARDS_TOP", "LOGO_BRANDED_STACKED_ROAR", "LOGO_HORIZONTAL_CROPPED", "LOGO_STACKED_CROPPED", "MERCH_STILL", "MERCH_STILL_9_16", "MOBILE_PREVIEW", "NETFLIX_ORIGINAL_CROPPED", "NEW_CONTENT_BADGE_CROPPED", "SCREENSAVER_BACKGROUND", "SCREENSAVER_FOREGROUND", "SCREENSAVER_MIDGROUND", "SDP", "SDP_ADDITIONAL", "SHORT_PANEL", "SHORT_PANEL_VERTICAL_TV", "SQUAREHEADSHOT_1000x1000", "STORY_ART", "TALL_PANEL_COMBO", "TCARD", "TITLE_TREATMENT", "TITLE_TREATMENT_CROPPED", "UNIVERSAL_BASE", "VERTICAL_BILLBOARD", "VERTICAL_STORY_ART", "WORDMARK_KIDS_CROPPED", "COLLECTION_DOUBLEWIDE_COMBO", "ECLIPSE_BILLBOARD", "ECLIPSE_BOXART_MEDIUM", "ECLIPSE_BOXART_SMALL", "ECLIPSE_BOXART_GAME_CLOUD", "ECLIPSE_BACKGROUND");
        aq = new C9033hu("ArtworkType", j2);
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final ArtworkType e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = ArtworkType.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((ArtworkType) obj).e(), (Object) str)) {
                    break;
                }
            }
            ArtworkType artworkType = (ArtworkType) obj;
            return artworkType == null ? ArtworkType.aj : artworkType;
        }
    }
}
