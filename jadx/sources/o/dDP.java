package o;

import kotlin.Pair;
import o.C7703dCf;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes5.dex */
public final class dDP<K, V> extends AbstractC7742dDr<K, V, Pair<? extends K, ? extends V>> {
    private final InterfaceC7707dCj a;

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC7742dDr
    public /* synthetic */ Object c(Object obj, Object obj2) {
        return e((dDP<K, V>) obj, obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dDP(final dBT<K> dbt, final dBT<V> dbt2) {
        super(dbt, dbt2, null);
        C8632dsu.c((Object) dbt, "");
        C8632dsu.c((Object) dbt2, "");
        this.a = C7713dCp.e("kotlin.Pair", new InterfaceC7707dCj[0], new drM<C7703dCf, dpR>() { // from class: kotlinx.serialization.internal.PairSerializer$descriptor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7703dCf c7703dCf) {
                a(c7703dCf);
                return dpR.c;
            }

            public final void a(C7703dCf c7703dCf) {
                C8632dsu.c((Object) c7703dCf, "");
                C7703dCf.e(c7703dCf, "first", dbt.e(), null, false, 12, null);
                C7703dCf.e(c7703dCf, "second", dbt2.e(), null, false, 12, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7742dDr
    /* renamed from: c */
    public K b(Pair<? extends K, ? extends V> pair) {
        C8632dsu.c((Object) pair, "");
        return pair.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7742dDr
    /* renamed from: a */
    public V e(Pair<? extends K, ? extends V> pair) {
        C8632dsu.c((Object) pair, "");
        return pair.a();
    }

    protected Pair<K, V> e(K k, V v) {
        return dpD.a(k, v);
    }
}
