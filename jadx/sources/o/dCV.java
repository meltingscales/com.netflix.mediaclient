package o;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class dCV<E, C extends Collection<? extends E>, B> extends dCU<E, C, B> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC7718dCu
    public /* bridge */ /* synthetic */ int d(Object obj) {
        return d((dCV<E, C, B>) ((Collection) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC7718dCu
    public /* synthetic */ Iterator e(Object obj) {
        return a((dCV<E, C, B>) ((Collection) obj));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dCV(dBT<E> dbt) {
        super(dbt, null);
        C8632dsu.c((Object) dbt, "");
    }

    protected int d(C c) {
        C8632dsu.c((Object) c, "");
        return c.size();
    }

    protected Iterator<E> a(C c) {
        C8632dsu.c((Object) c, "");
        return c.iterator();
    }
}
