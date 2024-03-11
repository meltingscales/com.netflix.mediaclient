package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import java.util.Map;
import o.C8569dql;
import o.dqE;
import o.drO;

/* loaded from: classes.dex */
public final class LazyListStateKt {
    private static final float DeltaThresholdForScrollAnimation = Dp.m2492constructorimpl(1);
    private static final LazyListMeasureResult EmptyLazyListMeasureResult;

    public static final LazyListState rememberLazyListState(final int i, final int i2, Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(1470655220);
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1470655220, i3, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:77)");
        }
        Object[] objArr = new Object[0];
        Saver<LazyListState, ?> saver = LazyListState.Companion.getSaver();
        composer.startReplaceableGroup(2079514038);
        boolean changed = composer.changed(i);
        boolean changed2 = composer.changed(i2);
        Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new drO<LazyListState>() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$rememberLazyListState$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // o.drO
                public final LazyListState invoke() {
                    return new LazyListState(i, i2);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyListState lazyListState = (LazyListState) RememberSaveableKt.rememberSaveable(objArr, saver, null, (drO) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyListState;
    }

    static {
        List i;
        MeasureResult measureResult = new MeasureResult() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$EmptyLazyListMeasureResult$1
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            private final int width;

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                Map<AlignmentLine, Integer> d;
                d = dqE.d();
                this.alignmentLines = d;
            }
        };
        i = C8569dql.i();
        EmptyLazyListMeasureResult = new LazyListMeasureResult(null, 0, false, 0.0f, measureResult, 0.0f, false, i, 0, 0, 0, false, Orientation.Vertical, 0, 0);
    }
}
