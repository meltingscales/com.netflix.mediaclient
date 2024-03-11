package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import com.netflix.android.org.json.zip.JSONzip;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public final class BoxWithConstraintsKt {
    public static final void BoxWithConstraints(Modifier modifier, Alignment alignment, boolean z, final InterfaceC8612dsa<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, dpR> interfaceC8612dsa, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1781813501);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(alignment) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(z) ? JSONzip.end : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(interfaceC8612dsa) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (i5 != 0) {
                alignment = Alignment.Companion.getTopStart();
            }
            if (i6 != 0) {
                z = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1781813501, i3, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:64)");
            }
            int i7 = i3 >> 3;
            final MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(alignment, z, startRestartGroup, (i7 & 14) | (i7 & 112));
            startRestartGroup.startReplaceableGroup(-1765292870);
            boolean changedInstance = startRestartGroup.changedInstance(interfaceC8612dsa);
            boolean changed = startRestartGroup.changed(rememberBoxMeasurePolicy);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changed) || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new drX<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // o.drX
                    public /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m243invoke0kLqBqw(subcomposeMeasureScope, constraints.m2478unboximpl());
                    }

                    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
                    public final MeasureResult m243invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        final BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = new BoxWithConstraintsScopeImpl(subcomposeMeasureScope, j, null);
                        dpR dpr = dpR.c;
                        final InterfaceC8612dsa<BoxWithConstraintsScope, Composer, Integer, dpR> interfaceC8612dsa2 = interfaceC8612dsa;
                        return MeasurePolicy.this.mo9measure3p2s80s(subcomposeMeasureScope, subcomposeMeasureScope.subcompose(dpr, ComposableLambdaKt.composableLambdaInstance(-1945019079, true, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
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

                            public final void invoke(Composer composer2, int i8) {
                                if ((i8 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1945019079, i8, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                                }
                                interfaceC8612dsa2.invoke(boxWithConstraintsScopeImpl, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        })), j);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (drX) rememberedValue, startRestartGroup, i3 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final Alignment alignment2 = alignment;
        final boolean z2 = z;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$2
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

                public final void invoke(Composer composer2, int i8) {
                    BoxWithConstraintsKt.BoxWithConstraints(Modifier.this, alignment2, z2, interfaceC8612dsa, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
