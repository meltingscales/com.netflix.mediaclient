package o;

import android.os.SystemClock;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bnN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4832bnN extends BaseEventJson {
    private static final long e = TimeUnit.SECONDS.toMillis(30);
    private int V;
    private transient long W;
    @SerializedName("estimators")
    protected Map<String, b> a;
    private long c;

    public boolean a() {
        return this.V > 0;
    }

    protected C4832bnN() {
        this.a = new HashMap();
        this.c = 0L;
        this.V = 0;
    }

    /* renamed from: o.bnN$b */
    /* loaded from: classes6.dex */
    class b {
        @SerializedName("tp")
        protected List<Long> c;
        @SerializedName("ts")
        protected List<Long> d;

        private b() {
            this.d = new ArrayList();
            this.c = new ArrayList();
        }

        void a(Long l, Long l2) {
            this.c.add(l2);
            this.d.add(l);
        }

        Long c() {
            if (this.c.size() == 0) {
                return -10000L;
            }
            List<Long> list = this.c;
            return list.get(list.size() - 1);
        }

        Long e() {
            if (this.c.size() == 0) {
                return -10000L;
            }
            List<Long> list = this.d;
            return list.get(list.size() - 1);
        }
    }

    public C4832bnN(String str, String str2, String str3, String str4, Long l, String str5) {
        super("tp_predictor", str, str2, str3, str4, str5);
        this.a = new HashMap();
        this.c = 0L;
        this.V = 0;
        this.W = l.longValue();
    }

    public void c(String str, long j, long j2) {
        synchronized (this) {
            if (this.c == 0) {
                this.c = j2;
            }
            if (!this.a.containsKey(str)) {
                this.a.put(str, new b());
            }
            b bVar = this.a.get(str);
            if (bVar != null && bVar.c().longValue() / 10 == j / 10) {
                if (j2 < bVar.e().longValue() + this.W + e) {
                    return;
                }
            }
            bVar.a(Long.valueOf(j2 - this.W), Long.valueOf(j));
            this.V++;
        }
    }

    public void c() {
        synchronized (this) {
            this.a.clear();
            this.V = 0;
            this.c = SystemClock.elapsedRealtime();
        }
    }

    public boolean f() {
        return this.c + e <= SystemClock.elapsedRealtime() || this.V > 1000;
    }
}
