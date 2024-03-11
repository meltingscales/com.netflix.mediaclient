package com.netflix.mediaclient.clutils;

import android.os.Parcel;
import android.os.Parcelable;
import o.C8632dsu;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class CategoryCLTrackingInfo implements CLItemTrackingInfoBase {
    public static final Parcelable.Creator<CategoryCLTrackingInfo> CREATOR = new Creator();
    private final int b;
    private final String c;
    private final int e;

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<CategoryCLTrackingInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final CategoryCLTrackingInfo createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new CategoryCLTrackingInfo(parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final CategoryCLTrackingInfo[] newArray(int i) {
            return new CategoryCLTrackingInfo[i];
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
        return "genreId";
    }

    @Override // com.netflix.mediaclient.clutils.CLItemTrackingInfoBase
    public int d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.netflix.mediaclient.clutils.CLItemTrackingInfoBase
    public String e() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeInt(this.b);
        parcel.writeInt(this.e);
        parcel.writeString(this.c);
    }

    public CategoryCLTrackingInfo(int i, int i2, String str) {
        this.b = i;
        this.e = i2;
        this.c = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CategoryCLTrackingInfo(o.InterfaceC5143btG r2, int r3) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r2, r0)
            com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem r0 = r2.a()
            if (r0 == 0) goto L16
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L16
            int r0 = java.lang.Integer.parseInt(r0)
            goto L17
        L16:
            r0 = 0
        L17:
            com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem r2 = r2.a()
            if (r2 == 0) goto L22
            java.lang.String r2 = r2.getUnifiedEntityId()
            goto L23
        L22:
            r2 = 0
        L23:
            r1.<init>(r0, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.clutils.CategoryCLTrackingInfo.<init>(o.btG, int):void");
    }

    @Override // com.netflix.mediaclient.clutils.CLTrackingInfoBase
    public void c(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        jSONObject.put(c(), this.b);
        jSONObject.put("rank", this.e);
        String str = this.c;
        if (str != null) {
            jSONObject.put("unifiedEntityId", str);
        }
    }

    @Override // com.netflix.mediaclient.clutils.CLTrackingInfoBase
    public void d(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        jSONObject.put(c(), this.b);
        jSONObject.put("rank", this.e);
        String str = this.c;
        if (str != null) {
            jSONObject.put("unifiedEntityId", str);
        }
    }
}
