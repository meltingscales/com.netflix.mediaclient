package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;

/* loaded from: classes.dex */
public abstract class Condition implements Parcelable {
    protected static final String TAG = "interactiveCondition";

    public boolean meetsCondition(InteractiveMoments interactiveMoments) {
        return false;
    }

    public void write(JsonWriter jsonWriter) {
    }

    public static TypeAdapter<Condition> typeAdapter(Gson gson) {
        return new ConditionAdapter();
    }

    public JsonElement getValue(InteractiveMoments interactiveMoments) {
        return new JsonPrimitive(Boolean.FALSE);
    }
}
