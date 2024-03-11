package o;

/* loaded from: classes5.dex */
public abstract class dIt implements dIJ {
    private final dIJ c;

    public final dIJ a() {
        return this.c;
    }

    public dIt(dIJ dij) {
        C8632dsu.c((Object) dij, "");
        this.c = dij;
    }

    @Override // o.dIJ
    public long b(C7872dIo c7872dIo, long j) {
        C8632dsu.c((Object) c7872dIo, "");
        return this.c.b(c7872dIo, j);
    }

    @Override // o.dIJ
    public dIK e() {
        return this.c.e();
    }

    @Override // o.dIJ, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.close();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.c + ')';
    }
}
