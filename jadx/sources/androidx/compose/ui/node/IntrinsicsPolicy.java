package androidx.compose.ui.node;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.layout.MeasurePolicy;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class IntrinsicsPolicy {
    private final LayoutNode layoutNode;
    private final MutableState measurePolicyState$delegate;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public IntrinsicsPolicy(LayoutNode layoutNode) {
        MutableState mutableStateOf$default;
        this.layoutNode = layoutNode;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.measurePolicyState$delegate = mutableStateOf$default;
    }

    public final void updateFrom(MeasurePolicy measurePolicy) {
        setMeasurePolicyState(measurePolicy);
    }

    public final int minIntrinsicWidth(int i) {
        return measurePolicyFromState().minIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildMeasurables$ui_release(), i);
    }

    public final int minIntrinsicHeight(int i) {
        return measurePolicyFromState().minIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildMeasurables$ui_release(), i);
    }

    public final int maxIntrinsicWidth(int i) {
        return measurePolicyFromState().maxIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildMeasurables$ui_release(), i);
    }

    public final int maxIntrinsicHeight(int i) {
        return measurePolicyFromState().maxIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildMeasurables$ui_release(), i);
    }

    public final int minLookaheadIntrinsicWidth(int i) {
        return measurePolicyFromState().minIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildLookaheadMeasurables$ui_release(), i);
    }

    public final int minLookaheadIntrinsicHeight(int i) {
        return measurePolicyFromState().minIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildLookaheadMeasurables$ui_release(), i);
    }

    public final int maxLookaheadIntrinsicWidth(int i) {
        return measurePolicyFromState().maxIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildLookaheadMeasurables$ui_release(), i);
    }

    public final int maxLookaheadIntrinsicHeight(int i) {
        return measurePolicyFromState().maxIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildLookaheadMeasurables$ui_release(), i);
    }

    private final MeasurePolicy measurePolicyFromState() {
        MeasurePolicy measurePolicyState = getMeasurePolicyState();
        if (measurePolicyState != null) {
            return measurePolicyState;
        }
        throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
    }

    /* loaded from: classes.dex */
    static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    private final MeasurePolicy getMeasurePolicyState() {
        return (MeasurePolicy) this.measurePolicyState$delegate.getValue();
    }

    private final void setMeasurePolicyState(MeasurePolicy measurePolicy) {
        this.measurePolicyState$delegate.setValue(measurePolicy);
    }
}
