package androidx.compose.ui.graphics;

import o.C8627dsp;

/* loaded from: classes.dex */
public final class SolidColor extends Brush {
    private final long value;

    public /* synthetic */ SolidColor(long j, C8627dsp c8627dsp) {
        this(j);
    }

    /* renamed from: getValue-0d7_KjU  reason: not valid java name */
    public final long m1441getValue0d7_KjU() {
        return this.value;
    }

    private SolidColor(long j) {
        super(null);
        this.value = j;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public void mo1264applyToPq9zytI(long j, Paint paint, float f) {
        long m1292copywmQWz5c$default;
        paint.setAlpha(1.0f);
        if (f == 1.0f) {
            m1292copywmQWz5c$default = this.value;
        } else {
            long j2 = this.value;
            m1292copywmQWz5c$default = Color.m1292copywmQWz5c$default(j2, Color.m1295getAlphaimpl(j2) * f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        paint.mo1208setColor8_81llA(m1292copywmQWz5c$default);
        if (paint.getShader() != null) {
            paint.setShader(null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SolidColor) && Color.m1294equalsimpl0(this.value, ((SolidColor) obj).value);
    }

    public int hashCode() {
        return Color.m1300hashCodeimpl(this.value);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) Color.m1301toStringimpl(this.value)) + ')';
    }
}
