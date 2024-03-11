package androidx.compose.material;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.unit.Dp;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class Shapes {
    private final CornerBasedShape large;
    private final CornerBasedShape medium;
    private final CornerBasedShape small;

    public Shapes() {
        this(null, null, null, 7, null);
    }

    public final CornerBasedShape getLarge() {
        return this.large;
    }

    public final CornerBasedShape getMedium() {
        return this.medium;
    }

    public final CornerBasedShape getSmall() {
        return this.small;
    }

    public Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3) {
        this.small = cornerBasedShape;
        this.medium = cornerBasedShape2;
        this.large = cornerBasedShape3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Shapes) {
            Shapes shapes = (Shapes) obj;
            return C8632dsu.c(this.small, shapes.small) && C8632dsu.c(this.medium, shapes.medium) && C8632dsu.c(this.large, shapes.large);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.small.hashCode();
        return (((hashCode * 31) + this.medium.hashCode()) * 31) + this.large.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ')';
    }

    public /* synthetic */ Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? RoundedCornerShapeKt.m399RoundedCornerShape0680j_4(Dp.m2492constructorimpl(4)) : cornerBasedShape, (i & 2) != 0 ? RoundedCornerShapeKt.m399RoundedCornerShape0680j_4(Dp.m2492constructorimpl(4)) : cornerBasedShape2, (i & 4) != 0 ? RoundedCornerShapeKt.m399RoundedCornerShape0680j_4(Dp.m2492constructorimpl(0)) : cornerBasedShape3);
    }
}
