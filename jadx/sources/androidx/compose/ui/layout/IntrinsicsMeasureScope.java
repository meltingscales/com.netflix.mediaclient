package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import com.netflix.model.leafs.ArtworkColors;
import java.util.Map;
import o.C8657dts;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class IntrinsicsMeasureScope implements MeasureScope {
    private final /* synthetic */ IntrinsicMeasureScope $$delegate_0;
    private final LayoutDirection layoutDirection;

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.$$delegate_0.isLookingAhead();
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo186roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo186roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo187roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo187roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo188toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo188toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo189toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo189toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo190toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo190toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo191toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo191toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo192toPxR2X_6o(long j) {
        return this.$$delegate_0.mo192toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo193toPx0680j_4(float f) {
        return this.$$delegate_0.mo193toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo194toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo194toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo195toSp0xMU5do(float f) {
        return this.$$delegate_0.mo195toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo196toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo196toSpkPz2Gy4(f);
    }

    public IntrinsicsMeasureScope(IntrinsicMeasureScope intrinsicMeasureScope, LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
        this.$$delegate_0 = intrinsicMeasureScope;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int i, int i2, final Map<AlignmentLine, Integer> map, drM<? super Placeable.PlacementScope, dpR> drm) {
        final int b;
        final int b2;
        b = C8657dts.b(i, 0);
        b2 = C8657dts.b(i2, 0);
        if ((b & ArtworkColors.DEFAULT_BACKGROUND_COLOR) == 0 && ((-16777216) & b2) == 0) {
            return new MeasureResult() { // from class: androidx.compose.ui.layout.IntrinsicsMeasureScope$layout$1
                @Override // androidx.compose.ui.layout.MeasureResult
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return b2;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return b;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                }
            };
        }
        throw new IllegalStateException(("Size(" + b + " x " + b2 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }
}
