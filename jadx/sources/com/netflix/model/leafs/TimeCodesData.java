package com.netflix.model.leafs;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.C$AutoValue_TimeCodesData;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.blades.SkipContentData;
import java.util.List;

/* loaded from: classes.dex */
public abstract class TimeCodesData implements Parcelable {
    @SerializedName("creditMarks")
    public abstract CreditMarks creditMarks();

    @SerializedName("skipContent")
    public abstract List<SkipContentData> skipContent();

    @SerializedName(SignupConstants.Field.VIDEO_ID)
    public abstract int videoId();

    public static TypeAdapter<TimeCodesData> typeAdapter(Gson gson) {
        return new C$AutoValue_TimeCodesData.GsonTypeAdapter(gson);
    }
}
