package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaDimensions;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;

/* loaded from: classes.dex */
public abstract class UmaDimensions {
    @SerializedName(InteractiveAnimation.ANIMATION_TYPE.HEIGHT)
    public abstract Float height();

    @SerializedName(InteractiveAnimation.ANIMATION_TYPE.WIDTH)
    public abstract Float width();

    public Integer getWidthAsInteger() {
        Float width = width();
        if (width == null) {
            return null;
        }
        return Integer.valueOf((int) width.floatValue());
    }

    public Integer getHeightAsInteger() {
        Float height = height();
        if (height == null) {
            return null;
        }
        return Integer.valueOf((int) height.floatValue());
    }

    public static TypeAdapter<UmaDimensions> typeAdapter(Gson gson) {
        return new AutoValue_UmaDimensions.GsonTypeAdapter(gson);
    }
}
