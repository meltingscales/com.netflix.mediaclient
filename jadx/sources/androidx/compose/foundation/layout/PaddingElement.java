package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import o.C8627dsp;
import o.dpR;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PaddingElement extends ModifierNodeElement<PaddingNode> {
    private float bottom;
    private float end;
    private final drM<InspectorInfo, dpR> inspectorInfo;
    private boolean rtlAware;
    private float start;
    private float top;

    public /* synthetic */ PaddingElement(float f, float f2, float f3, float f4, boolean z, drM drm, C8627dsp c8627dsp) {
        this(f, f2, f3, f4, z, drm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PaddingElement(float f, float f2, float f3, float f4, boolean z, drM<? super InspectorInfo, dpR> drm) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
        this.rtlAware = z;
        this.inspectorInfo = drm;
        if (f >= 0.0f || Dp.m2494equalsimpl0(f, Dp.Companion.m2501getUnspecifiedD9Ej5fM())) {
            float f5 = this.top;
            if (f5 >= 0.0f || Dp.m2494equalsimpl0(f5, Dp.Companion.m2501getUnspecifiedD9Ej5fM())) {
                float f6 = this.end;
                if (f6 >= 0.0f || Dp.m2494equalsimpl0(f6, Dp.Companion.m2501getUnspecifiedD9Ej5fM())) {
                    float f7 = this.bottom;
                    if (f7 >= 0.0f || Dp.m2494equalsimpl0(f7, Dp.Companion.m2501getUnspecifiedD9Ej5fM())) {
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PaddingNode create() {
        return new PaddingNode(this.start, this.top, this.end, this.bottom, this.rtlAware, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(PaddingNode paddingNode) {
        paddingNode.m282setStart0680j_4(this.start);
        paddingNode.m283setTop0680j_4(this.top);
        paddingNode.m281setEnd0680j_4(this.end);
        paddingNode.m280setBottom0680j_4(this.bottom);
        paddingNode.setRtlAware(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int m2495hashCodeimpl = Dp.m2495hashCodeimpl(this.start);
        int m2495hashCodeimpl2 = Dp.m2495hashCodeimpl(this.top);
        int m2495hashCodeimpl3 = Dp.m2495hashCodeimpl(this.end);
        return (((((((m2495hashCodeimpl * 31) + m2495hashCodeimpl2) * 31) + m2495hashCodeimpl3) * 31) + Dp.m2495hashCodeimpl(this.bottom)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    public boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && Dp.m2494equalsimpl0(this.start, paddingElement.start) && Dp.m2494equalsimpl0(this.top, paddingElement.top) && Dp.m2494equalsimpl0(this.end, paddingElement.end) && Dp.m2494equalsimpl0(this.bottom, paddingElement.bottom) && this.rtlAware == paddingElement.rtlAware;
    }
}
