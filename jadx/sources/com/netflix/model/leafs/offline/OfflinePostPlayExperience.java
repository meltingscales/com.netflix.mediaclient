package com.netflix.model.leafs.offline;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.PostPlayAction;
import com.netflix.model.leafs.PostPlayAsset;
import com.netflix.model.leafs.PostPlayExperience;
import com.netflix.model.leafs.PostPlayItem;
import com.netflix.model.leafs.SeasonRenewal;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC5160btX;

/* loaded from: classes5.dex */
public class OfflinePostPlayExperience implements PostPlayExperience {
    private static final String BETWEEN_TITLE = "betweenTitle";
    private static final String NON_SEQUENTIAL = "non_sequentialInSameTitle";
    protected static final int OFFLINE_POST_PLAY_AUTOPLAY_SECONDS = 10;
    protected static final String OFFLINE_POST_PLAY_TYPE = "nextEpisodeSeamless";
    private Integer actionsInitialIndex;
    private boolean autoplay;
    private int autoplaySeconds;
    private PostPlayAsset backgroundAsset;
    private Integer itemsInitialIndex;
    private PostPlayAsset logoAsset;
    private String promotedSupplementalMessage;
    private String promotedTitle;
    private Integer promotedVideoId;
    private String requestId;
    private int seamlessCountdownSeconds;
    private int seamlessEnd;
    private String theme;
    private String type;
    private final List<PostPlayAction> experienceTitle = new ArrayList(1);
    private final List<PostPlayAction> actions = new ArrayList(5);
    private final List<PostPlayItem> items = new ArrayList(5);

    public List<PostPlayAction> getActions() {
        return this.actions;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public Integer getActionsInitialIndex() {
        return this.actionsInitialIndex;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public boolean getAutoplay() {
        return this.autoplay;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public int getAutoplaySeconds() {
        return this.autoplaySeconds;
    }

    public PostPlayAsset getBackgroundAsset() {
        return this.backgroundAsset;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public List<PostPlayAction> getExperienceTitle() {
        return this.experienceTitle;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public List<PostPlayItem> getItems() {
        return this.items;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public Integer getItemsInitialIndex() {
        return this.itemsInitialIndex;
    }

    public PostPlayAsset getLogoAsset() {
        return this.logoAsset;
    }

    public String getPromotedSupplementalMessage() {
        return this.promotedSupplementalMessage;
    }

    public String getPromotedTitle() {
        return this.promotedTitle;
    }

    public Integer getPromotedVideoId() {
        return this.promotedVideoId;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public String getRequestId() {
        return this.requestId;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public int getSeamlessCountdownSeconds() {
        return this.seamlessCountdownSeconds;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public int getSeamlessEnd() {
        return this.seamlessEnd;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public SeasonRenewal getSeasonRenewal() {
        return null;
    }

    public String getTheme() {
        return this.theme;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public String getType() {
        return this.type;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public String getUuid() {
        return null;
    }

    public void setActionsInitialIndex(Integer num) {
        this.actionsInitialIndex = num;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public void setAutoplay(boolean z) {
        this.autoplay = z;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public void setAutoplaySeconds(int i) {
        this.autoplaySeconds = i;
    }

    public void setBackgroundAsset(PostPlayAsset postPlayAsset) {
        this.backgroundAsset = postPlayAsset;
    }

    public void setItemsInitialIndex(Integer num) {
        this.itemsInitialIndex = num;
    }

    public void setLogoAsset(PostPlayAsset postPlayAsset) {
        this.logoAsset = postPlayAsset;
    }

    public void setPromotedSupplementalMessage(String str) {
        this.promotedSupplementalMessage = str;
    }

    public void setPromotedTitle(String str) {
        this.promotedTitle = str;
    }

    public void setPromotedVideoId(Integer num) {
        this.promotedVideoId = num;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSeamlessCountdownSeconds(int i) {
        this.seamlessCountdownSeconds = i;
    }

    public void setSeamlessEnd(int i) {
        this.seamlessEnd = i;
    }

    public void setTheme(String str) {
        this.theme = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public OfflinePostPlayExperience(InterfaceC5160btX interfaceC5160btX, String str, String str2, boolean z, int i, int i2, int i3, int i4, VideoType videoType, int i5, boolean z2, boolean z3) {
        setAutoplaySeconds(10);
        setSeamlessCountdownSeconds(10);
        setSeamlessEnd(0);
        setRequestId(str2);
        setItemsInitialIndex(0);
        setActionsInitialIndex(0);
        OfflinePostPlayItem offlinePostPlayItem = new OfflinePostPlayItem(interfaceC5160btX, str, i, i2, i3, i4, videoType, i5);
        if (z2) {
            setType(BETWEEN_TITLE);
            offlinePostPlayItem.setExperienceType(BETWEEN_TITLE);
            offlinePostPlayItem.setAutoPlay(false);
            this.autoplay = false;
        } else {
            if (z3) {
                offlinePostPlayItem.setType(OFFLINE_POST_PLAY_TYPE);
            } else {
                offlinePostPlayItem.setType(NON_SEQUENTIAL);
            }
            setType(OFFLINE_POST_PLAY_TYPE);
            offlinePostPlayItem.setExperienceType(OFFLINE_POST_PLAY_TYPE);
            offlinePostPlayItem.setAutoPlay(z);
            this.autoplay = z;
        }
        getItems().add(offlinePostPlayItem);
    }

    public PostPlayAction getAutoPlayAction() {
        for (PostPlayItem postPlayItem : this.items) {
            PostPlayAction autoPlayAction = postPlayItem.getAutoPlayAction();
            if (autoPlayAction != null) {
                return autoPlayAction;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public PostPlayItem getAutoPlayItem() {
        for (PostPlayItem postPlayItem : this.items) {
            if (postPlayItem.getAutoPlayAction() != null) {
                return postPlayItem;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public PostPlayItem getSeasonRenewalPostPlayItem() {
        for (PostPlayItem postPlayItem : this.items) {
            if (postPlayItem.getSeasonRenewalPostPlayAction() != null) {
                return postPlayItem;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public int getAutoPlayActionSeconds() {
        for (PostPlayItem postPlayItem : this.items) {
            PostPlayAction autoPlayAction = postPlayItem.getAutoPlayAction();
            if (autoPlayAction != null) {
                return autoPlayAction.getAutoplaySeconds();
            }
        }
        return 0;
    }
}
