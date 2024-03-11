package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.duy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8690duy extends C8687duv {
    public static Float i(String str) {
        C8632dsu.c((Object) str, "");
        try {
            if (C8685dut.a.e(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static Double j(String str) {
        C8632dsu.c((Object) str, "");
        try {
            if (C8685dut.a.e(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
