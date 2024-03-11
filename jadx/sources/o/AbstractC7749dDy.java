package o;

import java.lang.annotation.Annotation;
import java.util.List;
import o.AbstractC7716dCs;
import o.InterfaceC7707dCj;

/* renamed from: o.dDy  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7749dDy implements InterfaceC7707dCj {
    private final int b;
    private final InterfaceC7707dCj e;

    public /* synthetic */ AbstractC7749dDy(InterfaceC7707dCj interfaceC7707dCj, C8627dsp c8627dsp) {
        this(interfaceC7707dCj);
    }

    @Override // o.InterfaceC7707dCj
    public int e() {
        return this.b;
    }

    private AbstractC7749dDy(InterfaceC7707dCj interfaceC7707dCj) {
        this.e = interfaceC7707dCj;
        this.b = 1;
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
        return AbstractC7716dCs.c.d;
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
        throw new IllegalArgumentException(str + " is not a valid list index");
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
        if (i >= 0) {
            return this.e;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + d() + " expects only non-negative indices").toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC7749dDy) {
            AbstractC7749dDy abstractC7749dDy = (AbstractC7749dDy) obj;
            return C8632dsu.c(this.e, abstractC7749dDy.e) && C8632dsu.c((Object) d(), (Object) abstractC7749dDy.d());
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + d().hashCode();
    }

    public String toString() {
        return d() + '(' + this.e + ')';
    }
}
