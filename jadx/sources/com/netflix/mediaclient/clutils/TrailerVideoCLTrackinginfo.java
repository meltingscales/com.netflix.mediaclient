package com.netflix.mediaclient.clutils;

import android.os.Parcel;
import android.os.Parcelable;
import o.C8632dsu;
import o.InterfaceC5224bui;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class TrailerVideoCLTrackinginfo implements CLItemTrackingInfoBase {
    public static final Parcelable.Creator<TrailerVideoCLTrackinginfo> CREATOR = new Creator();
    private final int b;
    private final int c;

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<TrailerVideoCLTrackinginfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: d */
        public final TrailerVideoCLTrackinginfo createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new TrailerVideoCLTrackinginfo(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: e */
        public final TrailerVideoCLTrackinginfo[] newArray(int i) {
            return new TrailerVideoCLTrackinginfo[i];
        }
    }

    @Override // com.netflix.mediaclient.clutils.CLItemTrackingInfoBase
    public String a() {
        return null;
    }

    @Override // com.netflix.mediaclient.clutils.CLItemTrackingInfoBase
    public String b() {
        return "";
    }

    public String c() {
        return "trailerId";
    }

    @Override // com.netflix.mediaclient.clutils.CLItemTrackingInfoBase
    public int d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }

    public TrailerVideoCLTrackinginfo(int i, int i2) {
        this.c = i;
        this.b = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrailerVideoCLTrackinginfo(InterfaceC5224bui interfaceC5224bui, int i) {
        this(Integer.parseInt(interfaceC5224bui.e()), i);
        C8632dsu.c((Object) interfaceC5224bui, "");
    }

    @Override // com.netflix.mediaclient.clutils.CLItemTrackingInfoBase
    public String e() {
        return String.valueOf(this.c);
    }

    @Override // com.netflix.mediaclient.clutils.CLTrackingInfoBase
    public void c(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        jSONObject.put(c(), this.c);
        jSONObject.put("rank", this.b);
    }

    @Override // com.netflix.mediaclient.clutils.CLTrackingInfoBase
    public void d(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        jSONObject.put(c(), this.c);
        jSONObject.put("rank", this.b);
    }
}
