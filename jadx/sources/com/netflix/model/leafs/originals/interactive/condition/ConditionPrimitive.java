package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import java.io.IOException;
import o.C1044Mm;

/* loaded from: classes.dex */
public class ConditionPrimitive extends Condition {
    public static final Parcelable.Creator<ConditionPrimitive> CREATOR = new Parcelable.Creator<ConditionPrimitive>() { // from class: com.netflix.model.leafs.originals.interactive.condition.ConditionPrimitive.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionPrimitive createFromParcel(Parcel parcel) {
            return new ConditionPrimitive(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionPrimitive[] newArray(int i) {
            return new ConditionPrimitive[i];
        }
    };
    private final JsonPrimitive value;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public JsonElement getValue(InteractiveMoments interactiveMoments) {
        return this.value;
    }

    public ConditionPrimitive(JsonPrimitive jsonPrimitive) {
        this.value = jsonPrimitive;
    }

    public ConditionPrimitive(Boolean bool) {
        this.value = new JsonPrimitive(bool);
    }

    public ConditionPrimitive(Double d) {
        this.value = new JsonPrimitive(d);
    }

    public ConditionPrimitive(Integer num) {
        this.value = new JsonPrimitive(num);
    }

    public ConditionPrimitive(String str) {
        this.value = new JsonPrimitive(str);
    }

    private ConditionPrimitive(Parcel parcel) {
        this.value = (JsonPrimitive) parcel.readValue(JsonPrimitive.class.getClassLoader());
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public boolean meetsCondition(InteractiveMoments interactiveMoments) {
        boolean z;
        if (this.value.isBoolean()) {
            z = this.value.getAsBoolean();
        } else {
            z = this.value.isNumber() ? !this.value.getAsNumber().equals(0) : true;
        }
        C1044Mm.e("interactiveCondition", "primitive condition " + this.value + " than condition is " + z);
        return z;
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public void write(JsonWriter jsonWriter) {
        try {
            if (this.value.isNumber()) {
                jsonWriter.value(this.value.getAsDouble());
            } else if (this.value.isBoolean()) {
                jsonWriter.value(this.value.getAsBoolean());
            } else if (this.value.isString()) {
                jsonWriter.value(this.value.getAsString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.value);
    }
}
