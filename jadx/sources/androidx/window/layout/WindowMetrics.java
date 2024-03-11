package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class WindowMetrics {
    private final Bounds _bounds;

    public WindowMetrics(Bounds bounds) {
        C8632dsu.c((Object) bounds, "");
        this._bounds = bounds;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WindowMetrics(Rect rect) {
        this(new Bounds(rect));
        C8632dsu.c((Object) rect, "");
    }

    public final Rect getBounds() {
        return this._bounds.toRect();
    }

    public String toString() {
        return "WindowMetrics { bounds: " + getBounds() + " }";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C8632dsu.c(WindowMetrics.class, obj.getClass())) {
            return false;
        }
        return C8632dsu.c(this._bounds, ((WindowMetrics) obj)._bounds);
    }

    public int hashCode() {
        return this._bounds.hashCode();
    }
}
