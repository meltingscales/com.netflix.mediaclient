package androidx.compose.runtime;

import o.InterfaceC8585dra;
import o.dqZ;
import o.drM;

/* loaded from: classes.dex */
public final class MonotonicFrameClockKt {
    public static final <R> Object withFrameNanos(drM<? super Long, ? extends R> drm, InterfaceC8585dra<? super R> interfaceC8585dra) {
        return getMonotonicFrameClock(interfaceC8585dra.getContext()).withFrameNanos(drm, interfaceC8585dra);
    }

    public static final <R> Object withFrameMillis(final drM<? super Long, ? extends R> drm, InterfaceC8585dra<? super R> interfaceC8585dra) {
        return getMonotonicFrameClock(interfaceC8585dra.getContext()).withFrameNanos(new drM<Long, R>() { // from class: androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final R invoke(long j) {
                return drm.invoke(Long.valueOf(j / 1000000));
            }

            @Override // o.drM
            public /* synthetic */ Object invoke(Long l) {
                return invoke(l.longValue());
            }
        }, interfaceC8585dra);
    }

    public static final MonotonicFrameClock getMonotonicFrameClock(dqZ dqz) {
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) dqz.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }
}
