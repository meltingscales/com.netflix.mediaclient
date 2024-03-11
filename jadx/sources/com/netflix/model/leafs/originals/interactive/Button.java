package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Button;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Button_Label;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Button_States;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;

/* loaded from: classes.dex */
public abstract class Button implements Parcelable {
    public abstract Action action();

    public abstract Integer baselineY();

    public abstract Integer fontSize();

    public abstract Label label();

    public abstract SourceRect rect();

    public abstract ScreenPosition screenPosition();

    public abstract States states();

    /* loaded from: classes.dex */
    public static abstract class States implements Parcelable {
        @SerializedName("default")
        public abstract SpriteImage defaultState();

        @SerializedName(VisualStateDefinition.ELEMENT_STATE.SELECTED)
        public abstract SpriteImage selectedState();

        public static TypeAdapter<States> typeAdapter(Gson gson) {
            return new C$AutoValue_Button_States.GsonTypeAdapter(gson);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Label implements Parcelable {
        public abstract Color color();

        public abstract Integer fontSize();

        public abstract Integer numberOfLines();

        public abstract String string();

        public abstract Integer yOffset();

        public static TypeAdapter<Label> typeAdapter(Gson gson) {
            return new C$AutoValue_Button_Label.GsonTypeAdapter(gson).setDefaultString("").setDefaultFontSize(14).setDefaultYOffset(0).setDefaultNumberOfLines(1).setDefaultColor(new AutoValue_Color("#FFFFFF", Double.valueOf(1.0d)));
        }
    }

    public static TypeAdapter<Button> typeAdapter(Gson gson) {
        C$AutoValue_Button.GsonTypeAdapter defaultBaselineY = new C$AutoValue_Button.GsonTypeAdapter(gson).setDefaultFontSize(16).setDefaultBaselineY(0);
        Float valueOf = Float.valueOf(0.0f);
        return defaultBaselineY.setDefaultScreenPosition(new AutoValue_ScreenPosition(valueOf, valueOf));
    }
}
