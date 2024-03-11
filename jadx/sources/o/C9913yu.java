package o;

/* renamed from: o.yu  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9913yu {
    public static boolean a(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) && Float.isNaN(f2) : Math.abs(f2 - f) < 1.0E-5f;
    }
}
