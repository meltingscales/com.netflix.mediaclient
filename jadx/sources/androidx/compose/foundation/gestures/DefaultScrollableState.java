package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwY;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DefaultScrollableState implements ScrollableState {
    private final MutableState<Boolean> isScrollingState;
    private final drM<Float, Float> onDelta;
    private final ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float f) {
            if (Float.isNaN(f)) {
                return 0.0f;
            }
            return DefaultScrollableState.this.getOnDelta().invoke(Float.valueOf(f)).floatValue();
        }
    };
    private final MutatorMutex scrollMutex = new MutatorMutex();

    public final drM<Float, Float> getOnDelta() {
        return this.onDelta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultScrollableState(drM<? super Float, Float> drm) {
        MutableState<Boolean> mutableStateOf$default;
        this.onDelta = drm;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isScrollingState = mutableStateOf$default;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, drX<? super ScrollScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object b = dwY.b(new DefaultScrollableState$scroll$2(this, mutatePriority, drx, null), interfaceC8585dra);
        e = C8586drb.e();
        return b == e ? b : dpR.c;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.onDelta.invoke(Float.valueOf(f)).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.isScrollingState.getValue().booleanValue();
    }
}
