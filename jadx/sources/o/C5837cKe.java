package o;

import com.netflix.mediaclient.ui.playercontrolscompose.impl.state.live.LiveMode;

/* renamed from: o.cKe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5837cKe {
    private final String a;
    private final boolean b;
    private final boolean c;
    private final Integer d;
    private final LiveMode e;

    public C5837cKe() {
        this(null, false, null, false, null, 31, null);
    }

    public static /* synthetic */ C5837cKe a(C5837cKe c5837cKe, LiveMode liveMode, boolean z, String str, boolean z2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            liveMode = c5837cKe.e;
        }
        if ((i & 2) != 0) {
            z = c5837cKe.c;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            str = c5837cKe.a;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z2 = c5837cKe.b;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            num = c5837cKe.d;
        }
        return c5837cKe.c(liveMode, z3, str2, z4, num);
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean b() {
        return this.b;
    }

    public final C5837cKe c(LiveMode liveMode, boolean z, String str, boolean z2, Integer num) {
        C8632dsu.c((Object) liveMode, "");
        return new C5837cKe(liveMode, z, str, z2, num);
    }

    public final Integer d() {
        return this.d;
    }

    public final LiveMode e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5837cKe) {
            C5837cKe c5837cKe = (C5837cKe) obj;
            return this.e == c5837cKe.e && this.c == c5837cKe.c && C8632dsu.c((Object) this.a, (Object) c5837cKe.a) && this.b == c5837cKe.b && C8632dsu.c(this.d, c5837cKe.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = Boolean.hashCode(this.c);
        String str = this.a;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = Boolean.hashCode(this.b);
        Integer num = this.d;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        LiveMode liveMode = this.e;
        boolean z = this.c;
        String str = this.a;
        boolean z2 = this.b;
        Integer num = this.d;
        return "PlayerLiveUIExperienceState(liveMode=" + liveMode + ", isAtLiveEdge=" + z + ", estimatedStartTime=" + str + ", livePromptVisible=" + z2 + ", livePromptText=" + num + ")";
    }

    public C5837cKe(LiveMode liveMode, boolean z, String str, boolean z2, Integer num) {
        C8632dsu.c((Object) liveMode, "");
        this.e = liveMode;
        this.c = z;
        this.a = str;
        this.b = z2;
        this.d = num;
    }

    public /* synthetic */ C5837cKe(LiveMode liveMode, boolean z, String str, boolean z2, Integer num, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? LiveMode.e : liveMode, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z2, (i & 16) == 0 ? num : null);
    }
}
