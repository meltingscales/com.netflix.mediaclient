package com.fasterxml.jackson.core;

import java.io.Serializable;
import java.util.Arrays;
import o.C9322nR;
import o.C9439pc;

/* loaded from: classes2.dex */
public final class Base64Variant implements Serializable {
    private static final long serialVersionUID = 1;
    private final int a;
    public final String b;
    private final transient char[] c;
    private final transient int[] d;
    private final transient byte[] e;
    private final boolean g;
    private final char h;
    private final PaddingReadBehaviour i;

    /* loaded from: classes2.dex */
    public enum PaddingReadBehaviour {
        PADDING_FORBIDDEN,
        PADDING_REQUIRED,
        PADDING_ALLOWED
    }

    public boolean b(int i) {
        return i == this.h;
    }

    public int d() {
        return this.a;
    }

    public String e() {
        return this.b;
    }

    public boolean e(char c) {
        return c == this.h;
    }

    public boolean h() {
        return this.g;
    }

    public char j() {
        return this.h;
    }

    public String toString() {
        return this.b;
    }

    public Base64Variant(String str, String str2, boolean z, char c, int i) {
        int[] iArr = new int[128];
        this.d = iArr;
        char[] cArr = new char[64];
        this.c = cArr;
        this.e = new byte[64];
        this.b = str;
        this.g = z;
        this.h = c;
        this.a = i;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < length; i2++) {
            char c2 = this.c[i2];
            this.e[i2] = (byte) c2;
            this.d[c2] = i2;
        }
        if (z) {
            this.d[c] = -2;
        }
        this.i = z ? PaddingReadBehaviour.PADDING_REQUIRED : PaddingReadBehaviour.PADDING_FORBIDDEN;
    }

    public Base64Variant(Base64Variant base64Variant, String str, int i) {
        this(base64Variant, str, base64Variant.g, base64Variant.h, i);
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z, char c, int i) {
        this(base64Variant, str, z, c, base64Variant.i, i);
    }

    private Base64Variant(Base64Variant base64Variant, String str, boolean z, char c, PaddingReadBehaviour paddingReadBehaviour, int i) {
        int[] iArr = new int[128];
        this.d = iArr;
        char[] cArr = new char[64];
        this.c = cArr;
        byte[] bArr = new byte[64];
        this.e = bArr;
        this.b = str;
        byte[] bArr2 = base64Variant.e;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = base64Variant.c;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = base64Variant.d;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.g = z;
        this.h = c;
        this.a = i;
        this.i = paddingReadBehaviour;
    }

    protected Object readResolve() {
        Base64Variant d = C9322nR.d(this.b);
        boolean z = this.g;
        boolean z2 = d.g;
        return (z == z2 && this.h == d.h && this.i == d.i && this.a == d.a && z == z2) ? d : new Base64Variant(d, this.b, z, this.h, this.i, this.a);
    }

    public boolean f() {
        return this.i == PaddingReadBehaviour.PADDING_REQUIRED;
    }

    public boolean a() {
        return this.i != PaddingReadBehaviour.PADDING_FORBIDDEN;
    }

    public int b(char c) {
        if (c <= 127) {
            return this.d[c];
        }
        return -1;
    }

    public int e(int i) {
        if (i <= 127) {
            return this.d[i];
        }
        return -1;
    }

    public int a(int i, char[] cArr, int i2) {
        char[] cArr2 = this.c;
        cArr[i2] = cArr2[(i >> 18) & 63];
        cArr[i2 + 1] = cArr2[(i >> 12) & 63];
        cArr[i2 + 2] = cArr2[(i >> 6) & 63];
        cArr[i2 + 3] = cArr2[i & 63];
        return i2 + 4;
    }

    public void d(StringBuilder sb, int i) {
        sb.append(this.c[(i >> 18) & 63]);
        sb.append(this.c[(i >> 12) & 63]);
        sb.append(this.c[(i >> 6) & 63]);
        sb.append(this.c[i & 63]);
    }

    public int a(int i, int i2, char[] cArr, int i3) {
        char[] cArr2 = this.c;
        cArr[i3] = cArr2[(i >> 18) & 63];
        int i4 = i3 + 2;
        cArr[i3 + 1] = cArr2[(i >> 12) & 63];
        if (h()) {
            cArr[i4] = i2 == 2 ? this.c[(i >> 6) & 63] : this.h;
            int i5 = i3 + 4;
            cArr[i3 + 3] = this.h;
            return i5;
        } else if (i2 == 2) {
            cArr[i4] = this.c[(i >> 6) & 63];
            return i3 + 3;
        } else {
            return i4;
        }
    }

    public void c(StringBuilder sb, int i, int i2) {
        sb.append(this.c[(i >> 18) & 63]);
        sb.append(this.c[(i >> 12) & 63]);
        if (h()) {
            sb.append(i2 == 2 ? this.c[(i >> 6) & 63] : this.h);
            sb.append(this.h);
        } else if (i2 == 2) {
            sb.append(this.c[(i >> 6) & 63]);
        }
    }

    public int b(int i, byte[] bArr, int i2) {
        byte[] bArr2 = this.e;
        bArr[i2] = bArr2[(i >> 18) & 63];
        bArr[i2 + 1] = bArr2[(i >> 12) & 63];
        bArr[i2 + 2] = bArr2[(i >> 6) & 63];
        bArr[i2 + 3] = bArr2[i & 63];
        return i2 + 4;
    }

    public int c(int i, int i2, byte[] bArr, int i3) {
        byte[] bArr2 = this.e;
        bArr[i3] = bArr2[(i >> 18) & 63];
        int i4 = i3 + 2;
        bArr[i3 + 1] = bArr2[(i >> 12) & 63];
        if (!h()) {
            if (i2 == 2) {
                bArr[i4] = this.e[(i >> 6) & 63];
                return i3 + 3;
            }
            return i4;
        }
        byte b = (byte) this.h;
        bArr[i4] = i2 == 2 ? this.e[(i >> 6) & 63] : b;
        int i5 = i3 + 4;
        bArr[i3 + 3] = b;
        return i5;
    }

    public String d(byte[] bArr) {
        return a(bArr, false);
    }

    public String a(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z) {
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        int d = d() >> 2;
        int i = 0;
        while (i <= length - 3) {
            byte b = bArr[i];
            byte b2 = bArr[i + 1];
            int i2 = i + 3;
            d(sb, (bArr[i + 2] & 255) | (((b << 8) | (b2 & 255)) << 8));
            d--;
            if (d <= 0) {
                sb.append('\\');
                sb.append('n');
                d = d() >> 2;
            }
            i = i2;
        }
        int i3 = length - i;
        if (i3 > 0) {
            int i4 = bArr[i] << 16;
            if (i3 == 2) {
                i4 |= (bArr[i + 1] & 255) << 8;
            }
            c(sb, i4, i3);
        }
        if (z) {
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        return sb.toString();
    }

    public byte[] c(String str) {
        C9439pc c9439pc = new C9439pc();
        a(str, c9439pc);
        return c9439pc.i();
    }

    public void a(String str, C9439pc c9439pc) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt > ' ') {
                int b = b(charAt);
                if (b < 0) {
                    a(charAt, 0, (String) null);
                }
                if (i2 >= length) {
                    b();
                }
                int i3 = i + 2;
                char charAt2 = str.charAt(i2);
                int b2 = b(charAt2);
                if (b2 < 0) {
                    a(charAt2, 1, (String) null);
                }
                int i4 = (b << 6) | b2;
                if (i3 >= length) {
                    if (!f()) {
                        c9439pc.a(i4 >> 4);
                        return;
                    }
                    b();
                }
                int i5 = i + 3;
                char charAt3 = str.charAt(i3);
                int b3 = b(charAt3);
                if (b3 < 0) {
                    if (b3 != -2) {
                        a(charAt3, 2, (String) null);
                    }
                    if (!a()) {
                        c();
                    }
                    if (i5 >= length) {
                        b();
                    }
                    i += 4;
                    char charAt4 = str.charAt(i5);
                    if (!e(charAt4)) {
                        a(charAt4, 3, "expected padding character '" + j() + "'");
                    }
                    c9439pc.a(i4 >> 4);
                } else {
                    int i6 = (i4 << 6) | b3;
                    if (i5 >= length) {
                        if (!f()) {
                            c9439pc.c(i6 >> 2);
                            return;
                        }
                        b();
                    }
                    i += 4;
                    char charAt5 = str.charAt(i5);
                    int b4 = b(charAt5);
                    if (b4 < 0) {
                        if (b4 != -2) {
                            a(charAt5, 3, (String) null);
                        }
                        if (!a()) {
                            c();
                        }
                        c9439pc.c(i6 >> 2);
                    } else {
                        c9439pc.d((i6 << 6) | b4);
                    }
                }
            } else {
                i = i2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != Base64Variant.class) {
            return false;
        }
        Base64Variant base64Variant = (Base64Variant) obj;
        return base64Variant.h == this.h && base64Variant.a == this.a && base64Variant.g == this.g && base64Variant.i == this.i && this.b.equals(base64Variant.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    protected void a(char c, int i, String str) {
        String str2;
        if (c <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c) + ") as character #" + (i + 1) + " of 4-char base64 unit: can only used between units";
        } else if (e(c)) {
            str2 = "Unexpected padding character ('" + j() + "') as character #" + (i + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(c) || Character.isISOControl(c)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(c) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + c + "' (code 0x" + Integer.toHexString(c) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw new IllegalArgumentException(str2);
    }

    protected void b() {
        throw new IllegalArgumentException(g());
    }

    protected void c() {
        throw new IllegalArgumentException(i());
    }

    protected String i() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", e());
    }

    public String g() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", e(), Character.valueOf(j()));
    }
}
