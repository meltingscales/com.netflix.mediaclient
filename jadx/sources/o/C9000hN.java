package o;

/* renamed from: o.hN  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9000hN implements dIH {
    private final dIH a;
    private long b;

    public final long c() {
        return this.b;
    }

    @Override // o.dIH, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // o.dIH
    public dIK e() {
        return this.a.e();
    }

    @Override // o.dIH, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    public C9000hN(dIH dih) {
        C8632dsu.c((Object) dih, "");
        this.a = dih;
    }

    @Override // o.dIH
    public void a(C7872dIo c7872dIo, long j) {
        C8632dsu.c((Object) c7872dIo, "");
        this.a.a(c7872dIo, j);
        this.b += j;
    }
}
