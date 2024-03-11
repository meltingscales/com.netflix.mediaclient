package o;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.bbA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4256bbA {
    private long b;
    private long c;
    private int a = 0;
    private long d = -1;
    public final Map<String, C4287bbf> e = new ConcurrentHashMap();

    public long a() {
        return this.b;
    }

    public void b() {
        this.a = 100;
    }

    public long c() {
        return this.c;
    }

    public int e() {
        return this.a;
    }

    public void d() {
        this.c = 0L;
        this.b = 0L;
        for (Map.Entry<String, C4287bbf> entry : this.e.entrySet()) {
            C4287bbf value = entry.getValue();
            long j = value.b;
            if (j > 0) {
                this.c += value.d;
                this.b += j;
            } else {
                C1044Mm.d("nf_playableProgress", "mTotalBytesToDownload " + value.b + " is not positive for " + entry.getKey());
            }
        }
        long j2 = this.b;
        this.a = j2 > 0 ? (int) ((this.c * 100) / j2) : 0;
    }

    public boolean a(int i) {
        boolean z;
        C1044Mm.c("nf_playableProgress", "hasEnoughDataToWatch percentage=%d", Integer.valueOf(i));
        Iterator<Map.Entry<String, C4287bbf>> it = this.e.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            C4287bbf value = it.next().getValue();
            long j = value.b;
            if (j > 0) {
                long j2 = value.d;
                int i2 = (int) ((100 * j2) / j);
                C1044Mm.c("nf_playableProgress", "hasEnoughDataToWatch onDisk=%d total=%d downloadedPercentage=%d", Long.valueOf(j2), Long.valueOf(value.b), Integer.valueOf(i2));
                if (i2 < i + 3) {
                    z = false;
                    break;
                }
            }
        }
        C1044Mm.c("nf_playableProgress", "progressive play %b", Boolean.valueOf(z));
        return z;
    }

    public long e(File file) {
        if (this.d == -1) {
            this.d = C8106deC.a(file);
        }
        return this.d;
    }
}
