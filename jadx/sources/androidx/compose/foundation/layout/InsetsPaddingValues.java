package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8632dsu;

/* loaded from: classes5.dex */
final class InsetsPaddingValues implements PaddingValues {
    private final Density density;
    private final WindowInsets insets;

    public InsetsPaddingValues(WindowInsets windowInsets, Density density) {
        this.insets = windowInsets;
        this.density = density;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM  reason: not valid java name */
    public float mo249calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        Density density = this.density;
        return density.mo190toDpu2uoSUM(this.insets.getLeft(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM  reason: not valid java name */
    public float mo251calculateTopPaddingD9Ej5fM() {
        Density density = this.density;
        return density.mo190toDpu2uoSUM(this.insets.getTop(density));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM  reason: not valid java name */
    public float mo250calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        Density density = this.density;
        return density.mo190toDpu2uoSUM(this.insets.getRight(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM  reason: not valid java name */
    public float mo248calculateBottomPaddingD9Ej5fM() {
        Density density = this.density;
        return density.mo190toDpu2uoSUM(this.insets.getBottom(density));
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.insets + ", density=" + this.density + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InsetsPaddingValues) {
            InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) obj;
            return C8632dsu.c(this.insets, insetsPaddingValues.insets) && C8632dsu.c(this.density, insetsPaddingValues.density);
        }
        return false;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.density.hashCode();
    }
}
