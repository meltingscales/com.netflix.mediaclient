package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Style;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Style_Shadow;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class Style implements Parcelable {
    public abstract Float alignment();

    public abstract String backgroundColor();

    public abstract String color();

    public abstract Float fontSize();

    public abstract Float fontWeight();

    public abstract Float minFontSize();

    public abstract Integer numberOfLines();

    public abstract Float opacity();

    public abstract SourceRect rect();

    public abstract String scaleType();

    public abstract ScreenPosition screenPosition();

    public abstract Shadow shadow();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SerializedName("textDirection")
    public abstract String textDirectionString();

    public int getTextDirection() {
        return "rtl".equalsIgnoreCase(textDirectionString()) ? 2 : 3;
    }

    /* loaded from: classes.dex */
    public static abstract class Shadow implements Parcelable {
        public abstract Color color();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Map<String, Float> offset();

        public abstract Float radius();

        public Float x() {
            Float f;
            Map<String, Float> offset = offset();
            Float valueOf = Float.valueOf(0.0f);
            return (offset == null || (f = offset.get(InteractiveAnimation.ANIMATION_TYPE.WIDTH)) == null) ? valueOf : f;
        }

        public Float y() {
            Float f;
            Map<String, Float> offset = offset();
            Float valueOf = Float.valueOf(0.0f);
            return (offset == null || (f = offset.get(InteractiveAnimation.ANIMATION_TYPE.HEIGHT)) == null) ? valueOf : f;
        }

        public static TypeAdapter<Shadow> typeAdapter(Gson gson) {
            return new C$AutoValue_Style_Shadow.GsonTypeAdapter(gson).setDefaultRadius(Float.valueOf(1.0f));
        }
    }

    public static TypeAdapter<Style> typeAdapter(Gson gson) {
        return new C$AutoValue_Style.GsonTypeAdapter(gson);
    }
}
