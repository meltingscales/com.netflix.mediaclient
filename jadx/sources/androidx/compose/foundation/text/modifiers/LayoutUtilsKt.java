package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import o.C8657dts;

/* loaded from: classes.dex */
public final class LayoutUtilsKt {
    /* renamed from: finalConstraints-tfFHcEY  reason: not valid java name */
    public static final long m497finalConstraintstfFHcEY(long j, boolean z, int i, float f) {
        return ConstraintsKt.Constraints$default(0, m499finalMaxWidthtfFHcEY(j, z, i, f), 0, Constraints.m2472getMaxHeightimpl(j), 5, null);
    }

    /* renamed from: finalMaxWidth-tfFHcEY  reason: not valid java name */
    public static final int m499finalMaxWidthtfFHcEY(long j, boolean z, int i, float f) {
        int c;
        int m2473getMaxWidthimpl = ((z || TextOverflow.m2453equalsimpl0(i, TextOverflow.Companion.m2458getEllipsisgIe3tQ8())) && Constraints.m2469getHasBoundedWidthimpl(j)) ? Constraints.m2473getMaxWidthimpl(j) : Integer.MAX_VALUE;
        if (Constraints.m2475getMinWidthimpl(j) == m2473getMaxWidthimpl) {
            return m2473getMaxWidthimpl;
        }
        c = C8657dts.c(TextDelegateKt.ceilToIntPx(f), Constraints.m2475getMinWidthimpl(j), m2473getMaxWidthimpl);
        return c;
    }

    /* renamed from: finalMaxLines-xdlQI24  reason: not valid java name */
    public static final int m498finalMaxLinesxdlQI24(boolean z, int i, int i2) {
        int b;
        if (z || !TextOverflow.m2453equalsimpl0(i, TextOverflow.Companion.m2458getEllipsisgIe3tQ8())) {
            b = C8657dts.b(i2, 1);
            return b;
        }
        return 1;
    }

    public static final long fixedCoerceHeightAndWidthForBits(Constraints.Companion companion, int i, int i2) {
        int min;
        int min2 = Math.min(i, 262142);
        if (min2 < 8191) {
            min = Math.min(i2, 262142);
        } else if (min2 < 32767) {
            min = Math.min(i2, 65534);
        } else if (min2 < 65535) {
            min = Math.min(i2, 32766);
        } else {
            min = Math.min(i2, 8190);
        }
        return companion.m2480fixedJhjzzOo(min2, min);
    }
}
