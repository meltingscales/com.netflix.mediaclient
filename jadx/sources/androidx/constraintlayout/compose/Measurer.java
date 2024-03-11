package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.dpB;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public class Measurer implements BasicMeasure.Measurer, DesignInfoProvider {
    private String computedLayoutResult = "";
    protected Density density;
    private ArrayList<Object> designElements;
    private float forcedScaleFactor;
    private final Map<Measurable, WidgetFrame> frameCache;
    private final int[] heightConstraintsHolder;
    private final Map<Measurable, Integer[]> lastMeasures;
    private int layoutCurrentHeight;
    private int layoutCurrentWidth;
    private LayoutInformationReceiver layoutInformationReceiver;
    protected MeasureScope measureScope;
    private final Map<Measurable, Placeable> placeables;
    private final ConstraintWidgetContainer root;
    private final InterfaceC8554dpx state$delegate;
    private final int[] widthConstraintsHolder;

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            iArr[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    public void didMeasures() {
    }

    protected final Map<Measurable, WidgetFrame> getFrameCache() {
        return this.frameCache;
    }

    protected final Map<Measurable, Placeable> getPlaceables() {
        return this.placeables;
    }

    protected final void setDensity(Density density) {
        C8632dsu.c((Object) density, "");
        this.density = density;
    }

    protected final void setMeasureScope(MeasureScope measureScope) {
        C8632dsu.c((Object) measureScope, "");
        this.measureScope = measureScope;
    }

    public Measurer() {
        InterfaceC8554dpx b;
        ConstraintWidgetContainer constraintWidgetContainer = new ConstraintWidgetContainer(0, 0);
        constraintWidgetContainer.setMeasurer(this);
        dpR dpr = dpR.c;
        this.root = constraintWidgetContainer;
        this.placeables = new LinkedHashMap();
        this.lastMeasures = new LinkedHashMap();
        this.frameCache = new LinkedHashMap();
        b = dpB.b(LazyThreadSafetyMode.e, new drO<State>() { // from class: androidx.constraintlayout.compose.Measurer$state$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final State invoke() {
                return new State(Measurer.this.getDensity());
            }
        });
        this.state$delegate = b;
        this.widthConstraintsHolder = new int[2];
        this.heightConstraintsHolder = new int[2];
        this.forcedScaleFactor = Float.NaN;
        this.designElements = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Density getDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        C8632dsu.d("");
        throw null;
    }

    protected final State getState() {
        return (State) this.state$delegate.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0103, code lost:
        if (r21.mMatchConstraintDefaultHeight == 0) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object] */
    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void measure(androidx.constraintlayout.core.widgets.ConstraintWidget r21, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure r22) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.Measurer.measure(androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure):void");
    }

    public void computeLayoutResult() {
        ConstraintWidget constraintWidget;
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        sb.append("  root: {");
        sb.append("interpolated: { left:  0,");
        sb.append("  top:  0,");
        sb.append("  right:   " + this.root.getWidth() + " ,");
        sb.append("  bottom:  " + this.root.getHeight() + " ,");
        sb.append(" } }");
        Iterator<ConstraintWidget> it = this.root.getChildren().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            Object companionWidget = next.getCompanionWidget();
            if (!(companionWidget instanceof Measurable)) {
                if (next instanceof Guideline) {
                    sb.append(' ' + ((Object) next.stringId) + ": {");
                    Guideline guideline = (Guideline) next;
                    if (guideline.getOrientation() == 0) {
                        sb.append(" type: 'hGuideline', ");
                    } else {
                        sb.append(" type: 'vGuideline', ");
                    }
                    sb.append(" interpolated: ");
                    sb.append(" { left: " + guideline.getX() + ", top: " + guideline.getY() + ", right: " + (guideline.getX() + guideline.getWidth()) + ", bottom: " + (guideline.getY() + guideline.getHeight()) + " }");
                    sb.append("}, ");
                }
            } else {
                WidgetFrame widgetFrame = null;
                if (next.stringId == null) {
                    Measurable measurable = (Measurable) companionWidget;
                    Object layoutId = LayoutIdKt.getLayoutId(measurable);
                    if (layoutId == null) {
                        layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable);
                    }
                    next.stringId = layoutId == null ? null : layoutId.toString();
                }
                WidgetFrame widgetFrame2 = this.frameCache.get(companionWidget);
                if (widgetFrame2 != null && (constraintWidget = widgetFrame2.widget) != null) {
                    widgetFrame = constraintWidget.frame;
                }
                if (widgetFrame != null) {
                    sb.append(' ' + ((Object) next.stringId) + ": {");
                    sb.append(" interpolated : ");
                    widgetFrame.serialize(sb, true);
                    sb.append("}, ");
                }
            }
        }
        sb.append(" }");
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        this.computedLayoutResult = sb2;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver == null) {
            return;
        }
        layoutInformationReceiver.setLayoutInformation(sb2);
    }

    private final boolean obtainConstraints(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, int i2, int i3, boolean z, boolean z2, int i4, int[] iArr) {
        boolean z3;
        boolean z4;
        int i5 = WhenMappings.$EnumSwitchMapping$0[dimensionBehaviour.ordinal()];
        if (i5 == 1) {
            iArr[0] = i;
            iArr[1] = i;
            return false;
        }
        if (i5 == 2) {
            iArr[0] = 0;
            iArr[1] = i4;
        } else if (i5 != 3) {
            if (i5 == 4) {
                iArr[0] = i4;
                iArr[1] = i4;
                return false;
            }
            throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
        } else {
            z3 = ConstraintLayoutKt.DEBUG;
            if (z3) {
                Log.d("CCL", C8632dsu.d("Measure strategy ", Integer.valueOf(i3)));
                Log.d("CCL", C8632dsu.d("DW ", Integer.valueOf(i2)));
                Log.d("CCL", C8632dsu.d("ODR ", Boolean.valueOf(z)));
                Log.d("CCL", C8632dsu.d("IRH ", Boolean.valueOf(z2)));
            }
            boolean z5 = z2 || ((i3 == BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || i3 == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) && (i3 == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS || i2 != 1 || z));
            z4 = ConstraintLayoutKt.DEBUG;
            if (z4) {
                Log.d("CCL", C8632dsu.d("UD ", Boolean.valueOf(z5)));
            }
            iArr[0] = z5 ? i : 0;
            if (!z5) {
                i = i4;
            }
            iArr[1] = i;
            if (z5) {
                return false;
            }
        }
        return true;
    }

    private final void copyFrom(Integer[] numArr, BasicMeasure.Measure measure) {
        numArr[0] = Integer.valueOf(measure.measuredWidth);
        numArr[1] = Integer.valueOf(measure.measuredHeight);
        numArr[2] = Integer.valueOf(measure.measuredBaseline);
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* renamed from: performMeasure-DjhGOtQ  reason: not valid java name */
    public final long m2609performMeasureDjhGOtQ(long j, LayoutDirection layoutDirection, ConstraintSet constraintSet, List<? extends Measurable> list, int i, MeasureScope measureScope) {
        androidx.constraintlayout.core.state.Dimension min;
        androidx.constraintlayout.core.state.Dimension min2;
        boolean z;
        boolean z2;
        boolean z3;
        String debugString;
        String debugString2;
        String str;
        C8632dsu.c((Object) layoutDirection, "");
        C8632dsu.c((Object) constraintSet, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) measureScope, "");
        setDensity(measureScope);
        setMeasureScope(measureScope);
        State state = getState();
        if (Constraints.m2471getHasFixedWidthimpl(j)) {
            min = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2473getMaxWidthimpl(j));
        } else {
            min = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2475getMinWidthimpl(j));
        }
        state.width(min);
        State state2 = getState();
        if (Constraints.m2470getHasFixedHeightimpl(j)) {
            min2 = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2472getMaxHeightimpl(j));
        } else {
            min2 = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2474getMinHeightimpl(j));
        }
        state2.height(min2);
        getState().m2611setRootIncomingConstraintsBRTryo0(j);
        getState().setLayoutDirection(layoutDirection);
        resetMeasureState$compose_release();
        if (constraintSet.isDirty(list)) {
            getState().reset();
            constraintSet.applyTo(getState(), list);
            ConstraintLayoutKt.buildMapping(getState(), list);
            getState().apply(this.root);
        } else {
            ConstraintLayoutKt.buildMapping(getState(), list);
        }
        m2608applyRootSizeBRTryo0(j);
        this.root.updateHierarchy();
        z = ConstraintLayoutKt.DEBUG;
        if (z) {
            this.root.setDebugName("ConstraintLayout");
            ArrayList<ConstraintWidget> children = this.root.getChildren();
            C8632dsu.a(children, "");
            for (ConstraintWidget constraintWidget : children) {
                Object companionWidget = constraintWidget.getCompanionWidget();
                Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
                Object layoutId = measurable == null ? null : LayoutIdKt.getLayoutId(measurable);
                if (layoutId == null || (str = layoutId.toString()) == null) {
                    str = "NOTAG";
                }
                constraintWidget.setDebugName(str);
            }
            Log.d("CCL", C8632dsu.d("ConstraintLayout is asked to measure with ", (Object) Constraints.m2477toStringimpl(j)));
            debugString = ConstraintLayoutKt.toDebugString(this.root);
            Log.d("CCL", debugString);
            Iterator<ConstraintWidget> it = this.root.getChildren().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                C8632dsu.a(next, "");
                debugString2 = ConstraintLayoutKt.toDebugString(next);
                Log.d("CCL", debugString2);
            }
        }
        this.root.setOptimizationLevel(i);
        ConstraintWidgetContainer constraintWidgetContainer = this.root;
        constraintWidgetContainer.measure(constraintWidgetContainer.getOptimizationLevel(), 0, 0, 0, 0, 0, 0, 0, 0);
        Iterator<ConstraintWidget> it2 = this.root.getChildren().iterator();
        while (it2.hasNext()) {
            ConstraintWidget next2 = it2.next();
            ?? companionWidget2 = next2.getCompanionWidget();
            if (companionWidget2 instanceof Measurable) {
                Placeable placeable = this.placeables.get(companionWidget2);
                Integer valueOf = placeable == null ? null : Integer.valueOf(placeable.getWidth());
                Integer valueOf2 = placeable == null ? null : Integer.valueOf(placeable.getHeight());
                int width = next2.getWidth();
                if (valueOf != null && width == valueOf.intValue()) {
                    int height = next2.getHeight();
                    if (valueOf2 != null && height == valueOf2.intValue()) {
                    }
                }
                z3 = ConstraintLayoutKt.DEBUG;
                if (z3) {
                    Log.d("CCL", "Final measurement for " + LayoutIdKt.getLayoutId((Measurable) companionWidget2) + " to confirm size " + next2.getWidth() + ' ' + next2.getHeight());
                }
                getPlaceables().put(companionWidget2, ((Measurable) companionWidget2).mo1803measureBRTryo0(Constraints.Companion.m2480fixedJhjzzOo(next2.getWidth(), next2.getHeight())));
            }
        }
        z2 = ConstraintLayoutKt.DEBUG;
        if (z2) {
            Log.d("CCL", "ConstraintLayout is at the end " + this.root.getWidth() + ' ' + this.root.getHeight());
        }
        return IntSizeKt.IntSize(this.root.getWidth(), this.root.getHeight());
    }

    public final void resetMeasureState$compose_release() {
        this.placeables.clear();
        this.lastMeasures.clear();
        this.frameCache.clear();
    }

    /* renamed from: applyRootSize-BRTryo0  reason: not valid java name */
    protected final void m2608applyRootSizeBRTryo0(long j) {
        this.root.setWidth(Constraints.m2473getMaxWidthimpl(j));
        this.root.setHeight(Constraints.m2472getMaxHeightimpl(j));
        this.forcedScaleFactor = Float.NaN;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null) {
            Integer valueOf = layoutInformationReceiver == null ? null : Integer.valueOf(layoutInformationReceiver.getForcedWidth());
            if (valueOf == null || valueOf.intValue() != Integer.MIN_VALUE) {
                LayoutInformationReceiver layoutInformationReceiver2 = this.layoutInformationReceiver;
                C8632dsu.d(layoutInformationReceiver2);
                int forcedWidth = layoutInformationReceiver2.getForcedWidth();
                if (forcedWidth > this.root.getWidth()) {
                    this.forcedScaleFactor = this.root.getWidth() / forcedWidth;
                } else {
                    this.forcedScaleFactor = 1.0f;
                }
                this.root.setWidth(forcedWidth);
            }
        }
        LayoutInformationReceiver layoutInformationReceiver3 = this.layoutInformationReceiver;
        if (layoutInformationReceiver3 != null) {
            Integer valueOf2 = layoutInformationReceiver3 != null ? Integer.valueOf(layoutInformationReceiver3.getForcedHeight()) : null;
            if (valueOf2 == null || valueOf2.intValue() != Integer.MIN_VALUE) {
                LayoutInformationReceiver layoutInformationReceiver4 = this.layoutInformationReceiver;
                C8632dsu.d(layoutInformationReceiver4);
                int forcedHeight = layoutInformationReceiver4.getForcedHeight();
                if (Float.isNaN(this.forcedScaleFactor)) {
                    this.forcedScaleFactor = 1.0f;
                }
                float height = forcedHeight > this.root.getHeight() ? this.root.getHeight() / forcedHeight : 1.0f;
                if (height < this.forcedScaleFactor) {
                    this.forcedScaleFactor = height;
                }
                this.root.setHeight(forcedHeight);
            }
        }
        this.layoutCurrentWidth = this.root.getWidth();
        this.layoutCurrentHeight = this.root.getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void performLayout(Placeable.PlacementScope placementScope, List<? extends Measurable> list) {
        C8632dsu.c((Object) placementScope, "");
        C8632dsu.c((Object) list, "");
        if (this.frameCache.isEmpty()) {
            Iterator<ConstraintWidget> it = this.root.getChildren().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                Object companionWidget = next.getCompanionWidget();
                if (companionWidget instanceof Measurable) {
                    this.frameCache.put(companionWidget, new WidgetFrame(next.frame.update()));
                }
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Measurable measurable = list.get(i);
                final WidgetFrame widgetFrame = getFrameCache().get(measurable);
                if (widgetFrame == null) {
                    return;
                }
                if (widgetFrame.isDefaultTransform()) {
                    WidgetFrame widgetFrame2 = getFrameCache().get(measurable);
                    C8632dsu.d(widgetFrame2);
                    int i3 = widgetFrame2.left;
                    WidgetFrame widgetFrame3 = getFrameCache().get(measurable);
                    C8632dsu.d(widgetFrame3);
                    int i4 = widgetFrame3.top;
                    Placeable placeable = getPlaceables().get(measurable);
                    if (placeable != null) {
                        Placeable.PlacementScope.m1827place70tqf50$default(placementScope, placeable, IntOffsetKt.IntOffset(i3, i4), 0.0f, 2, null);
                    }
                } else {
                    drM<GraphicsLayerScope, dpR> drm = new drM<GraphicsLayerScope, dpR>() { // from class: androidx.constraintlayout.compose.Measurer$performLayout$1$layerBlock$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* bridge */ /* synthetic */ dpR invoke(GraphicsLayerScope graphicsLayerScope) {
                            invoke2(graphicsLayerScope);
                            return dpR.c;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                            C8632dsu.c((Object) graphicsLayerScope, "");
                            if (!Float.isNaN(WidgetFrame.this.pivotX) || !Float.isNaN(WidgetFrame.this.pivotY)) {
                                graphicsLayerScope.mo1353setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(Float.isNaN(WidgetFrame.this.pivotX) ? 0.5f : WidgetFrame.this.pivotX, Float.isNaN(WidgetFrame.this.pivotY) ? 0.5f : WidgetFrame.this.pivotY));
                            }
                            if (!Float.isNaN(WidgetFrame.this.rotationX)) {
                                graphicsLayerScope.setRotationX(WidgetFrame.this.rotationX);
                            }
                            if (!Float.isNaN(WidgetFrame.this.rotationY)) {
                                graphicsLayerScope.setRotationY(WidgetFrame.this.rotationY);
                            }
                            if (!Float.isNaN(WidgetFrame.this.rotationZ)) {
                                graphicsLayerScope.setRotationZ(WidgetFrame.this.rotationZ);
                            }
                            if (!Float.isNaN(WidgetFrame.this.translationX)) {
                                graphicsLayerScope.setTranslationX(WidgetFrame.this.translationX);
                            }
                            if (!Float.isNaN(WidgetFrame.this.translationY)) {
                                graphicsLayerScope.setTranslationY(WidgetFrame.this.translationY);
                            }
                            if (!Float.isNaN(WidgetFrame.this.translationZ)) {
                                graphicsLayerScope.setShadowElevation(WidgetFrame.this.translationZ);
                            }
                            if (!Float.isNaN(WidgetFrame.this.scaleX) || !Float.isNaN(WidgetFrame.this.scaleY)) {
                                graphicsLayerScope.setScaleX(Float.isNaN(WidgetFrame.this.scaleX) ? 1.0f : WidgetFrame.this.scaleX);
                                graphicsLayerScope.setScaleY(Float.isNaN(WidgetFrame.this.scaleY) ? 1.0f : WidgetFrame.this.scaleY);
                            }
                            if (Float.isNaN(WidgetFrame.this.alpha)) {
                                return;
                            }
                            graphicsLayerScope.setAlpha(WidgetFrame.this.alpha);
                        }
                    };
                    WidgetFrame widgetFrame4 = getFrameCache().get(measurable);
                    C8632dsu.d(widgetFrame4);
                    int i5 = widgetFrame4.left;
                    WidgetFrame widgetFrame5 = getFrameCache().get(measurable);
                    C8632dsu.d(widgetFrame5);
                    int i6 = widgetFrame5.top;
                    float f = Float.isNaN(widgetFrame.translationZ) ? 0.0f : widgetFrame.translationZ;
                    Placeable placeable2 = getPlaceables().get(measurable);
                    if (placeable2 != null) {
                        placementScope.placeWithLayer(placeable2, i5, i6, f, drm);
                    }
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if ((layoutInformationReceiver == null ? null : layoutInformationReceiver.getLayoutInformationMode()) == LayoutInfoFlags.BOUNDS) {
            computeLayoutResult();
        }
    }
}
