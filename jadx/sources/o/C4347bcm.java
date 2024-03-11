package o;

import android.content.Context;
import com.netflix.mediaclient.nfu.api.WatchEventTypes;
import com.netflix.mediaclient.nfu.api.WatchNetworkType;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.CurrentNetworkInfo;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.EndPlayJson;
import com.netflix.mediaclient.storage.db.AppHistoryDb;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: o.bcm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4347bcm implements InterfaceC4853bni {
    private static long a;
    public static final C4347bcm b = new C4347bcm();
    private static final c d;
    private static final AppHistoryDb e;

    private final void e() {
    }

    private C4347bcm() {
    }

    static {
        AppHistoryDb.b bVar = AppHistoryDb.b;
        C1332Xp c1332Xp = C1332Xp.b;
        e = bVar.c((Context) C1332Xp.b(Context.class));
        d = new c(C8120deQ.a() ? 500 : 1000, TimeUnit.DAYS.toMillis(28L), TimeUnit.MINUTES.toMillis(30L));
    }

    /* renamed from: o.bcm$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final long a;
        private final int b;
        private final long c;

        public final long c() {
            return this.c;
        }

        public final int d() {
            return this.b;
        }

        public final long e() {
            return this.a;
        }

        public c(int i, long j, long j2) {
            this.b = i;
            this.a = j;
            this.c = j2;
        }
    }

    private final boolean a() {
        return ConfigFastPropertyFeatureControlConfig.Companion.s().c() && C4337bcc.d() >= 50000000;
    }

    @Override // o.InterfaceC4853bni
    public void e(final EndPlayJson endPlayJson) {
        C8632dsu.c((Object) endPlayJson, "");
        if (a() && d(endPlayJson)) {
            Schedulers.io().scheduleDirect(new Runnable() { // from class: o.bcs
                @Override // java.lang.Runnable
                public final void run() {
                    C4347bcm.a(EndPlayJson.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(EndPlayJson endPlayJson) {
        C8632dsu.c((Object) endPlayJson, "");
        try {
            C4347bcm c4347bcm = b;
            c4347bcm.b();
            e.c().e(c4347bcm.c(endPlayJson));
            c4347bcm.e();
        } catch (Exception unused) {
        }
    }

    private final boolean d(EndPlayJson endPlayJson) {
        return C5167bte.b(endPlayJson.i());
    }

    private final void b() {
        long c2 = c();
        long j = a;
        c cVar = d;
        if (c2 > j + cVar.c()) {
            AppHistoryDb appHistoryDb = e;
            if (appHistoryDb.c().b() > cVar.d()) {
                appHistoryDb.c().d(cVar.d() / 2);
            } else {
                appHistoryDb.c().a(c() - cVar.e());
            }
            a = c();
        }
    }

    private final C5340bws c(EndPlayJson endPlayJson) {
        long g = endPlayJson.g();
        String b2 = endPlayJson.b();
        C8632dsu.a(b2, "");
        long c2 = c();
        int e2 = WatchEventTypes.b.e();
        List<EndPlayJson.j> f = endPlayJson.f();
        C8632dsu.a(f, "");
        int c3 = e(f).c();
        Long a2 = endPlayJson.a();
        C8632dsu.a(a2, "");
        return new C5340bws(String.valueOf(g), b2, c2, e2, c3, a2.longValue(), endPlayJson.h());
    }

    private final WatchNetworkType e(List<? extends EndPlayJson.j> list) {
        CurrentNetworkInfo.NetType d2;
        WatchNetworkType watchNetworkType = WatchNetworkType.a;
        return (list.size() != 1 || (d2 = list.get(0).d()) == null) ? watchNetworkType : d2.e() ? WatchNetworkType.c : d2.d() ? WatchNetworkType.d : watchNetworkType;
    }

    public static final void e(String str, JSONObject jSONObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jSONObject, "");
        if (ConfigFastPropertyFeatureControlConfig.Companion.s().e()) {
            C8166dfJ.b(null, false, 3, null);
            try {
                JSONObject jSONObject2 = new JSONObject();
                AppHistoryDb appHistoryDb = e;
                int b2 = appHistoryDb.c().b();
                List<C5340bws> a2 = appHistoryDb.c().a();
                InterfaceC5264bvV c2 = appHistoryDb.c();
                TimeUnit timeUnit = TimeUnit.DAYS;
                int d2 = c2.d(timeUnit.toMillis(28L), WatchNetworkType.c.c());
                int d3 = appHistoryDb.c().d(timeUnit.toMillis(28L), WatchNetworkType.d.c());
                jSONObject2.put("count", b2);
                jSONObject2.put("mobileCount", d2);
                jSONObject2.put("wifiCount", d3);
                if (a2.size() >= 1) {
                    jSONObject2.put("oldestEntryLife", TimeUnit.MILLISECONDS.toSeconds(b.c() - a2.get(0).e()));
                }
                jSONObject.put(str, jSONObject2);
            } catch (Exception unused) {
            }
        }
    }

    private final long c() {
        return System.currentTimeMillis();
    }
}
