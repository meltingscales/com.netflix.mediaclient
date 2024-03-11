package androidx.compose.runtime;

import o.InterfaceC8585dra;
import o.dqZ;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public interface MonotonicFrameClock extends dqZ.b {
    public static final Key Key = Key.$$INSTANCE;

    @Override // o.dqZ.b
    default dqZ.d<?> getKey() {
        return Key;
    }

    <R> Object withFrameNanos(drM<? super Long, ? extends R> drm, InterfaceC8585dra<? super R> interfaceC8585dra);

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static <R> R fold(MonotonicFrameClock monotonicFrameClock, R r, drX<? super R, ? super dqZ.b, ? extends R> drx) {
            return (R) dqZ.b.e.d(monotonicFrameClock, r, drx);
        }

        public static <E extends dqZ.b> E get(MonotonicFrameClock monotonicFrameClock, dqZ.d<E> dVar) {
            return (E) dqZ.b.e.b(monotonicFrameClock, dVar);
        }

        public static dqZ minusKey(MonotonicFrameClock monotonicFrameClock, dqZ.d<?> dVar) {
            return dqZ.b.e.a(monotonicFrameClock, dVar);
        }

        public static dqZ plus(MonotonicFrameClock monotonicFrameClock, dqZ dqz) {
            return dqZ.b.e.d(monotonicFrameClock, dqz);
        }
    }

    /* loaded from: classes.dex */
    public static final class Key implements dqZ.d<MonotonicFrameClock> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }
}
