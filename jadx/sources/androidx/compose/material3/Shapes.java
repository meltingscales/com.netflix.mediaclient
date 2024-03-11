package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class Shapes {
    private final CornerBasedShape extraLarge;
    private final CornerBasedShape extraSmall;
    private final CornerBasedShape large;
    private final CornerBasedShape medium;
    private final CornerBasedShape small;

    public Shapes() {
        this(null, null, null, null, null, 31, null);
    }

    public final CornerBasedShape getExtraLarge() {
        return this.extraLarge;
    }

    public final CornerBasedShape getExtraSmall() {
        return this.extraSmall;
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

    public Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5) {
        this.extraSmall = cornerBasedShape;
        this.small = cornerBasedShape2;
        this.medium = cornerBasedShape3;
        this.large = cornerBasedShape4;
        this.extraLarge = cornerBasedShape5;
    }

    public /* synthetic */ Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? ShapeDefaults.INSTANCE.getExtraSmall() : cornerBasedShape, (i & 2) != 0 ? ShapeDefaults.INSTANCE.getSmall() : cornerBasedShape2, (i & 4) != 0 ? ShapeDefaults.INSTANCE.getMedium() : cornerBasedShape3, (i & 8) != 0 ? ShapeDefaults.INSTANCE.getLarge() : cornerBasedShape4, (i & 16) != 0 ? ShapeDefaults.INSTANCE.getExtraLarge() : cornerBasedShape5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Shapes) {
            Shapes shapes = (Shapes) obj;
            return C8632dsu.c(this.extraSmall, shapes.extraSmall) && C8632dsu.c(this.small, shapes.small) && C8632dsu.c(this.medium, shapes.medium) && C8632dsu.c(this.large, shapes.large) && C8632dsu.c(this.extraLarge, shapes.extraLarge);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.extraSmall.hashCode();
        int hashCode2 = this.small.hashCode();
        int hashCode3 = this.medium.hashCode();
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + this.large.hashCode()) * 31) + this.extraLarge.hashCode();
    }

    public String toString() {
        return "Shapes(extraSmall=" + this.extraSmall + ", small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ", extraLarge=" + this.extraLarge + ')';
    }
}
