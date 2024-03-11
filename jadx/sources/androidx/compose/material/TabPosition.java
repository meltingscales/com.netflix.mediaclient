package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class TabPosition {
    private final float left;
    private final float width;

    public /* synthetic */ TabPosition(float f, float f2, C8627dsp c8627dsp) {
        this(f, f2);
    }

    /* renamed from: getLeft-D9Ej5fM  reason: not valid java name */
    public final float m668getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public final float m670getWidthD9Ej5fM() {
        return this.width;
    }

    private TabPosition(float f, float f2) {
        this.left = f;
        this.width = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TabPosition) {
            TabPosition tabPosition = (TabPosition) obj;
            return Dp.m2494equalsimpl0(this.left, tabPosition.left) && Dp.m2494equalsimpl0(this.width, tabPosition.width);
        }
        return false;
    }

    public int hashCode() {
        return (Dp.m2495hashCodeimpl(this.left) * 31) + Dp.m2495hashCodeimpl(this.width);
    }

    public String toString() {
        return "TabPosition(left=" + ((Object) Dp.m2496toStringimpl(this.left)) + ", right=" + ((Object) Dp.m2496toStringimpl(m669getRightD9Ej5fM())) + ", width=" + ((Object) Dp.m2496toStringimpl(this.width)) + ')';
    }

    /* renamed from: getRight-D9Ej5fM  reason: not valid java name */
    public final float m669getRightD9Ej5fM() {
        return Dp.m2492constructorimpl(this.left + this.width);
    }
}
