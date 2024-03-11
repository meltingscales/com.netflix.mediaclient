package com.netflix.model.leafs;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.C$AutoValue_SeasonRenewal;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class SeasonRenewal implements Parcelable {
    public abstract Map<String, SeasonRenewalAsset> assets();

    public abstract int autoPlaySeconds();

    public abstract boolean displayUpNext();

    public abstract String message();

    public abstract int watchedTopNodeid();

    public static TypeAdapter<SeasonRenewal> typeAdapter(Gson gson) {
        return new C$AutoValue_SeasonRenewal.GsonTypeAdapter(gson);
    }
}
