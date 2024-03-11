package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwY;

/* loaded from: classes.dex */
final class SliderDraggableState implements DraggableState {
    private final DragScope dragScope;
    private final MutableState isDragging$delegate;
    private final drM<Float, dpR> onDelta;
    private final MutatorMutex scrollMutex;

    public final drM<Float, dpR> getOnDelta() {
        return this.onDelta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SliderDraggableState(drM<? super Float, dpR> drm) {
        MutableState mutableStateOf$default;
        this.onDelta = drm;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isDragging$delegate = mutableStateOf$default;
        this.dragScope = new DragScope() { // from class: androidx.compose.material.SliderDraggableState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f) {
                SliderDraggableState.this.getOnDelta().invoke(Float.valueOf(f));
            }
        };
        this.scrollMutex = new MutatorMutex();
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, drX<? super DragScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object b = dwY.b(new SliderDraggableState$drag$2(this, mutatePriority, drx, null), interfaceC8585dra);
        e = C8586drb.e();
        return b == e ? b : dpR.c;
    }

    public final boolean isDragging() {
        return ((Boolean) this.isDragging$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragging(boolean z) {
        this.isDragging$delegate.setValue(Boolean.valueOf(z));
    }
}
