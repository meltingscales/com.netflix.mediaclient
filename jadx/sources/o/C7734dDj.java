package o;

import java.util.HashSet;
import java.util.Set;

/* renamed from: o.dDj  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7734dDj<E> extends dCV<E, Set<? extends E>, HashSet<E>> {
    private final InterfaceC7707dCj d;

    protected Set<E> e(HashSet<E> hashSet) {
        C8632dsu.c((Object) hashSet, "");
        return hashSet;
    }

    @Override // o.dCU, o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: e */
    public void b(HashSet<E> hashSet, int i) {
        C8632dsu.c((Object) hashSet, "");
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ int a(Object obj) {
        return b((HashSet) ((HashSet) obj));
    }

    @Override // o.AbstractC7718dCu
    public /* bridge */ /* synthetic */ Object b(Object obj) {
        return b((Set) ((Set) obj));
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ Object c(Object obj) {
        return e((HashSet) ((HashSet) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.dCU
    public /* bridge */ /* synthetic */ void c(Object obj, int i, Object obj2) {
        c((HashSet<int>) obj, i, (int) obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7734dDj(dBT<E> dbt) {
        super(dbt);
        C8632dsu.c((Object) dbt, "");
        this.d = new C7735dDk(dbt.e());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: c */
    public HashSet<E> d() {
        return new HashSet<>();
    }

    protected int b(HashSet<E> hashSet) {
        C8632dsu.c((Object) hashSet, "");
        return hashSet.size();
    }

    protected HashSet<E> b(Set<? extends E> set) {
        C8632dsu.c((Object) set, "");
        HashSet<E> hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet<>(set) : hashSet;
    }

    protected void c(HashSet<E> hashSet, int i, E e) {
        C8632dsu.c((Object) hashSet, "");
        hashSet.add(e);
    }
}
