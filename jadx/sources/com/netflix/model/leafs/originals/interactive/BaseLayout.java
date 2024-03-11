package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public interface BaseLayout extends Parcelable {
    AssetManifest assetManifest();

    @SerializedName("strings")
    StringsObject interactiveStrings();
}
