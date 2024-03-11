package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.filter.TokenFilter;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: o.ob  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9385ob extends C9444ph {
    protected JsonToken b;
    protected boolean d;
    protected TokenFilter f;
    protected JsonToken g;
    protected C9388oe h;
    protected TokenFilter.Inclusion i;
    protected C9388oe j;
    protected int l;

    /* renamed from: o  reason: collision with root package name */
    protected TokenFilter f13891o;

    private final boolean V() {
        int i = this.l;
        if (i == 0 || this.d) {
            this.l = i + 1;
            return true;
        }
        return false;
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public boolean N() {
        return this.b != null;
    }

    protected AbstractC9323nS W() {
        C9388oe c9388oe = this.j;
        return c9388oe != null ? c9388oe : this.h;
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public final boolean a(JsonToken jsonToken) {
        return this.b == jsonToken;
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public void e() {
        JsonToken jsonToken = this.b;
        if (jsonToken != null) {
            this.g = jsonToken;
            this.b = null;
        }
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public JsonToken f() {
        return this.b;
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public JsonToken o() {
        return this.b;
    }

    @Deprecated
    public C9385ob(JsonParser jsonParser, TokenFilter tokenFilter, boolean z, boolean z2) {
        this(jsonParser, tokenFilter, z ? TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH : TokenFilter.Inclusion.ONLY_INCLUDE_ALL, z2);
    }

    public C9385ob(JsonParser jsonParser, TokenFilter tokenFilter, TokenFilter.Inclusion inclusion, boolean z) {
        super(jsonParser);
        this.f13891o = tokenFilter;
        this.f = tokenFilter;
        this.h = C9388oe.e(tokenFilter);
        this.i = inclusion;
        this.d = z;
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public final int t() {
        return j();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public final int j() {
        JsonToken jsonToken = this.b;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.c();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public boolean e(int i) {
        JsonToken jsonToken = this.b;
        return jsonToken == null ? i == 0 : jsonToken.c() == i;
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public boolean J() {
        return this.b == JsonToken.START_ARRAY;
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public boolean K() {
        return this.b == JsonToken.START_OBJECT;
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public JsonLocation k() {
        return this.m.k();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public AbstractC9323nS z() {
        return W();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public String l() {
        AbstractC9323nS W = W();
        JsonToken jsonToken = this.b;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            AbstractC9323nS b = W.b();
            if (b == null) {
                return null;
            }
            return b.c();
        }
        return W.c();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public String d() {
        AbstractC9323nS W = W();
        JsonToken jsonToken = this.b;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            AbstractC9323nS b = W.b();
            if (b == null) {
                return null;
            }
            return b.c();
        }
        return W.c();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public JsonToken Q() {
        JsonToken d;
        JsonToken d2;
        JsonToken d3;
        TokenFilter b;
        JsonToken jsonToken;
        if (!this.d && (jsonToken = this.b) != null && this.j == null && jsonToken.b() && !this.h.o() && this.i == TokenFilter.Inclusion.ONLY_INCLUDE_ALL && this.f == TokenFilter.e) {
            this.b = null;
            return null;
        }
        C9388oe c9388oe = this.j;
        if (c9388oe != null) {
            do {
                JsonToken m = c9388oe.m();
                if (m != null) {
                    this.b = m;
                    return m;
                }
                C9388oe c9388oe2 = this.h;
                if (c9388oe == c9388oe2) {
                    this.j = null;
                    if (c9388oe.h()) {
                        JsonToken o2 = this.m.o();
                        this.b = o2;
                        if (o2 == JsonToken.END_ARRAY) {
                            C9388oe b2 = this.h.b();
                            this.h = b2;
                            this.f = b2.l();
                        }
                        return o2;
                    }
                    JsonToken f = this.m.f();
                    if (f == JsonToken.END_OBJECT) {
                        C9388oe b3 = this.h.b();
                        this.h = b3;
                        this.f = b3.l();
                    }
                    if (f != JsonToken.FIELD_NAME) {
                        this.b = f;
                        return f;
                    }
                } else {
                    c9388oe = c9388oe2.e(c9388oe);
                    this.j = c9388oe;
                }
            } while (c9388oe != null);
            throw d("Unexpected problem: chain of filtered context broken");
        }
        JsonToken Q = this.m.Q();
        if (Q == null) {
            this.b = Q;
            return Q;
        }
        int c = Q.c();
        if (c == 1) {
            TokenFilter tokenFilter = this.f;
            TokenFilter tokenFilter2 = TokenFilter.e;
            if (tokenFilter == tokenFilter2) {
                this.h = this.h.b(tokenFilter, true);
                this.b = Q;
                return Q;
            } else if (tokenFilter == null) {
                this.m.T();
            } else {
                TokenFilter b4 = this.h.b(tokenFilter);
                if (b4 == null) {
                    this.m.T();
                } else {
                    if (b4 != tokenFilter2) {
                        b4 = b4.b();
                    }
                    this.f = b4;
                    if (b4 == tokenFilter2) {
                        this.h = this.h.b(b4, true);
                        this.b = Q;
                        return Q;
                    } else if (b4 != null && this.i == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                        this.h = this.h.b(b4, true);
                        this.b = Q;
                        return Q;
                    } else {
                        C9388oe b5 = this.h.b(b4, false);
                        this.h = b5;
                        if (this.i == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (d = d(b5)) != null) {
                            this.b = d;
                            return d;
                        }
                    }
                }
            }
        } else {
            if (c != 2) {
                if (c == 3) {
                    TokenFilter tokenFilter3 = this.f;
                    TokenFilter tokenFilter4 = TokenFilter.e;
                    if (tokenFilter3 == tokenFilter4) {
                        this.h = this.h.c(tokenFilter3, true);
                        this.b = Q;
                        return Q;
                    } else if (tokenFilter3 == null) {
                        this.m.T();
                    } else {
                        TokenFilter b6 = this.h.b(tokenFilter3);
                        if (b6 == null) {
                            this.m.T();
                        } else {
                            if (b6 != tokenFilter4) {
                                b6 = b6.a();
                            }
                            this.f = b6;
                            if (b6 == tokenFilter4) {
                                this.h = this.h.c(b6, true);
                                this.b = Q;
                                return Q;
                            } else if (b6 != null && this.i == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                                this.h = this.h.c(b6, true);
                                this.b = Q;
                                return Q;
                            } else {
                                C9388oe c2 = this.h.c(b6, false);
                                this.h = c2;
                                if (this.i == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (d2 = d(c2)) != null) {
                                    this.b = d2;
                                    return d2;
                                }
                            }
                        }
                    }
                } else if (c != 4) {
                    if (c == 5) {
                        String l = this.m.l();
                        TokenFilter a = this.h.a(l);
                        TokenFilter tokenFilter5 = TokenFilter.e;
                        if (a == tokenFilter5) {
                            this.f = a;
                            this.b = Q;
                            return Q;
                        } else if (a == null) {
                            this.m.Q();
                            this.m.T();
                        } else {
                            TokenFilter e = a.e(l);
                            if (e == null) {
                                this.m.Q();
                                this.m.T();
                            } else {
                                this.f = e;
                                if (e == tokenFilter5) {
                                    if (V()) {
                                        if (this.i == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH) {
                                            this.b = Q;
                                            return Q;
                                        }
                                    } else {
                                        this.m.Q();
                                        this.m.T();
                                    }
                                }
                                if (this.i != TokenFilter.Inclusion.ONLY_INCLUDE_ALL && (d3 = d(this.h)) != null) {
                                    this.b = d3;
                                    return d3;
                                }
                            }
                        }
                    } else {
                        TokenFilter tokenFilter6 = this.f;
                        TokenFilter tokenFilter7 = TokenFilter.e;
                        if (tokenFilter6 == tokenFilter7) {
                            this.b = Q;
                            return Q;
                        } else if (tokenFilter6 != null && (((b = this.h.b(tokenFilter6)) == tokenFilter7 || (b != null && b.d(this.m))) && V())) {
                            this.b = Q;
                            return Q;
                        }
                    }
                }
            }
            boolean o3 = this.h.o();
            TokenFilter l2 = this.h.l();
            if (l2 != null && l2 != TokenFilter.e) {
                l2.e();
            }
            C9388oe b7 = this.h.b();
            this.h = b7;
            this.f = b7.l();
            if (o3) {
                this.b = Q;
                return Q;
            }
        }
        return U();
    }

    protected final JsonToken U() {
        TokenFilter b;
        JsonToken d;
        JsonToken d2;
        JsonToken d3;
        while (true) {
            JsonToken Q = this.m.Q();
            if (Q == null) {
                this.b = Q;
                return Q;
            }
            int c = Q.c();
            if (c == 1) {
                TokenFilter tokenFilter = this.f;
                TokenFilter tokenFilter2 = TokenFilter.e;
                if (tokenFilter == tokenFilter2) {
                    this.h = this.h.b(tokenFilter, true);
                    this.b = Q;
                    return Q;
                } else if (tokenFilter == null) {
                    this.m.T();
                } else {
                    TokenFilter b2 = this.h.b(tokenFilter);
                    if (b2 == null) {
                        this.m.T();
                    } else {
                        if (b2 != tokenFilter2) {
                            b2 = b2.b();
                        }
                        this.f = b2;
                        if (b2 == tokenFilter2) {
                            this.h = this.h.b(b2, true);
                            this.b = Q;
                            return Q;
                        } else if (b2 != null && this.i == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                            this.h = this.h.b(b2, true);
                            this.b = Q;
                            return Q;
                        } else {
                            C9388oe b3 = this.h.b(b2, false);
                            this.h = b3;
                            if (this.i == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (d3 = d(b3)) != null) {
                                this.b = d3;
                                return d3;
                            }
                        }
                    }
                }
            } else if (c == 2) {
                boolean o2 = this.h.o();
                TokenFilter l = this.h.l();
                if (l != null && l != TokenFilter.e) {
                    boolean a = l.a(this.h.f());
                    l.d();
                    if (a) {
                        return b(this.h);
                    }
                }
                C9388oe b4 = this.h.b();
                this.h = b4;
                this.f = b4.l();
                if (o2) {
                    this.b = Q;
                    return Q;
                }
            } else if (c == 3) {
                TokenFilter tokenFilter3 = this.f;
                TokenFilter tokenFilter4 = TokenFilter.e;
                if (tokenFilter3 == tokenFilter4) {
                    this.h = this.h.c(tokenFilter3, true);
                    this.b = Q;
                    return Q;
                } else if (tokenFilter3 == null) {
                    this.m.T();
                } else {
                    TokenFilter b5 = this.h.b(tokenFilter3);
                    if (b5 == null) {
                        this.m.T();
                    } else {
                        if (b5 != tokenFilter4) {
                            b5 = b5.a();
                        }
                        this.f = b5;
                        if (b5 == tokenFilter4) {
                            this.h = this.h.c(b5, true);
                            this.b = Q;
                            return Q;
                        } else if (b5 != null && this.i == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                            this.h = this.h.c(b5, true);
                            this.b = Q;
                            return Q;
                        } else {
                            C9388oe c2 = this.h.c(b5, false);
                            this.h = c2;
                            if (this.i == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (d2 = d(c2)) != null) {
                                this.b = d2;
                                return d2;
                            }
                        }
                    }
                }
            } else if (c == 4) {
                boolean o3 = this.h.o();
                TokenFilter l2 = this.h.l();
                if (l2 != null && l2 != TokenFilter.e) {
                    boolean a2 = l2.a(this.h.j());
                    l2.e();
                    if (a2) {
                        return b(this.h);
                    }
                }
                C9388oe b6 = this.h.b();
                this.h = b6;
                this.f = b6.l();
                if (o3) {
                    this.b = Q;
                    return Q;
                }
            } else if (c == 5) {
                String l3 = this.m.l();
                TokenFilter a3 = this.h.a(l3);
                TokenFilter tokenFilter5 = TokenFilter.e;
                if (a3 == tokenFilter5) {
                    this.f = a3;
                    this.b = Q;
                    return Q;
                } else if (a3 == null) {
                    this.m.Q();
                    this.m.T();
                } else {
                    TokenFilter e = a3.e(l3);
                    if (e == null) {
                        this.m.Q();
                        this.m.T();
                    } else {
                        this.f = e;
                        if (e == tokenFilter5) {
                            if (V()) {
                                if (this.i == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH) {
                                    this.b = Q;
                                    return Q;
                                }
                            } else {
                                this.m.Q();
                                this.m.T();
                            }
                        } else if (this.i != TokenFilter.Inclusion.ONLY_INCLUDE_ALL && (d = d(this.h)) != null) {
                            this.b = d;
                            return d;
                        }
                    }
                }
            } else {
                TokenFilter tokenFilter6 = this.f;
                TokenFilter tokenFilter7 = TokenFilter.e;
                if (tokenFilter6 == tokenFilter7) {
                    this.b = Q;
                    return Q;
                } else if (tokenFilter6 != null && ((b = this.h.b(tokenFilter6)) == tokenFilter7 || (b != null && b.d(this.m)))) {
                    if (V()) {
                        this.b = Q;
                        return Q;
                    }
                }
            }
        }
    }

    protected final JsonToken d(C9388oe c9388oe) {
        TokenFilter b;
        while (true) {
            JsonToken Q = this.m.Q();
            if (Q == null) {
                return Q;
            }
            int c = Q.c();
            boolean z = false;
            if (c == 1) {
                TokenFilter tokenFilter = this.f;
                TokenFilter tokenFilter2 = TokenFilter.e;
                if (tokenFilter == tokenFilter2) {
                    this.h = this.h.b(tokenFilter, true);
                    return Q;
                } else if (tokenFilter == null) {
                    this.m.T();
                } else {
                    TokenFilter b2 = this.h.b(tokenFilter);
                    if (b2 == null) {
                        this.m.T();
                    } else {
                        if (b2 != tokenFilter2) {
                            b2 = b2.b();
                        }
                        this.f = b2;
                        if (b2 == tokenFilter2) {
                            this.h = this.h.b(b2, true);
                            return b(c9388oe);
                        } else if (b2 != null && this.i == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                            this.h = this.h.c(b2, true);
                            return b(c9388oe);
                        } else {
                            this.h = this.h.b(b2, false);
                        }
                    }
                }
            } else if (c == 2) {
                TokenFilter l = this.h.l();
                if (l != null && l != TokenFilter.e) {
                    boolean d = l.d(this.h.f());
                    l.d();
                    if (d) {
                        C9388oe c9388oe2 = this.h;
                        C9388oe c9388oe3 = c9388oe2.j;
                        c9388oe2.c = c9388oe3 == null ? null : c9388oe3.c;
                        c9388oe2.i = false;
                        return b(c9388oe);
                    }
                }
                C9388oe c9388oe4 = this.h;
                if (c9388oe4 == c9388oe && c9388oe4.o()) {
                    z = true;
                }
                C9388oe b3 = this.h.b();
                this.h = b3;
                this.f = b3.l();
                if (z) {
                    return Q;
                }
            } else if (c == 3) {
                TokenFilter b4 = this.h.b(this.f);
                if (b4 == null) {
                    this.m.T();
                } else {
                    TokenFilter tokenFilter3 = TokenFilter.e;
                    if (b4 != tokenFilter3) {
                        b4 = b4.a();
                    }
                    this.f = b4;
                    if (b4 == tokenFilter3) {
                        this.h = this.h.c(b4, true);
                        return b(c9388oe);
                    } else if (b4 != null && this.i == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                        this.h = this.h.c(b4, true);
                        return b(c9388oe);
                    } else {
                        this.h = this.h.c(b4, false);
                    }
                }
            } else if (c == 4) {
                TokenFilter l2 = this.h.l();
                if (l2 != null && l2 != TokenFilter.e) {
                    boolean a = l2.a(this.h.j());
                    l2.e();
                    if (a) {
                        return b(c9388oe);
                    }
                }
                C9388oe c9388oe5 = this.h;
                if (c9388oe5 == c9388oe && c9388oe5.o()) {
                    z = true;
                }
                C9388oe b5 = this.h.b();
                this.h = b5;
                this.f = b5.l();
                if (z) {
                    return Q;
                }
            } else if (c == 5) {
                String l3 = this.m.l();
                TokenFilter a2 = this.h.a(l3);
                TokenFilter tokenFilter4 = TokenFilter.e;
                if (a2 == tokenFilter4) {
                    this.f = a2;
                    return b(c9388oe);
                } else if (a2 == null) {
                    this.m.Q();
                    this.m.T();
                } else {
                    TokenFilter e = a2.e(l3);
                    if (e == null) {
                        this.m.Q();
                        this.m.T();
                    } else {
                        this.f = e;
                        if (e != tokenFilter4) {
                            continue;
                        } else if (V()) {
                            return b(c9388oe);
                        } else {
                            this.f = this.h.a(l3);
                        }
                    }
                }
            } else {
                TokenFilter tokenFilter5 = this.f;
                TokenFilter tokenFilter6 = TokenFilter.e;
                if (tokenFilter5 == tokenFilter6) {
                    return b(c9388oe);
                }
                if (tokenFilter5 != null && ((b = this.h.b(tokenFilter5)) == tokenFilter6 || (b != null && b.d(this.m)))) {
                    if (V()) {
                        return b(c9388oe);
                    }
                }
            }
        }
    }

    private JsonToken b(C9388oe c9388oe) {
        this.j = c9388oe;
        JsonToken m = c9388oe.m();
        if (m != null) {
            return m;
        }
        while (c9388oe != this.h) {
            c9388oe = this.j.e(c9388oe);
            this.j = c9388oe;
            if (c9388oe == null) {
                throw d("Unexpected problem: chain of filtered context broken");
            }
            JsonToken m2 = c9388oe.m();
            if (m2 != null) {
                return m2;
            }
        }
        throw d("Internal error: failed to locate expected buffered tokens");
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public JsonToken O() {
        JsonToken Q = Q();
        return Q == JsonToken.FIELD_NAME ? Q() : Q;
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public JsonParser T() {
        JsonToken jsonToken = this.b;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken Q = Q();
            if (Q == null) {
                return this;
            }
            if (Q.j()) {
                i++;
            } else if (Q.g() && i - 1 == 0) {
                return this;
            }
        }
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public String A() {
        if (this.b == JsonToken.FIELD_NAME) {
            return d();
        }
        return this.m.A();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public boolean M() {
        if (this.b == JsonToken.FIELD_NAME) {
            return false;
        }
        return this.m.M();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public char[] B() {
        if (this.b == JsonToken.FIELD_NAME) {
            return d().toCharArray();
        }
        return this.m.B();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public int D() {
        if (this.b == JsonToken.FIELD_NAME) {
            return d().length();
        }
        return this.m.D();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public int H() {
        if (this.b == JsonToken.FIELD_NAME) {
            return 0;
        }
        return this.m.H();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public BigInteger h() {
        return this.m.h();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public boolean g() {
        return this.m.g();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public byte m() {
        return this.m.m();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public short C() {
        return this.m.C();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public BigDecimal r() {
        return this.m.r();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public double p() {
        return this.m.p();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public float s() {
        return this.m.s();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public int u() {
        return this.m.u();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public long w() {
        return this.m.w();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType v() {
        return this.m.v();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public Number y() {
        return this.m.y();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public int E() {
        return this.m.E();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public int d(int i) {
        return this.m.d(i);
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public long I() {
        return this.m.I();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public long d(long j) {
        return this.m.d(j);
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public String L() {
        if (this.b == JsonToken.FIELD_NAME) {
            return d();
        }
        return this.m.L();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public String c(String str) {
        if (this.b == JsonToken.FIELD_NAME) {
            return d();
        }
        return this.m.c(str);
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public Object q() {
        return this.m.q();
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public byte[] e(Base64Variant base64Variant) {
        return this.m.e(base64Variant);
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public int e(Base64Variant base64Variant, OutputStream outputStream) {
        return this.m.e(base64Variant, outputStream);
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public JsonLocation G() {
        return this.m.G();
    }
}
