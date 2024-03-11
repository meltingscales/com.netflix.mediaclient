package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.C1044Mm;
import o.InterfaceC1598aHf;

/* loaded from: classes.dex */
public class ConditionMultiplication extends Condition {
    public static final Parcelable.Creator<ConditionMultiplication> CREATOR = new Parcelable.Creator<ConditionMultiplication>() { // from class: com.netflix.model.leafs.originals.interactive.condition.ConditionMultiplication.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionMultiplication createFromParcel(Parcel parcel) {
            return new ConditionMultiplication(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionMultiplication[] newArray(int i) {
            return new ConditionMultiplication[i];
        }
    };
    private final Condition[] conditions;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ConditionMultiplication(List<Condition> list) {
        this.conditions = (Condition[]) list.toArray(new Condition[0]);
    }

    public ConditionMultiplication(Condition... conditionArr) {
        this.conditions = conditionArr;
    }

    public ConditionMultiplication(Parcel parcel) {
        this.conditions = (Condition[]) parcel.readArray(Condition.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.conditions, 0);
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public JsonElement getValue(InteractiveMoments interactiveMoments) {
        double d;
        if (this.conditions == null) {
            InterfaceC1598aHf.a("Interactive invalid multiplication, null conditions");
        } else {
            ArrayList<Double> arrayList = new ArrayList(this.conditions.length);
            for (Condition condition : this.conditions) {
                JsonElement value = condition.getValue(interactiveMoments);
                if (value != null && value.isJsonPrimitive() && value.getAsJsonPrimitive().isNumber()) {
                    arrayList.add(Double.valueOf(value.getAsDouble()));
                }
            }
            if (arrayList.size() <= 1) {
                InterfaceC1598aHf.a("Interactive invalid multiplication, not enough values");
            } else {
                d = 1.0d;
                for (Double d2 : arrayList) {
                    d *= d2.doubleValue();
                }
                C1044Mm.e("interactiveCondition", "condition mult totals: " + d);
                return new JsonPrimitive(Double.valueOf(d));
            }
        }
        d = 0.0d;
        C1044Mm.e("interactiveCondition", "condition mult totals: " + d);
        return new JsonPrimitive(Double.valueOf(d));
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public void write(JsonWriter jsonWriter) {
        Condition[] conditionArr;
        try {
            jsonWriter.value("mult");
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
