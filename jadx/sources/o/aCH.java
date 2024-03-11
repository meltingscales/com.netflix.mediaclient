package o;

import android.content.Context;
import com.netflix.android.volley.Request;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import com.netflix.mediaclient.service.webclient.volley.StatusCodeError;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AbstractC7829dGx;

/* loaded from: classes3.dex */
public final class aCH extends AbstractC5039brI<dpR> implements aCC {
    public static final b d = new b(null);
    private final boolean a;
    private aCB e;
    private final Context k;
    private final C7826dGu l;
    private final C1567aGb m;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC1468aCk f13420o;
    private Map<String, String> p;

    @AssistedFactory
    /* loaded from: classes3.dex */
    public interface a {
        aCH e(C7826dGu c7826dGu, C1567aGb c1567aGb, boolean z);
    }

    @Override // o.AbstractC5042brL
    public boolean O() {
        return this.a;
    }

    public aCB P() {
        return this.e;
    }

    @Override // com.netflix.android.volley.Request
    public String a() {
        return "application/json";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5042brL
    /* renamed from: c */
    public void a(dpR dpr) {
        C8632dsu.c((Object) dpr, "");
    }

    @Override // o.aCC
    public void e(aCB acb) {
        this.e = acb;
    }

    @Override // o.AbstractC5039brI
    public /* synthetic */ dpR e(String str, String str2) {
        d(str, str2);
        return dpR.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public aCH(@ApplicationContext Context context, InterfaceC1468aCk interfaceC1468aCk, @Assisted C7826dGu c7826dGu, @Assisted C1567aGb c1567aGb, @Assisted boolean z) {
        super(context, 1);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC1468aCk, "");
        C8632dsu.c((Object) c7826dGu, "");
        this.k = context;
        this.f13420o = interfaceC1468aCk;
        this.l = c7826dGu;
        this.m = c1567aGb;
        this.a = z;
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("NetflixApolloVolleyWebClientRequest");
        }
    }

    @Override // o.AbstractC5039brI, o.AbstractC5042brL
    public void a(ApiEndpointRegistry apiEndpointRegistry) {
        C8632dsu.c((Object) apiEndpointRegistry, "");
        ((AbstractC5039brI) this).h = apiEndpointRegistry;
        g(this.l.j().toString());
    }

    @Override // com.netflix.android.volley.Request
    public Object y() {
        return NetworkRequestType.GRAPHQL;
    }

    @Override // com.netflix.android.volley.Request
    public byte[] Q_() {
        AbstractC7825dGt b2 = this.l.b();
        if (b2 != null) {
            return a(b2);
        }
        throw new IllegalStateException("request.body() was null in NetflixApolloVolleyWebClientRequest");
    }

    public final byte[] a(AbstractC7825dGt abstractC7825dGt) {
        C8632dsu.c((Object) abstractC7825dGt, "");
        C7872dIo c7872dIo = new C7872dIo();
        abstractC7825dGt.a(c7872dIo);
        String v = c7872dIo.v();
        Charset forName = Charset.forName("utf-8");
        C8632dsu.a(forName, "");
        byte[] bytes = v.getBytes(forName);
        C8632dsu.a(bytes, "");
        return bytes;
    }

    @Override // o.AbstractC5039brI, o.AbstractC5042brL, com.netflix.android.volley.Request
    public Map<String, String> j() {
        boolean g;
        Map<String, String> j = super.j();
        if (j == null) {
            j = new LinkedHashMap<>();
        }
        for (String str : this.l.c().d()) {
            j.put(str, this.l.c().a(str));
        }
        j.put("X-Netflix.client.type", "samurai");
        j.put("X-Netflix.client.appversion", String.valueOf(C8054ddD.c()));
        j.put("X-Netflix.Request.Client.Context", C5043brM.a.a().toString());
        if (C5041brK.a(this.k) || this.f13420o.b()) {
            j.put("x-netflix.tracing.client-sampled", "true");
        }
        String c = C5041brK.c(this.k);
        if (c != null) {
            g = C8691duz.g(c);
            if (!g) {
                j.put("schema-variant", C5041brK.c(this.k));
            }
        }
        return j;
    }

    @Override // o.AbstractC5042brL, com.netflix.android.volley.Request
    public Request.Priority s() {
        String a2 = this.l.a("X-Netflix-Internal-Volley-Priority");
        if (C8632dsu.c((Object) a2, (Object) RequestPriority.b.toString())) {
            return Request.Priority.LOW;
        }
        if (C8632dsu.c((Object) a2, (Object) RequestPriority.d.toString())) {
            return Request.Priority.HIGH;
        }
        if (C8632dsu.c((Object) a2, (Object) RequestPriority.a.toString())) {
            return Request.Priority.IMMEDIATE;
        }
        if (C8632dsu.c((Object) a2, (Object) RequestPriority.c.toString())) {
            return Request.Priority.NORMAL;
        }
        Request.Priority s = super.s();
        C8632dsu.a(s, "");
        return s;
    }

    @Override // o.AbstractC5039brI, o.AbstractC5042brL, com.netflix.android.volley.Request
    public C9864xy<dpR> b(C9858xs c9858xs) {
        this.p = c9858xs != null ? c9858xs.d : null;
        C9864xy<dpR> b2 = super.b(c9858xs);
        C8632dsu.a(b2, "");
        return b2;
    }

    protected void d(String str, String str2) {
        C8632dsu.c((Object) str, "");
        aCB P = P();
        if (P == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        P.c(200, this.p, AbstractC7829dGx.c.c(AbstractC7829dGx.b, str, null, 1, null).e());
    }

    @Override // o.AbstractC5042brL
    public void d(Status status) {
        String str;
        StatusCodeError statusCodeError;
        if ((status != null ? status.e() : null) != null) {
            statusCodeError = new StatusCodeError(status.c(), status.e());
        } else {
            StatusCode c = status != null ? status.c() : null;
            if (status == null || (str = status.l()) == null) {
                str = "Null status message in NetflixApolloVolleyWebClientRequest.onFailure with code " + (status != null ? status.c() : null);
            }
            statusCodeError = new StatusCodeError(c, str);
        }
        aCB P = P();
        if (P == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        P.d(new IOException(statusCodeError));
    }

    @Override // o.AbstractC5039brI, o.AbstractC5042brL
    public String K() {
        return this.l.i();
    }

    @Override // o.AbstractC5039brI
    public String R() {
        C1567aGb c1567aGb = this.m;
        if (c1567aGb == null || C8632dsu.c(c1567aGb, C1567aGb.a.d())) {
            return null;
        }
        return this.m.a();
    }
}
