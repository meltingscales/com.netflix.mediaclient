package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.dCy  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7722dCy<E> extends dCV<E, List<? extends E>, ArrayList<E>> {
    private final InterfaceC7707dCj c;

    protected List<E> b(ArrayList<E> arrayList) {
        C8632dsu.c((Object) arrayList, "");
        return arrayList;
    }

    @Override // o.dCU, o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return this.c;
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ int a(Object obj) {
        return d((ArrayList) ((ArrayList) obj));
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ Object b(Object obj) {
        return a((List) ((List) obj));
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ Object c(Object obj) {
        return b((ArrayList) ((ArrayList) obj));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7722dCy(dBT<E> dbt) {
        super(dbt);
        C8632dsu.c((Object) dbt, "");
        this.c = new dCA(dbt.e());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: b */
    public ArrayList<E> d() {
        return new ArrayList<>();
    }

    protected int d(ArrayList<E> arrayList) {
        C8632dsu.c((Object) arrayList, "");
        return arrayList.size();
    }

    protected ArrayList<E> a(List<? extends E> list) {
        C8632dsu.c((Object) list, "");
        ArrayList<E> arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList<>(list) : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: d */
    public void b(ArrayList<E> arrayList, int i) {
        C8632dsu.c((Object) arrayList, "");
        arrayList.ensureCapacity(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dCU
    /* renamed from: e */
    public void c(ArrayList<E> arrayList, int i, E e) {
        C8632dsu.c((Object) arrayList, "");
        arrayList.add(i, e);
    }
}
