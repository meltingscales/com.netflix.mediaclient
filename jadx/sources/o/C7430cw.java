package o;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;
import o.AbstractC5913cN;

/* renamed from: o.cw  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7430cw implements InterfaceC5724cG, AbstractC5913cN.d, InterfaceC7589cz {
    private final LottieDrawable a;
    private final String c;
    private final C7751dE d;
    private boolean e;
    private final AbstractC5913cN<?, PointF> f;
    private final AbstractC5913cN<?, PointF> g;
    private final Path b = new Path();
    private final C7377cv h = new C7377cv();

    @Override // o.InterfaceC7324cu
    public String e() {
        return this.c;
    }

    public C7430cw(LottieDrawable lottieDrawable, AbstractC7877dM abstractC7877dM, C7751dE c7751dE) {
        this.c = c7751dE.d();
        this.a = lottieDrawable;
        AbstractC5913cN<PointF, PointF> b = c7751dE.e().b();
        this.g = b;
        AbstractC5913cN<PointF, PointF> b2 = c7751dE.a().b();
        this.f = b2;
        this.d = c7751dE;
        abstractC7877dM.c(b);
        abstractC7877dM.c(b2);
        b.b(this);
        b2.b(this);
    }

    @Override // o.AbstractC5913cN.d
    public void b() {
        a();
    }

    private void a() {
        this.e = false;
        this.a.invalidateSelf();
    }

    @Override // o.InterfaceC7324cu
    public void e(List<InterfaceC7324cu> list, List<InterfaceC7324cu> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC7324cu interfaceC7324cu = list.get(i);
            if (interfaceC7324cu instanceof C5859cL) {
                C5859cL c5859cL = (C5859cL) interfaceC7324cu;
                if (c5859cL.f() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.h.d(c5859cL);
                    c5859cL.d(this);
                }
            }
        }
    }

    @Override // o.InterfaceC5724cG
    public Path c() {
        if (this.e) {
            return this.b;
        }
        this.b.reset();
        if (this.d.c()) {
            this.e = true;
            return this.b;
        }
        PointF g = this.g.g();
        float f = g.x / 2.0f;
        float f2 = g.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.b.reset();
        if (this.d.b()) {
            float f5 = -f2;
            this.b.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.b.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.b.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.b.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.b.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.b.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.b.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.b.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.b.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.b.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF g2 = this.f.g();
        this.b.offset(g2.x, g2.y);
        this.b.close();
        this.h.b(this.b);
        this.e = true;
        return this.b;
    }

    @Override // o.InterfaceC8395dk
    public void a(C8368dj c8368dj, int i, List<C8368dj> list, C8368dj c8368dj2) {
        C8853eZ.b(c8368dj, i, list, c8368dj2, this);
    }

    @Override // o.InterfaceC8395dk
    public <T> void a(T t, C8912ff<T> c8912ff) {
        if (t == InterfaceC6637ch.h) {
            this.g.b((C8912ff<PointF>) c8912ff);
        } else if (t == InterfaceC6637ch.r) {
            this.f.b((C8912ff<PointF>) c8912ff);
        }
    }
}
