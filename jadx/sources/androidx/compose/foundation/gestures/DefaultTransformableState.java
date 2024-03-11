package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drX;
import o.dwY;

/* loaded from: classes.dex */
final class DefaultTransformableState implements TransformableState {
    private final MutableState<Boolean> isTransformingState;
    private final InterfaceC8612dsa<Float, Offset, Float, dpR> onTransformation;
    private final TransformScope transformScope = new TransformScope() { // from class: androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1
        @Override // androidx.compose.foundation.gestures.TransformScope
        /* renamed from: transformBy-d-4ec7I  reason: not valid java name */
        public void mo161transformByd4ec7I(float f, long j, float f2) {
            DefaultTransformableState.this.getOnTransformation().invoke(Float.valueOf(f), Offset.m1126boximpl(j), Float.valueOf(f2));
        }
    };
    private final MutatorMutex transformMutex = new MutatorMutex();

    public final InterfaceC8612dsa<Float, Offset, Float, dpR> getOnTransformation() {
        return this.onTransformation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultTransformableState(InterfaceC8612dsa<? super Float, ? super Offset, ? super Float, dpR> interfaceC8612dsa) {
        MutableState<Boolean> mutableStateOf$default;
        this.onTransformation = interfaceC8612dsa;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isTransformingState = mutableStateOf$default;
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public Object transform(MutatePriority mutatePriority, drX<? super TransformScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object b = dwY.b(new DefaultTransformableState$transform$2(this, mutatePriority, drx, null), interfaceC8585dra);
        e = C8586drb.e();
        return b == e ? b : dpR.c;
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public boolean isTransformInProgress() {
        return this.isTransformingState.getValue().booleanValue();
    }
}
