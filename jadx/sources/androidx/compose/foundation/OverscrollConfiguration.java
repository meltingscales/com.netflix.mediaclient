package androidx.compose.foundation;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class OverscrollConfiguration {
    private final PaddingValues drawPadding;
    private final long glowColor;

    public /* synthetic */ OverscrollConfiguration(long j, PaddingValues paddingValues, C8627dsp c8627dsp) {
        this(j, paddingValues);
    }

    public final PaddingValues getDrawPadding() {
        return this.drawPadding;
    }

    /* renamed from: getGlowColor-0d7_KjU  reason: not valid java name */
    public final long m147getGlowColor0d7_KjU() {
        return this.glowColor;
    }

    private OverscrollConfiguration(long j, PaddingValues paddingValues) {
        this.glowColor = j;
        this.drawPadding = paddingValues;
    }

    public /* synthetic */ OverscrollConfiguration(long j, PaddingValues paddingValues, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? ColorKt.Color(4284900966L) : j, (i & 2) != 0 ? PaddingKt.m271PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null) : paddingValues, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C8632dsu.c(OverscrollConfiguration.class, obj != null ? obj.getClass() : null)) {
            C8632dsu.d(obj);
            OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) obj;
            return Color.m1294equalsimpl0(this.glowColor, overscrollConfiguration.glowColor) && C8632dsu.c(this.drawPadding, overscrollConfiguration.drawPadding);
        }
        return false;
    }

    public int hashCode() {
        return (Color.m1300hashCodeimpl(this.glowColor) * 31) + this.drawPadding.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) Color.m1301toStringimpl(this.glowColor)) + ", drawPadding=" + this.drawPadding + ')';
    }
}
