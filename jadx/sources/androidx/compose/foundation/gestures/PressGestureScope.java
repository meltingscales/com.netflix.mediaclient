package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Density;
import o.InterfaceC8585dra;
import o.dpR;

/* loaded from: classes.dex */
public interface PressGestureScope extends Density {
    Object awaitRelease(InterfaceC8585dra<? super dpR> interfaceC8585dra);

    Object tryAwaitRelease(InterfaceC8585dra<? super Boolean> interfaceC8585dra);
}
