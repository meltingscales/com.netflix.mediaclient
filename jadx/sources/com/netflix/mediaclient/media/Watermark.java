package com.netflix.mediaclient.media;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.media.AutoValue_Watermark;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import o.C8168dfL;

/* loaded from: classes.dex */
public abstract class Watermark {

    /* loaded from: classes.dex */
    public enum Anchor {
        top_center,
        bottom_center
    }

    @SerializedName("anchor")
    public abstract Anchor anchor();

    @SerializedName(SignupConstants.Field.LANG_ID)
    public abstract String identifier();

    @SerializedName(InteractiveAnimation.ANIMATION_TYPE.OPACITY)
    public abstract int opacity();

    public boolean isValid() {
        return opacity() >= 0 && opacity() <= 100 && C8168dfL.h(identifier()) && anchor() != null;
    }

    public String getIdentifier() {
        return identifier();
    }

    public int getOpacity() {
        return opacity();
    }

    public Anchor getAnchor() {
        return anchor();
    }

    public static TypeAdapter<Watermark> typeAdapter(Gson gson) {
        return new AutoValue_Watermark.GsonTypeAdapter(gson);
    }
}
