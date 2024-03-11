package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class InnerNodeCoordinator extends NodeCoordinator {
    public static final Companion Companion = new Companion(null);
    private static final Paint innerBoundsPaint;
    private LookaheadDelegate lookaheadDelegate;
    private final TailModifierNode tail;

    @Override // androidx.compose.ui.node.NodeCoordinator
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public TailModifierNode getTail() {
        return this.tail;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    protected void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    public InnerNodeCoordinator(LayoutNode layoutNode) {
        super(layoutNode);
        this.tail = new TailModifierNode();
        getTail().updateCoordinator$ui_release(this);
        this.lookaheadDelegate = layoutNode.getLookaheadRoot$ui_release() != null ? new LookaheadDelegateImpl() : null;
    }

    /* loaded from: classes.dex */
    final class LookaheadDelegateImpl extends LookaheadDelegate {
        public LookaheadDelegateImpl() {
            super(InnerNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
            int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(intValue));
            return intValue;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate
        protected void placeChildren() {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLookaheadPassDelegate$ui_release();
            C8632dsu.d(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.onNodePlaced$ui_release();
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().minLookaheadIntrinsicWidth(i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().minLookaheadIntrinsicHeight(i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().maxLookaheadIntrinsicWidth(i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().maxLookaheadIntrinsicHeight(i);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo1803measureBRTryo0(long j) {
            LookaheadDelegate.m1893access$setMeasurementConstraintsBRTryo0(this, j);
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            int size = mutableVector.getSize();
            if (size <= 0) {
                LookaheadDelegate.access$set_measureResult(this, getLayoutNode().getMeasurePolicy().mo9measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui_release(), j));
                return this;
            }
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i].getLookaheadPassDelegate$ui_release();
                C8632dsu.d(lookaheadPassDelegate$ui_release);
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                i++;
            } while (i < size);
            LookaheadDelegate.access$set_measureResult(this, getLayoutNode().getMeasurePolicy().mo9measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui_release(), j));
            return this;
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new LookaheadDelegateImpl());
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo1804placeAtf8xVGno(long j, float f, drM<? super GraphicsLayerScope, dpR> drm) {
        super.mo1804placeAtf8xVGno(j, f, drm);
        if (isShallowPlacing$ui_release()) {
            return;
        }
        onPlaced();
        getLayoutNode().getMeasurePassDelegate$ui_release().onNodePlaced$ui_release();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.calculateAlignmentLine(alignmentLine);
        }
        Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void performDraw(androidx.compose.ui.graphics.Canvas r7) {
        /*
            r6 = this;
            androidx.compose.ui.node.LayoutNode r0 = r6.getLayoutNode()
            androidx.compose.ui.node.Owner r0 = androidx.compose.ui.node.LayoutNodeKt.requireOwner(r0)
            androidx.compose.ui.node.LayoutNode r1 = r6.getLayoutNode()
            androidx.compose.runtime.collection.MutableVector r1 = r1.getZSortedChildren()
            int r2 = r1.getSize()
            if (r2 <= 0) goto L2c
            java.lang.Object[] r1 = r1.getContent()
            r3 = 0
        L1b:
            r4 = r1[r3]
            androidx.compose.ui.node.LayoutNode r4 = (androidx.compose.ui.node.LayoutNode) r4
            boolean r5 = r4.isPlaced()
            if (r5 == 0) goto L28
            r4.draw$ui_release(r7)
        L28:
            int r3 = r3 + 1
            if (r3 < r2) goto L1b
        L2c:
            boolean r0 = r0.getShowLayoutBounds()
            if (r0 == 0) goto L37
            androidx.compose.ui.graphics.Paint r0 = androidx.compose.ui.node.InnerNodeCoordinator.innerBoundsPaint
            r6.drawBorder(r7, r0)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerNodeCoordinator.performDraw(androidx.compose.ui.graphics.Canvas):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (java.lang.Float.isNaN(r1) == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /* renamed from: hitTestChild-YqVAtuI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1863hitTestChildYqVAtuI(androidx.compose.ui.node.NodeCoordinator.HitTestSource r17, long r18, androidx.compose.ui.node.HitTestResult r20, boolean r21, boolean r22) {
        /*
            r16 = this;
            r0 = r16
            r8 = r18
            androidx.compose.ui.node.LayoutNode r1 = r16.getLayoutNode()
            r10 = r17
            boolean r1 = r10.shouldHitTestChildren(r1)
            r2 = 0
            if (r1 == 0) goto L34
            boolean r1 = r0.m1930withinLayerBoundsk4lQ0M(r8)
            if (r1 == 0) goto L1a
            r2 = r22
            goto L30
        L1a:
            if (r21 == 0) goto L34
            long r3 = r16.m1923getMinimumTouchTargetSizeNHjbRc()
            float r1 = r0.m1920distanceInMinimumTouchTargettz77jQw(r8, r3)
            boolean r3 = java.lang.Float.isInfinite(r1)
            if (r3 != 0) goto L34
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L34
        L30:
            r1 = 1
            r11 = r2
            r2 = r1
            goto L36
        L34:
            r11 = r22
        L36:
            if (r2 == 0) goto L86
            int r12 = androidx.compose.ui.node.HitTestResult.access$getHitDepth$p(r20)
            androidx.compose.ui.node.LayoutNode r1 = r16.getLayoutNode()
            androidx.compose.runtime.collection.MutableVector r1 = r1.getZSortedChildren()
            int r2 = r1.getSize()
            if (r2 <= 0) goto L81
            java.lang.Object[] r13 = r1.getContent()
            int r2 = r2 + (-1)
            r14 = r2
        L51:
            r1 = r13[r14]
            r15 = r1
            androidx.compose.ui.node.LayoutNode r15 = (androidx.compose.ui.node.LayoutNode) r15
            boolean r1 = r15.isPlaced()
            if (r1 == 0) goto L7d
            r1 = r17
            r2 = r15
            r3 = r18
            r5 = r20
            r6 = r21
            r7 = r11
            r1.mo1931childHitTestYqVAtuI(r2, r3, r5, r6, r7)
            boolean r1 = r20.hasHit()
            if (r1 != 0) goto L70
            goto L7d
        L70:
            androidx.compose.ui.node.NodeCoordinator r1 = r15.getOuterCoordinator$ui_release()
            boolean r1 = r1.shouldSharePointerInputWithSiblings()
            if (r1 == 0) goto L81
            r20.acceptHits()
        L7d:
            int r14 = r14 + (-1)
            if (r14 >= 0) goto L51
        L81:
            r1 = r20
            androidx.compose.ui.node.HitTestResult.access$setHitDepth$p(r1, r12)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerNodeCoordinator.mo1863hitTestChildYqVAtuI(androidx.compose.ui.node.NodeCoordinator$HitTestSource, long, androidx.compose.ui.node.HitTestResult, boolean, boolean):void");
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo1208setColor8_81llA(Color.Companion.m1307getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo1212setStylek9PVt8s(PaintingStyle.Companion.m1397getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    public Placeable mo1803measureBRTryo0(long j) {
        m1826setMeasurementConstraintsBRTryo0(j);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        int size = mutableVector.getSize();
        if (size <= 0) {
            setMeasureResult$ui_release(getLayoutNode().getMeasurePolicy().mo9measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui_release(), j));
            onMeasured();
            return this;
        }
        LayoutNode[] content = mutableVector.getContent();
        int i = 0;
        do {
            content[i].getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
            i++;
        } while (i < size);
        setMeasureResult$ui_release(getLayoutNode().getMeasurePolicy().mo9measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui_release(), j));
        onMeasured();
        return this;
    }
}
