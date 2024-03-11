package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import java.io.IOException;
import java.util.List;
import o.C1044Mm;

/* loaded from: classes.dex */
public class ConditionGreaterThanOrEqual extends Condition {
    public static final Parcelable.Creator<ConditionGreaterThanOrEqual> CREATOR = new Parcelable.Creator<ConditionGreaterThanOrEqual>() { // from class: com.netflix.model.leafs.originals.interactive.condition.ConditionGreaterThanOrEqual.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionGreaterThanOrEqual createFromParcel(Parcel parcel) {
            return new ConditionGreaterThanOrEqual(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionGreaterThanOrEqual[] newArray(int i) {
            return new ConditionGreaterThanOrEqual[i];
        }
    };
    private final Condition[] conditions;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ConditionGreaterThanOrEqual(List<Condition> list) {
        this.conditions = list == null ? null : (Condition[]) list.toArray(new Condition[0]);
    }

    public ConditionGreaterThanOrEqual(Condition... conditionArr) {
        this.conditions = conditionArr;
    }

    ConditionGreaterThanOrEqual(Parcel parcel) {
        this.conditions = (Condition[]) parcel.readArray(Condition.class.getClassLoader());
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public void write(JsonWriter jsonWriter) {
        try {
            jsonWriter.value("gte");
            Condition[] conditionArr = this.conditions;
            if (conditionArr != null) {
                for (Condition condition : conditionArr) {
                    jsonWriter.beginArray();
                    condition.write(jsonWriter);
                    jsonWriter.endArray();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public boolean meetsCondition(InteractiveMoments interactiveMoments) {
        Condition[] conditionArr = this.conditions;
        boolean z = false;
        if (conditionArr != null && conditionArr.length > 1) {
            Condition condition = conditionArr[0];
            Condition condition2 = conditionArr[1];
            if (condition != null && condition2 != null) {
                JsonElement value = condition.getValue(interactiveMoments);
                JsonElement value2 = condition2.getValue(interactiveMoments);
                if (value != null && value2 != null && value.isJsonPrimitive() && value.getAsJsonPrimitive().isNumber() && value2.isJsonPrimitive() && value2.getAsJsonPrimitive().isNumber() && value.getAsDouble() >= value2.getAsDouble()) {
                    z = true;
                }
            }
        }
        C1044Mm.e("interactiveCondition", "greater than or equal condition is " + z);
        return z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.conditions, 0);
    }
}
