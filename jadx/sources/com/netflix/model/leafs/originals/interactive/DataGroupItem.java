package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class DataGroupItem implements BaseGroupItem {
    public static final CREATOR CREATOR = new CREATOR(null);
    private final SegmentGroupData data;
    private final String precondition;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final SegmentGroupData getData() {
        return this.data;
    }

    public final String getPrecondition() {
        return this.precondition;
    }

    public DataGroupItem(SegmentGroupData segmentGroupData, String str) {
        C8632dsu.c((Object) segmentGroupData, "");
        this.data = segmentGroupData;
        this.precondition = str;
    }

    @Override // com.netflix.model.leafs.originals.interactive.BaseGroupItem
    public String meetsConditions(InteractiveMoments interactiveMoments) {
        Condition condition;
        C8632dsu.c((Object) interactiveMoments, "");
        if (this.precondition == null || (condition = interactiveMoments.preconditions().get(this.precondition)) == null || condition.meetsCondition(interactiveMoments)) {
            return this.data.getSegmentId();
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DataGroupItem(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r2, r0)
            com.netflix.model.leafs.originals.interactive.SegmentGroupData$Companion r0 = com.netflix.model.leafs.originals.interactive.SegmentGroupData.Companion
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r2.readParcelable(r0)
            o.C8632dsu.d(r0)
            com.netflix.model.leafs.originals.interactive.SegmentGroupData r0 = (com.netflix.model.leafs.originals.interactive.SegmentGroupData) r0
            java.lang.String r2 = r2.readString()
            o.C8632dsu.d(r2)
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.originals.interactive.DataGroupItem.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeParcelable(this.data, 0);
        parcel.writeString(this.precondition);
    }

    /* loaded from: classes.dex */
    public static final class CREATOR implements Parcelable.Creator<DataGroupItem> {
        public /* synthetic */ CREATOR(C8627dsp c8627dsp) {
            this();
        }

        private CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DataGroupItem createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new DataGroupItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DataGroupItem[] newArray(int i) {
            return new DataGroupItem[i];
        }
    }
}
