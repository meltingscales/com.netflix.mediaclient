package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import o.C8168dfL;

/* loaded from: classes.dex */
public class ConditionPreconditionIdState extends Condition {
    public static final Parcelable.Creator<ConditionPreconditionIdState> CREATOR = new Parcelable.Creator<ConditionPreconditionIdState>() { // from class: com.netflix.model.leafs.originals.interactive.condition.ConditionPreconditionIdState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionPreconditionIdState createFromParcel(Parcel parcel) {
            return new ConditionPreconditionIdState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionPreconditionIdState[] newArray(int i) {
            return new ConditionPreconditionIdState[i];
        }
    };
    final String preconditionId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ConditionPreconditionIdState(String str) {
        this.preconditionId = str;
    }

    public ConditionPreconditionIdState(Parcel parcel) {
        this.preconditionId = parcel.readString();
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public boolean meetsCondition(InteractiveMoments interactiveMoments) {
        Condition condition;
        Condition condition2 = interactiveMoments.preconditions().get(this.preconditionId);
        if (((condition2 instanceof ConditionPreconditionIdState) && C8168dfL.c(((ConditionPreconditionIdState) condition2).preconditionId, this.preconditionId)) || (condition = interactiveMoments.preconditions().get(this.preconditionId)) == null) {
            return false;
        }
        return condition.meetsCondition(interactiveMoments);
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public JsonElement getValue(InteractiveMoments interactiveMoments) {
        Condition condition = interactiveMoments.preconditions().get(this.preconditionId);
        if (condition != null) {
            return condition.getValue(interactiveMoments);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.preconditionId);
    }
}
