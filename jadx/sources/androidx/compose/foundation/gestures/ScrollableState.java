package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public interface ScrollableState {
    float dispatchRawDelta(float f);

    default boolean getCanScrollBackward() {
        return true;
    }

    default boolean getCanScrollForward() {
        return true;
    }

    boolean isScrollInProgress();

    Object scroll(MutatePriority mutatePriority, drX<? super ScrollScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    static /* synthetic */ Object scroll$default(ScrollableState scrollableState, MutatePriority mutatePriority, drX drx, InterfaceC8585dra interfaceC8585dra, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return scrollableState.scroll(mutatePriority, drx, interfaceC8585dra);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
    }
}