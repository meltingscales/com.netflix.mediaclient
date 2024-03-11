package o;

import android.content.Context;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.net.RequestMetricsMarker;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class aHP implements aHI {
    private long a;
    private String b;
    private int c;
    private final List<RequestMetricsMarker> d;
    private long e;
    private String f;
    private int g;
    private String h;
    private String i;
    private int j;
    private long k;
    private long l;
    private Date m;
    private Date n;

    /* renamed from: o  reason: collision with root package name */
    private Date f13423o;
    private final boolean p;
    private long q;
    private boolean r;
    private long s;
    private long t;
    private final String u;
    private String v;
    private long y;

    @Override // o.aHI
    public String a() {
        return this.h;
    }

    @Override // o.aHI
    public long b() {
        return this.a;
    }

    @Override // o.aHI
    public int c() {
        return this.c;
    }

    @Override // o.aHI
    public String d() {
        return this.b;
    }

    @Override // o.aHI
    public int e() {
        return this.j;
    }

    @Override // o.aHI
    public long f() {
        return this.s;
    }

    @Override // o.aHI
    public long g() {
        return this.y;
    }

    @Override // o.aHI
    public long h() {
        return this.q;
    }

    @Override // o.aHI
    public Date i() {
        return this.n;
    }

    @Override // o.aHI
    public long j() {
        return this.t;
    }

    @Override // o.aHI
    public boolean m() {
        return this.p;
    }

    @Override // o.aHI
    public String n() {
        return this.u;
    }

    @Override // o.aHI
    public String o() {
        return this.v;
    }

    public aHP(Context context, RequestFinishedInfo requestFinishedInfo, List<RequestMetricsMarker> list) {
        CronetException exception;
        this.a = -1L;
        this.e = -1L;
        this.t = -1L;
        this.s = -1L;
        this.q = -1L;
        this.y = -1L;
        this.l = -1L;
        this.k = -1L;
        this.j = -1;
        this.c = -1;
        this.b = null;
        this.g = -1;
        boolean z = requestFinishedInfo.getFinishedReason() == 2;
        boolean z2 = requestFinishedInfo.getFinishedReason() == 0;
        this.p = z2;
        this.u = requestFinishedInfo.getUrl();
        this.d = list == null ? Collections.emptyList() : list;
        RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
        if (metrics == null) {
            C1044Mm.d("nf_cr_stats", "missing metrics for " + requestFinishedInfo.getUrl());
            return;
        }
        Date dnsStart = metrics.getDnsStart();
        Date dnsEnd = metrics.getDnsEnd();
        if (dnsStart != null && dnsEnd != null) {
            this.a = dnsEnd.getTime() - dnsStart.getTime();
        }
        Date sslStart = metrics.getSslStart();
        Date sslEnd = metrics.getSslEnd();
        if (sslStart != null && sslEnd != null) {
            this.s = sslEnd.getTime() - sslStart.getTime();
        }
        Date connectStart = metrics.getConnectStart();
        Date connectEnd = metrics.getConnectEnd();
        if (connectStart != null && connectEnd != null) {
            long time = connectEnd.getTime() - connectStart.getTime();
            this.e = time;
            long j = this.s;
            if (j > 0 && time > j) {
                time -= j;
            }
            this.t = time;
        }
        Long ttfbMs = metrics.getTtfbMs();
        this.q = ttfbMs != null ? ttfbMs.longValue() : -1L;
        this.n = metrics.getRequestStart();
        Date requestEnd = metrics.getRequestEnd();
        this.m = requestEnd;
        if (this.n != null && requestEnd != null) {
            this.y = requestEnd.getTime() - this.n.getTime();
        }
        Long receivedByteCount = metrics.getReceivedByteCount();
        if (receivedByteCount != null) {
            this.l = receivedByteCount.longValue();
        }
        Long sentByteCount = metrics.getSentByteCount();
        if (sentByteCount != null) {
            this.k = sentByteCount.longValue();
        }
        this.r = metrics.getSocketReused();
        UrlResponseInfo responseInfo = requestFinishedInfo.getResponseInfo();
        if (responseInfo != null) {
            this.j = responseInfo.getHttpStatusCode();
            this.i = c(responseInfo.getNegotiatedProtocol());
            List<String> list2 = responseInfo.getAllHeaders().get("Via");
            if (list2 != null && !list2.isEmpty()) {
                this.v = list2.get(0);
            }
            List<String> list3 = responseInfo.getAllHeaders().get("X-Ftl-Error");
            if (list3 != null && !list3.isEmpty()) {
                this.h = list3.get(0);
            }
        }
        if (!z2 && !z && (exception = requestFinishedInfo.getException()) != null && (exception instanceof NetworkException)) {
            NetworkException networkException = (NetworkException) exception;
            this.c = networkException.getErrorCode();
            this.g = networkException.getCronetInternalErrorCode();
            this.b = networkException.getMessage();
        }
        this.f13423o = metrics.getResponseStart();
        this.f = aHK.c(context);
    }

    @Override // o.aHI
    public JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "networkStats");
        jSONObject.put(SignupConstants.Field.URL, this.u);
        jSONObject.put("dnsTime", this.a);
        jSONObject.put("connectionTime", this.e);
        jSONObject.put("sslTime", this.s);
        jSONObject.put("ttfb", this.q);
        jSONObject.put("remainingDownloadTime", this.y - this.q);
        jSONObject.put("receivedBytesCount", this.l);
        jSONObject.put("socketReused", this.r);
        int i = this.j;
        if (i >= 0) {
            jSONObject.put("httpStatusCode", i);
        }
        int i2 = this.c;
        if (i2 >= 0) {
            jSONObject.put("cronetErrorCode", i2);
            jSONObject.put("cronetInternalErrorCode", this.g);
        }
        jSONObject.put("httpVersion", this.i);
        jSONObject.put("networkType", this.f);
        return jSONObject;
    }

    private static String c(String str) {
        return (str == null || !str.equals("h2")) ? "1.x" : "2";
    }
}
