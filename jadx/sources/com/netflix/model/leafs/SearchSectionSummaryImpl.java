package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9688vC;
import o.InterfaceC0952Ix;
import o.InterfaceC8319diD;

/* loaded from: classes5.dex */
public final class SearchSectionSummaryImpl extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC8319diD, SearchSectionSummary {
    private static final String CREATOR_HOME_BANNER = "creatorHomeBanner";
    public static final Companion Companion = new Companion(null);
    private static final String DISPLAY_STRING = "displayTitle";
    private static final String EXPIRES = "expires";
    private static final String FEATURE = "feature";
    private static final String LIST_TYPE = "listType";
    private static final String NUMBER_OF_SECTIONS = "numberOfSections";
    private static final String PAGE_KIND = "pageKind";
    private static final String REQUEST_ID = "requestId";
    private static final String SECONDARY_DISPLAY_TITLE = "secondaryDisplayTitle";
    private static final String SECTION_ID = "sectionId";
    private static final String SECTION_INDEX = "sectionIndex";
    private static final String SUGGESTED_NUMBER_OF_VIDEOS_TO_SHOW = "suggestedNumberOfVideosToShow";
    private static final String TRACK_ID = "trackId";
    @SerializedName(CREATOR_HOME_BANNER)
    private CreatorHomeBanner creatorHomeBanner;
    @SerializedName(DISPLAY_STRING)
    private String displayString;
    @SerializedName(FEATURE)
    private String feature;
    @SerializedName(LIST_TYPE)
    private String listType;
    @SerializedName(NUMBER_OF_SECTIONS)
    private int numberOfSections;
    @SerializedName(PAGE_KIND)
    private String pageKind;
    @SerializedName(SECONDARY_DISPLAY_TITLE)
    private String secondaryTitle;
    @SerializedName(SECTION_INDEX)
    private int sectionIndex;
    @SerializedName(SUGGESTED_NUMBER_OF_VIDEOS_TO_SHOW)
    private int suggestedNumOfVideos;
    @SerializedName(TRACK_ID)
    private int trackId;
    @SerializedName("requestId")
    private String requestId = " ";
    @SerializedName(SECTION_ID)
    private String sectionId = " ";
    @SerializedName(EXPIRES)
    private Long expiresTime = 0L;

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public CreatorHomeBanner getCreatorHomeBanner() {
        return this.creatorHomeBanner;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getDisplayString() {
        return this.displayString;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getEntityTreatmentType() {
        return null;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public Long getExpiresTime() {
        return this.expiresTime;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getFeature() {
        return this.feature;
    }

    @Override // o.InterfaceC5178btp
    public String getId() {
        return this.sectionId;
    }

    @Override // o.InterfaceC5281bvm
    public String getImpressionToken() {
        return null;
    }

    @Override // o.InterfaceC5174btl
    public int getLength() {
        return this.numberOfSections;
    }

    @Override // o.InterfaceC5281bvm
    public String getListContext() {
        return this.listType;
    }

    @Override // o.InterfaceC5281bvm
    public String getListId() {
        return this.sectionId;
    }

    @Override // o.InterfaceC5281bvm
    public int getListPos() {
        return this.sectionIndex;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getListType() {
        return this.listType;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getPageKind() {
        return this.pageKind;
    }

    @Override // o.InterfaceC5281bvm
    public String getRequestId() {
        return this.requestId;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getSecondaryTitle() {
        return this.secondaryTitle;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getSectionId() {
        return this.sectionId;
    }

    public final int getSectionIndex() {
        return this.sectionIndex;
    }

    /* renamed from: getSectionUid  reason: collision with other method in class */
    public Void m3079getSectionUid() {
        return null;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public int getSuggestedNumOfVideos() {
        return this.suggestedNumOfVideos;
    }

    @Override // o.InterfaceC5178btp
    public String getTitle() {
        return this.displayString;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public int getTotalSections() {
        return this.numberOfSections;
    }

    @Override // o.InterfaceC5281bvm
    public int getTrackId() {
        return this.trackId;
    }

    public final void setSectionIndex(int i) {
        this.sectionIndex = i;
    }

    @Override // o.InterfaceC5281bvm
    public /* bridge */ /* synthetic */ String getSectionUid() {
        return (String) m3079getSectionUid();
    }

    @Override // o.InterfaceC5178btp
    public LoMoType getType() {
        return LoMoType.STANDARD;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getReferenceId() {
        String str = this.requestId;
        String str2 = this.sectionId;
        return str + "|" + str2;
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            C8632dsu.d(entry);
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (key != null) {
                switch (key.hashCode()) {
                    case -2134705842:
                        if (key.equals(NUMBER_OF_SECTIONS)) {
                            this.numberOfSections = value.getAsInt();
                            break;
                        } else {
                            continue;
                        }
                    case -1309235404:
                        if (key.equals(EXPIRES)) {
                            this.expiresTime = Long.valueOf(value.getAsLong());
                            break;
                        } else {
                            continue;
                        }
                    case -1067396154:
                        if (key.equals(TRACK_ID)) {
                            this.trackId = value.getAsInt();
                            break;
                        } else {
                            continue;
                        }
                    case -979207434:
                        if (key.equals(FEATURE)) {
                            C8632dsu.d(value);
                            this.feature = C9688vC.c(value);
                            break;
                        } else {
                            continue;
                        }
                    case -678731040:
                        if (key.equals(SECTION_ID)) {
                            String asString = value.getAsString();
                            C8632dsu.a(asString, "");
                            this.sectionId = asString;
                            break;
                        } else {
                            continue;
                        }
                    case -223276489:
                        if (key.equals(CREATOR_HOME_BANNER)) {
                            CreatorHomeBannerImpl creatorHomeBannerImpl = new CreatorHomeBannerImpl();
                            C8632dsu.d(value);
                            creatorHomeBannerImpl.populate(value);
                            this.creatorHomeBanner = creatorHomeBannerImpl;
                            break;
                        } else {
                            continue;
                        }
                    case 630014189:
                        if (key.equals(SECTION_INDEX)) {
                            this.sectionIndex = value.getAsInt();
                            break;
                        } else {
                            continue;
                        }
                    case 693933066:
                        if (key.equals("requestId")) {
                            String asString2 = value.getAsString();
                            C8632dsu.a(asString2, "");
                            this.requestId = asString2;
                            break;
                        } else {
                            continue;
                        }
                    case 859189955:
                        if (key.equals(PAGE_KIND)) {
                            this.pageKind = value.getAsString();
                            break;
                        } else {
                            continue;
                        }
                    case 1061562483:
                        if (key.equals(SUGGESTED_NUMBER_OF_VIDEOS_TO_SHOW)) {
                            this.suggestedNumOfVideos = value.getAsInt();
                            break;
                        } else {
                            continue;
                        }
                    case 1345664248:
                        if (key.equals(LIST_TYPE)) {
                            C8632dsu.d(value);
                            this.listType = C9688vC.c(value);
                            break;
                        } else {
                            continue;
                        }
                    case 1542748746:
                        if (key.equals(SECONDARY_DISPLAY_TITLE)) {
                            this.secondaryTitle = value.getAsString();
                            break;
                        } else {
                            continue;
                        }
                    case 1604797110:
                        if (key.equals(DISPLAY_STRING)) {
                            C8632dsu.d(value);
                            this.displayString = C9688vC.c(value);
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
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
}
