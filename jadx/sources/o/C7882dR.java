package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;
import java.util.Collections;
import java.util.List;

/* renamed from: o.dR  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7882dR extends AbstractC7877dM {
    private final C7483cx i;
    private final C7883dS j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7882dR(LottieDrawable lottieDrawable, Layer layer, C7883dS c7883dS, C3658bG c3658bG) {
        super(lottieDrawable, layer);
        this.j = c7883dS;
        C7483cx c7483cx = new C7483cx(lottieDrawable, this, new C7879dO("__container", layer.m(), false), c3658bG);
        this.i = c7483cx;
        c7483cx.e(Collections.emptyList(), Collections.emptyList());
    }

    @Override // o.AbstractC7877dM
    void a(Canvas canvas, Matrix matrix, int i) {
        this.i.b(canvas, matrix, i);
    }

    @Override // o.AbstractC7877dM, o.InterfaceC7271ct
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        this.i.d(rectF, this.c, z);
    }

    @Override // o.AbstractC7877dM
    public C7724dD c() {
        C7724dD c = super.c();
        return c != null ? c : this.j.c();
    }

    @Override // o.AbstractC7877dM
    public C8864ek d() {
        C8864ek d = super.d();
        return d != null ? d : this.j.d();
    }

    @Override // o.AbstractC7877dM
    protected void e(C8368dj c8368dj, int i, List<C8368dj> list, C8368dj c8368dj2) {
        this.i.a(c8368dj, i, list, c8368dj2);
    }
}
