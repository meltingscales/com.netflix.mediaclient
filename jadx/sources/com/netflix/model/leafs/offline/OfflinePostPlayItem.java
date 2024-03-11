package com.netflix.model.leafs.offline;

import android.text.TextUtils;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.PostPlayAction;
import com.netflix.model.leafs.PostPlayAsset;
import com.netflix.model.leafs.PostPlayItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC5158btV;
import o.InterfaceC5160btX;

/* loaded from: classes5.dex */
public class OfflinePostPlayItem implements InterfaceC5158btV, PostPlayItem {
    private static final String TAG = "PostPlayItem";
    private String ancestorSynopsis;
    private String ancestorTitle;
    private boolean autoPlay;
    private int autoPlaySeconds;
    private String availabilityDateMessaging;
    private PostPlayAsset backgroundAsset;
    private PostPlayAsset displayArtAsset;
    private boolean episodeNumberHidden;
    private int episodes;
    private String experienceType;
    private String impressionData;
    private PostPlayAsset logoAsset;
    private int matchPercentage;
    private String maturityRating;
    private boolean newForPvr;
    private boolean nextEpisodeAutoPlay;
    private int offlineEpisodeCount;
    private int runtime;
    private String seasonSequenceAbbr;
    private int seasons;
    private String seasonsLabel;
    private String supplementalMessage;
    private String synopsis;
    private String title;
    private String type;
    private int userThumbRating;
    private Integer videoId;
    private VideoType videoType;
    private Integer year;
    private Map<String, String> delivery = new HashMap();
    private final List<PostPlayAction> actions = new ArrayList(5);
    private boolean isNSRE = false;
    private List<String> badgeKeys = new ArrayList(2);
    private String uiLabel = "postplay";

    private void initializeUILabel() {
        this.uiLabel = "postplay";
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public List<PostPlayAction> getActions() {
        return this.actions;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getAncestorSynopsis() {
        return this.ancestorSynopsis;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getAncestorTitle() {
        return this.ancestorTitle;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public int getAutoPlaySeconds() {
        return this.autoPlaySeconds;
    }

    public String getAvailabilityDateMessaging() {
        return this.availabilityDateMessaging;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAsset getBackgroundAsset() {
        return this.backgroundAsset;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public List<String> getBadgeKeys() {
        return this.badgeKeys;
    }

    public Map<String, String> getDelivery() {
        return this.delivery;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAsset getDisplayArtAsset() {
        return this.displayArtAsset;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public int getEpisodes() {
        return this.episodes;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getExperienceType() {
        return this.experienceType;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getImpressionData() {
        return this.impressionData;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAsset getLogoAsset() {
        return this.logoAsset;
    }

    @Override // o.InterfaceC5158btV, com.netflix.model.leafs.PostPlayItem
    public int getMatchPercentage() {
        return this.matchPercentage;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getMaturityRating() {
        return this.maturityRating;
    }

    public int getOfflineEpisodeCount() {
        return this.offlineEpisodeCount;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public int getRuntime() {
        return this.runtime;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getSeasonNumLabel() {
        return null;
    }

    public String getSeasonSequenceAbbr() {
        return this.seasonSequenceAbbr;
    }

    public int getSeasons() {
        return this.seasons;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getSeasonsLabel() {
        return this.seasonsLabel;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getSupplementalMessage() {
        return this.supplementalMessage;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getSynopsis() {
        return this.synopsis;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getTitle() {
        return this.title;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getType() {
        return this.type;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getUiLabel() {
        return this.uiLabel;
    }

    @Override // o.InterfaceC5158btV
    public int getUserThumbRating() {
        return this.userThumbRating;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public Integer getVideoId() {
        return this.videoId;
    }

    public VideoType getVideoType() {
        return this.videoType;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public Integer getYear() {
        return this.year;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public boolean isAutoPlay() {
        return this.autoPlay;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public boolean isEpisodeNumberHidden() {
        return this.episodeNumberHidden;
    }

    public boolean isNSRE() {
        return this.isNSRE;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public boolean isNewForPvr() {
        return this.newForPvr;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public boolean isNextEpisodeAutoPlay() {
        return this.nextEpisodeAutoPlay;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public boolean isPlayable() {
        return true;
    }

    public void setAncestorSynopsis(String str) {
        this.ancestorSynopsis = str;
    }

    public void setAncestorTitle(String str) {
        this.ancestorTitle = str;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public void setAutoPlay(boolean z) {
        this.autoPlay = z;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public void setAutoPlaySeconds(int i) {
        this.autoPlaySeconds = i;
    }

    public void setAvailabilityDateMessaging(String str) {
        this.availabilityDateMessaging = str;
    }

    public void setBackgroundAsset(PostPlayAsset postPlayAsset) {
        this.backgroundAsset = postPlayAsset;
    }

    public void setDelivery(Map<String, String> map) {
        this.delivery = map;
    }

    public void setDisplayArtAsset(PostPlayAsset postPlayAsset) {
        this.displayArtAsset = postPlayAsset;
    }

    public void setEpisodes(int i) {
        this.episodes = i;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public void setExperienceType(String str) {
        this.experienceType = str;
    }

    public void setImpressionData(String str) {
        this.impressionData = str;
    }

    public void setLogoAsset(PostPlayAsset postPlayAsset) {
        this.logoAsset = postPlayAsset;
    }

    public void setMaturityRating(String str) {
        this.maturityRating = str;
    }

    public void setNSRE(boolean z) {
        this.isNSRE = z;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public void setNextEpisodeAutoPlay(boolean z) {
        this.nextEpisodeAutoPlay = z;
    }

    public void setRuntime(int i) {
        this.runtime = i;
    }

    public void setSeasonSequenceAbbr(String str) {
        this.seasonSequenceAbbr = str;
    }

    public void setSeasons(int i) {
        this.seasons = i;
    }

    public void setSeasonsLabel(String str) {
        this.seasonsLabel = str;
    }

    public void setSupplementalMessage(String str) {
        this.supplementalMessage = str;
    }

    public void setSynopsis(String str) {
        this.synopsis = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUserThumbRating(int i) {
    }

    public void setVideoId(Integer num) {
        this.videoId = num;
    }

    public void setYear(Integer num) {
        this.year = num;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OfflinePostPlayItem(InterfaceC5160btX interfaceC5160btX, String str, int i, int i2, int i3, int i4, VideoType videoType, int i5) {
        this.offlineEpisodeCount = 0;
        setVideoId(Integer.valueOf(Integer.parseInt(interfaceC5160btX.aH_() == null ? "-1" : interfaceC5160btX.aH_())));
        getActions().add(new OfflinePostPlayAction(interfaceC5160btX, i, i2, i3, videoType));
        setType(PostPlayItem.POST_PLAY_ITEM_EPISODE);
        setAncestorTitle(interfaceC5160btX.aC_());
        setTitle(interfaceC5160btX.aI_());
        setDisplayArtAsset(new OfflinePostPlayAsset(str));
        setRuntime(i4);
        if (videoType != VideoType.MOVIE) {
            this.offlineEpisodeCount = i5;
        }
        this.videoType = videoType;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAction getPlayAction() {
        for (int i = 0; i < this.actions.size(); i++) {
            PostPlayAction postPlayAction = this.actions.get(i);
            if (postPlayAction != null && TextUtils.equals(postPlayAction.getType(), "play")) {
                return postPlayAction;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAction getPlayTrailerAction() {
        for (int i = 0; i < this.actions.size(); i++) {
            PostPlayAction postPlayAction = this.actions.get(i);
            if (postPlayAction != null && TextUtils.equals(postPlayAction.getType(), "play") && TextUtils.equals(postPlayAction.getName(), "playTrailer")) {
                return postPlayAction;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAction getPlayActionAtIndex(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.actions.size(); i3++) {
            PostPlayAction postPlayAction = this.actions.get(i3);
            if (postPlayAction != null && TextUtils.equals(postPlayAction.getType(), "play")) {
                if (i2 == i) {
                    return postPlayAction;
                }
                i2++;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAction getFirstActionWithTrackId() {
        for (int i = 0; i < this.actions.size(); i++) {
            PostPlayAction postPlayAction = this.actions.get(i);
            if (postPlayAction != null && postPlayAction.getTrackId() > 0) {
                return postPlayAction;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAction getMoreInfoAction() {
        for (int i = 0; i < this.actions.size(); i++) {
            PostPlayAction postPlayAction = this.actions.get(i);
            if (postPlayAction != null && (TextUtils.equals(postPlayAction.getType(), "details") || TextUtils.equals(postPlayAction.getType(), "mdp"))) {
                return postPlayAction;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAction getAutoPlayAction() {
        for (int i = 0; i < this.actions.size(); i++) {
            PostPlayAction postPlayAction = this.actions.get(i);
            if (postPlayAction != null && TextUtils.equals(postPlayAction.getType(), "play") && postPlayAction.isAutoPlay()) {
                return postPlayAction;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAction getSeasonRenewalPostPlayAction() {
        for (int i = 0; i < this.actions.size(); i++) {
            PostPlayAction postPlayAction = this.actions.get(i);
            if (postPlayAction != null && TextUtils.equals(postPlayAction.getType(), "play")) {
                return postPlayAction;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAction getSeasonRenewalPlayTrailerAction() {
        for (int i = 0; i < this.actions.size(); i++) {
            PostPlayAction postPlayAction = this.actions.get(i);
            if (postPlayAction != null && TextUtils.equals(postPlayAction.getType(), "play") && TextUtils.equals(postPlayAction.getName(), "playTrailer")) {
                return postPlayAction;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public boolean hasNewBadge() {
        return this.badgeKeys.contains("NEW");
    }
}
