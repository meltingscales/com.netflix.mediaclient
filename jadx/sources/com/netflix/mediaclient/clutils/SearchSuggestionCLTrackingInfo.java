package com.netflix.mediaclient.clutils;

import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Locale;
import java.util.Map;
import o.C1596aHd;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dqE;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class SearchSuggestionCLTrackingInfo implements CLItemTrackingInfoBase {
    public static final Parcelable.Creator<SearchSuggestionCLTrackingInfo> CREATOR = new Creator();
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final Integer g;

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<SearchSuggestionCLTrackingInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final SearchSuggestionCLTrackingInfo createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new SearchSuggestionCLTrackingInfo(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public final SearchSuggestionCLTrackingInfo[] newArray(int i) {
            return new SearchSuggestionCLTrackingInfo[i];
        }
    }

    @Override // com.netflix.mediaclient.clutils.CLItemTrackingInfoBase
    public String a() {
        return null;
    }

    @Override // com.netflix.mediaclient.clutils.CLItemTrackingInfoBase
    public String b() {
        return this.c;
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
        return this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int intValue;
        C8632dsu.c((Object) parcel, "");
        parcel.writeString(this.b);
        Integer num = this.g;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeString(this.c);
        parcel.writeInt(this.e);
        parcel.writeString(this.a);
        parcel.writeString(this.d);
    }

    public SearchSuggestionCLTrackingInfo(String str, Integer num, String str2, int i, String str3, String str4) {
        this.b = str;
        this.g = num;
        this.c = str2;
        this.e = i;
        this.a = str3;
        this.d = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SearchSuggestionCLTrackingInfo(com.netflix.model.leafs.SearchPageEntity r9, int r10, boolean r11, java.lang.String r12) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r9, r0)
            java.lang.String r2 = r9.getEntityId()
            java.lang.String r0 = r9.getVideoId()
            if (r0 == 0) goto L1e
            r1 = 10
            int r1 = o.C8666dua.e(r1)
            int r0 = java.lang.Integer.parseInt(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r3 = r0
            if (r12 != 0) goto L2d
            if (r11 == 0) goto L29
            java.lang.String r12 = r9.getPreQueryBoxartId()
            goto L2d
        L29:
            java.lang.String r12 = r9.getBoxartId()
        L2d:
            r4 = r12
            java.lang.String r6 = r9.getEntityType()
            java.lang.String r7 = r9.getUnifiedEntityId()
            r1 = r8
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.clutils.SearchSuggestionCLTrackingInfo.<init>(com.netflix.model.leafs.SearchPageEntity, int, boolean, java.lang.String):void");
    }

    @Override // com.netflix.mediaclient.clutils.CLTrackingInfoBase
    public void c(JSONObject jSONObject) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) jSONObject, "");
        Integer num = this.g;
        if (num != null) {
            jSONObject.put(SignupConstants.Field.VIDEO_ID, num.intValue());
        } else {
            String str = this.a;
            if (str != null) {
                String str2 = this.b;
                String lowerCase = str.toLowerCase(Locale.ROOT);
                C8632dsu.a(lowerCase, "");
                jSONObject.put("entityId", str2 + "_" + lowerCase);
            } else {
                jSONObject.put("entityId", this.b);
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                String str3 = "Missing entity type for entity " + this.b;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd(str3, null, null, false, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        c1596aHd.a(errorType.c() + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
            }
        }
        String str4 = this.d;
        if (str4 != null) {
            jSONObject.put("unifiedEntityId", str4);
        }
        String str5 = this.c;
        if (str5 != null) {
            jSONObject.put("imageKey", str5);
        }
        jSONObject.put("rank", this.e);
    }

    @Override // com.netflix.mediaclient.clutils.CLTrackingInfoBase
    public void d(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        jSONObject.put("entityId", this.b);
        String str = this.a;
        if (str != null) {
            String str2 = this.b;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C8632dsu.a(lowerCase, "");
            jSONObject.put("entityId", str2 + "_" + lowerCase);
        } else {
            jSONObject.put("entityId", this.b);
        }
        String str3 = this.d;
        if (str3 != null) {
            jSONObject.put("unifiedEntityId", str3);
        }
        Integer num = this.g;
        if (num != null) {
            jSONObject.put(SignupConstants.Field.VIDEO_ID, num.intValue());
        }
        String str4 = this.c;
        if (str4 != null) {
            jSONObject.put("imageKey", str4);
        }
        jSONObject.put("rank", this.e);
    }
}
