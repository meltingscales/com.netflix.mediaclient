package o;

/* renamed from: o.aDn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1498aDn implements dIH {
    private final dIH a;
    private long c;

    @Override // o.dIH, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    public final long d() {
        return this.c;
    }

    @Override // o.dIH
    public dIK e() {
        return this.a.e();
    }

    @Override // o.dIH, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    public C1498aDn(dIH dih) {
        C8632dsu.c((Object) dih, "");
        this.a = dih;
    }

    @Override // o.dIH
    public void a(C7872dIo c7872dIo, long j) {
        C8632dsu.c((Object) c7872dIo, "");
        this.a.a(c7872dIo, j);
        this.c += j;
    }
}
