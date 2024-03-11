package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.LayoutIdParentData;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ConstraintLayoutParentData implements LayoutIdParentData {
    private final drM<ConstrainScope, dpR> constrain;
    private final Object layoutId;
    private final ConstrainedLayoutReference ref;

    public final drM<ConstrainScope, dpR> getConstrain() {
        return this.constrain;
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    public Object getLayoutId() {
        return this.layoutId;
    }

    public final ConstrainedLayoutReference getRef() {
        return this.ref;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConstraintLayoutParentData(ConstrainedLayoutReference constrainedLayoutReference, drM<? super ConstrainScope, dpR> drm) {
        C8632dsu.c((Object) constrainedLayoutReference, "");
        C8632dsu.c((Object) drm, "");
        this.ref = constrainedLayoutReference;
        this.constrain = drm;
        this.layoutId = constrainedLayoutReference.getId();
    }

    public boolean equals(Object obj) {
        if (obj instanceof ConstraintLayoutParentData) {
            ConstraintLayoutParentData constraintLayoutParentData = (ConstraintLayoutParentData) obj;
            if (C8632dsu.c(this.ref.getId(), constraintLayoutParentData.ref.getId()) && C8632dsu.c(this.constrain, constraintLayoutParentData.constrain)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.ref.getId().hashCode() * 31) + this.constrain.hashCode();
    }
}
