package o;

import android.graphics.PointF;
import java.util.Collections;

/* renamed from: o.db  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7944db extends AbstractC5913cN<PointF, PointF> {
    protected C8912ff<Float> b;
    protected C8912ff<Float> c;
    private final AbstractC5913cN<Float, Float> f;
    private final AbstractC5913cN<Float, Float> h;
    private final PointF i;
    private final PointF j;

    public C7944db(AbstractC5913cN<Float, Float> abstractC5913cN, AbstractC5913cN<Float, Float> abstractC5913cN2) {
        super(Collections.emptyList());
        this.j = new PointF();
        this.i = new PointF();
        this.h = abstractC5913cN;
        this.f = abstractC5913cN2;
        c(c());
    }

    public void a(C8912ff<Float> c8912ff) {
        C8912ff<Float> c8912ff2 = this.b;
        if (c8912ff2 != null) {
            c8912ff2.c((AbstractC5913cN<?, ?>) null);
        }
        this.b = c8912ff;
        if (c8912ff != null) {
            c8912ff.c(this);
        }
    }

    public void c(C8912ff<Float> c8912ff) {
        C8912ff<Float> c8912ff2 = this.c;
        if (c8912ff2 != null) {
            c8912ff2.c((AbstractC5913cN<?, ?>) null);
        }
        this.c = c8912ff;
        if (c8912ff != null) {
            c8912ff.c(this);
        }
    }

    @Override // o.AbstractC5913cN
    public void c(float f) {
        this.h.c(f);
        this.f.c(f);
        this.j.set(this.h.g().floatValue(), this.f.g().floatValue());
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).b();
        }
    }

    @Override // o.AbstractC5913cN
    /* renamed from: j */
    public PointF g() {
        return c(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC5913cN
    /* renamed from: e */
    public PointF c(C8910fd<PointF> c8910fd, float f) {
        Float f2;
        C8910fd<Float> b;
        C8910fd<Float> b2;
        Float f3 = null;
        if (this.b == null || (b2 = this.h.b()) == null) {
            f2 = null;
        } else {
            float d = this.h.d();
            Float f4 = b2.e;
            C8912ff<Float> c8912ff = this.b;
            float f5 = b2.g;
            f2 = c8912ff.a(f5, f4 == null ? f5 : f4.floatValue(), b2.j, b2.d, f, f, d);
        }
        if (this.c != null && (b = this.f.b()) != null) {
            float d2 = this.f.d();
            Float f6 = b.e;
            C8912ff<Float> c8912ff2 = this.c;
            float f7 = b.g;
            f3 = c8912ff2.a(f7, f6 == null ? f7 : f6.floatValue(), b.j, b.d, f, f, d2);
        }
        if (f2 == null) {
            this.i.set(this.j.x, 0.0f);
        } else {
            this.i.set(f2.floatValue(), 0.0f);
        }
        if (f3 == null) {
            PointF pointF = this.i;
            pointF.set(pointF.x, this.j.y);
        } else {
            PointF pointF2 = this.i;
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return this.i;
    }
}
