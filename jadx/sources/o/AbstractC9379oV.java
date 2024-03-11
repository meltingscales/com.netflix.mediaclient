package o;

import androidx.appcompat.widget.ActivityChooserModel;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import org.chromium.net.ConnectionSubtype;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.oV  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9379oV extends AbstractC9375oR {
    private static final int aw = JsonParser.Feature.ALLOW_TRAILING_COMMA.b();
    private static final int an = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.b();
    private static final int ap = JsonParser.Feature.ALLOW_MISSING_VALUES.b();
    private static final int aq = JsonParser.Feature.ALLOW_SINGLE_QUOTES.b();
    private static final int ar = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.b();
    private static final int am = JsonParser.Feature.ALLOW_COMMENTS.b();
    private static final int ao = JsonParser.Feature.ALLOW_YAML_COMMENTS.b();
    private static final int[] as = C9391oh.d();
    protected static final int[] ai = C9391oh.a();

    protected abstract int aB();

    protected abstract byte as();

    protected abstract byte f(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9379oV(C9389of c9389of, int i, C9377oT c9377oT) {
        super(c9389of, i, c9377oT);
    }

    @Override // o.AbstractC9386oc
    public char V() {
        C9448pl.e();
        return ' ';
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public JsonToken Q() {
        int i = this.n;
        if (i >= this.m) {
            if (this.i) {
                return null;
            }
            if (this.W) {
                if (this.P == JsonToken.NOT_AVAILABLE) {
                    return aN();
                }
                return ax();
            }
            return JsonToken.NOT_AVAILABLE;
        } else if (this.P == JsonToken.NOT_AVAILABLE) {
            return aL();
        } else {
            this.r = 0;
            this.F = this.j + i;
            this.b = null;
            int aB = aB();
            switch (this.aa) {
                case 0:
                    return u(aB);
                case 1:
                    return A(aB);
                case 2:
                    return w(aB);
                case 3:
                    return v(aB);
                case 4:
                    return C(aB);
                case 5:
                    return A(aB);
                case 6:
                    return B(aB);
                default:
                    C9448pl.e();
                    return null;
            }
        }
    }

    protected final JsonToken aL() {
        int i = this.Y;
        if (i != 1) {
            if (i != 4) {
                if (i == 5) {
                    return v(aB());
                }
                switch (i) {
                    case 7:
                        return f(this.ah, this.ag, this.ae);
                    case 8:
                        return aG();
                    case 9:
                        return d(this.ah, this.ag, this.ae);
                    case 10:
                        return h(this.ah, this.ag, this.ae);
                    default:
                        switch (i) {
                            case 12:
                                return A(aB());
                            case 13:
                                return B(aB());
                            case 14:
                                return C(aB());
                            case 15:
                                return D(aB());
                            case 16:
                                return e("null", this.ag, JsonToken.VALUE_NULL);
                            case 17:
                                return e("true", this.ag, JsonToken.VALUE_TRUE);
                            case 18:
                                return e("false", this.ag, JsonToken.VALUE_FALSE);
                            case 19:
                                return f(this.ac, this.ag);
                            default:
                                switch (i) {
                                    case 22:
                                        return m(aB());
                                    case 23:
                                        return o(aB());
                                    case 24:
                                        return aH();
                                    case 25:
                                        return aJ();
                                    case 26:
                                        return b(this.A.j(), this.A.g());
                                    default:
                                        switch (i) {
                                            case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                                                return aI();
                                            case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                                                return b(true, aB());
                                            case 32:
                                                return b(false, aB());
                                            default:
                                                switch (i) {
                                                    case JSONzip.substringLimit /* 40 */:
                                                        return aX();
                                                    case 41:
                                                        int j = j(this.aj, this.ak);
                                                        if (j < 0) {
                                                            return JsonToken.NOT_AVAILABLE;
                                                        }
                                                        this.A.e((char) j);
                                                        if (this.Z == 45) {
                                                            return aY();
                                                        }
                                                        return aX();
                                                    case 42:
                                                        this.A.e((char) i(this.ag, as()));
                                                        if (this.Z == 45) {
                                                            return aY();
                                                        }
                                                        return aX();
                                                    case 43:
                                                        if (c(this.ag, this.ae, as())) {
                                                            if (this.Z == 45) {
                                                                return aY();
                                                            }
                                                            return aX();
                                                        }
                                                        return JsonToken.NOT_AVAILABLE;
                                                    case 44:
                                                        if (b(this.ag, this.ae, as())) {
                                                            if (this.Z == 45) {
                                                                return aY();
                                                            }
                                                            return aX();
                                                        }
                                                        return JsonToken.NOT_AVAILABLE;
                                                    case 45:
                                                        return aY();
                                                    default:
                                                        switch (i) {
                                                            case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                                                                return aE();
                                                            case 51:
                                                                return z(this.ag);
                                                            case 52:
                                                                return b(this.ag, true);
                                                            case 53:
                                                                return b(this.ag, false);
                                                            case 54:
                                                                return t(this.ag);
                                                            case 55:
                                                                return q(this.ag);
                                                            default:
                                                                C9448pl.e();
                                                                return null;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            }
            return w(aB());
        }
        return p(this.ag);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected final JsonToken aN() {
        JsonToken jsonToken = this.P;
        int i = this.Y;
        if (i != 3) {
            if (i != 12) {
                if (i != 50) {
                    switch (i) {
                        case 16:
                            return a("null", this.ag, JsonToken.VALUE_NULL);
                        case 17:
                            return a("true", this.ag, JsonToken.VALUE_TRUE);
                        case 18:
                            return a("false", this.ag, JsonToken.VALUE_FALSE);
                        case 19:
                            return h(this.ac, this.ag);
                        default:
                            switch (i) {
                                case 24:
                                case 25:
                                    return c(0, "0");
                                case 26:
                                    int g = this.A.g();
                                    if (this.z) {
                                        g--;
                                    }
                                    this.k = g;
                                    return c(JsonToken.VALUE_NUMBER_INT);
                                default:
                                    switch (i) {
                                        case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                                            this.l = 0;
                                            return c(JsonToken.VALUE_NUMBER_FLOAT);
                                        case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                                            e(": was expecting fraction after exponent marker", JsonToken.VALUE_NUMBER_FLOAT);
                                            e(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                            return ax();
                                        case 32:
                                            return c(JsonToken.VALUE_NUMBER_FLOAT);
                                        default:
                                            switch (i) {
                                                case 52:
                                                case 53:
                                                    e(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                                    break;
                                                case 54:
                                                case 55:
                                                    break;
                                                default:
                                                    e(": was expecting rest of token (internal state: " + this.Y + ")", this.P);
                                                    return jsonToken;
                                            }
                                            return ax();
                                    }
                            }
                    }
                }
                return aC();
            }
            return ax();
        }
        return ax();
    }

    private final JsonToken u(int i) {
        int i2 = i & PrivateKeyType.INVALID;
        if (i2 == 239 && this.Y != 1) {
            return p(1);
        }
        while (i2 <= 32) {
            if (i2 != 32) {
                if (i2 == 10) {
                    this.f++;
                } else if (i2 == 13) {
                    this.X++;
                } else if (i2 != 9) {
                    j(i2);
                }
                this.h = this.n;
            }
            if (this.n >= this.m) {
                this.Y = 3;
                if (this.i) {
                    return null;
                }
                if (this.W) {
                    return ax();
                }
                return JsonToken.NOT_AVAILABLE;
            }
            i2 = aB();
        }
        return A(i2);
    }

    private final JsonToken p(int i) {
        while (this.n < this.m) {
            int aB = aB();
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.j -= 3;
                        return u(aB);
                    }
                } else if (aB != 191) {
                    c("Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM", Integer.valueOf(aB));
                }
            } else if (aB != 187) {
                c("Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM", Integer.valueOf(aB));
            }
            i++;
        }
        this.ag = i;
        this.Y = 1;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this.P = jsonToken;
        return jsonToken;
    }

    private final JsonToken w(int i) {
        String ba;
        if (i <= 32 && (i = y(i)) <= 0) {
            this.Y = 4;
            return this.P;
        }
        aD();
        if (i != 34) {
            if (i == 125) {
                return az();
            }
            return r(i);
        } else if (this.n + 13 <= this.m && (ba = ba()) != null) {
            return g(ba);
        } else {
            return f(0, 0, 0);
        }
    }

    private final JsonToken v(int i) {
        String ba;
        if (i <= 32 && (i = y(i)) <= 0) {
            this.Y = 5;
            return this.P;
        }
        if (i != 44) {
            if (i == 125) {
                return az();
            }
            if (i == 35) {
                return q(5);
            }
            if (i == 47) {
                return z(5);
            }
            d(i, "was expecting comma to separate " + this.B.k() + " entries");
        }
        int i2 = this.n;
        if (i2 >= this.m) {
            this.Y = 4;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.P = jsonToken;
            return jsonToken;
        }
        int f = f(i2);
        this.n = i2 + 1;
        if (f <= 32 && (f = y(f)) <= 0) {
            this.Y = 4;
            return this.P;
        }
        aD();
        if (f != 34) {
            if (f == 125 && (this.a & aw) != 0) {
                return az();
            }
            return r(f);
        } else if (this.n + 13 <= this.m && (ba = ba()) != null) {
            return g(ba);
        } else {
            return f(0, 0, 0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final JsonToken A(int i) {
        if (i <= 32 && (i = y(i)) <= 0) {
            this.Y = 12;
            return this.P;
        }
        aD();
        this.B.o();
        if (i == 34) {
            return aT();
        }
        if (i != 35) {
            if (i != 43) {
                if (i != 91) {
                    if (i != 93) {
                        if (i != 102) {
                            if (i != 110) {
                                if (i != 116) {
                                    if (i != 123) {
                                        if (i != 125) {
                                            switch (i) {
                                                case 45:
                                                    return aQ();
                                                case 46:
                                                    if (a(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.e())) {
                                                        return aP();
                                                    }
                                                    break;
                                                case 47:
                                                    return z(12);
                                                case 48:
                                                    return aR();
                                                case 49:
                                                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                    return s(i);
                                            }
                                            return e(false, i);
                                        }
                                        return az();
                                    }
                                    return aF();
                                }
                                return aU();
                            }
                            return aV();
                        }
                        return aO();
                    }
                    return aA();
                }
                return ay();
            }
            return aS();
        }
        return q(12);
    }

    private final JsonToken B(int i) {
        if (i <= 32 && (i = y(i)) <= 0) {
            this.Y = 13;
            return this.P;
        }
        if (i != 44) {
            if (i == 93) {
                return aA();
            }
            if (i == 125) {
                return az();
            }
            if (i == 47) {
                return z(13);
            }
            if (i == 35) {
                return q(13);
            }
            d(i, "was expecting comma to separate " + this.B.k() + " entries");
        }
        this.B.o();
        int i2 = this.n;
        if (i2 >= this.m) {
            this.Y = 15;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.P = jsonToken;
            return jsonToken;
        }
        int f = f(i2);
        this.n = i2 + 1;
        if (f <= 32 && (f = y(f)) <= 0) {
            this.Y = 15;
            return this.P;
        }
        aD();
        if (f == 34) {
            return aT();
        }
        if (f != 35) {
            if (f != 43) {
                if (f != 45) {
                    if (f == 91) {
                        return ay();
                    }
                    if (f != 93) {
                        if (f == 102) {
                            return aO();
                        }
                        if (f == 110) {
                            return aV();
                        }
                        if (f == 116) {
                            return aU();
                        }
                        if (f == 123) {
                            return aF();
                        }
                        if (f != 125) {
                            switch (f) {
                                case 47:
                                    return z(15);
                                case 48:
                                    return aR();
                                case 49:
                                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                                case 51:
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                    return s(f);
                            }
                        } else if ((this.a & aw) != 0) {
                            return az();
                        }
                    } else if ((this.a & aw) != 0) {
                        return aA();
                    }
                    return e(true, f);
                }
                return aQ();
            }
            return aS();
        }
        return q(15);
    }

    private final JsonToken C(int i) {
        if (i <= 32 && (i = y(i)) <= 0) {
            this.Y = 14;
            return this.P;
        }
        if (i != 58) {
            if (i == 47) {
                return z(14);
            }
            if (i == 35) {
                return q(14);
            }
            d(i, "was expecting a colon to separate field name and value");
        }
        int i2 = this.n;
        if (i2 >= this.m) {
            this.Y = 12;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.P = jsonToken;
            return jsonToken;
        }
        int f = f(i2);
        this.n = i2 + 1;
        if (f <= 32 && (f = y(f)) <= 0) {
            this.Y = 12;
            return this.P;
        }
        aD();
        if (f == 34) {
            return aT();
        }
        if (f != 35) {
            if (f != 43) {
                if (f != 45) {
                    if (f != 91) {
                        if (f != 102) {
                            if (f != 110) {
                                if (f != 116) {
                                    if (f != 123) {
                                        switch (f) {
                                            case 47:
                                                return z(12);
                                            case 48:
                                                return aR();
                                            case 49:
                                            case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                                            case 51:
                                            case 52:
                                            case 53:
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                                return s(f);
                                            default:
                                                return e(false, f);
                                        }
                                    }
                                    return aF();
                                }
                                return aU();
                            }
                            return aV();
                        }
                        return aO();
                    }
                    return ay();
                }
                return aQ();
            }
            return aS();
        }
        return q(12);
    }

    private final JsonToken D(int i) {
        if (i <= 32 && (i = y(i)) <= 0) {
            this.Y = 15;
            return this.P;
        }
        aD();
        if (i == 34) {
            return aT();
        }
        if (i != 35) {
            if (i != 43) {
                if (i != 45) {
                    if (i == 91) {
                        return ay();
                    }
                    if (i != 93) {
                        if (i == 102) {
                            return aO();
                        }
                        if (i == 110) {
                            return aV();
                        }
                        if (i == 116) {
                            return aU();
                        }
                        if (i == 123) {
                            return aF();
                        }
                        if (i != 125) {
                            switch (i) {
                                case 47:
                                    return z(15);
                                case 48:
                                    return aR();
                                case 49:
                                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                                case 51:
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                    return s(i);
                            }
                        } else if ((this.a & aw) != 0) {
                            return az();
                        }
                    } else if ((this.a & aw) != 0) {
                        return aA();
                    }
                    return e(true, i);
                }
                return aQ();
            }
            return aS();
        }
        return q(15);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
        if (r4 != 44) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
        if (r2.B.h() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
        if (r2.B.i() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
        if ((r2.a & o.AbstractC9379oV.ap) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
        r2.n--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        return c(com.fasterxml.jackson.core.JsonToken.VALUE_NULL);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.fasterxml.jackson.core.JsonToken e(boolean r3, int r4) {
        /*
            r2 = this;
            r3 = 39
            if (r4 == r3) goto L53
            r3 = 73
            r0 = 1
            if (r4 == r3) goto L4e
            r3 = 78
            if (r4 == r3) goto L48
            r3 = 93
            if (r4 == r3) goto L24
            r3 = 125(0x7d, float:1.75E-43)
            if (r4 == r3) goto L5f
            r3 = 43
            if (r4 == r3) goto L1e
            r3 = 44
            if (r4 == r3) goto L2d
            goto L5f
        L1e:
            r3 = 2
            com.fasterxml.jackson.core.JsonToken r3 = r2.f(r3, r0)
            return r3
        L24:
            o.oG r3 = r2.B
            boolean r3 = r3.h()
            if (r3 != 0) goto L2d
            goto L5f
        L2d:
            o.oG r3 = r2.B
            boolean r3 = r3.i()
            if (r3 != 0) goto L5f
            int r3 = r2.a
            int r1 = o.AbstractC9379oV.ap
            r3 = r3 & r1
            if (r3 == 0) goto L5f
            int r3 = r2.n
            int r3 = r3 - r0
            r2.n = r3
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            com.fasterxml.jackson.core.JsonToken r3 = r2.c(r3)
            return r3
        L48:
            r3 = 0
            com.fasterxml.jackson.core.JsonToken r3 = r2.f(r3, r0)
            return r3
        L4e:
            com.fasterxml.jackson.core.JsonToken r3 = r2.f(r0, r0)
            return r3
        L53:
            int r3 = r2.a
            int r0 = o.AbstractC9379oV.aq
            r3 = r3 & r0
            if (r3 == 0) goto L5f
            com.fasterxml.jackson.core.JsonToken r3 = r2.aM()
            return r3
        L5f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "expected a valid value "
            r3.append(r0)
            java.lang.String r0 = r2.ah()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.d(r4, r3)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC9379oV.e(boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    private final int y(int i) {
        do {
            if (i != 32) {
                if (i == 10) {
                    this.f++;
                } else if (i == 13) {
                    this.X++;
                } else if (i != 9) {
                    j(i);
                }
                this.h = this.n;
            }
            if (this.n >= this.m) {
                this.P = JsonToken.NOT_AVAILABLE;
                return 0;
            }
            i = aB();
        } while (i <= 32);
        return i;
    }

    private final JsonToken z(int i) {
        if ((this.a & am) == 0) {
            d(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.n >= this.m) {
            this.ag = i;
            this.Y = 51;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.P = jsonToken;
            return jsonToken;
        }
        byte as2 = as();
        if (as2 == 42) {
            return b(i, false);
        }
        if (as2 == 47) {
            return t(i);
        }
        d(as2 & 255, "was expecting either '*' or '/' for a comment");
        return null;
    }

    private final JsonToken q(int i) {
        if ((this.a & ao) == 0) {
            d(35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)");
        }
        while (this.n < this.m) {
            int aB = aB();
            if (aB < 32) {
                if (aB == 10) {
                    this.f++;
                } else if (aB == 13) {
                    this.X++;
                } else if (aB != 9) {
                    j(aB);
                }
                this.h = this.n;
                return x(i);
            }
        }
        this.Y = 55;
        this.ag = i;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this.P = jsonToken;
        return jsonToken;
    }

    private final JsonToken t(int i) {
        while (this.n < this.m) {
            int aB = aB();
            if (aB < 32) {
                if (aB == 10) {
                    this.f++;
                } else if (aB == 13) {
                    this.X++;
                } else if (aB != 9) {
                    j(aB);
                }
                this.h = this.n;
                return x(i);
            }
        }
        this.Y = 54;
        this.ag = i;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this.P = jsonToken;
        return jsonToken;
    }

    private final JsonToken b(int i, boolean z) {
        while (this.n < this.m) {
            int aB = aB();
            if (aB < 32) {
                if (aB == 10) {
                    this.f++;
                } else if (aB == 13) {
                    this.X++;
                } else if (aB != 9) {
                    j(aB);
                }
                this.h = this.n;
            } else if (aB == 42) {
                z = true;
            } else if (aB == 47 && z) {
                return x(i);
            }
            z = false;
        }
        this.Y = z ? 52 : 53;
        this.ag = i;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this.P = jsonToken;
        return jsonToken;
    }

    private final JsonToken x(int i) {
        if (this.n >= this.m) {
            this.Y = i;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.P = jsonToken;
            return jsonToken;
        }
        int aB = aB();
        if (i != 4) {
            if (i == 5) {
                return v(aB);
            }
            switch (i) {
                case 12:
                    return A(aB);
                case 13:
                    return B(aB);
                case 14:
                    return C(aB);
                case 15:
                    return D(aB);
                default:
                    C9448pl.e();
                    return null;
            }
        }
        return w(aB);
    }

    protected JsonToken aO() {
        int f;
        int i = this.n;
        int i2 = i + 4;
        if (i2 < this.m && f(i) == 97 && f(i + 1) == 108 && f(i + 2) == 115 && f(i + 3) == 101 && ((f = f(i2) & 255) < 48 || f == 93 || f == 125)) {
            this.n = i2;
            return c(JsonToken.VALUE_FALSE);
        }
        this.Y = 18;
        return e("false", 1, JsonToken.VALUE_FALSE);
    }

    protected JsonToken aU() {
        int f;
        int i = this.n;
        int i2 = i + 3;
        if (i2 < this.m && f(i) == 114 && f(i + 1) == 117 && f(i + 2) == 101 && ((f = f(i2) & 255) < 48 || f == 93 || f == 125)) {
            this.n = i2;
            return c(JsonToken.VALUE_TRUE);
        }
        this.Y = 17;
        return e("true", 1, JsonToken.VALUE_TRUE);
    }

    protected JsonToken aV() {
        int f;
        int i = this.n;
        int i2 = i + 3;
        if (i2 < this.m && f(i) == 117 && f(i + 1) == 108 && f(i + 2) == 108 && ((f = f(i2) & 255) < 48 || f == 93 || f == 125)) {
            this.n = i2;
            return c(JsonToken.VALUE_NULL);
        }
        this.Y = 16;
        return e("null", 1, JsonToken.VALUE_NULL);
    }

    protected JsonToken e(String str, int i, JsonToken jsonToken) {
        int length = str.length();
        while (true) {
            int i2 = this.n;
            if (i2 >= this.m) {
                this.ag = i;
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                this.P = jsonToken2;
                return jsonToken2;
            }
            byte f = f(i2);
            if (i == length) {
                if (f < 48 || f == 93 || f == 125) {
                    return c(jsonToken);
                }
            } else if (f != str.charAt(i)) {
                break;
            } else {
                i++;
                this.n++;
            }
        }
        this.Y = 50;
        this.A.b(str, 0, i);
        return aE();
    }

    protected JsonToken a(String str, int i, JsonToken jsonToken) {
        if (i == str.length()) {
            this.P = jsonToken;
            return jsonToken;
        }
        this.A.b(str, 0, i);
        return aC();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        r4.Y = 50;
        r4.A.b(r0, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        return aE();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.fasterxml.jackson.core.JsonToken f(int r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = r4.i(r5)
            int r1 = r0.length()
        L8:
            int r2 = r4.n
            int r3 = r4.m
            if (r2 < r3) goto L1b
            r4.ac = r5
            r4.ag = r6
            r5 = 19
            r4.Y = r5
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r4.P = r5
            return r5
        L1b:
            byte r2 = r4.f(r2)
            if (r6 != r1) goto L32
            r1 = 48
            if (r2 < r1) goto L2d
            r1 = 93
            if (r2 == r1) goto L2d
            r1 = 125(0x7d, float:1.75E-43)
            if (r2 != r1) goto L38
        L2d:
            com.fasterxml.jackson.core.JsonToken r5 = r4.k(r5)
            return r5
        L32:
            char r3 = r0.charAt(r6)
            if (r2 == r3) goto L47
        L38:
            r5 = 50
            r4.Y = r5
            o.pg r5 = r4.A
            r1 = 0
            r5.b(r0, r1, r6)
            com.fasterxml.jackson.core.JsonToken r5 = r4.aE()
            return r5
        L47:
            int r6 = r6 + 1
            int r2 = r4.n
            int r2 = r2 + 1
            r4.n = r2
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC9379oV.f(int, int):com.fasterxml.jackson.core.JsonToken");
    }

    protected JsonToken h(int i, int i2) {
        String i3 = i(i);
        if (i2 == i3.length()) {
            return k(i);
        }
        this.A.b(i3, 0, i2);
        return aC();
    }

    protected JsonToken aE() {
        while (this.n < this.m) {
            char as2 = (char) as();
            if (Character.isJavaIdentifierPart(as2)) {
                this.A.e(as2);
                if (this.A.l() >= 256) {
                }
            }
            return k(this.A.a());
        }
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this.P = jsonToken;
        return jsonToken;
    }

    protected JsonToken aC() {
        return k(this.A.a());
    }

    protected JsonToken k(String str) {
        d("Unrecognized token '%s': was expecting %s", this.A.a(), ag());
        return JsonToken.NOT_AVAILABLE;
    }

    protected JsonToken aP() {
        this.z = false;
        this.k = 0;
        return d(this.A.e(), 0, 46);
    }

    protected JsonToken s(int i) {
        this.z = false;
        char[] e = this.A.e();
        e[0] = (char) i;
        int i2 = this.n;
        if (i2 >= this.m) {
            this.Y = 26;
            this.A.b(1);
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.P = jsonToken;
            return jsonToken;
        }
        int f = f(i2) & 255;
        int i3 = 1;
        while (true) {
            if (f < 48) {
                if (f == 46) {
                    this.k = i3;
                    this.n++;
                    return d(e, i3, f);
                }
            } else if (f <= 57) {
                if (i3 >= e.length) {
                    e = this.A.c();
                }
                int i4 = i3 + 1;
                e[i3] = (char) f;
                int i5 = this.n + 1;
                this.n = i5;
                if (i5 >= this.m) {
                    this.Y = 26;
                    this.A.b(i4);
                    JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                    this.P = jsonToken2;
                    return jsonToken2;
                }
                f = f(i5) & 255;
                i3 = i4;
            } else if (f == 101 || f == 69) {
                this.k = i3;
                this.n++;
                return d(e, i3, f);
            }
        }
        this.k = i3;
        this.A.b(i3);
        return c(JsonToken.VALUE_NUMBER_INT);
    }

    protected JsonToken aQ() {
        this.z = true;
        if (this.n >= this.m) {
            this.Y = 23;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.P = jsonToken;
            return jsonToken;
        }
        int aB = aB();
        int i = 2;
        if (aB <= 48) {
            if (aB == 48) {
                return aJ();
            }
            a(aB, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (aB > 57) {
            if (aB == 73) {
                return f(3, 2);
            }
            a(aB, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] e = this.A.e();
        e[0] = '-';
        e[1] = (char) aB;
        int i2 = this.n;
        if (i2 >= this.m) {
            this.Y = 26;
            this.A.b(2);
            this.k = 1;
            JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
            this.P = jsonToken2;
            return jsonToken2;
        }
        int f = f(i2);
        while (true) {
            if (f < 48) {
                if (f == 46) {
                    this.k = i - 1;
                    this.n++;
                    return d(e, i, f);
                }
            } else if (f <= 57) {
                if (i >= e.length) {
                    e = this.A.c();
                }
                int i3 = i + 1;
                e[i] = (char) f;
                int i4 = this.n + 1;
                this.n = i4;
                if (i4 >= this.m) {
                    this.Y = 26;
                    this.A.b(i3);
                    JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                    this.P = jsonToken3;
                    return jsonToken3;
                }
                f = f(i4) & 255;
                i = i3;
            } else if (f == 101 || f == 69) {
                this.k = i - 1;
                this.n++;
                return d(e, i, f);
            }
        }
        this.k = i - 1;
        this.A.b(i);
        return c(JsonToken.VALUE_NUMBER_INT);
    }

    protected JsonToken aS() {
        this.z = false;
        if (this.n >= this.m) {
            this.Y = 22;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.P = jsonToken;
            return jsonToken;
        }
        int aB = aB();
        int i = 2;
        if (aB <= 48) {
            if (aB == 48) {
                if (!a(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e())) {
                    a(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
                }
                return aK();
            }
            a(aB, "expected digit (0-9) to follow plus sign, for valid numeric value");
        } else if (aB > 57) {
            if (aB == 73) {
                return f(2, 2);
            }
            a(aB, "expected digit (0-9) to follow plus sign, for valid numeric value");
        }
        if (!a(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e())) {
            a(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        char[] e = this.A.e();
        e[0] = '+';
        e[1] = (char) aB;
        int i2 = this.n;
        if (i2 >= this.m) {
            this.Y = 26;
            this.A.b(2);
            this.k = 1;
            JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
            this.P = jsonToken2;
            return jsonToken2;
        }
        int f = f(i2);
        while (true) {
            if (f < 48) {
                if (f == 46) {
                    this.k = i - 1;
                    this.n++;
                    return d(e, i, f);
                }
            } else if (f <= 57) {
                if (i >= e.length) {
                    e = this.A.c();
                }
                int i3 = i + 1;
                e[i] = (char) f;
                int i4 = this.n + 1;
                this.n = i4;
                if (i4 >= this.m) {
                    this.Y = 26;
                    this.A.b(i3);
                    JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                    this.P = jsonToken3;
                    return jsonToken3;
                }
                f = f(i4) & 255;
                i = i3;
            } else if (f == 101 || f == 69) {
                this.k = i - 1;
                this.n++;
                return d(e, i, f);
            }
        }
        this.k = i - 1;
        this.A.b(i);
        return c(JsonToken.VALUE_NUMBER_INT);
    }

    protected JsonToken aR() {
        int i = this.n;
        if (i >= this.m) {
            this.Y = 24;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.P = jsonToken;
            return jsonToken;
        }
        int i2 = i + 1;
        int f = f(i) & 255;
        if (f < 48) {
            if (f == 46) {
                this.n = i2;
                this.k = 1;
                char[] e = this.A.e();
                e[0] = '0';
                return d(e, 1, f);
            }
        } else if (f <= 57) {
            return aH();
        } else {
            if (f == 101 || f == 69) {
                this.n = i2;
                this.k = 1;
                char[] e2 = this.A.e();
                e2[0] = '0';
                return d(e2, 1, f);
            } else if (f != 93 && f != 125) {
                a(f, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
            }
        }
        return c(0, "0");
    }

    protected JsonToken o(int i) {
        return a(i, true);
    }

    protected JsonToken m(int i) {
        return a(i, false);
    }

    protected JsonToken a(int i, boolean z) {
        if (i <= 48) {
            if (i == 48) {
                if (z) {
                    return aJ();
                }
                if (!a(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e())) {
                    a(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
                }
                return aK();
            } else if (i == 46 && a(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.e())) {
                if (z) {
                    this.n--;
                    return aJ();
                }
                if (!a(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e())) {
                    a(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
                }
                this.n--;
                return aK();
            } else {
                a(i, z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
            }
        } else if (i > 57) {
            if (i == 73) {
                return f(z ? 3 : 2, 2);
            }
            a(i, z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
        }
        if (!z && !a(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e())) {
            a(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        char[] e = this.A.e();
        e[0] = z ? '-' : '+';
        e[1] = (char) i;
        this.k = 1;
        return b(e, 2);
    }

    protected JsonToken aH() {
        while (this.n < this.m) {
            int aB = aB();
            if (aB < 48) {
                if (aB == 46) {
                    char[] e = this.A.e();
                    e[0] = '0';
                    this.k = 1;
                    return d(e, 1, aB);
                }
            } else if (aB <= 57) {
                if ((this.a & an) == 0) {
                    h("Leading zeroes not allowed");
                    continue;
                }
                if (aB != 48) {
                    char[] e2 = this.A.e();
                    e2[0] = (char) aB;
                    this.k = 1;
                    return b(e2, 1);
                }
            } else if (aB == 101 || aB == 69) {
                char[] e3 = this.A.e();
                e3[0] = '0';
                this.k = 1;
                return d(e3, 1, aB);
            } else if (aB != 93 && aB != 125) {
                a(aB, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
            }
            this.n--;
            return c(0, "0");
        }
        this.Y = 24;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this.P = jsonToken;
        return jsonToken;
    }

    protected JsonToken aJ() {
        return d(true);
    }

    protected JsonToken aK() {
        return d(false);
    }

    protected JsonToken d(boolean z) {
        while (this.n < this.m) {
            int aB = aB();
            if (aB < 48) {
                if (aB == 46) {
                    char[] e = this.A.e();
                    e[0] = z ? '-' : '+';
                    e[1] = '0';
                    this.k = 1;
                    return d(e, 2, aB);
                }
            } else if (aB <= 57) {
                if ((this.a & an) == 0) {
                    h("Leading zeroes not allowed");
                    continue;
                }
                if (aB != 48) {
                    char[] e2 = this.A.e();
                    e2[0] = z ? '-' : '+';
                    e2[1] = (char) aB;
                    this.k = 1;
                    return b(e2, 2);
                }
            } else if (aB == 101 || aB == 69) {
                char[] e3 = this.A.e();
                e3[0] = z ? '-' : '+';
                e3[1] = '0';
                this.k = 1;
                return d(e3, 2, aB);
            } else if (aB != 93 && aB != 125) {
                a(aB, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
            }
            this.n--;
            return c(0, "0");
        }
        this.Y = z ? 25 : 24;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this.P = jsonToken;
        return jsonToken;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        r3.k = r0 + r5;
        r3.A.b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        return c(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.fasterxml.jackson.core.JsonToken b(char[] r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.z
            if (r0 == 0) goto L6
            r0 = -1
            goto L7
        L6:
            r0 = 0
        L7:
            int r1 = r3.n
            int r2 = r3.m
            if (r1 < r2) goto L1b
            r4 = 26
            r3.Y = r4
            o.pg r4 = r3.A
            r4.b(r5)
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r3.P = r4
            return r4
        L1b:
            byte r1 = r3.f(r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 48
            if (r1 >= r2) goto L37
            r2 = 46
            if (r1 != r2) goto L44
            int r0 = r0 + r5
            r3.k = r0
            int r0 = r3.n
            int r0 = r0 + 1
            r3.n = r0
            com.fasterxml.jackson.core.JsonToken r4 = r3.d(r4, r5, r1)
            return r4
        L37:
            r2 = 57
            if (r1 <= r2) goto L61
            r2 = 101(0x65, float:1.42E-43)
            if (r1 == r2) goto L53
            r2 = 69
            if (r1 != r2) goto L44
            goto L53
        L44:
            int r0 = r0 + r5
            r3.k = r0
            o.pg r4 = r3.A
            r4.b(r5)
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            com.fasterxml.jackson.core.JsonToken r4 = r3.c(r4)
            return r4
        L53:
            int r0 = r0 + r5
            r3.k = r0
            int r0 = r3.n
            int r0 = r0 + 1
            r3.n = r0
            com.fasterxml.jackson.core.JsonToken r4 = r3.d(r4, r5, r1)
            return r4
        L61:
            int r2 = r3.n
            int r2 = r2 + 1
            r3.n = r2
            int r2 = r4.length
            if (r5 < r2) goto L70
            o.pg r4 = r3.A
            char[] r4 = r4.c()
        L70:
            char r1 = (char) r1
            r4[r5] = r1
            int r5 = r5 + 1
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC9379oV.b(char[], int):com.fasterxml.jackson.core.JsonToken");
    }

    protected JsonToken d(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        byte as2;
        int i5 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this.A.c();
            }
            cArr[i] = '.';
            i++;
            i4 = 0;
            while (this.n < this.m) {
                byte as3 = as();
                if (as3 < 48 || as3 > 57) {
                    i3 = as3 & 255;
                    if (i4 == 0 && !a(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.e())) {
                        a(i3, "Decimal point not followed by a digit");
                    }
                } else {
                    if (i >= cArr.length) {
                        cArr = this.A.c();
                    }
                    cArr[i] = (char) as3;
                    i4++;
                    i++;
                }
            }
            this.A.b(i);
            this.Y = 30;
            this.f13892o = i4;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.P = jsonToken;
            return jsonToken;
        }
        i3 = i2;
        i4 = 0;
        this.f13892o = i4;
        if (i3 == 101 || i3 == 69) {
            if (i >= cArr.length) {
                cArr = this.A.c();
            }
            int i6 = i + 1;
            cArr[i] = (char) i3;
            if (this.n >= this.m) {
                this.A.b(i6);
                this.Y = 31;
                this.l = 0;
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                this.P = jsonToken2;
                return jsonToken2;
            }
            byte as4 = as();
            if (as4 == 45 || as4 == 43) {
                if (i6 >= cArr.length) {
                    cArr = this.A.c();
                }
                i += 2;
                cArr[i6] = (char) as4;
                if (this.n >= this.m) {
                    this.A.b(i);
                    this.Y = 32;
                    this.l = 0;
                    JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                    this.P = jsonToken3;
                    return jsonToken3;
                }
                as2 = as();
            } else {
                i = i6;
                as2 = as4;
            }
            while (as2 >= 48 && as2 <= 57) {
                i5++;
                if (i >= cArr.length) {
                    cArr = this.A.c();
                }
                int i7 = i + 1;
                cArr[i] = (char) as2;
                if (this.n >= this.m) {
                    this.A.b(i7);
                    this.Y = 32;
                    this.l = i5;
                    JsonToken jsonToken4 = JsonToken.NOT_AVAILABLE;
                    this.P = jsonToken4;
                    return jsonToken4;
                }
                as2 = as();
                i = i7;
            }
            if (i5 == 0) {
                a(as2 & 255, "Exponent indicator not followed by a digit");
            }
        }
        this.n--;
        this.A.b(i);
        this.l = i5;
        return c(JsonToken.VALUE_NUMBER_FLOAT);
    }

    protected JsonToken aI() {
        int i = this.f13892o;
        char[] j = this.A.j();
        int g = this.A.g();
        byte as2 = as();
        boolean z = true;
        while (z) {
            if (as2 >= 48 && as2 <= 57) {
                i++;
                if (g >= j.length) {
                    j = this.A.c();
                }
                int i2 = g + 1;
                j[g] = (char) as2;
                if (this.n >= this.m) {
                    this.A.b(i2);
                    this.f13892o = i;
                    return JsonToken.NOT_AVAILABLE;
                }
                as2 = as();
                g = i2;
            } else if (as2 == 102 || as2 == 100 || as2 == 70 || as2 == 68) {
                a(as2, "JSON does not support parsing numbers that have 'f' or 'd' suffixes");
            } else if (as2 == 46) {
                a(as2, "Cannot parse number with more than one decimal point");
            } else {
                z = false;
            }
        }
        if (i == 0 && !a(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.e())) {
            a(as2, "Decimal point not followed by a digit");
        }
        this.f13892o = i;
        this.A.b(g);
        if (as2 == 101 || as2 == 69) {
            this.A.e((char) as2);
            this.l = 0;
            if (this.n >= this.m) {
                this.Y = 31;
                return JsonToken.NOT_AVAILABLE;
            }
            this.Y = 32;
            return b(true, aB());
        }
        this.n--;
        this.A.b(g);
        this.l = 0;
        return c(JsonToken.VALUE_NUMBER_FLOAT);
    }

    protected JsonToken b(boolean z, int i) {
        if (z) {
            this.Y = 32;
            if (i == 45 || i == 43) {
                this.A.e((char) i);
                if (this.n >= this.m) {
                    this.Y = 32;
                    this.l = 0;
                    return JsonToken.NOT_AVAILABLE;
                }
                i = as();
            }
        }
        char[] j = this.A.j();
        int g = this.A.g();
        int i2 = this.l;
        while (i >= 48 && i <= 57) {
            i2++;
            if (g >= j.length) {
                j = this.A.c();
            }
            int i3 = g + 1;
            j[g] = (char) i;
            if (this.n >= this.m) {
                this.A.b(i3);
                this.l = i2;
                return JsonToken.NOT_AVAILABLE;
            }
            i = as();
            g = i3;
        }
        if (i2 == 0) {
            a(i & PrivateKeyType.INVALID, "Exponent indicator not followed by a digit");
        }
        this.n--;
        this.A.b(g);
        this.l = i2;
        return c(JsonToken.VALUE_NUMBER_FLOAT);
    }

    private final String ba() {
        int[] iArr = ai;
        int i = this.n;
        int i2 = i + 1;
        int f = f(i) & 255;
        if (iArr[f] != 0) {
            if (f == 34) {
                this.n = i2;
                return "";
            }
            return null;
        }
        int i3 = i + 2;
        int f2 = f(i2) & 255;
        if (iArr[f2] != 0) {
            if (f2 == 34) {
                this.n = i3;
                return a(f, 1);
            }
            return null;
        }
        int i4 = f2 | (f << 8);
        int i5 = i + 3;
        int f3 = f(i3) & 255;
        if (iArr[f3] != 0) {
            if (f3 == 34) {
                this.n = i5;
                return a(i4, 2);
            }
            return null;
        }
        int i6 = (i4 << 8) | f3;
        int i7 = i + 4;
        int f4 = f(i5) & 255;
        if (iArr[f4] != 0) {
            if (f4 == 34) {
                this.n = i7;
                return a(i6, 3);
            }
            return null;
        }
        int i8 = (i6 << 8) | f4;
        int i9 = i + 5;
        int f5 = f(i7) & 255;
        if (iArr[f5] == 0) {
            this.ad = i8;
            return l(i9, f5);
        } else if (f5 == 34) {
            this.n = i9;
            return a(i8, 4);
        } else {
            return null;
        }
    }

    private final String l(int i, int i2) {
        int[] iArr = ai;
        int i3 = i + 1;
        int f = f(i) & 255;
        if (iArr[f] != 0) {
            if (f == 34) {
                this.n = i3;
                return e(this.ad, i2, 1);
            }
            return null;
        }
        int i4 = (i2 << 8) | f;
        int i5 = i + 2;
        int f2 = f(i3) & 255;
        if (iArr[f2] != 0) {
            if (f2 == 34) {
                this.n = i5;
                return e(this.ad, i4, 2);
            }
            return null;
        }
        int i6 = (i4 << 8) | f2;
        int i7 = i + 3;
        int f3 = f(i5) & 255;
        if (iArr[f3] != 0) {
            if (f3 == 34) {
                this.n = i7;
                return e(this.ad, i6, 3);
            }
            return null;
        }
        int i8 = (i6 << 8) | f3;
        int i9 = i + 4;
        int f4 = f(i7) & 255;
        if (iArr[f4] == 0) {
            return j(i9, f4, i8);
        }
        if (f4 == 34) {
            this.n = i9;
            return e(this.ad, i8, 4);
        }
        return null;
    }

    private final String j(int i, int i2, int i3) {
        int[] iArr = ai;
        int i4 = i + 1;
        int f = f(i) & 255;
        if (iArr[f] != 0) {
            if (f == 34) {
                this.n = i4;
                return a(this.ad, i3, i2, 1);
            }
            return null;
        }
        int i5 = (i2 << 8) | f;
        int i6 = i + 2;
        int f2 = f(i4) & 255;
        if (iArr[f2] != 0) {
            if (f2 == 34) {
                this.n = i6;
                return a(this.ad, i3, i5, 2);
            }
            return null;
        }
        int i7 = (i5 << 8) | f2;
        int i8 = i + 3;
        int f3 = f(i6) & 255;
        if (iArr[f3] != 0) {
            if (f3 == 34) {
                this.n = i8;
                return a(this.ad, i3, i7, 3);
            }
            return null;
        } else if ((f(i8) & 255) == 34) {
            this.n = i + 4;
            return a(this.ad, i3, (i7 << 8) | f3, 4);
        } else {
            return null;
        }
    }

    private final JsonToken f(int i, int i2, int i3) {
        int i4;
        int[] iArr = this.af;
        int[] iArr2 = ai;
        while (this.n < this.m) {
            int aB = aB();
            if (iArr2[aB] == 0) {
                if (i3 < 4) {
                    i3++;
                    i2 = (i2 << 8) | aB;
                } else {
                    if (i >= iArr.length) {
                        iArr = AbstractC9386oc.a(iArr, iArr.length);
                        this.af = iArr;
                    }
                    i4 = i + 1;
                    iArr[i] = i2;
                    i = i4;
                    i2 = aB;
                    i3 = 1;
                }
            } else if (aB != 34) {
                if (aB != 92) {
                    b(aB, "name");
                } else {
                    aB = aZ();
                    if (aB < 0) {
                        this.Y = 8;
                        this.Z = 7;
                        this.ah = i;
                        this.ag = i2;
                        this.ae = i3;
                        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                        this.P = jsonToken;
                        return jsonToken;
                    }
                }
                if (i >= iArr.length) {
                    iArr = AbstractC9386oc.a(iArr, iArr.length);
                    this.af = iArr;
                }
                if (aB > 127) {
                    int i5 = 0;
                    if (i3 >= 4) {
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i3 = 0;
                    }
                    int i6 = i2 << 8;
                    if (aB < 2048) {
                        i2 = i6 | (aB >> 6) | 192;
                        i3++;
                    } else {
                        int i7 = i6 | (aB >> 12) | 224;
                        int i8 = i3 + 1;
                        if (i8 >= 4) {
                            iArr[i] = i7;
                            i++;
                            i8 = 0;
                        } else {
                            i5 = i7;
                        }
                        i2 = (i5 << 8) | ((aB >> 6) & 63) | 128;
                        i3 = i8 + 1;
                    }
                    aB = (aB & 63) | 128;
                }
                if (i3 < 4) {
                    i3++;
                    i2 = (i2 << 8) | aB;
                } else {
                    i4 = i + 1;
                    iArr[i] = i2;
                    i = i4;
                    i2 = aB;
                    i3 = 1;
                }
            } else {
                if (i3 > 0) {
                    if (i >= iArr.length) {
                        iArr = AbstractC9386oc.a(iArr, iArr.length);
                        this.af = iArr;
                    }
                    iArr[i] = AbstractC9375oR.e(i2, i3);
                    i++;
                } else if (i == 0) {
                    return g("");
                }
                String d = this.al.d(iArr, i);
                if (d == null) {
                    d = d(iArr, i, i3);
                }
                return g(d);
            }
        }
        this.ah = i;
        this.ag = i2;
        this.ae = i3;
        this.Y = 7;
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this.P = jsonToken2;
        return jsonToken2;
    }

    private JsonToken r(int i) {
        if (i != 35) {
            if (i != 39) {
                if (i == 47) {
                    return z(4);
                }
                if (i == 93) {
                    return aA();
                }
            } else if ((this.a & aq) != 0) {
                return d(0, 0, 0);
            }
        } else if ((this.a & ao) != 0) {
            return q(4);
        }
        if ((this.a & ar) == 0) {
            d((char) i, "was expecting double-quote to start field name");
        }
        if (C9391oh.f()[i] != 0) {
            d(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        return h(0, i, 1);
    }

    private JsonToken h(int i, int i2, int i3) {
        int[] iArr = this.af;
        int[] f = C9391oh.f();
        while (true) {
            int i4 = this.n;
            if (i4 >= this.m) {
                this.ah = i;
                this.ag = i2;
                this.ae = i3;
                this.Y = 10;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.P = jsonToken;
                return jsonToken;
            }
            int f2 = f(i4) & 255;
            if (f[f2] != 0) {
                if (i3 > 0) {
                    if (i >= iArr.length) {
                        iArr = AbstractC9386oc.a(iArr, iArr.length);
                        this.af = iArr;
                    }
                    iArr[i] = i2;
                    i++;
                }
                String d = this.al.d(iArr, i);
                if (d == null) {
                    d = d(iArr, i, i3);
                }
                return g(d);
            }
            this.n++;
            if (i3 < 4) {
                i3++;
                i2 = (i2 << 8) | f2;
            } else {
                if (i >= iArr.length) {
                    int[] a = AbstractC9386oc.a(iArr, iArr.length);
                    this.af = a;
                    iArr = a;
                }
                iArr[i] = i2;
                i++;
                i2 = f2;
                i3 = 1;
            }
        }
    }

    private JsonToken d(int i, int i2, int i3) {
        int[] iArr = this.af;
        int[] iArr2 = ai;
        while (this.n < this.m) {
            int aB = aB();
            if (aB != 39) {
                if (aB != 34 && iArr2[aB] != 0) {
                    if (aB != 92) {
                        b(aB, "name");
                    } else {
                        aB = aZ();
                        if (aB < 0) {
                            this.Y = 8;
                            this.Z = 9;
                            this.ah = i;
                            this.ag = i2;
                            this.ae = i3;
                            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                            this.P = jsonToken;
                            return jsonToken;
                        }
                    }
                    if (aB > 127) {
                        int i4 = 0;
                        if (i3 >= 4) {
                            if (i >= iArr.length) {
                                iArr = AbstractC9386oc.a(iArr, iArr.length);
                                this.af = iArr;
                            }
                            iArr[i] = i2;
                            i++;
                            i2 = 0;
                            i3 = 0;
                        }
                        int i5 = i2 << 8;
                        if (aB < 2048) {
                            i2 = i5 | (aB >> 6) | 192;
                            i3++;
                        } else {
                            int i6 = i5 | (aB >> 12) | 224;
                            int i7 = i3 + 1;
                            if (i7 >= 4) {
                                if (i >= iArr.length) {
                                    iArr = AbstractC9386oc.a(iArr, iArr.length);
                                    this.af = iArr;
                                }
                                iArr[i] = i6;
                                i++;
                                i7 = 0;
                            } else {
                                i4 = i6;
                            }
                            i2 = (i4 << 8) | ((aB >> 6) & 63) | 128;
                            i3 = i7 + 1;
                        }
                        aB = (aB & 63) | 128;
                    }
                }
                if (i3 < 4) {
                    i3++;
                    i2 = (i2 << 8) | aB;
                } else {
                    if (i >= iArr.length) {
                        int[] a = AbstractC9386oc.a(iArr, iArr.length);
                        this.af = a;
                        iArr = a;
                    }
                    iArr[i] = i2;
                    i++;
                    i2 = aB;
                    i3 = 1;
                }
            } else {
                if (i3 > 0) {
                    if (i >= iArr.length) {
                        iArr = AbstractC9386oc.a(iArr, iArr.length);
                        this.af = iArr;
                    }
                    iArr[i] = AbstractC9375oR.e(i2, i3);
                    i++;
                } else if (i == 0) {
                    return g("");
                }
                String d = this.al.d(iArr, i);
                if (d == null) {
                    d = d(iArr, i, i3);
                }
                return g(d);
            }
        }
        this.ah = i;
        this.ag = i2;
        this.ae = i3;
        this.Y = 9;
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this.P = jsonToken2;
        return jsonToken2;
    }

    protected final JsonToken aG() {
        int i;
        int j = j(this.aj, this.ak);
        if (j < 0) {
            this.Y = 8;
            return JsonToken.NOT_AVAILABLE;
        }
        int i2 = this.ah;
        int[] iArr = this.af;
        if (i2 >= iArr.length) {
            this.af = AbstractC9386oc.a(iArr, 32);
        }
        int i3 = this.ag;
        int i4 = this.ae;
        int i5 = 1;
        if (j > 127) {
            int i6 = 0;
            if (i4 >= 4) {
                int[] iArr2 = this.af;
                int i7 = this.ah;
                this.ah = i7 + 1;
                iArr2[i7] = i3;
                i3 = 0;
                i4 = 0;
            }
            int i8 = i3 << 8;
            if (j < 2048) {
                i = (j >> 6) | 192;
            } else {
                int i9 = i8 | (j >> 12) | 224;
                i4++;
                if (i4 >= 4) {
                    int[] iArr3 = this.af;
                    int i10 = this.ah;
                    this.ah = i10 + 1;
                    iArr3[i10] = i9;
                    i4 = 0;
                } else {
                    i6 = i9;
                }
                i8 = i6 << 8;
                i = ((j >> 6) & 63) | 128;
            }
            i3 = i8 | i;
            i4++;
            j = (j & 63) | 128;
        }
        if (i4 < 4) {
            i5 = 1 + i4;
            j |= i3 << 8;
        } else {
            int[] iArr4 = this.af;
            int i11 = this.ah;
            this.ah = i11 + 1;
            iArr4[i11] = i3;
        }
        if (this.Z == 9) {
            return d(this.ah, j, i5);
        }
        return f(this.ah, j, i5);
    }

    private int j(int i, int i2) {
        if (this.n >= this.m) {
            this.aj = i;
            this.ak = i2;
            return -1;
        }
        byte as2 = as();
        if (i2 == -1) {
            if (as2 == 34 || as2 == 47 || as2 == 92) {
                return as2;
            }
            if (as2 == 98) {
                return 8;
            }
            if (as2 == 102) {
                return 12;
            }
            if (as2 == 110) {
                return 10;
            }
            if (as2 == 114) {
                return 13;
            }
            if (as2 == 116) {
                return 9;
            }
            if (as2 != 117) {
                return b((char) as2);
            }
            if (this.n >= this.m) {
                this.ak = 0;
                this.aj = 0;
                return -1;
            }
            as2 = as();
            i2 = 0;
        }
        int i3 = as2 & 255;
        while (true) {
            int e = C9391oh.e(i3);
            if (e < 0) {
                d(i3 & PrivateKeyType.INVALID, "expected a hex-digit for character escape sequence");
            }
            i = (i << 4) | e;
            i2++;
            if (i2 == 4) {
                return i;
            }
            if (this.n >= this.m) {
                this.ak = i2;
                this.aj = i;
                return -1;
            }
            i3 = aB();
        }
    }

    protected JsonToken aT() {
        int i = this.n;
        char[] e = this.A.e();
        int[] iArr = as;
        int min = Math.min(this.m, e.length + i);
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            int f = f(i) & 255;
            if (iArr[f] == 0) {
                i++;
                e[i2] = (char) f;
                i2++;
            } else if (f == 34) {
                this.n = i + 1;
                this.A.b(i2);
                return c(JsonToken.VALUE_STRING);
            }
        }
        this.A.b(i2);
        this.n = i;
        return aX();
    }

    private final JsonToken aX() {
        int[] iArr = as;
        char[] j = this.A.j();
        int g = this.A.g();
        int i = this.n;
        int i2 = this.m;
        while (i < this.m) {
            int i3 = 0;
            if (g >= j.length) {
                j = this.A.d();
                g = 0;
            }
            int min = Math.min(this.m, (j.length - g) + i);
            while (true) {
                if (i < min) {
                    int i4 = i + 1;
                    int f = f(i) & 255;
                    int i5 = iArr[f];
                    if (i5 == 0) {
                        j[g] = (char) f;
                        g++;
                        i = i4;
                    } else if (f == 34) {
                        this.n = i4;
                        this.A.b(g);
                        return c(JsonToken.VALUE_STRING);
                    } else if (i4 >= i2 - 5) {
                        this.n = i4;
                        this.A.b(g);
                        if (!a(f, iArr[f], i4 < this.m)) {
                            this.Z = 40;
                            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                            this.P = jsonToken;
                            return jsonToken;
                        }
                        j = this.A.j();
                        g = this.A.g();
                        i = this.n;
                    } else {
                        if (i5 == 1) {
                            this.n = i4;
                            f = aW();
                            i = this.n;
                        } else if (i5 == 2) {
                            i += 2;
                            f = i(f, f(i4));
                        } else if (i5 != 3) {
                            if (i5 == 4) {
                                i4 = i + 4;
                                int e = e(f, f(i4), f(i + 2), f(i + 3));
                                int i6 = g + 1;
                                j[g] = (char) ((e >> 10) | 55296);
                                if (i6 >= j.length) {
                                    j = this.A.d();
                                    g = 0;
                                } else {
                                    g = i6;
                                }
                                f = (e & 1023) | 56320;
                            } else if (f < 32) {
                                b(f, "string value");
                            } else {
                                h(f);
                            }
                            i = i4;
                        } else {
                            f = a(f, f(i4), f(i + 2));
                            i += 3;
                        }
                        if (g >= j.length) {
                            j = this.A.d();
                        } else {
                            i3 = g;
                        }
                        g = i3 + 1;
                        j[i3] = (char) f;
                    }
                }
            }
        }
        this.n = i;
        this.Y = 40;
        this.A.b(g);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this.P = jsonToken2;
        return jsonToken2;
    }

    protected JsonToken aM() {
        int i = this.n;
        char[] e = this.A.e();
        int[] iArr = as;
        int min = Math.min(this.m, e.length + i);
        int i2 = 0;
        while (i < min) {
            int f = f(i) & 255;
            if (f == 39) {
                this.n = i + 1;
                this.A.b(i2);
                return c(JsonToken.VALUE_STRING);
            } else if (iArr[f] != 0) {
                break;
            } else {
                i++;
                e[i2] = (char) f;
                i2++;
            }
        }
        this.A.b(i2);
        this.n = i;
        return aY();
    }

    private final JsonToken aY() {
        int[] iArr = as;
        char[] j = this.A.j();
        int g = this.A.g();
        int i = this.n;
        int i2 = this.m;
        while (i < this.m) {
            int i3 = 0;
            if (g >= j.length) {
                j = this.A.d();
                g = 0;
            }
            int min = Math.min(this.m, (j.length - g) + i);
            while (true) {
                if (i < min) {
                    int i4 = i + 1;
                    int f = f(i) & 255;
                    int i5 = iArr[f];
                    if (i5 == 0 || f == 34) {
                        if (f == 39) {
                            this.n = i4;
                            this.A.b(g);
                            return c(JsonToken.VALUE_STRING);
                        }
                        j[g] = (char) f;
                        g++;
                        i = i4;
                    } else if (i4 >= i2 - 5) {
                        this.n = i4;
                        this.A.b(g);
                        if (!a(f, iArr[f], i4 < this.m)) {
                            this.Z = 45;
                            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                            this.P = jsonToken;
                            return jsonToken;
                        }
                        j = this.A.j();
                        g = this.A.g();
                        i = this.n;
                    } else {
                        if (i5 == 1) {
                            this.n = i4;
                            f = aW();
                            i = this.n;
                        } else if (i5 == 2) {
                            i += 2;
                            f = i(f, f(i4));
                        } else if (i5 != 3) {
                            if (i5 == 4) {
                                i4 = i + 4;
                                int e = e(f, f(i4), f(i + 2), f(i + 3));
                                int i6 = g + 1;
                                j[g] = (char) ((e >> 10) | 55296);
                                if (i6 >= j.length) {
                                    j = this.A.d();
                                    g = 0;
                                } else {
                                    g = i6;
                                }
                                f = (e & 1023) | 56320;
                            } else if (f < 32) {
                                b(f, "string value");
                            } else {
                                h(f);
                            }
                            i = i4;
                        } else {
                            f = a(f, f(i4), f(i + 2));
                            i += 3;
                        }
                        if (g >= j.length) {
                            j = this.A.d();
                        } else {
                            i3 = g;
                        }
                        g = i3 + 1;
                        j[i3] = (char) f;
                    }
                }
            }
        }
        this.n = i;
        this.Y = 45;
        this.A.b(g);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this.P = jsonToken2;
        return jsonToken2;
    }

    private final boolean a(int i, int i2, boolean z) {
        if (i2 == 1) {
            int j = j(0, -1);
            if (j < 0) {
                this.Y = 41;
                return false;
            }
            this.A.e((char) j);
            return true;
        } else if (i2 == 2) {
            if (z) {
                this.A.e((char) i(i, as()));
                return true;
            }
            this.Y = 42;
            this.ag = i;
            return false;
        } else if (i2 == 3) {
            int i3 = i & 15;
            if (z) {
                return c(i3, 1, as());
            }
            this.Y = 43;
            this.ag = i3;
            this.ae = 1;
            return false;
        } else if (i2 != 4) {
            if (i < 32) {
                b(i, "string value");
            } else {
                h(i);
            }
            this.A.e((char) i);
            return true;
        } else {
            int i4 = i & 7;
            if (z) {
                return b(i4, 1, as());
            }
            this.ag = i4;
            this.ae = 1;
            this.Y = 44;
            return false;
        }
    }

    private final boolean c(int i, int i2, int i3) {
        if (i2 == 1) {
            if ((i3 & 192) != 128) {
                g(i3 & PrivateKeyType.INVALID, this.n);
            }
            i = (i << 6) | (i3 & 63);
            if (this.n >= this.m) {
                this.Y = 43;
                this.ag = i;
                this.ae = 2;
                return false;
            }
            i3 = as();
        }
        if ((i3 & 192) != 128) {
            g(i3 & PrivateKeyType.INVALID, this.n);
        }
        this.A.e((char) ((i << 6) | (i3 & 63)));
        return true;
    }

    private final boolean b(int i, int i2, int i3) {
        if (i2 == 1) {
            if ((i3 & 192) != 128) {
                g(i3 & PrivateKeyType.INVALID, this.n);
            }
            i = (i << 6) | (i3 & 63);
            if (this.n >= this.m) {
                this.Y = 44;
                this.ag = i;
                this.ae = 2;
                return false;
            }
            i3 = as();
            i2 = 2;
        }
        if (i2 == 2) {
            if ((i3 & 192) != 128) {
                g(i3 & PrivateKeyType.INVALID, this.n);
            }
            i = (i << 6) | (i3 & 63);
            if (this.n >= this.m) {
                this.Y = 44;
                this.ag = i;
                this.ae = 3;
                return false;
            }
            i3 = as();
        }
        if ((i3 & 192) != 128) {
            g(i3 & PrivateKeyType.INVALID, this.n);
        }
        int i4 = ((i << 6) | (i3 & 63)) - AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
        this.A.e((char) ((i4 >> 10) | 55296));
        this.A.e((char) ((i4 & 1023) | 56320));
        return true;
    }

    private final int aZ() {
        if (this.m - this.n < 5) {
            return j(0, -1);
        }
        return aW();
    }

    private final int aW() {
        int e;
        int e2;
        int e3;
        byte as2 = as();
        if (as2 == 34 || as2 == 47 || as2 == 92) {
            return (char) as2;
        }
        if (as2 != 98) {
            if (as2 != 102) {
                if (as2 != 110) {
                    if (as2 != 114) {
                        if (as2 != 116) {
                            if (as2 != 117) {
                                return b((char) as2);
                            }
                            byte as3 = as();
                            int e4 = C9391oh.e(as3);
                            if (e4 < 0 || (e = C9391oh.e((as3 = as()))) < 0 || (e2 = C9391oh.e((as3 = as()))) < 0 || (e3 = C9391oh.e((as3 = as()))) < 0) {
                                d(as3 & 255, "expected a hex-digit for character escape sequence");
                                return -1;
                            }
                            return (((((e4 << 4) | e) << 4) | e2) << 4) | e3;
                        }
                        return 9;
                    }
                    return 13;
                }
                return 10;
            }
            return 12;
        }
        return 8;
    }

    private final int i(int i, int i2) {
        if ((i2 & 192) != 128) {
            g(i2 & PrivateKeyType.INVALID, this.n);
        }
        return ((i & 31) << 6) | (i2 & 63);
    }

    private final int a(int i, int i2, int i3) {
        if ((i2 & 192) != 128) {
            g(i2 & PrivateKeyType.INVALID, this.n);
        }
        if ((i3 & 192) != 128) {
            g(i3 & PrivateKeyType.INVALID, this.n);
        }
        return ((((i & 15) << 6) | (i2 & 63)) << 6) | (i3 & 63);
    }

    private final int e(int i, int i2, int i3, int i4) {
        if ((i2 & 192) != 128) {
            g(i2 & PrivateKeyType.INVALID, this.n);
        }
        if ((i3 & 192) != 128) {
            g(i3 & PrivateKeyType.INVALID, this.n);
        }
        if ((i4 & 192) != 128) {
            g(i4 & PrivateKeyType.INVALID, this.n);
        }
        return (((((((i & 7) << 6) | (i2 & 63)) << 6) | (i3 & 63)) << 6) | (i4 & 63)) - AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
    }
}
