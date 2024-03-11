package o;

import com.netflix.mediaclient.commanderinfra.api.util.TargetDeviceUiState;

/* loaded from: classes3.dex */
public final class VX {
    private final TargetDeviceUiState a;
    private final VU b;
    private final VO c;
    private final VV d;
    private final VZ e;
    private final C1295We f;
    private final C1293Wc i;

    public static /* synthetic */ VX e(VX vx, VZ vz, TargetDeviceUiState targetDeviceUiState, VU vu, VO vo, C1293Wc c1293Wc, C1295We c1295We, VV vv, int i, Object obj) {
        if ((i & 1) != 0) {
            vz = vx.e;
        }
        if ((i & 2) != 0) {
            targetDeviceUiState = vx.a;
        }
        TargetDeviceUiState targetDeviceUiState2 = targetDeviceUiState;
        if ((i & 4) != 0) {
            vu = vx.b;
        }
        VU vu2 = vu;
        if ((i & 8) != 0) {
            vo = vx.c;
        }
        VO vo2 = vo;
        if ((i & 16) != 0) {
            c1293Wc = vx.i;
        }
        C1293Wc c1293Wc2 = c1293Wc;
        if ((i & 32) != 0) {
            c1295We = vx.f;
        }
        C1295We c1295We2 = c1295We;
        if ((i & 64) != 0) {
            vv = vx.d;
        }
        return vx.d(vz, targetDeviceUiState2, vu2, vo2, c1293Wc2, c1295We2, vv);
    }

    public final TargetDeviceUiState a() {
        return this.a;
    }

    public final VO b() {
        return this.c;
    }

    public final VU c() {
        return this.b;
    }

    public final VV d() {
        return this.d;
    }

    public final VX d(VZ vz, TargetDeviceUiState targetDeviceUiState, VU vu, VO vo, C1293Wc c1293Wc, C1295We c1295We, VV vv) {
        C8632dsu.c((Object) vz, "");
        C8632dsu.c((Object) targetDeviceUiState, "");
        return new VX(vz, targetDeviceUiState, vu, vo, c1293Wc, c1295We, vv);
    }

    public final VZ e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VX) {
            VX vx = (VX) obj;
            return C8632dsu.c(this.e, vx.e) && this.a == vx.a && C8632dsu.c(this.b, vx.b) && C8632dsu.c(this.c, vx.c) && C8632dsu.c(this.i, vx.i) && C8632dsu.c(this.f, vx.f) && C8632dsu.c(this.d, vx.d);
        }
        return false;
    }

    public final C1295We g() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = this.a.hashCode();
        VU vu = this.b;
        int hashCode3 = vu == null ? 0 : vu.hashCode();
        VO vo = this.c;
        int hashCode4 = vo == null ? 0 : vo.hashCode();
        C1293Wc c1293Wc = this.i;
        int hashCode5 = c1293Wc == null ? 0 : c1293Wc.hashCode();
        C1295We c1295We = this.f;
        int hashCode6 = c1295We == null ? 0 : c1295We.hashCode();
        VV vv = this.d;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (vv != null ? vv.hashCode() : 0);
    }

    public final C1293Wc j() {
        return this.i;
    }

    public String toString() {
        VZ vz = this.e;
        TargetDeviceUiState targetDeviceUiState = this.a;
        VU vu = this.b;
        VO vo = this.c;
        C1293Wc c1293Wc = this.i;
        C1295We c1295We = this.f;
        VV vv = this.d;
        return "TargetDevice(targetDeviceData=" + vz + ", targetDeviceUiState=" + targetDeviceUiState + ", playbackData=" + vu + ", trackData=" + vo + ", trackDataList=" + c1293Wc + ", videoMetadata=" + c1295We + ", episodesScreenData=" + vv + ")";
    }

    public VX(VZ vz, TargetDeviceUiState targetDeviceUiState, VU vu, VO vo, C1293Wc c1293Wc, C1295We c1295We, VV vv) {
        C8632dsu.c((Object) vz, "");
        C8632dsu.c((Object) targetDeviceUiState, "");
        this.e = vz;
        this.a = targetDeviceUiState;
        this.b = vu;
        this.c = vo;
        this.i = c1293Wc;
        this.f = c1295We;
        this.d = vv;
    }

    public /* synthetic */ VX(VZ vz, TargetDeviceUiState targetDeviceUiState, VU vu, VO vo, C1293Wc c1293Wc, C1295We c1295We, VV vv, int i, C8627dsp c8627dsp) {
        this(vz, targetDeviceUiState, (i & 4) != 0 ? null : vu, (i & 8) != 0 ? null : vo, (i & 16) != 0 ? null : c1293Wc, (i & 32) != 0 ? null : c1295We, (i & 64) != 0 ? null : vv);
    }
}
