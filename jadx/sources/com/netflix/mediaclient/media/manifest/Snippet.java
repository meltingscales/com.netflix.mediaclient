package com.netflix.mediaclient.media.manifest;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.media.manifest.AutoValue_Snippet;

/* loaded from: classes.dex */
public abstract class Snippet {
    @SerializedName("endTimeMs")
    public abstract long endTimeMs();

    @SerializedName("snippetSpec")
    public abstract String snippetSpec();

    @SerializedName("startTimeMs")
    public abstract long startTimeMs();

    public static TypeAdapter<Snippet> typeAdapter(Gson gson) {
        return new AutoValue_Snippet.GsonTypeAdapter(gson);
    }
}
