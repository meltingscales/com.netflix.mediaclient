package o;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.InterfaceC7707dCj;

/* loaded from: classes5.dex */
public final class dDV implements InterfaceC7707dCj {
    private final AbstractC7709dCl c;
    private final String d;

    @Override // o.InterfaceC7707dCj
    public String d() {
        return this.d;
    }

    @Override // o.InterfaceC7707dCj
    public int e() {
        return 0;
    }

    @Override // o.InterfaceC7707dCj
    /* renamed from: f */
    public AbstractC7709dCl b() {
        return this.c;
    }

    public dDV(String str, AbstractC7709dCl abstractC7709dCl) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) abstractC7709dCl, "");
        this.d = str;
        this.c = abstractC7709dCl;
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
    public String a(int i) {
        g();
        throw new KotlinNothingValueException();
    }

    @Override // o.InterfaceC7707dCj
    public int b(String str) {
        C8632dsu.c((Object) str, "");
        g();
        throw new KotlinNothingValueException();
    }

    @Override // o.InterfaceC7707dCj
    public boolean e(int i) {
        g();
        throw new KotlinNothingValueException();
    }

    @Override // o.InterfaceC7707dCj
    public InterfaceC7707dCj c(int i) {
        g();
        throw new KotlinNothingValueException();
    }

    @Override // o.InterfaceC7707dCj
    public List<Annotation> d(int i) {
        g();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        return "PrimitiveDescriptor(" + d() + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dDV) {
            dDV ddv = (dDV) obj;
            return C8632dsu.c((Object) d(), (Object) ddv.d()) && C8632dsu.c(b(), ddv.b());
        }
        return false;
    }

    public int hashCode() {
        return d().hashCode() + (b().hashCode() * 31);
    }

    private final Void g() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }
}
