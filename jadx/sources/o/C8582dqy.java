package o;

import java.util.Iterator;

/* renamed from: o.dqy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8582dqy<T> implements Iterable<C8578dqu<? extends T>>, dsK {
    private final drO<Iterator<T>> e;

    /* JADX WARN: Multi-variable type inference failed */
    public C8582dqy(drO<? extends Iterator<? extends T>> dro) {
        C8632dsu.c((Object) dro, "");
        this.e = dro;
    }

    @Override // java.lang.Iterable
    public Iterator<C8578dqu<T>> iterator() {
        return new dqA(this.e.invoke());
    }
}
