package o;

import android.content.Context;
import com.netflix.mediaclient.nfu.api.WatchNetworkType;
import com.netflix.mediaclient.storage.db.AppHistoryDb;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class aIQ {
    private final String a;
    private final AppHistoryDb b;
    private final int d;

    public aIQ() {
        AppHistoryDb.b bVar = AppHistoryDb.b;
        C1332Xp c1332Xp = C1332Xp.b;
        this.b = bVar.c((Context) C1332Xp.b(Context.class));
        this.d = 2;
        this.a = "watchRules";
    }

    public final boolean d(int i, long j) {
        int d;
        int d2;
        try {
            InterfaceC5264bvV c = this.b.c();
            TimeUnit timeUnit = TimeUnit.DAYS;
            d = c.d(timeUnit.toMillis(j), WatchNetworkType.c.c());
            d2 = this.b.c().d(timeUnit.toMillis(j), WatchNetworkType.d.c());
        } catch (Exception unused) {
        }
        if (d < this.d) {
            C1044Mm.c(this.a, "not enough cellular sessions %d", Integer.valueOf(d));
            return false;
        }
        int i2 = (d * 100) / (d + d2);
        C1044Mm.c(this.a, "enough cellular usage mobile=%d wifi=%d needed=%d got=%d", Integer.valueOf(d), Integer.valueOf(d2), Integer.valueOf(i), Integer.valueOf(i2));
        return i2 >= i;
    }
}
