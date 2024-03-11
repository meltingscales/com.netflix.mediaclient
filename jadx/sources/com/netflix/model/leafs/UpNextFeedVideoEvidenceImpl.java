package com.netflix.model.leafs;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.model.leafs.UpNextFeedVideoEvidence;
import java.util.List;
import o.AbstractC0941Im;
import o.C1045Mp;
import o.C8569dql;
import o.C8627dsp;
import o.InterfaceC0952Ix;
import o.InterfaceC8319diD;

/* loaded from: classes5.dex */
public final class UpNextFeedVideoEvidenceImpl extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC8319diD, UpNextFeedVideoEvidence {
    private static final String ACTIONS = "actions";
    private static final String CONTEXTUAL_SYNOPSIS = "contextualSynopsis";
    public static final Companion Companion = new Companion(null);
    private static final String DESCRIPTION = "description";
    private static final String IMAGES = "images";
    private static final String IMAGE_REQUEST_VIDEO_ID = "imageRequestVideoId";
    private static final String LAUNCH_DATE = "launchDate";
    private static final String PROMOTED_VIDEO_ID = "promotedVideoId";
    private static final String TITLE = "title";
    private static final String TITLE_TREATMENT_URL = "titleTreatmentUrl";
    private static final String TOP_LEVEL_SECTION_INDEX = "topLevelSectionIndex";
    private static final String VIDEO_MERCH_COMPUTE_ID = "videoMerchComputeId";
    private static final String VIDEO_TRAILER = "isVideoTrailer";
    @SerializedName(ACTIONS)
    private List<? extends UpNextFeedVideoEvidence.Action> actions;
    @SerializedName(CONTEXTUAL_SYNOPSIS)
    private ContextualText contextualSynopsis;
    @SerializedName(DESCRIPTION)
    private String description;
    @SerializedName(IMAGE_REQUEST_VIDEO_ID)
    private Integer imageRequestVideoId;
    @SerializedName(IMAGES)
    private List<? extends UpNextImageInfo> images;
    @SerializedName(LAUNCH_DATE)
    private String launchDate;
    @SerializedName(PROMOTED_VIDEO_ID)
    private Integer promotedVideoId;
    @SerializedName("title")
    private String title;
    @SerializedName(TITLE_TREATMENT_URL)
    private String titleTreatmentUrl;
    @SerializedName(TOP_LEVEL_SECTION_INDEX)
    private String topLevelSectionIndex;
    @SerializedName(VIDEO_MERCH_COMPUTE_ID)
    private String videoMerchComputeId;
    @SerializedName(VIDEO_TRAILER)
    private boolean videoTrailer;

    @Override // com.netflix.model.leafs.UpNextFeedVideoEvidence
    public ContextualText contextualSynopsis() {
        return this.contextualSynopsis;
    }

    @Override // com.netflix.model.leafs.UpNextFeedVideoEvidence
    public List<UpNextFeedVideoEvidence.Action> getActions() {
        return this.actions;
    }

    @Override // com.netflix.model.leafs.UpNextFeedVideoEvidence
    public String getDescription() {
        return this.description;
    }

    @Override // com.netflix.model.leafs.UpNextFeedVideoEvidence
    public Integer getImageRequestVideoId() {
        return this.imageRequestVideoId;
    }

    @Override // com.netflix.model.leafs.UpNextFeedVideoEvidence
    public String getLaunchDate() {
        return this.launchDate;
    }

    @Override // com.netflix.model.leafs.UpNextFeedVideoEvidence
    public Integer getPromotedVideoId() {
        return this.promotedVideoId;
    }

    @Override // com.netflix.model.leafs.UpNextFeedVideoEvidence
    public String getTitle() {
        return this.title;
    }

    @Override // com.netflix.model.leafs.UpNextFeedVideoEvidence
    public String getTitleTreatmentUrl() {
        return this.titleTreatmentUrl;
    }

    @Override // com.netflix.model.leafs.UpNextFeedVideoEvidence
    public String getTopLevelSectionIndex() {
        return this.topLevelSectionIndex;
    }

    @Override // com.netflix.model.leafs.UpNextFeedVideoEvidence
    public boolean isVideoTrailer() {
        return this.videoTrailer;
    }

    @Override // com.netflix.model.leafs.UpNextFeedVideoEvidence
    public String videoMerchComputeId() {
        return this.videoMerchComputeId;
    }

    public UpNextFeedVideoEvidenceImpl() {
        List<? extends UpNextFeedVideoEvidence.Action> i;
        i = C8569dql.i();
        this.actions = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x011e, code lost:
        if (r9 == null) goto L92;
     */
    @Override // o.InterfaceC0952Ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void populate(com.google.gson.JsonElement r13) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.UpNextFeedVideoEvidenceImpl.populate(com.google.gson.JsonElement):void");
    }

    /* loaded from: classes5.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("SearchSectionSummary");
        }
    }

    @Override // com.netflix.model.leafs.UpNextFeedVideoEvidence
    public List<UpNextImageInfo> getImages() {
        List<UpNextImageInfo> i;
        List list = this.images;
        if (list == null) {
            i = C8569dql.i();
            return i;
        }
        return list;
    }
}
