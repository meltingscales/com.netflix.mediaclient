package androidx.compose.ui.geometry;

import o.C8627dsp;

/* loaded from: classes.dex */
public final class Rect {
    public static final Companion Companion = new Companion(null);
    private static final Rect Zero = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public static /* synthetic */ Rect copy$default(Rect rect, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = rect.left;
        }
        if ((i & 2) != 0) {
            f2 = rect.top;
        }
        if ((i & 4) != 0) {
            f3 = rect.right;
        }
        if ((i & 8) != 0) {
            f4 = rect.bottom;
        }
        return rect.copy(f, f2, f3, f4);
    }

    public final Rect copy(float f, float f2, float f3, float f4) {
        return new Rect(f, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Rect) {
            Rect rect = (Rect) obj;
            return Float.compare(this.left, rect.left) == 0 && Float.compare(this.top, rect.top) == 0 && Float.compare(this.right, rect.right) == 0 && Float.compare(this.bottom, rect.bottom) == 0;
        }
        return false;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getHeight() {
        return this.bottom - this.top;
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

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public Rect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Rect getZero() {
            return Rect.Zero;
        }
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public final long m1157getSizeNHjbRc() {
        return SizeKt.Size(getWidth(), getHeight());
    }

    /* renamed from: translate-k-4lQ0M  reason: not valid java name */
    public final Rect m1160translatek4lQ0M(long j) {
        return new Rect(this.left + Offset.m1137getXimpl(j), this.top + Offset.m1138getYimpl(j), this.right + Offset.m1137getXimpl(j), this.bottom + Offset.m1138getYimpl(j));
    }

    public final Rect translate(float f, float f2) {
        return new Rect(this.left + f, this.top + f2, this.right + f, this.bottom + f2);
    }

    public final Rect intersect(Rect rect) {
        return new Rect(Math.max(this.left, rect.left), Math.max(this.top, rect.top), Math.min(this.right, rect.right), Math.min(this.bottom, rect.bottom));
    }

    public final Rect intersect(float f, float f2, float f3, float f4) {
        return new Rect(Math.max(this.left, f), Math.max(this.top, f2), Math.min(this.right, f3), Math.min(this.bottom, f4));
    }

    public final boolean overlaps(Rect rect) {
        return this.right > rect.left && rect.right > this.left && this.bottom > rect.top && rect.bottom > this.top;
    }

    /* renamed from: getTopLeft-F1C5BW0  reason: not valid java name */
    public final long m1158getTopLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.top);
    }

    /* renamed from: getTopRight-F1C5BW0  reason: not valid java name */
    public final long m1159getTopRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.top);
    }

    /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
    public final long m1156getCenterF1C5BW0() {
        return OffsetKt.Offset(this.left + (getWidth() / 2.0f), this.top + (getHeight() / 2.0f));
    }

    /* renamed from: getBottomLeft-F1C5BW0  reason: not valid java name */
    public final long m1154getBottomLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.bottom);
    }

    /* renamed from: getBottomRight-F1C5BW0  reason: not valid java name */
    public final long m1155getBottomRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.bottom);
    }

    /* renamed from: contains-k-4lQ0M  reason: not valid java name */
    public final boolean m1153containsk4lQ0M(long j) {
        return Offset.m1137getXimpl(j) >= this.left && Offset.m1137getXimpl(j) < this.right && Offset.m1138getYimpl(j) >= this.top && Offset.m1138getYimpl(j) < this.bottom;
    }

    public String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }
}
