package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.state.ConstraintReference;
import java.util.List;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public abstract class BaseHorizontalAnchorable implements HorizontalAnchorable {
    private final int index;
    private final List<drM<State, dpR>> tasks;

    public abstract ConstraintReference getConstraintReference(State state);

    public BaseHorizontalAnchorable(List<drM<State, dpR>> list, int i) {
        C8632dsu.c((Object) list, "");
        this.tasks = list;
        this.index = i;
    }

    @Override // androidx.constraintlayout.compose.HorizontalAnchorable
    /* renamed from: linkTo-VpY3zN4  reason: not valid java name */
    public final void mo2602linkToVpY3zN4(final ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, final float f, final float f2) {
        C8632dsu.c((Object) horizontalAnchor, "");
        this.tasks.add(new drM<State, dpR>() { // from class: androidx.constraintlayout.compose.BaseHorizontalAnchorable$linkTo$1
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
                int i;
                C8632dsu.c((Object) state, "");
                ConstraintReference constraintReference = BaseHorizontalAnchorable.this.getConstraintReference(state);
                BaseHorizontalAnchorable baseHorizontalAnchorable = BaseHorizontalAnchorable.this;
                ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2 = horizontalAnchor;
                float f3 = f;
                float f4 = f2;
                drX<ConstraintReference, Object, ConstraintReference>[][] horizontalAnchorFunctions = AnchorFunctions.INSTANCE.getHorizontalAnchorFunctions();
                i = baseHorizontalAnchorable.index;
                horizontalAnchorFunctions[i][horizontalAnchor2.getIndex$compose_release()].invoke(constraintReference, horizontalAnchor2.getId$compose_release()).margin(Dp.m2490boximpl(f3)).marginGone(Dp.m2490boximpl(f4));
            }
        });
    }
}
