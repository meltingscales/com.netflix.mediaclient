package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Image;

/* loaded from: classes.dex */
public abstract class Image implements Parcelable {
    public abstract boolean animated();

    public abstract Integer height();

    public abstract String id();

    public abstract Float scale();

    public abstract SourceRect sourceRect();

    public abstract String url();

    public abstract Integer width();

    public static TypeAdapter<Image> typeAdapter(Gson gson) {
        return new C$AutoValue_Image.GsonTypeAdapter(gson).setDefaultHeight(0).setDefaultWidth(0).setDefaultScale(Float.valueOf(1.0f)).setDefaultId("");
    }
}
