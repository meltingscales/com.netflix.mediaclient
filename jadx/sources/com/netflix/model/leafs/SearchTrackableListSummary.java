package com.netflix.model.leafs;

import android.os.Parcel;
import com.google.gson.JsonElement;
import java.util.Map;
import o.C8123deT;
import o.InterfaceC5277bvi;

/* loaded from: classes5.dex */
public class SearchTrackableListSummary extends TrackableListSummaryImpl implements InterfaceC5277bvi {
    private static final String TAG = "SearchTrackableListSummary";
    private CreatorHomeBannerImpl creatorHomeBanner;
    private String displayTitle;
    private String listType;
    private String referenceId;

    public CreatorHomeBanner getCreatorHomeBanner() {
        return this.creatorHomeBanner;
    }

    public String getDisplayTitle() {
        return this.displayTitle;
    }

    @Override // com.netflix.model.leafs.TrackableListSummaryImpl, o.InterfaceC5281bvm
    public String getListContext() {
        return this.listType;
    }

    @Override // com.netflix.model.leafs.TrackableListSummaryImpl, o.InterfaceC5281bvm
    public String getListId() {
        return this.referenceId;
    }

    @Override // o.InterfaceC5277bvi
    public String getListType() {
        return this.listType;
    }

    public String getReferenceId() {
        return this.referenceId;
    }

    public SearchTrackableListSummary() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.netflix.model.leafs.TrackableListSummaryImpl, o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        char c;
        super.populate(jsonElement);
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            String key = entry.getKey();
            key.hashCode();
            switch (key.hashCode()) {
                case -1809429645:
                    if (key.equals("displayString")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -223276489:
                    if (key.equals("creatorHomeBanner")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -16211514:
                    if (key.equals("referenceId")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1345664248:
                    if (key.equals("listType")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.displayTitle = C8123deT.b(entry.getValue());
            } else if (c == 1) {
                CreatorHomeBannerImpl creatorHomeBannerImpl = new CreatorHomeBannerImpl();
                this.creatorHomeBanner = creatorHomeBannerImpl;
                creatorHomeBannerImpl.populate(entry.getValue());
            } else if (c == 2) {
                this.referenceId = C8123deT.b(entry.getValue());
            } else if (c == 3) {
                this.listType = C8123deT.b(entry.getValue());
            }
        }
    }

    protected SearchTrackableListSummary(Parcel parcel) {
        super(parcel);
        this.referenceId = parcel.readString();
        this.displayTitle = parcel.readString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.netflix.model.leafs.TrackableListSummaryImpl, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.referenceId);
        parcel.writeString(this.displayTitle);
    }
}
