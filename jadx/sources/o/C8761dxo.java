package o;

/* renamed from: o.dxo  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8761dxo {
    private static final dAH a = new dAH("REMOVED_TASK");
    private static final dAH c = new dAH("CLOSED_EMPTY");

    public static final long c(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
