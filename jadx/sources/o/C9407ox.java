package o;

/* renamed from: o.ox  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9407ox {
    public static double b(CharSequence charSequence) {
        return b(charSequence, 0, charSequence.length());
    }

    public static double b(CharSequence charSequence, int i, int i2) {
        long d = new C9400oq().d(charSequence, i, i2);
        if (d == -1) {
            throw new NumberFormatException("Illegal input");
        }
        return Double.longBitsToDouble(d);
    }
}
