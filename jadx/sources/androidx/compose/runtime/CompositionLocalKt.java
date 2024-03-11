package androidx.compose.runtime;

import java.util.Arrays;
import o.dpR;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class CompositionLocalKt {
    public static /* synthetic */ ProvidableCompositionLocal compositionLocalOf$default(SnapshotMutationPolicy snapshotMutationPolicy, drO dro, int i, Object obj) {
        if ((i & 1) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return compositionLocalOf(snapshotMutationPolicy, dro);
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, drO<? extends T> dro) {
        return new DynamicProvidableCompositionLocal(snapshotMutationPolicy, dro);
    }

    public static final <T> ProvidableCompositionLocal<T> staticCompositionLocalOf(drO<? extends T> dro) {
        return new StaticProvidableCompositionLocal(dro);
    }

    public static final void CompositionLocalProvider(final ProvidedValue<?>[] providedValueArr, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1390796515);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1390796515, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:225)");
        }
        startRestartGroup.startProviders(providedValueArr);
        drx.invoke(startRestartGroup, Integer.valueOf((i >> 3) & 14));
        startRestartGroup.endProviders();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$1
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

                public final void invoke(Composer composer2, int i2) {
                    ProvidedValue<?>[] providedValueArr2 = providedValueArr;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue[]) Arrays.copyOf(providedValueArr2, providedValueArr2.length), drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void CompositionLocalProvider(final ProvidedValue<?> providedValue, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1350970552);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1350970552, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:245)");
        }
        startRestartGroup.startProvider(providedValue);
        drx.invoke(startRestartGroup, Integer.valueOf((i >> 3) & 14));
        startRestartGroup.endProvider();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$2
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

                public final void invoke(Composer composer2, int i2) {
                    CompositionLocalKt.CompositionLocalProvider(providedValue, drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
