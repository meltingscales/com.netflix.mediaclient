package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.ui.semantics.CollectionInfo;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;

/* loaded from: classes.dex */
public final class LazyLayoutSemanticStateKt {
    public static final LazyLayoutSemanticState LazyLayoutSemanticState(final LazyListState lazyListState, final boolean z) {
        return new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getFirstVisibleItemScrollOffset() {
                return LazyListState.this.getFirstVisibleItemScrollOffset();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getFirstVisibleItemIndex() {
                return LazyListState.this.getFirstVisibleItemIndex();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public boolean getCanScrollForward() {
                return LazyListState.this.getCanScrollForward();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public Object animateScrollBy(float f, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                Object e;
                Object animateScrollBy$default = ScrollExtensionsKt.animateScrollBy$default(LazyListState.this, f, null, interfaceC8585dra, 2, null);
                e = C8586drb.e();
                return animateScrollBy$default == e ? animateScrollBy$default : dpR.c;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public Object scrollToItem(int i, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                Object e;
                Object scrollToItem$default = LazyListState.scrollToItem$default(LazyListState.this, i, 0, interfaceC8585dra, 2, null);
                e = C8586drb.e();
                return scrollToItem$default == e ? scrollToItem$default : dpR.c;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public CollectionInfo collectionInfo() {
                if (z) {
                    return new CollectionInfo(-1, 1);
                }
                return new CollectionInfo(1, -1);
            }
        };
    }
}
