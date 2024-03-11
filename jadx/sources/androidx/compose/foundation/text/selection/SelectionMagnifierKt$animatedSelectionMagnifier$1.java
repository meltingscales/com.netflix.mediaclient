package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.Lambda;
import o.InterfaceC8612dsa;
import o.drM;
import o.drO;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SelectionMagnifierKt$animatedSelectionMagnifier$1 extends Lambda implements InterfaceC8612dsa<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ drO<Offset> $magnifierCenter;
    final /* synthetic */ drM<drO<Offset>, Modifier> $platformMagnifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectionMagnifierKt$animatedSelectionMagnifier$1(drO<Offset> dro, drM<? super drO<Offset>, ? extends Modifier> drm) {
        super(3);
        this.$magnifierCenter = dro;
        this.$platformMagnifier = drm;
    }

    @Override // o.InterfaceC8612dsa
    public /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        final State rememberAnimatedMagnifierPosition;
        composer.startReplaceableGroup(759876635);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(759876635, i, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)");
        }
        rememberAnimatedMagnifierPosition = SelectionMagnifierKt.rememberAnimatedMagnifierPosition(this.$magnifierCenter, composer, 0);
        drM<drO<Offset>, Modifier> drm = this.$platformMagnifier;
        composer.startReplaceableGroup(1227294510);
        boolean changed = composer.changed(rememberAnimatedMagnifierPosition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new drO<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ Offset invoke() {
                    return Offset.m1126boximpl(m528invokeF1C5BW0());
                }

                /* renamed from: invoke-F1C5BW0  reason: not valid java name */
                public final long m528invokeF1C5BW0() {
                    long invoke$lambda$0;
                    invoke$lambda$0 = SelectionMagnifierKt$animatedSelectionMagnifier$1.invoke$lambda$0(rememberAnimatedMagnifierPosition);
                    return invoke$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier invoke = drm.invoke((drO) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$0(State<Offset> state) {
        return state.getValue().m1146unboximpl();
    }
}
