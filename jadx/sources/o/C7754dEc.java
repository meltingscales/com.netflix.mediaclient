package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.dEc  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7754dEc<ElementKlass, Element extends ElementKlass> extends dCU<Element, Element[], ArrayList<Element>> {
    private final InterfaceC8660dtv<ElementKlass> a;
    private final InterfaceC7707dCj b;

    @Override // o.dCU, o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return this.b;
    }

    @Override // o.AbstractC7718dCu
    public /* bridge */ /* synthetic */ int a(Object obj) {
        return a((ArrayList) ((ArrayList) obj));
    }

    @Override // o.AbstractC7718dCu
    public /* bridge */ /* synthetic */ void b(Object obj, int i) {
        b((ArrayList) ((ArrayList) obj), i);
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ Object c(Object obj) {
        return b((ArrayList) ((ArrayList) obj));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7754dEc(InterfaceC8660dtv<ElementKlass> interfaceC8660dtv, dBT<Element> dbt) {
        super(dbt, null);
        C8632dsu.c((Object) interfaceC8660dtv, "");
        C8632dsu.c((Object) dbt, "");
        this.a = interfaceC8660dtv;
        this.b = new C7723dCz(dbt.e());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: c */
    public int d(Element[] elementArr) {
        C8632dsu.c((Object) elementArr, "");
        return elementArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: b */
    public Iterator<Element> e(Element[] elementArr) {
        C8632dsu.c((Object) elementArr, "");
        return C8621dsj.b(elementArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: c */
    public ArrayList<Element> d() {
        return new ArrayList<>();
    }

    protected int a(ArrayList<Element> arrayList) {
        C8632dsu.c((Object) arrayList, "");
        return arrayList.size();
    }

    protected Element[] b(ArrayList<Element> arrayList) {
        C8632dsu.c((Object) arrayList, "");
        return (Element[]) dDT.a(arrayList, this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: a */
    public ArrayList<Element> b(Element[] elementArr) {
        List p;
        C8632dsu.c((Object) elementArr, "");
        p = C8564dqg.p(elementArr);
        return new ArrayList<>(p);
    }

    protected void b(ArrayList<Element> arrayList, int i) {
        C8632dsu.c((Object) arrayList, "");
        arrayList.ensureCapacity(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dCU
    /* renamed from: a */
    public void c(ArrayList<Element> arrayList, int i, Element element) {
        C8632dsu.c((Object) arrayList, "");
        arrayList.add(i, element);
    }
}
