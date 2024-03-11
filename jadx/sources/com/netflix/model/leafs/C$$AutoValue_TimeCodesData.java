package com.netflix.model.leafs;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.blades.SkipContentData;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.$$AutoValue_TimeCodesData  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_TimeCodesData extends TimeCodesData {
    private final CreditMarks creditMarks;
    private final List<SkipContentData> skipContent;
    private final int videoId;

    @Override // com.netflix.model.leafs.TimeCodesData
    @SerializedName("creditMarks")
    public CreditMarks creditMarks() {
        return this.creditMarks;
    }

    @Override // com.netflix.model.leafs.TimeCodesData
    @SerializedName("skipContent")
    public List<SkipContentData> skipContent() {
        return this.skipContent;
    }

    @Override // com.netflix.model.leafs.TimeCodesData
    @SerializedName(SignupConstants.Field.VIDEO_ID)
    public int videoId() {
        return this.videoId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_TimeCodesData(CreditMarks creditMarks, List<SkipContentData> list, int i) {
        this.creditMarks = creditMarks;
        this.skipContent = list;
        this.videoId = i;
    }

    public String toString() {
        return "TimeCodesData{creditMarks=" + this.creditMarks + ", skipContent=" + this.skipContent + ", videoId=" + this.videoId + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TimeCodesData) {
            TimeCodesData timeCodesData = (TimeCodesData) obj;
            CreditMarks creditMarks = this.creditMarks;
            if (creditMarks != null ? creditMarks.equals(timeCodesData.creditMarks()) : timeCodesData.creditMarks() == null) {
                List<SkipContentData> list = this.skipContent;
                if (list != null ? list.equals(timeCodesData.skipContent()) : timeCodesData.skipContent() == null) {
                    if (this.videoId == timeCodesData.videoId()) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        CreditMarks creditMarks = this.creditMarks;
        int hashCode = creditMarks == null ? 0 : creditMarks.hashCode();
        List<SkipContentData> list = this.skipContent;
        return ((((hashCode ^ 1000003) * 1000003) ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.videoId;
    }
}
