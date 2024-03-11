package com.netflix.model.leafs.originals;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.AutoValue_ContentWarning;

/* loaded from: classes.dex */
public abstract class ContentWarning {
    @SerializedName("message")
    public abstract String message();

    @SerializedName(SignupConstants.Field.URL)
    public abstract String url();

    public static TypeAdapter<ContentWarning> typeAdapter(Gson gson) {
        return new AutoValue_ContentWarning.GsonTypeAdapter(gson);
    }
}
