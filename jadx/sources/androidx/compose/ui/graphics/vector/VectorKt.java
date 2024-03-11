package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import o.C8569dql;

/* loaded from: classes.dex */
public final class VectorKt {
    private static final int DefaultFillType;
    private static final int DefaultStrokeLineCap;
    private static final int DefaultStrokeLineJoin;
    private static final int DefaultTintBlendMode;
    private static final long DefaultTintColor;
    private static final List<PathNode> EmptyPath;

    public static final int getDefaultFillType() {
        return DefaultFillType;
    }

    public static final int getDefaultStrokeLineCap() {
        return DefaultStrokeLineCap;
    }

    public static final int getDefaultStrokeLineJoin() {
        return DefaultStrokeLineJoin;
    }

    public static final List<PathNode> getEmptyPath() {
        return EmptyPath;
    }

    static {
        List<PathNode> i;
        i = C8569dql.i();
        EmptyPath = i;
        DefaultStrokeLineCap = StrokeCap.Companion.m1448getButtKaPHkGw();
        DefaultStrokeLineJoin = StrokeJoin.Companion.m1458getMiterLxFBmk8();
        DefaultTintBlendMode = BlendMode.Companion.m1258getSrcIn0nO6VwU();
        DefaultTintColor = Color.Companion.m1308getTransparent0d7_KjU();
        DefaultFillType = PathFillType.Companion.m1406getNonZeroRgk1Os();
    }

    public static final List<PathNode> addPathNodes(String str) {
        return str == null ? EmptyPath : new PathParser().parsePathString(str).toNodes();
    }

    /* renamed from: rgbEqual--OWjLjI  reason: not valid java name */
    public static final boolean m1590rgbEqualOWjLjI(long j, long j2) {
        return Color.m1299getRedimpl(j) == Color.m1299getRedimpl(j2) && Color.m1298getGreenimpl(j) == Color.m1298getGreenimpl(j2) && Color.m1296getBlueimpl(j) == Color.m1296getBlueimpl(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean tintableWithAlphaMask(androidx.compose.ui.graphics.ColorFilter r3) {
        /*
            boolean r0 = r3 instanceof androidx.compose.ui.graphics.BlendModeColorFilter
            if (r0 == 0) goto L25
            androidx.compose.ui.graphics.BlendModeColorFilter r3 = (androidx.compose.ui.graphics.BlendModeColorFilter) r3
            int r0 = r3.m1262getBlendMode0nO6VwU()
            androidx.compose.ui.graphics.BlendMode$Companion r1 = androidx.compose.ui.graphics.BlendMode.Companion
            int r2 = r1.m1258getSrcIn0nO6VwU()
            boolean r0 = androidx.compose.ui.graphics.BlendMode.m1229equalsimpl0(r0, r2)
            if (r0 != 0) goto L27
            int r3 = r3.m1262getBlendMode0nO6VwU()
            int r0 = r1.m1260getSrcOver0nO6VwU()
            boolean r3 = androidx.compose.ui.graphics.BlendMode.m1229equalsimpl0(r3, r0)
            if (r3 == 0) goto L29
            goto L27
        L25:
            if (r3 != 0) goto L29
        L27:
            r3 = 1
            goto L2a
        L29:
            r3 = 0
        L2a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorKt.tintableWithAlphaMask(androidx.compose.ui.graphics.ColorFilter):boolean");
    }
}
