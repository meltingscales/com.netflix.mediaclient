package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Color;

/* loaded from: classes.dex */
public abstract class Color implements Parcelable {
    public abstract String colorWithRGB();

    public abstract Double withAlpha();

    public static TypeAdapter<Color> typeAdapter(Gson gson) {
        return new C$AutoValue_Color.GsonTypeAdapter(gson);
    }
}
