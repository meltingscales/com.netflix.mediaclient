package o;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;

/* renamed from: o.dI  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7859dI implements InterfaceC7697dC {
    private final InterfaceC7643dA<PointF, PointF> a;
    private final String b;
    private final boolean c;
    private final C8557dq d;
    private final InterfaceC7643dA<PointF, PointF> e;

    public boolean a() {
        return this.c;
    }

    public InterfaceC7643dA<PointF, PointF> b() {
        return this.e;
    }

    public C8557dq c() {
        return this.d;
    }

    public String d() {
        return this.b;
    }

    public InterfaceC7643dA<PointF, PointF> e() {
        return this.a;
    }

    public C7859dI(String str, InterfaceC7643dA<PointF, PointF> interfaceC7643dA, InterfaceC7643dA<PointF, PointF> interfaceC7643dA2, C8557dq c8557dq, boolean z) {
        this.b = str;
        this.e = interfaceC7643dA;
        this.a = interfaceC7643dA2;
        this.d = c8557dq;
        this.c = z;
    }

    @Override // o.InterfaceC7697dC
    public InterfaceC7324cu b(LottieDrawable lottieDrawable, C3658bG c3658bG, AbstractC7877dM abstractC7877dM) {
        return new C5670cE(lottieDrawable, abstractC7877dM, this);
    }

    public String toString() {
        return "RectangleShape{position=" + this.e + ", size=" + this.a + '}';
    }
}
