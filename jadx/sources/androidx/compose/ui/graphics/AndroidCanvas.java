package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes.dex */
public final class AndroidCanvas implements Canvas {
    private Rect dstRect;
    private android.graphics.Canvas internalCanvas;
    private Rect srcRect;

    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    public final void setInternalCanvas(android.graphics.Canvas canvas) {
        this.internalCanvas = canvas;
    }

    public AndroidCanvas() {
        android.graphics.Canvas canvas;
        canvas = AndroidCanvas_androidKt.EmptyCanvas;
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        this.internalCanvas.saveLayer(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint.asFrameworkPaint(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float f, float f2) {
        this.internalCanvas.translate(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float f, float f2) {
        this.internalCanvas.scale(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float f) {
        this.internalCanvas.rotate(f);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: concat-58bKbWc  reason: not valid java name */
    public void mo1189concat58bKbWc(float[] fArr) {
        if (MatrixKt.m1385isIdentity58bKbWc(fArr)) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        AndroidMatrixConversions_androidKt.m1200setFromEL8BTi8(matrix, fArr);
        this.internalCanvas.concat(matrix);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg  reason: not valid java name */
    public void mo1188clipRectN_I0leg(float f, float f2, float f3, float f4, int i) {
        this.internalCanvas.clipRect(f, f2, f3, f4, m1195toRegionOp7u2Bmg(i));
    }

    /* renamed from: toRegionOp--7u2Bmg  reason: not valid java name */
    public final Region.Op m1195toRegionOp7u2Bmg(int i) {
        return ClipOp.m1278equalsimpl0(i, ClipOp.Companion.m1282getDifferencertfAjoo()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g  reason: not valid java name */
    public void mo1193drawLineWko1d7g(long j, long j2, Paint paint) {
        this.internalCanvas.drawLine(Offset.m1137getXimpl(j), Offset.m1138getYimpl(j), Offset.m1137getXimpl(j2), Offset.m1138getYimpl(j2), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        this.internalCanvas.drawRect(f, f2, f3, f4, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        this.internalCanvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        this.internalCanvas.drawOval(f, f2, f3, f4, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo  reason: not valid java name */
    public void mo1190drawCircle9KIMszo(long j, float f, Paint paint) {
        this.internalCanvas.drawCircle(Offset.m1137getXimpl(j), Offset.m1138getYimpl(j), f, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        this.internalCanvas.drawArc(f, f2, f3, f4, f5, f6, z, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I  reason: not valid java name */
    public void mo1191drawImaged4ec7I(ImageBitmap imageBitmap, long j, Paint paint) {
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), Offset.m1137getXimpl(j), Offset.m1138getYimpl(j), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0  reason: not valid java name */
    public void mo1192drawImageRectHPBpro0(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint) {
        if (this.srcRect == null) {
            this.srcRect = new Rect();
            this.dstRect = new Rect();
        }
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap asAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap);
        Rect rect = this.srcRect;
        C8632dsu.d(rect);
        rect.left = IntOffset.m2533getXimpl(j);
        rect.top = IntOffset.m2534getYimpl(j);
        rect.right = IntOffset.m2533getXimpl(j) + IntSize.m2547getWidthimpl(j2);
        rect.bottom = IntOffset.m2534getYimpl(j) + IntSize.m2546getHeightimpl(j2);
        dpR dpr = dpR.c;
        Rect rect2 = this.dstRect;
        C8632dsu.d(rect2);
        rect2.left = IntOffset.m2533getXimpl(j3);
        rect2.top = IntOffset.m2534getYimpl(j3);
        rect2.right = IntOffset.m2533getXimpl(j3) + IntSize.m2547getWidthimpl(j4);
        rect2.bottom = IntOffset.m2534getYimpl(j3) + IntSize.m2546getHeightimpl(j4);
        canvas.drawBitmap(asAndroidBitmap, rect, rect2, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY  reason: not valid java name */
    public void mo1194drawPointsO7TthRY(int i, List<Offset> list, Paint paint) {
        PointMode.Companion companion = PointMode.Companion;
        if (PointMode.m1419equalsimpl0(i, companion.m1423getLinesr_lszbg())) {
            drawLines(list, paint, 2);
        } else if (PointMode.m1419equalsimpl0(i, companion.m1425getPolygonr_lszbg())) {
            drawLines(list, paint, 1);
        } else if (PointMode.m1419equalsimpl0(i, companion.m1424getPointsr_lszbg())) {
            drawPoints(list, paint);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    private final void drawLines(List<Offset> list, Paint paint, int i) {
        if (list.size() >= 2) {
            android.graphics.Paint asFrameworkPaint = paint.asFrameworkPaint();
            int i2 = 0;
            while (i2 < list.size() - 1) {
                long m1146unboximpl = list.get(i2).m1146unboximpl();
                long m1146unboximpl2 = list.get(i2 + 1).m1146unboximpl();
                this.internalCanvas.drawLine(Offset.m1137getXimpl(m1146unboximpl), Offset.m1138getYimpl(m1146unboximpl), Offset.m1137getXimpl(m1146unboximpl2), Offset.m1138getYimpl(m1146unboximpl2), asFrameworkPaint);
                i2 += i;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E  reason: not valid java name */
    public void mo1187clipPathmtrdDE(Path path, int i) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (path instanceof AndroidPath) {
            canvas.clipPath(((AndroidPath) path).getInternalPath(), m1195toRegionOp7u2Bmg(i));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (path instanceof AndroidPath) {
            canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.asFrameworkPaint());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    private final void drawPoints(List<Offset> list, Paint paint) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            long m1146unboximpl = list.get(i).m1146unboximpl();
            this.internalCanvas.drawPoint(Offset.m1137getXimpl(m1146unboximpl), Offset.m1138getYimpl(m1146unboximpl), paint.asFrameworkPaint());
        }
    }
}
