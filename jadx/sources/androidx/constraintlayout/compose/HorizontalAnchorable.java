package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;

/* loaded from: classes.dex */
public interface HorizontalAnchorable {
    /* renamed from: linkTo-VpY3zN4 */
    void mo2602linkToVpY3zN4(ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f, float f2);

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        /* renamed from: linkTo-VpY3zN4$default  reason: not valid java name */
        public static /* synthetic */ void m2607linkToVpY3zN4$default(HorizontalAnchorable horizontalAnchorable, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f, float f2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
            }
            if ((i & 2) != 0) {
                f = Dp.m2492constructorimpl(0);
            }
            if ((i & 4) != 0) {
                f2 = Dp.m2492constructorimpl(0);
            }
            horizontalAnchorable.mo2602linkToVpY3zN4(horizontalAnchor, f, f2);
        }
    }
}
