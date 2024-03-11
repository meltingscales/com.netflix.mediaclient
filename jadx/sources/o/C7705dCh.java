package o;

import java.lang.annotation.Annotation;
import java.util.List;

/* renamed from: o.dCh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C7705dCh implements InterfaceC7707dCj {
    private final String a;
    public final InterfaceC8660dtv<?> b;
    private final InterfaceC7707dCj e;

    @Override // o.InterfaceC7707dCj
    public String a(int i) {
        return this.e.a(i);
    }

    @Override // o.InterfaceC7707dCj
    public boolean a() {
        return this.e.a();
    }

    @Override // o.InterfaceC7707dCj
    public int b(String str) {
        C8632dsu.c((Object) str, "");
        return this.e.b(str);
    }

    @Override // o.InterfaceC7707dCj
    public AbstractC7715dCr b() {
        return this.e.b();
    }

    @Override // o.InterfaceC7707dCj
    public List<Annotation> c() {
        return this.e.c();
    }

    @Override // o.InterfaceC7707dCj
    public InterfaceC7707dCj c(int i) {
        return this.e.c(i);
    }

    @Override // o.InterfaceC7707dCj
    public String d() {
        return this.a;
    }

    @Override // o.InterfaceC7707dCj
    public List<Annotation> d(int i) {
        return this.e.d(i);
    }

    @Override // o.InterfaceC7707dCj
    public int e() {
        return this.e.e();
    }

    @Override // o.InterfaceC7707dCj
    public boolean e(int i) {
        return this.e.e(i);
    }

    @Override // o.InterfaceC7707dCj
    public boolean i() {
        return this.e.i();
    }

    public C7705dCh(InterfaceC7707dCj interfaceC7707dCj, InterfaceC8660dtv<?> interfaceC8660dtv) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) interfaceC8660dtv, "");
        this.e = interfaceC7707dCj;
        this.b = interfaceC8660dtv;
        this.a = interfaceC7707dCj.d() + '<' + interfaceC8660dtv.b() + '>';
    }

    public boolean equals(Object obj) {
        C7705dCh c7705dCh = obj instanceof C7705dCh ? (C7705dCh) obj : null;
        return c7705dCh != null && C8632dsu.c(this.e, c7705dCh.e) && C8632dsu.c(c7705dCh.b, this.b);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + d().hashCode();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.e + ')';
    }
}
