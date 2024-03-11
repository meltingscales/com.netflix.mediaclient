package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

/* loaded from: classes2.dex */
public class Barrier extends ConstraintHelper {
    private androidx.constraintlayout.solver.widgets.Barrier mBarrier;
    private int mIndicatedType;
    private int mResolvedType;

    public int getType() {
        return this.mIndicatedType;
    }

    public void setType(int i) {
        this.mIndicatedType = i;
    }

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r6 == 6) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r6 == 6) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateType(androidx.constraintlayout.solver.widgets.ConstraintWidget r4, int r5, boolean r6) {
        /*
            r3 = this;
            r3.mResolvedType = r5
            r5 = 1
            r0 = 0
            r1 = 6
            r2 = 5
            if (r6 == 0) goto L12
            int r6 = r3.mIndicatedType
            if (r6 != r2) goto Lf
        Lc:
            r3.mResolvedType = r5
            goto L1c
        Lf:
            if (r6 != r1) goto L1c
            goto L16
        L12:
            int r6 = r3.mIndicatedType
            if (r6 != r2) goto L19
        L16:
            r3.mResolvedType = r0
            goto L1c
        L19:
            if (r6 != r1) goto L1c
            goto Lc
        L1c:
            boolean r5 = r4 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r5 == 0) goto L27
            androidx.constraintlayout.solver.widgets.Barrier r4 = (androidx.constraintlayout.solver.widgets.Barrier) r4
            int r5 = r3.mResolvedType
            r4.setBarrierType(r5)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.updateType(androidx.constraintlayout.solver.widgets.ConstraintWidget, int, boolean):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void resolveRtl(ConstraintWidget constraintWidget, boolean z) {
        updateType(constraintWidget, this.mIndicatedType, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mBarrier = new androidx.constraintlayout.solver.widgets.Barrier();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.mBarrier.setAllowsGoneWidget(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierMargin) {
                    this.mBarrier.setMargin(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.mBarrier;
        validateParams();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.mBarrier.setAllowsGoneWidget(z);
    }

    public boolean allowsGoneWidget() {
        return this.mBarrier.allowsGoneWidget();
    }

    public void setDpMargin(int i) {
        androidx.constraintlayout.solver.widgets.Barrier barrier = this.mBarrier;
        barrier.setMargin((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public int getMargin() {
        return this.mBarrier.getMargin();
    }

    public void setMargin(int i) {
        this.mBarrier.setMargin(i);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void loadParameters(ConstraintSet.Constraint constraint, HelperWidget helperWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.loadParameters(constraint, helperWidget, layoutParams, sparseArray);
        if (helperWidget instanceof androidx.constraintlayout.solver.widgets.Barrier) {
            androidx.constraintlayout.solver.widgets.Barrier barrier = (androidx.constraintlayout.solver.widgets.Barrier) helperWidget;
            updateType(barrier, constraint.layout.mBarrierDirection, ((ConstraintWidgetContainer) helperWidget.getParent()).isRtl());
            barrier.setAllowsGoneWidget(constraint.layout.mBarrierAllowsGoneWidgets);
            barrier.setMargin(constraint.layout.mBarrierMargin);
        }
    }
}
