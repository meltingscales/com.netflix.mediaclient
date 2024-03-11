package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.Dimension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class ConstrainScope {
    private final VerticalAnchorable absoluteLeft;
    private final VerticalAnchorable absoluteRight;
    private float alpha;
    private final BaselineAnchorable baseline;
    private final HorizontalAnchorable bottom;
    private final VerticalAnchorable end;
    private Dimension height;
    private float horizontalChainWeight;
    private final Object id;
    private final ConstrainedLayoutReference parent;
    private float pivotX;
    private float pivotY;
    private float scaleX;
    private float scaleY;
    private final VerticalAnchorable start;
    private final List<drM<State, dpR>> tasks;
    private final HorizontalAnchorable top;
    private float translationX;
    private float translationY;
    private float translationZ;
    private float verticalChainWeight;
    private Visibility visibility;
    private Dimension width;

    public final HorizontalAnchorable getBottom() {
        return this.bottom;
    }

    public final VerticalAnchorable getEnd() {
        return this.end;
    }

    public final Object getId$compose_release() {
        return this.id;
    }

    public final ConstrainedLayoutReference getParent() {
        return this.parent;
    }

    public final VerticalAnchorable getStart() {
        return this.start;
    }

    public final HorizontalAnchorable getTop() {
        return this.top;
    }

    public ConstrainScope(Object obj) {
        C8632dsu.c(obj, "");
        this.id = obj;
        ArrayList arrayList = new ArrayList();
        this.tasks = arrayList;
        Integer num = androidx.constraintlayout.core.state.State.PARENT;
        C8632dsu.a(num, "");
        this.parent = new ConstrainedLayoutReference(num);
        this.start = new ConstraintVerticalAnchorable(obj, -2, arrayList);
        this.absoluteLeft = new ConstraintVerticalAnchorable(obj, 0, arrayList);
        this.top = new ConstraintHorizontalAnchorable(obj, 0, arrayList);
        this.end = new ConstraintVerticalAnchorable(obj, -1, arrayList);
        this.absoluteRight = new ConstraintVerticalAnchorable(obj, 1, arrayList);
        this.bottom = new ConstraintHorizontalAnchorable(obj, 1, arrayList);
        this.baseline = new ConstraintBaselineAnchorable(obj, arrayList);
        Dimension.Companion companion = Dimension.Companion;
        this.width = companion.getWrapContent();
        this.height = companion.getWrapContent();
        this.visibility = Visibility.Companion.getVisible();
        this.alpha = 1.0f;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        float f = 0;
        this.translationX = Dp.m2492constructorimpl(f);
        this.translationY = Dp.m2492constructorimpl(f);
        this.translationZ = Dp.m2492constructorimpl(f);
        this.pivotX = 0.5f;
        this.pivotY = 0.5f;
        this.horizontalChainWeight = Float.NaN;
        this.verticalChainWeight = Float.NaN;
    }

    public final void setWidth(final Dimension dimension) {
        C8632dsu.c((Object) dimension, "");
        this.width = dimension;
        this.tasks.add(new drM<State, dpR>() { // from class: androidx.constraintlayout.compose.ConstrainScope$width$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(State state) {
                invoke2(state);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(State state) {
                C8632dsu.c((Object) state, "");
                state.constraints(ConstrainScope.this.getId$compose_release()).width(((DimensionDescription) dimension).toSolverDimension$compose_release(state));
            }
        });
    }

    public final void applyTo$compose_release(State state) {
        C8632dsu.c((Object) state, "");
        Iterator<T> it = this.tasks.iterator();
        while (it.hasNext()) {
            ((drM) it.next()).invoke(state);
        }
    }
}
