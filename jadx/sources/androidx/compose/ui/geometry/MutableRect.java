package androidx.compose.ui.geometry;

/* loaded from: classes.dex */
public final class MutableRect {
    private float bottom;
    private float left;
    private float right;
    private float top;

    public final float getBottom() {
        return this.bottom;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final void set(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public final void setBottom(float f) {
        this.bottom = f;
    }

    public final void setLeft(float f) {
        this.left = f;
    }

    public final void setRight(float f) {
        this.right = f;
    }

    public final void setTop(float f) {
        this.top = f;
    }

    public MutableRect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public final void intersect(float f, float f2, float f3, float f4) {
        this.left = Math.max(f, this.left);
        this.top = Math.max(f2, this.top);
        this.right = Math.min(f3, this.right);
        this.bottom = Math.min(f4, this.bottom);
    }

    public String toString() {
        return "MutableRect(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }
}
