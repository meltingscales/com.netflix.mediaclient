package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import java.io.IOException;
import java.util.List;
import o.C1044Mm;

/* loaded from: classes.dex */
public class ConditionOr extends Condition {
    public static final Parcelable.Creator<ConditionOr> CREATOR = new Parcelable.Creator<ConditionOr>() { // from class: com.netflix.model.leafs.originals.interactive.condition.ConditionOr.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionOr createFromParcel(Parcel parcel) {
            return new ConditionOr(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionOr[] newArray(int i) {
            return new ConditionOr[i];
        }
    };
    private final Condition[] conditions;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ConditionOr(List<Condition> list) {
        this.conditions = list == null ? null : (Condition[]) list.toArray(new Condition[0]);
    }

    public ConditionOr(Condition... conditionArr) {
        this.conditions = conditionArr;
    }

    private ConditionOr(Parcel parcel) {
        this.conditions = (Condition[]) parcel.readArray(Condition.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.conditions, 0);
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public boolean meetsCondition(InteractiveMoments interactiveMoments) {
        Condition[] conditionArr = this.conditions;
        boolean z = false;
        if (conditionArr != null) {
            int length = conditionArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (conditionArr[i].meetsCondition(interactiveMoments)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        C1044Mm.e("interactiveCondition", "Or condition is " + z);
        return z;
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public void write(JsonWriter jsonWriter) {
        try {
            jsonWriter.value("or");
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
