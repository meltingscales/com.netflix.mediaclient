package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import java.util.List;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class ConstraintVerticalAnchorable extends BaseVerticalAnchorable {
    private final Object id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintVerticalAnchorable(Object obj, int i, List<drM<State, dpR>> list) {
        super(list, i);
        C8632dsu.c(obj, "");
        C8632dsu.c((Object) list, "");
        this.id = obj;
    }

    @Override // androidx.constraintlayout.compose.BaseVerticalAnchorable
    public ConstraintReference getConstraintReference(State state) {
        C8632dsu.c((Object) state, "");
        ConstraintReference constraints = state.constraints(this.id);
        C8632dsu.a(constraints, "");
        return constraints;
    }
}
