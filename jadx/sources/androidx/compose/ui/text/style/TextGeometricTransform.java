package androidx.compose.ui.text.style;

import o.C8627dsp;

/* loaded from: classes.dex */
public final class TextGeometricTransform {
    public static final Companion Companion = new Companion(null);
    private static final TextGeometricTransform None = new TextGeometricTransform(1.0f, 0.0f);
    private final float scaleX;
    private final float skewX;

    public TextGeometricTransform() {
        this(0.0f, 0.0f, 3, null);
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getSkewX() {
        return this.skewX;
    }

    public TextGeometricTransform(float f, float f2) {
        this.scaleX = f;
        this.skewX = f2;
    }

    public /* synthetic */ TextGeometricTransform(float f, float f2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final TextGeometricTransform getNone$ui_text_release() {
            return TextGeometricTransform.None;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextGeometricTransform) {
            TextGeometricTransform textGeometricTransform = (TextGeometricTransform) obj;
            return this.scaleX == textGeometricTransform.scaleX && this.skewX == textGeometricTransform.skewX;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.scaleX) * 31) + Float.hashCode(this.skewX);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.scaleX + ", skewX=" + this.skewX + ')';
    }
}
