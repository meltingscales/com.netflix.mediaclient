package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.netflix.ale.AleCryptoBouncyCastle;
import java.io.InputStream;
import java.math.BigDecimal;

/* renamed from: o.od  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9387od extends JsonGenerator {
    protected static final int e = (JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.c() | JsonGenerator.Feature.ESCAPE_NON_ASCII.c()) | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.c();
    protected boolean f;
    protected ObjectCodec g;
    public boolean h;
    public int i;
    public C9371oN j;

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public AbstractC9323nS h() {
        return this.j;
    }

    protected abstract void h(String str);

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int j() {
        return this.i;
    }

    protected abstract void m();

    public AbstractC9387od(int i, ObjectCodec objectCodec) {
        this.i = i;
        this.g = objectCodec;
        this.j = C9371oN.c(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.b(i) ? C9366oI.e(this) : null);
        this.h = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.b(i);
    }

    public AbstractC9387od(int i, ObjectCodec objectCodec, C9371oN c9371oN) {
        this.i = i;
        this.g = objectCodec;
        this.j = c9371oN;
        this.h = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.b(i);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(Object obj) {
        C9371oN c9371oN = this.j;
        if (c9371oN != null) {
            c9371oN.b(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean e(JsonGenerator.Feature feature) {
        return (feature.c() & this.i) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator a(JsonGenerator.Feature feature) {
        int c = feature.c();
        this.i &= ~c;
        if ((c & e) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this.h = false;
            } else if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                b(0);
            } else if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION) {
                this.j = this.j.d((C9366oI) null);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    @Deprecated
    public JsonGenerator d(int i) {
        int i2 = this.i ^ i;
        this.i = i;
        if (i2 != 0) {
            c(i, i2);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator d(int i, int i2) {
        int i3 = this.i;
        int i4 = (i & i2) | ((~i2) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this.i = i4;
            c(i4, i5);
        }
        return this;
    }

    public void c(int i, int i2) {
        if ((e & i2) == 0) {
            return;
        }
        this.h = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.b(i);
        JsonGenerator.Feature feature = JsonGenerator.Feature.ESCAPE_NON_ASCII;
        if (feature.b(i2)) {
            if (feature.b(i)) {
                b(127);
            } else {
                b(0);
            }
        }
        JsonGenerator.Feature feature2 = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
        if (feature2.b(i2)) {
            if (feature2.b(i)) {
                if (this.j.o() == null) {
                    this.j = this.j.d(C9366oI.e(this));
                    return;
                }
                return;
            }
            this.j = this.j.d((C9366oI) null);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void i(Object obj) {
        l();
        if (obj != null) {
            e(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void d(InterfaceC9327nW interfaceC9327nW) {
        a(interfaceC9327nW.b());
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(InterfaceC9327nW interfaceC9327nW) {
        i(interfaceC9327nW.b());
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void g(String str) {
        h("write raw value");
        b(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void c(InterfaceC9327nW interfaceC9327nW) {
        h("write raw value");
        b(interfaceC9327nW);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int c(Base64Variant base64Variant, InputStream inputStream, int i) {
        a();
        return 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void a(Object obj) {
        if (obj == null) {
            k();
            return;
        }
        ObjectCodec objectCodec = this.g;
        if (objectCodec != null) {
            objectCodec.writeValue(this, obj);
        } else {
            d(obj);
        }
    }

    public String d(BigDecimal bigDecimal) {
        if (JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.b(this.i)) {
            int scale = bigDecimal.scale();
            if (scale < -9999 || scale > 9999) {
                c(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(scale), 9999, 9999));
            }
            return bigDecimal.toPlainString();
        }
        return bigDecimal.toString();
    }

    public final int a(int i, int i2) {
        if (i2 < 56320 || i2 > 57343) {
            c(String.format("Incomplete surrogate pair: first char 0x%04X, second 0x%04X", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        return ((i - 55296) << 10) + AleCryptoBouncyCastle.MAX_RANDOM_BYTES + (i2 - 56320);
    }

    public void d(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            c("Invalid `byte[]` argument: `null`");
        }
        int length = bArr.length;
        int i3 = i + i2;
        if ((i3 | i | i2 | (length - i3)) < 0) {
            c(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `byte[]` of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(length)));
        }
    }

    public void c(char[] cArr, int i, int i2) {
        if (cArr == null) {
            c("Invalid `char[]` argument: `null`");
        }
        int length = cArr.length;
        int i3 = i + i2;
        if ((i3 | i | i2 | (length - i3)) < 0) {
            c(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `char[]` of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(length)));
        }
    }

    public void e(String str, int i, int i2) {
        if (str == null) {
            c("Invalid `String` argument: `null`");
        }
        int length = str.length();
        int i3 = i + i2;
        if ((i3 | i | i2 | (length - i3)) < 0) {
            c(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `String` of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(length)));
        }
    }
}
