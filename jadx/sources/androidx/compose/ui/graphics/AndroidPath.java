package androidx.compose.ui.graphics;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.PathOperation;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class AndroidPath implements Path {
    private final android.graphics.Path internalPath;
    private android.graphics.Matrix mMatrix;
    private float[] radii;
    private RectF rectF;

    public AndroidPath() {
        this(null, 1, null);
    }

    public final android.graphics.Path getInternalPath() {
        return this.internalPath;
    }

    public AndroidPath(android.graphics.Path path) {
        this.internalPath = path;
    }

    public /* synthetic */ AndroidPath(android.graphics.Path path, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new android.graphics.Path() : path);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: getFillType-Rg-k1Os  reason: not valid java name */
    public int mo1220getFillTypeRgk1Os() {
        if (this.internalPath.getFillType() == Path.FillType.EVEN_ODD) {
            return PathFillType.Companion.m1405getEvenOddRgk1Os();
        }
        return PathFillType.Companion.m1406getNonZeroRgk1Os();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: setFillType-oQ8Xj4U  reason: not valid java name */
    public void mo1222setFillTypeoQ8Xj4U(int i) {
        Path.FillType fillType;
        android.graphics.Path path = this.internalPath;
        if (PathFillType.m1401equalsimpl0(i, PathFillType.Companion.m1405getEvenOddRgk1Os())) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void moveTo(float f, float f2) {
        this.internalPath.moveTo(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeMoveTo(float f, float f2) {
        this.internalPath.rMoveTo(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void lineTo(float f, float f2) {
        this.internalPath.lineTo(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeLineTo(float f, float f2) {
        this.internalPath.rLineTo(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void quadraticBezierTo(float f, float f2, float f3, float f4) {
        this.internalPath.quadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeQuadraticBezierTo(float f, float f2, float f3, float f4) {
        this.internalPath.rQuadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.internalPath.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeCubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.internalPath.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRect(Rect rect) {
        if (!_rectIsValid(rect)) {
            throw new IllegalStateException("invalid rect".toString());
        }
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        C8632dsu.d(rectF);
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        C8632dsu.d(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRoundRect(RoundRect roundRect) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        C8632dsu.d(rectF);
        rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        if (this.radii == null) {
            this.radii = new float[8];
        }
        float[] fArr = this.radii;
        C8632dsu.d(fArr);
        fArr[0] = CornerRadius.m1120getXimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs());
        fArr[1] = CornerRadius.m1121getYimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs());
        fArr[2] = CornerRadius.m1120getXimpl(roundRect.m1166getTopRightCornerRadiuskKHJgLs());
        fArr[3] = CornerRadius.m1121getYimpl(roundRect.m1166getTopRightCornerRadiuskKHJgLs());
        fArr[4] = CornerRadius.m1120getXimpl(roundRect.m1164getBottomRightCornerRadiuskKHJgLs());
        fArr[5] = CornerRadius.m1121getYimpl(roundRect.m1164getBottomRightCornerRadiuskKHJgLs());
        fArr[6] = CornerRadius.m1120getXimpl(roundRect.m1163getBottomLeftCornerRadiuskKHJgLs());
        fArr[7] = CornerRadius.m1121getYimpl(roundRect.m1163getBottomLeftCornerRadiuskKHJgLs());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        C8632dsu.d(rectF2);
        float[] fArr2 = this.radii;
        C8632dsu.d(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void close() {
        this.internalPath.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void reset() {
        this.internalPath.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void rewind() {
        this.internalPath.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: translate-k-4lQ0M  reason: not valid java name */
    public void mo1223translatek4lQ0M(long j) {
        android.graphics.Matrix matrix = this.mMatrix;
        if (matrix == null) {
            this.mMatrix = new android.graphics.Matrix();
        } else {
            C8632dsu.d(matrix);
            matrix.reset();
        }
        android.graphics.Matrix matrix2 = this.mMatrix;
        C8632dsu.d(matrix2);
        matrix2.setTranslate(Offset.m1137getXimpl(j), Offset.m1138getYimpl(j));
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix3 = this.mMatrix;
        C8632dsu.d(matrix3);
        path.transform(matrix3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public Rect getBounds() {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        C8632dsu.d(rectF);
        this.internalPath.computeBounds(rectF, true);
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: op-N5in7k0  reason: not valid java name */
    public boolean mo1221opN5in7k0(Path path, Path path2, int i) {
        Path.Op op;
        PathOperation.Companion companion = PathOperation.Companion;
        if (PathOperation.m1409equalsimpl0(i, companion.m1413getDifferenceb3I0S0c())) {
            op = Path.Op.DIFFERENCE;
        } else if (PathOperation.m1409equalsimpl0(i, companion.m1414getIntersectb3I0S0c())) {
            op = Path.Op.INTERSECT;
        } else if (PathOperation.m1409equalsimpl0(i, companion.m1415getReverseDifferenceb3I0S0c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = PathOperation.m1409equalsimpl0(i, companion.m1416getUnionb3I0S0c()) ? Path.Op.UNION : Path.Op.XOR;
        }
        android.graphics.Path path3 = this.internalPath;
        if (path instanceof AndroidPath) {
            android.graphics.Path internalPath = ((AndroidPath) path).getInternalPath();
            if (path2 instanceof AndroidPath) {
                return path3.op(internalPath, ((AndroidPath) path2).getInternalPath(), op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isConvex() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    private final boolean _rectIsValid(Rect rect) {
        if (!(!Float.isNaN(rect.getLeft()))) {
            throw new IllegalStateException("Rect.left is NaN".toString());
        }
        if (!(!Float.isNaN(rect.getTop()))) {
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        if (!(!Float.isNaN(rect.getRight()))) {
            throw new IllegalStateException("Rect.right is NaN".toString());
        }
        if (!Float.isNaN(rect.getBottom())) {
            return true;
        }
        throw new IllegalStateException("Rect.bottom is NaN".toString());
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: addPath-Uv8p0NA  reason: not valid java name */
    public void mo1219addPathUv8p0NA(Path path, long j) {
        android.graphics.Path path2 = this.internalPath;
        if (path instanceof AndroidPath) {
            path2.addPath(((AndroidPath) path).getInternalPath(), Offset.m1137getXimpl(j), Offset.m1138getYimpl(j));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
