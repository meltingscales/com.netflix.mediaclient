package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierLocalKt {
    public static final Modifier lazyLayoutBeyondBoundsModifier(Modifier modifier, LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z, LayoutDirection layoutDirection, Orientation orientation, boolean z2, Composer composer, int i) {
        composer.startReplaceableGroup(1331498025);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1331498025, i, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutBeyondBoundsModifier (LazyLayoutBeyondBoundsModifierLocal.kt:51)");
        }
        if (z2) {
            Object[] objArr = {lazyLayoutBeyondBoundsState, lazyLayoutBeyondBoundsInfo, Boolean.valueOf(z), layoutDirection, orientation};
            composer.startReplaceableGroup(-568225417);
            boolean z3 = false;
            for (int i2 = 0; i2 < 5; i2++) {
                z3 |= composer.changed(objArr[i2]);
            }
            Object rememberedValue = composer.rememberedValue();
            if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LazyLayoutBeyondBoundsModifierLocal(lazyLayoutBeyondBoundsState, lazyLayoutBeyondBoundsInfo, z, layoutDirection, orientation);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            modifier = modifier.then((Modifier) rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void unsupportedDirection() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
    }
}
