package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_SourceRect;

/* loaded from: classes.dex */
public abstract class SourceRect implements Parcelable {
    public abstract Integer height();

    public abstract Integer width();

    public abstract Integer x();

    public abstract Integer y();

    public static TypeAdapter<SourceRect> typeAdapter(Gson gson) {
        return new C$AutoValue_SourceRect.GsonTypeAdapter(gson).setDefaultX(0).setDefaultY(0).setDefaultHeight(-2).setDefaultWidth(-2);
    }
}
