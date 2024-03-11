package o;

/* renamed from: o.lw  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9247lw {
    private final boolean a;
    private final boolean d;
    private final int e;

    public final int a() {
        return this.e;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean d() {
        return this.a;
    }

    public C9247lw(int i, boolean z, boolean z2) {
        this.e = i;
        this.a = z;
        this.d = z2;
    }

    public String toString() {
        return "LastRunInfo(consecutiveLaunchCrashes=" + this.e + ", crashed=" + this.a + ", crashedDuringLaunch=" + this.d + ')';
    }
}
