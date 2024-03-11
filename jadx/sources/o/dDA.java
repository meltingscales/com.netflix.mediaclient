package o;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class dDA<E> extends dCV<E, Set<? extends E>, LinkedHashSet<E>> {
    private final InterfaceC7707dCj d;

    protected Set<E> d(LinkedHashSet<E> linkedHashSet) {
        C8632dsu.c((Object) linkedHashSet, "");
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: d */
    public void b(LinkedHashSet<E> linkedHashSet, int i) {
        C8632dsu.c((Object) linkedHashSet, "");
    }

    @Override // o.dCU, o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return this.d;
    }

    @Override // o.AbstractC7718dCu
    public /* bridge */ /* synthetic */ int a(Object obj) {
        return a((LinkedHashSet) ((LinkedHashSet) obj));
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ Object b(Object obj) {
        return e((Set) ((Set) obj));
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ Object c(Object obj) {
        return d((LinkedHashSet) ((LinkedHashSet) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.dCU
    public /* bridge */ /* synthetic */ void c(Object obj, int i, Object obj2) {
        c((LinkedHashSet<int>) obj, i, (int) obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dDA(dBT<E> dbt) {
        super(dbt);
        C8632dsu.c((Object) dbt, "");
        this.d = new C7748dDx(dbt.e());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: b */
    public LinkedHashSet<E> d() {
        return new LinkedHashSet<>();
    }

    protected int a(LinkedHashSet<E> linkedHashSet) {
        C8632dsu.c((Object) linkedHashSet, "");
        return linkedHashSet.size();
    }

    protected LinkedHashSet<E> e(Set<? extends E> set) {
        C8632dsu.c((Object) set, "");
        LinkedHashSet<E> linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet<>(set) : linkedHashSet;
    }

    protected void c(LinkedHashSet<E> linkedHashSet, int i, E e) {
        C8632dsu.c((Object) linkedHashSet, "");
        linkedHashSet.add(e);
    }
}
