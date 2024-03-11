package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import o.drM;

/* loaded from: classes.dex */
public final class ScrollableStateKt {
    public static final ScrollableState ScrollableState(drM<? super Float, Float> drm) {
        return new DefaultScrollableState(drm);
    }

    public static final ScrollableState rememberScrollableState(drM<? super Float, Float> drm, Composer composer, int i) {
        composer.startReplaceableGroup(-180460798);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-180460798, i, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:143)");
        }
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(drm, composer, i & 14);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = ScrollableState(new drM<Float, Float>() { // from class: androidx.compose.foundation.gestures.ScrollableStateKt$rememberScrollableState$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final Float invoke(float f) {
                    return rememberUpdatedState.getValue().invoke(Float.valueOf(f));
                }

                @Override // o.drM
                public /* synthetic */ Float invoke(Float f) {
                    return invoke(f.floatValue());
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ScrollableState scrollableState = (ScrollableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scrollableState;
    }
}
