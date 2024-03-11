package o;

/* loaded from: classes3.dex */
public final class VU {
    private final String a;
    private final boolean b;
    private final float c;
    private final float d;
    private final boolean e;
    private final String i;
    private final boolean j;

    public final boolean a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.i;
    }

    public final float d() {
        return this.c;
    }

    public final float e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VU) {
            VU vu = (VU) obj;
            return C8632dsu.c((Object) this.a, (Object) vu.a) && Float.compare(this.c, vu.c) == 0 && Float.compare(this.d, vu.d) == 0 && this.j == vu.j && this.b == vu.b && C8632dsu.c((Object) this.i, (Object) vu.i) && this.e == vu.e;
        }
        return false;
    }

    public final boolean f() {
        return this.e;
    }

    public final boolean g() {
        return this.j;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + Float.hashCode(this.c)) * 31) + Float.hashCode(this.d)) * 31) + Boolean.hashCode(this.j)) * 31) + Boolean.hashCode(this.b)) * 31) + this.i.hashCode()) * 31) + Boolean.hashCode(this.e);
    }

    public String toString() {
        String str = this.a;
        float f = this.c;
        float f2 = this.d;
        boolean z = this.j;
        boolean z2 = this.b;
        String str2 = this.i;
        boolean z3 = this.e;
        return "PlaybackData(id=" + str + ", currentTimeInSeconds=" + f + ", durationInSeconds=" + f2 + ", isPlaying=" + z + ", isInSkipWindow=" + z2 + ", skipButtonText=" + str2 + ", isLoading=" + z3 + ")";
    }

    public VU(String str, float f, float f2, boolean z, boolean z2, String str2, boolean z3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.a = str;
        this.c = f;
        this.d = f2;
        this.j = z;
        this.b = z2;
        this.i = str2;
        this.e = z3;
    }

    public /* synthetic */ VU(String str, float f, float f2, boolean z, boolean z2, String str2, boolean z3, int i, C8627dsp c8627dsp) {
        this(str, (i & 2) != 0 ? 0.0f : f, (i & 4) == 0 ? f2 : 0.0f, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? "" : str2, (i & 64) == 0 ? z3 : false);
    }
}
