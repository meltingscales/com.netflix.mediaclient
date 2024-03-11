package o;

/* loaded from: classes5.dex */
public final class dBR {
    private static final int a;
    private static final int b;
    private static final dAH c;
    private static final dAH d;
    private static final dAH e;
    private static final dAH g;

    public static final dBM b(int i, int i2) {
        return new dBN(i, i2);
    }

    public static /* synthetic */ dBM c(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return b(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dBS b(long j, dBS dbs) {
        return new dBS(j, dbs, 0);
    }

    static {
        int c2;
        int c3;
        c2 = dAI.c("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        a = c2;
        d = new dAH("PERMIT");
        g = new dAH("TAKEN");
        c = new dAH("BROKEN");
        e = new dAH("CANCELLED");
        c3 = dAI.c("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        b = c3;
    }
}
