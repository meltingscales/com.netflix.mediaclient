package o;

import o.dqZ;

/* loaded from: classes5.dex */
public final class dzQ implements dqZ {
    public final Throwable a;
    private final /* synthetic */ dqZ d;

    @Override // o.dqZ
    public <R> R fold(R r, drX<? super R, ? super dqZ.b, ? extends R> drx) {
        return (R) this.d.fold(r, drx);
    }

    @Override // o.dqZ
    public <E extends dqZ.b> E get(dqZ.d<E> dVar) {
        return (E) this.d.get(dVar);
    }

    @Override // o.dqZ
    public dqZ minusKey(dqZ.d<?> dVar) {
        return this.d.minusKey(dVar);
    }

    @Override // o.dqZ
    public dqZ plus(dqZ dqz) {
        return this.d.plus(dqz);
    }

    public dzQ(Throwable th, dqZ dqz) {
        this.a = th;
        this.d = dqz;
    }
}
