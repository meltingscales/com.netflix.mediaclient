package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.oP  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9373oP extends AbstractC9362oE {
    protected int A;
    protected int B;
    protected char C;
    protected int D;
    protected char[] u;
    protected InterfaceC9327nW v;
    protected char[] w;
    protected char[] y;
    protected final Writer z;
    protected static final char[] x = C9391oh.a(true);
    protected static final char[] t = C9391oh.a(false);

    private char[] p() {
        return this.m ? x : t;
    }

    private char[] r() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u'};
        this.w = cArr;
        return cArr;
    }

    public C9373oP(C9389of c9389of, int i, ObjectCodec objectCodec, Writer writer, char c) {
        super(c9389of, i, objectCodec);
        this.z = writer;
        char[] a = c9389of.a();
        this.y = a;
        this.D = a.length;
        this.C = c;
        if (c != '\"') {
            this.p = C9391oh.c(c);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void a(String str) {
        int b = this.j.b(str);
        if (b == 4) {
            c("Can not write a field name, expecting a value");
        }
        d(str, b == 1);
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator
    public void d(InterfaceC9327nW interfaceC9327nW) {
        int b = this.j.b(interfaceC9327nW.b());
        if (b == 4) {
            c("Can not write a field name, expecting a value");
        }
        e(interfaceC9327nW, b == 1);
    }

    protected final void d(String str, boolean z) {
        if (this.b != null) {
            c(str, z);
            return;
        }
        if (this.B + 1 >= this.D) {
            t();
        }
        if (z) {
            char[] cArr = this.y;
            int i = this.B;
            this.B = i + 1;
            cArr[i] = ',';
        }
        if (this.f13887o) {
            l(str);
            return;
        }
        char[] cArr2 = this.y;
        int i2 = this.B;
        this.B = i2 + 1;
        cArr2[i2] = this.C;
        l(str);
        if (this.B >= this.D) {
            t();
        }
        char[] cArr3 = this.y;
        int i3 = this.B;
        this.B = i3 + 1;
        cArr3[i3] = this.C;
    }

    protected final void e(InterfaceC9327nW interfaceC9327nW, boolean z) {
        if (this.b != null) {
            c(interfaceC9327nW, z);
            return;
        }
        if (this.B + 1 >= this.D) {
            t();
        }
        if (z) {
            char[] cArr = this.y;
            int i = this.B;
            this.B = i + 1;
            cArr[i] = ',';
        }
        if (this.f13887o) {
            char[] e = interfaceC9327nW.e();
            e(e, 0, e.length);
            return;
        }
        char[] cArr2 = this.y;
        int i2 = this.B;
        int i3 = i2 + 1;
        this.B = i3;
        cArr2[i2] = this.C;
        int c = interfaceC9327nW.c(cArr2, i3);
        if (c < 0) {
            f(interfaceC9327nW);
            return;
        }
        int i4 = this.B + c;
        this.B = i4;
        if (i4 >= this.D) {
            t();
        }
        char[] cArr3 = this.y;
        int i5 = this.B;
        this.B = i5 + 1;
        cArr3[i5] = this.C;
    }

    private final void f(InterfaceC9327nW interfaceC9327nW) {
        char[] e = interfaceC9327nW.e();
        e(e, 0, e.length);
        if (this.B >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i = this.B;
        this.B = i + 1;
        cArr[i] = this.C;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void n() {
        h("start an array");
        this.j = this.j.l();
        InterfaceC9326nV interfaceC9326nV = this.b;
        if (interfaceC9326nV != null) {
            interfaceC9326nV.h(this);
            return;
        }
        if (this.B >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i = this.B;
        this.B = i + 1;
        cArr[i] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void g(Object obj) {
        h("start an array");
        this.j = this.j.a(obj);
        InterfaceC9326nV interfaceC9326nV = this.b;
        if (interfaceC9326nV != null) {
            interfaceC9326nV.h(this);
            return;
        }
        if (this.B >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i = this.B;
        this.B = i + 1;
        cArr[i] = '[';
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
        if (this.B >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i2 = this.B;
        this.B = i2 + 1;
        cArr[i2] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void i() {
        if (!this.j.h()) {
            c("Current context not Array but " + this.j.k());
        }
        InterfaceC9326nV interfaceC9326nV = this.b;
        if (interfaceC9326nV != null) {
            interfaceC9326nV.b(this, this.j.d());
        } else {
            if (this.B >= this.D) {
                t();
            }
            char[] cArr = this.y;
            int i = this.B;
            this.B = i + 1;
            cArr[i] = ']';
        }
        this.j = this.j.m();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void l() {
        h("start an object");
        this.j = this.j.n();
        InterfaceC9326nV interfaceC9326nV = this.b;
        if (interfaceC9326nV != null) {
            interfaceC9326nV.j(this);
            return;
        }
        if (this.B >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i = this.B;
        this.B = i + 1;
        cArr[i] = '{';
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
        if (this.B >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i = this.B;
        this.B = i + 1;
        cArr[i] = '{';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void a(Object obj, int i) {
        i(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void o() {
        if (!this.j.g()) {
            c("Current context not Object but " + this.j.k());
        }
        InterfaceC9326nV interfaceC9326nV = this.b;
        if (interfaceC9326nV != null) {
            interfaceC9326nV.a(this, this.j.d());
        } else {
            if (this.B >= this.D) {
                t();
            }
            char[] cArr = this.y;
            int i = this.B;
            this.B = i + 1;
            cArr[i] = '}';
        }
        this.j = this.j.m();
    }

    protected final void c(String str, boolean z) {
        if (z) {
            this.b.a(this);
        } else {
            this.b.e(this);
        }
        if (this.f13887o) {
            l(str);
            return;
        }
        if (this.B >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i = this.B;
        this.B = i + 1;
        cArr[i] = this.C;
        l(str);
        if (this.B >= this.D) {
            t();
        }
        char[] cArr2 = this.y;
        int i2 = this.B;
        this.B = i2 + 1;
        cArr2[i2] = this.C;
    }

    protected final void c(InterfaceC9327nW interfaceC9327nW, boolean z) {
        if (z) {
            this.b.a(this);
        } else {
            this.b.e(this);
        }
        char[] e = interfaceC9327nW.e();
        if (this.f13887o) {
            e(e, 0, e.length);
            return;
        }
        if (this.B >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i = this.B;
        this.B = i + 1;
        cArr[i] = this.C;
        e(e, 0, e.length);
        if (this.B >= this.D) {
            t();
        }
        char[] cArr2 = this.y;
        int i2 = this.B;
        this.B = i2 + 1;
        cArr2[i2] = this.C;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void i(String str) {
        h("write a string");
        if (str == null) {
            q();
            return;
        }
        if (this.B >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i = this.B;
        this.B = i + 1;
        cArr[i] = this.C;
        l(str);
        if (this.B >= this.D) {
            t();
        }
        char[] cArr2 = this.y;
        int i2 = this.B;
        this.B = i2 + 1;
        cArr2[i2] = this.C;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void d(char[] cArr, int i, int i2) {
        h("write a string");
        if (this.B >= this.D) {
            t();
        }
        char[] cArr2 = this.y;
        int i3 = this.B;
        this.B = i3 + 1;
        cArr2[i3] = this.C;
        b(cArr, i, i2);
        if (this.B >= this.D) {
            t();
        }
        char[] cArr3 = this.y;
        int i4 = this.B;
        this.B = i4 + 1;
        cArr3[i4] = this.C;
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator
    public void e(InterfaceC9327nW interfaceC9327nW) {
        h("write a string");
        if (this.B >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i = this.B;
        int i2 = i + 1;
        this.B = i2;
        cArr[i] = this.C;
        int c = interfaceC9327nW.c(cArr, i2);
        if (c < 0) {
            g(interfaceC9327nW);
            return;
        }
        int i3 = this.B + c;
        this.B = i3;
        if (i3 >= this.D) {
            t();
        }
        char[] cArr2 = this.y;
        int i4 = this.B;
        this.B = i4 + 1;
        cArr2[i4] = this.C;
    }

    private void g(InterfaceC9327nW interfaceC9327nW) {
        char[] e = interfaceC9327nW.e();
        int length = e.length;
        if (length < 32) {
            if (length > this.D - this.B) {
                t();
            }
            System.arraycopy(e, 0, this.y, this.B, length);
            this.B += length;
        } else {
            t();
            this.z.write(e, 0, length);
        }
        if (this.B >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i = this.B;
        this.B = i + 1;
        cArr[i] = this.C;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(String str) {
        int length = str.length();
        int i = this.D - this.B;
        if (i == 0) {
            t();
            i = this.D - this.B;
        }
        if (i >= length) {
            str.getChars(0, length, this.y, this.B);
            this.B += length;
            return;
        }
        n(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(InterfaceC9327nW interfaceC9327nW) {
        int e = interfaceC9327nW.e(this.y, this.B);
        if (e < 0) {
            b(interfaceC9327nW.b());
        } else {
            this.B += e;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(char[] cArr, int i, int i2) {
        c(cArr, i, i2);
        if (i2 < 32) {
            if (i2 > this.D - this.B) {
                t();
            }
            System.arraycopy(cArr, i, this.y, this.B, i2);
            this.B += i2;
            return;
        }
        t();
        this.z.write(cArr, i, i2);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void d(char c) {
        if (this.B >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i = this.B;
        this.B = i + 1;
        cArr[i] = c;
    }

    private void n(String str) {
        int i = this.D;
        int i2 = this.B;
        int i3 = i - i2;
        str.getChars(0, i3, this.y, i2);
        this.B += i3;
        t();
        int length = str.length() - i3;
        while (true) {
            int i4 = this.D;
            if (length > i4) {
                int i5 = i3 + i4;
                str.getChars(i3, i5, this.y, 0);
                this.A = 0;
                this.B = i4;
                t();
                length -= i4;
                i3 = i5;
            } else {
                str.getChars(i3, i3 + length, this.y, 0);
                this.A = 0;
                this.B = length;
                return;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        d(bArr, i, i2);
        h("write a binary value");
        if (this.B >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i3 = this.B;
        this.B = i3 + 1;
        cArr[i3] = this.C;
        c(base64Variant, bArr, i, i2 + i);
        if (this.B >= this.D) {
            t();
        }
        char[] cArr2 = this.y;
        int i4 = this.B;
        this.B = i4 + 1;
        cArr2[i4] = this.C;
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator
    public int c(Base64Variant base64Variant, InputStream inputStream, int i) {
        h("write a binary value");
        if (this.B >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i2 = this.B;
        this.B = i2 + 1;
        cArr[i2] = this.C;
        byte[] c = this.r.c();
        try {
            if (i < 0) {
                i = b(base64Variant, inputStream, c);
            } else {
                int e = e(base64Variant, inputStream, c, i);
                if (e > 0) {
                    c("Too few bytes available: missing " + e + " bytes (out of " + i + ")");
                }
            }
            this.r.b(c);
            if (this.B >= this.D) {
                t();
            }
            char[] cArr2 = this.y;
            int i3 = this.B;
            this.B = i3 + 1;
            cArr2[i3] = this.C;
            return i;
        } catch (Throwable th) {
            this.r.b(c);
            throw th;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(short s) {
        h("write a number");
        if (this.h) {
            d(s);
            return;
        }
        if (this.B + 6 >= this.D) {
            t();
        }
        this.B = C9394ok.c(s, this.y, this.B);
    }

    private void d(short s) {
        if (this.B + 8 >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i = this.B;
        int i2 = i + 1;
        this.B = i2;
        cArr[i] = this.C;
        int c = C9394ok.c(s, cArr, i2);
        char[] cArr2 = this.y;
        this.B = c + 1;
        cArr2[c] = this.C;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void c(int i) {
        h("write a number");
        if (this.h) {
            a(i);
            return;
        }
        if (this.B + 11 >= this.D) {
            t();
        }
        this.B = C9394ok.c(i, this.y, this.B);
    }

    private void a(int i) {
        if (this.B + 13 >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i2 = this.B;
        int i3 = i2 + 1;
        this.B = i3;
        cArr[i2] = this.C;
        int c = C9394ok.c(i, cArr, i3);
        char[] cArr2 = this.y;
        this.B = c + 1;
        cArr2[c] = this.C;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(long j) {
        h("write a number");
        if (this.h) {
            e(j);
            return;
        }
        if (this.B + 21 >= this.D) {
            t();
        }
        this.B = C9394ok.e(j, this.y, this.B);
    }

    private void e(long j) {
        if (this.B + 23 >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i = this.B;
        int i2 = i + 1;
        this.B = i2;
        cArr[i] = this.C;
        int e = C9394ok.e(j, cArr, i2);
        char[] cArr2 = this.y;
        this.B = e + 1;
        cArr2[e] = this.C;
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
        if (this.h || (C9394ok.c(d) && e(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            i(C9394ok.a(d, e(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
            return;
        }
        h("write a number");
        b(C9394ok.a(d, e(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void d(float f) {
        if (this.h || (C9394ok.e(f) && e(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
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

    private void o(String str) {
        if (this.B >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i = this.B;
        this.B = i + 1;
        cArr[i] = this.C;
        b(str);
        if (this.B >= this.D) {
            t();
        }
        char[] cArr2 = this.y;
        int i2 = this.B;
        this.B = i2 + 1;
        cArr2[i2] = this.C;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void a(boolean z) {
        int i;
        h("write a boolean value");
        if (this.B + 5 >= this.D) {
            t();
        }
        int i2 = this.B;
        char[] cArr = this.y;
        if (z) {
            cArr[i2] = 't';
            cArr[i2 + 1] = 'r';
            cArr[i2 + 2] = 'u';
            i = i2 + 3;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            cArr[i2 + 1] = 'a';
            cArr[i2 + 2] = 'l';
            cArr[i2 + 3] = 's';
            i = i2 + 4;
            cArr[i] = 'e';
        }
        this.B = i + 1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void k() {
        h("write a null");
        q();
    }

    @Override // o.AbstractC9387od
    public final void h(String str) {
        char c;
        int s = this.j.s();
        if (this.b != null) {
            e(str, s);
            return;
        }
        if (s == 1) {
            c = ',';
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
                b(interfaceC9327nW.b());
                return;
            }
            return;
        } else {
            c = ':';
        }
        if (this.B >= this.D) {
            t();
        }
        char[] cArr = this.y;
        int i = this.B;
        this.B = i + 1;
        cArr[i] = c;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() {
        t();
        if (this.z == null || !e(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.z.flush();
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        try {
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
            t();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        this.A = 0;
        this.B = 0;
        if (this.z != null) {
            try {
                if (!this.r.f() && !e(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                    if (e(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                        this.z.flush();
                    }
                }
                this.z.close();
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
        char[] cArr = this.y;
        if (cArr != null) {
            this.y = null;
            this.r.e(cArr);
        }
        char[] cArr2 = this.u;
        if (cArr2 != null) {
            this.u = null;
            this.r.a(cArr2);
        }
    }

    private void l(String str) {
        int length = str.length();
        int i = this.D;
        if (length > i) {
            j(str);
            return;
        }
        if (this.B + length > i) {
            t();
        }
        str.getChars(0, length, this.y, this.B);
        if (this.k != null) {
            i(length);
            return;
        }
        int i2 = this.q;
        if (i2 != 0) {
            i(length, i2);
        } else {
            f(length);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r3 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        r6.z.write(r2, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        r2 = r6.y;
        r3 = r6.B;
        r6.B = r3 + 1;
        r2 = r2[r3];
        b(r2, r7[r2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        r4 = r6.A;
        r3 = r3 - r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f(int r7) {
        /*
            r6 = this;
            int r0 = r6.B
            int r0 = r0 + r7
            int[] r7 = r6.p
            int r1 = r7.length
        L6:
            int r2 = r6.B
            if (r2 >= r0) goto L36
        La:
            char[] r2 = r6.y
            int r3 = r6.B
            char r4 = r2[r3]
            if (r4 >= r1) goto L30
            r4 = r7[r4]
            if (r4 == 0) goto L30
            int r4 = r6.A
            int r3 = r3 - r4
            if (r3 <= 0) goto L20
            java.io.Writer r5 = r6.z
            r5.write(r2, r4, r3)
        L20:
            char[] r2 = r6.y
            int r3 = r6.B
            int r4 = r3 + 1
            r6.B = r4
            char r2 = r2[r3]
            r3 = r7[r2]
            r6.b(r2, r3)
            goto L6
        L30:
            int r3 = r3 + 1
            r6.B = r3
            if (r3 < r0) goto La
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9373oP.f(int):void");
    }

    private void j(String str) {
        t();
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = this.D;
            if (i + i2 > length) {
                i2 = length - i;
            }
            int i3 = i + i2;
            str.getChars(i, i3, this.y, 0);
            if (this.k != null) {
                h(i2);
            } else {
                int i4 = this.q;
                if (i4 != 0) {
                    e(i2, i4);
                } else {
                    g(i2);
                }
            }
            if (i3 >= length) {
                return;
            }
            i = i3;
        }
    }

    private void g(int i) {
        char[] cArr;
        char c;
        int[] iArr = this.p;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            do {
                cArr = this.y;
                c = cArr[i2];
                if (c < length && iArr[c] != 0) {
                    break;
                }
                i2++;
            } while (i2 < i);
            int i4 = i2 - i3;
            if (i4 > 0) {
                this.z.write(cArr, i3, i4);
                if (i2 >= i) {
                    return;
                }
            }
            i2++;
            i3 = b(this.y, i2, i, c, iArr[c]);
        }
    }

    private void b(char[] cArr, int i, int i2) {
        if (this.k != null) {
            a(cArr, i, i2);
            return;
        }
        int i3 = this.q;
        if (i3 != 0) {
            e(cArr, i, i2, i3);
            return;
        }
        int i4 = i2 + i;
        int[] iArr = this.p;
        int length = iArr.length;
        while (i < i4) {
            int i5 = i;
            do {
                char c = cArr[i5];
                if (c < length && iArr[c] != 0) {
                    break;
                }
                i5++;
            } while (i5 < i4);
            int i6 = i5 - i;
            if (i6 < 32) {
                if (this.B + i6 > this.D) {
                    t();
                }
                if (i6 > 0) {
                    System.arraycopy(cArr, i, this.y, this.B, i6);
                    this.B += i6;
                }
            } else {
                t();
                this.z.write(cArr, i, i6);
            }
            if (i5 >= i4) {
                return;
            }
            i = i5 + 1;
            char c2 = cArr[i5];
            e(c2, iArr[c2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i(int r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.B
            int r0 = r0 + r9
            int[] r9 = r8.p
            int r1 = r9.length
            int r2 = r10 + 1
            int r1 = java.lang.Math.min(r1, r2)
        Lc:
            int r2 = r8.B
            if (r2 >= r0) goto L3a
        L10:
            char[] r2 = r8.y
            int r3 = r8.B
            char r4 = r2[r3]
            if (r4 >= r1) goto L1d
            r5 = r9[r4]
            if (r5 == 0) goto L34
            goto L20
        L1d:
            if (r4 <= r10) goto L34
            r5 = -1
        L20:
            int r6 = r8.A
            int r3 = r3 - r6
            if (r3 <= 0) goto L2a
            java.io.Writer r7 = r8.z
            r7.write(r2, r6, r3)
        L2a:
            int r2 = r8.B
            int r2 = r2 + 1
            r8.B = r2
            r8.b(r4, r5)
            goto Lc
        L34:
            int r3 = r3 + 1
            r8.B = r3
            if (r3 < r0) goto L10
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9373oP.i(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0021 A[EDGE_INSN: B:26:0x0021->B:13:0x0021 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(int r13, int r14) {
        /*
            r12 = this;
            int[] r0 = r12.p
            int r1 = r0.length
            int r2 = r14 + 1
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            r3 = r2
            r4 = r3
        Lc:
            if (r2 >= r13) goto L3a
        Le:
            char[] r5 = r12.y
            char r10 = r5[r2]
            if (r10 >= r1) goto L19
            r3 = r0[r10]
            if (r3 == 0) goto L1d
            goto L21
        L19:
            if (r10 <= r14) goto L1d
            r3 = -1
            goto L21
        L1d:
            int r2 = r2 + 1
            if (r2 < r13) goto Le
        L21:
            int r6 = r2 - r4
            if (r6 <= 0) goto L2d
            java.io.Writer r7 = r12.z
            r7.write(r5, r4, r6)
            if (r2 < r13) goto L2d
            goto L3a
        L2d:
            int r2 = r2 + 1
            char[] r7 = r12.y
            r6 = r12
            r8 = r2
            r9 = r13
            r11 = r3
            int r4 = r6.b(r7, r8, r9, r10, r11)
            goto Lc
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9373oP.e(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x001f A[EDGE_INSN: B:30:0x001f->B:14:0x001f ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(char[] r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            int r11 = r11 + r10
            int[] r0 = r8.p
            int r1 = r0.length
            int r2 = r12 + 1
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
        Lb:
            if (r10 >= r11) goto L4f
            r3 = r10
        Le:
            char r4 = r9[r3]
            if (r4 >= r1) goto L17
            r2 = r0[r4]
            if (r2 == 0) goto L1b
            goto L1f
        L17:
            if (r4 <= r12) goto L1b
            r2 = -1
            goto L1f
        L1b:
            int r3 = r3 + 1
            if (r3 < r11) goto Le
        L1f:
            int r5 = r3 - r10
            r6 = 32
            if (r5 >= r6) goto L3e
            int r6 = r8.B
            int r6 = r6 + r5
            int r7 = r8.D
            if (r6 <= r7) goto L2f
            r8.t()
        L2f:
            if (r5 <= 0) goto L46
            char[] r6 = r8.y
            int r7 = r8.B
            java.lang.System.arraycopy(r9, r10, r6, r7, r5)
            int r10 = r8.B
            int r10 = r10 + r5
            r8.B = r10
            goto L46
        L3e:
            r8.t()
            java.io.Writer r6 = r8.z
            r6.write(r9, r10, r5)
        L46:
            if (r3 < r11) goto L49
            goto L4f
        L49:
            int r10 = r3 + 1
            r8.e(r4, r2)
            goto Lb
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9373oP.e(char[], int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i(int r12) {
        /*
            r11 = this;
            int r0 = r11.B
            int r0 = r0 + r12
            int[] r12 = r11.p
            int r1 = r11.q
            r2 = 1
            if (r1 >= r2) goto Ld
            r1 = 65535(0xffff, float:9.1834E-41)
        Ld:
            int r3 = r12.length
            int r4 = r1 + 1
            int r3 = java.lang.Math.min(r3, r4)
            com.fasterxml.jackson.core.io.CharacterEscapes r4 = r11.k
        L16:
            int r5 = r11.B
            if (r5 >= r0) goto L52
        L1a:
            char[] r5 = r11.y
            int r6 = r11.B
            char r5 = r5[r6]
            if (r5 >= r3) goto L27
            r6 = r12[r5]
            if (r6 == 0) goto L4b
            goto L34
        L27:
            if (r5 <= r1) goto L2b
            r6 = -1
            goto L34
        L2b:
            o.nW r6 = r4.e(r5)
            r11.v = r6
            if (r6 == 0) goto L4b
            r6 = -2
        L34:
            int r7 = r11.B
            int r8 = r11.A
            int r7 = r7 - r8
            if (r7 <= 0) goto L42
            java.io.Writer r9 = r11.z
            char[] r10 = r11.y
            r9.write(r10, r8, r7)
        L42:
            int r7 = r11.B
            int r7 = r7 + r2
            r11.B = r7
            r11.b(r5, r6)
            goto L16
        L4b:
            int r5 = r11.B
            int r5 = r5 + r2
            r11.B = r5
            if (r5 < r0) goto L1a
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9373oP.i(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0035 A[EDGE_INSN: B:31:0x0035->B:19:0x0035 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void h(int r15) {
        /*
            r14 = this;
            int[] r0 = r14.p
            int r1 = r14.q
            r2 = 1
            if (r1 >= r2) goto La
            r1 = 65535(0xffff, float:9.1834E-41)
        La:
            int r2 = r0.length
            int r3 = r1 + 1
            int r2 = java.lang.Math.min(r2, r3)
            com.fasterxml.jackson.core.io.CharacterEscapes r3 = r14.k
            r4 = 0
            r5 = r4
            r6 = r5
        L16:
            if (r4 >= r15) goto L50
        L18:
            char[] r7 = r14.y
            char r12 = r7[r4]
            if (r12 >= r2) goto L23
            r5 = r0[r12]
            if (r5 == 0) goto L31
            goto L35
        L23:
            if (r12 <= r1) goto L27
            r5 = -1
            goto L35
        L27:
            o.nW r7 = r3.e(r12)
            r14.v = r7
            if (r7 == 0) goto L31
            r5 = -2
            goto L35
        L31:
            int r4 = r4 + 1
            if (r4 < r15) goto L18
        L35:
            int r7 = r4 - r6
            if (r7 <= 0) goto L43
            java.io.Writer r8 = r14.z
            char[] r9 = r14.y
            r8.write(r9, r6, r7)
            if (r4 < r15) goto L43
            goto L50
        L43:
            int r4 = r4 + 1
            char[] r9 = r14.y
            r8 = r14
            r10 = r4
            r11 = r15
            r13 = r5
            int r6 = r8.b(r9, r10, r11, r12, r13)
            goto L16
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9373oP.h(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0033 A[EDGE_INSN: B:34:0x0033->B:20:0x0033 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(char[] r11, int r12, int r13) {
        /*
            r10 = this;
            int r13 = r13 + r12
            int[] r0 = r10.p
            int r1 = r10.q
            r2 = 1
            if (r1 >= r2) goto Lb
            r1 = 65535(0xffff, float:9.1834E-41)
        Lb:
            int r2 = r0.length
            int r3 = r1 + 1
            int r2 = java.lang.Math.min(r2, r3)
            com.fasterxml.jackson.core.io.CharacterEscapes r3 = r10.k
            r4 = 0
        L15:
            if (r12 >= r13) goto L63
            r5 = r12
        L18:
            char r6 = r11[r5]
            if (r6 >= r2) goto L21
            r4 = r0[r6]
            if (r4 == 0) goto L2f
            goto L33
        L21:
            if (r6 <= r1) goto L25
            r4 = -1
            goto L33
        L25:
            o.nW r7 = r3.e(r6)
            r10.v = r7
            if (r7 == 0) goto L2f
            r4 = -2
            goto L33
        L2f:
            int r5 = r5 + 1
            if (r5 < r13) goto L18
        L33:
            int r7 = r5 - r12
            r8 = 32
            if (r7 >= r8) goto L52
            int r8 = r10.B
            int r8 = r8 + r7
            int r9 = r10.D
            if (r8 <= r9) goto L43
            r10.t()
        L43:
            if (r7 <= 0) goto L5a
            char[] r8 = r10.y
            int r9 = r10.B
            java.lang.System.arraycopy(r11, r12, r8, r9, r7)
            int r12 = r10.B
            int r12 = r12 + r7
            r10.B = r12
            goto L5a
        L52:
            r10.t()
            java.io.Writer r8 = r10.z
            r8.write(r11, r12, r7)
        L5a:
            if (r5 < r13) goto L5d
            goto L63
        L5d:
            int r12 = r5 + 1
            r10.e(r6, r4)
            goto L15
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9373oP.a(char[], int, int):void");
    }

    protected final void c(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        int i3;
        int a;
        int i4 = this.D - 6;
        int d = base64Variant.d();
        loop0: while (true) {
            int i5 = d >> 2;
            while (i <= i2 - 3) {
                if (this.B > i4) {
                    t();
                }
                byte b = bArr[i];
                byte b2 = bArr[i + 1];
                i3 = i + 3;
                a = base64Variant.a((bArr[i + 2] & 255) | (((b << 8) | (b2 & 255)) << 8), this.y, this.B);
                this.B = a;
                i5--;
                if (i5 <= 0) {
                    break;
                }
                i = i3;
            }
            char[] cArr = this.y;
            cArr[a] = '\\';
            this.B = a + 2;
            cArr[a + 1] = 'n';
            d = base64Variant.d();
            i = i3;
        }
        int i6 = i2 - i;
        if (i6 > 0) {
            if (this.B > i4) {
                t();
            }
            int i7 = bArr[i] << 16;
            if (i6 == 2) {
                i7 |= (bArr[i + 1] & 255) << 8;
            }
            this.B = base64Variant.a(i7, i6, this.y, this.B);
        }
    }

    protected final int e(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) {
        int d;
        int i2 = this.D - 6;
        int i3 = 2;
        int i4 = -3;
        int i5 = i;
        int d2 = base64Variant.d() >> 2;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i5 <= 2) {
                break;
            }
            if (i6 > i4) {
                i7 = d(inputStream, bArr, i6, i7, i5);
                if (i7 < 3) {
                    i6 = 0;
                    break;
                }
                i4 = i7 - 3;
                i6 = 0;
            }
            if (this.B > i2) {
                t();
            }
            int i8 = i6 + 3;
            i5 -= 3;
            int a = base64Variant.a((((bArr[i6] << 8) | (bArr[i6 + 1] & 255)) << 8) | (bArr[i6 + 2] & 255), this.y, this.B);
            this.B = a;
            d2--;
            if (d2 <= 0) {
                char[] cArr = this.y;
                cArr[a] = '\\';
                this.B = a + 2;
                cArr[a + 1] = 'n';
                d2 = base64Variant.d() >> 2;
            }
            i6 = i8;
        }
        if (i5 <= 0 || (d = d(inputStream, bArr, i6, i7, i5)) <= 0) {
            return i5;
        }
        if (this.B > i2) {
            t();
        }
        int i9 = bArr[0] << 16;
        if (1 < d) {
            i9 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        this.B = base64Variant.a(i9, i3, this.y, this.B);
        return i5 - i3;
    }

    protected final int b(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) {
        int i = this.D - 6;
        int i2 = 2;
        int i3 = -3;
        int i4 = 0;
        int d = base64Variant.d() >> 2;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i5 > i3) {
                i6 = d(inputStream, bArr, i5, i6, bArr.length);
                if (i6 < 3) {
                    break;
                }
                i3 = i6 - 3;
                i5 = i4;
            }
            if (this.B > i) {
                t();
            }
            int i8 = i5 + 3;
            i7 += 3;
            int a = base64Variant.a((((bArr[i5] << 8) | (bArr[i5 + 1] & 255)) << 8) | (bArr[i5 + 2] & 255), this.y, this.B);
            this.B = a;
            d--;
            if (d <= 0) {
                char[] cArr = this.y;
                cArr[a] = '\\';
                this.B = a + 2;
                cArr[a + 1] = 'n';
                d = base64Variant.d() >> 2;
            }
            i5 = i8;
            i4 = 0;
        }
        if (i6 > 0) {
            if (this.B > i) {
                t();
            }
            int i9 = bArr[i4] << 16;
            if (1 < i6) {
                i9 |= (bArr[1] & 255) << 8;
            } else {
                i2 = 1;
            }
            int i10 = i7 + i2;
            this.B = base64Variant.a(i9, i2, this.y, this.B);
            return i10;
        }
        return i7;
    }

    private int d(InputStream inputStream, byte[] bArr, int i, int i2, int i3) {
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

    private final void q() {
        if (this.B + 4 >= this.D) {
            t();
        }
        int i = this.B;
        char[] cArr = this.y;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.B = i + 4;
    }

    private void b(char c, int i) {
        String b;
        int i2;
        if (i >= 0) {
            int i3 = this.B;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.A = i4;
                char[] cArr = this.y;
                cArr[i4] = '\\';
                cArr[i3 - 1] = (char) i;
                return;
            }
            char[] cArr2 = this.w;
            if (cArr2 == null) {
                cArr2 = r();
            }
            this.A = this.B;
            cArr2[1] = (char) i;
            this.z.write(cArr2, 0, 2);
        } else if (i != -2) {
            char[] p = p();
            int i5 = this.B;
            if (i5 < 6) {
                char[] cArr3 = this.w;
                if (cArr3 == null) {
                    cArr3 = r();
                }
                this.A = this.B;
                if (c > 255) {
                    int i6 = c >> '\b';
                    cArr3[10] = p[(i6 & PrivateKeyType.INVALID) >> 4];
                    cArr3[11] = p[i6 & 15];
                    cArr3[12] = p[(c & 255) >> 4];
                    cArr3[13] = p[c & 15];
                    this.z.write(cArr3, 8, 6);
                    return;
                }
                cArr3[6] = p[c >> 4];
                cArr3[7] = p[c & 15];
                this.z.write(cArr3, 2, 6);
                return;
            }
            char[] cArr4 = this.y;
            int i7 = i5 - 6;
            this.A = i7;
            cArr4[i7] = '\\';
            cArr4[i5 - 5] = 'u';
            if (c > 255) {
                int i8 = c >> '\b';
                cArr4[i5 - 4] = p[(i8 & PrivateKeyType.INVALID) >> 4];
                i2 = i5 - 3;
                cArr4[i2] = p[i8 & 15];
                c = (char) (c & 255);
            } else {
                cArr4[i5 - 4] = '0';
                i2 = i5 - 3;
                cArr4[i2] = '0';
            }
            cArr4[i2 + 1] = p[c >> 4];
            cArr4[i2 + 2] = p[c & 15];
        } else {
            InterfaceC9327nW interfaceC9327nW = this.v;
            if (interfaceC9327nW == null) {
                b = this.k.e(c).b();
            } else {
                b = interfaceC9327nW.b();
                this.v = null;
            }
            int length = b.length();
            int i9 = this.B;
            if (i9 >= length) {
                int i10 = i9 - length;
                this.A = i10;
                b.getChars(0, length, this.y, i10);
                return;
            }
            this.A = i9;
            this.z.write(b);
        }
    }

    private int b(char[] cArr, int i, int i2, char c, int i3) {
        String b;
        int i4;
        if (i3 >= 0) {
            if (i > 1 && i < i2) {
                int i5 = i - 2;
                cArr[i5] = '\\';
                cArr[i - 1] = (char) i3;
                return i5;
            }
            char[] cArr2 = this.w;
            if (cArr2 == null) {
                cArr2 = r();
            }
            cArr2[1] = (char) i3;
            this.z.write(cArr2, 0, 2);
            return i;
        } else if (i3 != -2) {
            char[] p = p();
            if (i > 5 && i < i2) {
                cArr[i - 6] = '\\';
                int i6 = i - 4;
                cArr[i - 5] = 'u';
                if (c > 255) {
                    int i7 = c >> '\b';
                    cArr[i6] = p[(i7 & PrivateKeyType.INVALID) >> 4];
                    i4 = i - 2;
                    cArr[i - 3] = p[i7 & 15];
                    c = (char) (c & 255);
                } else {
                    cArr[i6] = '0';
                    i4 = i - 2;
                    cArr[i - 3] = '0';
                }
                cArr[i4] = p[c >> 4];
                cArr[i4 + 1] = p[c & 15];
                return i4 - 4;
            }
            char[] cArr3 = this.w;
            if (cArr3 == null) {
                cArr3 = r();
            }
            this.A = this.B;
            if (c > 255) {
                int i8 = c >> '\b';
                cArr3[10] = p[(i8 & PrivateKeyType.INVALID) >> 4];
                cArr3[11] = p[i8 & 15];
                cArr3[12] = p[(c & 255) >> 4];
                cArr3[13] = p[c & 15];
                this.z.write(cArr3, 8, 6);
                return i;
            }
            cArr3[6] = p[c >> 4];
            cArr3[7] = p[c & 15];
            this.z.write(cArr3, 2, 6);
            return i;
        } else {
            InterfaceC9327nW interfaceC9327nW = this.v;
            if (interfaceC9327nW == null) {
                b = this.k.e(c).b();
            } else {
                b = interfaceC9327nW.b();
                this.v = null;
            }
            int length = b.length();
            if (i >= length && i < i2) {
                int i9 = i - length;
                b.getChars(0, length, cArr, i9);
                return i9;
            }
            this.z.write(b);
            return i;
        }
    }

    private void e(char c, int i) {
        String b;
        int i2;
        if (i >= 0) {
            if (this.B + 2 > this.D) {
                t();
            }
            char[] cArr = this.y;
            int i3 = this.B;
            cArr[i3] = '\\';
            this.B = i3 + 2;
            cArr[i3 + 1] = (char) i;
        } else if (i != -2) {
            if (this.B + 5 >= this.D) {
                t();
            }
            int i4 = this.B;
            char[] cArr2 = this.y;
            char[] p = p();
            cArr2[i4] = '\\';
            int i5 = i4 + 2;
            cArr2[i4 + 1] = 'u';
            if (c > 255) {
                int i6 = c >> '\b';
                cArr2[i5] = p[(i6 & PrivateKeyType.INVALID) >> 4];
                i2 = i4 + 4;
                cArr2[i4 + 3] = p[i6 & 15];
                c = (char) (c & 255);
            } else {
                cArr2[i5] = '0';
                i2 = i4 + 4;
                cArr2[i4 + 3] = '0';
            }
            cArr2[i2] = p[c >> 4];
            cArr2[i2 + 1] = p[c & 15];
            this.B = i2 + 2;
        } else {
            InterfaceC9327nW interfaceC9327nW = this.v;
            if (interfaceC9327nW == null) {
                b = this.k.e(c).b();
            } else {
                b = interfaceC9327nW.b();
                this.v = null;
            }
            int length = b.length();
            if (this.B + length > this.D) {
                t();
                if (length > this.D) {
                    this.z.write(b);
                    return;
                }
            }
            b.getChars(0, length, this.y, this.B);
            this.B += length;
        }
    }

    protected void t() {
        int i = this.B;
        int i2 = this.A;
        int i3 = i - i2;
        if (i3 > 0) {
            this.A = 0;
            this.B = 0;
            this.z.write(this.y, i2, i3);
        }
    }
}
