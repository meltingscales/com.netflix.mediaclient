package com.netflix.model.leafs.originals;

import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import java.util.List;

/* loaded from: classes5.dex */
public interface BillboardSummary {
    String getActionToken();

    List<BillboardCTA> getActions();

    BillboardAvailabilityDates getAvailabilityDates();

    BillboardAsset getBackground();

    List<String> getBadgeKeys();

    String getBillboardTheme();

    String getBillboardType();

    ContextualText getContextualSynopsis();

    Integer getHighlightColor();

    BillboardAsset getHorizontalBackground();

    BillboardAsset getHorizontalLogo();

    String getId();

    String getImpressionToken();

    BillboardAsset getLogo();

    String getMaturityRating();

    BillboardPhase getPhase();

    String getSupplementalMessage();

    String getSynopsis();

    List<TagSummary> getTags();

    String getTitle();

    VideoAssets getVideoAssets();

    boolean isAward();

    boolean isOriginal();
}
