package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8632dsu;
import o.C8657dts;

/* loaded from: classes.dex */
final class ExcludeInsets implements WindowInsets {
    private final WindowInsets excluded;
    private final WindowInsets included;

    public ExcludeInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.included = windowInsets;
        this.excluded = windowInsets2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        int b;
        b = C8657dts.b(this.included.getLeft(density, layoutDirection) - this.excluded.getLeft(density, layoutDirection), 0);
        return b;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        int b;
        b = C8657dts.b(this.included.getTop(density) - this.excluded.getTop(density), 0);
        return b;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        int b;
        b = C8657dts.b(this.included.getRight(density, layoutDirection) - this.excluded.getRight(density, layoutDirection), 0);
        return b;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        int b;
        b = C8657dts.b(this.included.getBottom(density) - this.excluded.getBottom(density), 0);
        return b;
    }

    public String toString() {
        return '(' + this.included + " - " + this.excluded + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExcludeInsets) {
            ExcludeInsets excludeInsets = (ExcludeInsets) obj;
            return C8632dsu.c(excludeInsets.included, this.included) && C8632dsu.c(excludeInsets.excluded, this.excluded);
        }
        return false;
    }

    public int hashCode() {
        return (this.included.hashCode() * 31) + this.excluded.hashCode();
    }
}
