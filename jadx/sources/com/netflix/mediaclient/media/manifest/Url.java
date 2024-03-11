package com.netflix.mediaclient.media.manifest;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.media.manifest.AutoValue_Url;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Url {
    public static final String DUMMY = "nflx://dummy";

    @SerializedName("cdn_id")
    public abstract int cdnId();

    @SerializedName("liveOcaCapabilities")
    public abstract List<String> liveOcaCapabilities();

    @SerializedName(SignupConstants.Field.URL)
    public abstract String url();

    public static TypeAdapter<Url> typeAdapter(Gson gson) {
        return new AutoValue_Url.GsonTypeAdapter(gson).setDefaultLiveOcaCapabilities(Collections.emptyList());
    }

    public static Url newInstance(int i, String str) {
        return new AutoValue_Url(i, str, Collections.emptyList());
    }

    public static Url newInstance(int i, String str, List<String> list) {
        return new AutoValue_Url(i, str, list);
    }
}
