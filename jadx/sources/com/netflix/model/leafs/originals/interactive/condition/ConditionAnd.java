package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import java.io.IOException;
import java.util.List;
import o.C1044Mm;

/* loaded from: classes.dex */
public class ConditionAnd extends Condition {
    public static final Parcelable.Creator<ConditionAnd> CREATOR = new Parcelable.Creator<ConditionAnd>() { // from class: com.netflix.model.leafs.originals.interactive.condition.ConditionAnd.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionAnd createFromParcel(Parcel parcel) {
            return new ConditionAnd(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionAnd[] newArray(int i) {
            return new ConditionAnd[i];
        }
    };
    private final Condition[] conditions;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ConditionAnd(List<Condition> list) {
        this.conditions = list == null ? null : (Condition[]) list.toArray(new Condition[0]);
    }

    public ConditionAnd(Condition... conditionArr) {
        this.conditions = conditionArr;
    }

    private ConditionAnd(Parcel parcel) {
        this.conditions = (Condition[]) parcel.readArray(Condition.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.conditions, 0);
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public boolean meetsCondition(InteractiveMoments interactiveMoments) {
        boolean z;
        Condition[] conditionArr = this.conditions;
        if (conditionArr != null) {
            z = false;
            for (Condition condition : conditionArr) {
                if (!condition.meetsCondition(interactiveMoments)) {
                    break;
                }
            }
        }
        z = true;
        C1044Mm.e("interactiveCondition", "and condition is " + z);
        return z;
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public void write(JsonWriter jsonWriter) {
        try {
            jsonWriter.value("and");
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
}
