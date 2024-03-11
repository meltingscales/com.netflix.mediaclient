package o;

import com.netflix.android.volley.Request;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: o.bpU  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4945bpU extends C9822xI {
    private final aHJ d;

    public C4945bpU(aHJ ahj) {
        this.d = ahj;
    }

    @Override // o.C9822xI
    public HttpURLConnection e(URL url) {
        return this.d.c(url);
    }

    @Override // o.C9822xI
    public HttpURLConnection d(URL url, Request<?> request) {
        HttpURLConnection d = super.d(url, request);
        request.a(d);
        if ((d instanceof C1627aIh) && request.y() != null) {
            ((C1627aIh) d).c(request.y());
        }
        return d;
    }
}
