package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import o.dsT;

/* loaded from: classes.dex */
public interface Density extends FontScaling {
    float getDensity();

    /* renamed from: toPx-0680j_4 */
    default float mo193toPx0680j_4(float f) {
        return f * getDensity();
    }

    /* renamed from: roundToPx-0680j_4 */
    default int mo187roundToPx0680j_4(float f) {
        int e;
        float mo193toPx0680j_4 = mo193toPx0680j_4(f);
        if (Float.isInfinite(mo193toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        e = dsT.e(mo193toPx0680j_4);
        return e;
    }

    /* renamed from: toPx--R2X_6o */
    default float mo192toPxR2X_6o(long j) {
        if (!TextUnitType.m2573equalsimpl0(TextUnit.m2559getTypeUIouoOA(j), TextUnitType.Companion.m2578getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return mo193toPx0680j_4(mo188toDpGaN1DYA(j));
    }

    /* renamed from: roundToPx--R2X_6o */
    default int mo186roundToPxR2X_6o(long j) {
        int e;
        e = dsT.e(mo192toPxR2X_6o(j));
        return e;
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo190toDpu2uoSUM(int i) {
        return Dp.m2492constructorimpl(i / getDensity());
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo189toDpu2uoSUM(float f) {
        return Dp.m2492constructorimpl(f / getDensity());
    }

    /* renamed from: toSp-kPz2Gy4 */
    default long mo196toSpkPz2Gy4(float f) {
        return mo195toSp0xMU5do(mo189toDpu2uoSUM(f));
    }

    /* renamed from: toSize-XkaWNTQ */
    default long mo194toSizeXkaWNTQ(long j) {
        if (j != DpSize.Companion.m2523getUnspecifiedMYxV2XQ()) {
            return SizeKt.Size(mo193toPx0680j_4(DpSize.m2519getWidthD9Ej5fM(j)), mo193toPx0680j_4(DpSize.m2518getHeightD9Ej5fM(j)));
        }
        return Size.Companion.m1181getUnspecifiedNHjbRc();
    }

    /* renamed from: toDpSize-k-rfVVM */
    default long mo191toDpSizekrfVVM(long j) {
        if (j != Size.Companion.m1181getUnspecifiedNHjbRc()) {
            return DpKt.m2503DpSizeYgX7TsA(mo189toDpu2uoSUM(Size.m1176getWidthimpl(j)), mo189toDpu2uoSUM(Size.m1174getHeightimpl(j)));
        }
        return DpSize.Companion.m2523getUnspecifiedMYxV2XQ();
    }
}
