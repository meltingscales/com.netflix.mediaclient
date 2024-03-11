package o;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* renamed from: o.or  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9401or extends Reader {
    protected byte[] a;
    protected int b;
    protected final C9389of c;
    protected int d;
    protected final boolean e;
    protected int f;
    protected int g;
    protected InputStream h;
    protected char i = 0;
    protected final boolean j;
    protected char[] k;

    public C9401or(C9389of c9389of, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        this.c = c9389of;
        this.h = inputStream;
        this.a = bArr;
        this.f = i;
        this.g = i2;
        this.e = z;
        this.j = inputStream != null;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.h;
        if (inputStream != null) {
            this.h = null;
            e();
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public int read() {
        if (this.k == null) {
            this.k = new char[1];
        }
        if (read(this.k, 0, 1) < 1) {
            return -1;
        }
        return this.k[0];
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.a == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || i + i2 > cArr.length) {
            e(cArr, i, i2);
        }
        int i6 = i2 + i;
        char c = this.i;
        if (c != 0) {
            i3 = i + 1;
            cArr[i] = c;
            this.i = (char) 0;
        } else {
            int i7 = this.g - this.f;
            if (i7 < 4 && !b(i7)) {
                if (i7 == 0) {
                    return -1;
                }
                e(this.g - this.f, 4);
            }
            i3 = i;
        }
        int i8 = this.g;
        while (true) {
            if (i3 >= i6) {
                break;
            }
            int i9 = this.f;
            if (i9 > i8 - 4) {
                break;
            }
            if (this.e) {
                byte[] bArr = this.a;
                i4 = (bArr[i9] << 8) | (bArr[i9 + 1] & 255);
                i5 = (bArr[i9 + 3] & 255) | ((bArr[i9 + 2] & 255) << 8);
            } else {
                byte[] bArr2 = this.a;
                int i10 = (bArr2[i9] & 255) | ((bArr2[i9 + 1] & 255) << 8);
                i4 = (bArr2[i9 + 3] << 8) | (bArr2[i9 + 2] & 255);
                i5 = i10;
            }
            this.f = i9 + 4;
            if (i4 != 0) {
                int i11 = 65535 & i4;
                int i12 = i5 | ((i11 - 1) << 16);
                if (i11 > 16) {
                    b(i12, i3 - i, String.format(" (above 0x%08x)", 1114111));
                }
                int i13 = i3 + 1;
                cArr[i3] = (char) ((i12 >> 10) + 55296);
                if (i13 >= i6) {
                    this.i = (char) i12;
                    i3 = i13;
                    break;
                }
                i5 = 56320 | (i12 & 1023);
                i3 = i13;
            }
            cArr[i3] = (char) i5;
            i3++;
        }
        int i14 = i3 - i;
        this.b += i14;
        return i14;
    }

    private void e(int i, int i2) {
        int i3 = this.d;
        int i4 = this.b;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i + ", needed " + i2 + ", at char #" + i4 + ", byte #" + (i3 + i) + ")");
    }

    private void b(int i, int i2, String str) {
        int i3 = this.d;
        int i4 = this.f;
        int i5 = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid UTF-32 character 0x");
        sb.append(Integer.toHexString(i));
        sb.append(str);
        sb.append(" at char #");
        sb.append(i5 + i2);
        sb.append(", byte #");
        sb.append((i3 + i4) - 1);
        sb.append(")");
        throw new CharConversionException(sb.toString());
    }

    private boolean b(int i) {
        byte[] bArr;
        InputStream inputStream = this.h;
        if (inputStream == null || (bArr = this.a) == null) {
            return false;
        }
        this.d += this.g - i;
        if (i > 0) {
            int i2 = this.f;
            if (i2 > 0) {
                System.arraycopy(bArr, i2, bArr, 0, i);
                this.f = 0;
            }
            this.g = i;
        } else {
            this.f = 0;
            int read = inputStream.read(bArr);
            if (read < 1) {
                this.g = 0;
                if (read < 0) {
                    if (this.j) {
                        e();
                    }
                    return false;
                }
                a();
            }
            this.g = read;
        }
        while (true) {
            int i3 = this.g;
            if (i3 >= 4) {
                return true;
            }
            InputStream inputStream2 = this.h;
            byte[] bArr2 = this.a;
            int read2 = inputStream2.read(bArr2, i3, bArr2.length - i3);
            if (read2 < 1) {
                if (read2 < 0) {
                    if (this.j) {
                        e();
                    }
                    e(this.g, 4);
                }
                a();
            }
            this.g += read2;
        }
    }

    private void e() {
        byte[] bArr = this.a;
        if (bArr != null) {
            this.a = null;
            C9389of c9389of = this.c;
            if (c9389of != null) {
                c9389of.c(bArr);
            }
        }
    }

    private void e(char[] cArr, int i, int i2) {
        throw new ArrayIndexOutOfBoundsException(String.format("read(buf,%d,%d), cbuf[%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(cArr.length)));
    }

    private void a() {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }
}
