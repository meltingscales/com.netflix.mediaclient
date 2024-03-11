package com.netflix.model.leafs.blades;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.blades.C$AutoValue_SkipContentData;

/* loaded from: classes.dex */
public abstract class SkipContentData implements Parcelable {
    @SerializedName("end")
    public abstract int end();

    @SerializedName("label")
    public abstract String label();

    @SerializedName("start")
    public abstract int start();

    public static TypeAdapter<SkipContentData> typeAdapter(Gson gson) {
        return new C$AutoValue_SkipContentData.GsonTypeAdapter(gson).setDefaultEnd(-1).setDefaultStart(-1);
    }
}
