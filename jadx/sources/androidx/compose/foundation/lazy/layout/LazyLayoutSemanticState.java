package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.semantics.CollectionInfo;
import o.InterfaceC8585dra;
import o.dpR;

/* loaded from: classes.dex */
public interface LazyLayoutSemanticState {
    Object animateScrollBy(float f, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    CollectionInfo collectionInfo();

    boolean getCanScrollForward();

    int getFirstVisibleItemIndex();

    int getFirstVisibleItemScrollOffset();

    Object scrollToItem(int i, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    default float pseudoScrollOffset() {
        return getFirstVisibleItemScrollOffset() + (getFirstVisibleItemIndex() * 500);
    }

    default float pseudoMaxScrollOffset() {
        if (getCanScrollForward()) {
            return pseudoScrollOffset() + 100;
        }
        return pseudoScrollOffset();
    }
}
