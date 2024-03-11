package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.dS  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7883dS extends AbstractC7877dM {
    private Boolean f;
    private Boolean h;
    private final Paint i;
    private boolean j;
    private AbstractC5913cN<Float, Float> k;
    private final RectF l;
    private final List<AbstractC7877dM> n;

    /* renamed from: o  reason: collision with root package name */
    private final RectF f13815o;

    public void e(boolean z) {
        this.j = z;
    }

    public C7883dS(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, C3658bG c3658bG) {
        super(lottieDrawable, layer);
        int i;
        AbstractC7877dM abstractC7877dM;
        this.n = new ArrayList();
        this.l = new RectF();
        this.f13815o = new RectF();
        this.i = new Paint();
        this.j = true;
        C8557dq y = layer.y();
        if (y != null) {
            AbstractC5913cN<Float, Float> b = y.b();
            this.k = b;
            c(b);
            this.k.b(this);
        } else {
            this.k = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(c3658bG.i().size());
        int size = list.size() - 1;
        AbstractC7877dM abstractC7877dM2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            AbstractC7877dM e = AbstractC7877dM.e(this, layer2, lottieDrawable, c3658bG);
            if (e != null) {
                longSparseArray.put(e.a().d(), e);
                if (abstractC7877dM2 != null) {
                    abstractC7877dM2.a(e);
                    abstractC7877dM2 = null;
                } else {
                    this.n.add(0, e);
                    int i2 = AnonymousClass1.a[layer2.i().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        abstractC7877dM2 = e;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            AbstractC7877dM abstractC7877dM3 = (AbstractC7877dM) longSparseArray.get(longSparseArray.keyAt(i));
            if (abstractC7877dM3 != null && (abstractC7877dM = (AbstractC7877dM) longSparseArray.get(abstractC7877dM3.a().f())) != null) {
                abstractC7877dM3.d(abstractC7877dM);
            }
        }
    }

    /* renamed from: o.dS$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            a = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // o.AbstractC7877dM
    public void c(boolean z) {
        super.c(z);
        for (AbstractC7877dM abstractC7877dM : this.n) {
            abstractC7877dM.c(z);
        }
    }

    @Override // o.AbstractC7877dM
    void a(Canvas canvas, Matrix matrix, int i) {
        C3550bC.d("CompositionLayer#draw");
        this.f13815o.set(0.0f, 0.0f, this.b.n(), this.b.l());
        matrix.mapRect(this.f13815o);
        boolean z = this.e.isApplyingOpacityToLayersEnabled() && this.n.size() > 1 && i != 255;
        if (z) {
            this.i.setAlpha(i);
            C8914fh.a(canvas, this.f13815o, this.i);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.n.size() - 1; size >= 0; size--) {
            if ((!this.j && "__container".equals(this.b.h())) || this.f13815o.isEmpty() || canvas.clipRect(this.f13815o)) {
                this.n.get(size).b(canvas, matrix, i);
            }
        }
        canvas.restore();
        C3550bC.a("CompositionLayer#draw");
    }

    @Override // o.AbstractC7877dM, o.InterfaceC7271ct
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        for (int size = this.n.size() - 1; size >= 0; size--) {
            this.l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.n.get(size).d(this.l, this.c, true);
            rectF.union(this.l);
        }
    }

    @Override // o.AbstractC7877dM
    public void e(float f) {
        super.e(f);
        if (this.k != null) {
            f = ((this.k.g().floatValue() * this.b.b().f()) - this.b.b().m()) / (this.e.getComposition().b() + 0.01f);
        }
        if (this.k == null) {
            f -= this.b.r();
        }
        if (this.b.x() != 0.0f && !"__container".equals(this.b.h())) {
            f /= this.b.x();
        }
        for (int size = this.n.size() - 1; size >= 0; size--) {
            this.n.get(size).e(f);
        }
    }

    public boolean i() {
        if (this.f == null) {
            for (int size = this.n.size() - 1; size >= 0; size--) {
                AbstractC7877dM abstractC7877dM = this.n.get(size);
                if (abstractC7877dM instanceof C7882dR) {
                    if (abstractC7877dM.g()) {
                        this.f = Boolean.TRUE;
                        return true;
                    }
                } else if ((abstractC7877dM instanceof C7883dS) && ((C7883dS) abstractC7877dM).i()) {
                    this.f = Boolean.TRUE;
                    return true;
                }
            }
            this.f = Boolean.FALSE;
        }
        return this.f.booleanValue();
    }

    public boolean j() {
        if (this.h == null) {
            if (h()) {
                this.h = Boolean.TRUE;
                return true;
            }
            for (int size = this.n.size() - 1; size >= 0; size--) {
                if (this.n.get(size).h()) {
                    this.h = Boolean.TRUE;
                    return true;
                }
            }
            this.h = Boolean.FALSE;
        }
        return this.h.booleanValue();
    }

    @Override // o.AbstractC7877dM
    protected void e(C8368dj c8368dj, int i, List<C8368dj> list, C8368dj c8368dj2) {
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            this.n.get(i2).a(c8368dj, i, list, c8368dj2);
        }
    }

    @Override // o.AbstractC7877dM, o.InterfaceC8395dk
    public <T> void a(T t, C8912ff<T> c8912ff) {
        super.a(t, c8912ff);
        if (t == InterfaceC6637ch.A) {
            if (c8912ff == null) {
                AbstractC5913cN<Float, Float> abstractC5913cN = this.k;
                if (abstractC5913cN != null) {
                    abstractC5913cN.b((C8912ff<Float>) null);
                    return;
                }
                return;
            }
            C8156df c8156df = new C8156df(c8912ff);
            this.k = c8156df;
            c8156df.b(this);
            c(this.k);
        }
    }
}
