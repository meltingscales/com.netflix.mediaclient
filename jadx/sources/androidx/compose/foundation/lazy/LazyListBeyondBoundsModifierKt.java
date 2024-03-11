package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* loaded from: classes.dex */
public final class LazyListBeyondBoundsModifierKt {
    public static final LazyLayoutBeyondBoundsState rememberLazyListBeyondBoundsState(LazyListState lazyListState, int i, Composer composer, int i2) {
        composer.startReplaceableGroup(-1877443446);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877443446, i2, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:26)");
        }
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(lazyListState);
        boolean changed2 = composer.changed(Integer.valueOf(i));
        Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyListBeyondBoundsState(lazyListState, i);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyListBeyondBoundsState lazyListBeyondBoundsState = (LazyListBeyondBoundsState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyListBeyondBoundsState;
    }
}
