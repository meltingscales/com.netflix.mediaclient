package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: o.oa  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9384oa extends JsonParser {
    public static final BigDecimal E;
    public static final BigDecimal H;

    /* renamed from: J  reason: collision with root package name */
    public static final BigInteger f13890J;
    public static final BigDecimal K;
    public static final BigInteger L;
    public static final BigDecimal M;
    public static final BigInteger N;
    public static final BigInteger O;
    public static final byte[] Q = new byte[0];
    public static final int[] R = new int[0];
    public JsonToken P;
    protected JsonToken S;

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract String A();

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean N() {
        return this.P != null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract JsonToken Q();

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean a(JsonToken jsonToken) {
        return this.P == jsonToken;
    }

    protected abstract void ae();

    @Override // com.fasterxml.jackson.core.JsonParser
    public void e() {
        JsonToken jsonToken = this.P;
        if (jsonToken != null) {
            this.S = jsonToken;
            this.P = null;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken f() {
        return this.P;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract String l();

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken o() {
        return this.P;
    }

    static {
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        f13890J = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        L = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        O = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        N = valueOf4;
        K = new BigDecimal(valueOf3);
        E = new BigDecimal(valueOf4);
        M = new BigDecimal(valueOf);
        H = new BigDecimal(valueOf2);
    }

    protected AbstractC9384oa() {
    }

    public AbstractC9384oa(int i) {
        super(i);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int j() {
        JsonToken jsonToken = this.P;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.c();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public int t() {
        JsonToken jsonToken = this.P;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.c();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean e(int i) {
        JsonToken jsonToken = this.P;
        return jsonToken == null ? i == 0 : jsonToken.c() == i;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean J() {
        return this.P == JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean K() {
        return this.P == JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken O() {
        JsonToken Q2 = Q();
        return Q2 == JsonToken.FIELD_NAME ? Q() : Q2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser T() {
        JsonToken jsonToken = this.P;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken Q2 = Q();
            if (Q2 == null) {
                ae();
                return this;
            } else if (Q2.j()) {
                i++;
            } else if (Q2.g()) {
                i--;
                if (i == 0) {
                    return this;
                }
            } else if (Q2 == JsonToken.NOT_AVAILABLE) {
                c("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int E() {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return u();
        }
        return d(0);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int d(int i) {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return u();
        }
        if (jsonToken != null) {
            int c = jsonToken.c();
            if (c == 6) {
                String A = A();
                if (b(A)) {
                    return 0;
                }
                return C9398oo.b(A, i);
            }
            switch (c) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object q = q();
                    return q instanceof Number ? ((Number) q).intValue() : i;
                default:
                    return i;
            }
        }
        return i;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long I() {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return w();
        }
        return d(0L);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long d(long j) {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return w();
        }
        if (jsonToken != null) {
            int c = jsonToken.c();
            if (c == 6) {
                String A = A();
                if (b(A)) {
                    return 0L;
                }
                return C9398oo.e(A, j);
            }
            switch (c) {
                case 9:
                    return 1L;
                case 10:
                case 11:
                    return 0L;
                case 12:
                    Object q = q();
                    return q instanceof Number ? ((Number) q).longValue() : j;
                default:
                    return j;
            }
        }
        return j;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String L() {
        return c((String) null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String c(String str) {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return A();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return l();
        }
        return (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.b()) ? str : A();
    }

    public void a(String str, C9439pc c9439pc, Base64Variant base64Variant) {
        try {
            base64Variant.a(str, c9439pc);
        } catch (IllegalArgumentException e) {
            f(e.getMessage());
        }
    }

    protected boolean b(String str) {
        return "null".equals(str);
    }

    public <T> T a(int i, String str) {
        String format = String.format("Unexpected character (%s) in numeric value", a(i));
        if (str != null) {
            format = format + ": " + str;
        }
        f(format);
        return null;
    }

    public void h(String str) {
        f("Invalid numeric value: " + str);
    }

    public void at() {
        i(A());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(String str) {
        b(str, f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(String str, JsonToken jsonToken) {
        e(String.format("Numeric value (%s) out of range of int (%d - %s)", a(str), Integer.MIN_VALUE, Integer.MAX_VALUE), jsonToken, Integer.TYPE);
    }

    public void aw() {
        j(A());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(String str) {
        c(str, f());
    }

    protected void c(String str, JsonToken jsonToken) {
        e(String.format("Numeric value (%s) out of range of long (%d - %s)", a(str), Long.MIN_VALUE, Long.MAX_VALUE), jsonToken, Long.TYPE);
    }

    protected void e(String str, JsonToken jsonToken, Class<?> cls) {
        throw new InputCoercionException(this, str, jsonToken, cls);
    }

    protected String a(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String e(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    public void d(int i, String str) {
        if (i < 0) {
            av();
        }
        String format = String.format("Unexpected character (%s)", a(i));
        if (str != null) {
            format = format + ": " + str;
        }
        f(format);
    }

    public void av() {
        e(" in " + this.P, this.P);
    }

    public void e(JsonToken jsonToken) {
        String str;
        if (jsonToken == JsonToken.VALUE_STRING) {
            str = " in a String value";
        } else {
            str = (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value";
        }
        e(str, jsonToken);
    }

    public void e(String str, JsonToken jsonToken) {
        throw new JsonEOFException(this, jsonToken, "Unexpected end-of-input" + str);
    }

    public void g(int i) {
        d(i, "Expected space separating root-level values");
    }

    public void j(int i) {
        f("Illegal character (" + a((char) i) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final String a(int i) {
        char c = (char) i;
        if (Character.isISOControl(c)) {
            return "(CTRL-CHAR, code " + i + ")";
        } else if (i > 255) {
            return "'" + c + "' (code " + i + " / 0x" + Integer.toHexString(i) + ")";
        } else {
            return "'" + c + "' (code " + i + ")";
        }
    }

    public final void f(String str) {
        throw d(str);
    }

    public final void c(String str, Object obj) {
        throw d(String.format(str, obj));
    }

    public final void d(String str, Object obj, Object obj2) {
        throw d(String.format(str, obj, obj2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(String str, Throwable th) {
        throw d(str, th);
    }

    public final void au() {
        C9448pl.e();
    }

    protected final JsonParseException d(String str, Throwable th) {
        return new JsonParseException(this, str, th);
    }
}
