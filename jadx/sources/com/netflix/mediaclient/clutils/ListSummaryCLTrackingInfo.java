package com.netflix.mediaclient.clutils;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.netflix.mediaclient.service.pushnotification.Payload;
import o.C8632dsu;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ListSummaryCLTrackingInfo implements CLListTrackingInfoBase {
    public static final Parcelable.Creator<ListSummaryCLTrackingInfo> CREATOR = new Creator();
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String h;
    private final int j;

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<ListSummaryCLTrackingInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ListSummaryCLTrackingInfo createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new ListSummaryCLTrackingInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ListSummaryCLTrackingInfo[] newArray(int i) {
            return new ListSummaryCLTrackingInfo[i];
        }
    }

    @Override // com.netflix.mediaclient.clutils.CLListTrackingInfoBase
    public String a() {
        return this.h;
    }

    @Override // com.netflix.mediaclient.clutils.CLListTrackingInfoBase
    public String b() {
        return this.d;
    }

    @Override // com.netflix.mediaclient.clutils.CLListTrackingInfoBase
    public String c() {
        return this.b;
    }

    @Override // com.netflix.mediaclient.clutils.CLListTrackingInfoBase
    public int d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.netflix.mediaclient.clutils.CLListTrackingInfoBase
    public int e() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeString(this.d);
        parcel.writeString(this.b);
        parcel.writeString(this.h);
        parcel.writeInt(this.j);
        parcel.writeString(this.c);
        parcel.writeString(this.e);
        parcel.writeInt(this.a);
    }

    public ListSummaryCLTrackingInfo(String str, String str2, String str3, int i, String str4, String str5, int i2) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.b = str2;
        this.h = str3;
        this.j = i;
        this.c = str4;
        this.e = str5;
        this.a = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ListSummaryCLTrackingInfo(o.InterfaceC5281bvm r10) {
        /*
            r9 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r10, r0)
            java.lang.String r2 = r10.getRequestId()
            o.C8632dsu.a(r2, r0)
            java.lang.String r3 = r10.getListId()
            java.lang.String r4 = r10.getSectionUid()
            int r5 = r10.getTrackId()
            java.lang.String r6 = r10.getImpressionToken()
            java.lang.String r7 = r10.getListContext()
            int r8 = r10.getListPos()
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.clutils.ListSummaryCLTrackingInfo.<init>(o.bvm):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ListSummaryCLTrackingInfo(o.InterfaceC5281bvm r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r10, r0)
            java.lang.String r2 = r10.getRequestId()
            o.C8632dsu.a(r2, r0)
            java.lang.String r3 = r10.getListId()
            java.lang.String r4 = r10.getSectionUid()
            java.lang.String r6 = r10.getImpressionToken()
            java.lang.String r7 = r10.getListContext()
            int r8 = r10.getListPos()
            r1 = r9
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.clutils.ListSummaryCLTrackingInfo.<init>(o.bvm, int):void");
    }

    @Override // com.netflix.mediaclient.clutils.CLTrackingInfoBase
    public void c(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        jSONObject.put(Payload.PARAM_RENO_REQUEST_ID, this.d);
        jSONObject.put("trackId", this.j);
        String str = this.b;
        if (str != null) {
            jSONObject.put("listId", str);
        }
        String str2 = this.c;
        if (str2 != null) {
            jSONObject.put("impressionToken", str2);
        }
        jSONObject.put("row", this.a);
    }

    @Override // com.netflix.mediaclient.clutils.CLListTrackingInfoBase
    public void b(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        String str = this.b;
        if (str != null) {
            jSONObject.put("referenceId", str);
        }
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        jSONObject.put("listType", this.e);
    }

    @Override // com.netflix.mediaclient.clutils.CLTrackingInfoBase
    public void d(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        c(jSONObject);
    }
}
