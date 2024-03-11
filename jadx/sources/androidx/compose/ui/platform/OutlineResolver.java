package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8632dsu;
import o.dsT;

/* loaded from: classes.dex */
public final class OutlineResolver {
    private boolean cacheIsDirty;
    private final Outline cachedOutline;
    private Path cachedRrectPath;
    private androidx.compose.ui.graphics.Outline calculatedOutline;
    private Density density;
    private boolean isSupportedOutline = true;
    private LayoutDirection layoutDirection;
    private boolean outlineNeeded;
    private Path outlinePath;
    private long rectSize;
    private long rectTopLeft;
    private float roundedCornerRadius;
    private Shape shape;
    private long size;
    private Path tmpOpPath;
    private Path tmpPath;
    private RoundRect tmpRoundRect;
    private Path tmpTouchPointPath;
    private boolean usePathForClip;

    public final boolean getCacheIsDirty$ui_release() {
        return this.cacheIsDirty;
    }

    public final boolean getOutlineClipSupported() {
        return !this.usePathForClip;
    }

    public OutlineResolver(Density density) {
        this.density = density;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        Size.Companion companion = Size.Companion;
        this.size = companion.m1182getZeroNHjbRc();
        this.shape = RectangleShapeKt.getRectangleShape();
        this.rectTopLeft = Offset.Companion.m1149getZeroF1C5BW0();
        this.rectSize = companion.m1182getZeroNHjbRc();
        this.layoutDirection = LayoutDirection.Ltr;
    }

    public final Outline getOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final Path getClipPath() {
        updateCache();
        return this.outlinePath;
    }

    public final boolean update(Shape shape, float f, boolean z, float f2, LayoutDirection layoutDirection, Density density) {
        this.cachedOutline.setAlpha(f);
        boolean z2 = !C8632dsu.c(this.shape, shape);
        if (z2) {
            this.shape = shape;
            this.cacheIsDirty = true;
        }
        boolean z3 = z || f2 > 0.0f;
        if (this.outlineNeeded != z3) {
            this.outlineNeeded = z3;
            this.cacheIsDirty = true;
        }
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            this.cacheIsDirty = true;
        }
        if (!C8632dsu.c(this.density, density)) {
            this.density = density;
            this.cacheIsDirty = true;
        }
        return z2;
    }

    /* renamed from: isInOutline-k-4lQ0M  reason: not valid java name */
    public final boolean m2013isInOutlinek4lQ0M(long j) {
        androidx.compose.ui.graphics.Outline outline;
        if (this.outlineNeeded && (outline = this.calculatedOutline) != null) {
            return ShapeContainingUtilKt.isInOutline(outline, Offset.m1137getXimpl(j), Offset.m1138getYimpl(j), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    public final void clipToOutline(Canvas canvas) {
        Path clipPath = getClipPath();
        if (clipPath != null) {
            Canvas.m1272clipPathmtrdDE$default(canvas, clipPath, 0, 2, null);
            return;
        }
        float f = this.roundedCornerRadius;
        if (f > 0.0f) {
            Path path = this.tmpPath;
            RoundRect roundRect = this.tmpRoundRect;
            if (path == null || !m2012isSameBounds4L21HEs(roundRect, this.rectTopLeft, this.rectSize, f)) {
                float m1137getXimpl = Offset.m1137getXimpl(this.rectTopLeft);
                float m1138getYimpl = Offset.m1138getYimpl(this.rectTopLeft);
                float m1137getXimpl2 = Offset.m1137getXimpl(this.rectTopLeft);
                float m1176getWidthimpl = Size.m1176getWidthimpl(this.rectSize);
                RoundRect m1168RoundRectgG7oq9Y = RoundRectKt.m1168RoundRectgG7oq9Y(m1137getXimpl, m1138getYimpl, m1137getXimpl2 + m1176getWidthimpl, Offset.m1138getYimpl(this.rectTopLeft) + Size.m1174getHeightimpl(this.rectSize), CornerRadiusKt.CornerRadius$default(this.roundedCornerRadius, 0.0f, 2, null));
                if (path == null) {
                    path = AndroidPath_androidKt.Path();
                } else {
                    path.reset();
                }
                path.addRoundRect(m1168RoundRectgG7oq9Y);
                this.tmpRoundRect = m1168RoundRectgG7oq9Y;
                this.tmpPath = path;
            }
            Canvas.m1272clipPathmtrdDE$default(canvas, path, 0, 2, null);
            return;
        }
        Canvas.m1273clipRectN_I0leg$default(canvas, Offset.m1137getXimpl(this.rectTopLeft), Offset.m1138getYimpl(this.rectTopLeft), Offset.m1137getXimpl(this.rectTopLeft) + Size.m1176getWidthimpl(this.rectSize), Offset.m1138getYimpl(this.rectTopLeft) + Size.m1174getHeightimpl(this.rectSize), 0, 16, null);
    }

    /* renamed from: update-uvyYCjk  reason: not valid java name */
    public final void m2014updateuvyYCjk(long j) {
        if (Size.m1173equalsimpl0(this.size, j)) {
            return;
        }
        this.size = j;
        this.cacheIsDirty = true;
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = Offset.Companion.m1149getZeroF1C5BW0();
            long j = this.size;
            this.rectSize = j;
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            if (this.outlineNeeded && Size.m1176getWidthimpl(j) > 0.0f && Size.m1174getHeightimpl(this.size) > 0.0f) {
                this.isSupportedOutline = true;
                androidx.compose.ui.graphics.Outline mo139createOutlinePq9zytI = this.shape.mo139createOutlinePq9zytI(this.size, this.layoutDirection, this.density);
                this.calculatedOutline = mo139createOutlinePq9zytI;
                if (mo139createOutlinePq9zytI instanceof Outline.Rectangle) {
                    updateCacheWithRect(((Outline.Rectangle) mo139createOutlinePq9zytI).getRect());
                    return;
                } else if (mo139createOutlinePq9zytI instanceof Outline.Rounded) {
                    updateCacheWithRoundRect(((Outline.Rounded) mo139createOutlinePq9zytI).getRoundRect());
                    return;
                } else if (mo139createOutlinePq9zytI instanceof Outline.Generic) {
                    updateCacheWithPath(((Outline.Generic) mo139createOutlinePq9zytI).getPath());
                    return;
                } else {
                    return;
                }
            }
            this.cachedOutline.setEmpty();
        }
    }

    private final void updateCacheWithRect(Rect rect) {
        int e;
        int e2;
        int e3;
        int e4;
        this.rectTopLeft = OffsetKt.Offset(rect.getLeft(), rect.getTop());
        this.rectSize = SizeKt.Size(rect.getWidth(), rect.getHeight());
        android.graphics.Outline outline = this.cachedOutline;
        e = dsT.e(rect.getLeft());
        e2 = dsT.e(rect.getTop());
        e3 = dsT.e(rect.getRight());
        e4 = dsT.e(rect.getBottom());
        outline.setRect(e, e2, e3, e4);
    }

    private final void updateCacheWithRoundRect(RoundRect roundRect) {
        int e;
        int e2;
        int e3;
        int e4;
        float m1120getXimpl = CornerRadius.m1120getXimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs());
        this.rectTopLeft = OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
        this.rectSize = SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
        if (RoundRectKt.isSimple(roundRect)) {
            android.graphics.Outline outline = this.cachedOutline;
            e = dsT.e(roundRect.getLeft());
            e2 = dsT.e(roundRect.getTop());
            e3 = dsT.e(roundRect.getRight());
            e4 = dsT.e(roundRect.getBottom());
            outline.setRoundRect(e, e2, e3, e4, m1120getXimpl);
            this.roundedCornerRadius = m1120getXimpl;
            return;
        }
        Path path = this.cachedRrectPath;
        if (path == null) {
            path = AndroidPath_androidKt.Path();
            this.cachedRrectPath = path;
        }
        path.reset();
        path.addRoundRect(roundRect);
        updateCacheWithPath(path);
    }

    private final void updateCacheWithPath(Path path) {
        if (Build.VERSION.SDK_INT <= 28 && !path.isConvex()) {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        } else {
            android.graphics.Outline outline = this.cachedOutline;
            if (path instanceof AndroidPath) {
                outline.setConvexPath(((AndroidPath) path).getInternalPath());
                this.usePathForClip = !this.cachedOutline.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        }
        this.outlinePath = path;
    }

    /* renamed from: isSameBounds-4L21HEs  reason: not valid java name */
    private final boolean m2012isSameBounds4L21HEs(RoundRect roundRect, long j, long j2, float f) {
        return roundRect != null && RoundRectKt.isSimple(roundRect) && roundRect.getLeft() == Offset.m1137getXimpl(j) && roundRect.getTop() == Offset.m1138getYimpl(j) && roundRect.getRight() == Offset.m1137getXimpl(j) + Size.m1176getWidthimpl(j2) && roundRect.getBottom() == Offset.m1138getYimpl(j) + Size.m1174getHeightimpl(j2) && CornerRadius.m1120getXimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs()) == f;
    }
}
