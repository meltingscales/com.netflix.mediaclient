package com.fasterxml.jackson.dataformat.cbor;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.netflix.ale.AleCryptoBouncyCastle;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import o.AbstractC9323nS;
import o.AbstractC9387od;
import o.C9366oI;
import o.C9389of;
import o.C9600sl;
import o.InterfaceC9321nQ;
import o.InterfaceC9326nV;
import o.InterfaceC9327nW;

/* loaded from: classes2.dex */
public class CBORGenerator extends AbstractC9387od {
    private static final int[] A = new int[0];
    protected boolean k;
    protected boolean l;
    protected C9600sl m;
    protected char[] n;

    /* renamed from: o  reason: collision with root package name */
    protected int f13115o;
    protected int[] p;
    protected int q;
    protected int r;
    protected int s;
    protected final int t;
    protected final C9389of u;
    protected final OutputStream v;
    protected int w;
    protected final int x;
    protected byte[] y;

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator a(InterfaceC9326nV interfaceC9326nV) {
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean b() {
        return true;
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator d(int i, int i2) {
        int i3 = this.i;
        int i4 = (i & i2) | ((~i2) & i3);
        if (i3 != i4) {
            this.i = i4;
        }
        return this;
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator
    public AbstractC9323nS h() {
        return this.m;
    }

    /* loaded from: classes2.dex */
    public enum Feature implements InterfaceC9321nQ {
        WRITE_MINIMAL_INTS(true),
        WRITE_TYPE_HEADER(false);
        
        protected final boolean a;
        protected final int b = 1 << ordinal();

        @Override // o.InterfaceC9383oZ
        public int a() {
            return this.b;
        }

        @Override // o.InterfaceC9383oZ
        public boolean b() {
            return this.a;
        }

        public static int d() {
            Feature[] values;
            int i = 0;
            for (Feature feature : values()) {
                if (feature.b()) {
                    i |= feature.a();
                }
            }
            return i;
        }

        Feature(boolean z) {
            this.a = z;
        }

        public boolean b(int i) {
            return (i & a()) != 0;
        }
    }

    public CBORGenerator(C9389of c9389of, int i, int i2, ObjectCodec objectCodec, OutputStream outputStream) {
        super(i, objectCodec, null);
        this.w = 0;
        this.p = A;
        this.q = -2;
        this.m = C9600sl.c(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.b(i) ? C9366oI.e(this) : null);
        this.s = i2;
        this.k = Feature.WRITE_MINIMAL_INTS.b(i2);
        this.u = c9389of;
        this.v = outputStream;
        this.l = true;
        byte[] e = c9389of.e(16000);
        this.y = e;
        int length = e.length;
        this.x = length;
        char[] a = c9389of.a();
        this.n = a;
        this.t = a.length;
        if (length >= 770) {
            return;
        }
        throw new IllegalStateException("Internal encoding buffer length (" + length + ") too short, must be at least 770");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator b(int i, int i2) {
        int i3 = this.s;
        int i4 = (i & i2) | ((~i2) & i3);
        if (i3 != i4) {
            this.s = i4;
            this.k = Feature.WRITE_MINIMAL_INTS.b(i4);
        }
        return this;
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator
    public void e(Object obj) {
        this.m.b(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void a(String str) {
        if (!this.m.d(str)) {
            c("Can not write a field name, expecting a value");
        }
        f(str);
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator
    public final void d(InterfaceC9327nW interfaceC9327nW) {
        if (!this.m.d(interfaceC9327nW.b())) {
            c("Can not write a field name, expecting a value");
        }
        byte[] c = interfaceC9327nW.c();
        int length = c.length;
        if (length == 0) {
            c((byte) 96);
            return;
        }
        i(96, length);
        a(c, 0, length);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void c(long j) {
        if (!this.m.a(j)) {
            c("Can not write a field id, expecting a value");
        }
        e(j);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void a(String str, String str2) {
        if (!this.m.d(str)) {
            c("Can not write a field name, expecting a value");
        }
        f(str);
        if (str2 == null) {
            k();
            return;
        }
        h("write String value");
        f(str2);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void a(JsonParser jsonParser) {
        c(jsonParser);
        super.a(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(JsonParser jsonParser) {
        c(jsonParser);
        super.b(jsonParser);
    }

    protected void c(JsonParser jsonParser) {
        int am;
        if ((jsonParser instanceof CBORParser) && jsonParser.N() && (am = ((CBORParser) jsonParser).am()) != -1) {
            f(am);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void n() {
        h("start an array");
        this.m = this.m.e(null);
        if (this.r > 0) {
            t();
        }
        this.q = -2;
        c((byte) -97);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(int i) {
        h("start an array");
        this.m = this.m.e(null);
        t();
        this.q = i;
        i(128, i);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void i() {
        if (!this.m.h()) {
            c("Current context not Array but " + this.m.k());
        }
        s();
        this.m = this.m.b();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void l() {
        h("start an object");
        this.m = this.m.c((Object) null);
        if (this.r > 0) {
            t();
        }
        this.q = -2;
        c((byte) -65);
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator
    public final void i(Object obj) {
        h("start an object");
        this.m = this.m.c(obj);
        if (this.r > 0) {
            t();
        }
        this.q = -2;
        c((byte) -65);
    }

    public final void h(int i) {
        h("start an object");
        this.m = this.m.c((Object) null);
        t();
        this.q = i;
        i(160, i);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void o() {
        if (!this.m.g()) {
            c("Current context not Object but " + this.m.k());
        }
        s();
        this.m = this.m.b();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(int[] iArr, int i, int i2) {
        a(iArr.length, i, i2);
        h("write int array");
        i(128, i2);
        for (int i3 = i; i3 < i2 + i; i3++) {
            k(iArr[i3]);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void a(long[] jArr, int i, int i2) {
        a(jArr.length, i, i2);
        h("write int array");
        i(128, i2);
        for (int i3 = i; i3 < i2 + i; i3++) {
            e(jArr[i3]);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void c(double[] dArr, int i, int i2) {
        a(dArr.length, i, i2);
        h("write int array");
        i(128, i2);
        for (int i3 = i; i3 < i2 + i; i3++) {
            b(dArr[i3]);
        }
    }

    private final void t() {
        int[] iArr = this.p;
        if (iArr.length == this.r) {
            this.p = Arrays.copyOf(iArr, iArr.length + 10);
        }
        int[] iArr2 = this.p;
        int i = this.r;
        this.r = i + 1;
        iArr2[i] = this.q;
    }

    private final void k(int i) {
        int i2;
        byte b;
        int i3;
        if (i < 0) {
            i = (-i) - 1;
            i2 = 32;
        } else {
            i2 = 0;
        }
        j(5);
        if (!this.k) {
            b = (byte) i;
            i3 = i >> 8;
        } else if (i < 24) {
            byte[] bArr = this.y;
            int i4 = this.w;
            this.w = i4 + 1;
            bArr[i4] = (byte) (i2 + i);
            return;
        } else if (i <= 255) {
            byte[] bArr2 = this.y;
            int i5 = this.w;
            bArr2[i5] = (byte) (i2 + 24);
            this.w = i5 + 2;
            bArr2[i5 + 1] = (byte) i;
            return;
        } else {
            b = (byte) i;
            i3 = i >> 8;
            if (i3 <= 255) {
                byte[] bArr3 = this.y;
                int i6 = this.w;
                bArr3[i6] = (byte) (i2 + 25);
                bArr3[i6 + 1] = (byte) i3;
                this.w = i6 + 3;
                bArr3[i6 + 2] = b;
                return;
            }
        }
        byte[] bArr4 = this.y;
        int i7 = this.w;
        bArr4[i7] = (byte) (i2 + 26);
        bArr4[i7 + 1] = (byte) (i3 >> 16);
        bArr4[i7 + 2] = (byte) (i3 >> 8);
        bArr4[i7 + 3] = (byte) i3;
        this.w = i7 + 5;
        bArr4[i7 + 4] = b;
    }

    private final void e(long j) {
        if (this.k && j <= 2147483647L && j >= -2147483648L) {
            k((int) j);
            return;
        }
        j(9);
        if (j < 0) {
            j = -(j + 1);
            byte[] bArr = this.y;
            int i = this.w;
            this.w = i + 1;
            bArr[i] = 59;
        } else {
            byte[] bArr2 = this.y;
            int i2 = this.w;
            this.w = i2 + 1;
            bArr2[i2] = 27;
        }
        int i3 = (int) (j >> 32);
        byte[] bArr3 = this.y;
        int i4 = this.w;
        bArr3[i4] = (byte) (i3 >> 24);
        bArr3[i4 + 1] = (byte) (i3 >> 16);
        bArr3[i4 + 2] = (byte) (i3 >> 8);
        bArr3[i4 + 3] = (byte) i3;
        int i5 = (int) j;
        bArr3[i4 + 4] = (byte) (i5 >> 24);
        bArr3[i4 + 5] = (byte) (i5 >> 16);
        bArr3[i4 + 6] = (byte) (i5 >> 8);
        this.w = i4 + 8;
        bArr3[i4 + 7] = (byte) i5;
    }

    private final void b(double d) {
        j(11);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        byte[] bArr = this.y;
        int i = this.w;
        bArr[i] = -5;
        int i2 = (int) (doubleToRawLongBits >> 32);
        bArr[i + 1] = (byte) (i2 >> 24);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 8);
        bArr[i + 4] = (byte) i2;
        int i3 = (int) doubleToRawLongBits;
        bArr[i + 5] = (byte) (i3 >> 24);
        bArr[i + 6] = (byte) (i3 >> 16);
        bArr[i + 7] = (byte) (i3 >> 8);
        this.w = i + 9;
        bArr[i + 8] = (byte) i3;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void i(String str) {
        if (str == null) {
            k();
            return;
        }
        h("write String value");
        f(str);
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator
    public final void e(InterfaceC9327nW interfaceC9327nW) {
        h("write String value");
        byte[] c = interfaceC9327nW.c();
        int length = c.length;
        if (length == 0) {
            c((byte) 96);
            return;
        }
        i(96, length);
        a(c, 0, length);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void d(char[] cArr, int i, int i2) {
        h("write String value");
        if (i2 == 0) {
            c((byte) 96);
        } else {
            a(cArr, i, i2);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(String str) {
        throw q();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(char[] cArr, int i, int i2) {
        throw q();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void d(char c) {
        throw q();
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator
    public void g(String str) {
        throw q();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        if (bArr == null) {
            k();
            return;
        }
        h("write Binary value");
        i(64, i2);
        a(bArr, i, i2);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int c(InputStream inputStream, int i) {
        if (i < 0) {
            throw new UnsupportedOperationException("Must pass actual length for CBOR encoded data");
        }
        h("write Binary value");
        i(64, i);
        int a = a(inputStream, i);
        if (a > 0) {
            c("Too few bytes available: missing " + a + " bytes (out of " + i + ")");
        }
        return i;
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator
    public int c(Base64Variant base64Variant, InputStream inputStream, int i) {
        return c(inputStream, i);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void a(boolean z) {
        h("write boolean value");
        if (z) {
            c((byte) -11);
        } else {
            c((byte) -12);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void k() {
        h("write null value");
        c((byte) -10);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void c(int i) {
        int i2;
        byte b;
        int i3;
        h("write number");
        if (i < 0) {
            i = (-i) - 1;
            i2 = 32;
        } else {
            i2 = 0;
        }
        j(5);
        if (!this.k) {
            b = (byte) i;
            i3 = i >> 8;
        } else if (i < 24) {
            byte[] bArr = this.y;
            int i4 = this.w;
            this.w = i4 + 1;
            bArr[i4] = (byte) (i2 + i);
            return;
        } else if (i <= 255) {
            byte[] bArr2 = this.y;
            int i5 = this.w;
            bArr2[i5] = (byte) (i2 + 24);
            this.w = i5 + 2;
            bArr2[i5 + 1] = (byte) i;
            return;
        } else {
            b = (byte) i;
            i3 = i >> 8;
            if (i3 <= 255) {
                byte[] bArr3 = this.y;
                int i6 = this.w;
                bArr3[i6] = (byte) (i2 + 25);
                bArr3[i6 + 1] = (byte) i3;
                this.w = i6 + 3;
                bArr3[i6 + 2] = b;
                return;
            }
        }
        byte[] bArr4 = this.y;
        int i7 = this.w;
        bArr4[i7] = (byte) (i2 + 26);
        bArr4[i7 + 1] = (byte) (i3 >> 16);
        bArr4[i7 + 2] = (byte) (i3 >> 8);
        bArr4[i7 + 3] = (byte) i3;
        this.w = i7 + 5;
        bArr4[i7 + 4] = b;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(long j) {
        if (this.k && j <= 2147483647L && j >= -2147483648L) {
            c((int) j);
            return;
        }
        h("write number");
        j(9);
        if (j < 0) {
            j = -(j + 1);
            byte[] bArr = this.y;
            int i = this.w;
            this.w = i + 1;
            bArr[i] = 59;
        } else {
            byte[] bArr2 = this.y;
            int i2 = this.w;
            this.w = i2 + 1;
            bArr2[i2] = 27;
        }
        int i3 = (int) (j >> 32);
        byte[] bArr3 = this.y;
        int i4 = this.w;
        bArr3[i4] = (byte) (i3 >> 24);
        bArr3[i4 + 1] = (byte) (i3 >> 16);
        bArr3[i4 + 2] = (byte) (i3 >> 8);
        bArr3[i4 + 3] = (byte) i3;
        int i5 = (int) j;
        bArr3[i4 + 4] = (byte) (i5 >> 24);
        bArr3[i4 + 5] = (byte) (i5 >> 16);
        bArr3[i4 + 6] = (byte) (i5 >> 8);
        this.w = i4 + 8;
        bArr3[i4 + 7] = (byte) i5;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(BigInteger bigInteger) {
        if (bigInteger == null) {
            k();
            return;
        }
        h("write number");
        c(bigInteger);
    }

    protected void c(BigInteger bigInteger) {
        if (bigInteger.signum() < 0) {
            c((byte) -61);
            bigInteger = bigInteger.negate();
        } else {
            c((byte) -62);
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        i(64, length);
        a(byteArray, 0, length);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(double d) {
        h("write number");
        j(11);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        byte[] bArr = this.y;
        int i = this.w;
        bArr[i] = -5;
        int i2 = (int) (doubleToRawLongBits >> 32);
        bArr[i + 1] = (byte) (i2 >> 24);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 8);
        bArr[i + 4] = (byte) i2;
        int i3 = (int) doubleToRawLongBits;
        bArr[i + 5] = (byte) (i3 >> 24);
        bArr[i + 6] = (byte) (i3 >> 16);
        bArr[i + 7] = (byte) (i3 >> 8);
        this.w = i + 9;
        bArr[i + 8] = (byte) i3;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void d(float f) {
        j(6);
        h("write number");
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        byte[] bArr = this.y;
        int i = this.w;
        bArr[i] = -6;
        bArr[i + 1] = (byte) (floatToRawIntBits >> 24);
        bArr[i + 2] = (byte) (floatToRawIntBits >> 16);
        bArr[i + 3] = (byte) (floatToRawIntBits >> 8);
        this.w = i + 5;
        bArr[i + 4] = (byte) floatToRawIntBits;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            k();
            return;
        }
        h("write number");
        c((byte) -60);
        c((byte) -126);
        i(-bigDecimal.scale());
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        int bitLength = unscaledValue.bitLength();
        if (bitLength <= 31) {
            i(unscaledValue.intValue());
        } else if (bitLength <= 63) {
            a(unscaledValue.longValue());
        } else {
            c(unscaledValue);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void d(String str) {
        i(str);
    }

    @Override // o.AbstractC9387od
    public final void h(String str) {
        if (!this.m.n()) {
            c("Can not " + str + ", expecting field name/id");
        }
        int i = this.q;
        if (i != -2) {
            int i2 = i - 1;
            if (i2 < 0) {
                p();
            } else {
                this.q = i2;
            }
        }
    }

    private void p() {
        c(String.format("%s size mismatch: number of element encoded is not equal to reported array/map size.", this.m.k()));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public final void flush() {
        r();
        if (e(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            this.v.flush();
        }
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.y != null && e(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                AbstractC9323nS h = h();
                if (h.h()) {
                    i();
                } else if (!h.g()) {
                    break;
                } else {
                    o();
                }
            }
        }
        super.close();
        r();
        if (this.u.f() || e(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
            this.v.close();
        } else if (e(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            this.v.flush();
        }
        m();
    }

    public void f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Can not write negative tag ids (" + i + ")");
        }
        i(192, i);
    }

    protected final void f(String str) {
        int length = str.length();
        if (length == 0) {
            c((byte) 96);
        } else if (length <= 23) {
            a(71);
            int c = c(this.w + 1, str, length);
            byte[] bArr = this.y;
            int i = this.w;
            if (c <= 23) {
                bArr[i] = (byte) (c + 96);
                this.w = i + 1 + c;
                return;
            }
            int i2 = i + 1;
            int i3 = i + 2;
            System.arraycopy(bArr, i2, bArr, i3, c);
            bArr[i] = 120;
            bArr[i2] = (byte) c;
            this.w = i3 + c;
        } else {
            char[] cArr = this.n;
            if (length > cArr.length) {
                cArr = new char[Math.max(cArr.length + 32, length)];
                this.n = cArr;
            }
            str.getChars(0, length, cArr, 0);
            a(cArr, 0, length);
        }
    }

    protected final void a(int i) {
        if (this.w + i + 3 > this.x) {
            r();
        }
    }

    protected final void a(char[] cArr, int i, int i2) {
        if (i2 <= 23) {
            a(71);
            int b = b(this.w + 1, cArr, i, i2 + i);
            byte[] bArr = this.y;
            int i3 = this.w;
            if (b <= 23) {
                bArr[i3] = (byte) (b + 96);
                this.w = i3 + 1 + b;
                return;
            }
            int i4 = i3 + 1;
            int i5 = i3 + 2;
            System.arraycopy(bArr, i4, bArr, i5, b);
            bArr[i3] = 120;
            bArr[i4] = (byte) b;
            this.w = i5 + b;
        } else if (i2 > 255) {
            if (i2 <= 3996) {
                a(11991);
                int i6 = this.w;
                int i7 = i6 + 3;
                int b2 = b(i7, cArr, i, i2 + i);
                byte[] bArr2 = this.y;
                bArr2[i6] = 121;
                bArr2[i6 + 1] = (byte) (b2 >> 8);
                bArr2[i6 + 2] = (byte) b2;
                this.w = i7 + b2;
                return;
            }
            b(cArr, i, i2);
        } else {
            a(768);
            int b3 = b(this.w + 2, cArr, i, i2 + i);
            byte[] bArr3 = this.y;
            int i8 = this.w;
            if (b3 <= 255) {
                bArr3[i8] = 120;
                bArr3[i8 + 1] = (byte) b3;
                this.w = i8 + 2 + b3;
                return;
            }
            int i9 = i8 + 2;
            int i10 = i8 + 3;
            System.arraycopy(bArr3, i9, bArr3, i10, b3);
            bArr3[i8] = 121;
            bArr3[i8 + 1] = (byte) (b3 >> 8);
            bArr3[i9] = (byte) b3;
            this.w = i10 + b3;
        }
    }

    protected final void b(char[] cArr, int i, int i2) {
        c(Byte.MAX_VALUE);
        while (true) {
            int i3 = 3996;
            if (i2 <= 3996) {
                break;
            }
            a(11991);
            int i4 = this.w;
            int i5 = i + 3996;
            int i6 = i + 3995;
            char c = cArr[i6];
            if (c >= 55296 && c <= 56319) {
                i3 = 3995;
                i5 = i6;
            }
            int i7 = i4 + 3;
            int b = b(i7, cArr, i, i5);
            byte[] bArr = this.y;
            bArr[i4] = 121;
            bArr[i4 + 1] = (byte) (b >> 8);
            bArr[i4 + 2] = (byte) b;
            this.w = i7 + b;
            i += i3;
            i2 -= i3;
        }
        if (i2 > 0) {
            a(cArr, i, i2);
        }
        c((byte) -1);
    }

    private final int b(int i, char[] cArr, int i2, int i3) {
        byte[] bArr = this.y;
        int i4 = i;
        int i5 = i2;
        while (true) {
            char c = cArr[i5];
            if (c > 127) {
                return e(cArr, i5, i3, i4, i);
            }
            int i6 = i4 + 1;
            bArr[i4] = (byte) c;
            i5++;
            if (i5 >= i3) {
                return i6 - i;
            }
            i4 = i6;
        }
    }

    private final int e(char[] cArr, int i, int i2, int i3, int i4) {
        int i5;
        byte[] bArr = this.y;
        while (i < i2) {
            int i6 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                bArr[i3] = (byte) c;
                i3++;
            } else {
                if (c < 2048) {
                    bArr[i3] = (byte) ((c >> 6) | 192);
                    i5 = i3 + 2;
                    bArr[i3 + 1] = (byte) ((c & '?') | 128);
                } else if (c < 55296 || c > 57343) {
                    bArr[i3] = (byte) ((c >> '\f') | 224);
                    bArr[i3 + 1] = (byte) (((c >> 6) & 63) | 128);
                    i5 = i3 + 3;
                    bArr[i3 + 2] = (byte) ((c & '?') | 128);
                } else {
                    if (c > 56319) {
                        g(c);
                    }
                    if (i6 >= i2) {
                        g(c);
                    }
                    i += 2;
                    int e = e(c, cArr[i6]);
                    if (e > 1114111) {
                        g(e);
                    }
                    bArr[i3] = (byte) ((e >> 18) | 240);
                    bArr[i3 + 1] = (byte) (((e >> 12) & 63) | 128);
                    bArr[i3 + 2] = (byte) (((e >> 6) & 63) | 128);
                    int i7 = i3 + 4;
                    bArr[i3 + 3] = (byte) ((e & 63) | 128);
                    i3 = i7;
                }
                i3 = i5;
            }
            i = i6;
        }
        return i3 - i4;
    }

    private final int c(int i, String str, int i2) {
        byte[] bArr = this.y;
        int i3 = i;
        int i4 = 0;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt > 127) {
                return a(i4, i3, str, i2, i);
            }
            bArr[i3] = (byte) charAt;
            i4++;
            i3++;
        }
        return i3 - i;
    }

    private final int a(int i, int i2, String str, int i3, int i4) {
        int i5;
        byte[] bArr = this.y;
        while (i < i3) {
            int i6 = i + 1;
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                bArr[i2] = (byte) charAt;
                i2++;
            } else {
                if (charAt < 2048) {
                    bArr[i2] = (byte) ((charAt >> 6) | 192);
                    i5 = i2 + 2;
                    bArr[i2 + 1] = (byte) ((charAt & '?') | 128);
                } else if (charAt < 55296 || charAt > 57343) {
                    bArr[i2] = (byte) ((charAt >> '\f') | 224);
                    bArr[i2 + 1] = (byte) (((charAt >> 6) & 63) | 128);
                    i5 = i2 + 3;
                    bArr[i2 + 2] = (byte) ((charAt & '?') | 128);
                } else {
                    if (charAt > 56319) {
                        g(charAt);
                    }
                    if (i6 >= i3) {
                        g(charAt);
                    }
                    i += 2;
                    int e = e(charAt, str.charAt(i6));
                    if (e > 1114111) {
                        g(e);
                    }
                    bArr[i2] = (byte) ((e >> 18) | 240);
                    bArr[i2 + 1] = (byte) (((e >> 12) & 63) | 128);
                    bArr[i2 + 2] = (byte) (((e >> 6) & 63) | 128);
                    int i7 = i2 + 4;
                    bArr[i2 + 3] = (byte) ((e & 63) | 128);
                    i2 = i7;
                }
                i2 = i5;
            }
            i = i6;
        }
        return i2 - i4;
    }

    private int e(int i, int i2) {
        if (i2 < 56320 || i2 > 57343) {
            throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2) + "; illegal combination");
        }
        return ((i - 55296) << 10) + AleCryptoBouncyCastle.MAX_RANDOM_BYTES + (i2 - 56320);
    }

    private void g(int i) {
        if (i > 1114111) {
            throw new IllegalArgumentException("Illegal character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 4627");
        } else if (i < 55296) {
            throw new IllegalArgumentException("Illegal character point (0x" + Integer.toHexString(i) + ") to output");
        } else if (i <= 56319) {
            throw new IllegalArgumentException("Unmatched first part of surrogate pair (0x" + Integer.toHexString(i) + ")");
        } else {
            throw new IllegalArgumentException("Unmatched second part of surrogate pair (0x" + Integer.toHexString(i) + ")");
        }
    }

    private final void j(int i) {
        if (this.w + i >= this.x) {
            r();
        }
    }

    private final void i(int i) {
        int i2;
        if (i < 0) {
            i = (-i) - 1;
            i2 = 32;
        } else {
            i2 = 0;
        }
        i(i2, i);
    }

    private final void a(long j) {
        j(9);
        if (j < 0) {
            j = -(j + 1);
            byte[] bArr = this.y;
            int i = this.w;
            this.w = i + 1;
            bArr[i] = 59;
        } else {
            byte[] bArr2 = this.y;
            int i2 = this.w;
            this.w = i2 + 1;
            bArr2[i2] = 27;
        }
        int i3 = (int) (j >> 32);
        byte[] bArr3 = this.y;
        int i4 = this.w;
        bArr3[i4] = (byte) (i3 >> 24);
        bArr3[i4 + 1] = (byte) (i3 >> 16);
        bArr3[i4 + 2] = (byte) (i3 >> 8);
        bArr3[i4 + 3] = (byte) i3;
        int i5 = (int) j;
        bArr3[i4 + 4] = (byte) (i5 >> 24);
        bArr3[i4 + 5] = (byte) (i5 >> 16);
        bArr3[i4 + 6] = (byte) (i5 >> 8);
        this.w = i4 + 8;
        bArr3[i4 + 7] = (byte) i5;
    }

    private final void i(int i, int i2) {
        j(5);
        if (i2 < 24) {
            byte[] bArr = this.y;
            int i3 = this.w;
            this.w = i3 + 1;
            bArr[i3] = (byte) (i + i2);
        } else if (i2 <= 255) {
            byte[] bArr2 = this.y;
            int i4 = this.w;
            bArr2[i4] = (byte) (i + 24);
            this.w = i4 + 2;
            bArr2[i4 + 1] = (byte) i2;
        } else {
            byte b = (byte) i2;
            int i5 = i2 >> 8;
            if (i5 <= 255) {
                byte[] bArr3 = this.y;
                int i6 = this.w;
                bArr3[i6] = (byte) (i + 25);
                bArr3[i6 + 1] = (byte) i5;
                this.w = i6 + 3;
                bArr3[i6 + 2] = b;
                return;
            }
            byte[] bArr4 = this.y;
            int i7 = this.w;
            bArr4[i7] = (byte) (i + 26);
            bArr4[i7 + 1] = (byte) (i2 >> 24);
            bArr4[i7 + 2] = (byte) (i2 >> 16);
            bArr4[i7 + 3] = (byte) i5;
            this.w = i7 + 5;
            bArr4[i7 + 4] = b;
        }
    }

    private final void c(byte b) {
        if (this.w >= this.x) {
            r();
        }
        byte[] bArr = this.y;
        int i = this.w;
        this.w = i + 1;
        bArr[i] = b;
    }

    private final void a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return;
        }
        int i3 = this.w;
        if (i3 + i2 >= this.x) {
            b(bArr, i, i2);
            return;
        }
        System.arraycopy(bArr, i, this.y, i3, i2);
        this.w += i2;
    }

    private final int a(InputStream inputStream, int i) {
        while (i > 0) {
            int i2 = this.x - this.w;
            if (i2 <= 0) {
                r();
                i2 = this.x - this.w;
            }
            int read = inputStream.read(this.y, this.w, i2);
            if (read < 0) {
                break;
            }
            this.w += read;
            i -= read;
        }
        return i;
    }

    private final void b(byte[] bArr, int i, int i2) {
        if (this.w >= this.x) {
            r();
        }
        while (true) {
            int min = Math.min(i2, this.x - this.w);
            System.arraycopy(bArr, i, this.y, this.w, min);
            this.w += min;
            i2 -= min;
            if (i2 == 0) {
                return;
            }
            i += min;
            r();
        }
    }

    @Override // o.AbstractC9387od
    public void m() {
        byte[] bArr = this.y;
        if (bArr != null && this.l) {
            this.y = null;
            this.u.a(bArr);
        }
        char[] cArr = this.n;
        if (cArr != null) {
            this.n = null;
            this.u.e(cArr);
        }
    }

    protected final void r() {
        int i = this.w;
        if (i > 0) {
            this.f13115o += i;
            this.v.write(this.y, 0, i);
            this.w = 0;
        }
    }

    private final void s() {
        int i = this.q;
        int i2 = -2;
        if (i == -2) {
            c((byte) -1);
        } else if (i != 0) {
            c(String.format("%s size mismatch: expected %d more elements", this.m.k(), Integer.valueOf(this.q)));
        }
        int i3 = this.r;
        if (i3 != 0) {
            int[] iArr = this.p;
            int i4 = i3 - 1;
            this.r = i4;
            i2 = iArr[i4];
        }
        this.q = i2;
    }

    protected UnsupportedOperationException q() {
        return new UnsupportedOperationException();
    }
}
