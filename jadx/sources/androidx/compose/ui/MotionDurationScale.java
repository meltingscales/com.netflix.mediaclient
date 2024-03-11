package androidx.compose.ui;

import o.dqZ;
import o.drX;

/* loaded from: classes.dex */
public interface MotionDurationScale extends dqZ.b {
    public static final Key Key = Key.$$INSTANCE;

    @Override // o.dqZ.b
    default dqZ.d<?> getKey() {
        return Key;
    }

    float getScaleFactor();

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static <R> R fold(MotionDurationScale motionDurationScale, R r, drX<? super R, ? super dqZ.b, ? extends R> drx) {
            return (R) dqZ.b.e.d(motionDurationScale, r, drx);
        }

        public static <E extends dqZ.b> E get(MotionDurationScale motionDurationScale, dqZ.d<E> dVar) {
            return (E) dqZ.b.e.b(motionDurationScale, dVar);
        }

        public static dqZ minusKey(MotionDurationScale motionDurationScale, dqZ.d<?> dVar) {
            return dqZ.b.e.a(motionDurationScale, dVar);
        }

        public static dqZ plus(MotionDurationScale motionDurationScale, dqZ dqz) {
            return dqZ.b.e.d(motionDurationScale, dqz);
        }
    }

    /* loaded from: classes.dex */
    public static final class Key implements dqZ.d<MotionDurationScale> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }
}
