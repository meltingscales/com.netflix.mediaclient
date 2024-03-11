package o;

/* loaded from: classes5.dex */
public final class dxJ {
    private static final dAH e = new dAH("COMPLETING_ALREADY");
    public static final dAH c = new dAH("COMPLETING_WAITING_CHILDREN");
    private static final dAH d = new dAH("COMPLETING_RETRY");
    private static final dAH h = new dAH("TOO_LATE_TO_CANCEL");
    private static final dAH j = new dAH("SEALED");
    private static final C8756dxj a = new C8756dxj(false);
    private static final C8756dxj b = new C8756dxj(true);

    public static final Object b(Object obj) {
        return obj instanceof dxA ? new C8771dxy((dxA) obj) : obj;
    }

    public static final Object d(Object obj) {
        dxA dxa;
        C8771dxy c8771dxy = obj instanceof C8771dxy ? (C8771dxy) obj : null;
        return (c8771dxy == null || (dxa = c8771dxy.d) == null) ? obj : dxa;
    }
}
