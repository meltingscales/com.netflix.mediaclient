package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.NoWhenBranchMatchedException;
import o.C8632dsu;
import o.drM;

/* loaded from: classes.dex */
public final class TwoDimensionalFocusSearchKt {

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: twoDimensionalFocusSearch--OM-vw8  reason: not valid java name */
    public static final Boolean m1116twoDimensionalFocusSearchOMvw8(FocusTargetNode focusTargetNode, int i, drM<? super FocusTargetNode, Boolean> drm) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[focusState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return Boolean.valueOf(m1112findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i, drm));
            }
            if (i2 == 4) {
                return focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() ? drm.invoke(focusTargetNode) : Boolean.FALSE;
            }
            throw new NoWhenBranchMatchedException();
        }
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        int i3 = iArr[activeChild.getFocusState().ordinal()];
        if (i3 == 1) {
            Boolean m1116twoDimensionalFocusSearchOMvw8 = m1116twoDimensionalFocusSearchOMvw8(activeChild, i, drm);
            return !C8632dsu.c(m1116twoDimensionalFocusSearchOMvw8, Boolean.FALSE) ? m1116twoDimensionalFocusSearchOMvw8 : Boolean.valueOf(m1113generateAndSearchChildren4C6V_qg(focusTargetNode, activeNode(activeChild), i, drm));
        } else if (i3 == 2 || i3 == 3) {
            return Boolean.valueOf(m1113generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, i, drm));
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg  reason: not valid java name */
    private static final boolean m1113generateAndSearchChildren4C6V_qg(final FocusTargetNode focusTargetNode, final FocusTargetNode focusTargetNode2, final int i, final drM<? super FocusTargetNode, Boolean> drm) {
        if (m1115searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i, drm)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m1074searchBeyondBoundsOMvw8(focusTargetNode, i, new drM<BeyondBoundsLayout.BeyondBoundsScope, Boolean>() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                boolean m1115searchChildren4C6V_qg;
                m1115searchChildren4C6V_qg = TwoDimensionalFocusSearchKt.m1115searchChildren4C6V_qg(FocusTargetNode.this, focusTargetNode2, i, drm);
                Boolean valueOf = Boolean.valueOf(m1115searchChildren4C6V_qg);
                if (valueOf.booleanValue() || !beyondBoundsScope.getHasMoreContent()) {
                    return valueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: findBestCandidate-4WY_MpI  reason: not valid java name */
    private static final FocusTargetNode m1111findBestCandidate4WY_MpI(MutableVector<FocusTargetNode> mutableVector, Rect rect, int i) {
        Rect translate;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m1078equalsimpl0(i, companion.m1085getLeftdhqQ8s())) {
            translate = rect.translate(rect.getWidth() + 1, 0.0f);
        } else if (FocusDirection.m1078equalsimpl0(i, companion.m1088getRightdhqQ8s())) {
            translate = rect.translate(-(rect.getWidth() + 1), 0.0f);
        } else if (FocusDirection.m1078equalsimpl0(i, companion.m1089getUpdhqQ8s())) {
            translate = rect.translate(0.0f, rect.getHeight() + 1);
        } else if (!FocusDirection.m1078equalsimpl0(i, companion.m1082getDowndhqQ8s())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        } else {
            translate = rect.translate(0.0f, -(rect.getHeight() + 1));
        }
        int size = mutableVector.getSize();
        FocusTargetNode focusTargetNode = null;
        if (size > 0) {
            FocusTargetNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                FocusTargetNode focusTargetNode2 = content[i2];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                    Rect focusRect = FocusTraversalKt.focusRect(focusTargetNode2);
                    if (m1114isBetterCandidateI7lrPNg(focusRect, translate, rect, i)) {
                        focusTargetNode = focusTargetNode2;
                        translate = focusRect;
                    }
                }
                i2++;
            } while (i2 < size);
            return focusTargetNode;
        }
        return focusTargetNode;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00be A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(androidx.compose.ui.geometry.Rect r2, int r3, androidx.compose.ui.geometry.Rect r4) {
        /*
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r1 = r0.m1085getLeftdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m1078equalsimpl0(r3, r1)
            if (r1 == 0) goto L32
            float r3 = r4.getRight()
            float r0 = r2.getRight()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L24
            float r3 = r4.getLeft()
            float r0 = r2.getRight()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 < 0) goto Lc0
        L24:
            float r3 = r4.getLeft()
            float r2 = r2.getLeft()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lc0
            goto Lbe
        L32:
            int r1 = r0.m1088getRightdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m1078equalsimpl0(r3, r1)
            if (r1 == 0) goto L61
            float r3 = r4.getLeft()
            float r0 = r2.getLeft()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 < 0) goto L54
            float r3 = r4.getRight()
            float r0 = r2.getLeft()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto Lc0
        L54:
            float r3 = r4.getRight()
            float r2 = r2.getRight()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto Lc0
            goto Lbe
        L61:
            int r1 = r0.m1089getUpdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m1078equalsimpl0(r3, r1)
            if (r1 == 0) goto L90
            float r3 = r4.getBottom()
            float r0 = r2.getBottom()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L83
            float r3 = r4.getTop()
            float r0 = r2.getBottom()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 < 0) goto Lc0
        L83:
            float r3 = r4.getTop()
            float r2 = r2.getTop()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lc0
            goto Lbe
        L90:
            int r0 = r0.m1082getDowndhqQ8s()
            boolean r3 = androidx.compose.ui.focus.FocusDirection.m1078equalsimpl0(r3, r0)
            if (r3 == 0) goto Lc2
            float r3 = r4.getTop()
            float r0 = r2.getTop()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 < 0) goto Lb2
            float r3 = r4.getBottom()
            float r0 = r2.getTop()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto Lc0
        Lb2:
            float r3 = r4.getBottom()
            float r2 = r2.getBottom()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto Lc0
        Lbe:
            r2 = 1
            goto Lc1
        Lc0:
            r2 = 0
        Lc1:
            return r2
        Lc2:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.isBetterCandidate_I7lrPNg$isCandidate(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):boolean");
    }

    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect rect, int i, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (!FocusDirection.m1078equalsimpl0(i, companion.m1085getLeftdhqQ8s())) {
            if (FocusDirection.m1078equalsimpl0(i, companion.m1088getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m1078equalsimpl0(i, companion.m1089getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else if (!FocusDirection.m1078equalsimpl0(i, companion.m1082getDowndhqQ8s())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            } else {
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f = top - bottom;
            return Math.max(0.0f, f);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f = top2 - bottom2;
        return Math.max(0.0f, f);
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i, Rect rect2) {
        float f;
        float top;
        float top2;
        float height;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m1078equalsimpl0(i, companion.m1085getLeftdhqQ8s()) || FocusDirection.m1078equalsimpl0(i, companion.m1088getRightdhqQ8s())) {
            f = 2;
            top = rect2.getTop() + (rect2.getHeight() / f);
            top2 = rect.getTop();
            height = rect.getHeight();
        } else if (!FocusDirection.m1078equalsimpl0(i, companion.m1089getUpdhqQ8s()) && !FocusDirection.m1078equalsimpl0(i, companion.m1082getDowndhqQ8s())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        } else {
            f = 2;
            top = rect2.getLeft() + (rect2.getWidth() / f);
            top2 = rect.getLeft();
            height = rect.getWidth();
        }
        return top - (top2 + (height / f));
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i, Rect rect, Rect rect2) {
        long abs = Math.abs(isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i, rect));
        long abs2 = Math.abs(isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i, rect));
        return (13 * abs * abs) + (abs2 * abs2);
    }

    /* renamed from: isBetterCandidate-I7lrPNg  reason: not valid java name */
    private static final boolean m1114isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i) {
        return isBetterCandidate_I7lrPNg$isCandidate(rect, i, rect3) && (!isBetterCandidate_I7lrPNg$isCandidate(rect2, i, rect3) || m1110beamBeatsI7lrPNg(rect3, rect, rect2, i) || (!m1110beamBeatsI7lrPNg(rect3, rect2, rect, i) && isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect) < isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean beamBeats_I7lrPNg$inSourceBeam(androidx.compose.ui.geometry.Rect r2, int r3, androidx.compose.ui.geometry.Rect r4) {
        /*
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r1 = r0.m1085getLeftdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m1078equalsimpl0(r3, r1)
            if (r1 == 0) goto Ld
            goto L17
        Ld:
            int r1 = r0.m1088getRightdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m1078equalsimpl0(r3, r1)
            if (r1 == 0) goto L30
        L17:
            float r3 = r2.getBottom()
            float r0 = r4.getTop()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L5f
            float r2 = r2.getTop()
            float r3 = r4.getBottom()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L5f
            goto L5d
        L30:
            int r1 = r0.m1089getUpdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m1078equalsimpl0(r3, r1)
            if (r1 == 0) goto L3b
            goto L45
        L3b:
            int r0 = r0.m1082getDowndhqQ8s()
            boolean r3 = androidx.compose.ui.focus.FocusDirection.m1078equalsimpl0(r3, r0)
            if (r3 == 0) goto L61
        L45:
            float r3 = r2.getRight()
            float r0 = r4.getLeft()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L5f
            float r2 = r2.getLeft()
            float r3 = r4.getRight()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L5f
        L5d:
            r2 = 1
            goto L60
        L5f:
            r2 = 0
        L60:
            return r2
        L61:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.beamBeats_I7lrPNg$inSourceBeam(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(androidx.compose.ui.geometry.Rect r2, int r3, androidx.compose.ui.geometry.Rect r4) {
        /*
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r1 = r0.m1085getLeftdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m1078equalsimpl0(r3, r1)
            if (r1 == 0) goto L19
            float r3 = r4.getLeft()
            float r2 = r2.getRight()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L5f
            goto L5d
        L19:
            int r1 = r0.m1088getRightdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m1078equalsimpl0(r3, r1)
            if (r1 == 0) goto L30
            float r3 = r4.getRight()
            float r2 = r2.getLeft()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 > 0) goto L5f
            goto L5d
        L30:
            int r1 = r0.m1089getUpdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m1078equalsimpl0(r3, r1)
            if (r1 == 0) goto L47
            float r3 = r4.getTop()
            float r2 = r2.getBottom()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L5f
            goto L5d
        L47:
            int r0 = r0.m1082getDowndhqQ8s()
            boolean r3 = androidx.compose.ui.focus.FocusDirection.m1078equalsimpl0(r3, r0)
            if (r3 == 0) goto L61
            float r3 = r4.getBottom()
            float r2 = r2.getTop()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 > 0) goto L5f
        L5d:
            r2 = 1
            goto L60
        L5f:
            r2 = 0
        L60:
            return r2
        L61:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.beamBeats_I7lrPNg$isInDirectionOfSearch(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):boolean");
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistance$6(Rect rect, int i, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (!FocusDirection.m1078equalsimpl0(i, companion.m1085getLeftdhqQ8s())) {
            if (FocusDirection.m1078equalsimpl0(i, companion.m1088getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m1078equalsimpl0(i, companion.m1089getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else if (!FocusDirection.m1078equalsimpl0(i, companion.m1082getDowndhqQ8s())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            } else {
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f = top - bottom;
            return Math.max(0.0f, f);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f = top2 - bottom2;
        return Math.max(0.0f, f);
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect rect, int i, Rect rect2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (!FocusDirection.m1078equalsimpl0(i, companion.m1085getLeftdhqQ8s())) {
            if (FocusDirection.m1078equalsimpl0(i, companion.m1088getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (FocusDirection.m1078equalsimpl0(i, companion.m1089getUpdhqQ8s())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else if (!FocusDirection.m1078equalsimpl0(i, companion.m1082getDowndhqQ8s())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            } else {
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            }
            f = bottom - bottom2;
            return Math.max(1.0f, f);
        }
        top = rect2.getLeft();
        top2 = rect.getLeft();
        f = top - top2;
        return Math.max(1.0f, f);
    }

    /* renamed from: beamBeats-I7lrPNg  reason: not valid java name */
    private static final boolean m1110beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i) {
        if (!beamBeats_I7lrPNg$inSourceBeam(rect3, i, rect) && beamBeats_I7lrPNg$inSourceBeam(rect2, i, rect)) {
            if (beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i, rect)) {
                FocusDirection.Companion companion = FocusDirection.Companion;
                if (FocusDirection.m1078equalsimpl0(i, companion.m1085getLeftdhqQ8s()) || FocusDirection.m1078equalsimpl0(i, companion.m1088getRightdhqQ8s()) || beamBeats_I7lrPNg$majorAxisDistance$6(rect2, i, rect) < beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i, rect)) {
                }
            }
            return true;
        }
        return false;
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    private static final FocusTargetNode activeNode(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy".toString());
        }
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetNode);
        if (findActiveFocusNode != null) {
            return findActiveFocusNode;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }

    /* renamed from: findChildCorrespondingToFocusEnter--OM-vw8  reason: not valid java name */
    public static final boolean m1112findChildCorrespondingToFocusEnterOMvw8(FocusTargetNode focusTargetNode, int i, drM<? super FocusTargetNode, Boolean> drm) {
        Rect rect;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        collectAccessibleChildren(focusTargetNode, mutableVector);
        if (mutableVector.getSize() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (mutableVector.isEmpty() ? null : mutableVector.getContent()[0]);
            if (focusTargetNode2 != null) {
                return drm.invoke(focusTargetNode2).booleanValue();
            }
            return false;
        }
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m1078equalsimpl0(i, companion.m1083getEnterdhqQ8s())) {
            i = companion.m1088getRightdhqQ8s();
        }
        if (FocusDirection.m1078equalsimpl0(i, companion.m1088getRightdhqQ8s()) || FocusDirection.m1078equalsimpl0(i, companion.m1082getDowndhqQ8s())) {
            rect = topLeft(FocusTraversalKt.focusRect(focusTargetNode));
        } else if (!FocusDirection.m1078equalsimpl0(i, companion.m1085getLeftdhqQ8s()) && !FocusDirection.m1078equalsimpl0(i, companion.m1089getUpdhqQ8s())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        } else {
            rect = bottomRight(FocusTraversalKt.focusRect(focusTargetNode));
        }
        FocusTargetNode m1111findBestCandidate4WY_MpI = m1111findBestCandidate4WY_MpI(mutableVector, rect, i);
        if (m1111findBestCandidate4WY_MpI != null) {
            return drm.invoke(m1111findBestCandidate4WY_MpI).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg  reason: not valid java name */
    public static final boolean m1115searchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, drM<? super FocusTargetNode, Boolean> drm) {
        FocusTargetNode m1111findBestCandidate4WY_MpI;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int m1935constructorimpl = NodeKind.m1935constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode());
        } else {
            mutableVector2.add(child$ui_release);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & m1935constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                mutableVector.add((FocusTargetNode) node);
                            } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.add(node);
                                                node = null;
                                            }
                                            mutableVector3.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild$ui_release();
                    }
                }
            }
        }
        while (mutableVector.isNotEmpty() && (m1111findBestCandidate4WY_MpI = m1111findBestCandidate4WY_MpI(mutableVector, FocusTraversalKt.focusRect(focusTargetNode2), i)) != null) {
            if (m1111findBestCandidate4WY_MpI.fetchFocusProperties$ui_release().getCanFocus()) {
                return drm.invoke(m1111findBestCandidate4WY_MpI).booleanValue();
            }
            if (m1113generateAndSearchChildren4C6V_qg(m1111findBestCandidate4WY_MpI, focusTargetNode2, i, drm)) {
                return true;
            }
            mutableVector.remove(m1111findBestCandidate4WY_MpI);
        }
        return false;
    }

    private static final void collectAccessibleChildren(DelegatableNode delegatableNode, MutableVector<FocusTargetNode> mutableVector) {
        int m1935constructorimpl = NodeKind.m1935constructorimpl(1024);
        if (!delegatableNode.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, delegatableNode.getNode());
        } else {
            mutableVector2.add(child$ui_release);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & m1935constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) node;
                                if (focusTargetNode.isAttached()) {
                                    if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                                        mutableVector.add(focusTargetNode);
                                    } else {
                                        collectAccessibleChildren(focusTargetNode, mutableVector);
                                    }
                                }
                            } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.add(node);
                                                node = null;
                                            }
                                            mutableVector3.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild$ui_release();
                    }
                }
            }
        }
    }
}
