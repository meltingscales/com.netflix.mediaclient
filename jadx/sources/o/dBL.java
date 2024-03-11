package o;

/* loaded from: classes5.dex */
public final class dBL {
    private static final dAH a = new dAH("NO_OWNER");
    private static final dAH e = new dAH("ALREADY_LOCKED_BY_OWNER");

    public static /* synthetic */ dBK d(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c(z);
    }

    public static final dBK c(boolean z) {
        return new dBO(z);
    }
}
