package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes5.dex */
public final class dIu implements dIJ {
    private final Inflater a;
    private int b;
    private boolean c;
    private final InterfaceC7871dIn e;

    public dIu(InterfaceC7871dIn interfaceC7871dIn, Inflater inflater) {
        C8632dsu.c((Object) interfaceC7871dIn, "");
        C8632dsu.c((Object) inflater, "");
        this.e = interfaceC7871dIn;
        this.a = inflater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dIu(dIJ dij, Inflater inflater) {
        this(dIw.e(dij), inflater);
        C8632dsu.c((Object) dij, "");
        C8632dsu.c((Object) inflater, "");
    }

    @Override // o.dIJ
    public long b(C7872dIo c7872dIo, long j) {
        C8632dsu.c((Object) c7872dIo, "");
        do {
            long d = d(c7872dIo, j);
            if (d > 0) {
                return d;
            }
            if (this.a.finished() || this.a.needsDictionary()) {
                return -1L;
            }
        } while (!this.e.m());
        throw new EOFException("source exhausted prematurely");
    }

    public final long d(C7872dIo c7872dIo, long j) {
        C8632dsu.c((Object) c7872dIo, "");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!this.c) {
            if (i == 0) {
                return 0L;
            }
            try {
                dIE b = c7872dIo.b(1);
                b();
                int inflate = this.a.inflate(b.e, b.d, (int) Math.min(j, 8192 - b.d));
                a();
                if (inflate > 0) {
                    b.d += inflate;
                    long j2 = inflate;
                    c7872dIo.f(c7872dIo.D() + j2);
                    return j2;
                }
                if (b.g == b.d) {
                    c7872dIo.c = b.e();
                    dIC.e(b);
                }
                return 0L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final boolean b() {
        if (this.a.needsInput()) {
            if (this.e.m()) {
                return true;
            }
            dIE die = this.e.o().c;
            C8632dsu.d(die);
            int i = die.d;
            int i2 = die.g;
            int i3 = i - i2;
            this.b = i3;
            this.a.setInput(die.e, i2, i3);
            return false;
        }
        return false;
    }

    private final void a() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        int remaining = i - this.a.getRemaining();
        this.b -= remaining;
        this.e.h(remaining);
    }

    @Override // o.dIJ
    public dIK e() {
        return this.e.e();
    }

    @Override // o.dIJ, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.c) {
            return;
        }
        this.a.end();
        this.c = true;
        this.e.close();
    }
}
