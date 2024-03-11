package o;

/* renamed from: o.cBg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5596cBg {
    private final boolean a;
    private final boolean b;

    public C5596cBg() {
        this(false, false, 3, null);
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5596cBg) {
            C5596cBg c5596cBg = (C5596cBg) obj;
            return this.a == c5596cBg.a && this.b == c5596cBg.b;
        }
        return false;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.a) * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        return "PlayerFeatureFlags(brightnessControlsSupported=" + z + ", lockControlsSupported=" + z2 + ")";
    }

    public C5596cBg(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ C5596cBg(boolean z, boolean z2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }
}
