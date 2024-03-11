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
public class ConditionSum extends Condition {
    public static final Parcelable.Creator<ConditionSum> CREATOR = new Parcelable.Creator<ConditionSum>() { // from class: com.netflix.model.leafs.originals.interactive.condition.ConditionSum.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionSum createFromParcel(Parcel parcel) {
            return new ConditionSum(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionSum[] newArray(int i) {
            return new ConditionSum[i];
        }
    };
    private final Condition[] conditions;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ConditionSum(List<Condition> list) {
        this.conditions = (Condition[]) list.toArray(new Condition[0]);
    }

    public ConditionSum(Condition... conditionArr) {
        this.conditions = conditionArr;
    }

    public ConditionSum(Parcel parcel) {
        this.conditions = (Condition[]) parcel.readArray(Condition.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.conditions, 0);
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public JsonElement getValue(InteractiveMoments interactiveMoments) {
        double d;
        Condition[] conditionArr = this.conditions;
        double d2 = 0.0d;
        if (conditionArr != null) {
            double d3 = 0.0d;
            for (Condition condition : conditionArr) {
                JsonElement value = condition.getValue(interactiveMoments);
                if (value != null && value.isJsonPrimitive()) {
                    if (value.getAsJsonPrimitive().isNumber()) {
                        d = value.getAsDouble();
                    } else if (value.getAsJsonPrimitive().isBoolean()) {
                        d = value.getAsBoolean() ? 1.0d : 0.0d;
                    }
                    d3 += d;
                }
            }
            d2 = d3;
        }
        C1044Mm.e("interactiveCondition", "condition sum totals: " + d2);
        return new JsonPrimitive(Double.valueOf(d2));
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public void write(JsonWriter jsonWriter) {
        Condition[] conditionArr;
        try {
            jsonWriter.value("sum");
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
