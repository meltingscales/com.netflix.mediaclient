package com.netflix.model.leafs;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.C$AutoValue_SeasonRenewalAsset;

/* loaded from: classes.dex */
public abstract class SeasonRenewalAsset implements Parcelable {
    public abstract String assetType();

    public abstract int height();

    public abstract boolean isBadged();

    public abstract int scale();

    public abstract String url();

    public abstract int width();

    public static TypeAdapter<SeasonRenewalAsset> typeAdapter(Gson gson) {
        return new C$AutoValue_SeasonRenewalAsset.GsonTypeAdapter(gson);
    }
}
