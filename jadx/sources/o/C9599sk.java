package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;

/* renamed from: o.sk  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9599sk extends AbstractC9323nS {
    protected Object a;
    protected String c;
    protected C9599sk e = null;
    protected int g;
    protected final C9599sk h;
    protected final C9366oI j;

    @Override // o.AbstractC9323nS
    public Object a() {
        return this.a;
    }

    @Override // o.AbstractC9323nS
    public void b(Object obj) {
        this.a = obj;
    }

    @Override // o.AbstractC9323nS
    public String c() {
        return this.c;
    }

    @Override // o.AbstractC9323nS
    /* renamed from: l */
    public C9599sk b() {
        return this.h;
    }

    public boolean m() {
        int i = this.d + 1;
        this.d = i;
        return i != this.g;
    }

    public int n() {
        return this.g;
    }

    public boolean o() {
        return this.g >= 0;
    }

    public C9599sk(C9599sk c9599sk, C9366oI c9366oI, int i, int i2) {
        this.h = c9599sk;
        this.j = c9366oI;
        this.b = i;
        this.g = i2;
        this.d = -1;
    }

    protected void d(int i, int i2) {
        this.b = i;
        this.g = i2;
        this.d = -1;
        this.c = null;
        this.a = null;
        C9366oI c9366oI = this.j;
        if (c9366oI != null) {
            c9366oI.a();
        }
    }

    public static C9599sk e(C9366oI c9366oI) {
        return new C9599sk(null, c9366oI, 0, -1);
    }

    public C9599sk e(int i) {
        C9599sk c9599sk = this.e;
        if (c9599sk == null) {
            C9366oI c9366oI = this.j;
            C9599sk c9599sk2 = new C9599sk(this, c9366oI == null ? null : c9366oI.b(), 1, i);
            this.e = c9599sk2;
            return c9599sk2;
        }
        c9599sk.d(1, i);
        return c9599sk;
    }

    public C9599sk c(int i) {
        C9599sk c9599sk = this.e;
        if (c9599sk == null) {
            C9366oI c9366oI = this.j;
            C9599sk c9599sk2 = new C9599sk(this, c9366oI == null ? null : c9366oI.b(), 2, i);
            this.e = c9599sk2;
            return c9599sk2;
        }
        c9599sk.d(2, i);
        return c9599sk;
    }

    @Override // o.AbstractC9323nS
    public JsonLocation d(Object obj) {
        return new JsonLocation(obj, 1L, -1, -1);
    }

    public void e(String str) {
        this.c = str;
        C9366oI c9366oI = this.j;
        if (c9366oI != null) {
            e(c9366oI, str);
        }
    }

    private void e(C9366oI c9366oI, String str) {
        if (c9366oI.a(str)) {
            throw new JsonParseException((JsonParser) null, "Duplicate field '" + str + "'", c9366oI.d());
        }
    }

    @Override // o.AbstractC9323nS
    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.b;
        if (i == 0) {
            sb.append("/");
        } else if (i == 1) {
            sb.append('[');
            sb.append(e());
            sb.append(']');
        } else if (i == 2) {
            sb.append('{');
            if (this.c != null) {
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                C9391oh.d(sb, this.c);
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else {
                sb.append('?');
            }
            sb.append('}');
        }
        return sb.toString();
    }
}
