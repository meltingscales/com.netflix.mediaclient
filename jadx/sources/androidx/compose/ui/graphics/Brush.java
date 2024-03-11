package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import java.util.List;
import o.C8627dsp;

/* loaded from: classes.dex */
public abstract class Brush {
    public static final Companion Companion = new Companion(null);
    private final long intrinsicSize;

    public /* synthetic */ Brush(C8627dsp c8627dsp) {
        this();
    }

    /* renamed from: applyTo-Pq9zytI  reason: not valid java name */
    public abstract void mo1264applyToPq9zytI(long j, Paint paint, float f);

    private Brush() {
        this.intrinsicSize = Size.Companion.m1181getUnspecifiedNHjbRc();
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: linearGradient-mHitzGk$default  reason: not valid java name */
        public static /* synthetic */ Brush m1266linearGradientmHitzGk$default(Companion companion, List list, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m1149getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = Offset.Companion.m1147getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m1466getClamp3opZhB0();
            }
            return companion.m1269linearGradientmHitzGk(list, j3, j4, i);
        }

        /* renamed from: linearGradient-mHitzGk  reason: not valid java name */
        public final Brush m1269linearGradientmHitzGk(List<Color> list, long j, long j2, int i) {
            return new LinearGradient(list, null, j, j2, i, null);
        }

        /* renamed from: horizontalGradient-8A-3gB4$default  reason: not valid java name */
        public static /* synthetic */ Brush m1265horizontalGradient8A3gB4$default(Companion companion, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m1466getClamp3opZhB0();
            }
            return companion.m1268horizontalGradient8A3gB4(list, f, f2, i);
        }

        /* renamed from: horizontalGradient-8A-3gB4  reason: not valid java name */
        public final Brush m1268horizontalGradient8A3gB4(List<Color> list, float f, float f2, int i) {
            return m1269linearGradientmHitzGk(list, OffsetKt.Offset(f, 0.0f), OffsetKt.Offset(f2, 0.0f), i);
        }

        /* renamed from: verticalGradient-8A-3gB4$default  reason: not valid java name */
        public static /* synthetic */ Brush m1267verticalGradient8A3gB4$default(Companion companion, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m1466getClamp3opZhB0();
            }
            return companion.m1270verticalGradient8A3gB4(list, f, f2, i);
        }

        /* renamed from: verticalGradient-8A-3gB4  reason: not valid java name */
        public final Brush m1270verticalGradient8A3gB4(List<Color> list, float f, float f2, int i) {
            return m1269linearGradientmHitzGk(list, OffsetKt.Offset(0.0f, f), OffsetKt.Offset(0.0f, f2), i);
        }
    }
}
