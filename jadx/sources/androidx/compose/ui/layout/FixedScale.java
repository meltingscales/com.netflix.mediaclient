package androidx.compose.ui.layout;

/* loaded from: classes.dex */
public final class FixedScale implements ContentScale {
    private final float value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedScale) && Float.compare(this.value, ((FixedScale) obj).value) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    public String toString() {
        return "FixedScale(value=" + this.value + ')';
    }

    public FixedScale(float f) {
        this.value = f;
    }

    @Override // androidx.compose.ui.layout.ContentScale
    /* renamed from: computeScaleFactor-H7hwNQA */
    public long mo1794computeScaleFactorH7hwNQA(long j, long j2) {
        float f = this.value;
        return ScaleFactorKt.ScaleFactor(f, f);
    }
}
