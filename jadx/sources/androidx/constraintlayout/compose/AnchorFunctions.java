package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.ConstraintReference;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.drX;

/* loaded from: classes.dex */
public final class AnchorFunctions {
    public static final AnchorFunctions INSTANCE = new AnchorFunctions();
    private static final InterfaceC8612dsa<ConstraintReference, Object, LayoutDirection, ConstraintReference>[][] verticalAnchorFunctions = {new InterfaceC8612dsa[]{new InterfaceC8612dsa<ConstraintReference, Object, LayoutDirection, ConstraintReference>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$verticalAnchorFunctions$1
        @Override // o.InterfaceC8612dsa
        public final ConstraintReference invoke(ConstraintReference constraintReference, Object obj, LayoutDirection layoutDirection) {
            C8632dsu.c((Object) constraintReference, "");
            C8632dsu.c(obj, "");
            C8632dsu.c((Object) layoutDirection, "");
            AnchorFunctions.INSTANCE.clearLeft(constraintReference, layoutDirection);
            ConstraintReference leftToLeft = constraintReference.leftToLeft(obj);
            C8632dsu.a(leftToLeft, "");
            return leftToLeft;
        }
    }, new InterfaceC8612dsa<ConstraintReference, Object, LayoutDirection, ConstraintReference>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$verticalAnchorFunctions$2
        @Override // o.InterfaceC8612dsa
        public final ConstraintReference invoke(ConstraintReference constraintReference, Object obj, LayoutDirection layoutDirection) {
            C8632dsu.c((Object) constraintReference, "");
            C8632dsu.c(obj, "");
            C8632dsu.c((Object) layoutDirection, "");
            AnchorFunctions.INSTANCE.clearLeft(constraintReference, layoutDirection);
            ConstraintReference leftToRight = constraintReference.leftToRight(obj);
            C8632dsu.a(leftToRight, "");
            return leftToRight;
        }
    }}, new InterfaceC8612dsa[]{new InterfaceC8612dsa<ConstraintReference, Object, LayoutDirection, ConstraintReference>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$verticalAnchorFunctions$3
        @Override // o.InterfaceC8612dsa
        public final ConstraintReference invoke(ConstraintReference constraintReference, Object obj, LayoutDirection layoutDirection) {
            C8632dsu.c((Object) constraintReference, "");
            C8632dsu.c(obj, "");
            C8632dsu.c((Object) layoutDirection, "");
            AnchorFunctions.INSTANCE.clearRight(constraintReference, layoutDirection);
            ConstraintReference rightToLeft = constraintReference.rightToLeft(obj);
            C8632dsu.a(rightToLeft, "");
            return rightToLeft;
        }
    }, new InterfaceC8612dsa<ConstraintReference, Object, LayoutDirection, ConstraintReference>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$verticalAnchorFunctions$4
        @Override // o.InterfaceC8612dsa
        public final ConstraintReference invoke(ConstraintReference constraintReference, Object obj, LayoutDirection layoutDirection) {
            C8632dsu.c((Object) constraintReference, "");
            C8632dsu.c(obj, "");
            C8632dsu.c((Object) layoutDirection, "");
            AnchorFunctions.INSTANCE.clearRight(constraintReference, layoutDirection);
            ConstraintReference rightToRight = constraintReference.rightToRight(obj);
            C8632dsu.a(rightToRight, "");
            return rightToRight;
        }
    }}};
    private static final drX<ConstraintReference, Object, ConstraintReference>[][] horizontalAnchorFunctions = {new drX[]{new drX<ConstraintReference, Object, ConstraintReference>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$horizontalAnchorFunctions$1
        @Override // o.drX
        public final ConstraintReference invoke(ConstraintReference constraintReference, Object obj) {
            C8632dsu.c((Object) constraintReference, "");
            C8632dsu.c(obj, "");
            constraintReference.topToBottom(null);
            constraintReference.baselineToBaseline(null);
            ConstraintReference constraintReference2 = constraintReference.topToTop(obj);
            C8632dsu.a(constraintReference2, "");
            return constraintReference2;
        }
    }, new drX<ConstraintReference, Object, ConstraintReference>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$horizontalAnchorFunctions$2
        @Override // o.drX
        public final ConstraintReference invoke(ConstraintReference constraintReference, Object obj) {
            C8632dsu.c((Object) constraintReference, "");
            C8632dsu.c(obj, "");
            constraintReference.topToTop(null);
            constraintReference.baselineToBaseline(null);
            ConstraintReference constraintReference2 = constraintReference.topToBottom(obj);
            C8632dsu.a(constraintReference2, "");
            return constraintReference2;
        }
    }}, new drX[]{new drX<ConstraintReference, Object, ConstraintReference>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$horizontalAnchorFunctions$3
        @Override // o.drX
        public final ConstraintReference invoke(ConstraintReference constraintReference, Object obj) {
            C8632dsu.c((Object) constraintReference, "");
            C8632dsu.c(obj, "");
            constraintReference.bottomToBottom(null);
            constraintReference.baselineToBaseline(null);
            ConstraintReference bottomToTop = constraintReference.bottomToTop(obj);
            C8632dsu.a(bottomToTop, "");
            return bottomToTop;
        }
    }, new drX<ConstraintReference, Object, ConstraintReference>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$horizontalAnchorFunctions$4
        @Override // o.drX
        public final ConstraintReference invoke(ConstraintReference constraintReference, Object obj) {
            C8632dsu.c((Object) constraintReference, "");
            C8632dsu.c(obj, "");
            constraintReference.bottomToTop(null);
            constraintReference.baselineToBaseline(null);
            ConstraintReference bottomToBottom = constraintReference.bottomToBottom(obj);
            C8632dsu.a(bottomToBottom, "");
            return bottomToBottom;
        }
    }}};
    private static final drX<ConstraintReference, Object, ConstraintReference> baselineAnchorFunction = new drX<ConstraintReference, Object, ConstraintReference>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$baselineAnchorFunction$1
        @Override // o.drX
        public final ConstraintReference invoke(ConstraintReference constraintReference, Object obj) {
            C8632dsu.c((Object) constraintReference, "");
            C8632dsu.c(obj, "");
            constraintReference.topToTop(null);
            constraintReference.topToBottom(null);
            constraintReference.bottomToTop(null);
            constraintReference.bottomToBottom(null);
            ConstraintReference baselineToBaseline = constraintReference.baselineToBaseline(obj);
            C8632dsu.a(baselineToBaseline, "");
            return baselineToBaseline;
        }
    };

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final drX<ConstraintReference, Object, ConstraintReference>[][] getHorizontalAnchorFunctions() {
        return horizontalAnchorFunctions;
    }

    public final InterfaceC8612dsa<ConstraintReference, Object, LayoutDirection, ConstraintReference>[][] getVerticalAnchorFunctions() {
        return verticalAnchorFunctions;
    }

    private AnchorFunctions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearLeft(ConstraintReference constraintReference, LayoutDirection layoutDirection) {
        constraintReference.leftToLeft(null);
        constraintReference.leftToRight(null);
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            constraintReference.startToStart(null);
            constraintReference.startToEnd(null);
        } else if (i != 2) {
        } else {
            constraintReference.endToStart(null);
            constraintReference.endToEnd(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearRight(ConstraintReference constraintReference, LayoutDirection layoutDirection) {
        constraintReference.rightToLeft(null);
        constraintReference.rightToRight(null);
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            constraintReference.endToStart(null);
            constraintReference.endToEnd(null);
        } else if (i != 2) {
        } else {
            constraintReference.startToStart(null);
            constraintReference.startToEnd(null);
        }
    }

    public final int verticalAnchorIndexToFunctionIndex(int i, LayoutDirection layoutDirection) {
        C8632dsu.c((Object) layoutDirection, "");
        return i >= 0 ? i : layoutDirection == LayoutDirection.Ltr ? i + 2 : (-i) - 1;
    }
}
