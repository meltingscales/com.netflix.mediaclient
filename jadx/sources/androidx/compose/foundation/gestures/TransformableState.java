package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public interface TransformableState {
    boolean isTransformInProgress();

    Object transform(MutatePriority mutatePriority, drX<? super TransformScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra);
}
