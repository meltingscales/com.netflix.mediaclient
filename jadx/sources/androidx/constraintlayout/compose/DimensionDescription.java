package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.Dimension;
import o.C8632dsu;
import o.drM;

/* loaded from: classes.dex */
public final class DimensionDescription implements Dimension.Coercible, Dimension.MinCoercible, Dimension.MaxCoercible {
    private final drM<State, androidx.constraintlayout.core.state.Dimension> baseDimension;
    private Dp max;
    private Object maxSymbol;
    private Dp min;
    private Object minSymbol;

    /* renamed from: getMax-lTKBWiU  reason: not valid java name */
    public final Dp m2605getMaxlTKBWiU() {
        return this.max;
    }

    public final Object getMaxSymbol() {
        return this.maxSymbol;
    }

    /* renamed from: getMin-lTKBWiU  reason: not valid java name */
    public final Dp m2606getMinlTKBWiU() {
        return this.min;
    }

    public final Object getMinSymbol() {
        return this.minSymbol;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DimensionDescription(drM<? super State, ? extends androidx.constraintlayout.core.state.Dimension> drm) {
        C8632dsu.c((Object) drm, "");
        this.baseDimension = drm;
    }

    public final androidx.constraintlayout.core.state.Dimension toSolverDimension$compose_release(State state) {
        C8632dsu.c((Object) state, "");
        androidx.constraintlayout.core.state.Dimension invoke = this.baseDimension.invoke(state);
        if (getMinSymbol() != null) {
            invoke.min(getMinSymbol());
        } else if (m2606getMinlTKBWiU() != null) {
            Dp m2606getMinlTKBWiU = m2606getMinlTKBWiU();
            C8632dsu.d(m2606getMinlTKBWiU);
            invoke.min(state.convertDimension(m2606getMinlTKBWiU));
        }
        if (getMaxSymbol() != null) {
            invoke.max(getMaxSymbol());
        } else if (m2605getMaxlTKBWiU() != null) {
            Dp m2605getMaxlTKBWiU = m2605getMaxlTKBWiU();
            C8632dsu.d(m2605getMaxlTKBWiU);
            invoke.max(state.convertDimension(m2605getMaxlTKBWiU));
        }
        return invoke;
    }
}
