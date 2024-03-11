package o;

import com.netflix.ale.AleCryptoBouncyCastle;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* renamed from: o.os  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9402os extends Writer {
    private OutputStream a;
    private final C9389of b;
    private byte[] c;
    private int d;
    private final int e;
    private int j;

    public C9402os(C9389of c9389of, OutputStream outputStream) {
        this.b = c9389of;
        this.a = outputStream;
        byte[] d = c9389of.d();
        this.c = d;
        this.e = d.length - 4;
        this.d = 0;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        OutputStream outputStream = this.a;
        if (outputStream != null) {
            int i = this.d;
            if (i > 0) {
                outputStream.write(this.c, 0, i);
                this.d = 0;
            }
            OutputStream outputStream2 = this.a;
            this.a = null;
            byte[] bArr = this.c;
            if (bArr != null) {
                this.c = null;
                this.b.a(bArr);
            }
            outputStream2.close();
            int i2 = this.j;
            this.j = 0;
            if (i2 > 0) {
                d(i2);
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        OutputStream outputStream = this.a;
        if (outputStream != null) {
            int i = this.d;
            if (i > 0) {
                outputStream.write(this.c, 0, i);
                this.d = 0;
            }
            this.a.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        int i3;
        if (i2 < 2) {
            if (i2 == 1) {
                write(cArr[i]);
                return;
            }
            return;
        }
        if (this.j > 0) {
            i2--;
            write(a(cArr[i]));
            i++;
        }
        int i4 = this.d;
        byte[] bArr = this.c;
        int i5 = this.e;
        int i6 = i2 + i;
        while (i < i6) {
            if (i4 >= i5) {
                this.a.write(bArr, 0, i4);
                i4 = 0;
            }
            int i7 = i + 1;
            char c = cArr[i];
            if (c < 128) {
                int i8 = i4 + 1;
                bArr[i4] = (byte) c;
                int i9 = i6 - i7;
                int i10 = i5 - i8;
                int i11 = i9 > i10 ? i10 : i9;
                i = i7;
                i4 = i8;
                while (i < i11 + i7) {
                    int i12 = i + 1;
                    c = cArr[i];
                    if (c >= 128) {
                        i7 = i12;
                    } else {
                        bArr[i4] = (byte) c;
                        i = i12;
                        i4++;
                    }
                }
                continue;
            }
            if (c < 2048) {
                bArr[i4] = (byte) ((c >> 6) | 192);
                i3 = i4 + 2;
                bArr[i4 + 1] = (byte) ((c & '?') | 128);
            } else if (c < 55296 || c > 57343) {
                bArr[i4] = (byte) ((c >> '\f') | 224);
                bArr[i4 + 1] = (byte) (((c >> 6) & 63) | 128);
                i3 = i4 + 3;
                bArr[i4 + 2] = (byte) ((c & '?') | 128);
            } else {
                if (c > 56319) {
                    this.d = i4;
                    d(c);
                }
                this.j = c;
                if (i7 >= i6) {
                    break;
                }
                i = i7 + 1;
                int a = a(cArr[i7]);
                if (a > 1114111) {
                    this.d = i4;
                    d(a);
                }
                bArr[i4] = (byte) ((a >> 18) | 240);
                bArr[i4 + 1] = (byte) (((a >> 12) & 63) | 128);
                bArr[i4 + 2] = (byte) (((a >> 6) & 63) | 128);
                bArr[i4 + 3] = (byte) ((a & 63) | 128);
                i4 += 4;
            }
            i4 = i3;
            i = i7;
        }
        this.d = i4;
    }

    @Override // java.io.Writer
    public void write(int i) {
        int i2;
        if (this.j > 0) {
            i = a(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i > 56319) {
                d(i);
            }
            this.j = i;
            return;
        }
        int i3 = this.d;
        if (i3 >= this.e) {
            this.a.write(this.c, 0, i3);
            this.d = 0;
        }
        if (i < 128) {
            byte[] bArr = this.c;
            int i4 = this.d;
            this.d = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        int i5 = this.d;
        if (i < 2048) {
            byte[] bArr2 = this.c;
            bArr2[i5] = (byte) ((i >> 6) | 192);
            i2 = i5 + 2;
            bArr2[i5 + 1] = (byte) ((i & 63) | 128);
        } else if (i <= 65535) {
            byte[] bArr3 = this.c;
            bArr3[i5] = (byte) ((i >> 12) | 224);
            bArr3[i5 + 1] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 3;
            bArr3[i5 + 2] = (byte) ((i & 63) | 128);
        } else {
            if (i > 1114111) {
                d(i);
            }
            byte[] bArr4 = this.c;
            bArr4[i5] = (byte) ((i >> 18) | 240);
            bArr4[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr4[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 4;
            bArr4[i5 + 3] = (byte) ((i & 63) | 128);
        }
        this.d = i2;
    }

    @Override // java.io.Writer
    public void write(String str) {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        int i3;
        if (i2 < 2) {
            if (i2 == 1) {
                write(str.charAt(i));
                return;
            }
            return;
        }
        if (this.j > 0) {
            i2--;
            write(a(str.charAt(i)));
            i++;
        }
        int i4 = this.d;
        byte[] bArr = this.c;
        int i5 = this.e;
        int i6 = i2 + i;
        while (i < i6) {
            if (i4 >= i5) {
                this.a.write(bArr, 0, i4);
                i4 = 0;
            }
            int i7 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < 128) {
                int i8 = i4 + 1;
                bArr[i4] = (byte) charAt;
                int i9 = i6 - i7;
                int i10 = i5 - i8;
                int i11 = i9 > i10 ? i10 : i9;
                i = i7;
                i4 = i8;
                while (i < i11 + i7) {
                    int i12 = i + 1;
                    charAt = str.charAt(i);
                    if (charAt >= 128) {
                        i7 = i12;
                    } else {
                        bArr[i4] = (byte) charAt;
                        i = i12;
                        i4++;
                    }
                }
                continue;
            }
            if (charAt < 2048) {
                bArr[i4] = (byte) ((charAt >> 6) | 192);
                i3 = i4 + 2;
                bArr[i4 + 1] = (byte) ((charAt & '?') | 128);
            } else if (charAt < 55296 || charAt > 57343) {
                bArr[i4] = (byte) ((charAt >> '\f') | 224);
                bArr[i4 + 1] = (byte) (((charAt >> 6) & 63) | 128);
                i3 = i4 + 3;
                bArr[i4 + 2] = (byte) ((charAt & '?') | 128);
            } else {
                if (charAt > 56319) {
                    this.d = i4;
                    d(charAt);
                }
                this.j = charAt;
                if (i7 >= i6) {
                    break;
                }
                i = i7 + 1;
                int a = a(str.charAt(i7));
                if (a > 1114111) {
                    this.d = i4;
                    d(a);
                }
                bArr[i4] = (byte) ((a >> 18) | 240);
                bArr[i4 + 1] = (byte) (((a >> 12) & 63) | 128);
                bArr[i4 + 2] = (byte) (((a >> 6) & 63) | 128);
                bArr[i4 + 3] = (byte) ((a & 63) | 128);
                i4 += 4;
            }
            i4 = i3;
            i = i7;
        }
        this.d = i4;
    }

    protected int a(int i) {
        int i2 = this.j;
        this.j = 0;
        if (i < 56320 || i > 57343) {
            throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i) + "; illegal combination");
        }
        return ((i2 - 55296) << 10) + AleCryptoBouncyCastle.MAX_RANDOM_BYTES + (i - 56320);
    }

    protected static void d(int i) {
        throw new IOException(b(i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String b(int i) {
        if (i > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 4627";
        } else if (i < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output";
        } else if (i <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i) + ")";
        } else {
            return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i) + ")";
        }
    }
}
