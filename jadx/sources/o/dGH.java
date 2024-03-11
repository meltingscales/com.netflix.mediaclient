package o;

/* loaded from: classes5.dex */
public abstract class dGH {
    private long a;
    private final boolean b;
    private final String c;
    private dGK d;

    public final long a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final dGK c() {
        return this.d;
    }

    public abstract long d();

    public final void e(long j) {
        this.a = j;
    }

    public final boolean e() {
        return this.b;
    }

    public String toString() {
        return this.c;
    }

    public dGH(String str, boolean z) {
        C8632dsu.d((Object) str, "");
        this.c = str;
        this.b = z;
        this.a = -1L;
    }

    public /* synthetic */ dGH(String str, boolean z, int i, C8627dsp c8627dsp) {
        this(str, (i & 2) != 0 ? true : z);
    }

    public final void b(dGK dgk) {
        C8632dsu.d(dgk, "");
        dGK dgk2 = this.d;
        if (dgk2 == dgk) {
            return;
        }
        if (dgk2 != null) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.d = dgk;
    }
}
