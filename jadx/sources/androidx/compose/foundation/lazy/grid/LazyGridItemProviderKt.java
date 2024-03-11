package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.PropertyReference0Impl;
import o.dpR;
import o.drM;
import o.drO;
import o.dtD;

/* loaded from: classes.dex */
public final class LazyGridItemProviderKt {
    public static final drO<LazyGridItemProvider> rememberLazyGridItemProviderLambda(final LazyGridState lazyGridState, drM<? super LazyGridScope, dpR> drm, Composer composer, int i) {
        composer.startReplaceableGroup(-1898306282);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1898306282, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)");
        }
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(drm, composer, (i >> 3) & 14);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(lazyGridState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            final State derivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new drO<LazyGridIntervalContent>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$intervalContentState$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // o.drO
                public final LazyGridIntervalContent invoke() {
                    return new LazyGridIntervalContent(rememberUpdatedState.getValue());
                }
            });
            final State derivedStateOf2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new drO<LazyGridItemProviderImpl>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$itemProviderState$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // o.drO
                public final LazyGridItemProviderImpl invoke() {
                    LazyGridIntervalContent value = derivedStateOf.getValue();
                    return new LazyGridItemProviderImpl(lazyGridState, value, new NearestRangeKeyIndexMap(lazyGridState.getNearestRange$foundation_release(), value));
                }
            });
            rememberedValue = new PropertyReference0Impl(derivedStateOf2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, o.dtD
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        dtD dtd = (dtD) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dtd;
    }
}
