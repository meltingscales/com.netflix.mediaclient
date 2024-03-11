package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Label;

/* loaded from: classes.dex */
public abstract class Label implements Parcelable {
    public abstract Color color();

    public abstract Float fontSize();

    public abstract Integer minFontSize();

    public abstract Integer numberOfLines();

    public abstract SourceRect rect();

    public abstract ScreenPosition screenPosition();

    public abstract String string();

    public static TypeAdapter<Label> typeAdapter(Gson gson) {
        return new C$AutoValue_Label.GsonTypeAdapter(gson).setDefaultNumberOfLines(1);
    }
}
