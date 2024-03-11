package o;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;

/* renamed from: o.sl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9600sl extends AbstractC9323nS {
    protected long a;
    protected String c;
    protected C9600sl e;
    protected final C9600sl f;
    protected Object g;
    protected boolean i;
    protected C9366oI j;

    @Override // o.AbstractC9323nS
    public Object a() {
        return this.g;
    }

    public boolean a(long j) {
        if (this.b != 2 || this.i) {
            return false;
        }
        this.i = true;
        this.a = j;
        return true;
    }

    @Override // o.AbstractC9323nS
    public void b(Object obj) {
        this.g = obj;
    }

    @Override // o.AbstractC9323nS
    public boolean f() {
        return this.i;
    }

    public boolean n() {
        if (this.b == 2) {
            if (!this.i) {
                return false;
            }
            this.i = false;
        }
        this.d++;
        return true;
    }

    @Override // o.AbstractC9323nS
    /* renamed from: o */
    public final C9600sl b() {
        return this.f;
    }

    protected C9600sl(int i, C9600sl c9600sl, C9366oI c9366oI, Object obj) {
        this.b = i;
        this.f = c9600sl;
        this.j = c9366oI;
        this.d = -1;
        this.g = obj;
    }

    private C9600sl c(int i, Object obj) {
        this.b = i;
        this.d = -1;
        this.i = false;
        this.g = obj;
        C9366oI c9366oI = this.j;
        if (c9366oI != null) {
            c9366oI.a();
        }
        return this;
    }

    public static C9600sl c(C9366oI c9366oI) {
        return new C9600sl(0, null, c9366oI, null);
    }

    public C9600sl e(Object obj) {
        C9600sl c9600sl = this.e;
        if (c9600sl == null) {
            C9366oI c9366oI = this.j;
            C9600sl c9600sl2 = new C9600sl(1, this, c9366oI == null ? null : c9366oI.b(), obj);
            this.e = c9600sl2;
            return c9600sl2;
        }
        return c9600sl.c(1, obj);
    }

    public C9600sl c(Object obj) {
        C9600sl c9600sl = this.e;
        if (c9600sl == null) {
            C9366oI c9366oI = this.j;
            C9600sl c9600sl2 = new C9600sl(2, this, c9366oI == null ? null : c9366oI.b(), obj);
            this.e = c9600sl2;
            return c9600sl2;
        }
        return c9600sl.c(2, obj);
    }

    @Override // o.AbstractC9323nS
    public final String c() {
        if (this.i) {
            String str = this.c;
            return str != null ? str : String.valueOf(this.a);
        }
        return null;
    }

    public boolean d(String str) {
        if (this.b != 2 || this.i) {
            return false;
        }
        this.i = true;
        this.c = str;
        C9366oI c9366oI = this.j;
        if (c9366oI != null) {
            b(c9366oI, str);
        }
        return true;
    }

    private final void b(C9366oI c9366oI, String str) {
        if (c9366oI.a(str)) {
            Object e = c9366oI.e();
            throw new JsonGenerationException("Duplicate field '" + str + "'", e instanceof JsonGenerator ? (JsonGenerator) e : null);
        }
    }
}
