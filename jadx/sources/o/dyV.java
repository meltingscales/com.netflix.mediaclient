package o;

import kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1;

/* loaded from: classes5.dex */
public final /* synthetic */ class dyV {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> dyS<T> b(dyS<? extends T> dys, final long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? dys : e(dys, new drM<T, Long>() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: e */
                public final Long invoke(T t) {
                    return Long.valueOf(j);
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    public static final <T> dyS<T> c(dyS<? extends T> dys, long j) {
        return dyR.a(dys, C8749dxc.c(j));
    }

    private static final <T> dyS<T> e(dyS<? extends T> dys, drM<? super T, Long> drm) {
        return dzR.d(new FlowKt__DelayKt$debounceInternal$1(drm, dys, null));
    }
}
