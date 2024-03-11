package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import o.C1332Xp;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class SegmentGroupData implements Parcelable {
    public static final Companion Companion = new Companion(null);
    private final Choice.ChoiceAction action;
    private final StateHistory persistent;
    private final String segmentId;

    public static /* synthetic */ SegmentGroupData copy$default(SegmentGroupData segmentGroupData, String str, StateHistory stateHistory, Choice.ChoiceAction choiceAction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = segmentGroupData.segmentId;
        }
        if ((i & 2) != 0) {
            stateHistory = segmentGroupData.persistent;
        }
        if ((i & 4) != 0) {
            choiceAction = segmentGroupData.action;
        }
        return segmentGroupData.copy(str, stateHistory, choiceAction);
    }

    public static final SegmentGroupData fromReader(JsonReader jsonReader) {
        return Companion.fromReader(jsonReader);
    }

    public final String component1() {
        return this.segmentId;
    }

    public final StateHistory component2() {
        return this.persistent;
    }

    public final Choice.ChoiceAction component3() {
        return this.action;
    }

    public final SegmentGroupData copy(String str, StateHistory stateHistory, Choice.ChoiceAction choiceAction) {
        return new SegmentGroupData(str, stateHistory, choiceAction);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SegmentGroupData) {
            SegmentGroupData segmentGroupData = (SegmentGroupData) obj;
            return C8632dsu.c((Object) this.segmentId, (Object) segmentGroupData.segmentId) && C8632dsu.c(this.persistent, segmentGroupData.persistent) && C8632dsu.c(this.action, segmentGroupData.action);
        }
        return false;
    }

    public final Choice.ChoiceAction getAction() {
        return this.action;
    }

    public final StateHistory getPersistent() {
        return this.persistent;
    }

    public final String getSegmentId() {
        return this.segmentId;
    }

    public int hashCode() {
        String str = this.segmentId;
        int hashCode = str == null ? 0 : str.hashCode();
        StateHistory stateHistory = this.persistent;
        int hashCode2 = stateHistory == null ? 0 : stateHistory.hashCode();
        Choice.ChoiceAction choiceAction = this.action;
        return (((hashCode * 31) + hashCode2) * 31) + (choiceAction != null ? choiceAction.hashCode() : 0);
    }

    public String toString() {
        String str = this.segmentId;
        StateHistory stateHistory = this.persistent;
        Choice.ChoiceAction choiceAction = this.action;
        return "SegmentGroupData(segmentId=" + str + ", persistent=" + stateHistory + ", action=" + choiceAction + ")";
    }

    public SegmentGroupData(String str, StateHistory stateHistory, Choice.ChoiceAction choiceAction) {
        this.segmentId = str;
        this.persistent = stateHistory;
        this.action = choiceAction;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
        public final SegmentGroupData fromReader(JsonReader jsonReader) {
            Choice.ChoiceAction choiceAction;
            StateHistory stateHistory;
            TypeAdapter<StateHistory> typeAdapter = StateHistory.typeAdapter((Gson) C1332Xp.b(Gson.class));
            TypeAdapter<Choice.ChoiceAction> typeAdapter2 = Choice.ChoiceAction.typeAdapter((Gson) C1332Xp.b(Gson.class));
            String str = 0;
            if (jsonReader == null || jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
                choiceAction = null;
                stateHistory = null;
            } else {
                jsonReader.beginObject();
                stateHistory = null;
                String str2 = null;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String nextName = jsonReader.nextName();
                    if (nextName != null) {
                        int hashCode = nextName.hashCode();
                        if (hashCode != -1422950858) {
                            if (hashCode != 328437638) {
                                if (hashCode == 1973722931 && nextName.equals("segment")) {
                                    str2 = jsonReader.nextString();
                                }
                            } else if (nextName.equals("userState")) {
                                stateHistory = typeAdapter.read(jsonReader);
                            }
                        } else if (nextName.equals(SignupConstants.Error.DEBUG_INFO_ACTION)) {
                            str = typeAdapter2.read(jsonReader);
                        }
                    }
                }
                jsonReader.endObject();
                choiceAction = str;
                str = str2;
            }
            return new SegmentGroupData(str, stateHistory, choiceAction);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeString(this.segmentId);
        parcel.writeParcelable(this.persistent, 0);
    }
}
