package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;

/* loaded from: classes.dex */
public interface LazyLayoutMeasureScope extends MeasureScope {
    /* renamed from: measure-0kLqBqw  reason: not valid java name */
    List<Placeable> mo376measure0kLqBqw(int i, long j);

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    default float mo188toDpGaN1DYA(long j) {
        if (!TextUnitType.m2573equalsimpl0(TextUnit.m2559getTypeUIouoOA(j), TextUnitType.Companion.m2578getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return Dp.m2492constructorimpl(TextUnit.m2560getValueimpl(j) * getFontScale());
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    default float mo190toDpu2uoSUM(int i) {
        return Dp.m2492constructorimpl(i / getDensity());
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    default float mo189toDpu2uoSUM(float f) {
        return Dp.m2492constructorimpl(f / getDensity());
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    default long mo196toSpkPz2Gy4(float f) {
        return TextUnitKt.getSp(f / (getFontScale() * getDensity()));
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    default long mo195toSp0xMU5do(float f) {
        return TextUnitKt.getSp(f / getFontScale());
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    default long mo194toSizeXkaWNTQ(long j) {
        if (j != DpSize.Companion.m2523getUnspecifiedMYxV2XQ()) {
            return SizeKt.Size(mo193toPx0680j_4(DpSize.m2519getWidthD9Ej5fM(j)), mo193toPx0680j_4(DpSize.m2518getHeightD9Ej5fM(j)));
        }
        return Size.Companion.m1181getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    default long mo191toDpSizekrfVVM(long j) {
        if (j != Size.Companion.m1181getUnspecifiedNHjbRc()) {
            return DpKt.m2503DpSizeYgX7TsA(mo189toDpu2uoSUM(Size.m1176getWidthimpl(j)), mo189toDpu2uoSUM(Size.m1174getHeightimpl(j)));
        }
        return DpSize.Companion.m2523getUnspecifiedMYxV2XQ();
    }
}
