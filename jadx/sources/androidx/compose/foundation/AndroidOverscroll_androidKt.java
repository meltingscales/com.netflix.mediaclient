package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import o.C8657dts;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class AndroidOverscroll_androidKt {
    private static final Modifier StretchOverscrollNonClippingLayer;

    public static final OverscrollEffect rememberOverscrollEffect(Composer composer, int i) {
        OverscrollEffect overscrollEffect;
        composer.startReplaceableGroup(-1476348564);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1476348564, i, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:64)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) composer.consume(OverscrollConfiguration_androidKt.getLocalOverscrollConfiguration());
        if (overscrollConfiguration != null) {
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(context);
            boolean changed2 = composer.changed(overscrollConfiguration);
            Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AndroidEdgeEffectOverscrollEffect(context, overscrollConfiguration);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            overscrollEffect = (OverscrollEffect) rememberedValue;
        } else {
            overscrollEffect = NoOpOverscrollEffect.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return overscrollEffect;
    }

    static {
        Modifier modifier;
        if (Build.VERSION.SDK_INT >= 31) {
            modifier = LayoutModifierKt.layout(LayoutModifierKt.layout(Modifier.Companion, new InterfaceC8612dsa<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$1
                @Override // o.InterfaceC8612dsa
                public /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                    return m107invoke3p2s80s(measureScope, measurable, constraints.m2478unboximpl());
                }

                /* renamed from: invoke-3p2s80s  reason: not valid java name */
                public final MeasureResult m107invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                    int b;
                    int b2;
                    final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(j);
                    final int mo187roundToPx0680j_4 = measureScope.mo187roundToPx0680j_4(Dp.m2492constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
                    b = C8657dts.b(mo1803measureBRTryo0.getMeasuredWidth() - mo187roundToPx0680j_4, 0);
                    b2 = C8657dts.b(mo1803measureBRTryo0.getMeasuredHeight() - mo187roundToPx0680j_4, 0);
                    return MeasureScope.layout$default(measureScope, b, b2, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return dpR.c;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope placementScope) {
                            Placeable placeable = Placeable.this;
                            Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, ((-mo187roundToPx0680j_4) / 2) - ((placeable.getWidth() - Placeable.this.getMeasuredWidth()) / 2), ((-mo187roundToPx0680j_4) / 2) - ((Placeable.this.getHeight() - Placeable.this.getMeasuredHeight()) / 2), 0.0f, null, 12, null);
                        }
                    }, 4, null);
                }
            }), new InterfaceC8612dsa<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$2
                @Override // o.InterfaceC8612dsa
                public /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                    return m108invoke3p2s80s(measureScope, measurable, constraints.m2478unboximpl());
                }

                /* renamed from: invoke-3p2s80s  reason: not valid java name */
                public final MeasureResult m108invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                    final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(j);
                    final int mo187roundToPx0680j_4 = measureScope.mo187roundToPx0680j_4(Dp.m2492constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
                    return MeasureScope.layout$default(measureScope, mo1803measureBRTryo0.getWidth() + mo187roundToPx0680j_4, mo1803measureBRTryo0.getHeight() + mo187roundToPx0680j_4, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return dpR.c;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope placementScope) {
                            Placeable placeable = Placeable.this;
                            int i = mo187roundToPx0680j_4 / 2;
                            Placeable.PlacementScope.place$default(placementScope, placeable, i, i, 0.0f, 4, null);
                        }
                    }, 4, null);
                }
            });
        } else {
            modifier = Modifier.Companion;
        }
        StretchOverscrollNonClippingLayer = modifier;
    }
}
