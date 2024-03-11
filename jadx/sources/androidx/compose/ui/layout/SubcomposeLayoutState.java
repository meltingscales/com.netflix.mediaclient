package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public final class SubcomposeLayoutState {
    public static final int $stable = 8;
    private LayoutNodeSubcompositionsState _state;
    private final drX<LayoutNode, CompositionContext, dpR> setCompositionContext;
    private final drX<LayoutNode, drX<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, dpR> setMeasurePolicy;
    private final drX<LayoutNode, SubcomposeLayoutState, dpR> setRoot;
    private final SubcomposeSlotReusePolicy slotReusePolicy;

    /* loaded from: classes.dex */
    public interface PrecomposedSlotHandle {
        void dispose();

        default int getPlaceablesCount() {
            return 0;
        }

        /* renamed from: premeasure-0kLqBqw */
        default void mo1817premeasure0kLqBqw(int i, long j) {
        }
    }

    public final drX<LayoutNode, CompositionContext, dpR> getSetCompositionContext$ui_release() {
        return this.setCompositionContext;
    }

    public final drX<LayoutNode, drX<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, dpR> getSetMeasurePolicy$ui_release() {
        return this.setMeasurePolicy;
    }

    public final drX<LayoutNode, SubcomposeLayoutState, dpR> getSetRoot$ui_release() {
        return this.setRoot;
    }

    public SubcomposeLayoutState(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.slotReusePolicy = subcomposeSlotReusePolicy;
        this.setRoot = new drX<LayoutNode, SubcomposeLayoutState, dpR>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* bridge */ /* synthetic */ dpR invoke(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
                invoke2(layoutNode, subcomposeLayoutState);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
                LayoutNodeSubcompositionsState state;
                LayoutNodeSubcompositionsState state2;
                SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2;
                SubcomposeSlotReusePolicy subcomposeSlotReusePolicy3;
                SubcomposeLayoutState subcomposeLayoutState2 = SubcomposeLayoutState.this;
                LayoutNodeSubcompositionsState subcompositionsState$ui_release = layoutNode.getSubcompositionsState$ui_release();
                if (subcompositionsState$ui_release == null) {
                    subcomposeSlotReusePolicy3 = SubcomposeLayoutState.this.slotReusePolicy;
                    subcompositionsState$ui_release = new LayoutNodeSubcompositionsState(layoutNode, subcomposeSlotReusePolicy3);
                    layoutNode.setSubcompositionsState$ui_release(subcompositionsState$ui_release);
                }
                subcomposeLayoutState2._state = subcompositionsState$ui_release;
                state = SubcomposeLayoutState.this.getState();
                state.makeSureStateIsConsistent();
                state2 = SubcomposeLayoutState.this.getState();
                subcomposeSlotReusePolicy2 = SubcomposeLayoutState.this.slotReusePolicy;
                state2.setSlotReusePolicy(subcomposeSlotReusePolicy2);
            }
        };
        this.setCompositionContext = new drX<LayoutNode, CompositionContext, dpR>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* bridge */ /* synthetic */ dpR invoke(LayoutNode layoutNode, CompositionContext compositionContext) {
                invoke2(layoutNode, compositionContext);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode layoutNode, CompositionContext compositionContext) {
                LayoutNodeSubcompositionsState state;
                state = SubcomposeLayoutState.this.getState();
                state.setCompositionContext(compositionContext);
            }
        };
        this.setMeasurePolicy = new drX<LayoutNode, drX<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, dpR>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* bridge */ /* synthetic */ dpR invoke(LayoutNode layoutNode, drX<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> drx) {
                invoke2(layoutNode, drx);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode layoutNode, drX<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> drx) {
                LayoutNodeSubcompositionsState state;
                state = SubcomposeLayoutState.this.getState();
                layoutNode.setMeasurePolicy(state.createMeasurePolicy(drx));
            }
        };
    }

    public SubcomposeLayoutState() {
        this(NoOpSubcomposeSlotReusePolicy.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNodeSubcompositionsState getState() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this._state;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final PrecomposedSlotHandle precompose(Object obj, drX<? super Composer, ? super Integer, dpR> drx) {
        return getState().precompose(obj, drx);
    }

    public final void forceRecomposeChildren$ui_release() {
        getState().forceRecomposeChildren();
    }
}
