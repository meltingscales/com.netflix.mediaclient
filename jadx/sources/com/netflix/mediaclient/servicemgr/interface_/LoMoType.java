package com.netflix.mediaclient.servicemgr.interface_;

import android.text.TextUtils;

/* loaded from: classes.dex */
public enum LoMoType {
    CONTINUE_WATCHING("continueWatching"),
    INSTANT_QUEUE("queue"),
    BILLBOARD("billboard"),
    COLLECTION_PAGE_EVIDENCE("containerPageEvidence"),
    COLLECTION_VIDEO_PAGE_EVIDENCE("pageVideoContainerEvidence"),
    CHARACTERS("character"),
    PEOPLE("person"),
    ROAR("netflixOriginals"),
    FLAT_GENRE("defaultKidsList"),
    GALLERY("gallery"),
    TOP_TEN("mostWatched"),
    BULK_RATER("bulkRater"),
    BULK_RATER_RECOMMENDATION("graphqlBulkRaterRecommendation"),
    CONTENT_PREVIEW("contentPreview"),
    DOWNLOADS_FOR_YOU("downloadsForYou"),
    KIDS_FAVORITES("kidsFavorites"),
    POPULAR_GAMES("popularGames"),
    IP_BASED_GAMES("configbased_ipBasedGames"),
    EDITORIAL_GAMES("gamesGenre"),
    GAME_BILLBOARD("gamesBillboard"),
    GAMES_TRAILERS("gamesTrailer"),
    READY_TO_PLAY("readyToPlay"),
    CATEGORIES("categoryCravers"),
    GAME_FEATURE_EDUCATION("gameFeatureEducation"),
    MOST_THUMBED("mostThumbed"),
    GAME_IDENTITY("gameIdentity"),
    RECENTLY_RELEASED_GAMES("recentlyReleasedGames"),
    DEFAULT_GAMES("graphQLDefaultGamesUI"),
    TRENDING_NOW("trendingNow"),
    COMING_SOON("comingSoon"),
    REMINDERS("reminders"),
    TRAILERS("trailers"),
    FEED("feed"),
    MY_PROFILES("configbased_myprofiles"),
    MY_DOWNLOADS("configbased_mydownloads"),
    MY_GAMES("configbased_gamesplaylist"),
    NOTIFICATIONS("configbased_notifications"),
    FAVORITE_TITLES("favoriteTitles"),
    BEHIND_THE_SCENES("configbased_gobehindthescenes"),
    RECENTLY_WATCHED("configbased_viewingactivity"),
    STANDARD("");
    
    private final String P;

    /* loaded from: classes4.dex */
    public enum EntityType {
        GAMES,
        FLAT_GENRES,
        CHARACTERS,
        VIDEOS
    }

    public String a() {
        return this.P;
    }

    LoMoType(String str) {
        this.P = str;
    }

    public static LoMoType a(String str) {
        LoMoType[] values;
        if (!TextUtils.isEmpty(str)) {
            for (LoMoType loMoType : values()) {
                if (loMoType.P.equalsIgnoreCase(str)) {
                    return loMoType;
                }
            }
        }
        return STANDARD;
    }

    public static boolean c(LoMoType loMoType) {
        return STANDARD.equals(loMoType) || FLAT_GENRE.equals(loMoType);
    }

    /* renamed from: com.netflix.mediaclient.servicemgr.interface_.LoMoType$4  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LoMoType.values().length];
            a = iArr;
            try {
                iArr[LoMoType.POPULAR_GAMES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[LoMoType.GAMES_TRAILERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[LoMoType.GAME_BILLBOARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[LoMoType.EDITORIAL_GAMES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[LoMoType.READY_TO_PLAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[LoMoType.GAME_IDENTITY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[LoMoType.FLAT_GENRE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[LoMoType.CHARACTERS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static EntityType e(LoMoType loMoType) {
        switch (AnonymousClass4.a[loMoType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return EntityType.GAMES;
            case 7:
                return EntityType.FLAT_GENRES;
            case 8:
                return EntityType.CHARACTERS;
            default:
                return EntityType.VIDEOS;
        }
    }
}
