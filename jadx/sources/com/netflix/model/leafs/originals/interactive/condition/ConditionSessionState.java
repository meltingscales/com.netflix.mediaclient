package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;

/* loaded from: classes.dex */
public class ConditionSessionState extends AbstractConditionState {
    public static final Parcelable.Creator<ConditionSessionState> CREATOR = new Parcelable.Creator<ConditionSessionState>() { // from class: com.netflix.model.leafs.originals.interactive.condition.ConditionSessionState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionSessionState createFromParcel(Parcel parcel) {
            return new ConditionSessionState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionSessionState[] newArray(int i) {
            return new ConditionSessionState[i];
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

    public ConditionSessionState(String str) {
        super(str);
    }

    private ConditionSessionState(Parcel parcel) {
        super(parcel.readString());
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public JsonElement getValue(InteractiveMoments interactiveMoments) {
        return interactiveMoments.stateHistory().sessionState.get(this.state);
    }
}
