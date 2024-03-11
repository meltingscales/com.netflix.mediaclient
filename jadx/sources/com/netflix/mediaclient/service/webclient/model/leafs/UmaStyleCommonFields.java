package com.netflix.mediaclient.service.webclient.model.leafs;

import android.graphics.Color;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes.dex */
public abstract class UmaStyleCommonFields {
    @SerializedName("color")
    public abstract String color();

    @SerializedName("size")
    public abstract Float fontSize();

    @SerializedName("justification")
    public abstract TextJustification justification();

    @SerializedName(InteractiveAnimation.ANIMATION_TYPE.OPACITY)
    public abstract Float opacity();

    public final Integer getAsARGB() {
        String color = color();
        if (color == null) {
            return null;
        }
        Float opacity = opacity();
        if (opacity != null && color.length() == 6) {
            color = Integer.toHexString((int) (opacity.floatValue() * ((float) PrivateKeyType.INVALID))) + color;
        }
        return Integer.valueOf(Color.parseColor("#" + color));
    }
}
