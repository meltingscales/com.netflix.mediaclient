package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.semantics.CollectionInfo;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;

/* loaded from: classes.dex */
public final class LazySemanticsKt {
    public static final LazyLayoutSemanticState rememberLazyGridSemanticState(final LazyGridState lazyGridState, boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(-1247008005);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1247008005, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:31)");
        }
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(lazyGridState);
        boolean changed2 = composer.changed(Boolean.valueOf(z));
        Object rememberedValue = composer.rememberedValue();
        if ((changed2 | changed) || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.grid.LazySemanticsKt$rememberLazyGridSemanticState$1$1
                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int getFirstVisibleItemScrollOffset() {
                    return LazyGridState.this.getFirstVisibleItemScrollOffset();
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int getFirstVisibleItemIndex() {
                    return LazyGridState.this.getFirstVisibleItemIndex();
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public boolean getCanScrollForward() {
                    return LazyGridState.this.getCanScrollForward();
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public Object animateScrollBy(float f, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    Object e;
                    Object animateScrollBy$default = ScrollExtensionsKt.animateScrollBy$default(LazyGridState.this, f, null, interfaceC8585dra, 2, null);
                    e = C8586drb.e();
                    return animateScrollBy$default == e ? animateScrollBy$default : dpR.c;
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public Object scrollToItem(int i2, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    Object e;
                    Object scrollToItem$default = LazyGridState.scrollToItem$default(LazyGridState.this, i2, 0, interfaceC8585dra, 2, null);
                    e = C8586drb.e();
                    return scrollToItem$default == e ? scrollToItem$default : dpR.c;
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public CollectionInfo collectionInfo() {
                    return new CollectionInfo(-1, -1);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazySemanticsKt$rememberLazyGridSemanticState$1$1 lazySemanticsKt$rememberLazyGridSemanticState$1$1 = (LazySemanticsKt$rememberLazyGridSemanticState$1$1) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazySemanticsKt$rememberLazyGridSemanticState$1$1;
    }
}
