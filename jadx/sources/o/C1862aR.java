package o;

/* renamed from: o.aR  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1862aR {
    public static long c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0L;
        }
        int length = charSequence.length();
        long j = -3750763034362895579L;
        for (int i = 0; i < length; i++) {
            j = (j ^ charSequence.charAt(i)) * 1099511628211L;
        }
        return j;
    }
}
