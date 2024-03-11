package o;

import o.dqZ;

/* loaded from: classes.dex */
public abstract class dqT implements dqZ.b {
    private final dqZ.d<?> key;

    @Override // o.dqZ.b
    public dqZ.d<?> getKey() {
        return this.key;
    }

    public dqT(dqZ.d<?> dVar) {
        C8632dsu.c((Object) dVar, "");
        this.key = dVar;
    }

    @Override // o.dqZ
    public <R> R fold(R r, drX<? super R, ? super dqZ.b, ? extends R> drx) {
        return (R) dqZ.b.e.d(this, r, drx);
    }

    @Override // o.dqZ.b, o.dqZ
    public <E extends dqZ.b> E get(dqZ.d<E> dVar) {
        return (E) dqZ.b.e.b(this, dVar);
    }

    @Override // o.dqZ
    public dqZ minusKey(dqZ.d<?> dVar) {
        return dqZ.b.e.a(this, dVar);
    }

    @Override // o.dqZ
    public dqZ plus(dqZ dqz) {
        return dqZ.b.e.d(this, dqz);
    }
}
