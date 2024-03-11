package o;

/* renamed from: o.bnj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4854bnj {
    public final long a;
    public final long b;
    private final int c;
    public final long d;
    private final int e;
    private final boolean f;
    private final int g;
    private transient boolean h;
    private transient boolean i;
    private final boolean j;
    private final int k;
    private final String m;

    public int a() {
        return this.g;
    }

    public int b() {
        return this.e;
    }

    public boolean c() {
        return this.i;
    }

    public boolean d() {
        return this.h;
    }

    public String e() {
        return this.m;
    }

    public boolean f() {
        return this.f;
    }

    public boolean g() {
        return this.j;
    }

    public boolean h() {
        return this.a > 0 && this.d > 0;
    }

    public C4854bnj(String str, int i, int i2, boolean z, boolean z2, int i3, int i4, long j, long j2, long j3) {
        this.m = str;
        this.k = i;
        this.c = i2;
        this.j = z;
        this.f = z2;
        this.e = i3;
        this.g = i4;
        int random = (int) (Math.random() * 2.147483647E9d);
        if (i > 0) {
            this.h = random % i == 0;
        }
        if (i2 > 0) {
            this.i = random % i2 == 0;
        }
        this.d = j;
        this.a = j2;
        this.b = j3;
    }
}
