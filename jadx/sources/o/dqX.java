package o;

import o.dqZ;
import o.dqZ.b;

/* loaded from: classes5.dex */
public abstract class dqX<B extends dqZ.b, E extends B> implements dqZ.d<E> {
    private final drM<dqZ.b, E> d;
    private final dqZ.d<?> e;

    public final boolean e(dqZ.d<?> dVar) {
        C8632dsu.c((Object) dVar, "");
        return dVar == this || this.e == dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [o.drM<? super o.dqZ$b, ? extends E extends B>, o.drM<o.dqZ$b, E extends B>, java.lang.Object] */
    public dqX(dqZ.d<B> dVar, drM<? super dqZ.b, ? extends E> drm) {
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) drm, "");
        this.d = drm;
        this.e = dVar instanceof dqX ? (dqZ.d<B>) ((dqX) dVar).e : dVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lo/dqZ$b;)TE; */
    public final dqZ.b a(dqZ.b bVar) {
        C8632dsu.c((Object) bVar, "");
        return (dqZ.b) this.d.invoke(bVar);
    }
}
