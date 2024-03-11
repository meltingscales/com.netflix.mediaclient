package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class PreconditionGroupItem implements BaseGroupItem {
    public static final CREATOR CREATOR = new CREATOR(null);
    private final String id;
    private final String precondition;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPrecondition() {
        return this.precondition;
    }

    public PreconditionGroupItem(String str, String str2) {
        this.id = str;
        this.precondition = str2;
    }

    @Override // com.netflix.model.leafs.originals.interactive.BaseGroupItem
    public String meetsConditions(InteractiveMoments interactiveMoments) {
        C8632dsu.c((Object) interactiveMoments, "");
        Condition condition = interactiveMoments.preconditions().get(this.precondition);
        if (condition == null || condition.meetsCondition(interactiveMoments)) {
            return this.id;
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreconditionGroupItem(Parcel parcel) {
        this(parcel.readString(), parcel.readString());
        C8632dsu.c((Object) parcel, "");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.precondition);
    }

    /* loaded from: classes.dex */
    public static final class CREATOR implements Parcelable.Creator<PreconditionGroupItem> {
        public /* synthetic */ CREATOR(C8627dsp c8627dsp) {
            this();
        }

        private CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PreconditionGroupItem createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new PreconditionGroupItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PreconditionGroupItem[] newArray(int i) {
            return new PreconditionGroupItem[i];
        }
    }
}
