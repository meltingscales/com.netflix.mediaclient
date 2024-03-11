package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public final class LazyLayoutPrefetcher_androidKt {
    public static final void LazyLayoutPrefetcher(final LazyLayoutPrefetchState lazyLayoutPrefetchState, final LazyLayoutItemContentFactory lazyLayoutItemContentFactory, final SubcomposeLayoutState subcomposeLayoutState, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1113453182);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1113453182, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher (LazyLayoutPrefetcher.android.kt:39)");
        }
        View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
        int i2 = SubcomposeLayoutState.$stable;
        startRestartGroup.startReplaceableGroup(1618982084);
        boolean changed = startRestartGroup.changed(subcomposeLayoutState);
        boolean changed2 = startRestartGroup.changed(lazyLayoutPrefetchState);
        boolean changed3 = startRestartGroup.changed(view);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if ((changed | changed2 | changed3) || rememberedValue == Composer.Companion.getEmpty()) {
            startRestartGroup.updateRememberedValue(new LazyLayoutPrefetcher(lazyLayoutPrefetchState, subcomposeLayoutState, lazyLayoutItemContentFactory, view));
        }
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i3) {
                    LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(LazyLayoutPrefetchState.this, lazyLayoutItemContentFactory, subcomposeLayoutState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
