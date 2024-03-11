package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Dp;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class BorderStroke {
    private final Brush brush;
    private final float width;

    public /* synthetic */ BorderStroke(float f, Brush brush, C8627dsp c8627dsp) {
        this(f, brush);
    }

    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public final float m123getWidthD9Ej5fM() {
        return this.width;
    }

    private BorderStroke(float f, Brush brush) {
        this.width = f;
        this.brush = brush;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BorderStroke) {
            BorderStroke borderStroke = (BorderStroke) obj;
            return Dp.m2494equalsimpl0(this.width, borderStroke.width) && C8632dsu.c(this.brush, borderStroke.brush);
        }
        return false;
    }

    public int hashCode() {
        return (Dp.m2495hashCodeimpl(this.width) * 31) + this.brush.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) Dp.m2496toStringimpl(this.width)) + ", brush=" + this.brush + ')';
    }
}
