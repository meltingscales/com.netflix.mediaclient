package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8563dqf;
import o.C8627dsp;
import o.C8632dsu;
import o.drX;
import o.dsT;

/* loaded from: classes.dex */
public final class Arrangement {
    public static final Arrangement INSTANCE = new Arrangement();
    private static final Horizontal Start = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Start$1
        public String toString() {
            return "Arrangement#Start";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i, iArr, iArr2, true);
            }
        }
    };
    private static final Horizontal End = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$End$1
        public String toString() {
            return "Arrangement#End";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, true);
            }
        }
    };
    private static final Vertical Top = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Top$1
        public String toString() {
            return "Arrangement#Top";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
        }
    };
    private static final Vertical Bottom = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Bottom$1
        public String toString() {
            return "Arrangement#Bottom";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i, iArr, iArr2, false);
        }
    };
    private static final HorizontalOrVertical Center = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$Center$1
        private final float spacing = Dp.m2492constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM  reason: not valid java name */
        public float mo233getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#Center";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeCenter$foundation_layout_release(i, iArr, iArr2, false);
        }
    };
    private static final HorizontalOrVertical SpaceEvenly = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1
        private final float spacing = Dp.m2492constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo233getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i, iArr, iArr2, false);
        }
    };
    private static final HorizontalOrVertical SpaceBetween = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceBetween$1
        private final float spacing = Dp.m2492constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo233getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i, iArr, iArr2, false);
        }
    };
    private static final HorizontalOrVertical SpaceAround = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceAround$1
        private final float spacing = Dp.m2492constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo233getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i, iArr, iArr2, false);
        }
    };

    public final Vertical getBottom() {
        return Bottom;
    }

    public final HorizontalOrVertical getCenter() {
        return Center;
    }

    public final Horizontal getEnd() {
        return End;
    }

    public final HorizontalOrVertical getSpaceBetween() {
        return SpaceBetween;
    }

    public final HorizontalOrVertical getSpaceEvenly() {
        return SpaceEvenly;
    }

    public final Horizontal getStart() {
        return Start;
    }

    public final Vertical getTop() {
        return Top;
    }

    private Arrangement() {
    }

    /* renamed from: spacedBy-0680j_4  reason: not valid java name */
    public final HorizontalOrVertical m230spacedBy0680j_4(float f) {
        return new SpacedAligned(f, true, new drX<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$1
            @Override // o.drX
            public /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }

            public final Integer invoke(int i, LayoutDirection layoutDirection) {
                return Integer.valueOf(Alignment.Companion.getStart().align(0, i, layoutDirection));
            }
        }, null);
    }

    /* renamed from: spacedBy-D5KLDUw  reason: not valid java name */
    public final Horizontal m231spacedByD5KLDUw(float f, final Alignment.Horizontal horizontal) {
        return new SpacedAligned(f, true, new drX<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }

            public final Integer invoke(int i, LayoutDirection layoutDirection) {
                return Integer.valueOf(Alignment.Horizontal.this.align(0, i, layoutDirection));
            }
        }, null);
    }

    /* renamed from: spacedBy-D5KLDUw  reason: not valid java name */
    public final Vertical m232spacedByD5KLDUw(float f, final Alignment.Vertical vertical) {
        return new SpacedAligned(f, false, new drX<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final Integer invoke(int i, LayoutDirection layoutDirection) {
                return Integer.valueOf(Alignment.Vertical.this.align(0, i));
            }

            @Override // o.drX
            public /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }
        }, null);
    }

    /* loaded from: classes.dex */
    public static final class SpacedAligned implements HorizontalOrVertical {
        private final drX<Integer, LayoutDirection, Integer> alignment;
        private final boolean rtlMirror;
        private final float space;
        private final float spacing;

        public /* synthetic */ SpacedAligned(float f, boolean z, drX drx, C8627dsp c8627dsp) {
            this(f, z, drx);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SpacedAligned) {
                SpacedAligned spacedAligned = (SpacedAligned) obj;
                return Dp.m2494equalsimpl0(this.space, spacedAligned.space) && this.rtlMirror == spacedAligned.rtlMirror && C8632dsu.c(this.alignment, spacedAligned.alignment);
            }
            return false;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo233getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public int hashCode() {
            int m2495hashCodeimpl = Dp.m2495hashCodeimpl(this.space);
            int hashCode = Boolean.hashCode(this.rtlMirror);
            drX<Integer, LayoutDirection, Integer> drx = this.alignment;
            return (((m2495hashCodeimpl * 31) + hashCode) * 31) + (drx == null ? 0 : drx.hashCode());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private SpacedAligned(float f, boolean z, drX<? super Integer, ? super LayoutDirection, Integer> drx) {
            this.space = f;
            this.rtlMirror = z;
            this.alignment = drx;
            this.spacing = f;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i2;
            int i3;
            if (iArr.length == 0) {
                return;
            }
            int mo187roundToPx0680j_4 = density.mo187roundToPx0680j_4(this.space);
            boolean z = this.rtlMirror && layoutDirection == LayoutDirection.Rtl;
            Arrangement arrangement = Arrangement.INSTANCE;
            if (!z) {
                int length = iArr.length;
                i2 = 0;
                int i4 = 0;
                i3 = 0;
                int i5 = 0;
                while (i4 < length) {
                    int i6 = iArr[i4];
                    int min = Math.min(i2, i - i6);
                    iArr2[i5] = min;
                    int min2 = Math.min(mo187roundToPx0680j_4, (i - min) - i6);
                    int i7 = iArr2[i5];
                    i4++;
                    i5++;
                    i3 = min2;
                    i2 = i7 + i6 + min2;
                }
            } else {
                i2 = 0;
                i3 = 0;
                for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                    int i8 = iArr[length2];
                    int min3 = Math.min(i2, i - i8);
                    iArr2[length2] = min3;
                    i3 = Math.min(mo187roundToPx0680j_4, (i - min3) - i8);
                    i2 = iArr2[length2] + i8 + i3;
                }
            }
            int i9 = i2 - i3;
            drX<Integer, LayoutDirection, Integer> drx = this.alignment;
            if (drx == null || i9 >= i) {
                return;
            }
            int intValue = drx.invoke(Integer.valueOf(i - i9), layoutDirection).intValue();
            int length3 = iArr2.length;
            for (int i10 = 0; i10 < length3; i10++) {
                iArr2[i10] = iArr2[i10] + intValue;
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            arrange(density, i, iArr, LayoutDirection.Ltr, iArr2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.rtlMirror ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) Dp.m2496toStringimpl(this.space));
            sb.append(", ");
            sb.append(this.alignment);
            sb.append(')');
            return sb.toString();
        }
    }

    public final void placeSpaceBetween$foundation_layout_release(int i, int[] iArr, int[] iArr2, boolean z) {
        int g;
        int e;
        int e2;
        if (iArr.length == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        g = C8563dqf.g(iArr);
        float max = (i - i3) / Math.max(g, 1);
        float f = (z && iArr.length == 1) ? max : 0.0f;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                e2 = dsT.e(f);
                iArr2[i5] = e2;
                f += i6 + max;
                i2++;
                i5++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i7 = iArr[length2];
            e = dsT.e(f);
            iArr2[length2] = e;
            f += i7 + max;
        }
    }

    /* loaded from: classes.dex */
    public interface Horizontal {
        void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);

        /* renamed from: getSpacing-D9Ej5fM */
        default float mo233getSpacingD9Ej5fM() {
            return Dp.m2492constructorimpl(0);
        }
    }

    /* loaded from: classes.dex */
    public interface HorizontalOrVertical extends Horizontal, Vertical {
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        default float mo233getSpacingD9Ej5fM() {
            return Dp.m2492constructorimpl(0);
        }
    }

    /* loaded from: classes.dex */
    public interface Vertical {
        void arrange(Density density, int i, int[] iArr, int[] iArr2);

        /* renamed from: getSpacing-D9Ej5fM */
        default float mo233getSpacingD9Ej5fM() {
            return Dp.m2492constructorimpl(0);
        }
    }

    public final void placeRightOrBottom$foundation_layout_release(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = i5;
            i5 += i8;
        }
    }

    public final void placeLeftOrTop$foundation_layout_release(int[] iArr, int[] iArr2, boolean z) {
        int i = 0;
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                iArr2[i2] = i3;
                i3 += i4;
                i++;
                i2++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i5 = iArr[length2];
            iArr2[length2] = i;
            i += i5;
        }
    }

    public final void placeCenter$foundation_layout_release(int i, int[] iArr, int[] iArr2, boolean z) {
        int e;
        int e2;
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / 2;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                e2 = dsT.e(f);
                iArr2[i5] = e2;
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = iArr[length2];
            e = dsT.e(f);
            iArr2[length2] = e;
            f += i7;
        }
    }

    public final void placeSpaceEvenly$foundation_layout_release(int i, int[] iArr, int[] iArr2, boolean z) {
        int e;
        int e2;
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (i - i3) / (iArr.length + 1);
        if (!z) {
            int length2 = iArr.length;
            float f = length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                e2 = dsT.e(f);
                iArr2[i5] = e2;
                f += i6 + length;
                i2++;
                i5++;
            }
            return;
        }
        float f2 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i7 = iArr[length3];
            e = dsT.e(f2);
            iArr2[length3] = e;
            f2 += i7 + length;
        }
    }

    public final void placeSpaceAround$foundation_layout_release(int i, int[] iArr, int[] iArr2, boolean z) {
        int e;
        int e2;
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (iArr.length == 0) ^ true ? (i - i3) / iArr.length : 0.0f;
        float f = length / 2;
        if (!z) {
            int length2 = iArr.length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                e2 = dsT.e(f);
                iArr2[i5] = e2;
                f += i6 + length;
                i2++;
                i5++;
            }
            return;
        }
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i7 = iArr[length3];
            e = dsT.e(f);
            iArr2[length3] = e;
            f += i7 + length;
        }
    }
}
