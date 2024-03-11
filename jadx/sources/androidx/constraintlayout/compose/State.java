package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class State extends androidx.constraintlayout.core.state.State {
    private final List<Object> baselineNeeded;
    private final Set<ConstraintWidget> baselineNeededWidgets;
    private final Density density;
    private boolean dirtyBaselineNeededWidgets;
    public LayoutDirection layoutDirection;
    private long rootIncomingConstraints;

    /* renamed from: getRootIncomingConstraints-msEJaDk  reason: not valid java name */
    public final long m2610getRootIncomingConstraintsmsEJaDk() {
        return this.rootIncomingConstraints;
    }

    public final void setLayoutDirection(LayoutDirection layoutDirection) {
        C8632dsu.c((Object) layoutDirection, "");
        this.layoutDirection = layoutDirection;
    }

    /* renamed from: setRootIncomingConstraints-BRTryo0  reason: not valid java name */
    public final void m2611setRootIncomingConstraintsBRTryo0(long j) {
        this.rootIncomingConstraints = j;
    }

    public State(Density density) {
        C8632dsu.c((Object) density, "");
        this.density = density;
        this.rootIncomingConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.baselineNeeded = new ArrayList();
        this.dirtyBaselineNeededWidgets = true;
        this.baselineNeededWidgets = new LinkedHashSet();
    }

    public final LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection = this.layoutDirection;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        C8632dsu.d("");
        throw null;
    }

    @Override // androidx.constraintlayout.core.state.State
    public int convertDimension(Object obj) {
        if (obj instanceof Dp) {
            return this.density.mo187roundToPx0680j_4(((Dp) obj).m2498unboximpl());
        }
        return super.convertDimension(obj);
    }

    @Override // androidx.constraintlayout.core.state.State
    public void reset() {
        ConstraintWidget constraintWidget;
        HashMap<Object, Reference> hashMap = this.mReferences;
        C8632dsu.a(hashMap, "");
        for (Map.Entry<Object, Reference> entry : hashMap.entrySet()) {
            Reference value = entry.getValue();
            if (value != null && (constraintWidget = value.getConstraintWidget()) != null) {
                constraintWidget.reset();
            }
        }
        this.mReferences.clear();
        HashMap<Object, Reference> hashMap2 = this.mReferences;
        C8632dsu.a(hashMap2, "");
        hashMap2.put(androidx.constraintlayout.core.state.State.PARENT, this.mParent);
        this.baselineNeeded.clear();
        this.dirtyBaselineNeededWidgets = true;
        super.reset();
    }

    public final boolean isBaselineNeeded$compose_release(ConstraintWidget constraintWidget) {
        C8632dsu.c((Object) constraintWidget, "");
        if (this.dirtyBaselineNeededWidgets) {
            this.baselineNeededWidgets.clear();
            for (Object obj : this.baselineNeeded) {
                Reference reference = this.mReferences.get(obj);
                ConstraintWidget constraintWidget2 = reference == null ? null : reference.getConstraintWidget();
                if (constraintWidget2 != null) {
                    this.baselineNeededWidgets.add(constraintWidget2);
                }
            }
            this.dirtyBaselineNeededWidgets = false;
        }
        return this.baselineNeededWidgets.contains(constraintWidget);
    }
}
