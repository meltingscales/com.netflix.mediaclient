package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class SegmentGroupGroupItem implements BaseGroupItem {
    public static final CREATOR CREATOR = new CREATOR(null);
    private final String groupName;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public SegmentGroupGroupItem(String str) {
        this.groupName = str;
    }

    @Override // com.netflix.model.leafs.originals.interactive.BaseGroupItem
    public String meetsConditions(InteractiveMoments interactiveMoments) {
        C8632dsu.c((Object) interactiveMoments, "");
        String nextSegmentIdForCurrentSegment = interactiveMoments.getNextSegmentIdForCurrentSegment(this.groupName);
        if (nextSegmentIdForCurrentSegment != null) {
            return nextSegmentIdForCurrentSegment;
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentGroupGroupItem(Parcel parcel) {
        this(parcel.readString());
        C8632dsu.c((Object) parcel, "");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeString(this.groupName);
    }

    /* loaded from: classes.dex */
    public static final class CREATOR implements Parcelable.Creator<SegmentGroupGroupItem> {
        public /* synthetic */ CREATOR(C8627dsp c8627dsp) {
            this();
        }

        private CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SegmentGroupGroupItem createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new SegmentGroupGroupItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SegmentGroupGroupItem[] newArray(int i) {
            return new SegmentGroupGroupItem[i];
        }
    }
}
