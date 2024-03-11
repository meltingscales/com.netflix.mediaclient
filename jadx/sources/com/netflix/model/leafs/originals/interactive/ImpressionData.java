package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_ImpressionData;

/* loaded from: classes.dex */
public abstract class ImpressionData implements Parcelable {
    public abstract StateData data();

    public abstract String type();

    public static TypeAdapter<ImpressionData> typeAdapter(Gson gson) {
        return new C$AutoValue_ImpressionData.GsonTypeAdapter(gson);
    }
}
