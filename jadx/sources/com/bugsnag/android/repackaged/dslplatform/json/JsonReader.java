package com.bugsnag.android.repackaged.dslplatform.json;

import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Formatter;
import o.AbstractC9271mT;
import o.InterfaceC9333nc;
import o.InterfaceC9338nh;
import o.InterfaceC9342nl;
import org.chromium.net.NetError;

/* loaded from: classes2.dex */
public final class JsonReader<TContext> {
    private static final EOFException h;
    private static final boolean[] j;
    private static final Charset k;
    private final InterfaceC9342nl B;
    private final InterfaceC9338nh C;
    private int D;
    public final TContext a;
    public char[] b;
    public byte[] c;
    public final DoublePrecision d;
    public final int e;
    protected final ErrorInfo f;
    public final UnknownNumberParsing g;
    public final int i;
    private int l;
    private long m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private final StringBuilder f13092o;
    private final InterfaceC9338nh p;
    private int q;
    private final Formatter r;
    private byte s;
    private final int t;
    private final char[] u;
    private InputStream v;
    private final int w;
    private final byte[] x;
    private int y;

    /* loaded from: classes2.dex */
    public enum ErrorInfo {
        WITH_STACK_TRACE,
        DESCRIPTION_AND_POSITION,
        DESCRIPTION_ONLY,
        MINIMAL
    }

    /* loaded from: classes2.dex */
    public enum UnknownNumberParsing {
        LONG_AND_BIGDECIMAL,
        LONG_AND_DOUBLE,
        BIGDECIMAL,
        DOUBLE
    }

    /* loaded from: classes2.dex */
    public interface a<T extends InterfaceC9333nc> {
        T b(JsonReader jsonReader);
    }

    /* loaded from: classes2.dex */
    public interface d<T> {
        T d(JsonReader jsonReader);
    }

    public final int a() {
        return this.n;
    }

    public final int b() {
        return this.D;
    }

    public final long b(int i) {
        return (this.m + this.n) - i;
    }

    public final byte i() {
        return this.s;
    }

    public final int j() {
        return this.q;
    }

    public final void m() {
        this.c = this.x;
        this.l = this.w;
        this.n = 0;
        this.q = 0;
        this.y = 0;
        this.v = null;
    }

    static {
        boolean[] zArr = new boolean[JSONzip.end];
        j = zArr;
        k = Charset.forName("UTF-8");
        zArr[137] = true;
        zArr[138] = true;
        zArr[139] = true;
        zArr[140] = true;
        zArr[141] = true;
        zArr[160] = true;
        zArr[32] = true;
        zArr[97] = true;
        zArr[98] = true;
        zArr[99] = true;
        h = new EmptyEOFException();
    }

    /* loaded from: classes2.dex */
    public enum DoublePrecision {
        EXACT(0),
        HIGH(1),
        DEFAULT(3),
        LOW(4);
        
        final int b;

        DoublePrecision(int i) {
            this.b = i;
        }
    }

    private JsonReader(char[] cArr, byte[] bArr, int i, TContext tcontext, InterfaceC9338nh interfaceC9338nh, InterfaceC9338nh interfaceC9338nh2, InterfaceC9342nl interfaceC9342nl, ErrorInfo errorInfo, DoublePrecision doublePrecision, UnknownNumberParsing unknownNumberParsing, int i2, int i3) {
        this.n = 0;
        this.m = 0L;
        this.s = (byte) 32;
        StringBuilder sb = new StringBuilder(0);
        this.f13092o = sb;
        this.r = new Formatter(sb);
        this.u = cArr;
        this.c = bArr;
        this.q = i;
        int length = bArr.length - 38;
        this.l = length;
        this.a = tcontext;
        this.b = cArr;
        this.p = interfaceC9338nh;
        this.C = interfaceC9338nh2;
        this.B = interfaceC9342nl;
        this.f = errorInfo;
        this.d = doublePrecision;
        this.g = unknownNumberParsing;
        this.i = i2;
        this.t = i3;
        this.e = doublePrecision.b + 15;
        this.x = bArr;
        this.w = length;
    }

    public JsonReader(byte[] bArr, int i, TContext tcontext, char[] cArr, InterfaceC9338nh interfaceC9338nh, InterfaceC9338nh interfaceC9338nh2, InterfaceC9342nl interfaceC9342nl, ErrorInfo errorInfo, DoublePrecision doublePrecision, UnknownNumberParsing unknownNumberParsing, int i2, int i3) {
        this(cArr, bArr, i, tcontext, interfaceC9338nh, interfaceC9338nh2, interfaceC9342nl, errorInfo, doublePrecision, unknownNumberParsing, i2, i3);
        if (cArr == null) {
            throw new IllegalArgumentException("tmp buffer provided as null.");
        }
        if (i > bArr.length) {
            throw new IllegalArgumentException("length can't be longer than buffer.length");
        }
        if (i < bArr.length) {
            bArr[i] = 0;
        }
    }

    public final JsonReader<TContext> c(InputStream inputStream) {
        this.m = 0L;
        this.n = 0;
        this.v = inputStream;
        if (inputStream != null) {
            int i = this.q;
            int i2 = this.l;
            if (i >= i2) {
                i = i2;
            }
            this.y = i;
            int c = c(this.c, inputStream, 0);
            int i3 = this.l;
            if (c < i3) {
                i3 = c;
            }
            this.y = i3;
            this.q = c;
        }
        return this;
    }

    public String toString() {
        return new String(this.c, 0, this.q, k);
    }

    private static int c(byte[] bArr, InputStream inputStream, int i) {
        int read;
        while (i < bArr.length && (read = inputStream.read(bArr, i, bArr.length - i)) != -1) {
            i += read;
        }
        return i;
    }

    /* loaded from: classes2.dex */
    static class EmptyEOFException extends EOFException {
        private EmptyEOFException() {
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            synchronized (this) {
            }
            return this;
        }
    }

    boolean s() {
        return this.f == ErrorInfo.WITH_STACK_TRACE;
    }

    public final byte g() {
        if (this.v != null && this.n > this.y) {
            w();
        }
        int i = this.n;
        if (i >= this.q) {
            throw ParsingException.c("Unexpected end of JSON input", h, s());
        }
        byte[] bArr = this.c;
        this.n = i + 1;
        byte b = bArr[i];
        this.s = b;
        return b;
    }

    private int w() {
        int i = this.q;
        int i2 = this.n;
        int i3 = i - i2;
        byte[] bArr = this.c;
        System.arraycopy(bArr, i2, bArr, 0, i3);
        int c = c(this.c, this.v, i3);
        long j2 = this.m;
        int i4 = this.n;
        this.m = j2 + i4;
        if (c == i3) {
            int i5 = this.q - i4;
            this.y = i5;
            this.q = i5;
        } else {
            int i6 = this.l;
            if (c < i6) {
                i6 = c;
            }
            this.y = i6;
            this.q = c;
        }
        this.n = 0;
        return c;
    }

    public final boolean c() {
        return this.v == null ? this.q == this.n : this.q == this.n && w() == 0;
    }

    private void e(int i, StringBuilder sb) {
        sb.append("at position: ");
        sb.append(b(i));
        int i2 = this.n;
        if (i2 > i) {
            try {
                int min = Math.min(i2 - i, 20);
                String str = new String(this.c, (this.n - i) - min, min, k);
                sb.append(", following: `");
                sb.append(str);
                sb.append('`');
            } catch (Exception unused) {
            }
        }
        int i3 = this.n;
        int i4 = this.y;
        if (i3 - i < i4) {
            try {
                String str2 = new String(this.c, this.n - i, Math.min((i4 - i3) + i, 20), k);
                sb.append(", before: `");
                sb.append(str2);
                sb.append('`');
            } catch (Exception unused2) {
            }
        }
    }

    public final ParsingException a(String str) {
        return b(str, 0);
    }

    public final ParsingException b(String str, int i) {
        if (this.f == ErrorInfo.MINIMAL) {
            return ParsingException.e(str, false);
        }
        this.f13092o.setLength(0);
        this.f13092o.append(str);
        this.f13092o.append(". Found ");
        this.f13092o.append((char) this.s);
        if (this.f == ErrorInfo.DESCRIPTION_ONLY) {
            return ParsingException.e(this.f13092o.toString(), false);
        }
        this.f13092o.append(" ");
        e(i, this.f13092o);
        return ParsingException.e(this.f13092o.toString(), s());
    }

    public final ParsingException e(String str, int i) {
        ErrorInfo errorInfo = this.f;
        if (errorInfo == ErrorInfo.MINIMAL || errorInfo == ErrorInfo.DESCRIPTION_ONLY) {
            return ParsingException.e(str, false);
        }
        this.f13092o.setLength(0);
        this.f13092o.append(str);
        this.f13092o.append(" ");
        e(i, this.f13092o);
        return ParsingException.e(this.f13092o.toString(), s());
    }

    public final ParsingException e(String str, int i, Exception exc) {
        if (exc == null) {
            throw new IllegalArgumentException("cause can't be null");
        }
        if (this.f == ErrorInfo.MINIMAL) {
            return ParsingException.c(str, exc, false);
        }
        this.f13092o.setLength(0);
        String message = exc.getMessage();
        if (message != null && message.length() > 0) {
            this.f13092o.append(message);
            if (!message.endsWith(".")) {
                this.f13092o.append(".");
            }
            this.f13092o.append(" ");
        }
        this.f13092o.append(str);
        if (this.f == ErrorInfo.DESCRIPTION_ONLY) {
            return ParsingException.c(this.f13092o.toString(), exc, false);
        }
        this.f13092o.append(" ");
        e(i, this.f13092o);
        return ParsingException.e(this.f13092o.toString(), s());
    }

    public final ParsingException a(String str, int i, String str2, Object... objArr) {
        if (this.f == ErrorInfo.MINIMAL) {
            return ParsingException.e(str, false);
        }
        this.f13092o.setLength(0);
        this.r.format(str2, objArr);
        if (this.f == ErrorInfo.DESCRIPTION_ONLY) {
            return ParsingException.e(this.f13092o.toString(), false);
        }
        this.f13092o.append(" ");
        e(i, this.f13092o);
        return ParsingException.e(this.f13092o.toString(), s());
    }

    public final ParsingException d(String str, Object obj) {
        return d(str, 0, "", str, obj, "");
    }

    public final ParsingException d(String str, int i, String str2, String str3, Object obj, String str4) {
        if (this.f == ErrorInfo.MINIMAL) {
            return ParsingException.e(str, false);
        }
        this.f13092o.setLength(0);
        this.f13092o.append(str2);
        this.f13092o.append(str3);
        if (obj != null) {
            this.f13092o.append(": '");
            this.f13092o.append(obj.toString());
            this.f13092o.append("'");
        }
        this.f13092o.append(str4);
        if (this.f == ErrorInfo.DESCRIPTION_ONLY) {
            return ParsingException.e(this.f13092o.toString(), false);
        }
        this.f13092o.append(" ");
        e(i, this.f13092o);
        return ParsingException.e(this.f13092o.toString(), s());
    }

    public final int t() {
        int i = this.n;
        this.D = i - 1;
        byte b = this.s;
        int i2 = 1;
        while (i < this.q && (b = this.c[i]) != 44 && b != 125 && b != 93) {
            i2++;
            i++;
        }
        this.n += i2 - 1;
        this.s = b;
        return this.D;
    }

    public final char[] a(int i, int i2) {
        char[] cArr;
        if (i2 <= this.i) {
            while (true) {
                cArr = this.b;
                if (cArr.length >= i2) {
                    break;
                }
                this.b = Arrays.copyOf(cArr, cArr.length * 2);
            }
            byte[] bArr = this.c;
            for (int i3 = 0; i3 < i2; i3++) {
                cArr[i3] = (char) bArr[i + i3];
            }
            return cArr;
        }
        throw d("Too many digits detected in number", i2, "", "Too many digits detected in number", Integer.valueOf(i2), "");
    }

    public final boolean e(int i, int i2) {
        byte[] bArr = this.c;
        while (i < i2) {
            if (!j[bArr[i] + 128]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public final String n() {
        char[] cArr;
        if (this.s == 34) {
            int i = this.n;
            int i2 = 0;
            while (true) {
                try {
                    cArr = this.u;
                    if (i2 >= cArr.length) {
                        break;
                    }
                    int i3 = i + 1;
                    byte b = this.c[i];
                    if (b == 34) {
                        i = i3;
                        break;
                    }
                    cArr[i2] = (char) b;
                    i2++;
                    i = i3;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw e("JSON string was not closed with a double quote", 0);
                }
            }
            if (i > this.q) {
                throw e("JSON string was not closed with a double quote", 0);
            }
            this.n = i;
            return new String(cArr, 0, i2);
        }
        throw a("Expecting '\"' for string start");
    }

    public final char[] l() {
        char[] cArr;
        if (this.s == 34) {
            int i = this.n;
            this.D = i;
            int i2 = 0;
            while (true) {
                try {
                    cArr = this.u;
                    if (i2 >= cArr.length) {
                        break;
                    }
                    int i3 = i + 1;
                    byte b = this.c[i];
                    if (b == 34) {
                        i = i3;
                        break;
                    }
                    cArr[i2] = (char) b;
                    i2++;
                    i = i3;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw e("JSON string was not closed with a double quote", 0);
                }
            }
            if (i <= this.q) {
                this.n = i;
                return cArr;
            }
            throw e("JSON string was not closed with a double quote", 0);
        }
        throw a("Expecting '\"' for string start");
    }

    public final String o() {
        int h2 = h();
        InterfaceC9338nh interfaceC9338nh = this.C;
        return interfaceC9338nh == null ? new String(this.b, 0, h2) : interfaceC9338nh.d(this.b, h2);
    }

    public final StringBuilder a(StringBuilder sb) {
        sb.append(this.b, 0, h());
        return sb;
    }

    public final StringBuffer c(StringBuffer stringBuffer) {
        stringBuffer.append(this.b, 0, h());
        return stringBuffer;
    }

    public final int h() {
        int d2;
        int d3;
        int i = this.n;
        if (this.s == 34) {
            int i2 = this.q;
            if (i == i2) {
                throw e("Premature end of JSON string", 0);
            }
            char[] cArr = this.b;
            int i3 = i2 - i;
            if (cArr.length < i3) {
                i3 = cArr.length;
            }
            int i4 = i;
            int i5 = 0;
            while (true) {
                if (i5 >= i3) {
                    break;
                }
                int i6 = i4 + 1;
                byte b = this.c[i4];
                if (b == 34) {
                    this.n = i6;
                    return i5;
                } else if ((b ^ 92) < 1) {
                    i4 = i6;
                    break;
                } else {
                    cArr[i5] = (char) b;
                    i5++;
                    i4 = i6;
                }
            }
            if (i5 == cArr.length) {
                char[] cArr2 = this.b;
                int length = cArr2.length * 2;
                int i7 = this.t;
                if (length > i7) {
                    throw d("Maximum string buffer limit exceeded", Integer.valueOf(i7));
                }
                cArr = Arrays.copyOf(cArr2, length);
                this.b = cArr;
            }
            int length2 = cArr.length;
            int i8 = i4 - 1;
            this.n = i8;
            int i9 = i8 - i;
            while (!c()) {
                int g = g();
                if (g == 34) {
                    return i9;
                }
                if (g == 92) {
                    if (i9 >= length2 - 6) {
                        char[] cArr3 = this.b;
                        int length3 = cArr3.length * 2;
                        int i10 = this.t;
                        if (length3 > i10) {
                            throw d("Maximum string buffer limit exceeded", Integer.valueOf(i10));
                        }
                        cArr = Arrays.copyOf(cArr3, length3);
                        this.b = cArr;
                        length2 = cArr.length;
                    }
                    byte[] bArr = this.c;
                    int i11 = this.n;
                    int i12 = i11 + 1;
                    this.n = i12;
                    byte b2 = bArr[i11];
                    if (b2 == 34 || b2 == 47 || b2 == 92) {
                        g = b2;
                    } else if (b2 == 98) {
                        g = 8;
                    } else if (b2 == 102) {
                        g = 12;
                    } else if (b2 == 110) {
                        g = 10;
                    } else if (b2 == 114) {
                        g = 13;
                    } else if (b2 == 116) {
                        g = 9;
                    } else if (b2 == 117) {
                        this.n = i11 + 2;
                        int d4 = d(bArr[i12]);
                        byte[] bArr2 = this.c;
                        int i13 = this.n;
                        this.n = i13 + 1;
                        int d5 = d(bArr2[i13]);
                        byte[] bArr3 = this.c;
                        int i14 = this.n;
                        this.n = i14 + 1;
                        d2 = (d4 << 12) + (d5 << 8) + (d(bArr3[i14]) << 4);
                        byte[] bArr4 = this.c;
                        int i15 = this.n;
                        this.n = i15 + 1;
                        d3 = d(bArr4[i15]);
                        g = d2 + d3;
                    } else {
                        throw d("Invalid escape combination detected", Integer.valueOf(b2));
                    }
                    cArr[i9] = (char) g;
                    i9++;
                } else {
                    if ((g & 128) != 0) {
                        if (i9 >= length2 - 4) {
                            char[] cArr4 = this.b;
                            int length4 = cArr4.length * 2;
                            int i16 = this.t;
                            if (length4 > i16) {
                                throw d("Maximum string buffer limit exceeded", Integer.valueOf(i16));
                            }
                            char[] copyOf = Arrays.copyOf(cArr4, length4);
                            this.b = copyOf;
                            cArr = copyOf;
                            length2 = copyOf.length;
                        }
                        byte[] bArr5 = this.c;
                        int i17 = this.n;
                        int i18 = i17 + 1;
                        this.n = i18;
                        byte b3 = bArr5[i17];
                        if ((g & 224) == 192) {
                            d2 = (g & 31) << 6;
                            d3 = b3 & 63;
                        } else {
                            int i19 = i17 + 2;
                            this.n = i19;
                            byte b4 = bArr5[i18];
                            if ((g & 240) == 224) {
                                d2 = ((g & 15) << 12) + ((b3 & 63) << 6);
                                d3 = b4 & 63;
                            } else {
                                this.n = i17 + 3;
                                byte b5 = bArr5[i19];
                                if ((g & 248) != 240) {
                                    throw e("Invalid unicode character detected", 0);
                                }
                                g = ((g & 7) << 18) + ((b3 & 63) << 12) + ((b4 & 63) << 6) + (b5 & 63);
                                if (g >= 65536) {
                                    if (g >= 1114112) {
                                        throw e("Invalid unicode character detected", 0);
                                    }
                                    int i20 = g - AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
                                    cArr[i9] = (char) ((i20 >>> 10) + 55296);
                                    cArr[i9 + 1] = (char) ((i20 & 1023) + 56320);
                                    i9 += 2;
                                }
                            }
                        }
                        g = d2 + d3;
                    } else if (i9 >= length2) {
                        char[] cArr5 = this.b;
                        int length5 = cArr5.length * 2;
                        int i21 = this.t;
                        if (length5 > i21) {
                            throw d("Maximum string buffer limit exceeded", Integer.valueOf(i21));
                        }
                        char[] copyOf2 = Arrays.copyOf(cArr5, length5);
                        this.b = copyOf2;
                        cArr = copyOf2;
                        length2 = copyOf2.length;
                    }
                    cArr[i9] = (char) g;
                    i9++;
                }
            }
            throw e("JSON string was not closed with a double quote", 0);
        }
        throw a("Expecting '\"' for string start");
    }

    private int d(byte b) {
        if (b < 48 || b > 57) {
            if (b < 65 || b > 70) {
                if (b < 97 || b > 102) {
                    throw d("Could not parse unicode escape, expected a hexadecimal digit", Byte.valueOf(b));
                }
                return b - 87;
            }
            return b - 55;
        }
        return b - 48;
    }

    private boolean u() {
        byte b = this.s;
        if (b != -96 && b != 32) {
            switch (b) {
                case NetError.ERR_H2_OR_QUIC_REQUIRED /* -31 */:
                    int i = this.n;
                    int i2 = i + 1;
                    if (i2 < this.q) {
                        byte[] bArr = this.c;
                        if (bArr[i] == -102 && bArr[i2] == Byte.MIN_VALUE) {
                            this.n = i + 2;
                            this.s = (byte) 32;
                            return true;
                        }
                    }
                    return false;
                case NetError.ERR_BLOCKED_BY_CSP /* -30 */:
                    int i3 = this.n;
                    int i4 = i3 + 1;
                    if (i4 < this.q) {
                        byte[] bArr2 = this.c;
                        byte b2 = bArr2[i3];
                        byte b3 = bArr2[i4];
                        if (b2 == -127 && b3 == -97) {
                            this.n = i3 + 2;
                            this.s = (byte) 32;
                            return true;
                        } else if (b2 != Byte.MIN_VALUE) {
                            return false;
                        } else {
                            if (b3 != -88 && b3 != -87 && b3 != -81) {
                                switch (b3) {
                                    case Byte.MIN_VALUE:
                                    case NetError.ERR_PROXY_AUTH_REQUESTED /* -127 */:
                                    case NetError.ERR_SSL_BAD_RECORD_MAC_ALERT /* -126 */:
                                    case NetError.ERR_SSL_DECOMPRESSION_FAILURE_ALERT /* -125 */:
                                    case NetError.ERR_WINSOCK_UNEXPECTED_WRITTEN_BYTES /* -124 */:
                                    case NetError.ERR_SSL_NO_RENEGOTIATION /* -123 */:
                                    case NetError.ERR_ALPN_NEGOTIATION_FAILED /* -122 */:
                                    case NetError.ERR_SOCKS_CONNECTION_HOST_UNREACHABLE /* -121 */:
                                    case NetError.ERR_SOCKS_CONNECTION_FAILED /* -120 */:
                                    case NetError.ERR_HOST_RESOLVER_QUEUE_TOO_LARGE /* -119 */:
                                    case NetError.ERR_CONNECTION_TIMED_OUT /* -118 */:
                                        break;
                                    default:
                                        return false;
                                }
                            }
                            this.n = i3 + 2;
                            this.s = (byte) 32;
                            return true;
                        }
                    }
                    return false;
                case NetError.ERR_CLEARTEXT_NOT_PERMITTED /* -29 */:
                    int i5 = this.n;
                    int i6 = i5 + 1;
                    if (i6 < this.q) {
                        byte[] bArr3 = this.c;
                        if (bArr3[i5] == Byte.MIN_VALUE && bArr3[i6] == Byte.MIN_VALUE) {
                            this.n = i5 + 2;
                            this.s = (byte) 32;
                            return true;
                        }
                    }
                    return false;
                default:
                    switch (b) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    public final byte d() {
        g();
        if (j[this.s + 128]) {
            while (u()) {
                g();
            }
        }
        return this.s;
    }

    public final byte[] f() {
        if (this.v != null && AbstractC9271mT.e(this.c, this.n) == this.c.length) {
            int h2 = h();
            byte[] bArr = new byte[h2];
            for (int i = 0; i < h2; i++) {
                bArr[i] = (byte) this.b[i];
            }
            return AbstractC9271mT.e(bArr, 0, h2);
        } else if (this.s != 34) {
            throw a("Expecting '\"' for base64 start");
        } else {
            int i2 = this.n;
            int e = AbstractC9271mT.e(this.c, i2);
            byte[] bArr2 = this.c;
            this.n = e + 1;
            byte b = bArr2[e];
            this.s = b;
            if (b != 34) {
                throw a("Expecting '\"' for base64 end");
            }
            return AbstractC9271mT.e(bArr2, i2, e);
        }
    }

    public final String k() {
        int h2 = h();
        InterfaceC9338nh interfaceC9338nh = this.p;
        String d2 = interfaceC9338nh != null ? interfaceC9338nh.d(this.b, h2) : new String(this.b, 0, h2);
        if (d() != 58) {
            throw a("Expecting ':' after attribute name");
        }
        d();
        return d2;
    }

    public final boolean q() {
        if (this.s == 110) {
            int i = this.n;
            int i2 = i + 2;
            if (i2 < this.q) {
                byte[] bArr = this.c;
                if (bArr[i] == 117 && bArr[i + 1] == 108 && bArr[i2] == 108) {
                    this.n = i + 3;
                    this.s = (byte) 108;
                    return true;
                }
            }
            throw e("Invalid null constant found", 0);
        }
        return false;
    }

    public final boolean p() {
        if (this.s == 116) {
            int i = this.n;
            int i2 = i + 2;
            if (i2 < this.q) {
                byte[] bArr = this.c;
                if (bArr[i] == 114 && bArr[i + 1] == 117 && bArr[i2] == 101) {
                    this.n = i + 3;
                    this.s = (byte) 101;
                    return true;
                }
            }
            throw e("Invalid true constant found", 0);
        }
        return false;
    }

    public final boolean r() {
        if (this.s == 102) {
            int i = this.n;
            int i2 = i + 3;
            if (i2 < this.q) {
                byte[] bArr = this.c;
                if (bArr[i] == 97 && bArr[i + 1] == 108 && bArr[i + 2] == 115 && bArr[i2] == 101) {
                    this.n = i + 4;
                    this.s = (byte) 101;
                    return true;
                }
            }
            throw e("Invalid false constant found", 0);
        }
        return false;
    }

    public final void e() {
        if (this.s != 93) {
            if (this.n >= this.q) {
                throw e("Unexpected end of JSON in collection", 0, h);
            }
            throw a("Expecting ']' as array end");
        }
    }

    public final <T, S extends T> ArrayList<T> e(d<S> dVar) {
        ArrayList<T> arrayList = new ArrayList<>(4);
        a(dVar, arrayList);
        return arrayList;
    }

    public final <T, S extends T> void a(d<S> dVar, Collection<T> collection) {
        if (q()) {
            collection.add(null);
        } else {
            collection.add(dVar.d(this));
        }
        while (d() == 44) {
            d();
            if (q()) {
                collection.add(null);
            } else {
                collection.add(dVar.d(this));
            }
        }
        e();
    }

    public final <T extends InterfaceC9333nc> ArrayList<T> b(a<T> aVar) {
        ArrayList<T> arrayList = new ArrayList<>(4);
        a(aVar, arrayList);
        return arrayList;
    }

    public final <T extends InterfaceC9333nc> void a(a<T> aVar, Collection<T> collection) {
        if (this.s == 123) {
            d();
            collection.add(aVar.b(this));
        } else if (q()) {
            collection.add(null);
        } else {
            throw a("Expecting '{' as collection start");
        }
        while (d() == 44) {
            if (d() == 123) {
                d();
                collection.add(aVar.b(this));
            } else if (q()) {
                collection.add(null);
            } else {
                throw a("Expecting '{' as object start within a collection");
            }
        }
        e();
    }
}
