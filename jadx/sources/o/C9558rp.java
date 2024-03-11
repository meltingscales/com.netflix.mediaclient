package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.node.BinaryNode;
import com.fasterxml.jackson.databind.node.NumericNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TextNode;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import o.AbstractC9557ro;

/* renamed from: o.rp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9558rp extends AbstractC9384oa {
    protected boolean b;
    protected JsonToken d;
    protected AbstractC9557ro g;
    protected ObjectCodec h;
    protected boolean i;

    @Override // com.fasterxml.jackson.core.JsonParser
    public int H() {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean M() {
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.g = null;
        this.P = null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec n() {
        return this.h;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public AbstractC9323nS z() {
        return this.g;
    }

    public C9558rp(AbstractC9454pr abstractC9454pr, ObjectCodec objectCodec) {
        super(0);
        this.h = objectCodec;
        if (abstractC9454pr.l()) {
            this.d = JsonToken.START_ARRAY;
            this.g = new AbstractC9557ro.e(abstractC9454pr, null);
        } else if (abstractC9454pr.p()) {
            this.d = JsonToken.START_OBJECT;
            this.g = new AbstractC9557ro.d(abstractC9454pr, null);
        } else {
            this.g = new AbstractC9557ro.c(abstractC9454pr, null);
        }
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public JsonToken Q() {
        JsonToken jsonToken = this.d;
        if (jsonToken != null) {
            this.P = jsonToken;
            this.d = null;
            return jsonToken;
        } else if (this.i) {
            this.i = false;
            if (!this.g.m()) {
                JsonToken jsonToken2 = this.P == JsonToken.START_OBJECT ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
                this.P = jsonToken2;
                return jsonToken2;
            }
            AbstractC9557ro r = this.g.r();
            this.g = r;
            JsonToken p = r.p();
            this.P = p;
            if (p == JsonToken.START_OBJECT || p == JsonToken.START_ARRAY) {
                this.i = true;
            }
            return p;
        } else {
            AbstractC9557ro abstractC9557ro = this.g;
            if (abstractC9557ro == null) {
                this.b = true;
                return null;
            }
            JsonToken p2 = abstractC9557ro.p();
            this.P = p2;
            if (p2 != null) {
                if (p2 == JsonToken.START_OBJECT || p2 == JsonToken.START_ARRAY) {
                    this.i = true;
                }
                return p2;
            }
            this.P = this.g.l();
            this.g = this.g.b();
            return this.P;
        }
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public JsonParser T() {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.START_OBJECT) {
            this.i = false;
            this.P = JsonToken.END_OBJECT;
        } else if (jsonToken == JsonToken.START_ARRAY) {
            this.i = false;
            this.P = JsonToken.END_ARRAY;
        }
        return this;
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public String l() {
        AbstractC9557ro abstractC9557ro = this.g;
        if (abstractC9557ro == null) {
            return null;
        }
        return abstractC9557ro.c();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation G() {
        return JsonLocation.d;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation k() {
        return JsonLocation.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.rp$5  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[JsonToken.values().length];
            b = iArr;
            try {
                iArr[JsonToken.FIELD_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[JsonToken.VALUE_STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[JsonToken.VALUE_NUMBER_INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public String A() {
        AbstractC9454pr U;
        if (this.b) {
            return null;
        }
        int i = AnonymousClass5.b[this.P.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return String.valueOf(U().s());
                }
                if (i == 5 && (U = U()) != null && U.n()) {
                    return U.c();
                }
                JsonToken jsonToken = this.P;
                if (jsonToken == null) {
                    return null;
                }
                return jsonToken.a();
            }
            return U().y();
        }
        return this.g.c();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] B() {
        return A().toCharArray();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int D() {
        return A().length();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType v() {
        AbstractC9454pr V = V();
        if (V == null) {
            return null;
        }
        return V.a();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger h() {
        return V().d();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal r() {
        return V().g();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double p() {
        return V().h();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float s() {
        return (float) V().h();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int u() {
        NumericNode numericNode = (NumericNode) V();
        if (!numericNode.f()) {
            at();
        }
        return numericNode.o();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long w() {
        NumericNode numericNode = (NumericNode) V();
        if (!numericNode.j()) {
            aw();
        }
        return numericNode.r();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number y() {
        return V().s();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object q() {
        AbstractC9454pr U;
        if (this.b || (U = U()) == null) {
            return null;
        }
        if (U.t()) {
            return ((POJONode) U).x();
        }
        if (U.n()) {
            return ((BinaryNode) U).b();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean P() {
        if (this.b) {
            return false;
        }
        AbstractC9454pr U = U();
        if (U instanceof NumericNode) {
            return ((NumericNode) U).v();
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] e(Base64Variant base64Variant) {
        AbstractC9454pr U = U();
        if (U != null) {
            if (U instanceof TextNode) {
                return ((TextNode) U).c(base64Variant);
            }
            return U.b();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int e(Base64Variant base64Variant, OutputStream outputStream) {
        byte[] e = e(base64Variant);
        if (e != null) {
            outputStream.write(e, 0, e.length);
            return e.length;
        }
        return 0;
    }

    protected AbstractC9454pr U() {
        AbstractC9557ro abstractC9557ro;
        if (this.b || (abstractC9557ro = this.g) == null) {
            return null;
        }
        return abstractC9557ro.o();
    }

    protected AbstractC9454pr V() {
        AbstractC9454pr U = U();
        if (U == null || !U.q()) {
            JsonToken e = U == null ? null : U.e();
            throw d("Current token (" + e + ") not numeric, cannot use numeric value accessors");
        }
        return U;
    }

    @Override // o.AbstractC9384oa
    public void ae() {
        au();
    }
}
