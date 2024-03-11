package o;

import com.airbnb.lottie.LottieDrawable;

/* renamed from: o.dN  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7878dN implements InterfaceC7697dC {
    private final C8584dr a;
    private final int b;
    private final boolean d;
    private final String e;

    public boolean b() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public C8584dr e() {
        return this.a;
    }

    public C7878dN(String str, int i, C8584dr c8584dr, boolean z) {
        this.e = str;
        this.b = i;
        this.a = c8584dr;
        this.d = z;
    }

    @Override // o.InterfaceC7697dC
    public InterfaceC7324cu b(LottieDrawable lottieDrawable, C3658bG c3658bG, AbstractC7877dM abstractC7877dM) {
        return new C5805cJ(lottieDrawable, abstractC7877dM, this);
    }

    public String toString() {
        return "ShapePath{name=" + this.e + ", index=" + this.b + '}';
    }
}
