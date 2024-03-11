package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaImageDetails;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;

/* loaded from: classes.dex */
public abstract class UmaImageDetails {
    @SerializedName("size")
    public abstract UmaDimensions dimensions();

    @SerializedName("imageUrlHigh")
    public abstract String imageUrlHigh();

    @SerializedName("imageUrlLow")
    public abstract String imageUrlLow();

    @SerializedName("imageUrlMedium")
    public abstract String imageUrlMedium();

    @SerializedName(InteractiveAnimation.ANIMATION_TYPE.OPACITY)
    public abstract Float opacity();

    @SerializedName("position")
    public abstract UmaImagePosition position();

    public static TypeAdapter<UmaImageDetails> typeAdapter(Gson gson) {
        return new AutoValue_UmaImageDetails.GsonTypeAdapter(gson);
    }
}
