package androidx.compose.ui;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import o.dsT;

/* loaded from: classes.dex */
public final class BiasAlignment implements Alignment {
    private final float horizontalBias;
    private final float verticalBias;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BiasAlignment) {
            BiasAlignment biasAlignment = (BiasAlignment) obj;
            return Float.compare(this.horizontalBias, biasAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAlignment.verticalBias) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.horizontalBias) * 31) + Float.hashCode(this.verticalBias);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }

    public BiasAlignment(float f, float f2) {
        this.horizontalBias = f;
        this.verticalBias = f2;
    }

    @Override // androidx.compose.ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo1056alignKFBX0sM(long j, long j2, LayoutDirection layoutDirection) {
        int e;
        int e2;
        float m2547getWidthimpl = (IntSize.m2547getWidthimpl(j2) - IntSize.m2547getWidthimpl(j)) / 2.0f;
        float m2546getHeightimpl = (IntSize.m2546getHeightimpl(j2) - IntSize.m2546getHeightimpl(j)) / 2.0f;
        float f = layoutDirection == LayoutDirection.Ltr ? this.horizontalBias : (-1) * this.horizontalBias;
        float f2 = 1;
        float f3 = this.verticalBias;
        e = dsT.e(m2547getWidthimpl * (f + f2));
        e2 = dsT.e(m2546getHeightimpl * (f2 + f3));
        return IntOffsetKt.IntOffset(e, e2);
    }

    /* loaded from: classes.dex */
    public static final class Horizontal implements Alignment.Horizontal {
        private final float bias;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.compare(this.bias, ((Horizontal) obj).bias) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        public String toString() {
            return "Horizontal(bias=" + this.bias + ')';
        }

        public Horizontal(float f) {
            this.bias = f;
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public int align(int i, int i2, LayoutDirection layoutDirection) {
            int e;
            e = dsT.e(((i2 - i) / 2.0f) * (1 + (layoutDirection == LayoutDirection.Ltr ? this.bias : (-1) * this.bias)));
            return e;
        }
    }

    /* loaded from: classes.dex */
    public static final class Vertical implements Alignment.Vertical {
        private final float bias;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Vertical) && Float.compare(this.bias, ((Vertical) obj).bias) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        public String toString() {
            return "Vertical(bias=" + this.bias + ')';
        }

        public Vertical(float f) {
            this.bias = f;
        }

        @Override // androidx.compose.ui.Alignment.Vertical
        public int align(int i, int i2) {
            int e;
            e = dsT.e(((i2 - i) / 2.0f) * (1 + this.bias));
            return e;
        }
    }
}
