package androidx.compose.foundation.lazy;

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
public final class LazyListItemProviderKt {
    public static final drO<LazyListItemProvider> rememberLazyListItemProviderLambda(final LazyListState lazyListState, drM<? super LazyListScope, dpR> drm, Composer composer, int i) {
        composer.startReplaceableGroup(-343736148);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-343736148, i, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:43)");
        }
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(drm, composer, (i >> 3) & 14);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(lazyListState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            final LazyItemScopeImpl lazyItemScopeImpl = new LazyItemScopeImpl();
            final State derivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new drO<LazyListIntervalContent>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // o.drO
                public final LazyListIntervalContent invoke() {
                    return new LazyListIntervalContent(rememberUpdatedState.getValue());
                }
            });
            final State derivedStateOf2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new drO<LazyListItemProviderImpl>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // o.drO
                public final LazyListItemProviderImpl invoke() {
                    LazyListIntervalContent value = derivedStateOf.getValue();
                    return new LazyListItemProviderImpl(lazyListState, value, lazyItemScopeImpl, new NearestRangeKeyIndexMap(lazyListState.getNearestRange$foundation_release(), value));
                }
            });
            rememberedValue = new PropertyReference0Impl(derivedStateOf2) { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1
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
