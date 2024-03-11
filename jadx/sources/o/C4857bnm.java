package o;

import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource.NetflixNetworkError;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.C4632biF;

/* renamed from: o.bnm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4857bnm {
    private NetflixNetworkError a;
    public final String b;
    public final int d;
    public final long e;
    private long j = -9223372036854775807L;
    private long c = -9223372036854775807L;
    private final List<Long> f = new ArrayList();

    public NetflixNetworkError c() {
        return this.a;
    }

    public void d(NetflixNetworkError netflixNetworkError) {
        this.a = netflixNetworkError;
    }

    public C4857bnm(String str) {
        String str2;
        C4632biF.c a = C4632biF.a(str);
        if (a != null) {
            this.e = a.a;
            this.d = a.e;
            str2 = a.b;
        } else {
            this.e = 0L;
            this.d = 0;
            str2 = "";
        }
        this.b = str2;
    }

    public void b(long j) {
        this.j = j;
        this.c = j;
        this.f.add(0L);
    }

    public void e(InterfaceC4835bnQ interfaceC4835bnQ) {
        if (this.f.isEmpty()) {
            return;
        }
        Long valueOf = Long.valueOf(interfaceC4835bnQ.f());
        Long valueOf2 = Long.valueOf(interfaceC4835bnQ.o());
        if (valueOf == null || valueOf2 == null) {
            return;
        }
        long longValue = valueOf.longValue() - valueOf2.longValue();
        if (longValue > d()) {
            this.f.set(0, Long.valueOf(Math.min(longValue, Math.max(0, (this.f.size() * 1000) - 1001))));
            return;
        }
        this.f.set(0, Long.valueOf(longValue));
        long j = longValue / 1000;
        while (this.f.size() - 1 > 1 + j) {
            List<Long> list = this.f;
            int size = list.size();
            List<Long> list2 = this.f;
            long longValue2 = list2.get(list2.size() - 2).longValue();
            List<Long> list3 = this.f;
            list.set(size - 2, Long.valueOf(longValue2 + list3.get(list3.size() - 1).longValue()));
            List<Long> list4 = this.f;
            list4.remove(list4.size() - 1);
        }
    }

    public void a(long j, long j2) {
        long j3 = j;
        long j4 = this.j;
        if (j4 == -9223372036854775807L) {
            C1044Mm.d("nf_playreport", "request was never started - cannot generate download trace");
            return;
        }
        this.f.set(0, Long.valueOf(j3 - j4));
        long j5 = j3 - this.j;
        long max = Math.max(0L, j3 - this.c);
        long max2 = Math.max(0L, j5 - max);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int max3 = Math.max(1, ((int) timeUnit.toSeconds(max2)) + 1);
        int max4 = Math.max(max3, ((int) timeUnit.toSeconds(j5)) + 1);
        while (this.f.size() <= max4) {
            this.f.add(0L);
        }
        if (max3 == max4) {
            List<Long> list = this.f;
            list.set(max3, Long.valueOf(list.get(max3).longValue() + j2));
        } else {
            int i = max3;
            double d = j2 / max;
            long j6 = 0;
            while (i <= max4) {
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                long millis = max2 - timeUnit2.toMillis(i - 1);
                long j7 = max2;
                long j8 = millis > 0 ? 1000 - millis : 1000L;
                long millis2 = timeUnit2.toMillis(i) - j5;
                if (millis2 > 0) {
                    j8 -= millis2;
                }
                long max5 = Math.max(0L, (long) (j8 * d));
                List<Long> list2 = this.f;
                list2.set(i, Long.valueOf(list2.get(i).longValue() + max5));
                j6 += max5;
                i++;
                max2 = j7;
            }
            if (j6 < j2) {
                List<Long> list3 = this.f;
                list3.set(max4, Long.valueOf(list3.get(max4).longValue() + (j2 - j6)));
            }
            j3 = j;
        }
        this.c = j3;
    }

    public long d() {
        if (this.j == -9223372036854775807L) {
            return 0L;
        }
        return this.f.get(0).longValue();
    }

    public Long[] e() {
        if (this.j == -9223372036854775807L || this.f.size() <= 1) {
            return null;
        }
        List<Long> list = this.f;
        return (Long[]) list.toArray(new Long[list.size()]);
    }

    public long b() {
        long j = 0;
        if (this.f.size() > 1) {
            List<Long> list = this.f;
            for (Long l : list.subList(1, list.size())) {
                j += l.longValue();
            }
        }
        return j;
    }
}
