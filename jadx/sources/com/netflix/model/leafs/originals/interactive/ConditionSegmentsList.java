package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import o.C1044Mm;

/* loaded from: classes.dex */
public class ConditionSegmentsList extends Condition implements Parcelable {
    public static final Parcelable.Creator<ConditionSegmentsList> CREATOR = new Parcelable.Creator<ConditionSegmentsList>() { // from class: com.netflix.model.leafs.originals.interactive.ConditionSegmentsList.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionSegmentsList createFromParcel(Parcel parcel) {
            return new ConditionSegmentsList(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConditionSegmentsList[] newArray(int i) {
            return new ConditionSegmentsList[i];
        }
    };
    private final Set<String> segments;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ConditionSegmentsList(Set<String> set) {
        this.segments = set;
    }

    private ConditionSegmentsList(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.segments = new HashSet(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(new ArrayList(this.segments));
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public boolean meetsCondition(InteractiveMoments interactiveMoments) {
        boolean z;
        Set<String> set = this.segments;
        if (set != null) {
            for (String str : set) {
                if (!interactiveMoments.segmentHistory().contains(str)) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        C1044Mm.e("interactiveCondition", "segment List condition is " + z);
        return z;
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Condition
    public void write(JsonWriter jsonWriter) {
        try {
            jsonWriter.value("hasSeenSegments");
            Set<String> set = this.segments;
            if (set != null && !set.isEmpty()) {
                for (String str : this.segments) {
                    jsonWriter.value(str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
