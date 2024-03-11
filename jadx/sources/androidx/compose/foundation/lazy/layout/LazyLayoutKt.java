package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import com.netflix.android.org.json.zip.JSONzip;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class LazyLayoutKt {
    public static final void LazyLayout(final drO<? extends LazyLayoutItemProvider> dro, final Modifier modifier, final LazyLayoutPrefetchState lazyLayoutPrefetchState, final drX<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> drx, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(2002163445);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(dro) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(lazyLayoutPrefetchState) ? JSONzip.end : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(drx) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (i5 != 0) {
                lazyLayoutPrefetchState = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2002163445, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:77)");
            }
            final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(dro, startRestartGroup, i3 & 14);
            LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.composableLambda(startRestartGroup, -1488997347, true, new InterfaceC8612dsa<SaveableStateHolder, Composer, Integer, dpR>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // o.InterfaceC8612dsa
                public /* synthetic */ dpR invoke(SaveableStateHolder saveableStateHolder, Composer composer2, Integer num) {
                    invoke(saveableStateHolder, composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(SaveableStateHolder saveableStateHolder, Composer composer2, int i6) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1488997347, i6, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:81)");
                    }
                    final State<drO<LazyLayoutItemProvider>> state = rememberUpdatedState;
                    composer2.startReplaceableGroup(-492369756);
                    Object rememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new drO<LazyLayoutItemProvider>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // o.drO
                            public final LazyLayoutItemProvider invoke() {
                                return state.getValue().invoke();
                            }
                        });
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) rememberedValue;
                    composer2.startReplaceableGroup(-492369756);
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) rememberedValue2;
                    LazyLayoutPrefetchState lazyLayoutPrefetchState2 = LazyLayoutPrefetchState.this;
                    composer2.startReplaceableGroup(-1523807258);
                    if (lazyLayoutPrefetchState2 != null) {
                        LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(LazyLayoutPrefetchState.this, lazyLayoutItemContentFactory, subcomposeLayoutState, composer2, (SubcomposeLayoutState.$stable << 6) | 64);
                        dpR dpr = dpR.c;
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifier2 = modifier;
                    final drX<LazyLayoutMeasureScope, Constraints, MeasureResult> drx2 = drx;
                    composer2.startReplaceableGroup(511388516);
                    boolean changed = composer2.changed(lazyLayoutItemContentFactory);
                    boolean changed2 = composer2.changed(drx2);
                    Object rememberedValue3 = composer2.rememberedValue();
                    if ((changed | changed2) || rememberedValue3 == companion.getEmpty()) {
                        rememberedValue3 = new drX<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$2$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // o.drX
                            public /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m375invoke0kLqBqw(subcomposeMeasureScope, constraints.m2478unboximpl());
                            }

                            /* renamed from: invoke-0kLqBqw  reason: not valid java name */
                            public final MeasureResult m375invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                                return drx2.invoke(new LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory.this, subcomposeMeasureScope), Constraints.m2461boximpl(j));
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifier2, (drX) rememberedValue3, composer2, SubcomposeLayoutState.$stable, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final LazyLayoutPrefetchState lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$4
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

                public final void invoke(Composer composer2, int i6) {
                    LazyLayoutKt.LazyLayout(dro, modifier2, lazyLayoutPrefetchState2, drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
