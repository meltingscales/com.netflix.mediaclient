package com.netflix.mediaclient.clutils;

import android.os.Parcel;
import android.os.Parcelable;
import o.C8632dsu;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class LolomoCLTrackingInfo implements CLLolomoTrackingInfoBase {
    public static final Parcelable.Creator<LolomoCLTrackingInfo> CREATOR = new Creator();
    private final String b;

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<LolomoCLTrackingInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final LolomoCLTrackingInfo[] newArray(int i) {
            return new LolomoCLTrackingInfo[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: e */
        public final LolomoCLTrackingInfo createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new LolomoCLTrackingInfo(parcel.readString());
        }
    }

    @Override // com.netflix.mediaclient.clutils.CLLolomoTrackingInfoBase
    public String b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeString(this.b);
    }

    public LolomoCLTrackingInfo(String str) {
        C8632dsu.c((Object) str, "");
        this.b = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LolomoCLTrackingInfo(o.InterfaceC5155btS r2) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r2, r0)
            java.lang.String r2 = r2.getLolomoId()
            o.C8632dsu.a(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.clutils.LolomoCLTrackingInfo.<init>(o.btS):void");
    }

    @Override // com.netflix.mediaclient.clutils.CLTrackingInfoBase
    public void c(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        jSONObject.put("lolomoId", this.b);
    }

    @Override // com.netflix.mediaclient.clutils.CLTrackingInfoBase
    public void d(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        c(jSONObject);
    }
}
