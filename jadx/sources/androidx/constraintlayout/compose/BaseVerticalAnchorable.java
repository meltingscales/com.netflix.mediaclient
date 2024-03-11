package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.state.ConstraintReference;
import java.util.List;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public abstract class BaseVerticalAnchorable implements VerticalAnchorable {
    private final int index;
    private final List<drM<State, dpR>> tasks;

    public abstract ConstraintReference getConstraintReference(State state);

    public BaseVerticalAnchorable(List<drM<State, dpR>> list, int i) {
        C8632dsu.c((Object) list, "");
        this.tasks = list;
        this.index = i;
    }

    @Override // androidx.constraintlayout.compose.VerticalAnchorable
    /* renamed from: linkTo-VpY3zN4  reason: not valid java name */
    public final void mo2603linkToVpY3zN4(final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, final float f, final float f2) {
        C8632dsu.c((Object) verticalAnchor, "");
        this.tasks.add(new drM<State, dpR>() { // from class: androidx.constraintlayout.compose.BaseVerticalAnchorable$linkTo$1
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
                LayoutDirection layoutDirection = state.getLayoutDirection();
                AnchorFunctions anchorFunctions = AnchorFunctions.INSTANCE;
                i = BaseVerticalAnchorable.this.index;
                int verticalAnchorIndexToFunctionIndex = anchorFunctions.verticalAnchorIndexToFunctionIndex(i, layoutDirection);
                int verticalAnchorIndexToFunctionIndex2 = anchorFunctions.verticalAnchorIndexToFunctionIndex(verticalAnchor.getIndex$compose_release(), layoutDirection);
                anchorFunctions.getVerticalAnchorFunctions()[verticalAnchorIndexToFunctionIndex][verticalAnchorIndexToFunctionIndex2].invoke(BaseVerticalAnchorable.this.getConstraintReference(state), verticalAnchor.getId$compose_release(), state.getLayoutDirection()).margin(Dp.m2490boximpl(f)).marginGone(Dp.m2490boximpl(f2));
            }
        });
    }
}
