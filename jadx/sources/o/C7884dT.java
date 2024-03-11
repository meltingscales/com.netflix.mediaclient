package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;

/* renamed from: o.dT  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7884dT extends AbstractC7877dM {
    @Override // o.AbstractC7877dM
    void a(Canvas canvas, Matrix matrix, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7884dT(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
    }

    @Override // o.AbstractC7877dM, o.InterfaceC7271ct
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
