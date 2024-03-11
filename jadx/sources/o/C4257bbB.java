package o;

import android.content.Context;
import com.netflix.cl.Logger;
import com.netflix.cl.model.NetflixTraceCategory;
import com.netflix.cl.model.NetflixTraceStatus;
import com.netflix.cl.model.event.discrete.PerformanceTraceReported;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import org.json.JSONObject;

/* renamed from: o.bbB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4257bbB {
    public static final e c = new e(null);
    private boolean a;
    private C1665aJs b;
    private List<Pair<Long, String>> d;
    private long e;
    private boolean f;
    private long g;
    private long h;
    private HashMap<String, Long> i;
    private boolean j;
    private final CreateRequest.DownloadRequestType k;
    private final String l;
    private final String m;
    private long n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13563o;

    public final boolean a() {
        return this.j;
    }

    public final boolean c() {
        return this.f;
    }

    public C4257bbB(String str, String str2, CreateRequest.DownloadRequestType downloadRequestType) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) downloadRequestType, "");
        this.m = str;
        this.l = str2;
        this.k = downloadRequestType;
        this.e = -1L;
        this.n = -1L;
        this.h = -1L;
        this.g = -1L;
        this.i = new HashMap<>();
        this.d = new ArrayList();
        C1665aJs c1665aJs = new C1665aJs(0L, null, false, null, 14, null);
        this.b = c1665aJs;
        c1665aJs.d("offlineRequestLatency");
    }

    /* renamed from: o.bbB$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("OfflineLatencyTracker");
        }
    }

    private final JSONObject a(String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, obj);
        return jSONObject;
    }

    public final void d() {
        C1665aJs c1665aJs = this.b;
        if (c1665aJs != null) {
            c1665aJs.d("browseData");
        }
    }

    public final void b(StatusCode statusCode) {
        C8632dsu.c((Object) statusCode, "");
        this.a = true;
        C1665aJs c1665aJs = this.b;
        if (c1665aJs != null) {
            c1665aJs.e("browseData", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? a("statusCode", statusCode.name()) : null);
        }
    }

    public final void b() {
        C1665aJs c1665aJs = this.b;
        if (c1665aJs != null) {
            c1665aJs.d("manifest");
        }
    }

    public final void e(StatusCode statusCode) {
        C8632dsu.c((Object) statusCode, "");
        this.f13563o = true;
        C1665aJs c1665aJs = this.b;
        if (c1665aJs != null) {
            c1665aJs.e("manifest", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? a("statusCode", statusCode.name()) : null);
        }
    }

    public final void e() {
        C1665aJs c1665aJs = this.b;
        if (c1665aJs != null) {
            c1665aJs.d("license");
        }
    }

    public final void d(StatusCode statusCode, boolean z) {
        C8632dsu.c((Object) statusCode, "");
        this.j = true;
        C1665aJs c1665aJs = this.b;
        if (c1665aJs != null) {
            c1665aJs.e("license", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? a("statusCode", statusCode.name()).put("isLicensed", z) : null);
        }
    }

    public final void c(String str) {
        C8632dsu.c((Object) str, "");
        C1665aJs c1665aJs = this.b;
        if (c1665aJs != null) {
            c1665aJs.d("images");
        }
        long nanoTime = System.nanoTime();
        if (this.i.isEmpty()) {
            this.g = nanoTime;
        }
        this.i.put(str, Long.valueOf(nanoTime));
    }

    public final void c(String str, StatusCode statusCode) {
        C8632dsu.c((Object) statusCode, "");
        if (str != null) {
            Long l = this.i.get(str);
            if (l != null) {
                this.d.add(new Pair<>(Long.valueOf(TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - l.longValue())), statusCode.name()));
            }
            this.i.remove(str);
        } else {
            for (Map.Entry<String, Long> entry : this.i.entrySet()) {
                List<Pair<Long, String>> list = this.d;
                long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - entry.getValue().longValue());
                list.add(new Pair<>(Long.valueOf(micros), statusCode.name()));
            }
            this.i.clear();
        }
        if (!this.i.isEmpty() || this.f) {
            return;
        }
        this.f = true;
        C1665aJs c1665aJs = this.b;
        if (c1665aJs != null) {
            c1665aJs.e("images", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? a("assetFetchLatencies", this.d.toString()) : null);
        }
    }

    public final void a(StatusCode statusCode) {
        C8632dsu.c((Object) statusCode, "");
        C1665aJs c1665aJs = this.b;
        if (c1665aJs != null) {
            if (statusCode != StatusCode.OK) {
                if (this.e != -1 && !this.a) {
                    b(statusCode);
                }
                if (this.n != -1 && !this.f13563o) {
                    e(statusCode);
                }
                if (this.h != -1 && !this.j) {
                    d(statusCode, false);
                }
                if (this.g != -1 && !this.f) {
                    c(null, statusCode);
                }
            }
            C1665aJs c1665aJs2 = this.b;
            if (c1665aJs2 != null) {
                c1665aJs2.e("offlineRequestLatency", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? a("oxId", this.l).put(SignupConstants.Field.VIDEO_ID, this.m).put("isLite", C8120deQ.a()).put("deviceMemory", C8120deQ.d((Context) C1332Xp.b(Context.class))).put("requestType", this.k.a()).put("statusCode", statusCode.name()) : null);
            }
            PerformanceTraceReported c2 = c1665aJs.c();
            c.getLogTag();
            Logger.INSTANCE.logEvent(c2);
        }
        this.b = null;
    }
}
