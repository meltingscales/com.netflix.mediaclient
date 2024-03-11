package androidx.compose.ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;
import o.InterfaceC8585dra;
import o.drM;

/* loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt {
    public static final <R> Object withInfiniteAnimationFrameNanos(drM<? super Long, ? extends R> drm, InterfaceC8585dra<? super R> interfaceC8585dra) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) interfaceC8585dra.getContext().get(InfiniteAnimationPolicy.Key);
        if (infiniteAnimationPolicy == null) {
            return MonotonicFrameClockKt.withFrameNanos(drm, interfaceC8585dra);
        }
        return infiniteAnimationPolicy.onInfiniteOperation(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(drm, null), interfaceC8585dra);
    }
}
