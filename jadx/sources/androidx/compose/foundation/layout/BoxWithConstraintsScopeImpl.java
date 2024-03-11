package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
final class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope {
    private final /* synthetic */ BoxScopeInstance $$delegate_0;
    private final long constraints;
    private final Density density;

    public /* synthetic */ BoxWithConstraintsScopeImpl(Density density, long j, C8627dsp c8627dsp) {
        this(density, j);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier align(Modifier modifier, Alignment alignment) {
        return this.$$delegate_0.align(modifier, alignment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BoxWithConstraintsScopeImpl) {
            BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
            return C8632dsu.c(this.density, boxWithConstraintsScopeImpl.density) && Constraints.m2466equalsimpl0(this.constraints, boxWithConstraintsScopeImpl.constraints);
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getConstraints-msEJaDk */
    public long mo244getConstraintsmsEJaDk() {
        return this.constraints;
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + Constraints.m2476hashCodeimpl(this.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier matchParentSize(Modifier modifier) {
        return this.$$delegate_0.matchParentSize(modifier);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) Constraints.m2477toStringimpl(this.constraints)) + ')';
    }

    private BoxWithConstraintsScopeImpl(Density density, long j) {
        this.density = density;
        this.constraints = j;
        this.$$delegate_0 = BoxScopeInstance.INSTANCE;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxWidth-D9Ej5fM */
    public float mo245getMaxWidthD9Ej5fM() {
        return Constraints.m2469getHasBoundedWidthimpl(mo244getConstraintsmsEJaDk()) ? this.density.mo190toDpu2uoSUM(Constraints.m2473getMaxWidthimpl(mo244getConstraintsmsEJaDk())) : Dp.Companion.m2500getInfinityD9Ej5fM();
    }
}
