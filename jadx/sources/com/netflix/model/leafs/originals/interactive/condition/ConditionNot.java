package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import java.io.IOException;
import o.C1044Mm;

/* loaded from: classes.dex */
public class ConditionNot extends Condition {
    public static final Parcelable.Creator<ConditionNot> CREATOR = new Parcelable.Creator<ConditionNot>() { // from class: com.netflix.model.leafs.originals.interactive.condition.ConditionNot.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionNot createFromParcel(Parcel parcel) {
            return new ConditionNot(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionNot[] newArray(int i) {
            return new ConditionNot[i];
        }
    };
    private final Condition condition;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ConditionNot(Condition condition) {
        this.condition = condition;
    }

    private ConditionNot(Parcel parcel) {
        this.condition = (Condition) parcel.readParcelable(ConditionNot.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.condition, 0);
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public boolean meetsCondition(InteractiveMoments interactiveMoments) {
        Condition condition = this.condition;
        boolean z = condition == null || !condition.meetsCondition(interactiveMoments);
        C1044Mm.e("interactiveCondition", "not condition is " + z);
        return z;
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public void write(JsonWriter jsonWriter) {
        try {
            jsonWriter.value("not");
            jsonWriter.beginArray();
            this.condition.write(jsonWriter);
            jsonWriter.endArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
