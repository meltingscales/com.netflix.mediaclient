package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.playintegrity.api.PlayIntegrityState;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;

/* renamed from: o.aKq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1690aKq {
    @SerializedName(UmaAlert.ICON_ERROR)
    private String a;
    @SerializedName("nonceRequestStartTimeInMs")
    private long b;
    @SerializedName("nonceRequestTimeInMs")
    private long c;
    @SerializedName("attestationRequestStartTimeInMs")
    private long d;
    @SerializedName("attestationRequestTimeInMs")
    private long e;
    @SerializedName("state")
    private PlayIntegrityState f = PlayIntegrityState.NOT_AVAILABLE;
    @SerializedName("processTimeInMs")
    private long g;
    @SerializedName("verificationRequestTimeInMs")
    private long h;
    @SerializedName("processStartTimeInMs")
    private long i;
    @SerializedName("verificationRequestStartTimeInMs")
    private long j;

    public final long a() {
        return this.j;
    }

    public final void a(long j) {
        this.e = j;
    }

    public final long b() {
        return this.i;
    }

    public final void b(long j) {
        this.i = j;
    }

    public final void c() {
        this.g = 0L;
        this.i = 0L;
        this.c = 0L;
        this.b = 0L;
        this.d = 0L;
        this.e = 0L;
        this.j = 0L;
        this.h = 0L;
        this.a = null;
    }

    public final void c(long j) {
        this.d = j;
    }

    public final void c(String str) {
        this.a = str;
    }

    public final long d() {
        return this.b;
    }

    public final void d(long j) {
        this.b = j;
    }

    public final void d(PlayIntegrityState playIntegrityState) {
        C8632dsu.c((Object) playIntegrityState, "");
        this.f = playIntegrityState;
    }

    public final long e() {
        return this.d;
    }

    public final void e(long j) {
        this.c = j;
    }

    public final void g(long j) {
        this.h = j;
    }

    public final void i(long j) {
        this.g = j;
    }

    public final void j(long j) {
        this.j = j;
    }
}
