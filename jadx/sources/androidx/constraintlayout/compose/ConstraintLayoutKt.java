package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.List;
import kotlin.Pair;
import o.C8632dsu;
import o.dpD;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class ConstraintLayoutKt {
    private static final boolean DEBUG = false;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toDebugString(BasicMeasure.Measure measure) {
        return "measure strategy is ";
    }

    public static final Pair<MeasurePolicy, drO<dpR>> rememberConstraintLayoutMeasurePolicy(final int i, ConstraintLayoutScope constraintLayoutScope, final MutableState<Boolean> mutableState, final Measurer measurer, Composer composer, int i2) {
        C8632dsu.c((Object) constraintLayoutScope, "");
        C8632dsu.c((Object) mutableState, "");
        C8632dsu.c((Object) measurer, "");
        composer.startReplaceableGroup(-441911751);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new ConstraintSetForInlineDsl(constraintLayoutScope);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) rememberedValue;
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(Integer.valueOf(i));
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = dpD.a(new MeasurePolicy() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo9measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                    MeasureResult layout$default;
                    C8632dsu.c((Object) measureScope, "");
                    C8632dsu.c((Object) list, "");
                    long m2609performMeasureDjhGOtQ = Measurer.this.m2609performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, i, measureScope);
                    mutableState.getValue();
                    int m2547getWidthimpl = IntSize.m2547getWidthimpl(m2609performMeasureDjhGOtQ);
                    int m2546getHeightimpl = IntSize.m2546getHeightimpl(m2609performMeasureDjhGOtQ);
                    final Measurer measurer2 = Measurer.this;
                    layout$default = MeasureScope.layout$default(measureScope, m2547getWidthimpl, m2546getHeightimpl, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1$measure$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                            C8632dsu.c((Object) placementScope, "");
                            Measurer.this.performLayout(placementScope, list);
                        }
                    }, 4, null);
                    return layout$default;
                }
            }, new drO<dpR>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* bridge */ /* synthetic */ dpR invoke() {
                    invoke2();
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    MutableState<Boolean> mutableState2 = mutableState;
                    mutableState2.setValue(Boolean.valueOf(!mutableState2.getValue().booleanValue()));
                    constraintSetForInlineDsl.setKnownDirty(true);
                }
            });
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Pair<MeasurePolicy, drO<dpR>> pair = (Pair) rememberedValue2;
        composer.endReplaceableGroup();
        return pair;
    }

    public static final Object createId() {
        return new Object() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$createId$1
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toDebugString(ConstraintWidget constraintWidget) {
        return ((Object) constraintWidget.getDebugName()) + " width " + constraintWidget.getWidth() + " minWidth " + constraintWidget.getMinWidth() + " maxWidth " + constraintWidget.getMaxWidth() + " height " + constraintWidget.getHeight() + " minHeight " + constraintWidget.getMinHeight() + " maxHeight " + constraintWidget.getMaxHeight() + " HDB " + constraintWidget.getHorizontalDimensionBehaviour() + " VDB " + constraintWidget.getVerticalDimensionBehaviour() + " MCW " + constraintWidget.mMatchConstraintDefaultWidth + " MCH " + constraintWidget.mMatchConstraintDefaultHeight + " percentW " + constraintWidget.mMatchConstraintPercentWidth + " percentH " + constraintWidget.mMatchConstraintPercentHeight;
    }

    public static final void buildMapping(State state, List<? extends Measurable> list) {
        C8632dsu.c((Object) state, "");
        C8632dsu.c((Object) list, "");
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            Measurable measurable = list.get(i);
            Object layoutId = LayoutIdKt.getLayoutId(measurable);
            if (layoutId == null && (layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable)) == null) {
                layoutId = createId();
            }
            state.map(layoutId, measurable);
            Object constraintLayoutTag = ConstraintLayoutTagKt.getConstraintLayoutTag(measurable);
            if (constraintLayoutTag != null && (constraintLayoutTag instanceof String) && (layoutId instanceof String)) {
                state.setTag((String) layoutId, (String) constraintLayoutTag);
            }
            if (i2 > size) {
                return;
            }
            i = i2;
        }
    }
}
