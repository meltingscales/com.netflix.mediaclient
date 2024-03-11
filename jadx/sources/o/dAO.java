package o;

import o.dAS;
import o.dqZ;
import o.dxX;

/* loaded from: classes5.dex */
public final class dAO {
    public static final dAH b = new dAH("NO_THREAD_ELEMENTS");
    private static final drX<Object, dqZ.b, Object> e = new drX<Object, dqZ.b, Object>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$countAll$1
        @Override // o.drX
        /* renamed from: b */
        public final Object invoke(Object obj, dqZ.b bVar) {
            if (bVar instanceof dxX) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    };
    private static final drX<dxX<?>, dqZ.b, dxX<?>> d = new drX<dxX<?>, dqZ.b, dxX<?>>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$findOne$1
        @Override // o.drX
        /* renamed from: b */
        public final dxX<?> invoke(dxX<?> dxx, dqZ.b bVar) {
            if (dxx != null) {
                return dxx;
            }
            if (bVar instanceof dxX) {
                return (dxX) bVar;
            }
            return null;
        }
    };
    private static final drX<dAS, dqZ.b, dAS> a = new drX<dAS, dqZ.b, dAS>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$updateState$1
        @Override // o.drX
        /* renamed from: c */
        public final dAS invoke(dAS das, dqZ.b bVar) {
            if (bVar instanceof dxX) {
                dxX<?> dxx = (dxX) bVar;
                das.b(dxx, dxx.d(das.e));
            }
            return das;
        }
    };

    public static final Object c(dqZ dqz) {
        Object fold = dqz.fold(0, e);
        C8632dsu.d(fold);
        return fold;
    }

    public static final Object c(dqZ dqz, Object obj) {
        if (obj == null) {
            obj = c(dqz);
        }
        if (obj == 0) {
            return b;
        }
        if (obj instanceof Integer) {
            return dqz.fold(new dAS(dqz, ((Number) obj).intValue()), a);
        }
        C8632dsu.d(obj);
        return ((dxX) obj).d(dqz);
    }

    public static final void b(dqZ dqz, Object obj) {
        if (obj == b) {
            return;
        }
        if (obj instanceof dAS) {
            ((dAS) obj).b(dqz);
            return;
        }
        Object fold = dqz.fold(null, d);
        C8632dsu.d(fold);
        ((dxX) fold).b(dqz, obj);
    }
}
