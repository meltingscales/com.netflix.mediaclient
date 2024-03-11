package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* loaded from: classes.dex */
public final class LazyListSemanticsKt {
    public static final LazyLayoutSemanticState rememberLazyListSemanticState(LazyListState lazyListState, boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(596174919);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(596174919, i, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
        }
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(lazyListState);
        boolean changed2 = composer.changed(Boolean.valueOf(z));
        Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = LazyLayoutSemanticStateKt.LazyLayoutSemanticState(lazyListState, z);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyLayoutSemanticState lazyLayoutSemanticState = (LazyLayoutSemanticState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyLayoutSemanticState;
    }
}
