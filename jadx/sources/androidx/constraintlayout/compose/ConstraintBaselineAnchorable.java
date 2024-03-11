package androidx.constraintlayout.compose;

import java.util.List;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class ConstraintBaselineAnchorable implements BaselineAnchorable {
    private final Object id;
    private final List<drM<State, dpR>> tasks;

    public ConstraintBaselineAnchorable(Object obj, List<drM<State, dpR>> list) {
        C8632dsu.c(obj, "");
        C8632dsu.c((Object) list, "");
        this.id = obj;
        this.tasks = list;
    }
}
