package o;

import com.netflix.android.org.json.zip.JSONzip;

/* loaded from: classes4.dex */
public final class cJX {
    private final int a;
    private final boolean b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final int i;
    private final String j;

    public cJX() {
        this(0, 0, false, false, false, 0, null, false, false, 511, null);
    }

    public final String a() {
        return this.j;
    }

    public final int b() {
        return this.c;
    }

    public final boolean c() {
        return this.f;
    }

    public final int d() {
        return this.i;
    }

    public final cJX e(int i, int i2, boolean z, boolean z2, boolean z3, int i3, String str, boolean z4, boolean z5) {
        C8632dsu.c((Object) str, "");
        return new cJX(i, i2, z, z2, z3, i3, str, z4, z5);
    }

    public final boolean e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cJX) {
            cJX cjx = (cJX) obj;
            return this.c == cjx.c && this.i == cjx.i && this.e == cjx.e && this.g == cjx.g && this.f == cjx.f && this.a == cjx.a && C8632dsu.c((Object) this.j, (Object) cjx.j) && this.d == cjx.d && this.b == cjx.b;
        }
        return false;
    }

    public final boolean h() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.c) * 31) + Integer.hashCode(this.i)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.g)) * 31) + Boolean.hashCode(this.f)) * 31) + Integer.hashCode(this.a)) * 31) + this.j.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.b);
    }

    public final boolean j() {
        return this.d;
    }

    public String toString() {
        int i = this.c;
        int i2 = this.i;
        boolean z = this.e;
        boolean z2 = this.g;
        boolean z3 = this.f;
        int i3 = this.a;
        String str = this.j;
        boolean z4 = this.d;
        boolean z5 = this.b;
        return "PlayerSeekbarState(durationMs=" + i + ", progressMs=" + i2 + ", isUserInteracting=" + z + ", showSeekbarThumb=" + z2 + ", showExtraSeekbarHandler=" + z3 + ", extraSeekbarXPos=" + i3 + ", labelText=" + str + ", isLiveMode=" + z4 + ", isAtLiveEdge=" + z5 + ")";
    }

    public cJX(int i, int i2, boolean z, boolean z2, boolean z3, int i3, String str, boolean z4, boolean z5) {
        C8632dsu.c((Object) str, "");
        this.c = i;
        this.i = i2;
        this.e = z;
        this.g = z2;
        this.f = z3;
        this.a = i3;
        this.j = str;
        this.d = z4;
        this.b = z5;
    }

    public /* synthetic */ cJX(int i, int i2, boolean z, boolean z2, boolean z3, int i3, String str, boolean z4, boolean z5, int i4, C8627dsp c8627dsp) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? false : z, (i4 & 8) != 0 ? true : z2, (i4 & 16) != 0 ? false : z3, (i4 & 32) != 0 ? 0 : i3, (i4 & 64) != 0 ? "" : str, (i4 & 128) == 0 ? z4 : false, (i4 & JSONzip.end) == 0 ? z5 : true);
    }
}
