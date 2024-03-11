package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
final class FixedIntInsets implements WindowInsets {
    private final int bottomVal;
    private final int leftVal;
    private final int rightVal;
    private final int topVal;

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return this.bottomVal;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return this.leftVal;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return this.rightVal;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return this.topVal;
    }

    public int hashCode() {
        return (((((this.leftVal * 31) + this.topVal) * 31) + this.rightVal) * 31) + this.bottomVal;
    }

    public FixedIntInsets(int i, int i2, int i3, int i4) {
        this.leftVal = i;
        this.topVal = i2;
        this.rightVal = i3;
        this.bottomVal = i4;
    }

    public String toString() {
        return "Insets(left=" + this.leftVal + ", top=" + this.topVal + ", right=" + this.rightVal + ", bottom=" + this.bottomVal + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FixedIntInsets) {
            FixedIntInsets fixedIntInsets = (FixedIntInsets) obj;
            return this.leftVal == fixedIntInsets.leftVal && this.topVal == fixedIntInsets.topVal && this.rightVal == fixedIntInsets.rightVal && this.bottomVal == fixedIntInsets.bottomVal;
        }
        return false;
    }
}
