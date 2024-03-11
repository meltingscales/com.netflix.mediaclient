package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public abstract class ColorSpace {
    public static final Companion Companion = new Companion(null);
    private final int id;
    private final long model;
    private final String name;

    public /* synthetic */ ColorSpace(String str, long j, int i, C8627dsp c8627dsp) {
        this(str, j, i);
    }

    public abstract float[] fromXyz(float[] fArr);

    public final int getId$ui_graphics_release() {
        return this.id;
    }

    public abstract float getMaxValue(int i);

    public abstract float getMinValue(int i);

    /* renamed from: getModel-xdoWZVw  reason: not valid java name */
    public final long m1492getModelxdoWZVw() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    public boolean isSrgb() {
        return false;
    }

    public abstract float[] toXyz(float[] fArr);

    private ColorSpace(String str, long j, int i) {
        this.name = str;
        this.model = j;
        this.id = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public final int getComponentCount() {
        return ColorModel.m1485getComponentCountimpl(this.model);
    }

    public final float[] toXyz(float f, float f2, float f3) {
        return toXyz(new float[]{f, f2, f3});
    }

    public long toXy$ui_graphics_release(float f, float f2, float f3) {
        float[] xyz = toXyz(f, f2, f3);
        return (Float.floatToRawIntBits(xyz[0]) << 32) | (Float.floatToRawIntBits(xyz[1]) & 4294967295L);
    }

    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        return toXyz(f, f2, f3)[2];
    }

    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release  reason: not valid java name */
    public long mo1493xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        float[] fromXyz = fromXyz(f, f2, f3);
        return ColorKt.Color(fromXyz[0], fromXyz[1], fromXyz[2], f4, colorSpace);
    }

    public final float[] fromXyz(float f, float f2, float f3) {
        float[] fArr = new float[ColorModel.m1485getComponentCountimpl(this.model)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        return fromXyz(fArr);
    }

    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) ColorModel.m1487toStringimpl(this.model)) + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) obj;
        if (this.id == colorSpace.id && C8632dsu.c((Object) this.name, (Object) colorSpace.name)) {
            return ColorModel.m1484equalsimpl0(this.model, colorSpace.model);
        }
        return false;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + ColorModel.m1486hashCodeimpl(this.model)) * 31) + this.id;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
