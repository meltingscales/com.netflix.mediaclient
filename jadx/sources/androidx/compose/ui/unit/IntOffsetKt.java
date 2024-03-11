package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;

/* loaded from: classes.dex */
public final class IntOffsetKt {
    public static final long IntOffset(int i, int i2) {
        return IntOffset.m2528constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* renamed from: plus-Nv-tHpc  reason: not valid java name */
    public static final long m2540plusNvtHpc(long j, long j2) {
        return OffsetKt.Offset(Offset.m1137getXimpl(j) + IntOffset.m2533getXimpl(j2), Offset.m1138getYimpl(j) + IntOffset.m2534getYimpl(j2));
    }

    /* renamed from: minus-Nv-tHpc  reason: not valid java name */
    public static final long m2539minusNvtHpc(long j, long j2) {
        return OffsetKt.Offset(Offset.m1137getXimpl(j) - IntOffset.m2533getXimpl(j2), Offset.m1138getYimpl(j) - IntOffset.m2534getYimpl(j2));
    }
}
