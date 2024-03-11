package o;

import com.netflix.ale.AleCryptoBouncyCastle;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.ByteString;
import okio.SegmentedByteString;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.dIo  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7872dIo implements InterfaceC7871dIn, dIq, Cloneable, ByteChannel {
    public dIE c;
    private long e;

    public final long D() {
        return this.e;
    }

    @Override // o.InterfaceC7871dIn
    public C7872dIo c() {
        return this;
    }

    @Override // o.dIJ, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // o.dIq
    /* renamed from: f */
    public C7872dIo j() {
        return this;
    }

    public final void f(long j) {
        this.e = j;
    }

    @Override // o.dIq, o.dIH, java.io.Flushable
    public void flush() {
    }

    @Override // o.dIq
    /* renamed from: h */
    public C7872dIo i() {
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // o.InterfaceC7871dIn
    public boolean j(long j) {
        return this.e >= j;
    }

    @Override // o.InterfaceC7871dIn
    public boolean m() {
        return this.e == 0;
    }

    @Override // o.InterfaceC7871dIn
    public C7872dIo o() {
        return this;
    }

    @Override // o.InterfaceC7871dIn
    public void g(long j) {
        if (this.e < j) {
            throw new EOFException();
        }
    }

    @Override // o.InterfaceC7871dIn
    public InterfaceC7871dIn k() {
        return dIw.e(new dIF(this));
    }

    /* renamed from: o.dIo$e */
    /* loaded from: classes5.dex */
    public static final class e extends InputStream {
        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        e() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (C7872dIo.this.D() > 0) {
                return C7872dIo.this.l() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            C8632dsu.c((Object) bArr, "");
            return C7872dIo.this.d(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C7872dIo.this.D(), Integer.MAX_VALUE);
        }

        public String toString() {
            return C7872dIo.this + ".inputStream()";
        }
    }

    @Override // o.InterfaceC7871dIn
    public InputStream n() {
        return new e();
    }

    public short u() {
        return C7868dIi.e(x());
    }

    public int w() {
        return C7868dIi.e(p());
    }

    public String v() {
        return c(this.e, C8674dui.i);
    }

    public String b(long j) {
        return c(j, C8674dui.i);
    }

    public String a(Charset charset) {
        C8632dsu.c((Object) charset, "");
        return c(this.e, charset);
    }

    public String c(long j, Charset charset) {
        C8632dsu.c((Object) charset, "");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0 || j > Integer.MAX_VALUE) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (this.e >= j) {
            if (i == 0) {
                return "";
            }
            dIE die = this.c;
            C8632dsu.d(die);
            int i2 = die.g;
            if (i2 + j > die.d) {
                return new String(e(j), charset);
            }
            int i3 = (int) j;
            String str = new String(die.e, i2, i3, charset);
            int i4 = die.g + i3;
            die.g = i4;
            this.e -= j;
            if (i4 == die.d) {
                this.c = die.e();
                dIC.e(die);
            }
            return str;
        } else {
            throw new EOFException();
        }
    }

    @Override // o.InterfaceC7871dIn
    public String z() {
        return d(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        C8632dsu.c((Object) byteBuffer, "");
        dIE die = this.c;
        if (die != null) {
            int min = Math.min(byteBuffer.remaining(), die.d - die.g);
            byteBuffer.put(die.e, die.g, min);
            int i = die.g + min;
            die.g = i;
            this.e -= min;
            if (i == die.d) {
                this.c = die.e();
                dIC.e(die);
            }
            return min;
        }
        return -1;
    }

    @Override // o.dIq
    /* renamed from: d */
    public C7872dIo b(String str) {
        C8632dsu.c((Object) str, "");
        return c(str, 0, str.length());
    }

    public C7872dIo b(String str, Charset charset) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) charset, "");
        return e(str, 0, str.length(), charset);
    }

    public C7872dIo e(String str, int i, int i2, Charset charset) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) charset, "");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        } else if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        } else if (C8632dsu.c(charset, C8674dui.i)) {
            return c(str, i, i2);
        } else {
            String substring = str.substring(i, i2);
            C8632dsu.a(substring, "");
            if (substring == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = substring.getBytes(charset);
            C8632dsu.a(bytes, "");
            return e(bytes, 0, bytes.length);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        C8632dsu.c((Object) byteBuffer, "");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            dIE b = b(1);
            int min = Math.min(i, 8192 - b.d);
            byteBuffer.get(b.e, b.d, min);
            i -= min;
            b.d += min;
        }
        this.e += remaining;
        return remaining;
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
        return b(j, byteString, 0, byteString.k());
    }

    @Override // o.dIJ
    public dIK e() {
        return dIK.c;
    }

    public String toString() {
        return A().toString();
    }

    /* renamed from: a */
    public C7872dIo clone() {
        return g();
    }

    public static /* synthetic */ d a(C7872dIo c7872dIo, d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = new d();
        }
        return c7872dIo.c(dVar);
    }

    public final d c(d dVar) {
        C8632dsu.c((Object) dVar, "");
        if (dVar.b != null) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        dVar.b = this;
        dVar.c = true;
        return dVar;
    }

    /* renamed from: o.dIo$d */
    /* loaded from: classes5.dex */
    public static final class d implements Closeable {
        public byte[] a;
        public C7872dIo b;
        public boolean c;
        private dIE j;
        public long d = -1;
        public int g = -1;
        public int e = -1;

        public final int a() {
            long j = this.d;
            C7872dIo c7872dIo = this.b;
            C8632dsu.d(c7872dIo);
            if (j != c7872dIo.D()) {
                long j2 = this.d;
                return c(j2 == -1 ? 0L : j2 + (this.e - this.g));
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        public final int c(long j) {
            dIE die;
            C7872dIo c7872dIo = this.b;
            if (c7872dIo == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j < -1 || j > c7872dIo.D()) {
                dsE dse = dsE.b;
                String format = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(c7872dIo.D())}, 2));
                C8632dsu.a(format, "");
                throw new ArrayIndexOutOfBoundsException(format);
            } else if (j == -1 || j == c7872dIo.D()) {
                this.j = null;
                this.d = j;
                this.a = null;
                this.g = -1;
                this.e = -1;
                return -1;
            } else {
                long D = c7872dIo.D();
                dIE die2 = c7872dIo.c;
                dIE die3 = this.j;
                long j2 = 0;
                if (die3 != null) {
                    long j3 = this.d;
                    int i = this.g;
                    C8632dsu.d(die3);
                    long j4 = j3 - (i - die3.g);
                    if (j4 > j) {
                        die = this.j;
                        D = j4;
                    } else {
                        j2 = j4;
                        die = die2;
                        die2 = this.j;
                    }
                } else {
                    die = die2;
                }
                if (D - j > j - j2) {
                    while (true) {
                        C8632dsu.d(die2);
                        long j5 = (die2.d - die2.g) + j2;
                        if (j < j5) {
                            break;
                        }
                        die2 = die2.c;
                        j2 = j5;
                    }
                } else {
                    while (D > j) {
                        C8632dsu.d(die);
                        die = die.i;
                        C8632dsu.d(die);
                        D -= die.d - die.g;
                    }
                    j2 = D;
                    die2 = die;
                }
                if (this.c) {
                    C8632dsu.d(die2);
                    if (die2.j) {
                        dIE c = die2.c();
                        if (c7872dIo.c == die2) {
                            c7872dIo.c = c;
                        }
                        die2 = die2.b(c);
                        dIE die4 = die2.i;
                        C8632dsu.d(die4);
                        die4.e();
                    }
                }
                this.j = die2;
                this.d = j;
                C8632dsu.d(die2);
                this.a = die2.e;
                int i2 = die2.g + ((int) (j - j2));
                this.g = i2;
                int i3 = die2.d;
                this.e = i3;
                return i3 - i2;
            }
        }

        public final long a(long j) {
            C7872dIo c7872dIo = this.b;
            if (c7872dIo != null) {
                if (!this.c) {
                    throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
                }
                long D = c7872dIo.D();
                int i = (j > D ? 1 : (j == D ? 0 : -1));
                if (i <= 0) {
                    if (j < 0) {
                        throw new IllegalArgumentException(("newSize < 0: " + j).toString());
                    }
                    long j2 = D - j;
                    while (true) {
                        if (j2 <= 0) {
                            break;
                        }
                        dIE die = c7872dIo.c;
                        C8632dsu.d(die);
                        dIE die2 = die.i;
                        C8632dsu.d(die2);
                        int i2 = die2.d;
                        long j3 = i2 - die2.g;
                        if (j3 <= j2) {
                            c7872dIo.c = die2.e();
                            dIC.e(die2);
                            j2 -= j3;
                        } else {
                            die2.d = i2 - ((int) j2);
                            break;
                        }
                    }
                    this.j = null;
                    this.d = j;
                    this.a = null;
                    this.g = -1;
                    this.e = -1;
                } else if (i > 0) {
                    long j4 = j - D;
                    int i3 = 1;
                    boolean z = true;
                    for (long j5 = 0; j4 > j5; j5 = 0) {
                        dIE b = c7872dIo.b(i3);
                        int min = (int) Math.min(j4, 8192 - b.d);
                        int i4 = b.d + min;
                        b.d = i4;
                        j4 -= min;
                        if (z) {
                            this.j = b;
                            this.d = D;
                            this.a = b.e;
                            this.g = i4 - min;
                            this.e = i4;
                            z = false;
                        }
                        i3 = 1;
                    }
                }
                c7872dIo.f(j);
                return D;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.b == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.b = null;
            this.j = null;
            this.d = -1L;
            this.a = null;
            this.g = -1;
            this.e = -1;
        }
    }

    public final C7872dIo a(C7872dIo c7872dIo, long j, long j2) {
        C8632dsu.c((Object) c7872dIo, "");
        C7868dIi.a(D(), j, j2);
        if (j2 != 0) {
            c7872dIo.f(c7872dIo.D() + j2);
            dIE die = this.c;
            while (true) {
                C8632dsu.d(die);
                long j3 = die.d - die.g;
                if (j < j3) {
                    break;
                }
                j -= j3;
                die = die.c;
            }
            while (j2 > 0) {
                C8632dsu.d(die);
                dIE b = die.b();
                int i = b.g + ((int) j);
                b.g = i;
                b.d = Math.min(i + ((int) j2), b.d);
                dIE die2 = c7872dIo.c;
                if (die2 == null) {
                    b.i = b;
                    b.c = b;
                    c7872dIo.c = b;
                } else {
                    C8632dsu.d(die2);
                    dIE die3 = die2.i;
                    C8632dsu.d(die3);
                    die3.b(b);
                }
                j2 -= b.d - b.g;
                die = die.c;
                j = 0;
            }
        }
        return this;
    }

    public final long b() {
        long D = D();
        if (D == 0) {
            return 0L;
        }
        dIE die = this.c;
        C8632dsu.d(die);
        dIE die2 = die.i;
        C8632dsu.d(die2);
        int i = die2.d;
        return (i >= 8192 || !die2.b) ? D : D - (i - die2.g);
    }

    @Override // o.InterfaceC7871dIn
    public byte l() {
        if (D() == 0) {
            throw new EOFException();
        }
        dIE die = this.c;
        C8632dsu.d(die);
        int i = die.g;
        int i2 = die.d;
        int i3 = i + 1;
        byte b = die.e[i];
        f(D() - 1);
        if (i3 == i2) {
            this.c = die.e();
            dIC.e(die);
        } else {
            die.g = i3;
        }
        return b;
    }

    public final byte a(long j) {
        C7868dIi.a(D(), j, 1L);
        dIE die = this.c;
        if (die == null) {
            C8632dsu.d((Object) null);
            throw null;
        } else if (D() - j < j) {
            long D = D();
            while (D > j) {
                die = die.i;
                C8632dsu.d(die);
                D -= die.d - die.g;
            }
            C8632dsu.d(die);
            return die.e[(int) ((die.g + j) - D)];
        } else {
            long j2 = 0;
            while (true) {
                long j3 = (die.d - die.g) + j2;
                if (j3 > j) {
                    C8632dsu.d(die);
                    return die.e[(int) ((die.g + j) - j2)];
                }
                die = die.c;
                C8632dsu.d(die);
                j2 = j3;
            }
        }
    }

    @Override // o.InterfaceC7871dIn
    public short x() {
        int i;
        int i2;
        if (D() < 2) {
            throw new EOFException();
        }
        dIE die = this.c;
        C8632dsu.d(die);
        int i3 = die.g;
        int i4 = die.d;
        if (i4 - i3 < 2) {
            i = (l() & 255) << 8;
            i2 = l() & 255;
        } else {
            byte[] bArr = die.e;
            byte b = bArr[i3];
            int i5 = i3 + 2;
            byte b2 = bArr[i3 + 1];
            f(D() - 2);
            if (i5 == i4) {
                this.c = die.e();
                dIC.e(die);
            } else {
                die.g = i5;
            }
            i = b2 & 255;
            i2 = (b & 255) << 8;
        }
        return (short) (i | i2);
    }

    @Override // o.InterfaceC7871dIn
    public int p() {
        int i;
        int i2;
        if (D() < 4) {
            throw new EOFException();
        }
        dIE die = this.c;
        C8632dsu.d(die);
        int i3 = die.g;
        int i4 = die.d;
        if (i4 - i3 < 4) {
            i = ((l() & 255) << 24) | ((l() & 255) << 16) | ((l() & 255) << 8);
            i2 = l() & 255;
        } else {
            byte[] bArr = die.e;
            byte b = bArr[i3];
            byte b2 = bArr[i3 + 1];
            byte b3 = bArr[i3 + 2];
            int i5 = i3 + 4;
            byte b4 = bArr[i3 + 3];
            f(D() - 4);
            if (i5 == i4) {
                this.c = die.e();
                dIC.e(die);
            } else {
                die.g = i5;
            }
            i = b4 & 255;
            i2 = ((b2 & 255) << 16) | ((b & 255) << 24) | ((b3 & 255) << 8);
        }
        return i | i2;
    }

    @Override // o.InterfaceC7871dIn
    public long y() {
        if (D() < 8) {
            throw new EOFException();
        }
        dIE die = this.c;
        C8632dsu.d(die);
        int i = die.g;
        int i2 = die.d;
        if (i2 - i < 8) {
            return ((p() & 4294967295L) << 32) | (4294967295L & p());
        }
        byte[] bArr = die.e;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        long j6 = bArr[i + 5];
        long j7 = bArr[i + 6];
        int i3 = i + 8;
        long j8 = bArr[i + 7];
        f(D() - 8);
        if (i3 == i2) {
            this.c = die.e();
            dIC.e(die);
        } else {
            die.g = i3;
        }
        return (j8 & 255) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3 A[EDGE_INSN: B:46:0x00b3->B:38:0x00b3 ?: BREAK  , SYNTHETIC] */
    @Override // o.InterfaceC7871dIn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long t() {
        /*
            r15 = this;
            long r0 = r15.D()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lc1
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        L11:
            o.dIE r7 = r15.c
            o.C8632dsu.d(r7)
            byte[] r8 = r7.e
            int r9 = r7.g
            int r10 = r7.d
        L1c:
            if (r9 >= r10) goto L9f
            r11 = r8[r9]
            r12 = 48
            byte r12 = (byte) r12
            if (r11 < r12) goto L6f
            r13 = 57
            byte r13 = (byte) r13
            if (r11 > r13) goto L6f
            int r12 = r12 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L42
            if (r13 != 0) goto L3c
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L3c
            goto L42
        L3c:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L7b
        L42:
            o.dIo r1 = new o.dIo
            r1.<init>()
            o.dIo r1 = r1.k(r3)
            o.dIo r1 = r1.c(r11)
            if (r0 != 0) goto L54
            r1.l()
        L54:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Number too large: "
            r0.append(r2)
            java.lang.String r1 = r1.v()
            r0.append(r1)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L6f:
            r12 = 45
            byte r12 = (byte) r12
            r13 = 1
            if (r11 != r12) goto L80
            if (r1 != 0) goto L80
            r11 = 1
            long r5 = r5 - r11
            r0 = r13
        L7b:
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L1c
        L80:
            if (r1 == 0) goto L84
            r2 = r13
            goto L9f
        L84:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9] or '-' character but was 0x"
            r0.append(r1)
            java.lang.String r1 = o.C7868dIi.d(r11)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r1.<init>(r0)
            throw r1
        L9f:
            if (r9 != r10) goto Lab
            o.dIE r8 = r7.e()
            r15.c = r8
            o.dIC.e(r7)
            goto Lad
        Lab:
            r7.g = r9
        Lad:
            if (r2 != 0) goto Lb3
            o.dIE r7 = r15.c
            if (r7 != 0) goto L11
        Lb3:
            long r5 = r15.D()
            long r1 = (long) r1
            long r5 = r5 - r1
            r15.f(r5)
            if (r0 == 0) goto Lbf
            goto Lc0
        Lbf:
            long r3 = -r3
        Lc0:
            return r3
        Lc1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7872dIo.t():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad A[EDGE_INSN: B:42:0x00ad->B:37:0x00ad ?: BREAK  , SYNTHETIC] */
    @Override // o.InterfaceC7871dIn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long s() {
        /*
            r14 = this;
            long r0 = r14.D()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb7
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            o.dIE r6 = r14.c
            o.C8632dsu.d(r6)
            byte[] r7 = r6.e
            int r8 = r6.g
            int r9 = r6.d
        L18:
            if (r8 >= r9) goto L99
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L42
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L34
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L34
            goto L3e
        L34:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7a
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7a
        L3e:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L42:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L52
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L52:
            o.dIo r0 = new o.dIo
            r0.<init>()
            o.dIo r0 = r0.l(r4)
            o.dIo r0 = r0.c(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r0 = r0.v()
            r1.append(r0)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L7a:
            if (r0 == 0) goto L7e
            r1 = 1
            goto L99
        L7e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = o.C7868dIi.d(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r1.<init>(r0)
            throw r1
        L99:
            if (r8 != r9) goto La5
            o.dIE r7 = r6.e()
            r14.c = r7
            o.dIC.e(r6)
            goto La7
        La5:
            r6.g = r8
        La7:
            if (r1 != 0) goto Lad
            o.dIE r6 = r14.c
            if (r6 != 0) goto Ld
        Lad:
            long r1 = r14.D()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f(r1)
            return r4
        Lb7:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7872dIo.s():long");
    }

    public ByteString r() {
        return c(D());
    }

    @Override // o.InterfaceC7871dIn
    public ByteString c(long j) {
        if (j < 0 || j > Integer.MAX_VALUE) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (D() >= j) {
            if (j >= 4096) {
                ByteString d2 = d((int) j);
                h(j);
                return d2;
            }
            return new ByteString(e(j));
        } else {
            throw new EOFException();
        }
    }

    @Override // o.InterfaceC7871dIn
    public int b(dIA dia) {
        C8632dsu.c((Object) dia, "");
        int e2 = dII.e(this, dia, false, 2, null);
        if (e2 == -1) {
            return -1;
        }
        h(dia.a()[e2].k());
        return e2;
    }

    @Override // o.InterfaceC7871dIn
    public void d(C7872dIo c7872dIo, long j) {
        C8632dsu.c((Object) c7872dIo, "");
        if (D() < j) {
            c7872dIo.a(this, D());
            throw new EOFException();
        } else {
            c7872dIo.a(this, j);
        }
    }

    @Override // o.InterfaceC7871dIn
    public String d(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        byte b = (byte) 10;
        long b2 = b(b, 0L, j2);
        if (b2 != -1) {
            return dII.a(this, b2);
        }
        if (j2 < D() && a(j2 - 1) == ((byte) 13) && a(j2) == b) {
            return dII.a(this, j2);
        }
        C7872dIo c7872dIo = new C7872dIo();
        a(c7872dIo, 0L, Math.min(32, D()));
        throw new EOFException("\\n not found: limit=" + Math.min(D(), j) + " content=" + c7872dIo.r().j() + (char) 8230);
    }

    public byte[] q() {
        return e(D());
    }

    @Override // o.InterfaceC7871dIn
    public byte[] e(long j) {
        if (j < 0 || j > Integer.MAX_VALUE) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (D() < j) {
            throw new EOFException();
        } else {
            byte[] bArr = new byte[(int) j];
            b(bArr);
            return bArr;
        }
    }

    @Override // o.InterfaceC7871dIn
    public void b(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        int i = 0;
        while (i < bArr.length) {
            int d2 = d(bArr, i, bArr.length - i);
            if (d2 == -1) {
                throw new EOFException();
            }
            i += d2;
        }
    }

    public int d(byte[] bArr, int i, int i2) {
        C8632dsu.c((Object) bArr, "");
        C7868dIi.a(bArr.length, i, i2);
        dIE die = this.c;
        if (die != null) {
            int min = Math.min(i2, die.d - die.g);
            byte[] bArr2 = die.e;
            int i3 = die.g;
            C8561dqd.b(bArr2, bArr, i, i3, i3 + min);
            die.g += min;
            f(D() - min);
            if (die.g == die.d) {
                this.c = die.e();
                dIC.e(die);
                return min;
            }
            return min;
        }
        return -1;
    }

    public final void d() {
        h(D());
    }

    @Override // o.InterfaceC7871dIn
    public void h(long j) {
        while (j > 0) {
            dIE die = this.c;
            if (die == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, die.d - die.g);
            long j2 = min;
            f(D() - j2);
            j -= j2;
            int i = die.g + min;
            die.g = i;
            if (i == die.d) {
                this.c = die.e();
                dIC.e(die);
            }
        }
    }

    @Override // o.dIq
    /* renamed from: c */
    public C7872dIo b(ByteString byteString) {
        C8632dsu.c((Object) byteString, "");
        byteString.b(this, 0, byteString.k());
        return this;
    }

    @Override // o.dIq
    /* renamed from: d */
    public C7872dIo c(String str, int i, int i2) {
        C8632dsu.c((Object) str, "");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        } else if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        } else {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    dIE b = b(1);
                    byte[] bArr = b.e;
                    int i3 = b.d - i;
                    int min = Math.min(i2, 8192 - i3);
                    bArr[i + i3] = (byte) charAt;
                    i++;
                    while (i < min) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i + i3] = (byte) charAt2;
                        i++;
                    }
                    int i4 = b.d;
                    int i5 = (i3 + i) - i4;
                    b.d = i4 + i5;
                    f(D() + i5);
                } else {
                    if (charAt < 2048) {
                        dIE b2 = b(2);
                        byte[] bArr2 = b2.e;
                        int i6 = b2.d;
                        bArr2[i6] = (byte) ((charAt >> 6) | 192);
                        bArr2[i6 + 1] = (byte) ((charAt & '?') | 128);
                        b2.d = i6 + 2;
                        f(D() + 2);
                    } else if (charAt < 55296 || charAt > 57343) {
                        dIE b3 = b(3);
                        byte[] bArr3 = b3.e;
                        int i7 = b3.d;
                        bArr3[i7] = (byte) ((charAt >> '\f') | 224);
                        bArr3[i7 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                        bArr3[i7 + 2] = (byte) ((charAt & '?') | 128);
                        b3.d = i7 + 3;
                        f(D() + 3);
                    } else {
                        int i8 = i + 1;
                        char charAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                        if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                            c(63);
                            i = i8;
                        } else {
                            int i9 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
                            dIE b4 = b(4);
                            byte[] bArr4 = b4.e;
                            int i10 = b4.d;
                            bArr4[i10] = (byte) ((i9 >> 18) | 240);
                            bArr4[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                            bArr4[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                            bArr4[i10 + 3] = (byte) ((i9 & 63) | 128);
                            b4.d = i10 + 4;
                            f(D() + 4);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        }
    }

    public C7872dIo g(int i) {
        if (i < 128) {
            c(i);
        } else if (i < 2048) {
            dIE b = b(2);
            byte[] bArr = b.e;
            int i2 = b.d;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            b.d = i2 + 2;
            f(D() + 2);
        } else if (55296 <= i && 57343 >= i) {
            c(63);
        } else if (i < 65536) {
            dIE b2 = b(3);
            byte[] bArr2 = b2.e;
            int i3 = b2.d;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            b2.d = i3 + 3;
            f(D() + 3);
        } else if (i <= 1114111) {
            dIE b3 = b(4);
            byte[] bArr3 = b3.e;
            int i4 = b3.d;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            b3.d = i4 + 4;
            f(D() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + C7868dIi.b(i));
        }
        return this;
    }

    @Override // o.dIq
    /* renamed from: c */
    public C7872dIo d(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        return e(bArr, 0, bArr.length);
    }

    @Override // o.dIq
    /* renamed from: a */
    public C7872dIo e(byte[] bArr, int i, int i2) {
        C8632dsu.c((Object) bArr, "");
        long j = i2;
        C7868dIi.a(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            dIE b = b(1);
            int min = Math.min(i3 - i, 8192 - b.d);
            int i4 = i + min;
            C8561dqd.b(bArr, b.e, b.d, i, i4);
            b.d += min;
            i = i4;
        }
        f(D() + j);
        return this;
    }

    public long b(dIJ dij) {
        C8632dsu.c((Object) dij, "");
        long j = 0;
        while (true) {
            long b = dij.b(this, 8192);
            if (b == -1) {
                return j;
            }
            j += b;
        }
    }

    @Override // o.dIq
    /* renamed from: a */
    public C7872dIo c(int i) {
        dIE b = b(1);
        byte[] bArr = b.e;
        int i2 = b.d;
        b.d = i2 + 1;
        bArr[i2] = (byte) i;
        f(D() + 1);
        return this;
    }

    @Override // o.dIq
    /* renamed from: j */
    public C7872dIo f(int i) {
        dIE b = b(2);
        byte[] bArr = b.e;
        int i2 = b.d;
        bArr[i2] = (byte) ((i >>> 8) & PrivateKeyType.INVALID);
        bArr[i2 + 1] = (byte) (i & PrivateKeyType.INVALID);
        b.d = i2 + 2;
        f(D() + 2);
        return this;
    }

    @Override // o.dIq
    /* renamed from: e */
    public C7872dIo h(int i) {
        dIE b = b(4);
        byte[] bArr = b.e;
        int i2 = b.d;
        bArr[i2] = (byte) ((i >>> 24) & PrivateKeyType.INVALID);
        bArr[i2 + 1] = (byte) ((i >>> 16) & PrivateKeyType.INVALID);
        bArr[i2 + 2] = (byte) ((i >>> 8) & PrivateKeyType.INVALID);
        bArr[i2 + 3] = (byte) (i & PrivateKeyType.INVALID);
        b.d = i2 + 4;
        f(D() + 4);
        return this;
    }

    public C7872dIo o(long j) {
        dIE b = b(8);
        byte[] bArr = b.e;
        int i = b.d;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        b.d = i + 8;
        f(D() + 8);
        return this;
    }

    @Override // o.dIq
    /* renamed from: i */
    public C7872dIo k(long j) {
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return c(48);
        }
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return b("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        int i2 = j < 100000000 ? j < 10000 ? j < 100 ? j < 10 ? 1 : 2 : j < 1000 ? 3 : 4 : j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8 : j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        if (z) {
            i2++;
        }
        dIE b = b(i2);
        byte[] bArr = b.e;
        int i3 = b.d + i2;
        while (j != 0) {
            long j2 = 10;
            i3--;
            bArr[i3] = dII.e()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        b.d += i2;
        f(D() + i2);
        return this;
    }

    @Override // o.dIq
    /* renamed from: n */
    public C7872dIo l(long j) {
        if (j == 0) {
            return c(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        dIE b = b(i);
        byte[] bArr = b.e;
        int i2 = b.d;
        long j13 = j;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = dII.e()[(int) (15 & j13)];
            j13 >>>= 4;
        }
        b.d += i;
        f(D() + i);
        return this;
    }

    public final dIE b(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        dIE die = this.c;
        if (die == null) {
            dIE c = dIC.c();
            this.c = c;
            c.i = c;
            c.c = c;
            return c;
        }
        C8632dsu.d(die);
        dIE die2 = die.i;
        C8632dsu.d(die2);
        return (die2.d + i > 8192 || !die2.b) ? die2.b(dIC.c()) : die2;
    }

    @Override // o.dIH
    public void a(C7872dIo c7872dIo, long j) {
        dIE die;
        dIE die2;
        C8632dsu.c((Object) c7872dIo, "");
        if (c7872dIo == this) {
            throw new IllegalArgumentException("source == this".toString());
        }
        C7868dIi.a(c7872dIo.D(), 0L, j);
        while (j > 0) {
            dIE die3 = c7872dIo.c;
            C8632dsu.d(die3);
            int i = die3.d;
            C8632dsu.d(c7872dIo.c);
            if (j < i - die.g) {
                dIE die4 = this.c;
                if (die4 != null) {
                    C8632dsu.d(die4);
                    die2 = die4.i;
                } else {
                    die2 = null;
                }
                if (die2 != null && die2.b) {
                    if ((die2.d + j) - (die2.j ? 0 : die2.g) <= 8192) {
                        dIE die5 = c7872dIo.c;
                        C8632dsu.d(die5);
                        die5.d(die2, (int) j);
                        c7872dIo.f(c7872dIo.D() - j);
                        f(D() + j);
                        return;
                    }
                }
                dIE die6 = c7872dIo.c;
                C8632dsu.d(die6);
                c7872dIo.c = die6.b((int) j);
            }
            dIE die7 = c7872dIo.c;
            C8632dsu.d(die7);
            long j2 = die7.d - die7.g;
            c7872dIo.c = die7.e();
            dIE die8 = this.c;
            if (die8 == null) {
                this.c = die7;
                die7.i = die7;
                die7.c = die7;
            } else {
                C8632dsu.d(die8);
                dIE die9 = die8.i;
                C8632dsu.d(die9);
                die9.b(die7).d();
            }
            c7872dIo.f(c7872dIo.D() - j2);
            f(D() + j2);
            j -= j2;
        }
    }

    @Override // o.dIJ
    public long b(C7872dIo c7872dIo, long j) {
        C8632dsu.c((Object) c7872dIo, "");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (D() == 0) {
            return -1L;
        } else {
            if (j > D()) {
                j = D();
            }
            c7872dIo.a(this, j);
            return j;
        }
    }

    public long b(byte b, long j, long j2) {
        dIE die;
        int i;
        long j3 = 0;
        if (0 > j || j2 < j) {
            throw new IllegalArgumentException(("size=" + D() + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        if (j2 > D()) {
            j2 = D();
        }
        if (j != j2 && (die = this.c) != null) {
            if (D() - j < j) {
                j3 = D();
                while (j3 > j) {
                    die = die.i;
                    C8632dsu.d(die);
                    j3 -= die.d - die.g;
                }
                while (j3 < j2) {
                    byte[] bArr = die.e;
                    int min = (int) Math.min(die.d, (die.g + j2) - j3);
                    i = (int) ((die.g + j) - j3);
                    while (i < min) {
                        if (bArr[i] == b) {
                            return (i - die.g) + j3;
                        }
                        i++;
                    }
                    j3 += die.d - die.g;
                    die = die.c;
                    C8632dsu.d(die);
                    j = j3;
                }
            } else {
                while (true) {
                    long j4 = (die.d - die.g) + j3;
                    if (j4 > j) {
                        break;
                    }
                    die = die.c;
                    C8632dsu.d(die);
                    j3 = j4;
                }
                while (j3 < j2) {
                    byte[] bArr2 = die.e;
                    int min2 = (int) Math.min(die.d, (die.g + j2) - j3);
                    i = (int) ((die.g + j) - j3);
                    while (i < min2) {
                        if (bArr2[i] == b) {
                            return (i - die.g) + j3;
                        }
                        i++;
                    }
                    j3 += die.d - die.g;
                    die = die.c;
                    C8632dsu.d(die);
                    j = j3;
                }
            }
        }
        return -1L;
    }

    public long c(ByteString byteString, long j) {
        int i;
        int i2;
        long j2 = j;
        C8632dsu.c((Object) byteString, "");
        if (byteString.k() > 0) {
            long j3 = 0;
            if (j2 < 0) {
                throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
            }
            dIE die = this.c;
            if (die != null) {
                if (D() - j2 >= j2) {
                    while (true) {
                        long j4 = (die.d - die.g) + j3;
                        if (j4 > j2) {
                            break;
                        }
                        die = die.c;
                        C8632dsu.d(die);
                        j3 = j4;
                    }
                    byte[] f = byteString.f();
                    byte b = f[0];
                    int k = byteString.k();
                    long D = (D() - k) + 1;
                    while (j3 < D) {
                        byte[] bArr = die.e;
                        int min = (int) Math.min(die.d, (die.g + D) - j3);
                        i = (int) ((die.g + j2) - j3);
                        while (i < min) {
                            if (bArr[i] == b && dII.c(die, i + 1, f, 1, k)) {
                                return (i - die.g) + j3;
                            }
                            i++;
                        }
                        j3 += die.d - die.g;
                        die = die.c;
                        C8632dsu.d(die);
                        j2 = j3;
                    }
                } else {
                    j3 = D();
                    while (j3 > j2) {
                        die = die.i;
                        C8632dsu.d(die);
                        j3 -= die.d - die.g;
                    }
                    byte[] f2 = byteString.f();
                    byte b2 = f2[0];
                    int k2 = byteString.k();
                    long D2 = (D() - k2) + 1;
                    while (j3 < D2) {
                        byte[] bArr2 = die.e;
                        int i3 = k2;
                        int min2 = (int) Math.min(die.d, (die.g + D2) - j3);
                        i = (int) ((die.g + j2) - j3);
                        while (i < min2) {
                            if (bArr2[i] == b2) {
                                i2 = i3;
                                if (dII.c(die, i + 1, f2, 1, i2)) {
                                    return (i - die.g) + j3;
                                }
                            } else {
                                i2 = i3;
                            }
                            i++;
                            i3 = i2;
                        }
                        k2 = i3;
                        j3 += die.d - die.g;
                        die = die.c;
                        C8632dsu.d(die);
                        j2 = j3;
                    }
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public long e(ByteString byteString, long j) {
        int i;
        int i2;
        C8632dsu.c((Object) byteString, "");
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
        }
        dIE die = this.c;
        if (die != null) {
            if (D() - j >= j) {
                while (true) {
                    long j3 = (die.d - die.g) + j2;
                    if (j3 > j) {
                        break;
                    }
                    die = die.c;
                    C8632dsu.d(die);
                    j2 = j3;
                }
                if (byteString.k() == 2) {
                    byte a = byteString.a(0);
                    byte a2 = byteString.a(1);
                    while (j2 < D()) {
                        byte[] bArr = die.e;
                        i = (int) ((die.g + j) - j2);
                        int i3 = die.d;
                        while (i < i3) {
                            byte b = bArr[i];
                            if (b != a && b != a2) {
                                i++;
                            }
                            i2 = die.g;
                        }
                        j2 += die.d - die.g;
                        die = die.c;
                        C8632dsu.d(die);
                        j = j2;
                    }
                } else {
                    byte[] f = byteString.f();
                    while (j2 < D()) {
                        byte[] bArr2 = die.e;
                        i = (int) ((die.g + j) - j2);
                        int i4 = die.d;
                        while (i < i4) {
                            byte b2 = bArr2[i];
                            for (byte b3 : f) {
                                if (b2 == b3) {
                                    i2 = die.g;
                                }
                            }
                            i++;
                        }
                        j2 += die.d - die.g;
                        die = die.c;
                        C8632dsu.d(die);
                        j = j2;
                    }
                }
            } else {
                j2 = D();
                while (j2 > j) {
                    die = die.i;
                    C8632dsu.d(die);
                    j2 -= die.d - die.g;
                }
                if (byteString.k() == 2) {
                    byte a3 = byteString.a(0);
                    byte a4 = byteString.a(1);
                    while (j2 < D()) {
                        byte[] bArr3 = die.e;
                        i = (int) ((die.g + j) - j2);
                        int i5 = die.d;
                        while (i < i5) {
                            byte b4 = bArr3[i];
                            if (b4 != a3 && b4 != a4) {
                                i++;
                            }
                            i2 = die.g;
                        }
                        j2 += die.d - die.g;
                        die = die.c;
                        C8632dsu.d(die);
                        j = j2;
                    }
                } else {
                    byte[] f2 = byteString.f();
                    while (j2 < D()) {
                        byte[] bArr4 = die.e;
                        i = (int) ((die.g + j) - j2);
                        int i6 = die.d;
                        while (i < i6) {
                            byte b5 = bArr4[i];
                            for (byte b6 : f2) {
                                if (b5 == b6) {
                                    i2 = die.g;
                                }
                            }
                            i++;
                        }
                        j2 += die.d - die.g;
                        die = die.c;
                        C8632dsu.d(die);
                        j = j2;
                    }
                }
            }
            return (i - i2) + j2;
        }
        return -1L;
    }

    public boolean b(long j, ByteString byteString, int i, int i2) {
        C8632dsu.c((Object) byteString, "");
        if (j < 0 || i < 0 || i2 < 0 || D() - j < i2 || byteString.k() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (a(i3 + j) != byteString.a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7872dIo) {
                C7872dIo c7872dIo = (C7872dIo) obj;
                if (D() == c7872dIo.D()) {
                    if (D() != 0) {
                        dIE die = this.c;
                        C8632dsu.d(die);
                        dIE die2 = c7872dIo.c;
                        C8632dsu.d(die2);
                        int i = die.g;
                        int i2 = die2.g;
                        long j = 0;
                        while (j < D()) {
                            long min = Math.min(die.d - i, die2.d - i2);
                            long j2 = 0;
                            while (j2 < min) {
                                if (die.e[i] == die2.e[i2]) {
                                    j2++;
                                    i++;
                                    i2++;
                                }
                            }
                            if (i == die.d) {
                                die = die.c;
                                C8632dsu.d(die);
                                i = die.g;
                            }
                            if (i2 == die2.d) {
                                die2 = die2.c;
                                C8632dsu.d(die2);
                                i2 = die2.g;
                            }
                            j += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        dIE die = this.c;
        if (die != null) {
            int i = 1;
            do {
                int i2 = die.d;
                for (int i3 = die.g; i3 < i2; i3++) {
                    i = (i * 31) + die.e[i3];
                }
                die = die.c;
                C8632dsu.d(die);
            } while (die != this.c);
            return i;
        }
        return 0;
    }

    public final C7872dIo g() {
        C7872dIo c7872dIo = new C7872dIo();
        if (D() != 0) {
            dIE die = this.c;
            C8632dsu.d(die);
            dIE b = die.b();
            c7872dIo.c = b;
            b.i = b;
            b.c = b;
            for (dIE die2 = die.c; die2 != die; die2 = die2.c) {
                dIE die3 = b.i;
                C8632dsu.d(die3);
                C8632dsu.d(die2);
                die3.b(die2.b());
            }
            c7872dIo.f(D());
        }
        return c7872dIo;
    }

    public final ByteString A() {
        if (D() > Integer.MAX_VALUE) {
            throw new IllegalStateException(("size > Int.MAX_VALUE: " + D()).toString());
        }
        return d((int) D());
    }

    public final ByteString d(int i) {
        if (i == 0) {
            return ByteString.e;
        }
        C7868dIi.a(D(), 0L, i);
        dIE die = this.c;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C8632dsu.d(die);
            int i5 = die.d;
            int i6 = die.g;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            die = die.c;
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        dIE die2 = this.c;
        int i7 = 0;
        while (i2 < i) {
            C8632dsu.d(die2);
            bArr[i7] = die2.e;
            i2 += die2.d - die2.g;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = die2.g;
            die2.j = true;
            i7++;
            die2 = die2.c;
        }
        return new SegmentedByteString(bArr, iArr);
    }
}
