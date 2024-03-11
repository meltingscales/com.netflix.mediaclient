package com.netflix.mediaclient.clutils;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.util.PlayContext;
import java.util.Objects;
import o.C1332Xp;
import o.InterfaceC5281bvm;

/* loaded from: classes.dex */
public class PlayContextImp implements PlayContext {
    public static final Parcelable.Creator<PlayContextImp> CREATOR;
    public static PlayContext c = null;
    public static int i = 250096294;
    public static PlayContext m = null;
    public static PlayContext n = null;

    /* renamed from: o  reason: collision with root package name */
    public static PlayContext f13167o = null;
    public static PlayContext p = null;
    public static PlayContext s = null;
    public static PlayContext t = null;
    public static PlayContext w = null;
    public static PlayContext x = null;
    private static String z = "downloaded_";
    @SerializedName("imageKey")
    private final String A;
    @SerializedName("listId")
    private final String C;
    @SerializedName("browsePlay")
    private boolean D;
    @SerializedName("originalLocation")
    private final PlayLocationType E;
    @SerializedName(Payload.PARAM_RENO_REQUEST_ID)
    private final String F;
    @SerializedName("listPos")
    private final int G;
    @SerializedName("playLocation")
    private PlayLocationType H;
    @SerializedName("lolomoId")
    private final String I;
    @SerializedName("sectionUid")

    /* renamed from: J  reason: collision with root package name */
    private final String f13168J;
    @SerializedName("unifiedEntityId")
    private final String K;
    @SerializedName("sourceVideoId")
    private final Integer L;
    @SerializedName("trackId")
    private final int M;
    @SerializedName("uiPlayContextTag")
    private String N;
    @SerializedName("videoMerchComputeId")
    private final String P;
    @SerializedName("videoPos")
    private final int R;
    public static PlayContext f = new PlayContextImp("req_player_next_ep", 250096294, 0, 0);
    private static int B = 13099801;
    public static int k = 15233083;
    public static int q = 253494112;
    public static int l = 255497266;
    public static int a = 252742602;
    public static int y = 274143858;
    public static int v = 261747025;
    public static int u = 261453186;
    public static PlayContext h = new PlayContextImp("req_player_eps", 13099801, 0, 0);
    public static int g = 13747225;
    public static PlayContext j = new PlayContextImp("req_from_deeplink", g, 0, 0);
    public static int r = 14836231;
    public static PlayContext e = new PlayContextImp("req_preapp", r, 0, 0);
    public static PlayContext d = new PlayContextImp("req_mdx", 13804431, 0, 0);
    public static PlayContext b = new PlayContextImp("req_next_ep_postplay", 13589538, 0, 0);

    @Override // com.netflix.mediaclient.util.PlayContext
    public String a() {
        return this.I;
    }

    @Override // com.netflix.mediaclient.util.PlayContext
    public void b(String str) {
        this.N = str;
    }

    @Override // com.netflix.mediaclient.util.PlayContext
    public void b(boolean z2) {
        this.D = z2;
    }

    @Override // com.netflix.mediaclient.util.PlayContext
    public boolean b() {
        return this.D;
    }

    @Override // com.netflix.mediaclient.util.PlayContext
    public String d() {
        return this.A;
    }

    @Override // com.netflix.mediaclient.util.PlayContext
    public void d(PlayLocationType playLocationType) {
        this.H = playLocationType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.netflix.mediaclient.util.PlayContext
    public PlayLocationType e() {
        return this.E;
    }

    @Override // com.netflix.mediaclient.util.PlayContext
    public String f() {
        return this.K;
    }

    @Override // com.netflix.mediaclient.util.PlayContext
    public String g() {
        return this.N;
    }

    @Override // o.InterfaceC5281bvm
    public String getListContext() {
        return null;
    }

    @Override // o.InterfaceC5281bvm
    public String getListId() {
        return this.C;
    }

    @Override // o.InterfaceC5281bvm
    public int getListPos() {
        return this.G;
    }

    @Override // o.InterfaceC5281bvm
    public String getRequestId() {
        return this.F;
    }

    @Override // com.netflix.mediaclient.util.PlayContext, o.InterfaceC5281bvm
    public String getSectionUid() {
        return this.f13168J;
    }

    @Override // o.InterfaceC5281bvm
    public int getTrackId() {
        return this.M;
    }

    @Override // com.netflix.mediaclient.util.PlayContext
    public String h() {
        return this.P;
    }

    @Override // com.netflix.mediaclient.util.PlayContext
    public int i() {
        return this.R;
    }

    @Override // com.netflix.mediaclient.util.PlayContext
    public PlayLocationType j() {
        return this.H;
    }

    static {
        int i2 = k;
        PlayLocationType playLocationType = PlayLocationType.DOWNLOADS;
        f13167o = new PlayContextImp("req_my_downloads", i2, 0, 0, playLocationType, false, null, null, null, null, null);
        s = new PlayContextImp("req_offline_user_next", 250091023, 0, 0);
        n = new PlayContextImp("req_offline_auto_next", 250083047, 0, 0);
        t = new PlayContextImp("req_offline_notification", 15250315, 0, 0);
        p = new PlayContextImp("req_offline_smart_dl", q, 0, 0, playLocationType, false, null, null, null, null, null);
        m = new PlayContextImp("req_offline_next_postplay", 255246212, 0, 0);
        x = new PlayContextImp("req_search_tab", 11111111, 0, 0);
        w = new PlayContextImp("req_user_mark", y, 0, 0, PlayLocationType.USER_MARKS, true, null, null, null, null, null);
        c = new PlayContextImp("req_cdx", 13804431, 0, 0);
        CREATOR = new Parcelable.Creator<PlayContextImp>() { // from class: com.netflix.mediaclient.clutils.PlayContextImp.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public PlayContextImp createFromParcel(Parcel parcel) {
                return (PlayContextImp) ((Gson) C1332Xp.b(Gson.class)).fromJson(parcel.readString(), (Class<Object>) PlayContextImp.class);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: d */
            public PlayContextImp[] newArray(int i3) {
                return new PlayContextImp[i3];
            }
        };
    }

    public PlayContextImp(String str, int i2, int i3, int i4, PlayLocationType playLocationType, boolean z2, String str2, String str3, String str4, String str5, String str6) {
        this(str, null, i2, i3, i4, playLocationType, z2, str2, str3, "", str4, str5, str6, null);
    }

    public PlayContextImp(String str, int i2, int i3, int i4, PlayLocationType playLocationType, String str2, String str3, String str4, String str5, String str6) {
        this(str, null, i2, i3, i4, playLocationType, false, str2, str3, "", str4, str5, str6, null);
    }

    public PlayContextImp(String str, String str2, int i2, int i3, int i4, PlayLocationType playLocationType, String str3, String str4, String str5, String str6, String str7, String str8, Integer num) {
        this(str, str2, i2, i3, i4, playLocationType, false, str3, str4, str5, str6, str7, str8, num);
    }

    public PlayContextImp(String str, int i2, int i3, int i4) {
        this(str, null, i2, i3, i4, PlayLocationType.DIRECT_PLAY, false, null, null, "", null, null, null, null);
    }

    protected PlayContextImp(String str, String str2, int i2, int i3, int i4, PlayLocationType playLocationType, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num) {
        this.F = str;
        this.f13168J = str2;
        this.M = i2;
        this.G = i3;
        this.R = i4;
        this.H = playLocationType;
        this.E = playLocationType;
        this.D = z2;
        this.I = str3;
        this.C = str4;
        this.A = str6;
        this.N = str5;
        this.P = str7;
        this.K = str8;
        this.L = num;
    }

    public PlayContextImp(InterfaceC5281bvm interfaceC5281bvm, int i2, String str, PlayLocationType playLocationType, String str2, String str3) {
        this(interfaceC5281bvm, i2, str, playLocationType, null, str2, str3);
    }

    public PlayContextImp(InterfaceC5281bvm interfaceC5281bvm, int i2, String str, PlayLocationType playLocationType, String str2, String str3, String str4) {
        this(interfaceC5281bvm.getRequestId(), interfaceC5281bvm.getTrackId(), interfaceC5281bvm.getListPos(), i2, playLocationType, str, interfaceC5281bvm.getListId(), str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(((Gson) C1332Xp.b(Gson.class)).toJson(this));
    }

    public static final PlayContext c() {
        return new PlayContextImp(z + System.currentTimeMillis(), k, 0, 0, PlayLocationType.DOWNLOADS, false, null, null, null, null, null);
    }

    public String toString() {
        return "PlayContextImp [requestId=" + this.F + ", sectionUid=" + this.f13168J + ", trackId=" + this.M + ", lolomoId=" + this.I + ", listId=" + this.C + ", imageKey=" + this.A + ", listPos=" + this.G + ", videoPos=" + this.R + ", playLocation=" + this.H + ", uiPlayContextTag=" + this.N + ", videoMerchComputeId=" + this.P + ", browsePlay=" + this.D + ", sourvceVideoId=" + this.L + "]";
    }

    @Override // o.InterfaceC5281bvm
    public String getImpressionToken() {
        throw new UnsupportedOperationException("Should not be needed");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlayContextImp playContextImp = (PlayContextImp) obj;
        return this.M == playContextImp.M && this.f13168J == playContextImp.f13168J && this.G == playContextImp.G && this.R == playContextImp.R && Objects.equals(this.F, playContextImp.F) && Objects.equals(this.I, playContextImp.I) && Objects.equals(this.C, playContextImp.C) && Objects.equals(this.A, playContextImp.A) && Objects.equals(this.P, playContextImp.P) && this.L == playContextImp.L;
    }
}
