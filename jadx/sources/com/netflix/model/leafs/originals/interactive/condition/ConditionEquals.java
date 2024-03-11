package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import java.io.IOException;
import o.C1044Mm;

/* loaded from: classes.dex */
public class ConditionEquals extends Condition {
    public static final Parcelable.Creator<ConditionEquals> CREATOR = new Parcelable.Creator<ConditionEquals>() { // from class: com.netflix.model.leafs.originals.interactive.condition.ConditionEquals.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionEquals createFromParcel(Parcel parcel) {
            return new ConditionEquals(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionEquals[] newArray(int i) {
            return new ConditionEquals[i];
        }
    };
    private final Condition[] conditions;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ConditionEquals(Condition... conditionArr) {
        this.conditions = conditionArr;
    }

    public ConditionEquals(Parcel parcel) {
        this.conditions = (Condition[]) parcel.readParcelableArray(Condition.class.getClassLoader());
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public boolean meetsCondition(InteractiveMoments interactiveMoments) {
        Condition[] conditionArr = this.conditions;
        boolean z = false;
        if (conditionArr.length == 1) {
            return conditionArr[0].meetsCondition(interactiveMoments);
        }
        if (conditionArr.length > 1) {
            JsonElement value = conditionArr[0].getValue(interactiveMoments);
            if (value != null) {
                int i = 1;
                while (true) {
                    Condition[] conditionArr2 = this.conditions;
                    if (i >= conditionArr2.length) {
                        break;
                    } else if (!value.equals(conditionArr2[i].getValue(interactiveMoments))) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            C1044Mm.e("interactiveCondition", "equals condition is " + z);
            return z;
        }
        z = true;
        C1044Mm.e("interactiveCondition", "equals condition is " + z);
        return z;
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public void write(JsonWriter jsonWriter) {
        try {
            jsonWriter.value("equals");
            jsonWriter.beginArray();
            for (Condition condition : this.conditions) {
                condition.write(jsonWriter);
            }
            jsonWriter.endArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.conditions, i);
    }
}
