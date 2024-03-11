package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes5.dex */
public final class dwA extends dwO {
    private static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(dwA.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dwA(o.InterfaceC8585dra<?> r2, java.lang.Throwable r3, boolean r4) {
        /*
            r1 = this;
            if (r3 != 0) goto L1e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Continuation "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = " was cancelled normally"
            r3.append(r2)
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            r3 = r2
        L1e:
            r1.<init>(r3, r4)
            r2 = 0
            r1._resumed = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dwA.<init>(o.dra, java.lang.Throwable, boolean):void");
    }

    public final boolean e() {
        return e.compareAndSet(this, 0, 1);
    }
}
