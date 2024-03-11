package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import o.InterfaceC8612dsa;
import o.dpR;

/* loaded from: classes.dex */
public final class TransformableStateKt {
    public static final TransformableState TransformableState(InterfaceC8612dsa<? super Float, ? super Offset, ? super Float, dpR> interfaceC8612dsa) {
        return new DefaultTransformableState(interfaceC8612dsa);
    }

    public static final TransformableState rememberTransformableState(InterfaceC8612dsa<? super Float, ? super Offset, ? super Float, dpR> interfaceC8612dsa, Composer composer, int i) {
        composer.startReplaceableGroup(1681419281);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1681419281, i, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:116)");
        }
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC8612dsa, composer, i & 14);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = TransformableState(new InterfaceC8612dsa<Float, Offset, Float, dpR>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$rememberTransformableState$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // o.InterfaceC8612dsa
                public /* synthetic */ dpR invoke(Float f, Offset offset, Float f2) {
                    m221invoked4ec7I(f.floatValue(), offset.m1146unboximpl(), f2.floatValue());
                    return dpR.c;
                }

                /* renamed from: invoke-d-4ec7I  reason: not valid java name */
                public final void m221invoked4ec7I(float f, long j, float f2) {
                    rememberUpdatedState.getValue().invoke(Float.valueOf(f), Offset.m1126boximpl(j), Float.valueOf(f2));
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TransformableState transformableState = (TransformableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transformableState;
    }
}
