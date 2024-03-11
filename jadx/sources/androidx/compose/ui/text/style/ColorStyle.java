package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import o.C8627dsp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ColorStyle implements TextForegroundStyle {
    private final long value;

    public /* synthetic */ ColorStyle(long j, C8627dsp c8627dsp) {
        this(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorStyle) && Color.m1294equalsimpl0(this.value, ((ColorStyle) obj).value);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public Brush getBrush() {
        return null;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU */
    public long mo2340getColor0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m1300hashCodeimpl(this.value);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) Color.m1301toStringimpl(this.value)) + ')';
    }

    private ColorStyle(long j) {
        this.value = j;
        if (j == Color.Companion.m1309getUnspecified0d7_KjU()) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return Color.m1295getAlphaimpl(mo2340getColor0d7_KjU());
    }
}
