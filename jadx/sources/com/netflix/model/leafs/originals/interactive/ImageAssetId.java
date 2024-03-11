package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_ImageAssetId;

/* loaded from: classes.dex */
public abstract class ImageAssetId implements Parcelable {
    public abstract String assetId();

    public static TypeAdapter<ImageAssetId> typeAdapter(Gson gson) {
        return new C$AutoValue_ImageAssetId.GsonTypeAdapter(gson);
    }
}
