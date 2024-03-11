package o;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;
import o.AbstractC5913cN;

/* renamed from: o.cE  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5670cE implements AbstractC5913cN.d, InterfaceC7589cz, InterfaceC5724cG {
    private final String a;
    private final AbstractC5913cN<?, Float> b;
    private final LottieDrawable c;
    private boolean d;
    private final boolean e;
    private final AbstractC5913cN<?, PointF> g;
    private final AbstractC5913cN<?, PointF> j;
    private final Path i = new Path();
    private final RectF h = new RectF();
    private final C7377cv l = new C7377cv();
    private AbstractC5913cN<Float, Float> f = null;

    @Override // o.InterfaceC7324cu
    public String e() {
        return this.a;
    }

    public C5670cE(LottieDrawable lottieDrawable, AbstractC7877dM abstractC7877dM, C7859dI c7859dI) {
        this.a = c7859dI.d();
        this.e = c7859dI.a();
        this.c = lottieDrawable;
        AbstractC5913cN<PointF, PointF> b = c7859dI.b().b();
        this.j = b;
        AbstractC5913cN<PointF, PointF> b2 = c7859dI.e().b();
        this.g = b2;
        AbstractC5913cN<Float, Float> b3 = c7859dI.c().b();
        this.b = b3;
        abstractC7877dM.c(b);
        abstractC7877dM.c(b2);
        abstractC7877dM.c(b3);
        b.b(this);
        b2.b(this);
        b3.b(this);
    }

    @Override // o.AbstractC5913cN.d
    public void b() {
        a();
    }

    private void a() {
        this.d = false;
        this.c.invalidateSelf();
    }

    @Override // o.InterfaceC7324cu
    public void e(List<InterfaceC7324cu> list, List<InterfaceC7324cu> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC7324cu interfaceC7324cu = list.get(i);
            if (interfaceC7324cu instanceof C5859cL) {
                C5859cL c5859cL = (C5859cL) interfaceC7324cu;
                if (c5859cL.f() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.l.d(c5859cL);
                    c5859cL.d(this);
                }
            }
            if (interfaceC7324cu instanceof C5832cK) {
                this.f = ((C5832cK) interfaceC7324cu).a();
            }
        }
    }

    @Override // o.InterfaceC5724cG
    public Path c() {
        AbstractC5913cN<Float, Float> abstractC5913cN;
        if (this.d) {
            return this.i;
        }
        this.i.reset();
        if (this.e) {
            this.d = true;
            return this.i;
        }
        PointF g = this.g.g();
        float f = g.x / 2.0f;
        float f2 = g.y / 2.0f;
        AbstractC5913cN<?, Float> abstractC5913cN2 = this.b;
        float h = abstractC5913cN2 == null ? 0.0f : ((C6020cR) abstractC5913cN2).h();
        if (h == 0.0f && (abstractC5913cN = this.f) != null) {
            h = Math.min(abstractC5913cN.g().floatValue(), Math.min(f, f2));
        }
        float min = Math.min(f, f2);
        if (h > min) {
            h = min;
        }
        PointF g2 = this.j.g();
        this.i.moveTo(g2.x + f, (g2.y - f2) + h);
        this.i.lineTo(g2.x + f, (g2.y + f2) - h);
        int i = (h > 0.0f ? 1 : (h == 0.0f ? 0 : -1));
        if (i > 0) {
            RectF rectF = this.h;
            float f3 = h * 2.0f;
            float f4 = g2.x + f;
            float f5 = g2.y + f2;
            rectF.set(f4 - f3, f5 - f3, f4, f5);
            this.i.arcTo(this.h, 0.0f, 90.0f, false);
        }
        this.i.lineTo((g2.x - f) + h, g2.y + f2);
        if (i > 0) {
            RectF rectF2 = this.h;
            float f6 = h * 2.0f;
            float f7 = g2.x - f;
            float f8 = g2.y + f2;
            rectF2.set(f7, f8 - f6, f6 + f7, f8);
            this.i.arcTo(this.h, 90.0f, 90.0f, false);
        }
        this.i.lineTo(g2.x - f, (g2.y - f2) + h);
        if (i > 0) {
            RectF rectF3 = this.h;
            float f9 = h * 2.0f;
            float f10 = g2.x - f;
            float f11 = g2.y - f2;
            rectF3.set(f10, f11, f10 + f9, f9 + f11);
            this.i.arcTo(this.h, 180.0f, 90.0f, false);
        }
        this.i.lineTo((g2.x + f) - h, g2.y - f2);
        if (i > 0) {
            RectF rectF4 = this.h;
            float f12 = h * 2.0f;
            float f13 = g2.x + f;
            float f14 = g2.y - f2;
            rectF4.set(f13 - f12, f14, f13, f12 + f14);
            this.i.arcTo(this.h, 270.0f, 90.0f, false);
        }
        this.i.close();
        this.l.b(this.i);
        this.d = true;
        return this.i;
    }

    @Override // o.InterfaceC8395dk
    public void a(C8368dj c8368dj, int i, List<C8368dj> list, C8368dj c8368dj2) {
        C8853eZ.b(c8368dj, i, list, c8368dj2, this);
    }

    @Override // o.InterfaceC8395dk
    public <T> void a(T t, C8912ff<T> c8912ff) {
        if (t == InterfaceC6637ch.x) {
            this.g.b((C8912ff<PointF>) c8912ff);
        } else if (t == InterfaceC6637ch.r) {
            this.j.b((C8912ff<PointF>) c8912ff);
        } else if (t == InterfaceC6637ch.e) {
            this.b.b((C8912ff<Float>) c8912ff);
        }
    }
}
