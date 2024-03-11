package o;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: o.lC  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9201lC {
    private final File b;
    private final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    private final InterfaceC9200lB d;

    public final File c() {
        return this.b;
    }

    public C9201lC(C9258mG c9258mG) {
        this.b = new File(c9258mG.x().getValue(), "bugsnag/last-run-info");
        this.d = c9258mG.m();
    }

    public final void e(C9247lw c9247lw) {
        ReentrantReadWriteLock.WriteLock writeLock = this.c.writeLock();
        writeLock.lock();
        try {
            a(c9247lw);
            dpR dpr = dpR.c;
            writeLock.unlock();
        }
    }

    private final void a(C9247lw c9247lw) {
        C9250lz c9250lz = new C9250lz();
        c9250lz.c("consecutiveLaunchCrashes", Integer.valueOf(c9247lw.a()));
        c9250lz.c("crashed", Boolean.valueOf(c9247lw.d()));
        c9250lz.c("crashedDuringLaunch", Boolean.valueOf(c9247lw.b()));
        String c9250lz2 = c9250lz.toString();
        drC.a(this.b, c9250lz2, null, 2, null);
        this.d.b(C8632dsu.d("Persisted: ", (Object) c9250lz2));
    }

    public final C9247lw d() {
        C9247lw c9247lw;
        ReentrantReadWriteLock.ReadLock readLock = this.c.readLock();
        readLock.lock();
        try {
            c9247lw = e();
        } catch (Throwable th) {
            try {
                this.d.e("Unexpectedly failed to load LastRunInfo.", th);
                c9247lw = null;
            } finally {
                readLock.unlock();
            }
        }
        return c9247lw;
    }

    private final C9247lw e() {
        String c;
        List d;
        boolean g;
        if (this.b.exists()) {
            c = drC.c(this.b, null, 1, null);
            d = duD.d((CharSequence) c, new String[]{"\n"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            for (Object obj : d) {
                g = C8691duz.g((String) obj);
                if (!g) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() != 3) {
                this.d.d(C8632dsu.d("Unexpected number of lines when loading LastRunInfo. Skipping load. ", arrayList));
                return null;
            }
            try {
                C9247lw c9247lw = new C9247lw(d((String) arrayList.get(0), "consecutiveLaunchCrashes"), e((String) arrayList.get(1), "crashed"), e((String) arrayList.get(2), "crashedDuringLaunch"));
                this.d.b(C8632dsu.d("Loaded: ", c9247lw));
                return c9247lw;
            } catch (NumberFormatException e) {
                this.d.e("Failed to read consecutiveLaunchCrashes from saved lastRunInfo", e);
                return null;
            }
        }
        return null;
    }

    private final int d(String str, String str2) {
        String b;
        b = duD.b(str, C8632dsu.d(str2, (Object) "="), (String) null, 2, (Object) null);
        return Integer.parseInt(b);
    }

    private final boolean e(String str, String str2) {
        String b;
        b = duD.b(str, C8632dsu.d(str2, (Object) "="), (String) null, 2, (Object) null);
        return Boolean.parseBoolean(b);
    }
}
