package o;

import com.bugsnag.android.repackaged.dslplatform.json.SerializationException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import o.AbstractC9334nd;
import org.chromium.net.ConnectionSubtype;

/* renamed from: o.ng  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9337ng {
    private static final Charset e = Charset.forName("UTF-8");
    private final AbstractC9334nd.e a;
    private byte[] b;
    private long c;
    private int d;
    private OutputStream i;
    private final InterfaceC9344nn j;

    /* renamed from: o.ng$a */
    /* loaded from: classes2.dex */
    public interface a<T> {
        void b(C9337ng c9337ng, T t);
    }

    public final int a() {
        return this.d;
    }

    public final void c(OutputStream outputStream) {
        this.d = 0;
        this.i = outputStream;
        this.c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(int i) {
        this.d += i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] b(int i) {
        int i2 = this.d;
        if (i2 + i >= this.b.length) {
            e(i2, i);
        }
        return this.b;
    }

    @Deprecated
    public C9337ng() {
        this(512, (InterfaceC9344nn) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9337ng(int i, InterfaceC9344nn interfaceC9344nn) {
        this(new byte[i], interfaceC9344nn);
    }

    C9337ng(byte[] bArr, InterfaceC9344nn interfaceC9344nn) {
        this.a = new AbstractC9334nd.e();
        this.b = bArr;
        this.j = interfaceC9344nn;
    }

    private void e(int i, int i2) {
        OutputStream outputStream = this.i;
        if (outputStream != null) {
            try {
                outputStream.write(this.b, 0, i);
                this.d = 0;
                this.c += i;
                byte[] bArr = this.b;
                if (i2 > bArr.length) {
                    this.b = Arrays.copyOf(bArr, bArr.length + (bArr.length / 2) + i2);
                    return;
                }
                return;
            } catch (IOException e2) {
                throw new SerializationException("Unable to write to target stream.", e2);
            }
        }
        byte[] bArr2 = this.b;
        this.b = Arrays.copyOf(bArr2, bArr2.length + (bArr2.length / 2) + i2);
    }

    public final void b() {
        int i = this.d;
        if (i + 4 >= this.b.length) {
            e(i, 0);
        }
        int i2 = this.d;
        byte[] bArr = this.b;
        bArr[i2] = 110;
        bArr[i2 + 1] = 117;
        bArr[i2 + 2] = 108;
        bArr[i2 + 3] = 108;
        this.d = i2 + 4;
    }

    public final void b(byte b) {
        int i = this.d;
        if (i == this.b.length) {
            e(i, 0);
        }
        byte[] bArr = this.b;
        int i2 = this.d;
        this.d = i2 + 1;
        bArr[i2] = b;
    }

    public final void a(String str) {
        int length = str.length();
        int i = this.d;
        int i2 = length << 2;
        int i3 = length << 1;
        if (i + i2 + i3 + 2 >= this.b.length) {
            e(i, i2 + i3 + 2);
        }
        byte[] bArr = this.b;
        int i4 = this.d;
        bArr[i4] = 34;
        int i5 = i4 + 1;
        int i6 = 0;
        while (i6 < length) {
            char charAt = str.charAt(i6);
            if (charAt > 31 && charAt != '\"' && charAt != '\\' && charAt < '~') {
                bArr[i5] = (byte) charAt;
                i6++;
                i5++;
            } else {
                e(str, i6, i5, length);
                return;
            }
        }
        bArr[i5] = 34;
        this.d = i5 + 1;
    }

    public final void d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = this.d;
        int i2 = length << 2;
        int i3 = length << 1;
        if (i + i2 + i3 + 2 >= this.b.length) {
            e(i, i2 + i3 + 2);
        }
        byte[] bArr = this.b;
        int i4 = this.d;
        bArr[i4] = 34;
        int i5 = i4 + 1;
        int i6 = 0;
        while (i6 < length) {
            char charAt = charSequence.charAt(i6);
            if (charAt > 31 && charAt != '\"' && charAt != '\\' && charAt < '~') {
                bArr[i5] = (byte) charAt;
                i6++;
                i5++;
            } else {
                e(charSequence, i6, i5, length);
                return;
            }
        }
        bArr[i5] = 34;
        this.d = i5 + 1;
    }

    private void e(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        byte[] bArr = this.b;
        int i5 = i;
        int i6 = i2;
        while (i5 < i3) {
            char charAt = charSequence.charAt(i5);
            if (charAt == '\"') {
                bArr[i6] = 92;
                bArr[i6 + 1] = 34;
                i6 += 2;
            } else {
                if (charAt == '\\') {
                    bArr[i6] = 92;
                    i4 = i6 + 2;
                    bArr[i6 + 1] = 92;
                } else if (charAt >= ' ') {
                    if (charAt < 127) {
                        bArr[i6] = (byte) charAt;
                    } else {
                        int codePointAt = Character.codePointAt(charSequence, i5);
                        if (Character.isSupplementaryCodePoint(codePointAt)) {
                            i5++;
                        }
                        if (codePointAt == 127) {
                            bArr[i6] = (byte) codePointAt;
                        } else if (codePointAt <= 2047) {
                            bArr[i6] = (byte) (((codePointAt >> 6) & 31) | 192);
                            i4 = i6 + 2;
                            bArr[i6 + 1] = (byte) ((codePointAt & 63) | 128);
                        } else if (codePointAt < 55296 || (codePointAt > 57343 && codePointAt <= 65535)) {
                            bArr[i6] = (byte) (((codePointAt >> 12) & 15) | 224);
                            bArr[i6 + 1] = (byte) (((codePointAt >> 6) & 63) | 128);
                            i4 = i6 + 3;
                            bArr[i6 + 2] = (byte) ((codePointAt & 63) | 128);
                        } else if (codePointAt >= 65536 && codePointAt <= 1114111) {
                            bArr[i6] = (byte) (((codePointAt >> 18) & 7) | 240);
                            bArr[i6 + 1] = (byte) (((codePointAt >> 12) & 63) | 128);
                            bArr[i6 + 2] = (byte) (((codePointAt >> 6) & 63) | 128);
                            i4 = i6 + 4;
                            bArr[i6 + 3] = (byte) ((codePointAt & 63) | 128);
                        } else {
                            throw new SerializationException("Unknown unicode codepoint in string! " + Integer.toHexString(codePointAt));
                        }
                    }
                    i6++;
                } else if (charAt == '\b') {
                    bArr[i6] = 92;
                    i4 = i6 + 2;
                    bArr[i6 + 1] = 98;
                } else if (charAt == '\t') {
                    bArr[i6] = 92;
                    i4 = i6 + 2;
                    bArr[i6 + 1] = 116;
                } else if (charAt == '\n') {
                    bArr[i6] = 92;
                    i4 = i6 + 2;
                    bArr[i6 + 1] = 110;
                } else if (charAt == '\f') {
                    bArr[i6] = 92;
                    i4 = i6 + 2;
                    bArr[i6 + 1] = 102;
                } else if (charAt == '\r') {
                    bArr[i6] = 92;
                    i4 = i6 + 2;
                    bArr[i6 + 1] = 114;
                } else {
                    bArr[i6] = 92;
                    bArr[i6 + 1] = 117;
                    bArr[i6 + 2] = 48;
                    bArr[i6 + 3] = 48;
                    switch (charAt) {
                        case 0:
                            bArr[i6 + 4] = 48;
                            bArr[i6 + 5] = 48;
                            break;
                        case 1:
                            bArr[i6 + 4] = 48;
                            bArr[i6 + 5] = 49;
                            break;
                        case 2:
                            bArr[i6 + 4] = 48;
                            bArr[i6 + 5] = 50;
                            break;
                        case 3:
                            bArr[i6 + 4] = 48;
                            bArr[i6 + 5] = 51;
                            break;
                        case 4:
                            bArr[i6 + 4] = 48;
                            bArr[i6 + 5] = 52;
                            break;
                        case 5:
                            bArr[i6 + 4] = 48;
                            bArr[i6 + 5] = 53;
                            break;
                        case 6:
                            bArr[i6 + 4] = 48;
                            bArr[i6 + 5] = 54;
                            break;
                        case 7:
                            bArr[i6 + 4] = 48;
                            bArr[i6 + 5] = 55;
                            break;
                        case '\b':
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                        default:
                            bArr[i6 + 4] = 49;
                            bArr[i6 + 5] = 70;
                            break;
                        case 11:
                            bArr[i6 + 4] = 48;
                            bArr[i6 + 5] = 66;
                            break;
                        case 14:
                            bArr[i6 + 4] = 48;
                            bArr[i6 + 5] = 69;
                            break;
                        case 15:
                            bArr[i6 + 4] = 48;
                            bArr[i6 + 5] = 70;
                            break;
                        case 16:
                            bArr[i6 + 4] = 49;
                            bArr[i6 + 5] = 48;
                            break;
                        case 17:
                            bArr[i6 + 4] = 49;
                            bArr[i6 + 5] = 49;
                            break;
                        case 18:
                            bArr[i6 + 4] = 49;
                            bArr[i6 + 5] = 50;
                            break;
                        case 19:
                            bArr[i6 + 4] = 49;
                            bArr[i6 + 5] = 51;
                            break;
                        case 20:
                            bArr[i6 + 4] = 49;
                            bArr[i6 + 5] = 52;
                            break;
                        case 21:
                            bArr[i6 + 4] = 49;
                            bArr[i6 + 5] = 53;
                            break;
                        case 22:
                            bArr[i6 + 4] = 49;
                            bArr[i6 + 5] = 54;
                            break;
                        case 23:
                            bArr[i6 + 4] = 49;
                            bArr[i6 + 5] = 55;
                            break;
                        case 24:
                            bArr[i6 + 4] = 49;
                            bArr[i6 + 5] = 56;
                            break;
                        case 25:
                            bArr[i6 + 4] = 49;
                            bArr[i6 + 5] = 57;
                            break;
                        case 26:
                            bArr[i6 + 4] = 49;
                            bArr[i6 + 5] = 65;
                            break;
                        case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                            bArr[i6 + 4] = 49;
                            bArr[i6 + 5] = 66;
                            break;
                        case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                            bArr[i6 + 4] = 49;
                            bArr[i6 + 5] = 67;
                            break;
                        case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                            bArr[i6 + 4] = 49;
                            bArr[i6 + 5] = 68;
                            break;
                        case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                            bArr[i6 + 4] = 49;
                            bArr[i6 + 5] = 69;
                            break;
                    }
                    i6 += 6;
                }
                i6 = i4;
            }
            i5++;
        }
        bArr[i6] = 34;
        this.d = i6 + 1;
    }

    public final void c(String str) {
        int length = str.length();
        int i = this.d;
        if (i + length >= this.b.length) {
            e(i, length);
        }
        str.getBytes(0, length, this.b, this.d);
        this.d += length;
    }

    public final void e(byte[] bArr) {
        int length = bArr.length;
        int i = this.d;
        if (i + length >= this.b.length) {
            e(i, length);
        }
        int i2 = this.d;
        byte[] bArr2 = this.b;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            bArr2[i2 + i3] = bArr[i3];
        }
        this.d += length;
    }

    public final void d(byte[] bArr) {
        int i = this.d;
        if ((bArr.length << 1) + i + 2 >= this.b.length) {
            e(i, (bArr.length << 1) + 2);
        }
        byte[] bArr2 = this.b;
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        bArr2[i2] = 34;
        int d = i3 + AbstractC9271mT.d(bArr, bArr2, i3);
        byte[] bArr3 = this.b;
        this.d = d + 1;
        bArr3[d] = 34;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(double d) {
        if (d == Double.POSITIVE_INFINITY) {
            c("\"Infinity\"");
        } else if (d == Double.NEGATIVE_INFINITY) {
            c("\"-Infinity\"");
        } else if (d != d) {
            c("\"NaN\"");
        } else if (d == 0.0d) {
            c("0.0");
        } else if (AbstractC9334nd.a(d, this.a)) {
            int i = this.d;
            if (i + 24 >= this.b.length) {
                e(i, 24);
            }
            this.d += this.a.c(this.b, this.d);
        } else {
            c(Double.toString(d));
        }
    }

    public String toString() {
        return new String(this.b, 0, this.d, e);
    }

    public final void d() {
        int i;
        OutputStream outputStream = this.i;
        if (outputStream == null || (i = this.d) == 0) {
            return;
        }
        try {
            outputStream.write(this.b, 0, i);
            this.c += this.d;
            this.d = 0;
        } catch (IOException e2) {
            throw new SerializationException("Unable to write to target stream.", e2);
        }
    }

    public <T> void d(T[] tArr, a<T> aVar) {
        if (tArr == null) {
            b();
            return;
        }
        b((byte) 91);
        if (tArr.length != 0) {
            T t = tArr[0];
            if (t != null) {
                aVar.b(this, t);
            } else {
                b();
            }
            for (int i = 1; i < tArr.length; i++) {
                b((byte) 44);
                T t2 = tArr[i];
                if (t2 != null) {
                    aVar.b(this, t2);
                } else {
                    b();
                }
            }
        }
        b((byte) 93);
    }

    public <T> void d(Collection<T> collection, a<T> aVar) {
        if (collection == null) {
            b();
            return;
        }
        b((byte) 91);
        if (!collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            T next = it.next();
            if (next != null) {
                aVar.b(this, next);
            } else {
                b();
            }
            while (it.hasNext()) {
                b((byte) 44);
                T next2 = it.next();
                if (next2 != null) {
                    aVar.b(this, next2);
                } else {
                    b();
                }
            }
        }
        b((byte) 93);
    }
}
