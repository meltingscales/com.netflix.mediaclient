package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.aSk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1900aSk<T> extends AbstractC1902aSm<T> {
    private static final String d = "ApiFalkorRequest";
    private final String a;

    public AbstractC1900aSk(Context context, NetflixDataRequest.Transport transport, String str) {
        super(context, transport);
        this.a = str;
    }

    @Override // o.AbstractC1902aSm
    protected NetflixDataRequest d() {
        NetflixDataRequest.Transport transport = this.e;
        if (transport == NetflixDataRequest.Transport.msl) {
            C1044Mm.e(d, "Create MSL transport for");
            return new AbstractC2103aZz<T>() { // from class: o.aSk.2
                @Override // o.AbstractC2103aZz, o.aZE
                public void L() {
                    k(((aZE) this).i.j().i().toExternalForm());
                }

                @Override // o.AbstractC2100aZw
                public List<String> J() {
                    return AbstractC1900aSk.this.c();
                }

                @Override // o.aZE
                public void a(T t) {
                    AbstractC1900aSk.this.b(t);
                }

                @Override // o.aZE
                public void e(Status status) {
                    AbstractC1900aSk.this.e(status);
                }

                @Override // o.AbstractC2100aZw
                public T a(String str) {
                    return AbstractC1900aSk.this.e(str, null);
                }

                @Override // o.AbstractC2100aZw
                public String M() {
                    return AbstractC1900aSk.this.e();
                }

                @Override // o.aZE
                public boolean Q() {
                    return AbstractC1900aSk.this.j();
                }

                @Override // o.AbstractC2103aZz, o.AbstractC2100aZw, o.aZE, com.netflix.android.volley.Request
                public Map<String, String> o() {
                    Map<String, String> o2 = super.o();
                    Map<String, String> b = AbstractC1900aSk.this.b();
                    if (b != null || b.size() > 0) {
                        o2.putAll(b);
                    }
                    return o2;
                }

                @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
                public Object y() {
                    return AbstractC1900aSk.this.i();
                }

                @Override // o.aZE, com.netflix.android.volley.Request
                public Map<String, String> j() {
                    Map<String, String> j = super.j();
                    if (j == null) {
                        j = new HashMap<>();
                    }
                    j.put("X-Netflix.Request.NqTracking", AbstractC1900aSk.this.a);
                    j.put("X-Netflix.Request.Client.Context", C5043brM.a.a().toString());
                    if (C5041brK.a(AbstractC1900aSk.this.c)) {
                        j.put("x-netflix.tracing.client-sampled", "true");
                    }
                    return j;
                }
            };
        } else if (transport == NetflixDataRequest.Transport.web) {
            C1044Mm.e(d, "Create Web transport for");
            return new AbstractC5039brI<T>(this.c) { // from class: o.aSk.5
                @Override // o.AbstractC5039brI, o.AbstractC5042brL
                public void a(ApiEndpointRegistry apiEndpointRegistry) {
                    ((AbstractC5039brI) this).h = apiEndpointRegistry;
                    g(apiEndpointRegistry.i().toExternalForm());
                }

                @Override // o.AbstractC5039brI
                public List<String> L() {
                    return AbstractC1900aSk.this.c();
                }

                @Override // o.AbstractC5042brL
                public void a(T t) {
                    AbstractC1900aSk.this.b(t);
                }

                @Override // o.AbstractC5042brL
                public void d(Status status) {
                    AbstractC1900aSk.this.e(status);
                }

                @Override // o.AbstractC5039brI
                public T e(String str, String str2) {
                    return AbstractC1900aSk.this.e(str, str2);
                }

                @Override // o.AbstractC5039brI, o.AbstractC5042brL
                public String K() {
                    return AbstractC1900aSk.this.e();
                }

                @Override // o.AbstractC5042brL
                public boolean X() {
                    return AbstractC1900aSk.this.h();
                }

                @Override // o.AbstractC5042brL
                public boolean O() {
                    return AbstractC1900aSk.this.f();
                }

                @Override // o.AbstractC5042brL
                public boolean S() {
                    return AbstractC1900aSk.this.j();
                }

                @Override // com.netflix.android.volley.Request
                public Object y() {
                    return AbstractC1900aSk.this.i();
                }

                @Override // o.AbstractC5042brL
                public String J() {
                    StringBuilder sb = new StringBuilder();
                    Map<String, String> b = AbstractC1900aSk.this.b();
                    if (b != null || b.size() > 0) {
                        try {
                            for (Map.Entry<String, String> entry : b.entrySet()) {
                                if (entry.getValue() != null) {
                                    sb.append('&');
                                    sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                                    sb.append('=');
                                    sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                                }
                            }
                        } catch (UnsupportedEncodingException unused) {
                        }
                    }
                    return sb.toString();
                }

                @Override // o.AbstractC5039brI, o.AbstractC5042brL, com.netflix.android.volley.Request
                public Map<String, String> j() {
                    Map<String, String> j = super.j();
                    if (j == null) {
                        j = new HashMap<>();
                    }
                    j.put("X-Netflix.Request.NqTracking", AbstractC1900aSk.this.a);
                    j.put("X-Netflix.Request.Client.Context", C5043brM.a.a().toString());
                    return j;
                }
            };
        } else {
            throw new IllegalStateException("Uknown transport type " + this.e);
        }
    }
}
