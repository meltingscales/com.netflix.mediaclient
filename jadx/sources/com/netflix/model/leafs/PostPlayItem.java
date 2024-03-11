package com.netflix.model.leafs;

import java.util.List;

/* loaded from: classes5.dex */
public interface PostPlayItem {
    public static final String POST_PLAY_ITEM_EPISODE = "episode";

    List<PostPlayAction> getActions();

    String getAncestorSynopsis();

    String getAncestorTitle();

    PostPlayAction getAutoPlayAction();

    int getAutoPlaySeconds();

    PostPlayAsset getBackgroundAsset();

    List<String> getBadgeKeys();

    PostPlayAsset getDisplayArtAsset();

    int getEpisodes();

    String getExperienceType();

    PostPlayAction getFirstActionWithTrackId();

    String getImpressionData();

    PostPlayAsset getLogoAsset();

    int getMatchPercentage();

    String getMaturityRating();

    PostPlayAction getMoreInfoAction();

    PostPlayAction getPlayAction();

    PostPlayAction getPlayActionAtIndex(int i);

    PostPlayAction getPlayTrailerAction();

    int getRuntime();

    String getSeasonNumLabel();

    PostPlayAction getSeasonRenewalPlayTrailerAction();

    PostPlayAction getSeasonRenewalPostPlayAction();

    String getSeasonsLabel();

    String getSupplementalMessage();

    String getSynopsis();

    String getTitle();

    String getType();

    String getUiLabel();

    Integer getVideoId();

    Integer getYear();

    boolean hasNewBadge();

    boolean isAutoPlay();

    boolean isEpisodeNumberHidden();

    boolean isNewForPvr();

    boolean isNextEpisodeAutoPlay();

    boolean isPlayable();

    void setAutoPlay(boolean z);

    void setAutoPlaySeconds(int i);

    void setExperienceType(String str);

    void setNextEpisodeAutoPlay(boolean z);
}
