package com.netflix.mediaclient.ui.player;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.gson.annotations.SerializedName;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import o.C1044Mm;
import o.C7445cwO;
import o.C7593czD;
import o.C7631czp;
import o.C8118deO;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5160btX;

/* loaded from: classes.dex */
public final class PlayerExtras implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("duration")
    private long a;
    private final String b;
    @SerializedName("bookmarkMs")
    private long c;
    @SerializedName("autoPlayCounterForIntent")
    private int d;
    @SerializedName("fastPlayParams")
    private C7445cwO e;
    @SerializedName("isAdvisoryDisabled")
    private boolean f;
    @SerializedName("fragmentAppView")
    private AppView g;
    @SerializedName("liveState")
    private LiveState h;
    @SerializedName("playerSpeed")
    private float i;
    @SerializedName("isPinVerified")
    private boolean j;
    @SerializedName("userMarksExtras")
    private C7593czD k;
    @SerializedName("resetInteractive")
    private boolean l;
    @SerializedName("postplayExtras")
    private C7631czp m;
    @SerializedName("preferredDubCode")
    private String n;
    @SerializedName("preferredSubCode")

    /* renamed from: o  reason: collision with root package name */
    private String f13299o;
    @SerializedName("userPlayStartTime")
    private long r;

    public PlayerExtras() {
        this(0L, 0L, 0, false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32767, null);
    }

    public PlayerExtras(long j) {
        this(j, 0L, 0, false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32766, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayerExtras(long j, long j2, int i, boolean z, boolean z2, C7631czp c7631czp, boolean z3, AppView appView, long j3, float f, String str) {
        this(j, j2, i, z, z2, c7631czp, z3, appView, j3, f, str, null, null, null, null, 30720, null);
        C8632dsu.c((Object) c7631czp, "");
        C8632dsu.c((Object) appView, "");
    }

    public final AppView a() {
        return this.g;
    }

    public final void a(AppView appView) {
        C8632dsu.c((Object) appView, "");
        this.g = appView;
    }

    public final LiveState b() {
        return this.h;
    }

    public final void b(long j) {
        this.c = j;
    }

    public final void b(LiveState liveState) {
        C8632dsu.c((Object) liveState, "");
        this.h = liveState;
    }

    public final void b(boolean z) {
        this.j = z;
    }

    public final int c() {
        return this.d;
    }

    public final C7445cwO d() {
        return this.e;
    }

    public final void d(C7631czp c7631czp) {
        C8632dsu.c((Object) c7631czp, "");
        this.m = c7631czp;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long e() {
        return this.c;
    }

    public final void e(long j) {
        this.r = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayerExtras) {
            PlayerExtras playerExtras = (PlayerExtras) obj;
            return this.c == playerExtras.c && this.a == playerExtras.a && this.d == playerExtras.d && this.f == playerExtras.f && this.j == playerExtras.j && C8632dsu.c(this.m, playerExtras.m) && this.l == playerExtras.l && this.g == playerExtras.g && this.r == playerExtras.r && Float.compare(this.i, playerExtras.i) == 0 && C8632dsu.c((Object) this.f13299o, (Object) playerExtras.f13299o) && C8632dsu.c((Object) this.n, (Object) playerExtras.n) && this.h == playerExtras.h && C8632dsu.c(this.k, playerExtras.k) && C8632dsu.c(this.e, playerExtras.e);
        }
        return false;
    }

    public final C7593czD f() {
        return this.k;
    }

    public final float g() {
        return this.i;
    }

    public final long h() {
        return this.r;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.c);
        int hashCode2 = Long.hashCode(this.a);
        int hashCode3 = Integer.hashCode(this.d);
        int hashCode4 = Boolean.hashCode(this.f);
        int hashCode5 = Boolean.hashCode(this.j);
        int hashCode6 = this.m.hashCode();
        int hashCode7 = Boolean.hashCode(this.l);
        int hashCode8 = this.g.hashCode();
        int hashCode9 = Long.hashCode(this.r);
        int hashCode10 = Float.hashCode(this.i);
        String str = this.f13299o;
        int hashCode11 = str == null ? 0 : str.hashCode();
        String str2 = this.n;
        int hashCode12 = str2 == null ? 0 : str2.hashCode();
        int hashCode13 = this.h.hashCode();
        int hashCode14 = this.k.hashCode();
        C7445cwO c7445cwO = this.e;
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + (c7445cwO == null ? 0 : c7445cwO.hashCode());
    }

    public final C7631czp i() {
        return this.m;
    }

    public final boolean j() {
        return this.l;
    }

    public final boolean k() {
        return this.j;
    }

    public final void n() {
        this.r = -1L;
    }

    public final boolean o() {
        return this.f;
    }

    public String toString() {
        long j = this.c;
        long j2 = this.a;
        int i = this.d;
        boolean z = this.f;
        boolean z2 = this.j;
        C7631czp c7631czp = this.m;
        boolean z3 = this.l;
        AppView appView = this.g;
        long j3 = this.r;
        float f = this.i;
        String str = this.f13299o;
        String str2 = this.n;
        LiveState liveState = this.h;
        C7593czD c7593czD = this.k;
        C7445cwO c7445cwO = this.e;
        return "PlayerExtras(bookmarkMs=" + j + ", duration=" + j2 + ", autoPlayCounterForIntent=" + i + ", isAdvisoryDisabled=" + z + ", isPinVerified=" + z2 + ", postplayExtras=" + c7631czp + ", resetInteractive=" + z3 + ", fragmentAppView=" + appView + ", userPlayStartTime=" + j3 + ", playerSpeed=" + f + ", preferredSubCode=" + str + ", preferredDubCode=" + str2 + ", liveState=" + liveState + ", userMarksExtras=" + c7593czD + ", fastPlayParams=" + c7445cwO + ")";
    }

    public PlayerExtras(long j, long j2, int i, boolean z, boolean z2, C7631czp c7631czp, boolean z3, AppView appView, long j3, float f, String str, String str2, LiveState liveState, C7593czD c7593czD, C7445cwO c7445cwO) {
        C8632dsu.c((Object) c7631czp, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) liveState, "");
        C8632dsu.c((Object) c7593czD, "");
        this.c = j;
        this.a = j2;
        this.d = i;
        this.f = z;
        this.j = z2;
        this.m = c7631czp;
        this.l = z3;
        this.g = appView;
        this.r = j3;
        this.i = f;
        this.f13299o = str;
        this.n = str2;
        this.h = liveState;
        this.k = c7593czD;
        this.e = c7445cwO;
        this.b = "playerExtra";
    }

    public /* synthetic */ PlayerExtras(long j, long j2, int i, boolean z, boolean z2, C7631czp c7631czp, boolean z3, AppView appView, long j3, float f, String str, String str2, LiveState liveState, C7593czD c7593czD, C7445cwO c7445cwO, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? -1L : j, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? new C7631czp(false, null, null, false, 15, null) : c7631czp, (i2 & 64) == 0 ? z3 : false, (i2 & 128) != 0 ? AppView.playback : appView, (i2 & JSONzip.end) != 0 ? SystemClock.elapsedRealtime() : j3, (i2 & 512) != 0 ? 1.0f : f, (i2 & 1024) != 0 ? null : str, (i2 & 2048) != 0 ? null : str2, (i2 & 4096) != 0 ? LiveState.e : liveState, (i2 & 8192) != 0 ? new C7593czD(false, 0, null, 7, null) : c7593czD, (i2 & 16384) != 0 ? null : c7445cwO);
    }

    /* loaded from: classes4.dex */
    public static final class CREATOR implements Parcelable.Creator<PlayerExtras> {
        public /* synthetic */ CREATOR(C8627dsp c8627dsp) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: d */
        public PlayerExtras createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            Object fromJson = C8118deO.a().fromJson(parcel.readString(), (Class<Object>) PlayerExtras.class);
            C8632dsu.a(fromJson, "");
            return (PlayerExtras) fromJson;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PlayerExtras[] newArray(int i) {
            return new PlayerExtras[i];
        }
    }

    public final void m() {
        this.r = SystemClock.elapsedRealtime();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeString(C8118deO.a().toJson(this));
    }

    private final boolean d(InterfaceC5160btX interfaceC5160btX) {
        InteractiveSummary az_ = interfaceC5160btX.az_();
        if (az_ == null) {
            return false;
        }
        return az_.isBranchingNarrative() || az_.features().videoMoments();
    }

    public final void e(InterfaceC5160btX interfaceC5160btX) {
        C8632dsu.c((Object) interfaceC5160btX, "");
        boolean bd_ = interfaceC5160btX.bd_();
        boolean d = d(interfaceC5160btX);
        C1044Mm.c(this.b, "hasBookmarkData=%b hasInteractiveData=%b", Boolean.valueOf(bd_), Boolean.valueOf(d));
        if (bd_ && !d) {
            this.e = new C7445cwO(interfaceC5160btX.aF_());
        } else {
            C1044Mm.a(this.b, "not using fastPlayParams.");
        }
    }
}
