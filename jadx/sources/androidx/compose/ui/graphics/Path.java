package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;

/* loaded from: classes.dex */
public interface Path {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: addPath-Uv8p0NA */
    void mo1219addPathUv8p0NA(Path path, long j);

    void addRect(Rect rect);

    void addRoundRect(RoundRect roundRect);

    void close();

    void cubicTo(float f, float f2, float f3, float f4, float f5, float f6);

    Rect getBounds();

    /* renamed from: getFillType-Rg-k1Os */
    int mo1220getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    void lineTo(float f, float f2);

    void moveTo(float f, float f2);

    /* renamed from: op-N5in7k0 */
    boolean mo1221opN5in7k0(Path path, Path path2, int i);

    void quadraticBezierTo(float f, float f2, float f3, float f4);

    void relativeCubicTo(float f, float f2, float f3, float f4, float f5, float f6);

    void relativeLineTo(float f, float f2);

    void relativeMoveTo(float f, float f2);

    void relativeQuadraticBezierTo(float f, float f2, float f3, float f4);

    void reset();

    /* renamed from: setFillType-oQ8Xj4U */
    void mo1222setFillTypeoQ8Xj4U(int i);

    /* renamed from: translate-k-4lQ0M */
    void mo1223translatek4lQ0M(long j);

    /* renamed from: addPath-Uv8p0NA$default  reason: not valid java name */
    static /* synthetic */ void m1398addPathUv8p0NA$default(Path path, Path path2, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i & 2) != 0) {
            j = Offset.Companion.m1149getZeroF1C5BW0();
        }
        path.mo1219addPathUv8p0NA(path2, j);
    }

    default void rewind() {
        reset();
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
