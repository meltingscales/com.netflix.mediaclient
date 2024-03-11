package o;

/* renamed from: o.ow  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9406ow {
    public static float e(CharSequence charSequence) {
        return b(charSequence, 0, charSequence.length());
    }

    public static float b(CharSequence charSequence, int i, int i2) {
        long d = new C9358oA().d(charSequence, i, i2);
        if (d == -1) {
            throw new NumberFormatException("Illegal input");
        }
        return Float.intBitsToFloat((int) d);
    }
}
