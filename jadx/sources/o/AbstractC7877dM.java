package o;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.netflix.model.leafs.ArtworkColors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.AbstractC5913cN;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.dM  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7877dM implements InterfaceC7271ct, AbstractC5913cN.d, InterfaceC8395dk {
    private boolean A;
    private final RectF C;
    private final RectF D;
    BlurMaskFilter a;
    final Layer b;
    final Matrix c;
    float d;
    final LottieDrawable e;
    private final RectF f;
    final C8209dg g;
    private final Paint i;
    private final List<AbstractC5913cN<?, ?>> j;
    private final String k;
    private C6020cR m;
    private final Paint n;

    /* renamed from: o  reason: collision with root package name */
    private final Paint f13814o;
    private AbstractC7877dM p;
    private C6104cU q;
    private final RectF s;
    private final RectF t;
    private List<AbstractC7877dM> u;
    private final Paint v;
    private boolean w;
    private Paint x;
    private AbstractC7877dM y;
    private final Path z = new Path();
    private final Matrix r = new Matrix();
    private final Matrix h = new Matrix();
    private final Paint l = new C7112cq(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public Layer a() {
        return this.b;
    }

    abstract void a(Canvas canvas, Matrix matrix, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AbstractC7877dM abstractC7877dM) {
        this.p = abstractC7877dM;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(AbstractC7877dM abstractC7877dM) {
        this.y = abstractC7877dM;
    }

    @Override // o.InterfaceC7324cu
    public void e(List<InterfaceC7324cu> list, List<InterfaceC7324cu> list2) {
    }

    void e(C8368dj c8368dj, int i, List<C8368dj> list, C8368dj c8368dj2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        return this.p != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC7877dM e(C7883dS c7883dS, Layer layer, LottieDrawable lottieDrawable, C3658bG c3658bG) {
        switch (AnonymousClass5.b[layer.j().ordinal()]) {
            case 1:
                return new C7882dR(lottieDrawable, layer, c7883dS, c3658bG);
            case 2:
                return new C7883dS(lottieDrawable, layer, c3658bG.a(layer.k()), c3658bG);
            case 3:
                return new C7886dV(lottieDrawable, layer);
            case 4:
                return new C7881dQ(lottieDrawable, layer);
            case 5:
                return new C7884dT(lottieDrawable, layer);
            case 6:
                return new C7890dZ(lottieDrawable, layer);
            default:
                C8909fc.b("Unknown layer type " + layer.j());
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC7877dM(LottieDrawable lottieDrawable, Layer layer) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f13814o = new C7112cq(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.n = new C7112cq(1, mode2);
        C7112cq c7112cq = new C7112cq(1);
        this.v = c7112cq;
        this.i = new C7112cq(PorterDuff.Mode.CLEAR);
        this.C = new RectF();
        this.f = new RectF();
        this.t = new RectF();
        this.s = new RectF();
        this.D = new RectF();
        this.c = new Matrix();
        this.j = new ArrayList();
        this.A = true;
        this.d = 0.0f;
        this.e = lottieDrawable;
        this.b = layer;
        this.k = layer.h() + "#draw";
        if (layer.i() == Layer.MatteType.INVERT) {
            c7112cq.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            c7112cq.setXfermode(new PorterDuffXfermode(mode));
        }
        C8209dg e = layer.v().e();
        this.g = e;
        e.e(this);
        if (layer.g() != null && !layer.g().isEmpty()) {
            C6104cU c6104cU = new C6104cU(layer.g());
            this.q = c6104cU;
            for (AbstractC5913cN<C7880dP, Path> abstractC5913cN : c6104cU.b()) {
                abstractC5913cN.b(this);
            }
            for (AbstractC5913cN<Integer, Integer> abstractC5913cN2 : this.q.e()) {
                c(abstractC5913cN2);
                abstractC5913cN2.b(this);
            }
        }
        o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z) {
        if (z && this.x == null) {
            this.x = new C7112cq();
        }
        this.w = z;
    }

    @Override // o.AbstractC5913cN.d
    public void b() {
        i();
    }

    private void o() {
        if (!this.b.c().isEmpty()) {
            C6020cR c6020cR = new C6020cR(this.b.c());
            this.m = c6020cR;
            c6020cR.i();
            this.m.b(new AbstractC5913cN.d() { // from class: o.dU
                @Override // o.AbstractC5913cN.d
                public final void b() {
                    AbstractC7877dM.this.m();
                }
            });
            e(this.m.g().floatValue() == 1.0f);
            c(this.m);
            return;
        }
        e(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        e(this.m.h() == 1.0f);
    }

    private void i() {
        this.e.invalidateSelf();
    }

    public void c(AbstractC5913cN<?, ?> abstractC5913cN) {
        if (abstractC5913cN == null) {
            return;
        }
        this.j.add(abstractC5913cN);
    }

    public void d(AbstractC5913cN<?, ?> abstractC5913cN) {
        this.j.remove(abstractC5913cN);
    }

    @Override // o.InterfaceC7271ct
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.C.set(0.0f, 0.0f, 0.0f, 0.0f);
        f();
        this.c.set(matrix);
        if (z) {
            List<AbstractC7877dM> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.c.preConcat(this.u.get(size).g.c());
                }
            } else {
                AbstractC7877dM abstractC7877dM = this.y;
                if (abstractC7877dM != null) {
                    this.c.preConcat(abstractC7877dM.g.c());
                }
            }
        }
        this.c.preConcat(this.g.c());
    }

    @Override // o.InterfaceC7271ct
    public void b(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        Integer g;
        C3550bC.d(this.k);
        if (!this.A || this.b.u()) {
            C3550bC.a(this.k);
            return;
        }
        f();
        C3550bC.d("Layer#parentMatrix");
        this.r.reset();
        this.r.set(matrix);
        for (int size = this.u.size() - 1; size >= 0; size--) {
            this.r.preConcat(this.u.get(size).g.c());
        }
        C3550bC.a("Layer#parentMatrix");
        AbstractC5913cN<?, Integer> e = this.g.e();
        int intValue = (int) ((((i / 255.0f) * ((e == null || (g = e.g()) == null) ? 100 : g.intValue())) / 100.0f) * 255.0f);
        if (!h() && !g()) {
            this.r.preConcat(this.g.c());
            C3550bC.d("Layer#drawLayer");
            a(canvas, this.r, intValue);
            C3550bC.a("Layer#drawLayer");
            b(C3550bC.a(this.k));
            return;
        }
        C3550bC.d("Layer#computeBounds");
        d(this.C, this.r, false);
        c(this.C, matrix);
        this.r.preConcat(this.g.c());
        b(this.C, this.r);
        this.f.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.h);
        if (!this.h.isIdentity()) {
            Matrix matrix2 = this.h;
            matrix2.invert(matrix2);
            this.h.mapRect(this.f);
        }
        if (!this.C.intersect(this.f)) {
            this.C.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        C3550bC.a("Layer#computeBounds");
        if (this.C.width() >= 1.0f && this.C.height() >= 1.0f) {
            C3550bC.d("Layer#saveLayer");
            this.l.setAlpha(PrivateKeyType.INVALID);
            C8914fh.a(canvas, this.C, this.l);
            C3550bC.a("Layer#saveLayer");
            b(canvas);
            C3550bC.d("Layer#drawLayer");
            a(canvas, this.r, intValue);
            C3550bC.a("Layer#drawLayer");
            if (g()) {
                c(canvas, this.r);
            }
            if (h()) {
                C3550bC.d("Layer#drawMatte");
                C3550bC.d("Layer#saveLayer");
                C8914fh.c(canvas, this.C, this.v, 19);
                C3550bC.a("Layer#saveLayer");
                b(canvas);
                this.p.b(canvas, matrix, intValue);
                C3550bC.d("Layer#restoreLayer");
                canvas.restore();
                C3550bC.a("Layer#restoreLayer");
                C3550bC.a("Layer#drawMatte");
            }
            C3550bC.d("Layer#restoreLayer");
            canvas.restore();
            C3550bC.a("Layer#restoreLayer");
        }
        if (this.w && (paint = this.x) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.x.setColor(-251901);
            this.x.setStrokeWidth(4.0f);
            canvas.drawRect(this.C, this.x);
            this.x.setStyle(Paint.Style.FILL);
            this.x.setColor(1357638635);
            canvas.drawRect(this.C, this.x);
        }
        b(C3550bC.a(this.k));
    }

    private void b(float f) {
        this.e.getComposition().k().c(this.b.h(), f);
    }

    private void b(Canvas canvas) {
        C3550bC.d("Layer#clearLayer");
        RectF rectF = this.C;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.i);
        C3550bC.a("Layer#clearLayer");
    }

    private void b(RectF rectF, Matrix matrix) {
        this.t.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (g()) {
            int size = this.q.d().size();
            for (int i = 0; i < size; i++) {
                Mask mask = this.q.d().get(i);
                Path g = this.q.b().get(i).g();
                if (g != null) {
                    this.z.set(g);
                    this.z.transform(matrix);
                    int i2 = AnonymousClass5.a[mask.c().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && mask.a()) {
                        return;
                    }
                    this.z.computeBounds(this.D, false);
                    if (i == 0) {
                        this.t.set(this.D);
                    } else {
                        RectF rectF2 = this.t;
                        rectF2.set(Math.min(rectF2.left, this.D.left), Math.min(this.t.top, this.D.top), Math.max(this.t.right, this.D.right), Math.max(this.t.bottom, this.D.bottom));
                    }
                }
            }
            if (rectF.intersect(this.t)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dM$5  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            a = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            b = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private void c(RectF rectF, Matrix matrix) {
        if (h() && this.b.i() != Layer.MatteType.INVERT) {
            this.s.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.p.d(this.s, matrix, true);
            if (rectF.intersect(this.s)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void c(Canvas canvas, Matrix matrix) {
        C3550bC.d("Layer#saveLayer");
        C8914fh.c(canvas, this.C, this.f13814o, 19);
        if (Build.VERSION.SDK_INT < 28) {
            b(canvas);
        }
        C3550bC.a("Layer#saveLayer");
        for (int i = 0; i < this.q.d().size(); i++) {
            Mask mask = this.q.d().get(i);
            AbstractC5913cN<C7880dP, Path> abstractC5913cN = this.q.b().get(i);
            AbstractC5913cN<Integer, Integer> abstractC5913cN2 = this.q.e().get(i);
            int i2 = AnonymousClass5.a[mask.c().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.l.setColor(ArtworkColors.DEFAULT_BACKGROUND_COLOR);
                        this.l.setAlpha(PrivateKeyType.INVALID);
                        canvas.drawRect(this.C, this.l);
                    }
                    if (mask.a()) {
                        e(canvas, matrix, abstractC5913cN, abstractC5913cN2);
                    } else {
                        d(canvas, matrix, abstractC5913cN);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (mask.a()) {
                            d(canvas, matrix, abstractC5913cN, abstractC5913cN2);
                        } else {
                            b(canvas, matrix, abstractC5913cN, abstractC5913cN2);
                        }
                    }
                } else if (mask.a()) {
                    a(canvas, matrix, abstractC5913cN, abstractC5913cN2);
                } else {
                    c(canvas, matrix, abstractC5913cN, abstractC5913cN2);
                }
            } else if (j()) {
                this.l.setAlpha(PrivateKeyType.INVALID);
                canvas.drawRect(this.C, this.l);
            }
        }
        C3550bC.d("Layer#restoreLayer");
        canvas.restore();
        C3550bC.a("Layer#restoreLayer");
    }

    private boolean j() {
        if (this.q.b().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.q.d().size(); i++) {
            if (this.q.d().get(i).c() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void b(Canvas canvas, Matrix matrix, AbstractC5913cN<C7880dP, Path> abstractC5913cN, AbstractC5913cN<Integer, Integer> abstractC5913cN2) {
        this.z.set(abstractC5913cN.g());
        this.z.transform(matrix);
        this.l.setAlpha((int) (abstractC5913cN2.g().intValue() * 2.55f));
        canvas.drawPath(this.z, this.l);
    }

    private void d(Canvas canvas, Matrix matrix, AbstractC5913cN<C7880dP, Path> abstractC5913cN, AbstractC5913cN<Integer, Integer> abstractC5913cN2) {
        C8914fh.a(canvas, this.C, this.l);
        canvas.drawRect(this.C, this.l);
        this.z.set(abstractC5913cN.g());
        this.z.transform(matrix);
        this.l.setAlpha((int) (abstractC5913cN2.g().intValue() * 2.55f));
        canvas.drawPath(this.z, this.n);
        canvas.restore();
    }

    private void d(Canvas canvas, Matrix matrix, AbstractC5913cN<C7880dP, Path> abstractC5913cN) {
        this.z.set(abstractC5913cN.g());
        this.z.transform(matrix);
        canvas.drawPath(this.z, this.n);
    }

    private void e(Canvas canvas, Matrix matrix, AbstractC5913cN<C7880dP, Path> abstractC5913cN, AbstractC5913cN<Integer, Integer> abstractC5913cN2) {
        C8914fh.a(canvas, this.C, this.n);
        canvas.drawRect(this.C, this.l);
        this.n.setAlpha((int) (abstractC5913cN2.g().intValue() * 2.55f));
        this.z.set(abstractC5913cN.g());
        this.z.transform(matrix);
        canvas.drawPath(this.z, this.n);
        canvas.restore();
    }

    private void c(Canvas canvas, Matrix matrix, AbstractC5913cN<C7880dP, Path> abstractC5913cN, AbstractC5913cN<Integer, Integer> abstractC5913cN2) {
        C8914fh.a(canvas, this.C, this.f13814o);
        this.z.set(abstractC5913cN.g());
        this.z.transform(matrix);
        this.l.setAlpha((int) (abstractC5913cN2.g().intValue() * 2.55f));
        canvas.drawPath(this.z, this.l);
        canvas.restore();
    }

    private void a(Canvas canvas, Matrix matrix, AbstractC5913cN<C7880dP, Path> abstractC5913cN, AbstractC5913cN<Integer, Integer> abstractC5913cN2) {
        C8914fh.a(canvas, this.C, this.f13814o);
        canvas.drawRect(this.C, this.l);
        this.n.setAlpha((int) (abstractC5913cN2.g().intValue() * 2.55f));
        this.z.set(abstractC5913cN.g());
        this.z.transform(matrix);
        canvas.drawPath(this.z, this.n);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        C6104cU c6104cU = this.q;
        return (c6104cU == null || c6104cU.b().isEmpty()) ? false : true;
    }

    private void e(boolean z) {
        if (z != this.A) {
            this.A = z;
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(float f) {
        this.g.b(f);
        if (this.q != null) {
            for (int i = 0; i < this.q.b().size(); i++) {
                this.q.b().get(i).c(f);
            }
        }
        C6020cR c6020cR = this.m;
        if (c6020cR != null) {
            c6020cR.c(f);
        }
        AbstractC7877dM abstractC7877dM = this.p;
        if (abstractC7877dM != null) {
            abstractC7877dM.e(f);
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            this.j.get(i2).c(f);
        }
    }

    private void f() {
        if (this.u != null) {
            return;
        }
        if (this.y == null) {
            this.u = Collections.emptyList();
            return;
        }
        this.u = new ArrayList();
        for (AbstractC7877dM abstractC7877dM = this.y; abstractC7877dM != null; abstractC7877dM = abstractC7877dM.y) {
            this.u.add(abstractC7877dM);
        }
    }

    @Override // o.InterfaceC7324cu
    public String e() {
        return this.b.h();
    }

    public C7724dD c() {
        return this.b.a();
    }

    public BlurMaskFilter c(float f) {
        if (this.d == f) {
            return this.a;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.a = blurMaskFilter;
        this.d = f;
        return blurMaskFilter;
    }

    public C8864ek d() {
        return this.b.e();
    }

    @Override // o.InterfaceC8395dk
    public void a(C8368dj c8368dj, int i, List<C8368dj> list, C8368dj c8368dj2) {
        AbstractC7877dM abstractC7877dM = this.p;
        if (abstractC7877dM != null) {
            C8368dj d = c8368dj2.d(abstractC7877dM.e());
            if (c8368dj.a(this.p.e(), i)) {
                list.add(d.e(this.p));
            }
            if (c8368dj.c(e(), i)) {
                this.p.e(c8368dj, c8368dj.d(this.p.e(), i) + i, list, d);
            }
        }
        if (c8368dj.e(e(), i)) {
            if (!"__container".equals(e())) {
                c8368dj2 = c8368dj2.d(e());
                if (c8368dj.a(e(), i)) {
                    list.add(c8368dj2.e(this));
                }
            }
            if (c8368dj.c(e(), i)) {
                e(c8368dj, i + c8368dj.d(e(), i), list, c8368dj2);
            }
        }
    }

    @Override // o.InterfaceC8395dk
    public <T> void a(T t, C8912ff<T> c8912ff) {
        this.g.a(t, c8912ff);
    }
}
