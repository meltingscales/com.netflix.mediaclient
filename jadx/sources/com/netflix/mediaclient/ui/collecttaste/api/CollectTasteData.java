package com.netflix.mediaclient.ui.collecttaste.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import o.C8632dsu;

/* loaded from: classes4.dex */
public final class CollectTasteData implements Parcelable {
    public static final Parcelable.Creator<CollectTasteData> CREATOR = new Creator();
    private final String a;
    private final TrackingInfoHolder b;
    private final int c;
    private final int d;
    private final String e;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<CollectTasteData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: e */
        public final CollectTasteData createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new CollectTasteData((TrackingInfoHolder) parcel.readParcelable(CollectTasteData.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: e */
        public final CollectTasteData[] newArray(int i) {
            return new CollectTasteData[i];
        }
    }

    public final int a() {
        return this.d;
    }

    public final TrackingInfoHolder b() {
        return this.b;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CollectTasteData) {
            CollectTasteData collectTasteData = (CollectTasteData) obj;
            return C8632dsu.c(this.b, collectTasteData.b) && this.c == collectTasteData.c && C8632dsu.c((Object) this.a, (Object) collectTasteData.a) && C8632dsu.c((Object) this.e, (Object) collectTasteData.e) && this.d == collectTasteData.d;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = Integer.hashCode(this.c);
        String str = this.a;
        return (((((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.e.hashCode()) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        TrackingInfoHolder trackingInfoHolder = this.b;
        int i = this.c;
        String str = this.a;
        String str2 = this.e;
        int i2 = this.d;
        return "CollectTasteData(trackingInfoHolder=" + trackingInfoHolder + ", listPosition=" + i + ", listContext=" + str + ", listId=" + str2 + ", trackId=" + i2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeString(this.a);
        parcel.writeString(this.e);
        parcel.writeInt(this.d);
    }

    public CollectTasteData(TrackingInfoHolder trackingInfoHolder, int i, String str, String str2, int i2) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) str2, "");
        this.b = trackingInfoHolder;
        this.c = i;
        this.a = str;
        this.e = str2;
        this.d = i2;
    }
}
