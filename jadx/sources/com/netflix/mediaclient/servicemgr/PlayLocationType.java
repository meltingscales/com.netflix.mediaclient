package com.netflix.mediaclient.servicemgr;

import com.netflix.mediaclient.util.KeepForJsonSerialization;
import com.netflix.model.leafs.PostPlayItem;

@KeepForJsonSerialization
/* loaded from: classes4.dex */
public enum PlayLocationType {
    CATALOG_FILTERS("catalogFilters"),
    STORY_ART("storyArt"),
    EPISODE(PostPlayItem.POST_PLAY_ITEM_EPISODE),
    DIRECT_PLAY("directPlay"),
    POST_PLAY("postPlay"),
    MDX("mdx"),
    CHARACTER_DP("cdp"),
    DOWNLOADS("downloads"),
    UP_NEXT("upNextFeed"),
    TRAILERS_AND_EXTRAS("trailersAndExtras"),
    LOLOMO_ROW("lolomoRow"),
    VIDEO_VIEW("videoView"),
    SEARCH("searchResults"),
    SEARCH_SUGGESTION_RESULTS("searchSuggestionResults"),
    IKO_RESTART_STATE_BUTTON("interactiveRestart_state"),
    QUICK_DRAW_DP("quickDrawDP"),
    DEEPLINK("deeplink"),
    DP_LANGUAGES_DIALOG("dp_languages_dialog"),
    GDP("gdp"),
    QUICK_DISCOVERY("quick_discovery"),
    MY_LIST("my_list"),
    USER_MARKS("user_marks"),
    UNKNOWN("");
    
    private final String value;

    public String getValue() {
        return this.value;
    }

    PlayLocationType(String str) {
        this.value = str;
    }

    public static PlayLocationType create(String str) {
        PlayLocationType[] values;
        PlayLocationType playLocationType = UNKNOWN;
        for (PlayLocationType playLocationType2 : values()) {
            if (playLocationType2.getValue().equals(str)) {
                return playLocationType2;
            }
        }
        return playLocationType;
    }
}
