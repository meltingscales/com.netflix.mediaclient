package o;

import java.util.Iterator;
import o.dDX;

/* loaded from: classes5.dex */
public abstract class dDW<Element, Array, Builder extends dDX<Array>> extends dCU<Element, Array, Builder> {
    private final InterfaceC7707dCj d;

    protected abstract Array a();

    protected abstract void d(InterfaceC7719dCv interfaceC7719dCv, Array array, int i);

    @Override // o.dCU, o.dBT, o.dBZ, o.dBP
    public final InterfaceC7707dCj e() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC7718dCu
    public /* synthetic */ int a(Object obj) {
        return b((dDW<Element, Array, Builder>) ((dDX) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC7718dCu
    public /* synthetic */ Object c(Object obj) {
        return d((dDW<Element, Array, Builder>) ((dDX) obj));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dDW(dBT<Element> dbt) {
        super(dbt, null);
        C8632dsu.c((Object) dbt, "");
        this.d = new dDY(dbt.e());
    }

    protected final int b(Builder builder) {
        C8632dsu.c((Object) builder, "");
        return builder.e();
    }

    protected final Array d(Builder builder) {
        C8632dsu.c((Object) builder, "");
        return (Array) builder.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: c */
    public final void b(Builder builder, int i) {
        C8632dsu.c((Object) builder, "");
        builder.d(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    public final Iterator<Element> e(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dCU
    /* renamed from: b */
    public final void c(Builder builder, int i, Element element) {
        C8632dsu.c((Object) builder, "");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: j */
    public final Builder d() {
        return (Builder) b((dDW<Element, Array, Builder>) a());
    }

    @Override // o.dCU, o.dBZ
    public final void e(InterfaceC7721dCx interfaceC7721dCx, Array array) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        int d = d((dDW<Element, Array, Builder>) array);
        InterfaceC7707dCj interfaceC7707dCj = this.d;
        InterfaceC7719dCv b = interfaceC7721dCx.b(interfaceC7707dCj, d);
        d(b, array, d);
        b.d(interfaceC7707dCj);
    }

    @Override // o.AbstractC7718dCu, o.dBP
    public final Array b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        return a(interfaceC7720dCw, null);
    }
}
