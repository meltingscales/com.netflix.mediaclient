package o;

import android.content.Context;
import android.os.SystemClock;
import com.netflix.android.volley.AuthFailureError;
import com.netflix.android.volley.VolleyError;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.AUIApiEndpointRegistry;
import com.netflix.mediaclient.service.webclient.model.leafs.UserCookies;
import com.netflix.mediaclient.service.webclient.volley.StatusCodeError;
import com.netflix.mediaclient.util.net.AuthCookieHolder;
import com.netflix.model.leafs.originals.interactive.animations.Ease;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public abstract class aMK<T> extends AbstractC5042brL<T> {
    protected int a;
    protected aMU d;
    protected AUIApiEndpointRegistry e;
    protected String f;
    protected Context g;
    protected long h;
    protected aOV i;
    protected long j;
    protected long k;
    protected UUID n;

    /* renamed from: o  reason: collision with root package name */
    protected AUIApiEndpointRegistry.ResponsePathFormat f13432o;

    @Override // o.AbstractC5042brL
    public String K() {
        return "get";
    }

    protected abstract List<String> L();

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean P() {
        return false;
    }

    protected abstract T j(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public aMK(Context context, aOV aov) {
        super(0);
        this.k = -1L;
        this.i = aov;
        a(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public aMK(Context context, aOV aov, int i) {
        super(i);
        this.k = -1L;
        this.i = aov;
        a(context, null);
    }

    private void a(Context context, AUIApiEndpointRegistry.ResponsePathFormat responsePathFormat) {
        this.n = UUID.randomUUID();
        this.g = context;
        if (responsePathFormat == null) {
            this.f13432o = AUIApiEndpointRegistry.ResponsePathFormat.HIERARCHICAL;
        } else {
            this.f13432o = responsePathFormat;
        }
    }

    protected static String e(String str, String str2) {
        String a = C8179dfW.a(str2);
        return "&" + str + "=" + a;
    }

    @Override // o.AbstractC5042brL
    public String a(String str) {
        String Q = Q();
        StringBuilder sb = new StringBuilder(str);
        sb.append(C8168dfL.d("method", K(), "?"));
        if (P()) {
            sb.append(C8168dfL.d("materialize", "true", "&"));
        }
        sb.append(Q);
        C8190dfh c8190dfh = (C8190dfh) this.e.d(this.f13432o);
        for (String str2 : c8190dfh.keySet()) {
            for (String str3 : c8190dfh.c(str2)) {
                sb.append(C8168dfL.d(str2, str3, "&"));
            }
        }
        String J2 = J();
        if (C8168dfL.h(J2)) {
            sb.append(J2);
        }
        a(sb);
        String sb2 = sb.toString();
        C1044Mm.d("AUIFalkorVolleyWebClientRequest", "VolleyWebClientRequest URL = %s", sb2);
        return sb2;
    }

    @Override // o.AbstractC5042brL
    public String J() {
        return new StringBuilder().toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public StringBuilder a(StringBuilder sb) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    public String Q() {
        List<String> L = L();
        if (L == null) {
            throw new IllegalArgumentException("List of queries is null!");
        }
        StringBuilder sb = new StringBuilder();
        for (String str : L) {
            sb.append(e(R(), str));
        }
        return sb.toString();
    }

    @Override // o.AbstractC5042brL, com.netflix.android.volley.Request
    public C9864xy<T> b(C9858xs c9858xs) {
        Map<String, String> map;
        String str;
        String str2;
        if (c9858xs != null && (map = c9858xs.d) != null) {
            String str3 = map.get("X-Netflix.api-script-execution-time");
            String str4 = c9858xs.d.get("X-Netflix.execution-time");
            this.f = c9858xs.d.get("X-Netflix.api-script-revision");
            AuthCookieHolder c = C8284dhV.c("TEMP_PROFILE_ID", c9858xs.d.get("Set-Cookie"));
            if (c != null && (str = c.netflixId) != null && (str2 = c.secureNetflixId) != null) {
                this.i.e(new UserCookies(str, str2));
            }
            if (C8168dfL.h(str4)) {
                try {
                    this.k = Long.parseLong(str4);
                } catch (Throwable th) {
                    C1044Mm.e("AUIFalkorVolleyWebClientRequest", "Failed to parse server execution time!", th);
                }
            }
            if (C8168dfL.h(str3)) {
                try {
                    this.j = Long.parseLong(str3);
                } catch (Throwable th2) {
                    C1044Mm.e("AUIFalkorVolleyWebClientRequest", "Failed to parse api script execution time!", th2);
                }
            }
            this.a = c9858xs.e;
        } else {
            C1044Mm.j("AUIFalkorVolleyWebClientRequest", "execTime not found!");
        }
        return super.b(c9858xs);
    }

    @Override // o.AbstractC5042brL
    public T a_(String str, String str2) {
        this.h = SystemClock.elapsedRealtime();
        try {
            T j = j(str);
            this.h = SystemClock.elapsedRealtime() - this.h;
            if (S() || j != null) {
                return j;
            }
            throw new FalkorException("Parsing returned null.");
        } catch (Exception e) {
            if ((e instanceof FalkorException) || (e instanceof StatusCodeError)) {
                throw ((VolleyError) e);
            }
            throw new VolleyError(e);
        }
    }

    @Override // o.AbstractC5042brL, com.netflix.android.volley.Request
    public void b(T t) {
        super.b((aMK<T>) t);
        aa();
        Context context = this.g;
        if (context != null) {
            C4221baS.a(context);
        }
    }

    @Override // o.AbstractC5042brL, com.netflix.android.volley.Request
    public void a_(VolleyError volleyError) {
        long aa = aa();
        C1044Mm.a("AUIFalkorVolleyWebClientRequest", "request duration time (ms): %d, class: %s, error: %s", Long.valueOf(aa), getClass().getSimpleName(), volleyError);
        NetflixStatus a = C8237dgb.a(volleyError, StatusCode.NET_GENERAL_NETWORK_ERROR);
        if (this.g != null && C8107deD.b(a.c())) {
            C8107deD.e(this.g, a.c());
        }
        d((Status) a);
    }

    protected String R() {
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
        j.put("X-Netflix.request.uuid", "" + this.n);
        aMP.d.b(this.g, j);
        aOV aov = this.i;
        return (aov == null || aov.w() == null || this.i.w().k() == null) ? j : aJM.e(j, this.i.w().k(), C8055ddE.e(AbstractApplicationC1040Mh.d()));
    }

    @Override // com.netflix.android.volley.Request
    public VolleyError e(VolleyError volleyError) {
        StatusCode d = C8237dgb.d(volleyError);
        if (d != null) {
            return new StatusCodeError(d, volleyError.getCause());
        }
        return B() ? C8237dgb.b(volleyError) : volleyError;
    }
}
