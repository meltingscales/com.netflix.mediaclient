package o;

/* loaded from: classes5.dex */
public abstract class dIm implements dIH {
    private final dIH d;

    public dIm(dIH dih) {
        C8632dsu.c((Object) dih, "");
        this.d = dih;
    }

    @Override // o.dIH
    public void a(C7872dIo c7872dIo, long j) {
        C8632dsu.c((Object) c7872dIo, "");
        this.d.a(c7872dIo, j);
    }

    @Override // o.dIH, java.io.Flushable
    public void flush() {
        this.d.flush();
    }

    @Override // o.dIH
    public dIK e() {
        return this.d.e();
    }

    @Override // o.dIH, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d.close();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.d + ')';
    }
}
