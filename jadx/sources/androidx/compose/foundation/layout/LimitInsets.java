package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
final class LimitInsets implements WindowInsets {
    private final WindowInsets insets;
    private final int sides;

    public /* synthetic */ LimitInsets(WindowInsets windowInsets, int i, C8627dsp c8627dsp) {
        this(windowInsets, i);
    }

    private LimitInsets(WindowInsets windowInsets, int i) {
        this.insets = windowInsets;
        this.sides = i;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        int m323getAllowLeftInRtlJoeWqyM$foundation_layout_release;
        if (layoutDirection == LayoutDirection.Ltr) {
            m323getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m322getAllowLeftInLtrJoeWqyM$foundation_layout_release();
        } else {
            m323getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m323getAllowLeftInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m316hasAnybkgdKaI$foundation_layout_release(this.sides, m323getAllowLeftInRtlJoeWqyM$foundation_layout_release)) {
            return this.insets.getLeft(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        if (WindowInsetsSides.m316hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m327getTopJoeWqyM())) {
            return this.insets.getTop(density);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        int m325getAllowRightInRtlJoeWqyM$foundation_layout_release;
        if (layoutDirection == LayoutDirection.Ltr) {
            m325getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m324getAllowRightInLtrJoeWqyM$foundation_layout_release();
        } else {
            m325getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m325getAllowRightInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m316hasAnybkgdKaI$foundation_layout_release(this.sides, m325getAllowRightInRtlJoeWqyM$foundation_layout_release)) {
            return this.insets.getRight(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        if (WindowInsetsSides.m316hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m326getBottomJoeWqyM())) {
            return this.insets.getBottom(density);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LimitInsets) {
            LimitInsets limitInsets = (LimitInsets) obj;
            return C8632dsu.c(this.insets, limitInsets.insets) && WindowInsetsSides.m315equalsimpl0(this.sides, limitInsets.sides);
        }
        return false;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + WindowInsetsSides.m317hashCodeimpl(this.sides);
    }

    public String toString() {
        return '(' + this.insets + " only " + ((Object) WindowInsetsSides.m319toStringimpl(this.sides)) + ')';
    }
}
