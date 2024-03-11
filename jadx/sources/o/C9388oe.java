package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.filter.TokenFilter;

/* renamed from: o.oe  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9388oe extends AbstractC9323nS {
    protected TokenFilter a;
    protected String c;
    protected C9388oe e;
    protected boolean f;
    protected boolean i;
    protected final C9388oe j;

    public TokenFilter a(String str) {
        this.c = str;
        this.i = true;
        return this.a;
    }

    @Override // o.AbstractC9323nS
    public Object a() {
        return null;
    }

    @Override // o.AbstractC9323nS
    public void b(Object obj) {
    }

    @Override // o.AbstractC9323nS
    public final String c() {
        return this.c;
    }

    protected C9388oe e(int i, TokenFilter tokenFilter, boolean z) {
        this.b = i;
        this.a = tokenFilter;
        this.d = -1;
        this.c = null;
        this.f = z;
        this.i = false;
        return this;
    }

    @Override // o.AbstractC9323nS
    public boolean f() {
        return this.c != null;
    }

    public TokenFilter l() {
        return this.a;
    }

    @Override // o.AbstractC9323nS
    /* renamed from: n */
    public final C9388oe b() {
        return this.j;
    }

    public boolean o() {
        return this.f;
    }

    protected C9388oe(int i, C9388oe c9388oe, TokenFilter tokenFilter, boolean z) {
        this.b = i;
        this.j = c9388oe;
        this.a = tokenFilter;
        this.d = -1;
        this.f = z;
        this.i = false;
    }

    public static C9388oe e(TokenFilter tokenFilter) {
        return new C9388oe(0, null, tokenFilter, true);
    }

    public C9388oe c(TokenFilter tokenFilter, boolean z) {
        C9388oe c9388oe = this.e;
        if (c9388oe == null) {
            C9388oe c9388oe2 = new C9388oe(1, this, tokenFilter, z);
            this.e = c9388oe2;
            return c9388oe2;
        }
        return c9388oe.e(1, tokenFilter, z);
    }

    public C9388oe b(TokenFilter tokenFilter, boolean z) {
        C9388oe c9388oe = this.e;
        if (c9388oe == null) {
            C9388oe c9388oe2 = new C9388oe(2, this, tokenFilter, z);
            this.e = c9388oe2;
            return c9388oe2;
        }
        return c9388oe.e(2, tokenFilter, z);
    }

    public TokenFilter b(TokenFilter tokenFilter) {
        int i = this.b;
        if (i == 2) {
            return tokenFilter;
        }
        int i2 = this.d + 1;
        this.d = i2;
        if (i == 1) {
            return tokenFilter.d(i2);
        }
        return tokenFilter.c(i2);
    }

    public JsonToken m() {
        if (!this.f) {
            this.f = true;
            if (this.b == 2) {
                return JsonToken.START_OBJECT;
            }
            return JsonToken.START_ARRAY;
        } else if (this.i && this.b == 2) {
            this.i = false;
            return JsonToken.FIELD_NAME;
        } else {
            return null;
        }
    }

    public C9388oe e(C9388oe c9388oe) {
        C9388oe c9388oe2 = this.j;
        if (c9388oe2 == c9388oe) {
            return this;
        }
        while (c9388oe2 != null) {
            C9388oe c9388oe3 = c9388oe2.j;
            if (c9388oe3 == c9388oe) {
                return c9388oe2;
            }
            c9388oe2 = c9388oe3;
        }
        return null;
    }

    protected void a(StringBuilder sb) {
        C9388oe c9388oe = this.j;
        if (c9388oe != null) {
            c9388oe.a(sb);
        }
        int i = this.b;
        if (i != 2) {
            if (i == 1) {
                sb.append('[');
                sb.append(e());
                sb.append(']');
                return;
            }
            sb.append("/");
            return;
        }
        sb.append('{');
        if (this.c != null) {
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            sb.append(this.c);
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        } else {
            sb.append('?');
        }
        sb.append('}');
    }

    @Override // o.AbstractC9323nS
    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        a(sb);
        return sb.toString();
    }
}
