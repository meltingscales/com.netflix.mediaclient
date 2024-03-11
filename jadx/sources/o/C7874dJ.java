package o;

import com.airbnb.lottie.LottieDrawable;

/* renamed from: o.dJ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7874dJ implements InterfaceC7697dC {
    private final boolean a;
    private final C8557dq b;
    private final C8746dx c;
    private final String d;
    private final C8557dq e;

    public String a() {
        return this.d;
    }

    public C8557dq b() {
        return this.e;
    }

    public C8746dx c() {
        return this.c;
    }

    public C8557dq d() {
        return this.b;
    }

    public boolean e() {
        return this.a;
    }

    public C7874dJ(String str, C8557dq c8557dq, C8557dq c8557dq2, C8746dx c8746dx, boolean z) {
        this.d = str;
        this.e = c8557dq;
        this.b = c8557dq2;
        this.c = c8746dx;
        this.a = z;
    }

    @Override // o.InterfaceC7697dC
    public InterfaceC7324cu b(LottieDrawable lottieDrawable, C3658bG c3658bG, AbstractC7877dM abstractC7877dM) {
        return new C5697cF(lottieDrawable, abstractC7877dM, this);
    }
}
