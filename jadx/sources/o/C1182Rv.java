package o;

/* renamed from: o.Rv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1182Rv {
    public static int b(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24) | (16777215 & i);
    }

    public static int c(int i) {
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        return i2 == 0 ? -2 : -3;
    }
}
