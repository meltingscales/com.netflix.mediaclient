package kotlin.coroutines;

import java.io.Serializable;
import o.C8632dsu;
import o.dqZ;
import o.drX;

/* loaded from: classes5.dex */
public final class EmptyCoroutineContext implements dqZ, Serializable {
    public static final EmptyCoroutineContext e = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private final Object readResolve() {
        return e;
    }

    @Override // o.dqZ
    public <R> R fold(R r, drX<? super R, ? super dqZ.b, ? extends R> drx) {
        C8632dsu.c((Object) drx, "");
        return r;
    }

    @Override // o.dqZ
    public <E extends dqZ.b> E get(dqZ.d<E> dVar) {
        C8632dsu.c((Object) dVar, "");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // o.dqZ
    public dqZ minusKey(dqZ.d<?> dVar) {
        C8632dsu.c((Object) dVar, "");
        return this;
    }

    @Override // o.dqZ
    public dqZ plus(dqZ dqz) {
        C8632dsu.c((Object) dqz, "");
        return dqz;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    private EmptyCoroutineContext() {
    }
}
