package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_ScreenPosition;

/* loaded from: classes.dex */
public abstract class ScreenPosition implements Parcelable {
    public abstract Float x();

    public abstract Float y();

    public static TypeAdapter<ScreenPosition> typeAdapter(Gson gson) {
        C$AutoValue_ScreenPosition.GsonTypeAdapter gsonTypeAdapter = new C$AutoValue_ScreenPosition.GsonTypeAdapter(gson);
        Float valueOf = Float.valueOf(0.0f);
        return gsonTypeAdapter.setDefaultX(valueOf).setDefaultY(valueOf);
    }
}
