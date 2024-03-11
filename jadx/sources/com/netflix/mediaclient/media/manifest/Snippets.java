package com.netflix.mediaclient.media.manifest;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.media.manifest.AutoValue_Snippets;

/* loaded from: classes.dex */
public abstract class Snippets {
    @SerializedName("EndIdent")
    public abstract Snippet EndIdent();

    @SerializedName("StartIdent")
    public abstract Snippet StartIdent();

    public static TypeAdapter<Snippets> typeAdapter(Gson gson) {
        return new AutoValue_Snippets.GsonTypeAdapter(gson);
    }
}
