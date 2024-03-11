package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import java.io.IOException;
import java.util.List;
import o.C1044Mm;

/* loaded from: classes.dex */
public class ConditionDiv extends Condition {
    public static final Parcelable.Creator<ConditionDiv> CREATOR = new Parcelable.Creator<ConditionDiv>() { // from class: com.netflix.model.leafs.originals.interactive.condition.ConditionDiv.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionDiv createFromParcel(Parcel parcel) {
            return new ConditionDiv(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionDiv[] newArray(int i) {
            return new ConditionDiv[i];
        }
    };
    private final Condition[] conditions;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ConditionDiv(List<Condition> list) {
        this.conditions = (Condition[]) list.toArray(new Condition[0]);
    }

    public ConditionDiv(Condition... conditionArr) {
        this.conditions = conditionArr;
    }

    public ConditionDiv(Parcel parcel) {
        this.conditions = (Condition[]) parcel.readArray(Condition.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.conditions, 0);
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public JsonElement getValue(InteractiveMoments interactiveMoments) {
        JsonElement value;
        JsonElement value2;
        Condition[] conditionArr = this.conditions;
        if (conditionArr != null && conditionArr.length >= 2 && (value = conditionArr[1].getValue(interactiveMoments)) != null && value.isJsonPrimitive() && value.getAsJsonPrimitive().isNumber()) {
            double asDouble = value.getAsDouble();
            if (asDouble != 0.0d && (value2 = this.conditions[0].getValue(interactiveMoments)) != null && value2.isJsonPrimitive() && value2.getAsJsonPrimitive().isNumber()) {
                return new JsonPrimitive(Double.valueOf(value2.getAsDouble() / asDouble));
            }
        }
        C1044Mm.e("interactiveCondition", "condition div totals: 0.0");
        return new JsonPrimitive((Number) 0);
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public void write(JsonWriter jsonWriter) {
        Condition[] conditionArr;
        try {
            jsonWriter.value("div");
            for (Condition condition : this.conditions) {
                jsonWriter.beginArray();
                condition.write(jsonWriter);
                jsonWriter.endArray();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
