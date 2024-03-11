package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcel;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import java.io.IOException;
import o.C1044Mm;

/* loaded from: classes.dex */
abstract class AbstractConditionState extends Condition {
    protected final String state;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected abstract String getName();

    public AbstractConditionState(String str) {
        this.state = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.state);
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public boolean meetsCondition(InteractiveMoments interactiveMoments) {
        boolean z;
        JsonElement value = getValue(interactiveMoments);
        if (value != null) {
            z = (value.isJsonPrimitive() && value.getAsJsonPrimitive().isBoolean()) ? value.getAsBoolean() : true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state condition for ");
        sb.append(value == null ? null : value.toString());
        sb.append(" meets condition");
        sb.append(z);
        C1044Mm.e("interactiveCondition", sb.toString());
        return z;
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public void write(JsonWriter jsonWriter) {
        try {
            jsonWriter.value(getName());
            jsonWriter.value(this.state);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
