package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import o.InterfaceC8585dra;
import o.dpR;

/* loaded from: classes.dex */
public interface BringIntoViewRequester {
    Object bringIntoView(Rect rect, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    static /* synthetic */ Object bringIntoView$default(BringIntoViewRequester bringIntoViewRequester, Rect rect, InterfaceC8585dra interfaceC8585dra, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                rect = null;
            }
            return bringIntoViewRequester.bringIntoView(rect, interfaceC8585dra);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
    }
}
