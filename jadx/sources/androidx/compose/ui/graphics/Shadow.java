package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class Shadow {
    public static final Companion Companion = new Companion(null);
    private static final Shadow None = new Shadow(0, 0, 0.0f, 7, null);
    private final float blurRadius;
    private final long color;
    private final long offset;

    public /* synthetic */ Shadow(long j, long j2, float f, C8627dsp c8627dsp) {
        this(j, j2, f);
    }

    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public final long m1431getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getOffset-F1C5BW0  reason: not valid java name */
    public final long m1432getOffsetF1C5BW0() {
        return this.offset;
    }

    private Shadow(long j, long j2, float f) {
        this.color = j;
        this.offset = j2;
        this.blurRadius = f;
    }

    public /* synthetic */ Shadow(long j, long j2, float f, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? ColorKt.Color(4278190080L) : j, (i & 2) != 0 ? Offset.Companion.m1149getZeroF1C5BW0() : j2, (i & 4) != 0 ? 0.0f : f, null);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Shadow getNone() {
            return Shadow.None;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Shadow) {
            Shadow shadow = (Shadow) obj;
            return Color.m1294equalsimpl0(this.color, shadow.color) && Offset.m1134equalsimpl0(this.offset, shadow.offset) && this.blurRadius == shadow.blurRadius;
        }
        return false;
    }

    public int hashCode() {
        int m1300hashCodeimpl = Color.m1300hashCodeimpl(this.color);
        return (((m1300hashCodeimpl * 31) + Offset.m1139hashCodeimpl(this.offset)) * 31) + Float.hashCode(this.blurRadius);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) Color.m1301toStringimpl(this.color)) + ", offset=" + ((Object) Offset.m1144toStringimpl(this.offset)) + ", blurRadius=" + this.blurRadius + ')';
    }
}
