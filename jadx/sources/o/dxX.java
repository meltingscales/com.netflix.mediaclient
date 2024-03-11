package o;

import o.dqZ;

/* loaded from: classes5.dex */
public interface dxX<S> extends dqZ.b {
    void b(dqZ dqz, S s);

    S d(dqZ dqz);

    /* loaded from: classes6.dex */
    public static final class b {
        public static <S> dqZ c(dxX<S> dxx, dqZ dqz) {
            return dqZ.b.e.d(dxx, dqz);
        }

        public static <S, R> R d(dxX<S> dxx, R r, drX<? super R, ? super dqZ.b, ? extends R> drx) {
            return (R) dqZ.b.e.d(dxx, r, drx);
        }
    }
}
