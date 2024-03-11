package o;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AbstractC7716dCs;
import o.InterfaceC7707dCj;

/* loaded from: classes5.dex */
public final class dDK implements InterfaceC7707dCj {
    public static final dDK b = new dDK();
    private static final AbstractC7715dCr a = AbstractC7716dCs.d.c;
    private static final String c = "kotlin.Nothing";

    @Override // o.InterfaceC7707dCj
    public AbstractC7715dCr b() {
        return a;
    }

    @Override // o.InterfaceC7707dCj
    public String d() {
        return c;
    }

    @Override // o.InterfaceC7707dCj
    public int e() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }

    private dDK() {
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

    public int hashCode() {
        return d().hashCode() + (b().hashCode() * 31);
    }

    private final Void g() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }
}
