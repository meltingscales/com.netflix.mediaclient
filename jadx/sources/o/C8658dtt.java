package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dtt  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8658dtt {
    public static InterfaceC8650dtl<Double> a(double d, double d2) {
        return new C8645dtg(d, d2);
    }

    public static InterfaceC8650dtl<Float> e(float f, float f2) {
        return new C8648dtj(f, f2);
    }

    public static final void e(boolean z, Number number) {
        C8632dsu.c((Object) number, "");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }
}
