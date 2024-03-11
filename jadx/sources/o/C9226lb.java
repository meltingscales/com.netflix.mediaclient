package o;

/* renamed from: o.lb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9226lb {
    private boolean a;
    private boolean c;
    private boolean d;
    private boolean e;

    public C9226lb() {
        this(false, false, false, false, 15, null);
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.e;
    }

    public final boolean d() {
        return this.a;
    }

    public final void e(boolean z) {
        this.a = z;
    }

    public final boolean e() {
        return this.d;
    }

    public C9226lb(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.d = z2;
        this.e = z3;
        this.c = z4;
    }

    public /* synthetic */ C9226lb(boolean z, boolean z2, boolean z3, boolean z4, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4);
    }

    public C9226lb(boolean z) {
        this(z, z, z, z);
    }

    public final C9226lb a() {
        return new C9226lb(this.a, this.d, this.e, this.c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9226lb) {
            C9226lb c9226lb = (C9226lb) obj;
            if (this.a == c9226lb.a && this.d == c9226lb.d && this.e == c9226lb.e && this.c == c9226lb.c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.a);
        int hashCode2 = Boolean.hashCode(this.d);
        return (((((hashCode * 31) + hashCode2) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.c);
    }
}
