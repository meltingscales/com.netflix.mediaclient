package o;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;

/* renamed from: o.dE  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7751dE implements InterfaceC7697dC {
    private final boolean a;
    private final boolean b;
    private final C8611ds c;
    private final InterfaceC7643dA<PointF, PointF> d;
    private final String e;

    public InterfaceC7643dA<PointF, PointF> a() {
        return this.d;
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.a;
    }

    public String d() {
        return this.e;
    }

    public C8611ds e() {
        return this.c;
    }

    public C7751dE(String str, InterfaceC7643dA<PointF, PointF> interfaceC7643dA, C8611ds c8611ds, boolean z, boolean z2) {
        this.e = str;
        this.d = interfaceC7643dA;
        this.c = c8611ds;
        this.b = z;
        this.a = z2;
    }

    @Override // o.InterfaceC7697dC
    public InterfaceC7324cu b(LottieDrawable lottieDrawable, C3658bG c3658bG, AbstractC7877dM abstractC7877dM) {
        return new C7430cw(lottieDrawable, abstractC7877dM, this);
    }
}
