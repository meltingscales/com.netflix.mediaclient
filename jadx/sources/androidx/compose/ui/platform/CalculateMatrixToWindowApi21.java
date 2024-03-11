package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import o.C8627dsp;

/* loaded from: classes.dex */
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {
    private final int[] tmpLocation;
    private final float[] tmpMatrix;

    public /* synthetic */ CalculateMatrixToWindowApi21(float[] fArr, C8627dsp c8627dsp) {
        this(fArr);
    }

    private CalculateMatrixToWindowApi21(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    /* renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo1984calculateMatrixToWindowEL8BTi8(View view, float[] fArr) {
        Matrix.m1375resetimpl(fArr);
        m1987transformMatrixToWindowEL8BTi8(view, fArr);
    }

    /* renamed from: transformMatrixToWindow-EL8BTi8  reason: not valid java name */
    private final void m1987transformMatrixToWindowEL8BTi8(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            m1987transformMatrixToWindowEL8BTi8((View) parent, fArr);
            m1986preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m1986preTranslate3XD1CNM(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.tmpLocation;
            view.getLocationInWindow(iArr);
            m1986preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m1986preTranslate3XD1CNM(fArr, iArr[0], iArr[1]);
        }
        android.graphics.Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        m1985preConcattUYjHk(fArr, matrix);
    }

    /* renamed from: preConcat-tU-YjHk  reason: not valid java name */
    private final void m1985preConcattUYjHk(float[] fArr, android.graphics.Matrix matrix) {
        AndroidMatrixConversions_androidKt.m1201setFromtUYjHk(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.m1982preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* renamed from: preTranslate-3XD1CNM  reason: not valid java name */
    private final void m1986preTranslate3XD1CNM(float[] fArr, float f, float f2) {
        AndroidComposeView_androidKt.m1983preTranslatecG2Xzmc(fArr, f, f2, this.tmpMatrix);
    }
}
