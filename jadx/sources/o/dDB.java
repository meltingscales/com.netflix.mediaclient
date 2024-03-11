package o;

import java.lang.annotation.Annotation;
import java.util.List;
import o.AbstractC7716dCs;
import o.InterfaceC7707dCj;

/* loaded from: classes5.dex */
public abstract class dDB implements InterfaceC7707dCj {
    private final String a;
    private final InterfaceC7707dCj b;
    private final InterfaceC7707dCj d;
    private final int e;

    public /* synthetic */ dDB(String str, InterfaceC7707dCj interfaceC7707dCj, InterfaceC7707dCj interfaceC7707dCj2, C8627dsp c8627dsp) {
        this(str, interfaceC7707dCj, interfaceC7707dCj2);
    }

    @Override // o.InterfaceC7707dCj
    public String d() {
        return this.a;
    }

    @Override // o.InterfaceC7707dCj
    public int e() {
        return this.e;
    }

    private dDB(String str, InterfaceC7707dCj interfaceC7707dCj, InterfaceC7707dCj interfaceC7707dCj2) {
        this.a = str;
        this.d = interfaceC7707dCj;
        this.b = interfaceC7707dCj2;
        this.e = 2;
    }

    @Override // o.InterfaceC7707dCj
    public boolean a() {
        return InterfaceC7707dCj.a.d(this);
    }

    @Override // o.InterfaceC7707dCj
    public List<Annotation> c() {
        return InterfaceC7707dCj.a.e(this);
    }

    @Override // o.InterfaceC7707dCj
    public boolean i() {
        return InterfaceC7707dCj.a.c(this);
    }

    @Override // o.InterfaceC7707dCj
    public AbstractC7715dCr b() {
        return AbstractC7716dCs.e.a;
    }

    @Override // o.InterfaceC7707dCj
    public String a(int i) {
        return String.valueOf(i);
    }

    @Override // o.InterfaceC7707dCj
    public int b(String str) {
        Integer n;
        C8632dsu.c((Object) str, "");
        n = C8689dux.n(str);
        if (n != null) {
            return n.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid map index");
    }

    @Override // o.InterfaceC7707dCj
    public boolean e(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + d() + " expects only non-negative indices").toString());
    }

    @Override // o.InterfaceC7707dCj
    public List<Annotation> d(int i) {
        List<Annotation> i2;
        if (i < 0) {
            throw new IllegalArgumentException(("Illegal index " + i + ", " + d() + " expects only non-negative indices").toString());
        }
        i2 = C8569dql.i();
        return i2;
    }

    @Override // o.InterfaceC7707dCj
    public InterfaceC7707dCj c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Illegal index " + i + ", " + d() + " expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 != 0) {
            if (i2 == 1) {
                return this.b;
            }
            throw new IllegalStateException("Unreached".toString());
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dDB) {
            dDB ddb = (dDB) obj;
            return C8632dsu.c((Object) d(), (Object) ddb.d()) && C8632dsu.c(this.d, ddb.d) && C8632dsu.c(this.b, ddb.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = d().hashCode();
        return (((hashCode * 31) + this.d.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return d() + '(' + this.d + ", " + this.b + ')';
    }
}
