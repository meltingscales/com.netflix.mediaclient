package androidx.compose.material.ripple;

/* loaded from: classes.dex */
public final class RippleAlpha {
    private final float draggedAlpha;
    private final float focusedAlpha;
    private final float hoveredAlpha;
    private final float pressedAlpha;

    public final float getDraggedAlpha() {
        return this.draggedAlpha;
    }

    public final float getFocusedAlpha() {
        return this.focusedAlpha;
    }

    public final float getHoveredAlpha() {
        return this.hoveredAlpha;
    }

    public final float getPressedAlpha() {
        return this.pressedAlpha;
    }

    public RippleAlpha(float f, float f2, float f3, float f4) {
        this.draggedAlpha = f;
        this.focusedAlpha = f2;
        this.hoveredAlpha = f3;
        this.pressedAlpha = f4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RippleAlpha) {
            RippleAlpha rippleAlpha = (RippleAlpha) obj;
            return this.draggedAlpha == rippleAlpha.draggedAlpha && this.focusedAlpha == rippleAlpha.focusedAlpha && this.hoveredAlpha == rippleAlpha.hoveredAlpha && this.pressedAlpha == rippleAlpha.pressedAlpha;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Float.hashCode(this.draggedAlpha);
        int hashCode2 = Float.hashCode(this.focusedAlpha);
        return (((((hashCode * 31) + hashCode2) * 31) + Float.hashCode(this.hoveredAlpha)) * 31) + Float.hashCode(this.pressedAlpha);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.draggedAlpha + ", focusedAlpha=" + this.focusedAlpha + ", hoveredAlpha=" + this.hoveredAlpha + ", pressedAlpha=" + this.pressedAlpha + ')';
    }
}
