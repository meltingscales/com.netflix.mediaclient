package o;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* renamed from: o.bmX  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4789bmX implements InterfaceC4835bnQ {
    private final RequestFinishedInfo d;

    public C4789bmX(RequestFinishedInfo requestFinishedInfo) {
        C8632dsu.c((Object) requestFinishedInfo, "");
        this.d = requestFinishedInfo;
    }

    @Override // o.InterfaceC4835bnQ
    public boolean h() {
        return this.d.getFinishedReason() == 1;
    }

    @Override // o.InterfaceC4835bnQ
    public long i() {
        RequestFinishedInfo.Metrics metrics = this.d.getMetrics();
        Long receivedByteCount = metrics != null ? metrics.getReceivedByteCount() : null;
        if (receivedByteCount == null) {
            return 0L;
        }
        return receivedByteCount.longValue();
    }

    @Override // o.InterfaceC4835bnQ
    public long f() {
        RequestFinishedInfo.Metrics metrics = this.d.getMetrics();
        Long totalTimeMs = metrics != null ? metrics.getTotalTimeMs() : null;
        if (totalTimeMs == null) {
            return 0L;
        }
        return totalTimeMs.longValue();
    }

    @Override // o.InterfaceC4835bnQ
    public long e() {
        Date dnsEnd;
        Date dnsStart;
        RequestFinishedInfo.Metrics metrics = this.d.getMetrics();
        if (metrics == null || (dnsEnd = metrics.getDnsEnd()) == null) {
            return -1L;
        }
        long time = dnsEnd.getTime();
        RequestFinishedInfo.Metrics metrics2 = this.d.getMetrics();
        return time - ((metrics2 == null || (dnsStart = metrics2.getDnsStart()) == null) ? 0L : dnsStart.getTime());
    }

    @Override // o.InterfaceC4835bnQ
    public long b() {
        Date connectEnd;
        Date connectStart;
        RequestFinishedInfo.Metrics metrics = this.d.getMetrics();
        if (metrics == null || (connectEnd = metrics.getConnectEnd()) == null) {
            return -1L;
        }
        long time = connectEnd.getTime();
        RequestFinishedInfo.Metrics metrics2 = this.d.getMetrics();
        return time - ((metrics2 == null || (connectStart = metrics2.getConnectStart()) == null) ? 0L : connectStart.getTime());
    }

    @Override // o.InterfaceC4835bnQ
    public long o() {
        RequestFinishedInfo.Metrics metrics = this.d.getMetrics();
        Long ttfbMs = metrics != null ? metrics.getTtfbMs() : null;
        if (ttfbMs == null) {
            return 0L;
        }
        return ttfbMs.longValue();
    }

    @Override // o.InterfaceC4835bnQ
    public long g() {
        Date requestStart;
        RequestFinishedInfo.Metrics metrics = this.d.getMetrics();
        if (metrics == null || (requestStart = metrics.getRequestStart()) == null) {
            return 0L;
        }
        return requestStart.getTime();
    }

    @Override // o.InterfaceC4835bnQ
    public boolean j() {
        RequestFinishedInfo.Metrics metrics = this.d.getMetrics();
        if (metrics != null) {
            return metrics.getSocketReused();
        }
        return false;
    }

    @Override // o.InterfaceC4835bnQ
    public Map<String, String> a() {
        Map<String, String> d;
        Map<String, List<String>> allHeaders;
        int e;
        String d2;
        UrlResponseInfo responseInfo = this.d.getResponseInfo();
        if (responseInfo == null || (allHeaders = responseInfo.getAllHeaders()) == null) {
            d = dqE.d();
            return d;
        }
        e = dqD.e(allHeaders.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator<T> it = allHeaders.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            C8632dsu.a(value, "");
            d2 = C8576dqs.d((Iterable) value, null, null, null, 0, null, null, 63, null);
            linkedHashMap.put(key, d2);
        }
        return linkedHashMap;
    }

    @Override // o.InterfaceC4835bnQ
    public String n() {
        String url = this.d.getUrl();
        C8632dsu.a(url, "");
        return url;
    }

    @Override // o.InterfaceC4835bnQ
    public Throwable d() {
        return this.d.getException();
    }

    @Override // o.InterfaceC4835bnQ
    public int c() {
        UrlResponseInfo responseInfo = this.d.getResponseInfo();
        if (responseInfo != null) {
            return responseInfo.getHttpStatusCode();
        }
        return 0;
    }
}
