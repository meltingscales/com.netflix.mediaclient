package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class dIB implements InterfaceC7871dIn {
    public boolean c;
    public final C7872dIo d;
    public final dIJ e;

    @Override // o.InterfaceC7871dIn
    public C7872dIo c() {
        return this.d;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    @Override // o.InterfaceC7871dIn
    public C7872dIo o() {
        return this.d;
    }

    public dIB(dIJ dij) {
        C8632dsu.c((Object) dij, "");
        this.e = dij;
        this.d = new C7872dIo();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        C8632dsu.c((Object) byteBuffer, "");
        if (this.d.D() == 0 && this.e.b(this.d, 8192) == -1) {
            return -1;
        }
        return this.d.read(byteBuffer);
    }

    @Override // o.InterfaceC7871dIn
    public String z() {
        return d(Long.MAX_VALUE);
    }

    public long c(byte b) {
        return e(b, 0L, Long.MAX_VALUE);
    }

    @Override // o.InterfaceC7871dIn
    public long e(ByteString byteString) {
        C8632dsu.c((Object) byteString, "");
        return c(byteString, 0L);
    }

    @Override // o.InterfaceC7871dIn
    public long d(ByteString byteString) {
        C8632dsu.c((Object) byteString, "");
        return e(byteString, 0L);
    }

    @Override // o.InterfaceC7871dIn
    public boolean a(long j, ByteString byteString) {
        C8632dsu.c((Object) byteString, "");
        return e(j, byteString, 0, byteString.k());
    }

    /* loaded from: classes5.dex */
    public static final class c extends InputStream {
        c() {
        }

        @Override // java.io.InputStream
        public int read() {
            dIB dib = dIB.this;
            if (dib.c) {
                throw new IOException("closed");
            }
            if (dib.d.D() == 0) {
                dIB dib2 = dIB.this;
                if (dib2.e.b(dib2.d, 8192) == -1) {
                    return -1;
                }
            }
            return dIB.this.d.l() & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            C8632dsu.c((Object) bArr, "");
            if (dIB.this.c) {
                throw new IOException("closed");
            }
            C7868dIi.a(bArr.length, i, i2);
            if (dIB.this.d.D() == 0) {
                dIB dib = dIB.this;
                if (dib.e.b(dib.d, 8192) == -1) {
                    return -1;
                }
            }
            return dIB.this.d.d(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public int available() {
            dIB dib = dIB.this;
            if (dib.c) {
                throw new IOException("closed");
            }
            return (int) Math.min(dib.d.D(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            dIB.this.close();
        }

        public String toString() {
            return dIB.this + ".inputStream()";
        }
    }

    @Override // o.InterfaceC7871dIn
    public InputStream n() {
        return new c();
    }

    @Override // o.dIJ
    public long b(C7872dIo c7872dIo, long j) {
        C8632dsu.c((Object) c7872dIo, "");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        } else {
            if (this.d.D() == 0 && this.e.b(this.d, 8192) == -1) {
                return -1L;
            }
            return this.d.b(c7872dIo, Math.min(j, this.d.D()));
        }
    }

    @Override // o.InterfaceC7871dIn
    public boolean m() {
        if (!this.c) {
            return this.d.m() && this.e.b(this.d, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // o.InterfaceC7871dIn
    public void g(long j) {
        if (!j(j)) {
            throw new EOFException();
        }
    }

    @Override // o.InterfaceC7871dIn
    public boolean j(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        } else {
            while (this.d.D() < j) {
                if (this.e.b(this.d, 8192) == -1) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override // o.InterfaceC7871dIn
    public byte l() {
        g(1L);
        return this.d.l();
    }

    @Override // o.InterfaceC7871dIn
    public ByteString c(long j) {
        g(j);
        return this.d.c(j);
    }

    @Override // o.InterfaceC7871dIn
    public int b(dIA dia) {
        C8632dsu.c((Object) dia, "");
        if (!this.c) {
            while (true) {
                int a = dII.a(this.d, dia, true);
                if (a == -2) {
                    if (this.e.b(this.d, 8192) == -1) {
                        break;
                    }
                } else if (a != -1) {
                    this.d.h(dia.a()[a].k());
                    return a;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // o.InterfaceC7871dIn
    public byte[] e(long j) {
        g(j);
        return this.d.e(j);
    }

    @Override // o.InterfaceC7871dIn
    public void b(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        try {
            g(bArr.length);
            this.d.b(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.d.D() > 0) {
                C7872dIo c7872dIo = this.d;
                int d = c7872dIo.d(bArr, i, (int) c7872dIo.D());
                if (d == -1) {
                    throw new AssertionError();
                }
                i += d;
            }
            throw e;
        }
    }

    @Override // o.InterfaceC7871dIn
    public void d(C7872dIo c7872dIo, long j) {
        C8632dsu.c((Object) c7872dIo, "");
        try {
            g(j);
            this.d.d(c7872dIo, j);
        } catch (EOFException e) {
            c7872dIo.b(this.d);
            throw e;
        }
    }

    @Override // o.InterfaceC7871dIn
    public String d(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        byte b = (byte) 10;
        long e = e(b, 0L, j2);
        if (e != -1) {
            return dII.a(this.d, e);
        }
        if (j2 < Long.MAX_VALUE && j(j2) && this.d.a(j2 - 1) == ((byte) 13) && j(1 + j2) && this.d.a(j2) == b) {
            return dII.a(this.d, j2);
        }
        C7872dIo c7872dIo = new C7872dIo();
        C7872dIo c7872dIo2 = this.d;
        c7872dIo2.a(c7872dIo, 0L, Math.min(32, c7872dIo2.D()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.d.D(), j) + " content=" + c7872dIo.r().j() + "…");
    }

    @Override // o.InterfaceC7871dIn
    public short x() {
        g(2L);
        return this.d.x();
    }

    public short d() {
        g(2L);
        return this.d.u();
    }

    @Override // o.InterfaceC7871dIn
    public int p() {
        g(4L);
        return this.d.p();
    }

    public int a() {
        g(4L);
        return this.d.w();
    }

    @Override // o.InterfaceC7871dIn
    public long y() {
        g(8L);
        return this.d.y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r4 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("Expected leading [0-9] or '-' character but was 0x");
        r1 = o.C8672dug.c(16);
        r1 = o.C8672dug.c(r1);
        r1 = java.lang.Integer.toString(r8, r1);
        o.C8632dsu.a(r1, "");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        throw new java.lang.NumberFormatException(r0.toString());
     */
    @Override // o.InterfaceC7871dIn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long t() {
        /*
            r10 = this;
            r0 = 1
            r10.g(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.j(r6)
            if (r8 == 0) goto L59
            o.dIo r8 = r10.d
            byte r8 = r8.a(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L20
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L2a
        L20:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            r5 = 45
            byte r5 = (byte) r5
            if (r8 == r5) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L8
        L2c:
            if (r4 == 0) goto L2f
            goto L59
        L2f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9] or '-' character but was 0x"
            r0.append(r1)
            r1 = 16
            int r1 = o.C8666dua.e(r1)
            int r1 = o.C8666dua.e(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = ""
            o.C8632dsu.a(r1, r2)
            r0.append(r1)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L59:
            o.dIo r0 = r10.d
            long r0 = r0.t()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dIB.t():long");
    }

    @Override // o.InterfaceC7871dIn
    public long s() {
        byte a;
        int c2;
        int c3;
        g(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!j(i2)) {
                break;
            }
            a = this.d.a(i);
            if ((a < ((byte) 48) || a > ((byte) 57)) && ((a < ((byte) 97) || a > ((byte) 102)) && (a < ((byte) 65) || a > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            c2 = C8672dug.c(16);
            c3 = C8672dug.c(c2);
            String num = Integer.toString(a, c3);
            C8632dsu.a(num, "");
            sb.append(num);
            throw new NumberFormatException(sb.toString());
        }
        return this.d.s();
    }

    @Override // o.InterfaceC7871dIn
    public void h(long j) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            if (this.d.D() == 0 && this.e.b(this.d, 8192) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.d.D());
            this.d.h(min);
            j -= min;
        }
    }

    public long e(byte b, long j, long j2) {
        if (!this.c) {
            if (0 > j || j2 < j) {
                throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
            }
            while (j < j2) {
                long b2 = this.d.b(b, j, j2);
                if (b2 != -1) {
                    return b2;
                }
                long D = this.d.D();
                if (D >= j2 || this.e.b(this.d, 8192) == -1) {
                    return -1L;
                }
                j = Math.max(j, D);
            }
            return -1L;
        }
        throw new IllegalStateException("closed".toString());
    }

    public long c(ByteString byteString, long j) {
        C8632dsu.c((Object) byteString, "");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long c2 = this.d.c(byteString, j);
            if (c2 != -1) {
                return c2;
            }
            long D = this.d.D();
            if (this.e.b(this.d, 8192) == -1) {
                return -1L;
            }
            j = Math.max(j, (D - byteString.k()) + 1);
        }
    }

    public long e(ByteString byteString, long j) {
        C8632dsu.c((Object) byteString, "");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long e = this.d.e(byteString, j);
            if (e != -1) {
                return e;
            }
            long D = this.d.D();
            if (this.e.b(this.d, 8192) == -1) {
                return -1L;
            }
            j = Math.max(j, D);
        }
    }

    public boolean e(long j, ByteString byteString, int i, int i2) {
        int i3;
        C8632dsu.c((Object) byteString, "");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j >= 0 && i >= 0 && i2 >= 0 && byteString.k() - i >= i2) {
            for (i3 = 0; i3 < i2; i3 = i3 + 1) {
                long j2 = i3 + j;
                i3 = (j(1 + j2) && this.d.a(j2) == byteString.a(i + i3)) ? i3 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC7871dIn
    public InterfaceC7871dIn k() {
        return dIw.e(new dIF(this));
    }

    @Override // o.dIJ, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.e.close();
        this.d.d();
    }

    @Override // o.dIJ
    public dIK e() {
        return this.e.e();
    }

    public String toString() {
        return "buffer(" + this.e + ')';
    }
}
