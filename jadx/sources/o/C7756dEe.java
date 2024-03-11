package o;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

/* renamed from: o.dEe  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7756dEe implements InterfaceC7707dCj, dCL {
    private final InterfaceC7707dCj a;
    private final String c;
    private final Set<String> d;

    @Override // o.InterfaceC7707dCj
    public String a(int i) {
        return this.a.a(i);
    }

    @Override // o.InterfaceC7707dCj
    public boolean a() {
        return this.a.a();
    }

    @Override // o.InterfaceC7707dCj
    public int b(String str) {
        C8632dsu.c((Object) str, "");
        return this.a.b(str);
    }

    @Override // o.InterfaceC7707dCj
    public AbstractC7715dCr b() {
        return this.a.b();
    }

    @Override // o.InterfaceC7707dCj
    public List<Annotation> c() {
        return this.a.c();
    }

    @Override // o.InterfaceC7707dCj
    public InterfaceC7707dCj c(int i) {
        return this.a.c(i);
    }

    @Override // o.InterfaceC7707dCj
    public String d() {
        return this.c;
    }

    @Override // o.InterfaceC7707dCj
    public List<Annotation> d(int i) {
        return this.a.d(i);
    }

    @Override // o.InterfaceC7707dCj
    public int e() {
        return this.a.e();
    }

    @Override // o.InterfaceC7707dCj
    public boolean e(int i) {
        return this.a.e(i);
    }

    public final InterfaceC7707dCj f() {
        return this.a;
    }

    @Override // o.InterfaceC7707dCj
    public boolean i() {
        return true;
    }

    @Override // o.dCL
    public Set<String> j() {
        return this.d;
    }

    public C7756dEe(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        this.a = interfaceC7707dCj;
        this.c = interfaceC7707dCj.d() + '?';
        this.d = dDR.a(interfaceC7707dCj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7756dEe) && C8632dsu.c(this.a, ((C7756dEe) obj).a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }

    public int hashCode() {
        return this.a.hashCode() * 31;
    }
}
