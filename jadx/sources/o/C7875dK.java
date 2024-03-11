package o;

import com.airbnb.lottie.LottieDrawable;

/* renamed from: o.dK  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7875dK implements InterfaceC7697dC {
    private final String b;
    private final InterfaceC7643dA<Float, Float> c;

    public InterfaceC7643dA<Float, Float> a() {
        return this.c;
    }

    public String b() {
        return this.b;
    }

    public C7875dK(String str, InterfaceC7643dA<Float, Float> interfaceC7643dA) {
        this.b = str;
        this.c = interfaceC7643dA;
    }

    @Override // o.InterfaceC7697dC
    public InterfaceC7324cu b(LottieDrawable lottieDrawable, C3658bG c3658bG, AbstractC7877dM abstractC7877dM) {
        return new C5832cK(lottieDrawable, abstractC7877dM, this);
    }
}
