package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public abstract class CornerBasedShape implements Shape {
    private final CornerSize bottomEnd;
    private final CornerSize bottomStart;
    private final CornerSize topEnd;
    private final CornerSize topStart;

    public abstract CornerBasedShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4);

    /* renamed from: createOutline-LjSzlW0  reason: not valid java name */
    public abstract Outline mo396createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection);

    public final CornerSize getBottomEnd() {
        return this.bottomEnd;
    }

    public final CornerSize getBottomStart() {
        return this.bottomStart;
    }

    public final CornerSize getTopEnd() {
        return this.topEnd;
    }

    public final CornerSize getTopStart() {
        return this.topStart;
    }

    public CornerBasedShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        this.topStart = cornerSize;
        this.topEnd = cornerSize2;
        this.bottomEnd = cornerSize3;
        this.bottomStart = cornerSize4;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final Outline mo139createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        float mo397toPxTmRCtEA = this.topStart.mo397toPxTmRCtEA(j, density);
        float mo397toPxTmRCtEA2 = this.topEnd.mo397toPxTmRCtEA(j, density);
        float mo397toPxTmRCtEA3 = this.bottomEnd.mo397toPxTmRCtEA(j, density);
        float mo397toPxTmRCtEA4 = this.bottomStart.mo397toPxTmRCtEA(j, density);
        float m1175getMinDimensionimpl = Size.m1175getMinDimensionimpl(j);
        float f = mo397toPxTmRCtEA + mo397toPxTmRCtEA4;
        if (f > m1175getMinDimensionimpl) {
            float f2 = m1175getMinDimensionimpl / f;
            mo397toPxTmRCtEA *= f2;
            mo397toPxTmRCtEA4 *= f2;
        }
        float f3 = mo397toPxTmRCtEA4;
        float f4 = mo397toPxTmRCtEA2 + mo397toPxTmRCtEA3;
        if (f4 > m1175getMinDimensionimpl) {
            float f5 = m1175getMinDimensionimpl / f4;
            mo397toPxTmRCtEA2 *= f5;
            mo397toPxTmRCtEA3 *= f5;
        }
        if (mo397toPxTmRCtEA < 0.0f || mo397toPxTmRCtEA2 < 0.0f || mo397toPxTmRCtEA3 < 0.0f || f3 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + mo397toPxTmRCtEA + ", topEnd = " + mo397toPxTmRCtEA2 + ", bottomEnd = " + mo397toPxTmRCtEA3 + ", bottomStart = " + f3 + ")!").toString());
        }
        return mo396createOutlineLjSzlW0(j, mo397toPxTmRCtEA, mo397toPxTmRCtEA2, mo397toPxTmRCtEA3, f3, layoutDirection);
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                cornerSize = cornerBasedShape.topStart;
            }
            if ((i & 2) != 0) {
                cornerSize2 = cornerBasedShape.topEnd;
            }
            if ((i & 4) != 0) {
                cornerSize3 = cornerBasedShape.bottomEnd;
            }
            if ((i & 8) != 0) {
                cornerSize4 = cornerBasedShape.bottomStart;
            }
            return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    public final CornerBasedShape copy(CornerSize cornerSize) {
        return copy(cornerSize, cornerSize, cornerSize, cornerSize);
    }
}
