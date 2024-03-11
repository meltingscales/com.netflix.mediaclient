package com.netflix.mediaclient.clutils;

import android.os.Parcel;
import android.os.Parcelable;
import o.C8632dsu;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class SearchSuggestionSectionCLTrackingInfo extends ListSummaryCLTrackingInfo {
    public static final Parcelable.Creator<SearchSuggestionSectionCLTrackingInfo> CREATOR = new Creator();
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final int h;

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<SearchSuggestionSectionCLTrackingInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final SearchSuggestionSectionCLTrackingInfo createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new SearchSuggestionSectionCLTrackingInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public final SearchSuggestionSectionCLTrackingInfo[] newArray(int i) {
            return new SearchSuggestionSectionCLTrackingInfo[i];
        }
    }

    @Override // com.netflix.mediaclient.clutils.ListSummaryCLTrackingInfo, com.netflix.mediaclient.clutils.CLListTrackingInfoBase
    public String b() {
        return this.e;
    }

    @Override // com.netflix.mediaclient.clutils.ListSummaryCLTrackingInfo, com.netflix.mediaclient.clutils.CLListTrackingInfoBase
    public String c() {
        return this.b;
    }

    @Override // com.netflix.mediaclient.clutils.ListSummaryCLTrackingInfo, com.netflix.mediaclient.clutils.CLListTrackingInfoBase
    public int d() {
        return this.d;
    }

    @Override // com.netflix.mediaclient.clutils.ListSummaryCLTrackingInfo, com.netflix.mediaclient.clutils.CLListTrackingInfoBase
    public int e() {
        return this.h;
    }

    @Override // com.netflix.mediaclient.clutils.ListSummaryCLTrackingInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeString(this.c);
        parcel.writeString(this.b);
        parcel.writeString(this.e);
        parcel.writeInt(this.h);
        parcel.writeString(this.a);
        parcel.writeInt(this.d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchSuggestionSectionCLTrackingInfo(String str, String str2, String str3, int i, String str4, int i2) {
        super(str3, str2, null, i, null, null, i2);
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.c = str;
        this.b = str2;
        this.e = str3;
        this.h = i;
        this.a = str4;
        this.d = i2;
    }

    @Override // com.netflix.mediaclient.clutils.ListSummaryCLTrackingInfo, com.netflix.mediaclient.clutils.CLListTrackingInfoBase
    public void b(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        c(jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SearchSuggestionSectionCLTrackingInfo(com.netflix.model.leafs.SearchSectionSummary r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r9, r0)
            java.lang.String r2 = r9.getSectionId()
            java.lang.String r3 = r9.getReferenceId()
            o.C8632dsu.a(r3, r0)
            java.lang.String r4 = r9.getRequestId()
            o.C8632dsu.a(r4, r0)
            int r5 = r9.getTrackId()
            java.lang.String r6 = r9.getFeature()
            r1 = r8
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.clutils.SearchSuggestionSectionCLTrackingInfo.<init>(com.netflix.model.leafs.SearchSectionSummary, int):void");
    }

    @Override // com.netflix.mediaclient.clutils.ListSummaryCLTrackingInfo, com.netflix.mediaclient.clutils.CLTrackingInfoBase
    public void c(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        super.c(jSONObject);
        jSONObject.put("referenceId", this.b);
        String str = this.a;
        if (str != null) {
            jSONObject.put("listType", str);
        }
    }

    @Override // com.netflix.mediaclient.clutils.ListSummaryCLTrackingInfo, com.netflix.mediaclient.clutils.CLTrackingInfoBase
    public void d(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        c(jSONObject);
    }
}
