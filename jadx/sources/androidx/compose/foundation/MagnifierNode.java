package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import o.C8627dsp;
import o.C8632dsu;
import o.C8737dwr;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class MagnifierNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, DrawModifierNode, SemanticsModifierNode, ObserverModifierNode {
    private final MutableState anchorPositionInRoot$delegate;
    private boolean clippingEnabled;
    private float cornerRadius;
    private Density density;
    private float elevation;
    private PlatformMagnifier magnifier;
    private drM<? super Density, Offset> magnifierCenter;
    private drM<? super DpSize, dpR> onSizeChanged;
    private PlatformMagnifierFactory platformMagnifierFactory;
    private IntSize previousSize;
    private long size;
    private drM<? super Density, Offset> sourceCenter;
    private long sourceCenterInRoot;
    private boolean useTextDefault;
    private View view;
    private float zoom;

    public /* synthetic */ MagnifierNode(drM drm, drM drm2, drM drm3, float f, boolean z, long j, float f2, float f3, boolean z2, PlatformMagnifierFactory platformMagnifierFactory, C8627dsp c8627dsp) {
        this(drm, drm2, drm3, f, z, j, f2, f3, z2, platformMagnifierFactory);
    }

    private MagnifierNode(drM<? super Density, Offset> drm, drM<? super Density, Offset> drm2, drM<? super DpSize, dpR> drm3, float f, boolean z, long j, float f2, float f3, boolean z2, PlatformMagnifierFactory platformMagnifierFactory) {
        MutableState mutableStateOf$default;
        this.sourceCenter = drm;
        this.magnifierCenter = drm2;
        this.onSizeChanged = drm3;
        this.zoom = f;
        this.useTextDefault = z;
        this.size = j;
        this.cornerRadius = f2;
        this.elevation = f3;
        this.clippingEnabled = z2;
        this.platformMagnifierFactory = platformMagnifierFactory;
        Offset.Companion companion = Offset.Companion;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m1126boximpl(companion.m1148getUnspecifiedF1C5BW0()), null, 2, null);
        this.anchorPositionInRoot$delegate = mutableStateOf$default;
        this.sourceCenterInRoot = companion.m1148getUnspecifiedF1C5BW0();
    }

    /* renamed from: setAnchorPositionInRoot-k-4lQ0M  reason: not valid java name */
    private final void m142setAnchorPositionInRootk4lQ0M(long j) {
        this.anchorPositionInRoot$delegate.setValue(Offset.m1126boximpl(j));
    }

    /* renamed from: update-5F03MCQ  reason: not valid java name */
    public final void m143update5F03MCQ(drM<? super Density, Offset> drm, drM<? super Density, Offset> drm2, float f, boolean z, long j, float f2, float f3, boolean z2, drM<? super DpSize, dpR> drm3, PlatformMagnifierFactory platformMagnifierFactory) {
        float f4 = this.zoom;
        long j2 = this.size;
        float f5 = this.cornerRadius;
        float f6 = this.elevation;
        boolean z3 = this.clippingEnabled;
        PlatformMagnifierFactory platformMagnifierFactory2 = this.platformMagnifierFactory;
        this.sourceCenter = drm;
        this.magnifierCenter = drm2;
        this.zoom = f;
        this.useTextDefault = z;
        this.size = j;
        this.cornerRadius = f2;
        this.elevation = f3;
        this.clippingEnabled = z2;
        this.onSizeChanged = drm3;
        this.platformMagnifierFactory = platformMagnifierFactory;
        if (this.magnifier == null || ((f != f4 && !platformMagnifierFactory.getCanUpdateZoom()) || !DpSize.m2517equalsimpl0(j, j2) || !Dp.m2494equalsimpl0(f2, f5) || !Dp.m2494equalsimpl0(f3, f6) || z2 != z3 || !C8632dsu.c(platformMagnifierFactory, platformMagnifierFactory2))) {
            recreateMagnifier();
        }
        updateMagnifier();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        this.magnifier = null;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new drO<dpR>() { // from class: androidx.compose.foundation.MagnifierNode$onObservedReadsChanged$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                View view;
                Density density;
                PlatformMagnifier platformMagnifier;
                view = MagnifierNode.this.view;
                View view2 = (View) CompositionLocalConsumerModifierNodeKt.currentValueOf(MagnifierNode.this, AndroidCompositionLocals_androidKt.getLocalView());
                MagnifierNode.this.view = view2;
                density = MagnifierNode.this.density;
                Density density2 = (Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(MagnifierNode.this, CompositionLocalsKt.getLocalDensity());
                MagnifierNode.this.density = density2;
                platformMagnifier = MagnifierNode.this.magnifier;
                if (platformMagnifier == null || !C8632dsu.c(view2, view) || !C8632dsu.c(density2, density)) {
                    MagnifierNode.this.recreateMagnifier();
                }
                MagnifierNode.this.updateMagnifier();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recreateMagnifier() {
        Density density;
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        View view = this.view;
        if (view == null || (density = this.density) == null) {
            return;
        }
        this.magnifier = this.platformMagnifierFactory.mo150createnHHXs2Y(view, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, density, this.zoom);
        updateSizeIfNecessary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMagnifier() {
        Density density;
        long m1148getUnspecifiedF1C5BW0;
        long m1148getUnspecifiedF1C5BW02;
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier == null || (density = this.density) == null) {
            return;
        }
        long m1146unboximpl = this.sourceCenter.invoke(density).m1146unboximpl();
        if (OffsetKt.m1151isSpecifiedk4lQ0M(m141getAnchorPositionInRootF1C5BW0()) && OffsetKt.m1151isSpecifiedk4lQ0M(m1146unboximpl)) {
            m1148getUnspecifiedF1C5BW0 = Offset.m1142plusMKHz9U(m141getAnchorPositionInRootF1C5BW0(), m1146unboximpl);
        } else {
            m1148getUnspecifiedF1C5BW0 = Offset.Companion.m1148getUnspecifiedF1C5BW0();
        }
        this.sourceCenterInRoot = m1148getUnspecifiedF1C5BW0;
        if (OffsetKt.m1151isSpecifiedk4lQ0M(m1148getUnspecifiedF1C5BW0)) {
            drM<? super Density, Offset> drm = this.magnifierCenter;
            if (drm != null) {
                Offset m1126boximpl = Offset.m1126boximpl(drm.invoke(density).m1146unboximpl());
                if (!OffsetKt.m1151isSpecifiedk4lQ0M(m1126boximpl.m1146unboximpl())) {
                    m1126boximpl = null;
                }
                if (m1126boximpl != null) {
                    m1148getUnspecifiedF1C5BW02 = Offset.m1142plusMKHz9U(m141getAnchorPositionInRootF1C5BW0(), m1126boximpl.m1146unboximpl());
                    platformMagnifier.mo149updateWko1d7g(this.sourceCenterInRoot, m1148getUnspecifiedF1C5BW02, this.zoom);
                    updateSizeIfNecessary();
                    return;
                }
            }
            m1148getUnspecifiedF1C5BW02 = Offset.Companion.m1148getUnspecifiedF1C5BW0();
            platformMagnifier.mo149updateWko1d7g(this.sourceCenterInRoot, m1148getUnspecifiedF1C5BW02, this.zoom);
            updateSizeIfNecessary();
            return;
        }
        platformMagnifier.dismiss();
    }

    private final void updateSizeIfNecessary() {
        Density density;
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier == null || (density = this.density) == null || IntSize.m2544equalsimpl(platformMagnifier.mo148getSizeYbymL2g(), this.previousSize)) {
            return;
        }
        drM<? super DpSize, dpR> drm = this.onSizeChanged;
        if (drm != null) {
            drm.invoke(DpSize.m2514boximpl(density.mo191toDpSizekrfVVM(IntSizeKt.m2553toSizeozmzZPI(platformMagnifier.mo148getSizeYbymL2g()))));
        }
        this.previousSize = IntSize.m2542boximpl(platformMagnifier.mo148getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        C8737dwr.c(getCoroutineScope(), null, null, new MagnifierNode$draw$1(this, null), 3, null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        m142setAnchorPositionInRootk4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(Magnifier_androidKt.getMagnifierPositionInRoot(), new drO<Offset>() { // from class: androidx.compose.foundation.MagnifierNode$applySemantics$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ Offset invoke() {
                return Offset.m1126boximpl(m144invokeF1C5BW0());
            }

            /* renamed from: invoke-F1C5BW0  reason: not valid java name */
            public final long m144invokeF1C5BW0() {
                long j;
                j = MagnifierNode.this.sourceCenterInRoot;
                return j;
            }
        });
    }

    /* renamed from: getAnchorPositionInRoot-F1C5BW0  reason: not valid java name */
    private final long m141getAnchorPositionInRootF1C5BW0() {
        return ((Offset) this.anchorPositionInRoot$delegate.getValue()).m1146unboximpl();
    }
}
