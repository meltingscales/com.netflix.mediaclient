package o;

import android.graphics.Color;
import android.graphics.Paint;
import o.AbstractC5913cN;

/* renamed from: o.cP  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5966cP implements AbstractC5913cN.d {
    private final AbstractC5913cN.d a;
    private boolean b = true;
    private final AbstractC5913cN<Float, Float> c;
    private final AbstractC5913cN<Integer, Integer> d;
    private final AbstractC5913cN<Float, Float> e;
    private final AbstractC5913cN<Float, Float> f;
    private final AbstractC5913cN<Float, Float> j;

    public C5966cP(AbstractC5913cN.d dVar, AbstractC7877dM abstractC7877dM, C8864ek c8864ek) {
        this.a = dVar;
        AbstractC5913cN<Integer, Integer> b = c8864ek.c().b();
        this.d = b;
        b.b(this);
        abstractC7877dM.c(b);
        AbstractC5913cN<Float, Float> b2 = c8864ek.e().b();
        this.j = b2;
        b2.b(this);
        abstractC7877dM.c(b2);
        AbstractC5913cN<Float, Float> b3 = c8864ek.a().b();
        this.c = b3;
        b3.b(this);
        abstractC7877dM.c(b3);
        AbstractC5913cN<Float, Float> b4 = c8864ek.b().b();
        this.e = b4;
        b4.b(this);
        abstractC7877dM.c(b4);
        AbstractC5913cN<Float, Float> b5 = c8864ek.d().b();
        this.f = b5;
        b5.b(this);
        abstractC7877dM.c(b5);
    }

    @Override // o.AbstractC5913cN.d
    public void b() {
        this.b = true;
        this.a.b();
    }

    public void e(Paint paint) {
        if (this.b) {
            this.b = false;
            double floatValue = this.c.g().floatValue() * 0.017453292519943295d;
            float floatValue2 = this.e.g().floatValue();
            int intValue = this.d.g().intValue();
            paint.setShadowLayer(this.f.g().floatValue(), ((float) Math.sin(floatValue)) * floatValue2, ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2, Color.argb(Math.round(this.j.g().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    public void c(C8912ff<Integer> c8912ff) {
        this.d.b(c8912ff);
    }

    public void e(final C8912ff<Float> c8912ff) {
        if (c8912ff == null) {
            this.j.b((C8912ff<Float>) null);
        } else {
            this.j.b(new C8912ff<Float>() { // from class: o.cP.4
                @Override // o.C8912ff
                /* renamed from: d */
                public Float a(C8911fe<Float> c8911fe) {
                    Float f = (Float) c8912ff.a(c8911fe);
                    if (f == null) {
                        return null;
                    }
                    return Float.valueOf(f.floatValue() * 2.55f);
                }
            });
        }
    }

    public void b(C8912ff<Float> c8912ff) {
        this.c.b(c8912ff);
    }

    public void a(C8912ff<Float> c8912ff) {
        this.e.b(c8912ff);
    }

    public void d(C8912ff<Float> c8912ff) {
        this.f.b(c8912ff);
    }
}
