package o;

import android.os.SystemClock;

/* renamed from: o.bnM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4831bnM {
    private long c;

    public long e(long j) {
        return j - this.c;
    }

    public C4831bnM() {
        this(SystemClock.elapsedRealtime());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4831bnM(long j) {
        this.c = j;
    }

    public long c() {
        return SystemClock.elapsedRealtime() - this.c;
    }

    public long b() {
        return SystemClock.elapsedRealtime();
    }
}
