package com.netflix.model.leafs;

import java.util.List;

/* loaded from: classes5.dex */
public interface PostPlayExperience {
    Integer getActionsInitialIndex();

    int getAutoPlayActionSeconds();

    PostPlayItem getAutoPlayItem();

    boolean getAutoplay();

    int getAutoplaySeconds();

    List<PostPlayAction> getExperienceTitle();

    List<PostPlayItem> getItems();

    Integer getItemsInitialIndex();

    String getRequestId();

    int getSeamlessCountdownSeconds();

    int getSeamlessEnd();

    SeasonRenewal getSeasonRenewal();

    PostPlayItem getSeasonRenewalPostPlayItem();

    String getType();

    String getUuid();

    void setAutoplay(boolean z);

    void setAutoplaySeconds(int i);
}
