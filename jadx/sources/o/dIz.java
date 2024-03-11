package o;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class dIz implements dIH {
    private final dIK c;
    private final OutputStream e;

    @Override // o.dIH
    public dIK e() {
        return this.c;
    }

    public dIz(OutputStream outputStream, dIK dik) {
        C8632dsu.c((Object) outputStream, "");
        C8632dsu.c((Object) dik, "");
        this.e = outputStream;
        this.c = dik;
    }

    @Override // o.dIH
    public void a(C7872dIo c7872dIo, long j) {
        C8632dsu.c((Object) c7872dIo, "");
        C7868dIi.a(c7872dIo.D(), 0L, j);
        while (j > 0) {
            this.c.h();
            dIE die = c7872dIo.c;
            C8632dsu.d(die);
            int min = (int) Math.min(j, die.d - die.g);
            this.e.write(die.e, die.g, min);
            die.g += min;
            long j2 = min;
            j -= j2;
            c7872dIo.f(c7872dIo.D() - j2);
            if (die.g == die.d) {
                c7872dIo.c = die.e();
                dIC.e(die);
            }
        }
    }

    @Override // o.dIH, java.io.Flushable
    public void flush() {
        this.e.flush();
    }

    @Override // o.dIH, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.e.close();
    }

    public String toString() {
        return "sink(" + this.e + ')';
    }
}
