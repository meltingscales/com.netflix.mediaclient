package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import o.C8632dsu;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public final class LayerMatrixCache<T> {
    private Matrix androidMatrixCache;
    private final drX<T, Matrix, dpR> getMatrix;
    private float[] inverseMatrixCache;
    private boolean isDirty = true;
    private boolean isInverseDirty = true;
    private boolean isInverseValid = true;
    private float[] matrixCache;
    private Matrix previousAndroidMatrix;

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayerMatrixCache(drX<? super T, ? super Matrix, dpR> drx) {
        this.getMatrix = drx;
    }

    /* renamed from: calculateMatrix-GrdbGEg  reason: not valid java name */
    public final float[] m2004calculateMatrixGrdbGEg(T t) {
        float[] fArr = this.matrixCache;
        if (fArr == null) {
            fArr = androidx.compose.ui.graphics.Matrix.m1370constructorimpl$default(null, 1, null);
            this.matrixCache = fArr;
        }
        if (this.isDirty) {
            Matrix matrix = this.androidMatrixCache;
            if (matrix == null) {
                matrix = new Matrix();
                this.androidMatrixCache = matrix;
            }
            this.getMatrix.invoke(t, matrix);
            Matrix matrix2 = this.previousAndroidMatrix;
            if (matrix2 == null || !C8632dsu.c(matrix, matrix2)) {
                AndroidMatrixConversions_androidKt.m1201setFromtUYjHk(fArr, matrix);
                this.androidMatrixCache = matrix2;
                this.previousAndroidMatrix = matrix;
            }
            this.isDirty = false;
            return fArr;
        }
        return fArr;
    }

    /* renamed from: calculateInverseMatrix-bWbORWo  reason: not valid java name */
    public final float[] m2003calculateInverseMatrixbWbORWo(T t) {
        float[] fArr = this.inverseMatrixCache;
        if (fArr == null) {
            fArr = androidx.compose.ui.graphics.Matrix.m1370constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArr;
        }
        if (this.isInverseDirty) {
            this.isInverseValid = InvertMatrixKt.m2002invertToJiSxe2E(m2004calculateMatrixGrdbGEg(t), fArr);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArr;
        }
        return null;
    }
}
