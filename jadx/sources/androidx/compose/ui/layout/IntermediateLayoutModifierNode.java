package androidx.compose.ui.layout;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.netflix.model.leafs.ArtworkColors;
import java.util.Map;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.dpR;
import o.dqZ;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class IntermediateLayoutModifierNode extends Modifier.Node implements LayoutModifierNode {
    private LookaheadScope closestLookaheadScope;
    private IntermediateMeasurablePlaceable intermediateMeasurable;
    private final IntermediateMeasureScopeImpl intermediateMeasureScope;
    private boolean isIntermediateChangeActive;
    private final LookaheadScopeImpl localLookaheadScope;
    private Constraints lookaheadConstraints;
    private InterfaceC8612dsa<? super IntermediateMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measureBlock;

    public final InterfaceC8612dsa<IntermediateMeasureScope, Measurable, Constraints, MeasureResult> getMeasureBlock$ui_release() {
        return this.measureBlock;
    }

    public final boolean isIntermediateChangeActive() {
        return this.isIntermediateChangeActive;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        LookaheadScopeImpl lookaheadScopeImpl;
        NodeChain nodes$ui_release;
        LookaheadDelegate lookaheadDelegate;
        NodeCoordinator coordinator$ui_release = getCoordinator$ui_release();
        if (((coordinator$ui_release == null || (lookaheadDelegate = coordinator$ui_release.getLookaheadDelegate()) == null) ? null : lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) {
            throw new IllegalStateException("could not fetch lookahead coordinates".toString());
        }
        final LayoutNode lookaheadRoot$ui_release = DelegatableNodeKt.requireLayoutNode(this).getLookaheadRoot$ui_release();
        if (lookaheadRoot$ui_release != null && lookaheadRoot$ui_release.isVirtualLookaheadRoot$ui_release()) {
            lookaheadScopeImpl = new LookaheadScopeImpl(new drO<LayoutCoordinates>() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$onAttach$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // o.drO
                public final LayoutCoordinates invoke() {
                    LayoutNode parent$ui_release = LayoutNode.this.getParent$ui_release();
                    C8632dsu.d(parent$ui_release);
                    return parent$ui_release.getInnerCoordinator$ui_release().getCoordinates();
                }
            });
        } else {
            int m1935constructorimpl = NodeKind.m1935constructorimpl(512);
            if (!getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent$ui_release = getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
            IntermediateLayoutModifierNode intermediateLayoutModifierNode = null;
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m1935constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            Modifier.Node node = parent$ui_release;
                            while (node != null) {
                                if (node instanceof IntermediateLayoutModifierNode) {
                                    intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) node;
                                } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                    int i = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                node = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    mutableVector.add(node);
                                                    node = null;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                node = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            if (intermediateLayoutModifierNode == null || (lookaheadScopeImpl = intermediateLayoutModifierNode.localLookaheadScope) == null) {
                lookaheadScopeImpl = this.localLookaheadScope;
            }
        }
        this.closestLookaheadScope = lookaheadScopeImpl;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo1803measureBRTryo0.getWidth(), mo1803measureBRTryo0.getHeight(), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$measure$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* renamed from: intermediateMeasure-Te-uZzU  reason: not valid java name */
    public final MeasureResult m1805intermediateMeasureTeuZzU(MeasureScope measureScope, Measurable measurable, long j, long j2, long j3) {
        this.intermediateMeasureScope.m1807setLookaheadSizeozmzZPI(j2);
        this.lookaheadConstraints = Constraints.m2461boximpl(j3);
        IntermediateMeasurablePlaceable intermediateMeasurablePlaceable = this.intermediateMeasurable;
        if (intermediateMeasurablePlaceable == null) {
            intermediateMeasurablePlaceable = new IntermediateMeasurablePlaceable(measurable);
        }
        this.intermediateMeasurable = intermediateMeasurablePlaceable;
        intermediateMeasurablePlaceable.setWrappedMeasurable(measurable);
        return this.measureBlock.invoke(this.intermediateMeasureScope, intermediateMeasurablePlaceable, Constraints.m2461boximpl(j));
    }

    public final int minIntermediateIntrinsicWidth$ui_release(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$minIntermediateIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo1808measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                return IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(IntermediateLayoutModifierNode.this.intermediateMeasureScope, measurable, Constraints.m2461boximpl(j));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    public final int minIntermediateIntrinsicHeight$ui_release(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$minIntermediateIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo1808measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                return IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(IntermediateLayoutModifierNode.this.intermediateMeasureScope, measurable, Constraints.m2461boximpl(j));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    public final int maxIntermediateIntrinsicWidth$ui_release(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$maxIntermediateIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo1808measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                return IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(IntermediateLayoutModifierNode.this.intermediateMeasureScope, measurable, Constraints.m2461boximpl(j));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    public final int maxIntermediateIntrinsicHeight$ui_release(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$maxIntermediateIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s  reason: not valid java name */
            public final MeasureResult mo1808measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                return IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(IntermediateLayoutModifierNode.this.intermediateMeasureScope, measurable, Constraints.m2461boximpl(j));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class IntermediateMeasurablePlaceable extends Placeable implements Measurable {
        private Measurable wrappedMeasurable;
        private Placeable wrappedPlaceable;

        public final void setWrappedMeasurable(Measurable measurable) {
            this.wrappedMeasurable = measurable;
        }

        public IntermediateMeasurablePlaceable(Measurable measurable) {
            this.wrappedMeasurable = measurable;
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo1803measureBRTryo0(long j) {
            Placeable mo1803measureBRTryo0;
            long m1806getLookaheadSizeYbymL2g;
            if (!IntermediateLayoutModifierNode.this.isIntermediateChangeActive()) {
                Measurable measurable = this.wrappedMeasurable;
                Constraints constraints = IntermediateLayoutModifierNode.this.lookaheadConstraints;
                C8632dsu.d(constraints);
                mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(constraints.m2478unboximpl());
                IntermediateLayoutModifierNode intermediateLayoutModifierNode = IntermediateLayoutModifierNode.this;
                Constraints constraints2 = intermediateLayoutModifierNode.lookaheadConstraints;
                C8632dsu.d(constraints2);
                m1826setMeasurementConstraintsBRTryo0(constraints2.m2478unboximpl());
                if (!intermediateLayoutModifierNode.isIntermediateChangeActive()) {
                    m1806getLookaheadSizeYbymL2g = intermediateLayoutModifierNode.intermediateMeasureScope.m1806getLookaheadSizeYbymL2g();
                } else {
                    m1806getLookaheadSizeYbymL2g = IntSizeKt.IntSize(mo1803measureBRTryo0.getWidth(), mo1803measureBRTryo0.getHeight());
                }
                m1825setMeasuredSizeozmzZPI(m1806getLookaheadSizeYbymL2g);
            } else {
                mo1803measureBRTryo0 = this.wrappedMeasurable.mo1803measureBRTryo0(j);
                m1826setMeasurementConstraintsBRTryo0(j);
                m1825setMeasuredSizeozmzZPI(IntSizeKt.IntSize(mo1803measureBRTryo0.getWidth(), mo1803measureBRTryo0.getHeight()));
            }
            this.wrappedPlaceable = mo1803measureBRTryo0;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo1804placeAtf8xVGno(long j, float f, drM<? super GraphicsLayerScope, dpR> drm) {
            dpR dpr;
            if (!IntermediateLayoutModifierNode.this.isIntermediateChangeActive()) {
                j = IntOffset.Companion.m2538getZeronOccac();
            }
            NodeCoordinator coordinator$ui_release = IntermediateLayoutModifierNode.this.getNode().getCoordinator$ui_release();
            C8632dsu.d(coordinator$ui_release);
            Placeable.PlacementScope placementScope = coordinator$ui_release.getPlacementScope();
            if (drm != null) {
                Placeable placeable = this.wrappedPlaceable;
                if (placeable != null) {
                    placementScope.m1834placeWithLayeraW9wM(placeable, j, f, drm);
                    dpr = dpR.c;
                } else {
                    dpr = null;
                }
                if (dpr != null) {
                    return;
                }
            }
            Placeable placeable2 = this.wrappedPlaceable;
            if (placeable2 != null) {
                placementScope.m1831place70tqf50(placeable2, j, f);
                dpR dpr2 = dpR.c;
            }
        }

        @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        public Object getParentData() {
            return this.wrappedMeasurable.getParentData();
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(AlignmentLine alignmentLine) {
            Placeable placeable = this.wrappedPlaceable;
            C8632dsu.d(placeable);
            return placeable.get(alignmentLine);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i) {
            return this.wrappedMeasurable.minIntrinsicWidth(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i) {
            return this.wrappedMeasurable.maxIntrinsicWidth(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i) {
            return this.wrappedMeasurable.minIntrinsicHeight(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i) {
            return this.wrappedMeasurable.maxIntrinsicHeight(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class IntermediateMeasureScopeImpl implements IntermediateMeasureScope {
        private long lookaheadSize;
        final /* synthetic */ IntermediateLayoutModifierNode this$0;

        /* renamed from: getLookaheadSize-YbymL2g  reason: not valid java name */
        public long m1806getLookaheadSizeYbymL2g() {
            return this.lookaheadSize;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return false;
        }

        /* renamed from: setLookaheadSize-ozmzZPI  reason: not valid java name */
        public void m1807setLookaheadSizeozmzZPI(long j) {
            this.lookaheadSize = j;
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(final int i, final int i2, final Map<AlignmentLine, Integer> map, final drM<? super Placeable.PlacementScope, dpR> drm) {
            if ((i & ArtworkColors.DEFAULT_BACKGROUND_COLOR) == 0 && ((-16777216) & i2) == 0) {
                final IntermediateLayoutModifierNode intermediateLayoutModifierNode = this.this$0;
                return new MeasureResult(i, i2, map, drm, intermediateLayoutModifierNode) { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl$layout$1
                    final /* synthetic */ drM<Placeable.PlacementScope, dpR> $placementBlock;
                    private final Map<AlignmentLine, Integer> alignmentLines;
                    private final int height;
                    final /* synthetic */ IntermediateLayoutModifierNode this$0;
                    private final int width;

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return this.alignmentLines;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return this.height;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return this.width;
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.$placementBlock = drm;
                        this.this$0 = intermediateLayoutModifierNode;
                        this.width = i;
                        this.height = i2;
                        this.alignmentLines = map;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        drM<Placeable.PlacementScope, dpR> drm2 = this.$placementBlock;
                        NodeCoordinator coordinator$ui_release = this.this$0.getCoordinator$ui_release();
                        C8632dsu.d(coordinator$ui_release);
                        drm2.invoke(coordinator$ui_release.getPlacementScope());
                    }
                };
            }
            throw new IllegalStateException(("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            NodeCoordinator coordinator$ui_release = this.this$0.getCoordinator$ui_release();
            C8632dsu.d(coordinator$ui_release);
            return coordinator$ui_release.getLayoutDirection();
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            NodeCoordinator coordinator$ui_release = this.this$0.getCoordinator$ui_release();
            C8632dsu.d(coordinator$ui_release);
            return coordinator$ui_release.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            NodeCoordinator coordinator$ui_release = this.this$0.getCoordinator$ui_release();
            C8632dsu.d(coordinator$ui_release);
            return coordinator$ui_release.getFontScale();
        }

        @Override // o.dwU
        public dqZ getCoroutineContext() {
            return this.this$0.getCoroutineScope().getCoroutineContext();
        }
    }
}
