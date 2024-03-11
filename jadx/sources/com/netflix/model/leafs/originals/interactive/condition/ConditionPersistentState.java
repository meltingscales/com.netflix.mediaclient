package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;

/* loaded from: classes.dex */
public class ConditionPersistentState extends AbstractConditionState {
    public static final Parcelable.Creator<ConditionPersistentState> CREATOR = new Parcelable.Creator<ConditionPersistentState>() { // from class: com.netflix.model.leafs.originals.interactive.condition.ConditionPersistentState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionPersistentState createFromParcel(Parcel parcel) {
            return new ConditionPersistentState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionPersistentState[] newArray(int i) {
            return new ConditionPersistentState[i];
        }
    };
    private static final String TAG = "ConditionPersistentState";

    @Override // com.netflix.model.leafs.originals.interactive.condition.AbstractConditionState
    protected String getName() {
        return TAG;
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.AbstractConditionState, android.os.Parcelable
    public /* bridge */ /* synthetic */ int describeContents() {
        return super.describeContents();
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.AbstractConditionState, com.netflix.model.leafs.originals.interactive.condition.Condition
    public /* bridge */ /* synthetic */ boolean meetsCondition(InteractiveMoments interactiveMoments) {
        return super.meetsCondition(interactiveMoments);
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.AbstractConditionState, com.netflix.model.leafs.originals.interactive.condition.Condition
    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter) {
        super.write(jsonWriter);
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.AbstractConditionState, android.os.Parcelable
    public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public ConditionPersistentState(String str) {
        super(str);
    }

    private ConditionPersistentState(Parcel parcel) {
        super(parcel.readString());
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public JsonElement getValue(InteractiveMoments interactiveMoments) {
        return interactiveMoments.stateHistory().persistent().values.get(this.state);
    }
}
