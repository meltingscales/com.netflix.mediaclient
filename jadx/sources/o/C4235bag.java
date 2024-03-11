package o;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.net.NetworkException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* renamed from: o.bag  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4235bag {
    @SerializedName("cip")
    private String a;
    @SerializedName("dns")
    private Long b;
    @SerializedName("client_send_ts")
    private long c;
    @SerializedName("d")
    private Long d;
    @SerializedName("client_recv_ts")
    private long e;
    @SerializedName("ip")
    private String f;
    @SerializedName("err")
    private String g;
    @SerializedName("sc")
    private Integer h;
    @SerializedName("method")
    private String i;
    @SerializedName("sz")
    private Long j;
    @SerializedName("rtts")
    private Map<String, Integer> k;
    @SerializedName("tcp")
    private Long l;
    @SerializedName("pf_err")
    private String m;
    @SerializedName("server_recv_ts")
    private long n;
    @SerializedName("pf_code")

    /* renamed from: o  reason: collision with root package name */
    private Integer f13560o;
    @SerializedName("ttfb")
    private Long p;
    @SerializedName("via")
    private String q;
    @SerializedName("tls")
    private Long s;

    public void a(long j) {
        this.n = j;
    }

    public void b(long j) {
        this.c = j;
    }

    public void b(String str) {
        this.a = str;
    }

    public void c(String str) {
        this.i = str;
    }

    public void d(String str) {
        this.f = str;
    }

    public void e(long j) {
        this.e = j;
    }

    public void e(String str) {
        this.q = str;
    }

    public void c(long j) {
        this.j = Long.valueOf(j);
    }

    public void h(long j) {
        this.d = Long.valueOf(j);
    }

    public void d(long j) {
        this.b = Long.valueOf(j);
    }

    public void i(long j) {
        this.p = Long.valueOf(j);
    }

    public void b(int i) {
        this.h = Integer.valueOf(i);
    }

    public void d(int i, int i2, String str) {
        this.h = Integer.valueOf(i);
        this.f13560o = Integer.valueOf(i2);
        this.m = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(aHI ahi) {
        this.l = Long.valueOf(ahi.j() >= 0 ? ahi.j() : 0L);
        this.s = Long.valueOf(ahi.f() >= 0 ? ahi.f() : 0L);
        this.b = Long.valueOf(ahi.b() >= 0 ? ahi.b() : 0L);
        this.p = ahi.h() >= 0 ? Long.valueOf(ahi.h()) : null;
        this.d = ahi.g() >= 0 ? Long.valueOf(ahi.g()) : null;
        this.q = ahi.o();
        long time = ahi.i().getTime();
        this.c = time;
        Long l = this.p;
        if (l != null) {
            this.e = time + l.longValue();
        }
        if (!ahi.m()) {
            this.h = Integer.valueOf(C5044brN.c(ahi.c()));
        } else {
            this.h = Integer.valueOf(ahi.e());
        }
        this.f13560o = ahi.c() >= 0 ? Integer.valueOf(ahi.c()) : null;
        this.m = ahi.d();
        this.i = "https";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        Integer num = this.h;
        return num != null && (num.intValue() < 200 || this.h.intValue() >= 300 || this.j != null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(RequestFinishedInfo requestFinishedInfo) {
        RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
        if (metrics != null) {
            this.b = Long.valueOf(a(metrics.getDnsStart(), metrics.getDnsEnd()));
            this.s = Long.valueOf(a(metrics.getSslStart(), metrics.getSslEnd()));
            this.l = Long.valueOf(a(metrics.getConnectStart(), metrics.getConnectEnd()) - this.s.longValue());
            this.p = metrics.getTtfbMs();
            this.d = Long.valueOf(a(metrics.getRequestStart(), metrics.getRequestEnd()));
            long time = metrics.getRequestStart().getTime();
            this.c = time;
            Long l = this.p;
            if (l != null) {
                this.e = time + l.longValue();
            }
        }
        UrlResponseInfo responseInfo = requestFinishedInfo.getResponseInfo();
        if (responseInfo != null) {
            Map<String, List<String>> allHeaders = responseInfo.getAllHeaders();
            this.h = Integer.valueOf(responseInfo.getHttpStatusCode());
            this.q = a(allHeaders, "Via");
            this.a = a(allHeaders, "X-Ftl-Probe-Data");
            this.g = a(allHeaders, "X-Ftl-Error");
            this.n = a(a(allHeaders, "X-Ftl-Probe-Recv-Ts"));
            this.k = j(a(allHeaders, "Latency-Trace"));
        }
        if (requestFinishedInfo.getException() instanceof NetworkException) {
            NetworkException networkException = (NetworkException) requestFinishedInfo.getException();
            this.h = Integer.valueOf(C5044brN.c(networkException.getErrorCode()));
            this.f13560o = Integer.valueOf(networkException.getErrorCode());
            this.m = networkException.getMessage();
        }
        this.i = "https";
    }

    private static long a(Date date, Date date2) {
        if (date == null || date2 == null) {
            return 0L;
        }
        return date2.getTime() - date.getTime();
    }

    private static String a(Map<String, List<String>> map, String str) {
        List<String> list;
        if (map == null || (list = map.get(str)) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private static long a(String str) {
        if (C8168dfL.h(str)) {
            try {
                return Long.parseLong(str);
            } catch (Exception unused) {
                return 0L;
            }
        }
        return 0L;
    }

    private static Map<String, Integer> j(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : str.split(";")) {
            String[] split = str2.trim().split("=");
            if (split != null && split.length == 2) {
                try {
                    hashMap.put(split[0].trim(), Integer.valueOf(Integer.parseInt(split[1], 10)));
                } catch (Exception unused) {
                }
            }
        }
        return hashMap;
    }
}
