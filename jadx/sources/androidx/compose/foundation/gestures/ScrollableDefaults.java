package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.AndroidOverscroll_androidKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class ScrollableDefaults {
    public static final ScrollableDefaults INSTANCE = new ScrollableDefaults();

    private ScrollableDefaults() {
    }

    public final FlingBehavior flingBehavior(Composer composer, int i) {
        composer.startReplaceableGroup(1107739818);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1107739818, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:538)");
        }
        DecayAnimationSpec rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(rememberSplineBasedDecay);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultFlingBehavior(rememberSplineBasedDecay, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultFlingBehavior defaultFlingBehavior = (DefaultFlingBehavior) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultFlingBehavior;
    }

    public final OverscrollEffect overscrollEffect(Composer composer, int i) {
        composer.startReplaceableGroup(1809802212);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1809802212, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:551)");
        }
        OverscrollEffect rememberOverscrollEffect = AndroidOverscroll_androidKt.rememberOverscrollEffect(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberOverscrollEffect;
    }

    public final boolean reverseDirection(LayoutDirection layoutDirection, Orientation orientation, boolean z) {
        return (layoutDirection != LayoutDirection.Rtl || orientation == Orientation.Vertical) ? !z : z;
    }

    public final BringIntoViewSpec bringIntoViewSpec() {
        return BringIntoViewSpec.Companion.getDefaultBringIntoViewSpec$foundation_release();
    }
}
