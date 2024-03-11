package com.netflix.model.leafs.advisory;

import java.util.List;

/* loaded from: classes.dex */
public interface ContentAdvisory extends RatingDetails, Advisory {
    AdvisoryBoard getBoard();

    String getBroadcastDistributorName();

    String getBroadcastReleaseDate();

    String getCertSystemConfirmationId();

    String getI18nAdvisories();

    String getI18nRating();

    List<ContentAdvisoryIcon> getIcons();

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    String getRatingDescription();

    String getRatingIconLevel();

    String getRatingIconValue();

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    String getRatingShortDescription();
}
