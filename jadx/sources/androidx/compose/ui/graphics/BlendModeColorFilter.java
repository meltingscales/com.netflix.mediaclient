package androidx.compose.ui.graphics;

import o.C8627dsp;

/* loaded from: classes.dex */
public final class BlendModeColorFilter extends ColorFilter {
    private final int blendMode;
    private final long color;

    public /* synthetic */ BlendModeColorFilter(long j, int i, android.graphics.ColorFilter colorFilter, C8627dsp c8627dsp) {
        this(j, i, colorFilter);
    }

    public /* synthetic */ BlendModeColorFilter(long j, int i, C8627dsp c8627dsp) {
        this(j, i);
    }

    /* renamed from: getBlendMode-0nO6VwU  reason: not valid java name */
    public final int m1262getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    private BlendModeColorFilter(long j, int i, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.color = j;
        this.blendMode = i;
    }

    private BlendModeColorFilter(long j, int i) {
        this(j, i, AndroidColorFilter_androidKt.m1196actualTintColorFilterxETnrds(j, i), null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BlendModeColorFilter) {
            BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) obj;
            return Color.m1294equalsimpl0(this.color, blendModeColorFilter.color) && BlendMode.m1229equalsimpl0(this.blendMode, blendModeColorFilter.blendMode);
        }
        return false;
    }

    public int hashCode() {
        return (Color.m1300hashCodeimpl(this.color) * 31) + BlendMode.m1230hashCodeimpl(this.blendMode);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) Color.m1301toStringimpl(this.color)) + ", blendMode=" + ((Object) BlendMode.m1231toStringimpl(this.blendMode)) + ')';
    }
}
