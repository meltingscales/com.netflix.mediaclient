package com.netflix.mediaclient.clutils;

import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.C1283Vs;
import o.C8632dsu;
import o.InterfaceC5223buh;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class VideoSummaryCLTrackingInfo implements CLItemTrackingInfoBase {
    public static final Parcelable.Creator<VideoSummaryCLTrackingInfo> CREATOR = new Creator();
    private final String a;
    private final String b;
    private final int c;
    private final int d;
    private final String e;

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<VideoSummaryCLTrackingInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final VideoSummaryCLTrackingInfo createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new VideoSummaryCLTrackingInfo(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public final VideoSummaryCLTrackingInfo[] newArray(int i) {
            return new VideoSummaryCLTrackingInfo[i];
        }
    }

    @Override // com.netflix.mediaclient.clutils.CLItemTrackingInfoBase
    public String a() {
        return this.b;
    }

    @Override // com.netflix.mediaclient.clutils.CLItemTrackingInfoBase
    public String b() {
        return this.a;
    }

    public String c() {
        return SignupConstants.Field.VIDEO_ID;
    }

    @Override // com.netflix.mediaclient.clutils.CLItemTrackingInfoBase
    public int d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.netflix.mediaclient.clutils.CLItemTrackingInfoBase
    public String e() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.a);
        parcel.writeInt(this.c);
        parcel.writeString(this.b);
    }

    public VideoSummaryCLTrackingInfo(int i, String str, String str2, int i2, String str3) {
        this.d = i;
        this.e = str;
        this.a = str2;
        this.c = i2;
        this.b = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public VideoSummaryCLTrackingInfo(o.InterfaceC5223buh r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r8, r0)
            int r2 = o.C1283Vs.a(r8)
            java.lang.String r3 = r8.getUnifiedEntityId()
            java.lang.String r1 = r8.getBoxartId()
            if (r1 != 0) goto L15
            r4 = r0
            goto L16
        L15:
            r4 = r1
        L16:
            java.lang.String r6 = r8.getVideoMerchComputeId()
            r1 = r7
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.clutils.VideoSummaryCLTrackingInfo.<init>(o.buh, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSummaryCLTrackingInfo(InterfaceC5223buh interfaceC5223buh, String str, int i) {
        this(C1283Vs.a(interfaceC5223buh), interfaceC5223buh.getUnifiedEntityId(), str == null ? interfaceC5223buh.getBoxartId() : str, i, interfaceC5223buh.getVideoMerchComputeId());
        C8632dsu.c((Object) interfaceC5223buh, "");
    }

    @Override // com.netflix.mediaclient.clutils.CLTrackingInfoBase
    public void c(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        jSONObject.put(c(), this.d);
        String str = this.a;
        if (str != null) {
            jSONObject.put("imageKey", str);
        }
        String str2 = this.e;
        if (str2 != null) {
            jSONObject.put("unifiedEntityId", str2);
        }
        jSONObject.put("rank", this.c);
    }

    @Override // com.netflix.mediaclient.clutils.CLTrackingInfoBase
    public void d(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        jSONObject.put(c(), this.d);
        String str = this.a;
        if (str != null) {
            jSONObject.put("imageKey", str);
        }
        String str2 = this.e;
        if (str2 != null) {
            jSONObject.put("unifiedEntityId", str2);
        }
        jSONObject.put("rank", this.c);
    }
}
