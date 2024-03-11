package androidx.compose.foundation.shape;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class RoundedCornerShapeKt {
    private static final RoundedCornerShape CircleShape = RoundedCornerShape(50);

    public static final RoundedCornerShape getCircleShape() {
        return CircleShape;
    }

    public static final RoundedCornerShape RoundedCornerShape(CornerSize cornerSize) {
        return new RoundedCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    /* renamed from: RoundedCornerShape-0680j_4  reason: not valid java name */
    public static final RoundedCornerShape m399RoundedCornerShape0680j_4(float f) {
        return RoundedCornerShape(CornerSizeKt.m398CornerSize0680j_4(f));
    }

    public static final RoundedCornerShape RoundedCornerShape(int i) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(i));
    }

    /* renamed from: RoundedCornerShape-a9UjIt4  reason: not valid java name */
    public static final RoundedCornerShape m400RoundedCornerShapea9UjIt4(float f, float f2, float f3, float f4) {
        return new RoundedCornerShape(CornerSizeKt.m398CornerSize0680j_4(f), CornerSizeKt.m398CornerSize0680j_4(f2), CornerSizeKt.m398CornerSize0680j_4(f3), CornerSizeKt.m398CornerSize0680j_4(f4));
    }

    /* renamed from: RoundedCornerShape-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ RoundedCornerShape m401RoundedCornerShapea9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m2492constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m2492constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m2492constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m2492constructorimpl(0);
        }
        return m400RoundedCornerShapea9UjIt4(f, f2, f3, f4);
    }
}
