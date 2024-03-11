package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcel;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class ConditionLastSeenSegment extends Condition {
    private final String segmentId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getSegmentId() {
        return this.segmentId;
    }

    public ConditionLastSeenSegment(String str) {
        C8632dsu.c((Object) str, "");
        this.segmentId = str;
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public boolean meetsCondition(InteractiveMoments interactiveMoments) {
        C8632dsu.c((Object) interactiveMoments, "");
        return C8632dsu.c((Object) this.segmentId, (Object) interactiveMoments.segmentHistory().get(interactiveMoments.segmentHistory().size() - 1));
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public JsonElement getValue(InteractiveMoments interactiveMoments) {
        C8632dsu.c((Object) interactiveMoments, "");
        return new JsonPrimitive(this.segmentId);
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public void write(JsonWriter jsonWriter) {
        if (jsonWriter != null) {
            jsonWriter.value("lastSeenSegment");
        }
        if (jsonWriter != null) {
            jsonWriter.value(this.segmentId);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeString(this.segmentId);
    }
}
