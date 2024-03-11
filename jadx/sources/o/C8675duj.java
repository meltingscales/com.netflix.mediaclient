package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.duj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8675duj extends C8672dug {
    public static String d(char c) {
        return duG.e(c);
    }

    public static final boolean c(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (z) {
            char upperCase = Character.toUpperCase(c);
            char upperCase2 = Character.toUpperCase(c2);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return false;
    }
}
