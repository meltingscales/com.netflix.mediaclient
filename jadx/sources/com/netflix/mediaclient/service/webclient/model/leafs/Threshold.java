package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_Threshold;

/* loaded from: classes.dex */
public abstract class Threshold {
    @SerializedName("red")
    public abstract int getRed();

    @SerializedName("yellow")
    public abstract int getYellow();

    public static TypeAdapter<Threshold> typeAdapter(Gson gson) {
        return new AutoValue_Threshold.GsonTypeAdapter(gson);
    }
}
