package o;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;

/* renamed from: o.oN  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9371oN extends AbstractC9323nS {
    protected Object a;
    protected C9371oN c;
    protected String e;
    protected final C9371oN f;
    protected C9366oI i;
    protected boolean j;

    @Override // o.AbstractC9323nS
    public Object a() {
        return this.a;
    }

    @Override // o.AbstractC9323nS
    public void b(Object obj) {
        this.a = obj;
    }

    @Override // o.AbstractC9323nS
    public final String c() {
        return this.e;
    }

    public C9371oN d(C9366oI c9366oI) {
        this.i = c9366oI;
        return this;
    }

    @Override // o.AbstractC9323nS
    public boolean f() {
        return this.e != null;
    }

    public C9371oN m() {
        this.a = null;
        return this.f;
    }

    public C9366oI o() {
        return this.i;
    }

    @Override // o.AbstractC9323nS
    /* renamed from: r */
    public final C9371oN b() {
        return this.f;
    }

    public int s() {
        int i = this.b;
        if (i == 2) {
            if (this.j) {
                this.j = false;
                this.d++;
                return 2;
            }
            return 5;
        } else if (i == 1) {
            int i2 = this.d;
            this.d = i2 + 1;
            return i2 < 0 ? 0 : 1;
        } else {
            int i3 = this.d + 1;
            this.d = i3;
            return i3 == 0 ? 0 : 3;
        }
    }

    protected C9371oN(int i, C9371oN c9371oN, C9366oI c9366oI) {
        this.b = i;
        this.f = c9371oN;
        this.i = c9366oI;
        this.d = -1;
    }

    protected C9371oN(int i, C9371oN c9371oN, C9366oI c9366oI, Object obj) {
        this.b = i;
        this.f = c9371oN;
        this.i = c9366oI;
        this.d = -1;
        this.a = obj;
    }

    public C9371oN b(int i) {
        this.b = i;
        this.d = -1;
        this.e = null;
        this.j = false;
        this.a = null;
        C9366oI c9366oI = this.i;
        if (c9366oI != null) {
            c9366oI.a();
        }
        return this;
    }

    public C9371oN c(int i, Object obj) {
        this.b = i;
        this.d = -1;
        this.e = null;
        this.j = false;
        this.a = obj;
        C9366oI c9366oI = this.i;
        if (c9366oI != null) {
            c9366oI.a();
        }
        return this;
    }

    public static C9371oN c(C9366oI c9366oI) {
        return new C9371oN(0, null, c9366oI);
    }

    public C9371oN l() {
        C9371oN c9371oN = this.c;
        if (c9371oN == null) {
            C9366oI c9366oI = this.i;
            C9371oN c9371oN2 = new C9371oN(1, this, c9366oI == null ? null : c9366oI.b());
            this.c = c9371oN2;
            return c9371oN2;
        }
        return c9371oN.b(1);
    }

    public C9371oN a(Object obj) {
        C9371oN c9371oN = this.c;
        if (c9371oN == null) {
            C9366oI c9366oI = this.i;
            C9371oN c9371oN2 = new C9371oN(1, this, c9366oI == null ? null : c9366oI.b(), obj);
            this.c = c9371oN2;
            return c9371oN2;
        }
        return c9371oN.c(1, obj);
    }

    public C9371oN n() {
        C9371oN c9371oN = this.c;
        if (c9371oN == null) {
            C9366oI c9366oI = this.i;
            C9371oN c9371oN2 = new C9371oN(2, this, c9366oI == null ? null : c9366oI.b());
            this.c = c9371oN2;
            return c9371oN2;
        }
        return c9371oN.b(2);
    }

    public C9371oN e(Object obj) {
        C9371oN c9371oN = this.c;
        if (c9371oN == null) {
            C9366oI c9366oI = this.i;
            C9371oN c9371oN2 = new C9371oN(2, this, c9366oI == null ? null : c9366oI.b(), obj);
            this.c = c9371oN2;
            return c9371oN2;
        }
        return c9371oN.c(2, obj);
    }

    public int b(String str) {
        if (this.b != 2 || this.j) {
            return 4;
        }
        this.j = true;
        this.e = str;
        C9366oI c9366oI = this.i;
        if (c9366oI != null) {
            e(c9366oI, str);
        }
        return this.d < 0 ? 0 : 1;
    }

    private final void e(C9366oI c9366oI, String str) {
        if (c9366oI.a(str)) {
            Object e = c9366oI.e();
            throw new JsonGenerationException("Duplicate field '" + str + "'", e instanceof JsonGenerator ? (JsonGenerator) e : null);
        }
    }
}
