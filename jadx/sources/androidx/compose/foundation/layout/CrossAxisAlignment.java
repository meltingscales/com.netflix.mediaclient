package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public abstract class CrossAxisAlignment {
    public static final Companion Companion = new Companion(null);
    private static final CrossAxisAlignment Center = CenterCrossAxisAlignment.INSTANCE;
    private static final CrossAxisAlignment Start = StartCrossAxisAlignment.INSTANCE;
    private static final CrossAxisAlignment End = EndCrossAxisAlignment.INSTANCE;

    public /* synthetic */ CrossAxisAlignment(C8627dsp c8627dsp) {
        this();
    }

    public abstract int align$foundation_layout_release(int i, LayoutDirection layoutDirection, Placeable placeable, int i2);

    public Integer calculateAlignmentLinePosition$foundation_layout_release(Placeable placeable) {
        return null;
    }

    public boolean isRelative$foundation_layout_release() {
        return false;
    }

    private CrossAxisAlignment() {
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final CrossAxisAlignment Relative$foundation_layout_release(AlignmentLineProvider alignmentLineProvider) {
            return new AlignmentLineCrossAxisAlignment(alignmentLineProvider);
        }

        public final CrossAxisAlignment vertical$foundation_layout_release(Alignment.Vertical vertical) {
            return new VerticalCrossAxisAlignment(vertical);
        }

        public final CrossAxisAlignment horizontal$foundation_layout_release(Alignment.Horizontal horizontal) {
            return new HorizontalCrossAxisAlignment(horizontal);
        }
    }

    /* loaded from: classes.dex */
    static final class CenterCrossAxisAlignment extends CrossAxisAlignment {
        public static final CenterCrossAxisAlignment INSTANCE = new CenterCrossAxisAlignment();

        private CenterCrossAxisAlignment() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i, LayoutDirection layoutDirection, Placeable placeable, int i2) {
            return i / 2;
        }
    }

    /* loaded from: classes.dex */
    static final class StartCrossAxisAlignment extends CrossAxisAlignment {
        public static final StartCrossAxisAlignment INSTANCE = new StartCrossAxisAlignment();

        private StartCrossAxisAlignment() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i, LayoutDirection layoutDirection, Placeable placeable, int i2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                return 0;
            }
            return i;
        }
    }

    /* loaded from: classes.dex */
    static final class EndCrossAxisAlignment extends CrossAxisAlignment {
        public static final EndCrossAxisAlignment INSTANCE = new EndCrossAxisAlignment();

        private EndCrossAxisAlignment() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i, LayoutDirection layoutDirection, Placeable placeable, int i2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                return i;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    static final class AlignmentLineCrossAxisAlignment extends CrossAxisAlignment {
        private final AlignmentLineProvider alignmentLineProvider;

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public boolean isRelative$foundation_layout_release() {
            return true;
        }

        public AlignmentLineCrossAxisAlignment(AlignmentLineProvider alignmentLineProvider) {
            super(null);
            this.alignmentLineProvider = alignmentLineProvider;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public Integer calculateAlignmentLinePosition$foundation_layout_release(Placeable placeable) {
            return Integer.valueOf(this.alignmentLineProvider.calculateAlignmentLinePosition(placeable));
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i, LayoutDirection layoutDirection, Placeable placeable, int i2) {
            int calculateAlignmentLinePosition = this.alignmentLineProvider.calculateAlignmentLinePosition(placeable);
            if (calculateAlignmentLinePosition != Integer.MIN_VALUE) {
                int i3 = i2 - calculateAlignmentLinePosition;
                return layoutDirection == LayoutDirection.Rtl ? i - i3 : i3;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    static final class VerticalCrossAxisAlignment extends CrossAxisAlignment {
        private final Alignment.Vertical vertical;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalCrossAxisAlignment) && C8632dsu.c(this.vertical, ((VerticalCrossAxisAlignment) obj).vertical);
        }

        public int hashCode() {
            return this.vertical.hashCode();
        }

        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.vertical + ')';
        }

        public VerticalCrossAxisAlignment(Alignment.Vertical vertical) {
            super(null);
            this.vertical = vertical;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i, LayoutDirection layoutDirection, Placeable placeable, int i2) {
            return this.vertical.align(0, i);
        }
    }

    /* loaded from: classes.dex */
    static final class HorizontalCrossAxisAlignment extends CrossAxisAlignment {
        private final Alignment.Horizontal horizontal;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalCrossAxisAlignment) && C8632dsu.c(this.horizontal, ((HorizontalCrossAxisAlignment) obj).horizontal);
        }

        public int hashCode() {
            return this.horizontal.hashCode();
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.horizontal + ')';
        }

        public HorizontalCrossAxisAlignment(Alignment.Horizontal horizontal) {
            super(null);
            this.horizontal = horizontal;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i, LayoutDirection layoutDirection, Placeable placeable, int i2) {
            return this.horizontal.align(0, i, layoutDirection);
        }
    }
}
