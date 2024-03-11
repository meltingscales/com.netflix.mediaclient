package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import java.util.List;

/* loaded from: classes.dex */
public interface Canvas {
    /* renamed from: clipPath-mtrdD-E */
    void mo1187clipPathmtrdDE(Path path, int i);

    /* renamed from: clipRect-N_I0leg */
    void mo1188clipRectN_I0leg(float f, float f2, float f3, float f4, int i);

    /* renamed from: concat-58bKbWc */
    void mo1189concat58bKbWc(float[] fArr);

    void disableZ();

    void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint);

    /* renamed from: drawCircle-9KIMszo */
    void mo1190drawCircle9KIMszo(long j, float f, Paint paint);

    /* renamed from: drawImage-d-4ec7I */
    void mo1191drawImaged4ec7I(ImageBitmap imageBitmap, long j, Paint paint);

    /* renamed from: drawImageRect-HPBpro0 */
    void mo1192drawImageRectHPBpro0(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint);

    /* renamed from: drawLine-Wko1d7g */
    void mo1193drawLineWko1d7g(long j, long j2, Paint paint);

    void drawOval(float f, float f2, float f3, float f4, Paint paint);

    void drawPath(Path path, Paint paint);

    /* renamed from: drawPoints-O7TthRY */
    void mo1194drawPointsO7TthRY(int i, List<Offset> list, Paint paint);

    void drawRect(float f, float f2, float f3, float f4, Paint paint);

    void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint);

    void enableZ();

    void restore();

    void rotate(float f);

    void save();

    void saveLayer(Rect rect, Paint paint);

    void scale(float f, float f2);

    void translate(float f, float f2);

    /* renamed from: clipRect-mtrdD-E$default  reason: not valid java name */
    static /* synthetic */ void m1274clipRectmtrdDE$default(Canvas canvas, Rect rect, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = ClipOp.Companion.m1283getIntersectrtfAjoo();
        }
        canvas.m1275clipRectmtrdDE(rect, i);
    }

    /* renamed from: clipRect-mtrdD-E  reason: not valid java name */
    default void m1275clipRectmtrdDE(Rect rect, int i) {
        mo1188clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i);
    }

    /* renamed from: clipRect-N_I0leg$default  reason: not valid java name */
    static /* synthetic */ void m1273clipRectN_I0leg$default(Canvas canvas, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i2 & 16) != 0) {
            i = ClipOp.Companion.m1283getIntersectrtfAjoo();
        }
        canvas.mo1188clipRectN_I0leg(f, f2, f3, f4, i);
    }

    /* renamed from: clipPath-mtrdD-E$default  reason: not valid java name */
    static /* synthetic */ void m1272clipPathmtrdDE$default(Canvas canvas, Path path, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = ClipOp.Companion.m1283getIntersectrtfAjoo();
        }
        canvas.mo1187clipPathmtrdDE(path, i);
    }

    default void drawRect(Rect rect, Paint paint) {
        drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }
}
