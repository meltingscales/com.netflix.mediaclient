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
public class ConditionMin extends Condition {
    public static final Parcelable.Creator<ConditionMin> CREATOR = new Parcelable.Creator<ConditionMin>() { // from class: com.netflix.model.leafs.originals.interactive.condition.ConditionMin.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionMin createFromParcel(Parcel parcel) {
            return new ConditionMin(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionMin[] newArray(int i) {
            return new ConditionMin[i];
        }
    };
    private final Condition[] conditions;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ConditionMin(List<Condition> list) {
        this.conditions = (Condition[]) list.toArray(new Condition[0]);
    }

    public ConditionMin(Condition... conditionArr) {
        this.conditions = conditionArr;
    }

    public ConditionMin(Parcel parcel) {
        this.conditions = (Condition[]) parcel.readArray(Condition.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.conditions, 0);
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public JsonElement getValue(InteractiveMoments interactiveMoments) {
        Double d;
        Condition[] conditionArr = this.conditions;
        if (conditionArr == null || conditionArr.length <= 0) {
            d = null;
        } else {
            d = null;
            for (Condition condition : conditionArr) {
                JsonElement value = condition.getValue(interactiveMoments);
                if (value != null && value.isJsonPrimitive()) {
                    if (value.getAsJsonPrimitive().isNumber()) {
                        double asDouble = value.getAsDouble();
                        if (d == null || asDouble < d.doubleValue()) {
                            d = Double.valueOf(asDouble);
                        }
                    } else if (value.getAsJsonPrimitive().isBoolean()) {
                        double d2 = value.getAsBoolean() ? 1.0d : 0.0d;
                        if (d == null || d2 < d.doubleValue()) {
                            d = Double.valueOf(d2);
                        }
                    }
                }
            }
        }
        C1044Mm.e("interactiveCondition", "condition max" + d);
        if (d == null) {
            return null;
        }
        return new JsonPrimitive(d);
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public void write(JsonWriter jsonWriter) {
        Condition[] conditionArr;
        try {
            jsonWriter.value("min");
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
