package androidx.window.core;

import android.graphics.Rect;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class Bounds {
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public final int getHeight() {
        return this.bottom - this.top;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getTop() {
        return this.top;
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public Bounds(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bounds(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        C8632dsu.c((Object) rect, "");
    }

    public final Rect toRect() {
        return new Rect(this.left, this.top, this.right, this.bottom);
    }

    public final boolean isZero() {
        return getHeight() == 0 && getWidth() == 0;
    }

    public String toString() {
        return ((Object) Bounds.class.getSimpleName()) + " { [" + this.left + ',' + this.top + ',' + this.right + ',' + this.bottom + "] }";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C8632dsu.c(Bounds.class, obj == null ? null : obj.getClass())) {
            if (obj != null) {
                Bounds bounds = (Bounds) obj;
                return this.left == bounds.left && this.top == bounds.top && this.right == bounds.right && this.bottom == bounds.bottom;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        return false;
    }
}
