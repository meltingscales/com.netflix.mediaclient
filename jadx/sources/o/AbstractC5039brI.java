package o;

import android.content.Context;
import android.os.SystemClock;
import android.util.ArrayMap;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.netflix.android.volley.AuthFailureError;
import com.netflix.android.volley.VolleyError;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import com.netflix.mediaclient.service.webclient.volley.StatusCodeError;
import com.netflix.model.leafs.originals.interactive.animations.Ease;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.brI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5039brI<T> extends AbstractC5042brL<T> {
    protected long f;
    public Context g;
    public ApiEndpointRegistry h;
    protected ApiEndpointRegistry.ResponsePathFormat i;
    protected String j;
    protected String n;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.brI$d */
    /* loaded from: classes4.dex */
    public interface d {
        boolean aF();
    }

    @Override // com.netflix.android.volley.Request
    public boolean C() {
        return true;
    }

    @Override // o.AbstractC5042brL
    public String K() {
        return "get";
    }

    public boolean Q() {
        return false;
    }

    public String R() {
        return null;
    }

    protected abstract T e(String str, String str2);

    public AbstractC5039brI(Context context) {
        super(0);
        b(context, (ApiEndpointRegistry.ResponsePathFormat) null);
    }

    public AbstractC5039brI(Context context, ApiEndpointRegistry.ResponsePathFormat responsePathFormat, int i) {
        super(i);
        b(context, responsePathFormat);
    }

    public AbstractC5039brI(Context context, int i) {
        super(i);
        b(context, (ApiEndpointRegistry.ResponsePathFormat) null);
    }

    private void b(Context context, ApiEndpointRegistry.ResponsePathFormat responsePathFormat) {
        this.n = C8180dfX.e.c();
        this.g = context;
        if (responsePathFormat == null) {
            this.i = ApiEndpointRegistry.ResponsePathFormat.HIERARCHICAL;
        } else {
            this.i = responsePathFormat;
        }
    }

    protected static String j(String str, String str2) {
        String a = C8179dfW.a(str2);
        return "&" + str + "=" + a;
    }

    @Override // o.AbstractC5042brL
    public String a(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(C8168dfL.d("method", K(), "?"));
        if (Q()) {
            sb.append(C8168dfL.d("materialize", "true", "&"));
        }
        if (!N()) {
            sb.append(Z());
        }
        C8190dfh c8190dfh = (C8190dfh) this.h.a(this.i);
        for (String str2 : c8190dfh.keySet()) {
            for (String str3 : c8190dfh.c(str2)) {
                sb.append(C8168dfL.d(str2, str3, "&"));
            }
        }
        if (!N()) {
            String J2 = J();
            if (C8168dfL.h(J2)) {
                sb.append(J2);
            }
        }
        d(sb);
        String sb2 = sb.toString();
        C1044Mm.d("NQVolleyWebClientRequest", "VolleyWebClientRequest URL = %s", sb2);
        return sb2;
    }

    public StringBuilder d(StringBuilder sb) {
        String obj;
        Object y = y();
        if (y instanceof String) {
            obj = (String) y;
        } else {
            obj = y != null ? y.toString() : null;
        }
        if (C8168dfL.h(obj)) {
            sb.append("&TAG=");
            sb.append(obj);
        }
        return sb;
    }

    protected List<String> L() {
        return new ArrayList();
    }

    public String Z() {
        List<String> L = L();
        if (L == null) {
            throw new IllegalArgumentException("List of queries is null!");
        }
        StringBuilder sb = new StringBuilder();
        for (String str : L) {
            sb.append(j(V(), str));
        }
        return sb.toString();
    }

    @Override // o.AbstractC5042brL, com.netflix.android.volley.Request
    public C9864xy<T> b(C9858xs c9858xs) {
        Map<String, String> map;
        if (c9858xs != null && (map = c9858xs.d) != null) {
            map.get("X-Netflix.api-script-execution-time");
            c9858xs.d.get("X-Netflix.execution-time");
            this.j = c9858xs.d.get("X-Netflix.api-script-revision");
        } else {
            C1044Mm.j("NQVolleyWebClientRequest", "execTime not found!");
        }
        return super.b(c9858xs);
    }

    @Override // o.AbstractC5042brL
    protected T a_(String str, String str2) {
        T t;
        this.f = SystemClock.elapsedRealtime();
        try {
            t = e(str, str2);
        } catch (Exception e) {
            b(e, str);
            t = null;
        }
        this.f = SystemClock.elapsedRealtime() - this.f;
        if (S() || t != null) {
            return t;
        }
        throw new FalkorException("Parsing returned null.");
    }

    private void b(Exception exc, String str) {
        boolean z = exc instanceof FalkorException;
        if (z && C1079Nx.e(exc.getCause())) {
            FalkorException falkorException = (FalkorException) exc;
            InterfaceC1597aHe.b(new C1596aHd().b(ErrorType.m).d(exc.getCause()).e(C1079Nx.a(exc)).e("taskName", falkorException.e).e("errorSource", "ApiNQVolleyWebClientRequest").e(falkorException.c).e(h(str)));
        } else if (C1079Nx.e(exc)) {
            InterfaceC1597aHe.b(new C1596aHd().d(exc).e("errorSource", "ApiNQVolleyWebClientRequest").e(h(str)));
        } else if ((z && ((FalkorException) exc).b()) || (exc instanceof StatusCodeError)) {
            C1596aHd e = new C1596aHd().b(ErrorType.m).d(exc).b(false).e(e(exc)).e("errorSource", "ApiNQVolleyWebClientRequest").e(h(str));
            if (z) {
                FalkorException falkorException2 = (FalkorException) exc;
                e.e("taskName", falkorException2.e);
                e.e(falkorException2.c);
            }
            InterfaceC1598aHf.a(e);
        }
        if (exc instanceof VolleyError) {
            throw ((VolleyError) exc);
        }
        throw new VolleyError(exc);
    }

    private Map<String, String> h(String str) {
        try {
            JsonObject asJsonObject = new JsonParser().parse(str).getAsJsonObject();
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("volleyJsonErrorMessage", C0946Ir.d(asJsonObject, "NQVolleyWebClientRequest"));
            arrayMap.put("volleyFalkorPaths", C0946Ir.d(asJsonObject));
            return arrayMap;
        } catch (Throwable unused) {
            return Collections.emptyMap();
        }
    }

    private boolean e(Exception exc) {
        if (exc instanceof FalkorException) {
            FalkorException falkorException = (FalkorException) exc;
            return "PrefetchLoLoMo".equals(falkorException.e) || "RefreshLomo".equals(falkorException.e);
        }
        return false;
    }

    @Override // o.AbstractC5042brL, com.netflix.android.volley.Request
    public void b(T t) {
        super.b((AbstractC5039brI<T>) t);
        aa();
        Context context = this.g;
        if (context != null) {
            C4221baS.a(context);
        }
    }

    @Override // o.AbstractC5042brL, com.netflix.android.volley.Request
    public void a_(VolleyError volleyError) {
        long aa = aa();
        C1044Mm.a("NQVolleyWebClientRequest", "request duration time (ms): %d, class: %s, error: %s", Long.valueOf(aa), getClass().getSimpleName(), volleyError);
        NetflixStatus a = C8237dgb.a(volleyError, StatusCode.NET_GENERAL_NETWORK_ERROR);
        if (this.g != null && C8107deD.b(a.c())) {
            C8107deD.e(this.g, a.c());
        }
        d((Status) a);
    }

    @Override // o.AbstractC5042brL
    public void a(ApiEndpointRegistry apiEndpointRegistry) {
        this.h = apiEndpointRegistry;
        g(apiEndpointRegistry.a((String) null).toExternalForm());
    }

    public String V() {
        return "get".equals(K()) ? Ease.ANIMATION_EASE_TYPE.PATH : "callPath";
    }

    @Override // o.AbstractC5042brL, com.netflix.android.volley.Request
    public Map<String, String> j() {
        if (O() && Y()) {
            throw new AuthFailureError("Can't build valid headers. Cookies are null. url=" + u());
        }
        Map<String, String> j = super.j();
        if (j == null) {
            j = new HashMap<>();
        }
        if (!P()) {
            j.put("X-Netflix.request.uuid", "" + this.n);
        }
        j.putAll(this.h.a());
        aOV aov = ((AbstractC5042brL) this).s;
        return (aov == null || aov.w() == null || ((AbstractC5042brL) this).s.w().k() == null) ? j : aJM.e(j, ((AbstractC5042brL) this).s.w().k(), C8055ddE.e(AbstractApplicationC1040Mh.d()));
    }

    @Override // com.netflix.android.volley.Request
    public VolleyError e(VolleyError volleyError) {
        StatusCode d2 = C8237dgb.d(volleyError);
        if (d2 != null) {
            return new StatusCodeError(d2, volleyError.getCause());
        }
        return B() ? C8237dgb.b(volleyError) : volleyError;
    }

    private boolean P() {
        return ((d) EntryPointAccessors.fromApplication(this.g, d.class)).aF();
    }
}
