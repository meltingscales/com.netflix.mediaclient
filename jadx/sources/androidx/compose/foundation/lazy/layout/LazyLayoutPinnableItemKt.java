package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class LazyLayoutPinnableItemKt {
    public static final void LazyLayoutPinnableItem(final Object obj, final int i, final LazyLayoutPinnedItemList lazyLayoutPinnedItemList, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-2079116560);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079116560, i2, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)");
        }
        startRestartGroup.startReplaceableGroup(511388516);
        boolean changed = startRestartGroup.changed(obj);
        boolean changed2 = startRestartGroup.changed(lazyLayoutPinnedItemList);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if ((changed | changed2) || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyLayoutPinnableItem(obj, lazyLayoutPinnedItemList);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        final LazyLayoutPinnableItem lazyLayoutPinnableItem = (LazyLayoutPinnableItem) rememberedValue;
        lazyLayoutPinnableItem.setIndex(i);
        lazyLayoutPinnableItem.setParentPinnableContainer((PinnableContainer) startRestartGroup.consume(PinnableContainerKt.getLocalPinnableContainer()));
        startRestartGroup.startReplaceableGroup(1161125085);
        boolean changed3 = startRestartGroup.changed(lazyLayoutPinnableItem);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed3 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final LazyLayoutPinnableItem lazyLayoutPinnableItem2 = LazyLayoutPinnableItem.this;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            LazyLayoutPinnableItem.this.onDisposed();
                        }
                    };
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.DisposableEffect(lazyLayoutPinnableItem, (drM) rememberedValue2, startRestartGroup, 0);
        CompositionLocalKt.CompositionLocalProvider(PinnableContainerKt.getLocalPinnableContainer().provides(lazyLayoutPinnableItem), drx, startRestartGroup, ProvidedValue.$stable | ((i2 >> 6) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i3) {
                    LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj, i, lazyLayoutPinnedItemList, drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }
}
