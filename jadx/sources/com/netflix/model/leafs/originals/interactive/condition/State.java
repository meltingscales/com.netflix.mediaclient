package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: com.netflix.model.leafs.originals.interactive.condition.State.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public State createFromParcel(Parcel parcel) {
            return new State(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public State[] newArray(int i) {
            return new State[i];
        }
    };
    public static String SEGMENT_ID = "S_ID";
    public HashMap<String, JsonElement> values = new HashMap<>();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public State() {
    }

    protected State(Parcel parcel) {
        for (int readInt = parcel.readInt(); readInt > 0; readInt--) {
            this.values.put(parcel.readString(), (JsonPrimitive) parcel.readValue(JsonPrimitive.class.getClassLoader()));
        }
    }

    public String getStateSegmentId() {
        JsonElement jsonElement = this.values.get(SEGMENT_ID);
        if (jsonElement != null && jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isString()) {
            return jsonElement.getAsString();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Set<Map.Entry<String, JsonElement>> entrySet = this.values.entrySet();
        parcel.writeInt(entrySet.size());
        for (Map.Entry<String, JsonElement> entry : entrySet) {
            parcel.writeString(entry.getKey());
            parcel.writeValue(entry.getValue());
        }
    }

    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry<String, JsonElement> entry : this.values.entrySet()) {
            jsonObject.add(entry.getKey(), entry.getValue());
        }
        return jsonObject;
    }
}
