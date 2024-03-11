package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.oK  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9368oK extends AbstractC9362oE {
    protected int B;
    protected final OutputStream C;
    protected boolean t;
    protected final int u;
    protected final int v;
    protected final int w;
    protected byte[] x;
    protected char[] y;
    protected byte z;
    private static final byte[] F = C9391oh.b(true);
    private static final byte[] D = C9391oh.b(false);
    private static final byte[] H = {110, 117, 108, 108};
    private static final byte[] G = {116, 114, 117, 101};
    private static final byte[] A = {102, 97, 108, 115, 101};

    private byte[] r() {
        return this.m ? F : D;
    }

    public C9368oK(C9389of c9389of, int i, ObjectCodec objectCodec, OutputStream outputStream, char c) {
        super(c9389of, i, objectCodec);
        this.C = outputStream;
        this.z = (byte) c;
        if (c != '\"') {
            this.p = C9391oh.c(c);
        }
        this.t = true;
        byte[] d = c9389of.d();
        this.x = d;
        int length = d.length;
        this.w = length;
        this.u = length >> 3;
        char[] a = c9389of.a();
        this.y = a;
        this.v = a.length;
        if (e(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            b(127);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void a(String str) {
        if (this.b != null) {
            j(str);
            return;
        }
        int b = this.j.b(str);
        if (b == 4) {
            c("Can not write a field name, expecting a value");
        }
        if (b == 1) {
            if (this.B >= this.w) {
                p();
            }
            byte[] bArr = this.x;
            int i = this.B;
            this.B = i + 1;
            bArr[i] = 44;
        }
        if (this.f13887o) {
            e(str, false);
            return;
        }
        int length = str.length();
        if (length > this.v) {
            e(str, true);
            return;
        }
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr2 = this.x;
        int i2 = this.B;
        int i3 = i2 + 1;
        this.B = i3;
        bArr2[i2] = this.z;
        if (length <= this.u) {
            if (i3 + length > this.w) {
                p();
            }
            c(str, 0, length);
        } else {
            i(str, 0, length);
        }
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr3 = this.x;
        int i4 = this.B;
        this.B = i4 + 1;
        bArr3[i4] = this.z;
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator
    public void d(InterfaceC9327nW interfaceC9327nW) {
        if (this.b != null) {
            i(interfaceC9327nW);
            return;
        }
        int b = this.j.b(interfaceC9327nW.b());
        if (b == 4) {
            c("Can not write a field name, expecting a value");
        }
        if (b == 1) {
            if (this.B >= this.w) {
                p();
            }
            byte[] bArr = this.x;
            int i = this.B;
            this.B = i + 1;
            bArr[i] = 44;
        }
        if (this.f13887o) {
            f(interfaceC9327nW);
            return;
        }
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr2 = this.x;
        int i2 = this.B;
        int i3 = i2 + 1;
        this.B = i3;
        bArr2[i2] = this.z;
        int b2 = interfaceC9327nW.b(bArr2, i3);
        if (b2 < 0) {
            d(interfaceC9327nW.d());
        } else {
            this.B += b2;
        }
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr3 = this.x;
        int i4 = this.B;
        this.B = i4 + 1;
        bArr3[i4] = this.z;
    }

    private final void f(InterfaceC9327nW interfaceC9327nW) {
        int b = interfaceC9327nW.b(this.x, this.B);
        if (b < 0) {
            d(interfaceC9327nW.d());
        } else {
            this.B += b;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void n() {
        h("start an array");
        this.j = this.j.l();
        InterfaceC9326nV interfaceC9326nV = this.b;
        if (interfaceC9326nV != null) {
            interfaceC9326nV.h(this);
            return;
        }
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr = this.x;
        int i = this.B;
        this.B = i + 1;
        bArr[i] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void g(Object obj) {
        h("start an array");
        this.j = this.j.a(obj);
        InterfaceC9326nV interfaceC9326nV = this.b;
        if (interfaceC9326nV != null) {
            interfaceC9326nV.h(this);
            return;
        }
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr = this.x;
        int i = this.B;
        this.B = i + 1;
        bArr[i] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(Object obj, int i) {
        h("start an array");
        this.j = this.j.a(obj);
        InterfaceC9326nV interfaceC9326nV = this.b;
        if (interfaceC9326nV != null) {
            interfaceC9326nV.h(this);
            return;
        }
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr = this.x;
        int i2 = this.B;
        this.B = i2 + 1;
        bArr[i2] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void i() {
        if (!this.j.h()) {
            c("Current context not Array but " + this.j.k());
        }
        InterfaceC9326nV interfaceC9326nV = this.b;
        if (interfaceC9326nV != null) {
            interfaceC9326nV.b(this, this.j.d());
        } else {
            if (this.B >= this.w) {
                p();
            }
            byte[] bArr = this.x;
            int i = this.B;
            this.B = i + 1;
            bArr[i] = 93;
        }
        this.j = this.j.m();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void l() {
        h("start an object");
        this.j = this.j.n();
        InterfaceC9326nV interfaceC9326nV = this.b;
        if (interfaceC9326nV != null) {
            interfaceC9326nV.j(this);
            return;
        }
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr = this.x;
        int i = this.B;
        this.B = i + 1;
        bArr[i] = 123;
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator
    public void i(Object obj) {
        h("start an object");
        this.j = this.j.e(obj);
        InterfaceC9326nV interfaceC9326nV = this.b;
        if (interfaceC9326nV != null) {
            interfaceC9326nV.j(this);
            return;
        }
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr = this.x;
        int i = this.B;
        this.B = i + 1;
        bArr[i] = 123;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void a(Object obj, int i) {
        i(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void o() {
        if (!this.j.g()) {
            c("Current context not Object but " + this.j.k());
        }
        InterfaceC9326nV interfaceC9326nV = this.b;
        if (interfaceC9326nV != null) {
            interfaceC9326nV.a(this, this.j.d());
        } else {
            if (this.B >= this.w) {
                p();
            }
            byte[] bArr = this.x;
            int i = this.B;
            this.B = i + 1;
            bArr[i] = 125;
        }
        this.j = this.j.m();
    }

    protected final void j(String str) {
        int b = this.j.b(str);
        if (b == 4) {
            c("Can not write a field name, expecting a value");
        }
        if (b == 1) {
            this.b.a(this);
        } else {
            this.b.e(this);
        }
        if (this.f13887o) {
            e(str, false);
            return;
        }
        int length = str.length();
        if (length > this.v) {
            e(str, true);
            return;
        }
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr = this.x;
        int i = this.B;
        this.B = i + 1;
        bArr[i] = this.z;
        str.getChars(0, length, this.y, 0);
        if (length <= this.u) {
            if (this.B + length > this.w) {
                p();
            }
            f(this.y, 0, length);
        } else {
            g(this.y, 0, length);
        }
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr2 = this.x;
        int i2 = this.B;
        this.B = i2 + 1;
        bArr2[i2] = this.z;
    }

    protected final void i(InterfaceC9327nW interfaceC9327nW) {
        int b = this.j.b(interfaceC9327nW.b());
        if (b == 4) {
            c("Can not write a field name, expecting a value");
        }
        if (b == 1) {
            this.b.a(this);
        } else {
            this.b.e(this);
        }
        boolean z = !this.f13887o;
        if (z) {
            if (this.B >= this.w) {
                p();
            }
            byte[] bArr = this.x;
            int i = this.B;
            this.B = i + 1;
            bArr[i] = this.z;
        }
        int b2 = interfaceC9327nW.b(this.x, this.B);
        if (b2 < 0) {
            d(interfaceC9327nW.d());
        } else {
            this.B += b2;
        }
        if (z) {
            if (this.B >= this.w) {
                p();
            }
            byte[] bArr2 = this.x;
            int i2 = this.B;
            this.B = i2 + 1;
            bArr2[i2] = this.z;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void i(String str) {
        h("write a string");
        if (str == null) {
            q();
            return;
        }
        int length = str.length();
        if (length > this.u) {
            e(str, true);
            return;
        }
        if (this.B + length >= this.w) {
            p();
        }
        byte[] bArr = this.x;
        int i = this.B;
        this.B = i + 1;
        bArr[i] = this.z;
        c(str, 0, length);
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr2 = this.x;
        int i2 = this.B;
        this.B = i2 + 1;
        bArr2[i2] = this.z;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void d(char[] cArr, int i, int i2) {
        h("write a string");
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr = this.x;
        int i3 = this.B;
        int i4 = i3 + 1;
        this.B = i4;
        bArr[i3] = this.z;
        if (i2 <= this.u) {
            if (i4 + i2 > this.w) {
                p();
            }
            f(cArr, i, i2);
        } else {
            g(cArr, i, i2);
        }
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr2 = this.x;
        int i5 = this.B;
        this.B = i5 + 1;
        bArr2[i5] = this.z;
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator
    public final void e(InterfaceC9327nW interfaceC9327nW) {
        h("write a string");
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr = this.x;
        int i = this.B;
        int i2 = i + 1;
        this.B = i2;
        bArr[i] = this.z;
        int b = interfaceC9327nW.b(bArr, i2);
        if (b < 0) {
            d(interfaceC9327nW.d());
        } else {
            this.B += b;
        }
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr2 = this.x;
        int i3 = this.B;
        this.B = i3 + 1;
        bArr2[i3] = this.z;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(String str) {
        int length = str.length();
        char[] cArr = this.y;
        if (length <= cArr.length) {
            str.getChars(0, length, cArr, 0);
            e(cArr, 0, length);
            return;
        }
        a(str, 0, length);
    }

    public void a(String str, int i, int i2) {
        int i3;
        char c;
        e(str, i, i2);
        char[] cArr = this.y;
        int length = cArr.length;
        if (i2 <= length) {
            str.getChars(i, i + i2, cArr, 0);
            e(cArr, 0, i2);
            return;
        }
        int i4 = this.w;
        int min = Math.min(length, (i4 >> 2) + (i4 >> 4));
        while (i2 > 0) {
            int min2 = Math.min(min, i2);
            str.getChars(i, i + min2, cArr, 0);
            if (this.B + (min * 3) > this.w) {
                p();
            }
            if (min2 > 1 && (c = cArr[min2 - 1]) >= 55296 && c <= 56319) {
                min2 = i3;
            }
            a(cArr, 0, min2);
            i += min2;
            i2 -= min2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(InterfaceC9327nW interfaceC9327nW) {
        int e = interfaceC9327nW.e(this.x, this.B);
        if (e < 0) {
            d(interfaceC9327nW.c());
        } else {
            this.B += e;
        }
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator
    public void c(InterfaceC9327nW interfaceC9327nW) {
        h("write a raw (unencoded) value");
        int e = interfaceC9327nW.e(this.x, this.B);
        if (e < 0) {
            d(interfaceC9327nW.c());
        } else {
            this.B += e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0 >= 2048) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        r1 = r4.x;
        r2 = r4.B;
        r1[r2] = (byte) ((r0 >> 6) | 192);
        r4.B = r2 + 2;
        r1[r2 + 1] = (byte) ((r0 & '?') | 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        r6 = b(r0, r5, r6, r7);
     */
    @Override // com.fasterxml.jackson.core.JsonGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(char[] r5, int r6, int r7) {
        /*
            r4 = this;
            r4.c(r5, r6, r7)
            int r0 = r7 + r7
            int r0 = r0 + r7
            int r1 = r4.B
            int r2 = r4.w
            int r1 = r1 + r0
            if (r1 <= r2) goto L16
            if (r2 >= r0) goto L13
            r4.h(r5, r6, r7)
            return
        L13:
            r4.p()
        L16:
            int r7 = r7 + r6
        L17:
            if (r6 >= r7) goto L52
        L19:
            char r0 = r5[r6]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L43
            int r6 = r6 + 1
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto L3e
            byte[] r1 = r4.x
            int r2 = r4.B
            int r3 = r0 >> 6
            r3 = r3 | 192(0xc0, float:2.69E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r3 = r2 + 2
            r4.B = r3
            r0 = r0 & 63
            r0 = r0 | 128(0x80, float:1.794E-43)
            byte r0 = (byte) r0
            int r2 = r2 + 1
            r1[r2] = r0
            goto L17
        L3e:
            int r6 = r4.b(r0, r5, r6, r7)
            goto L17
        L43:
            byte[] r1 = r4.x
            int r2 = r4.B
            int r3 = r2 + 1
            r4.B = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r6 = r6 + 1
            if (r6 < r7) goto L19
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9368oK.e(char[], int, int):void");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void d(char c) {
        if (this.B + 3 >= this.w) {
            p();
        }
        byte[] bArr = this.x;
        if (c <= 127) {
            int i = this.B;
            this.B = i + 1;
            bArr[i] = (byte) c;
        } else if (c < 2048) {
            int i2 = this.B;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this.B = i2 + 2;
            bArr[i2 + 1] = (byte) ((c & '?') | 128);
        } else {
            b(c, null, 0, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r8 >= 2048) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        r4 = r6.B;
        r1[r4] = (byte) ((r8 >> 6) | 192);
        r6.B = r4 + 2;
        r1[r4 + 1] = (byte) ((r8 & '?') | 128);
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        r8 = b(r8, r7, r2, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if ((r6.B + 3) < r6.w) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        r2 = r8 + 1;
        r8 = r7[r8];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void h(char[] r7, int r8, int r9) {
        /*
            r6 = this;
            int r0 = r6.w
            byte[] r1 = r6.x
            int r9 = r9 + r8
        L5:
            if (r8 >= r9) goto L50
        L7:
            char r2 = r7[r8]
            r3 = 128(0x80, float:1.794E-43)
            if (r2 < r3) goto L3c
            int r2 = r6.B
            int r2 = r2 + 3
            int r4 = r6.w
            if (r2 < r4) goto L18
            r6.p()
        L18:
            int r2 = r8 + 1
            char r8 = r7[r8]
            r4 = 2048(0x800, float:2.87E-42)
            if (r8 >= r4) goto L37
            int r4 = r6.B
            int r5 = r8 >> 6
            r5 = r5 | 192(0xc0, float:2.69E-43)
            byte r5 = (byte) r5
            r1[r4] = r5
            int r5 = r4 + 2
            r6.B = r5
            r8 = r8 & 63
            r8 = r8 | r3
            byte r8 = (byte) r8
            int r4 = r4 + 1
            r1[r4] = r8
            r8 = r2
            goto L5
        L37:
            int r8 = r6.b(r8, r7, r2, r9)
            goto L5
        L3c:
            int r3 = r6.B
            if (r3 < r0) goto L43
            r6.p()
        L43:
            int r3 = r6.B
            int r4 = r3 + 1
            r6.B = r4
            byte r2 = (byte) r2
            r1[r3] = r2
            int r8 = r8 + 1
            if (r8 < r9) goto L7
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9368oK.h(char[], int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r0 >= 2048) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
        r1 = r4.x;
        r2 = r4.B;
        r1[r2] = (byte) ((r0 >> 6) | 192);
        r4.B = r2 + 2;
        r1[r2 + 1] = (byte) ((r0 & '?') | 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        r6 = b(r0, r5, r6, r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(char[] r5, int r6, int r7) {
        /*
            r4 = this;
        L0:
            if (r6 >= r7) goto L3b
        L2:
            char r0 = r5[r6]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L2c
            int r6 = r6 + 1
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto L27
            byte[] r1 = r4.x
            int r2 = r4.B
            int r3 = r0 >> 6
            r3 = r3 | 192(0xc0, float:2.69E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r3 = r2 + 2
            r4.B = r3
            r0 = r0 & 63
            r0 = r0 | 128(0x80, float:1.794E-43)
            byte r0 = (byte) r0
            int r2 = r2 + 1
            r1[r2] = r0
            goto L0
        L27:
            int r6 = r4.b(r0, r5, r6, r7)
            goto L0
        L2c:
            byte[] r1 = r4.x
            int r2 = r4.B
            int r3 = r2 + 1
            r4.B = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r6 = r6 + 1
            if (r6 < r7) goto L2
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9368oK.a(char[], int, int):void");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        d(bArr, i, i2);
        h("write a binary value");
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr2 = this.x;
        int i3 = this.B;
        this.B = i3 + 1;
        bArr2[i3] = this.z;
        d(base64Variant, bArr, i, i2 + i);
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr3 = this.x;
        int i4 = this.B;
        this.B = i4 + 1;
        bArr3[i4] = this.z;
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator
    public int c(Base64Variant base64Variant, InputStream inputStream, int i) {
        h("write a binary value");
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr = this.x;
        int i2 = this.B;
        this.B = i2 + 1;
        bArr[i2] = this.z;
        byte[] c = this.r.c();
        try {
            if (i < 0) {
                i = a(base64Variant, inputStream, c);
            } else {
                int d = d(base64Variant, inputStream, c, i);
                if (d > 0) {
                    c("Too few bytes available: missing " + d + " bytes (out of " + i + ")");
                }
            }
            this.r.b(c);
            if (this.B >= this.w) {
                p();
            }
            byte[] bArr2 = this.x;
            int i3 = this.B;
            this.B = i3 + 1;
            bArr2[i3] = this.z;
            return i;
        } catch (Throwable th) {
            this.r.b(c);
            throw th;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(short s) {
        h("write a number");
        if (this.B + 6 >= this.w) {
            p();
        }
        if (this.h) {
            c(s);
        } else {
            this.B = C9394ok.d(s, this.x, this.B);
        }
    }

    private final void c(short s) {
        if (this.B + 8 >= this.w) {
            p();
        }
        byte[] bArr = this.x;
        int i = this.B;
        int i2 = i + 1;
        this.B = i2;
        bArr[i] = this.z;
        int d = C9394ok.d(s, bArr, i2);
        byte[] bArr2 = this.x;
        this.B = d + 1;
        bArr2[d] = this.z;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void c(int i) {
        h("write a number");
        if (this.B + 11 >= this.w) {
            p();
        }
        if (this.h) {
            a(i);
        } else {
            this.B = C9394ok.d(i, this.x, this.B);
        }
    }

    private final void a(int i) {
        if (this.B + 13 >= this.w) {
            p();
        }
        byte[] bArr = this.x;
        int i2 = this.B;
        int i3 = i2 + 1;
        this.B = i3;
        bArr[i2] = this.z;
        int d = C9394ok.d(i, bArr, i3);
        byte[] bArr2 = this.x;
        this.B = d + 1;
        bArr2[d] = this.z;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(long j) {
        h("write a number");
        if (this.h) {
            d(j);
            return;
        }
        if (this.B + 21 >= this.w) {
            p();
        }
        this.B = C9394ok.c(j, this.x, this.B);
    }

    private final void d(long j) {
        if (this.B + 23 >= this.w) {
            p();
        }
        byte[] bArr = this.x;
        int i = this.B;
        int i2 = i + 1;
        this.B = i2;
        bArr[i] = this.z;
        int c = C9394ok.c(j, bArr, i2);
        byte[] bArr2 = this.x;
        this.B = c + 1;
        bArr2[c] = this.z;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(BigInteger bigInteger) {
        h("write a number");
        if (bigInteger == null) {
            q();
        } else if (this.h) {
            o(bigInteger.toString());
        } else {
            b(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(double d) {
        if (this.h || (C9394ok.c(d) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.b(this.i))) {
            i(C9394ok.a(d, e(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
            return;
        }
        h("write a number");
        b(C9394ok.a(d, e(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void d(float f) {
        if (this.h || (C9394ok.e(f) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.b(this.i))) {
            i(C9394ok.e(f, e(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
            return;
        }
        h("write a number");
        b(C9394ok.e(f, e(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(BigDecimal bigDecimal) {
        h("write a number");
        if (bigDecimal == null) {
            q();
        } else if (this.h) {
            o(d(bigDecimal));
        } else {
            b(d(bigDecimal));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void d(String str) {
        h("write a number");
        if (str == null) {
            q();
        } else if (this.h) {
            o(str);
        } else {
            b(str);
        }
    }

    private final void o(String str) {
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr = this.x;
        int i = this.B;
        this.B = i + 1;
        bArr[i] = this.z;
        b(str);
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr2 = this.x;
        int i2 = this.B;
        this.B = i2 + 1;
        bArr2[i2] = this.z;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void a(boolean z) {
        h("write a boolean value");
        if (this.B + 5 >= this.w) {
            p();
        }
        byte[] bArr = z ? G : A;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.x, this.B, length);
        this.B += length;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void k() {
        h("write a null");
        q();
    }

    @Override // o.AbstractC9387od
    public final void h(String str) {
        byte b;
        int s = this.j.s();
        if (this.b != null) {
            e(str, s);
            return;
        }
        if (s == 1) {
            b = 44;
        } else if (s != 2) {
            if (s != 3) {
                if (s != 5) {
                    return;
                }
                f(str);
                return;
            }
            InterfaceC9327nW interfaceC9327nW = this.s;
            if (interfaceC9327nW != null) {
                byte[] c = interfaceC9327nW.c();
                if (c.length > 0) {
                    d(c);
                    return;
                }
                return;
            }
            return;
        } else {
            b = 58;
        }
        if (this.B >= this.w) {
            p();
        }
        byte[] bArr = this.x;
        int i = this.B;
        this.B = i + 1;
        bArr[i] = b;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() {
        p();
        if (this.C == null || !e(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.C.flush();
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        try {
            if (this.x != null && e(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
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
            p();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        this.B = 0;
        if (this.C != null) {
            try {
                if (!this.r.f() && !e(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                    if (e(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                        this.C.flush();
                    }
                }
                this.C.close();
            } catch (IOException | RuntimeException e2) {
                if (e != null) {
                    e2.addSuppressed(e);
                }
                throw e2;
            }
        }
        m();
        if (e != null) {
            throw e;
        }
    }

    @Override // o.AbstractC9387od
    public void m() {
        byte[] bArr = this.x;
        if (bArr != null && this.t) {
            this.x = null;
            this.r.a(bArr);
        }
        char[] cArr = this.y;
        if (cArr != null) {
            this.y = null;
            this.r.e(cArr);
        }
    }

    private final void d(byte[] bArr) {
        int length = bArr.length;
        if (this.B + length > this.w) {
            p();
            if (length > 512) {
                this.C.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.x, this.B, length);
        this.B += length;
    }

    private final void e(String str, boolean z) {
        if (z) {
            if (this.B >= this.w) {
                p();
            }
            byte[] bArr = this.x;
            int i = this.B;
            this.B = i + 1;
            bArr[i] = this.z;
        }
        int length = str.length();
        int i2 = 0;
        while (length > 0) {
            int min = Math.min(this.u, length);
            if (this.B + min > this.w) {
                p();
            }
            c(str, i2, min);
            i2 += min;
            length -= min;
        }
        if (z) {
            if (this.B >= this.w) {
                p();
            }
            byte[] bArr2 = this.x;
            int i3 = this.B;
            this.B = i3 + 1;
            bArr2[i3] = this.z;
        }
    }

    private final void g(char[] cArr, int i, int i2) {
        do {
            int min = Math.min(this.u, i2);
            if (this.B + min > this.w) {
                p();
            }
            f(cArr, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    private final void i(String str, int i, int i2) {
        do {
            int min = Math.min(this.u, i2);
            if (this.B + min > this.w) {
                p();
            }
            c(str, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    private final void f(char[] cArr, int i, int i2) {
        int i3 = i2 + i;
        int i4 = this.B;
        byte[] bArr = this.x;
        int[] iArr = this.p;
        while (i < i3) {
            char c = cArr[i];
            if (c > 127 || iArr[c] != 0) {
                break;
            }
            bArr[i4] = (byte) c;
            i++;
            i4++;
        }
        this.B = i4;
        if (i < i3) {
            if (this.k != null) {
                b(cArr, i, i3);
            } else if (this.q == 0) {
                i(cArr, i, i3);
            } else {
                j(cArr, i, i3);
            }
        }
    }

    private final void c(String str, int i, int i2) {
        int i3 = i2 + i;
        int i4 = this.B;
        byte[] bArr = this.x;
        int[] iArr = this.p;
        while (i < i3) {
            char charAt = str.charAt(i);
            if (charAt > 127 || iArr[charAt] != 0) {
                break;
            }
            bArr[i4] = (byte) charAt;
            i++;
            i4++;
        }
        this.B = i4;
        if (i < i3) {
            if (this.k != null) {
                b(str, i, i3);
            } else if (this.q == 0) {
                d(str, i, i3);
            } else {
                g(str, i, i3);
            }
        }
    }

    private final void i(char[] cArr, int i, int i2) {
        int h;
        if (this.B + ((i2 - i) * 6) > this.w) {
            p();
        }
        int i3 = this.B;
        byte[] bArr = this.x;
        int[] iArr = this.p;
        while (i < i2) {
            int i4 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                int i5 = iArr[c];
                if (i5 == 0) {
                    bArr[i3] = (byte) c;
                    i3++;
                } else {
                    if (i5 > 0) {
                        bArr[i3] = 92;
                        h = i3 + 2;
                        bArr[i3 + 1] = (byte) i5;
                    } else {
                        h = i(c, i3);
                    }
                    i3 = h;
                }
            } else if (c <= 2047) {
                bArr[i3] = (byte) ((c >> 6) | 192);
                int i6 = i3 + 2;
                bArr[i3 + 1] = (byte) ((c & '?') | 128);
                i3 = i6;
            } else {
                h = h(c, i3);
                i3 = h;
            }
            i = i4;
        }
        this.B = i3;
    }

    private final void d(String str, int i, int i2) {
        int h;
        if (this.B + ((i2 - i) * 6) > this.w) {
            p();
        }
        int i3 = this.B;
        byte[] bArr = this.x;
        int[] iArr = this.p;
        while (i < i2) {
            int i4 = i + 1;
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                int i5 = iArr[charAt];
                if (i5 == 0) {
                    bArr[i3] = (byte) charAt;
                    i3++;
                } else {
                    if (i5 > 0) {
                        bArr[i3] = 92;
                        h = i3 + 2;
                        bArr[i3 + 1] = (byte) i5;
                    } else {
                        h = i(charAt, i3);
                    }
                    i3 = h;
                }
            } else if (charAt <= 2047) {
                bArr[i3] = (byte) ((charAt >> 6) | 192);
                int i6 = i3 + 2;
                bArr[i3 + 1] = (byte) ((charAt & '?') | 128);
                i3 = i6;
            } else {
                h = h(charAt, i3);
                i3 = h;
            }
            i = i4;
        }
        this.B = i3;
    }

    private final void j(char[] cArr, int i, int i2) {
        int h;
        if (this.B + ((i2 - i) * 6) > this.w) {
            p();
        }
        int i3 = this.B;
        byte[] bArr = this.x;
        int[] iArr = this.p;
        int i4 = this.q;
        while (i < i2) {
            int i5 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                int i6 = iArr[c];
                if (i6 == 0) {
                    bArr[i3] = (byte) c;
                    i3++;
                } else {
                    if (i6 > 0) {
                        bArr[i3] = 92;
                        h = i3 + 2;
                        bArr[i3 + 1] = (byte) i6;
                    } else {
                        h = i(c, i3);
                    }
                    i3 = h;
                }
            } else {
                if (c > i4) {
                    h = i(c, i3);
                } else if (c <= 2047) {
                    bArr[i3] = (byte) ((c >> 6) | 192);
                    int i7 = i3 + 2;
                    bArr[i3 + 1] = (byte) ((c & '?') | 128);
                    i3 = i7;
                } else {
                    h = h(c, i3);
                }
                i3 = h;
            }
            i = i5;
        }
        this.B = i3;
    }

    private final void g(String str, int i, int i2) {
        int h;
        if (this.B + ((i2 - i) * 6) > this.w) {
            p();
        }
        int i3 = this.B;
        byte[] bArr = this.x;
        int[] iArr = this.p;
        int i4 = this.q;
        while (i < i2) {
            int i5 = i + 1;
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                int i6 = iArr[charAt];
                if (i6 == 0) {
                    bArr[i3] = (byte) charAt;
                    i3++;
                } else {
                    if (i6 > 0) {
                        bArr[i3] = 92;
                        h = i3 + 2;
                        bArr[i3 + 1] = (byte) i6;
                    } else {
                        h = i(charAt, i3);
                    }
                    i3 = h;
                }
            } else {
                if (charAt > i4) {
                    h = i(charAt, i3);
                } else if (charAt <= 2047) {
                    bArr[i3] = (byte) ((charAt >> 6) | 192);
                    int i7 = i3 + 2;
                    bArr[i3 + 1] = (byte) ((charAt & '?') | 128);
                    i3 = i7;
                } else {
                    h = h(charAt, i3);
                }
                i3 = h;
            }
            i = i5;
        }
        this.B = i3;
    }

    private final void b(char[] cArr, int i, int i2) {
        int h;
        if (this.B + ((i2 - i) * 6) > this.w) {
            p();
        }
        int i3 = this.B;
        byte[] bArr = this.x;
        int[] iArr = this.p;
        int i4 = this.q;
        if (i4 <= 0) {
            i4 = 65535;
        }
        CharacterEscapes characterEscapes = this.k;
        while (i < i2) {
            int i5 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                int i6 = iArr[c];
                if (i6 == 0) {
                    bArr[i3] = (byte) c;
                    i3++;
                } else {
                    if (i6 > 0) {
                        bArr[i3] = 92;
                        h = i3 + 2;
                        bArr[i3 + 1] = (byte) i6;
                    } else if (i6 == -2) {
                        InterfaceC9327nW e = characterEscapes.e(c);
                        if (e == null) {
                            c("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(c) + ", although was supposed to have one");
                        }
                        h = d(bArr, i3, e, i2 - i5);
                    } else {
                        h = i(c, i3);
                    }
                    i3 = h;
                }
            } else {
                if (c > i4) {
                    h = i(c, i3);
                } else {
                    InterfaceC9327nW e2 = characterEscapes.e(c);
                    if (e2 != null) {
                        h = d(bArr, i3, e2, i2 - i5);
                    } else if (c <= 2047) {
                        bArr[i3] = (byte) ((c >> 6) | 192);
                        int i7 = i3 + 2;
                        bArr[i3 + 1] = (byte) ((c & '?') | 128);
                        i3 = i7;
                    } else {
                        h = h(c, i3);
                    }
                }
                i3 = h;
            }
            i = i5;
        }
        this.B = i3;
    }

    private final void b(String str, int i, int i2) {
        int h;
        if (this.B + ((i2 - i) * 6) > this.w) {
            p();
        }
        int i3 = this.B;
        byte[] bArr = this.x;
        int[] iArr = this.p;
        int i4 = this.q;
        if (i4 <= 0) {
            i4 = 65535;
        }
        CharacterEscapes characterEscapes = this.k;
        while (i < i2) {
            int i5 = i + 1;
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                int i6 = iArr[charAt];
                if (i6 == 0) {
                    bArr[i3] = (byte) charAt;
                    i3++;
                } else {
                    if (i6 > 0) {
                        bArr[i3] = 92;
                        h = i3 + 2;
                        bArr[i3 + 1] = (byte) i6;
                    } else if (i6 == -2) {
                        InterfaceC9327nW e = characterEscapes.e(charAt);
                        if (e == null) {
                            c("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(charAt) + ", although was supposed to have one");
                        }
                        h = d(bArr, i3, e, i2 - i5);
                    } else {
                        h = i(charAt, i3);
                    }
                    i3 = h;
                }
            } else {
                if (charAt > i4) {
                    h = i(charAt, i3);
                } else {
                    InterfaceC9327nW e2 = characterEscapes.e(charAt);
                    if (e2 != null) {
                        h = d(bArr, i3, e2, i2 - i5);
                    } else if (charAt <= 2047) {
                        bArr[i3] = (byte) ((charAt >> 6) | 192);
                        int i7 = i3 + 2;
                        bArr[i3 + 1] = (byte) ((charAt & '?') | 128);
                        i3 = i7;
                    } else {
                        h = h(charAt, i3);
                    }
                }
                i3 = h;
            }
            i = i5;
        }
        this.B = i3;
    }

    private final int d(byte[] bArr, int i, InterfaceC9327nW interfaceC9327nW, int i2) {
        byte[] c = interfaceC9327nW.c();
        int length = c.length;
        if (length > 6) {
            return d(bArr, i, this.w, c, i2);
        }
        System.arraycopy(c, 0, bArr, i, length);
        return i + length;
    }

    private final int d(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int length = bArr2.length;
        if (i + length > i2) {
            this.B = i;
            p();
            i = this.B;
            if (length > bArr.length) {
                this.C.write(bArr2, 0, length);
                return i;
            }
        }
        System.arraycopy(bArr2, 0, bArr, i, length);
        int i4 = i + length;
        if ((i3 * 6) + i4 > i2) {
            this.B = i4;
            p();
            return this.B;
        }
        return i4;
    }

    protected final void d(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        int i3;
        int b;
        int i4 = this.w - 6;
        int d = base64Variant.d();
        loop0: while (true) {
            int i5 = d >> 2;
            while (i <= i2 - 3) {
                if (this.B > i4) {
                    p();
                }
                byte b2 = bArr[i];
                byte b3 = bArr[i + 1];
                i3 = i + 3;
                b = base64Variant.b((bArr[i + 2] & 255) | (((b2 << 8) | (b3 & 255)) << 8), this.x, this.B);
                this.B = b;
                i5--;
                if (i5 <= 0) {
                    break;
                }
                i = i3;
            }
            byte[] bArr2 = this.x;
            bArr2[b] = 92;
            this.B = b + 2;
            bArr2[b + 1] = 110;
            d = base64Variant.d();
            i = i3;
        }
        int i6 = i2 - i;
        if (i6 > 0) {
            if (this.B > i4) {
                p();
            }
            int i7 = bArr[i] << 16;
            if (i6 == 2) {
                i7 |= (bArr[i + 1] & 255) << 8;
            }
            this.B = base64Variant.c(i7, i6, this.x, this.B);
        }
    }

    protected final int d(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) {
        int a;
        int i2 = this.w - 6;
        int i3 = 2;
        int i4 = -3;
        int i5 = i;
        int d = base64Variant.d() >> 2;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i5 <= 2) {
                break;
            }
            if (i6 > i4) {
                i7 = a(inputStream, bArr, i6, i7, i5);
                if (i7 < 3) {
                    i6 = 0;
                    break;
                }
                i4 = i7 - 3;
                i6 = 0;
            }
            if (this.B > i2) {
                p();
            }
            int i8 = i6 + 3;
            i5 -= 3;
            int b = base64Variant.b((((bArr[i6] << 8) | (bArr[i6 + 1] & 255)) << 8) | (bArr[i6 + 2] & 255), this.x, this.B);
            this.B = b;
            d--;
            if (d <= 0) {
                byte[] bArr2 = this.x;
                bArr2[b] = 92;
                this.B = b + 2;
                bArr2[b + 1] = 110;
                d = base64Variant.d() >> 2;
            }
            i6 = i8;
        }
        if (i5 <= 0 || (a = a(inputStream, bArr, i6, i7, i5)) <= 0) {
            return i5;
        }
        if (this.B > i2) {
            p();
        }
        int i9 = bArr[0] << 16;
        if (1 < a) {
            i9 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        this.B = base64Variant.c(i9, i3, this.x, this.B);
        return i5 - i3;
    }

    protected final int a(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) {
        int i = this.w - 6;
        int i2 = 2;
        int i3 = -3;
        int i4 = 0;
        int d = base64Variant.d() >> 2;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i5 > i3) {
                i6 = a(inputStream, bArr, i5, i6, bArr.length);
                if (i6 < 3) {
                    break;
                }
                i3 = i6 - 3;
                i5 = i4;
            }
            if (this.B > i) {
                p();
            }
            int i8 = i5 + 3;
            i7 += 3;
            int b = base64Variant.b((((bArr[i5] << 8) | (bArr[i5 + 1] & 255)) << 8) | (bArr[i5 + 2] & 255), this.x, this.B);
            this.B = b;
            d--;
            if (d <= 0) {
                byte[] bArr2 = this.x;
                bArr2[b] = 92;
                this.B = b + 2;
                bArr2[b + 1] = 110;
                d = base64Variant.d() >> 2;
            }
            i5 = i8;
            i4 = 0;
        }
        if (i6 > 0) {
            if (this.B > i) {
                p();
            }
            int i9 = bArr[i4] << 16;
            if (1 < i6) {
                i9 |= (bArr[1] & 255) << 8;
            } else {
                i2 = 1;
            }
            int i10 = i7 + i2;
            this.B = base64Variant.c(i9, i2, this.x, this.B);
            return i10;
        }
        return i7;
    }

    private final int a(InputStream inputStream, byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i < i2) {
            bArr[i4] = bArr[i];
            i4++;
            i++;
        }
        int min = Math.min(i3, bArr.length);
        do {
            int i5 = min - i4;
            if (i5 == 0) {
                break;
            }
            int read = inputStream.read(bArr, i4, i5);
            if (read < 0) {
                return i4;
            }
            i4 += read;
        } while (i4 < 3);
        return i4;
    }

    private final int b(int i, char[] cArr, int i2, int i3) {
        if (i >= 55296 && i <= 57343) {
            if (i2 >= i3 || cArr == null) {
                c(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i)));
            } else {
                e(i, cArr[i2]);
            }
            return i2 + 1;
        }
        byte[] bArr = this.x;
        int i4 = this.B;
        bArr[i4] = (byte) ((i >> 12) | 224);
        bArr[i4 + 1] = (byte) (((i >> 6) & 63) | 128);
        this.B = i4 + 3;
        bArr[i4 + 2] = (byte) ((i & 63) | 128);
        return i2;
    }

    protected final void e(int i, int i2) {
        int a = a(i, i2);
        if (this.B + 4 > this.w) {
            p();
        }
        byte[] bArr = this.x;
        int i3 = this.B;
        bArr[i3] = (byte) ((a >> 18) | 240);
        bArr[i3 + 1] = (byte) (((a >> 12) & 63) | 128);
        bArr[i3 + 2] = (byte) (((a >> 6) & 63) | 128);
        this.B = i3 + 4;
        bArr[i3 + 3] = (byte) ((a & 63) | 128);
    }

    private final int h(int i, int i2) {
        byte[] r = r();
        byte[] bArr = this.x;
        if (i >= 55296 && i <= 57343) {
            bArr[i2] = 92;
            bArr[i2 + 1] = 117;
            bArr[i2 + 2] = r[(i >> 12) & 15];
            bArr[i2 + 3] = r[(i >> 8) & 15];
            bArr[i2 + 4] = r[(i >> 4) & 15];
            int i3 = i2 + 6;
            bArr[i2 + 5] = r[i & 15];
            return i3;
        }
        bArr[i2] = (byte) ((i >> 12) | 224);
        bArr[i2 + 1] = (byte) (((i >> 6) & 63) | 128);
        int i4 = i2 + 3;
        bArr[i2 + 2] = (byte) ((i & 63) | 128);
        return i4;
    }

    private final void q() {
        if (this.B + 4 >= this.w) {
            p();
        }
        System.arraycopy(H, 0, this.x, this.B, 4);
        this.B += 4;
    }

    private int i(int i, int i2) {
        int i3;
        byte[] bArr = this.x;
        byte[] r = r();
        bArr[i2] = 92;
        int i4 = i2 + 2;
        bArr[i2 + 1] = 117;
        if (i > 255) {
            int i5 = i >> 8;
            bArr[i4] = r[(i5 & PrivateKeyType.INVALID) >> 4];
            i3 = i2 + 4;
            bArr[i2 + 3] = r[i5 & 15];
            i &= PrivateKeyType.INVALID;
        } else {
            bArr[i4] = 48;
            i3 = i2 + 4;
            bArr[i2 + 3] = 48;
        }
        bArr[i3] = r[i >> 4];
        bArr[i3 + 1] = r[i & 15];
        return i3 + 2;
    }

    protected final void p() {
        int i = this.B;
        if (i > 0) {
            this.B = 0;
            this.C.write(this.x, 0, i);
        }
    }
}
