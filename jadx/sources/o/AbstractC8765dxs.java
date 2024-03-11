package o;

/* renamed from: o.dxs  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8765dxs extends dwQ {
    private C8560dqc<AbstractC8754dxh<?>> a;
    private boolean b;
    private long e;

    private final long b(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public void a() {
    }

    public boolean f() {
        return false;
    }

    public long j() {
        return !i() ? Long.MAX_VALUE : 0L;
    }

    protected boolean e() {
        return g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long c() {
        C8560dqc<AbstractC8754dxh<?>> c8560dqc = this.a;
        return (c8560dqc == null || c8560dqc.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final boolean i() {
        AbstractC8754dxh<?> g;
        C8560dqc<AbstractC8754dxh<?>> c8560dqc = this.a;
        if (c8560dqc == null || (g = c8560dqc.g()) == null) {
            return false;
        }
        g.run();
        return true;
    }

    public final void e(AbstractC8754dxh<?> abstractC8754dxh) {
        C8560dqc<AbstractC8754dxh<?>> c8560dqc = this.a;
        if (c8560dqc == null) {
            c8560dqc = new C8560dqc<>();
            this.a = c8560dqc;
        }
        c8560dqc.b((C8560dqc<AbstractC8754dxh<?>>) abstractC8754dxh);
    }

    public final boolean d() {
        return this.e >= b(true);
    }

    public final boolean g() {
        C8560dqc<AbstractC8754dxh<?>> c8560dqc = this.a;
        if (c8560dqc != null) {
            return c8560dqc.isEmpty();
        }
        return true;
    }

    public static /* synthetic */ void e(AbstractC8765dxs abstractC8765dxs, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC8765dxs.d(z);
    }

    public final void d(boolean z) {
        this.e += b(z);
        if (z) {
            return;
        }
        this.b = true;
    }

    public static /* synthetic */ void c(AbstractC8765dxs abstractC8765dxs, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC8765dxs.a(z);
    }

    public final void a(boolean z) {
        long b = this.e - b(z);
        this.e = b;
        if (b <= 0 && this.b) {
            a();
        }
    }

    @Override // o.dwQ
    public final dwQ limitedParallelism(int i) {
        C7661dAr.b(i);
        return this;
    }
}
