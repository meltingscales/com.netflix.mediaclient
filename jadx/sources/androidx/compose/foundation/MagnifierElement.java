package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class MagnifierElement extends ModifierNodeElement<MagnifierNode> {
    private final boolean clippingEnabled;
    private final float cornerRadius;
    private final float elevation;
    private final drM<Density, Offset> magnifierCenter;
    private final drM<DpSize, dpR> onSizeChanged;
    private final PlatformMagnifierFactory platformMagnifierFactory;
    private final long size;
    private final drM<Density, Offset> sourceCenter;
    private final boolean useTextDefault;
    private final float zoom;

    public /* synthetic */ MagnifierElement(drM drm, drM drm2, drM drm3, float f, boolean z, long j, float f2, float f3, boolean z2, PlatformMagnifierFactory platformMagnifierFactory, C8627dsp c8627dsp) {
        this(drm, drm2, drm3, f, z, j, f2, f3, z2, platformMagnifierFactory);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MagnifierElement(drM<? super Density, Offset> drm, drM<? super Density, Offset> drm2, drM<? super DpSize, dpR> drm3, float f, boolean z, long j, float f2, float f3, boolean z2, PlatformMagnifierFactory platformMagnifierFactory) {
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
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public MagnifierNode create() {
        return new MagnifierNode(this.sourceCenter, this.magnifierCenter, this.onSizeChanged, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.platformMagnifierFactory, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(MagnifierNode magnifierNode) {
        magnifierNode.m143update5F03MCQ(this.sourceCenter, this.magnifierCenter, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.onSizeChanged, this.platformMagnifierFactory);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MagnifierElement) {
            MagnifierElement magnifierElement = (MagnifierElement) obj;
            return C8632dsu.c(this.sourceCenter, magnifierElement.sourceCenter) && C8632dsu.c(this.magnifierCenter, magnifierElement.magnifierCenter) && this.zoom == magnifierElement.zoom && this.useTextDefault == magnifierElement.useTextDefault && DpSize.m2517equalsimpl0(this.size, magnifierElement.size) && Dp.m2494equalsimpl0(this.cornerRadius, magnifierElement.cornerRadius) && Dp.m2494equalsimpl0(this.elevation, magnifierElement.elevation) && this.clippingEnabled == magnifierElement.clippingEnabled && C8632dsu.c(this.onSizeChanged, magnifierElement.onSizeChanged) && C8632dsu.c(this.platformMagnifierFactory, magnifierElement.platformMagnifierFactory);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.sourceCenter.hashCode();
        drM<Density, Offset> drm = this.magnifierCenter;
        int hashCode2 = drm != null ? drm.hashCode() : 0;
        int hashCode3 = Float.hashCode(this.zoom);
        int hashCode4 = Boolean.hashCode(this.useTextDefault);
        int m2520hashCodeimpl = DpSize.m2520hashCodeimpl(this.size);
        int m2495hashCodeimpl = Dp.m2495hashCodeimpl(this.cornerRadius);
        int m2495hashCodeimpl2 = Dp.m2495hashCodeimpl(this.elevation);
        int hashCode5 = Boolean.hashCode(this.clippingEnabled);
        drM<DpSize, dpR> drm2 = this.onSizeChanged;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + m2520hashCodeimpl) * 31) + m2495hashCodeimpl) * 31) + m2495hashCodeimpl2) * 31) + hashCode5) * 31) + (drm2 != null ? drm2.hashCode() : 0)) * 31) + this.platformMagnifierFactory.hashCode();
    }
}
