package androidx.compose.ui.unit;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class Constraints {
    private final long value;
    public static final Companion Companion = new Companion(null);
    private static final int[] MinHeightOffsets = {18, 20, 17, 15};
    private static final int[] WidthMask = {65535, 262143, 32767, 8191};
    private static final int[] HeightMask = {32767, 8191, 65535, 262143};

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Constraints m2461boximpl(long j) {
        return new Constraints(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m2462constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2465equalsimpl(long j, Object obj) {
        return (obj instanceof Constraints) && j == ((Constraints) obj).m2478unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2466equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getFocusIndex-impl  reason: not valid java name */
    private static final int m2467getFocusIndeximpl(long j) {
        return (int) (j & 3);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2476hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m2465equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2476hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m2478unboximpl() {
        return this.value;
    }

    private /* synthetic */ Constraints(long j) {
        this.value = j;
    }

    /* renamed from: getMinWidth-impl  reason: not valid java name */
    public static final int m2475getMinWidthimpl(long j) {
        return ((int) (j >> 2)) & WidthMask[m2467getFocusIndeximpl(j)];
    }

    /* renamed from: getMaxWidth-impl  reason: not valid java name */
    public static final int m2473getMaxWidthimpl(long j) {
        int i = ((int) (j >> 33)) & WidthMask[m2467getFocusIndeximpl(j)];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    /* renamed from: getMinHeight-impl  reason: not valid java name */
    public static final int m2474getMinHeightimpl(long j) {
        int m2467getFocusIndeximpl = m2467getFocusIndeximpl(j);
        return ((int) (j >> MinHeightOffsets[m2467getFocusIndeximpl])) & HeightMask[m2467getFocusIndeximpl];
    }

    /* renamed from: getMaxHeight-impl  reason: not valid java name */
    public static final int m2472getMaxHeightimpl(long j) {
        int m2467getFocusIndeximpl = m2467getFocusIndeximpl(j);
        int i = ((int) (j >> (MinHeightOffsets[m2467getFocusIndeximpl] + 31))) & HeightMask[m2467getFocusIndeximpl];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    /* renamed from: getHasBoundedWidth-impl  reason: not valid java name */
    public static final boolean m2469getHasBoundedWidthimpl(long j) {
        return (((int) (j >> 33)) & WidthMask[m2467getFocusIndeximpl(j)]) != 0;
    }

    /* renamed from: getHasBoundedHeight-impl  reason: not valid java name */
    public static final boolean m2468getHasBoundedHeightimpl(long j) {
        int m2467getFocusIndeximpl = m2467getFocusIndeximpl(j);
        return (((int) (j >> (MinHeightOffsets[m2467getFocusIndeximpl] + 31))) & HeightMask[m2467getFocusIndeximpl]) != 0;
    }

    /* renamed from: getHasFixedWidth-impl  reason: not valid java name */
    public static final boolean m2471getHasFixedWidthimpl(long j) {
        return m2473getMaxWidthimpl(j) == m2475getMinWidthimpl(j);
    }

    /* renamed from: getHasFixedHeight-impl  reason: not valid java name */
    public static final boolean m2470getHasFixedHeightimpl(long j) {
        return m2472getMaxHeightimpl(j) == m2474getMinHeightimpl(j);
    }

    /* renamed from: copy-Zbe2FdA$default  reason: not valid java name */
    public static /* synthetic */ long m2464copyZbe2FdA$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = m2475getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = m2473getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = m2474getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = m2472getMaxHeightimpl(j);
        }
        return m2463copyZbe2FdA(j, i6, i7, i8, i4);
    }

    /* renamed from: copy-Zbe2FdA  reason: not valid java name */
    public static final long m2463copyZbe2FdA(long j, int i, int i2, int i3, int i4) {
        if (i3 < 0 || i < 0) {
            throw new IllegalArgumentException(("minHeight(" + i3 + ") and minWidth(" + i + ") must be >= 0").toString());
        } else if (i2 < i && i2 != Integer.MAX_VALUE) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= minWidth(" + i + ')').toString());
        } else if (i4 < i3 && i4 != Integer.MAX_VALUE) {
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= minHeight(" + i3 + ')').toString());
        } else {
            return Companion.m2479createConstraintsZbe2FdA$ui_unit_release(i, i2, i3, i4);
        }
    }

    public String toString() {
        return m2477toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2477toStringimpl(long j) {
        int m2473getMaxWidthimpl = m2473getMaxWidthimpl(j);
        String valueOf = m2473getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(m2473getMaxWidthimpl);
        int m2472getMaxHeightimpl = m2472getMaxHeightimpl(j);
        String valueOf2 = m2472getMaxHeightimpl != Integer.MAX_VALUE ? String.valueOf(m2472getMaxHeightimpl) : "Infinity";
        return "Constraints(minWidth = " + m2475getMinWidthimpl(j) + ", maxWidth = " + valueOf + ", minHeight = " + m2474getMinHeightimpl(j) + ", maxHeight = " + valueOf2 + ')';
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: fixed-JhjzzOo  reason: not valid java name */
        public final long m2480fixedJhjzzOo(int i, int i2) {
            if (i < 0 || i2 < 0) {
                throw new IllegalArgumentException(("width(" + i + ") and height(" + i2 + ") must be >= 0").toString());
            }
            return m2479createConstraintsZbe2FdA$ui_unit_release(i, i, i2, i2);
        }

        /* renamed from: fixedWidth-OenEA2s  reason: not valid java name */
        public final long m2482fixedWidthOenEA2s(int i) {
            if (i < 0) {
                throw new IllegalArgumentException(("width(" + i + ") must be >= 0").toString());
            }
            return m2479createConstraintsZbe2FdA$ui_unit_release(i, i, 0, Integer.MAX_VALUE);
        }

        /* renamed from: fixedHeight-OenEA2s  reason: not valid java name */
        public final long m2481fixedHeightOenEA2s(int i) {
            if (i < 0) {
                throw new IllegalArgumentException(("height(" + i + ") must be >= 0").toString());
            }
            return m2479createConstraintsZbe2FdA$ui_unit_release(0, Integer.MAX_VALUE, i, i);
        }

        /* renamed from: createConstraints-Zbe2FdA$ui_unit_release  reason: not valid java name */
        public final long m2479createConstraintsZbe2FdA$ui_unit_release(int i, int i2, int i3, int i4) {
            long j;
            int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
            int bitsNeedForSize = bitsNeedForSize(i5);
            int i6 = i2 == Integer.MAX_VALUE ? i : i2;
            int bitsNeedForSize2 = bitsNeedForSize(i6);
            if (bitsNeedForSize + bitsNeedForSize2 > 31) {
                throw new IllegalArgumentException("Can't represent a width of " + i6 + " and height of " + i5 + " in Constraints");
            }
            if (bitsNeedForSize2 == 13) {
                j = 3;
            } else if (bitsNeedForSize2 == 18) {
                j = 1;
            } else if (bitsNeedForSize2 == 15) {
                j = 2;
            } else if (bitsNeedForSize2 != 16) {
                throw new IllegalStateException("Should only have the provided constants.");
            } else {
                j = 0;
            }
            int i7 = i2 == Integer.MAX_VALUE ? 0 : i2 + 1;
            int i8 = i4 != Integer.MAX_VALUE ? i4 + 1 : 0;
            int i9 = Constraints.MinHeightOffsets[(int) j];
            return Constraints.m2462constructorimpl((i7 << 33) | j | (i << 2) | (i3 << i9) | (i8 << (i9 + 31)));
        }

        private final int bitsNeedForSize(int i) {
            if (i < 8191) {
                return 13;
            }
            if (i < 32767) {
                return 15;
            }
            if (i < 65535) {
                return 16;
            }
            if (i < 262143) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
        }
    }
}
