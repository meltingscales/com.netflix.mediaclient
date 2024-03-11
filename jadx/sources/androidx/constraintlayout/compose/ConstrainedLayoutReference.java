package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class ConstrainedLayoutReference {
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteLeft;
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteRight;
    private final ConstraintLayoutBaseScope.BaselineAnchor baseline;
    private final ConstraintLayoutBaseScope.HorizontalAnchor bottom;
    private final ConstraintLayoutBaseScope.VerticalAnchor end;
    private final Object id;
    private final ConstraintLayoutBaseScope.VerticalAnchor start;
    private final ConstraintLayoutBaseScope.HorizontalAnchor top;

    public final ConstraintLayoutBaseScope.HorizontalAnchor getBottom() {
        return this.bottom;
    }

    public final ConstraintLayoutBaseScope.VerticalAnchor getEnd() {
        return this.end;
    }

    public final Object getId() {
        return this.id;
    }

    public final ConstraintLayoutBaseScope.VerticalAnchor getStart() {
        return this.start;
    }

    public final ConstraintLayoutBaseScope.HorizontalAnchor getTop() {
        return this.top;
    }

    public ConstrainedLayoutReference(Object obj) {
        C8632dsu.c(obj, "");
        this.id = obj;
        this.start = new ConstraintLayoutBaseScope.VerticalAnchor(obj, -2);
        this.absoluteLeft = new ConstraintLayoutBaseScope.VerticalAnchor(obj, 0);
        this.top = new ConstraintLayoutBaseScope.HorizontalAnchor(obj, 0);
        this.end = new ConstraintLayoutBaseScope.VerticalAnchor(obj, -1);
        this.absoluteRight = new ConstraintLayoutBaseScope.VerticalAnchor(obj, 1);
        this.bottom = new ConstraintLayoutBaseScope.HorizontalAnchor(obj, 1);
        this.baseline = new ConstraintLayoutBaseScope.BaselineAnchor(obj);
    }
}
