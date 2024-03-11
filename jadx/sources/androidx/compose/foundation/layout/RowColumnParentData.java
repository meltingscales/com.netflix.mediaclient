package androidx.compose.foundation.layout;

import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class RowColumnParentData {
    private CrossAxisAlignment crossAxisAlignment;
    private boolean fill;
    private float weight;

    public RowColumnParentData() {
        this(0.0f, false, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RowColumnParentData) {
            RowColumnParentData rowColumnParentData = (RowColumnParentData) obj;
            return Float.compare(this.weight, rowColumnParentData.weight) == 0 && this.fill == rowColumnParentData.fill && C8632dsu.c(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment);
        }
        return false;
    }

    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int hashCode = Float.hashCode(this.weight);
        int hashCode2 = Boolean.hashCode(this.fill);
        CrossAxisAlignment crossAxisAlignment = this.crossAxisAlignment;
        return (((hashCode * 31) + hashCode2) * 31) + (crossAxisAlignment == null ? 0 : crossAxisAlignment.hashCode());
    }

    public final void setCrossAxisAlignment(CrossAxisAlignment crossAxisAlignment) {
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public final void setFill(boolean z) {
        this.fill = z;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ')';
    }

    public RowColumnParentData(float f, boolean z, CrossAxisAlignment crossAxisAlignment) {
        this.weight = f;
        this.fill = z;
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public /* synthetic */ RowColumnParentData(float f, boolean z, CrossAxisAlignment crossAxisAlignment, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : crossAxisAlignment);
    }
}
