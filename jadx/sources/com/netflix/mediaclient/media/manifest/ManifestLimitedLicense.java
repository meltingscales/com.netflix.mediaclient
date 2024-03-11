package com.netflix.mediaclient.media.manifest;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.media.manifest.AutoValue_ManifestLimitedLicense;

/* loaded from: classes.dex */
public abstract class ManifestLimitedLicense {
    @SerializedName("licenseResponseBase64")
    public abstract byte[] bytes();

    @SerializedName("drmSessionId")
    public abstract int drmSessionId();

    public static TypeAdapter<ManifestLimitedLicense> typeAdapter(Gson gson) {
        return new AutoValue_ManifestLimitedLicense.GsonTypeAdapter(gson);
    }
}
