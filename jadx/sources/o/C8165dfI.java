package o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.dfI  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8165dfI {
    private final long a;
    private long b;
    private int c;
    private final int e;

    public C8165dfI(int i, long j) {
        this.e = i;
        this.a = j;
    }

    public boolean d() {
        int i = this.c + 1;
        this.c = i;
        if (i == 1) {
            this.b = System.currentTimeMillis();
        }
        if (this.c > this.e && System.currentTimeMillis() - this.b <= this.a) {
            C1044Mm.e("nf_RateLimiter", "onNewEvent too fast mEventCounter=%d timeDuration=%d", Integer.valueOf(this.c), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - this.b)));
            return true;
        }
        if (System.currentTimeMillis() - this.b > this.a) {
            C1044Mm.a("nf_RateLimiter", "onNewEvent time window over, resetting mEventCounter");
            this.c = 0;
        }
        return false;
    }
}
