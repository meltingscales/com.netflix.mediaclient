package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import o.C8632dsu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DensityWithConverter implements Density {
    private final FontScaleConverter converter;
    private final float density;
    private final float fontScale;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DensityWithConverter) {
            DensityWithConverter densityWithConverter = (DensityWithConverter) obj;
            return Float.compare(this.density, densityWithConverter.density) == 0 && Float.compare(this.fontScale, densityWithConverter.fontScale) == 0 && C8632dsu.c(this.converter, densityWithConverter.converter);
        }
        return false;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.fontScale;
    }

    public int hashCode() {
        return (((Float.hashCode(this.density) * 31) + Float.hashCode(this.fontScale)) * 31) + this.converter.hashCode();
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.density + ", fontScale=" + this.fontScale + ", converter=" + this.converter + ')';
    }

    public DensityWithConverter(float f, float f2, FontScaleConverter fontScaleConverter) {
        this.density = f;
        this.fontScale = f2;
        this.converter = fontScaleConverter;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo195toSp0xMU5do(float f) {
        return TextUnitKt.getSp(this.converter.convertDpToSp(f));
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo188toDpGaN1DYA(long j) {
        if (!TextUnitType.m2573equalsimpl0(TextUnit.m2559getTypeUIouoOA(j), TextUnitType.Companion.m2578getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return Dp.m2492constructorimpl(this.converter.convertSpToDp(TextUnit.m2560getValueimpl(j)));
    }
}
