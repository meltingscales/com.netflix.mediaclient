package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes5.dex */
public final class dIr implements dIJ {
    private final CRC32 a;
    private final dIu b;
    private final Inflater c;
    private byte d;
    private final dIB e;

    public dIr(dIJ dij) {
        C8632dsu.c((Object) dij, "");
        dIB dib = new dIB(dij);
        this.e = dib;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.b = new dIu((InterfaceC7871dIn) dib, inflater);
        this.a = new CRC32();
    }

    @Override // o.dIJ
    public long b(C7872dIo c7872dIo, long j) {
        C8632dsu.c((Object) c7872dIo, "");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (i == 0) {
            return 0L;
        } else {
            if (this.d == 0) {
                c();
                this.d = (byte) 1;
            }
            if (this.d == 1) {
                long D = c7872dIo.D();
                long b = this.b.b(c7872dIo, j);
                if (b != -1) {
                    e(c7872dIo, D, b);
                    return b;
                }
                this.d = (byte) 2;
            }
            if (this.d == 2) {
                a();
                this.d = (byte) 3;
                if (!this.e.m()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
    }

    private final void c() {
        this.e.g(10L);
        byte a = this.e.d.a(3L);
        boolean z = ((a >> 1) & 1) == 1;
        if (z) {
            e(this.e.d, 0L, 10L);
        }
        c("ID1ID2", 8075, this.e.x());
        this.e.h(8L);
        if (((a >> 2) & 1) == 1) {
            this.e.g(2L);
            if (z) {
                e(this.e.d, 0L, 2L);
            }
            long u = this.e.d.u();
            this.e.g(u);
            if (z) {
                e(this.e.d, 0L, u);
            }
            this.e.h(u);
        }
        if (((a >> 3) & 1) == 1) {
            long c = this.e.c((byte) 0);
            if (c == -1) {
                throw new EOFException();
            }
            if (z) {
                e(this.e.d, 0L, c + 1);
            }
            this.e.h(c + 1);
        }
        if (((a >> 4) & 1) == 1) {
            long c2 = this.e.c((byte) 0);
            if (c2 == -1) {
                throw new EOFException();
            }
            if (z) {
                e(this.e.d, 0L, c2 + 1);
            }
            this.e.h(c2 + 1);
        }
        if (z) {
            c("FHCRC", this.e.d(), (short) this.a.getValue());
            this.a.reset();
        }
    }

    private final void a() {
        c("CRC", this.e.a(), (int) this.a.getValue());
        c("ISIZE", this.e.a(), (int) this.c.getBytesWritten());
    }

    @Override // o.dIJ
    public dIK e() {
        return this.e.e();
    }

    @Override // o.dIJ, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    private final void e(C7872dIo c7872dIo, long j, long j2) {
        int i;
        dIE die = c7872dIo.c;
        C8632dsu.d(die);
        while (true) {
            long j3 = die.d - die.g;
            if (j < j3) {
                break;
            }
            j -= j3;
            die = die.c;
            C8632dsu.d(die);
        }
        while (j2 > 0) {
            int min = (int) Math.min(die.d - i, j2);
            this.a.update(die.e, (int) (die.g + j), min);
            j2 -= min;
            die = die.c;
            C8632dsu.d(die);
            j = 0;
        }
    }

    private final void c(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        C8632dsu.a(format, "");
        throw new IOException(format);
    }
}
