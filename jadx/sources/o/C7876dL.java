package o;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;

/* renamed from: o.dL  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7876dL implements InterfaceC7697dC {
    private final boolean a;
    private final C8530dp b;
    private final String c;
    private final boolean d;
    private final Path.FillType e;
    private final C8665du h;

    public C8665du a() {
        return this.h;
    }

    public C8530dp b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public Path.FillType d() {
        return this.e;
    }

    public boolean e() {
        return this.a;
    }

    public C7876dL(String str, boolean z, Path.FillType fillType, C8530dp c8530dp, C8665du c8665du, boolean z2) {
        this.c = str;
        this.d = z;
        this.e = fillType;
        this.b = c8530dp;
        this.h = c8665du;
        this.a = z2;
    }

    @Override // o.InterfaceC7697dC
    public InterfaceC7324cu b(LottieDrawable lottieDrawable, C3658bG c3658bG, AbstractC7877dM abstractC7877dM) {
        return new C5616cC(lottieDrawable, abstractC7877dM, this);
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.d + '}';
    }
}
