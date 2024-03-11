package o;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class dIv implements dIJ {
    private final InputStream a;
    private final dIK b;

    @Override // o.dIJ
    public dIK e() {
        return this.b;
    }

    public dIv(InputStream inputStream, dIK dik) {
        C8632dsu.c((Object) inputStream, "");
        C8632dsu.c((Object) dik, "");
        this.a = inputStream;
        this.b = dik;
    }

    @Override // o.dIJ
    public long b(C7872dIo c7872dIo, long j) {
        C8632dsu.c((Object) c7872dIo, "");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        if (i < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        try {
            this.b.h();
            dIE b = c7872dIo.b(1);
            int read = this.a.read(b.e, b.d, (int) Math.min(j, 8192 - b.d));
            if (read == -1) {
                if (b.g == b.d) {
                    c7872dIo.c = b.e();
                    dIC.e(b);
                    return -1L;
                }
                return -1L;
            }
            b.d += read;
            long j2 = read;
            c7872dIo.f(c7872dIo.D() + j2);
            return j2;
        } catch (AssertionError e) {
            if (dIw.c(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // o.dIJ, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    public String toString() {
        return "source(" + this.a + ')';
    }
}
