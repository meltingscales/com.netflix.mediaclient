package o;

import kotlin.coroutines.EmptyCoroutineContext;
import o.dqZ;

/* loaded from: classes.dex */
public interface dqY extends dqZ.b {
    public static final b d = b.d;

    <T> InterfaceC8585dra<T> interceptContinuation(InterfaceC8585dra<? super T> interfaceC8585dra);

    void releaseInterceptedContinuation(InterfaceC8585dra<?> interfaceC8585dra);

    /* loaded from: classes5.dex */
    public static final class b implements dqZ.d<dqY> {
        static final /* synthetic */ b d = new b();

        private b() {
        }
    }

    /* loaded from: classes5.dex */
    public static final class e {
        public static <E extends dqZ.b> E c(dqY dqy, dqZ.d<E> dVar) {
            C8632dsu.c((Object) dVar, "");
            if (dVar instanceof dqX) {
                dqX dqx = (dqX) dVar;
                if (dqx.e(dqy.getKey())) {
                    E e = (E) dqx.a(dqy);
                    if (e instanceof dqZ.b) {
                        return e;
                    }
                    return null;
                }
                return null;
            } else if (dqY.d == dVar) {
                C8632dsu.d(dqy);
                return dqy;
            } else {
                return null;
            }
        }

        public static dqZ e(dqY dqy, dqZ.d<?> dVar) {
            C8632dsu.c((Object) dVar, "");
            if (!(dVar instanceof dqX)) {
                return dqY.d == dVar ? EmptyCoroutineContext.e : dqy;
            }
            dqX dqx = (dqX) dVar;
            return (!dqx.e(dqy.getKey()) || dqx.a(dqy) == null) ? dqy : EmptyCoroutineContext.e;
        }
    }
}
