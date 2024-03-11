package o;

import com.airbnb.lottie.LottieDrawable;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.dO  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7879dO implements InterfaceC7697dC {
    private final String a;
    private final boolean b;
    private final List<InterfaceC7697dC> c;

    public boolean a() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public List<InterfaceC7697dC> e() {
        return this.c;
    }

    public C7879dO(String str, List<InterfaceC7697dC> list, boolean z) {
        this.a = str;
        this.c = list;
        this.b = z;
    }

    @Override // o.InterfaceC7697dC
    public InterfaceC7324cu b(LottieDrawable lottieDrawable, C3658bG c3658bG, AbstractC7877dM abstractC7877dM) {
        return new C7483cx(lottieDrawable, abstractC7877dM, this, c3658bG);
    }

    public String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.c.toArray()) + '}';
    }
}
