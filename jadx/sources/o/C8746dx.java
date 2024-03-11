package o;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;

/* renamed from: o.dx  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8746dx implements InterfaceC7697dC {
    private final C8557dq a;
    private final C8557dq b;
    private final C8665du c;
    private final C8638dt d;
    private final InterfaceC7643dA<PointF, PointF> e;
    private final C8692dv f;
    private final C8557dq g;
    private final C8557dq h;
    private final C8557dq i;

    public C8557dq a() {
        return this.a;
    }

    @Override // o.InterfaceC7697dC
    public InterfaceC7324cu b(LottieDrawable lottieDrawable, C3658bG c3658bG, AbstractC7877dM abstractC7877dM) {
        return null;
    }

    public C8665du b() {
        return this.c;
    }

    public InterfaceC7643dA<PointF, PointF> c() {
        return this.e;
    }

    public C8638dt d() {
        return this.d;
    }

    public C8557dq f() {
        return this.h;
    }

    public C8557dq g() {
        return this.b;
    }

    public C8692dv h() {
        return this.f;
    }

    public C8557dq i() {
        return this.i;
    }

    public C8557dq j() {
        return this.g;
    }

    public C8746dx() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public C8746dx(C8638dt c8638dt, InterfaceC7643dA<PointF, PointF> interfaceC7643dA, C8692dv c8692dv, C8557dq c8557dq, C8665du c8665du, C8557dq c8557dq2, C8557dq c8557dq3, C8557dq c8557dq4, C8557dq c8557dq5) {
        this.d = c8638dt;
        this.e = interfaceC7643dA;
        this.f = c8692dv;
        this.b = c8557dq;
        this.c = c8665du;
        this.g = c8557dq2;
        this.a = c8557dq3;
        this.h = c8557dq4;
        this.i = c8557dq5;
    }

    public C8209dg e() {
        return new C8209dg(this);
    }
}
