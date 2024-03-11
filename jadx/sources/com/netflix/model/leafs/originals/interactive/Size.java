package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Size;

/* loaded from: classes.dex */
public abstract class Size implements Parcelable {
    public abstract Integer height();

    public abstract Integer width();

    public static TypeAdapter<Size> typeAdapter(Gson gson) {
        return new C$AutoValue_Size.GsonTypeAdapter(gson).setDefaultHeight(0).setDefaultWidth(0);
    }
}
