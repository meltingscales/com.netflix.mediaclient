package o;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.volley.ParseException;
import com.netflix.mediaclient.service.webclient.volley.ParsingException;
import com.netflix.msl.MslErrorException;
import com.netflix.msl.MslException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC5129bst;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class aZC<T> extends aZE<T> {
    protected abstract String M();

    @Override // o.aZE
    protected boolean e(Exception exc) {
        return false;
    }

    protected abstract T j(String str);

    @Override // o.aZE
    public String x_() {
        return null;
    }

    public aZC() {
        super(1);
    }

    @Override // o.aZE
    @SuppressLint({"NewApi"})
    public C8386djr d(Map<String, String> map) {
        try {
            return a(map);
        } catch (MslErrorException e) {
            b(e);
            throw new IOException(e);
        } catch (MslException e2) {
            C1044Mm.b("nf_GraphQLMSLVolleyRequest", e2, "API request failed with MSL exception", new Object[0]);
            Throwable c = c(e2);
            if (c instanceof IOException) {
                throw ((IOException) c);
            }
            throw new IOException(e2);
        }
    }

    private C8386djr a(Map<String, String> map) {
        C1044Mm.a("nf_GraphQLMSLVolleyRequest", "ExecuteWithoutEdgeEnvelope:: %s", getClass().getSimpleName());
        InterfaceC8387djs aa = aa();
        InterfaceC5129bst.b b = b(map);
        aZB X = X();
        String u = u();
        byte[] d = d(b);
        Map<String, String> map2 = b.d;
        String str = X.d;
        AbstractC8424dlb abstractC8424dlb = X.b;
        return aa.d(u, d, map2, str, abstractC8424dlb, d(abstractC8424dlb), y(), p(), false, F_());
    }

    private byte[] d(InterfaceC5129bst.b bVar) {
        if (C8168dfL.g(bVar.a)) {
            return bVar.c.getBytes(StandardCharsets.UTF_8);
        }
        return bVar.a.getBytes(StandardCharsets.UTF_8);
    }

    protected aZB X() {
        String str;
        AbstractC8424dlb abstractC8424dlb;
        if (Z() != null) {
            str = Z().d();
            abstractC8424dlb = Z().c();
        } else {
            str = null;
            abstractC8424dlb = null;
        }
        return new aZB(str, abstractC8424dlb);
    }

    @Override // com.netflix.android.volley.Request
    public C9864xy<T> b(C9858xs c9858xs) {
        byte[] bArr;
        Map<String, String> map;
        if (c9858xs != null && (map = c9858xs.d) != null) {
            String str = map.get("X-Netflix.api-script-execution-time");
            String str2 = c9858xs.d.get("X-Netflix.execution-time");
            ((aZE) this).n = c9858xs.d.get("X-Netflix.api-script-revision");
            if (C8168dfL.h(str2)) {
                try {
                    ((aZE) this).r = Long.parseLong(str2);
                } catch (Throwable th) {
                    C1044Mm.b("nf_GraphQLMSLVolleyRequest", th, "Failed to parse server execution time!", new Object[0]);
                }
            }
            if (C8168dfL.h(str)) {
                try {
                    ((aZE) this).h = Long.parseLong(str);
                } catch (Throwable th2) {
                    C1044Mm.b("nf_GraphQLMSLVolleyRequest", th2, "Failed to parse api script execution time!", new Object[0]);
                }
            }
        } else {
            C1044Mm.j("nf_GraphQLMSLVolleyRequest", "execTime not found!");
        }
        if (c9858xs != null && (bArr = c9858xs.c) != null) {
            this.c = bArr.length;
        }
        if (c9858xs == null) {
            return C9864xy.a(new ParseException("Response is null!"));
        }
        try {
            C8380djl e = e(c9858xs);
            try {
                T c = c(e);
                if (e.b() != null) {
                    Map<String, String> a = C8284dhV.a(e.b());
                    boolean a2 = C1815aPg.d(AbstractApplicationC1040Mh.d()).a();
                    String str3 = a.get(C8284dhV.c(a2));
                    String str4 = a.get(C8284dhV.b(a2));
                    if (C8168dfL.h(str3) && C8168dfL.h(str4)) {
                        C8284dhV.a(str3, str4, a2);
                    }
                }
                if (!Q() && c == null) {
                    return C9864xy.a(new ParseException("Parsing returned null."));
                }
                return C9864xy.c(c, null);
            } catch (Exception e2) {
                if (e2 instanceof VolleyError) {
                    return C9864xy.a((VolleyError) e2);
                }
                return C9864xy.a(new VolleyError(e2));
            }
        } catch (Throwable th3) {
            C1044Mm.b("nf_GraphQLMSLVolleyRequest", th3, "Failed to unwrap response ", new Object[0]);
            return C9864xy.a(new ParseException(th3));
        }
    }

    protected C8380djl e(C9858xs c9858xs) {
        byte[] bArr = c9858xs.c;
        C1044Mm.e("nf_GraphQLMSLVolleyRequest", "createApiHttpWrapper:: WITHOUT using edge envelope...");
        return new C8380djl("noedge", c9858xs.d, c9858xs.e, bArr);
    }

    public T c(C8380djl c8380djl) {
        T t;
        ((aZE) this).f13461o = SystemClock.elapsedRealtime();
        try {
            j(c8380djl);
            t = b(c8380djl);
        } catch (Exception e) {
            a(e);
            t = null;
        }
        ((aZE) this).f13461o = SystemClock.elapsedRealtime() - ((aZE) this).f13461o;
        if (Q() || t != null) {
            return t;
        }
        throw new ParsingException("Parsing returned null at GQMVR. Response: " + c8380djl.c());
    }

    protected T b(C8380djl c8380djl) {
        return j(c8380djl.c());
    }

    @Override // o.aZE
    public String w_() {
        String M = M();
        C1044Mm.a("nf_GraphQLMSLVolleyRequest", "GraphQL query to send: %s", M);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("query", M);
        } catch (JSONException e) {
            C1044Mm.b("nf_GraphQLMSLVolleyRequest", e, "Failed to create GraphQL query", new Object[0]);
        }
        return jSONObject.toString();
    }

    @Override // o.aZE
    protected void L() {
        k(((aZE) this).i.j().e().toExternalForm());
    }

    @Override // o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> j = super.j();
        if (j == null) {
            j = new HashMap<>();
        }
        e(j);
        j.put("Content-Type", "application/json");
        UserAgent userAgent = ((aZE) this).p;
        j.putAll(aJL.e(C8055ddE.e(AbstractApplicationC1040Mh.d()), (userAgent == null || aZD.d(userAgent.d())) ? null : aMH.c().c(((aZE) this).p)));
        return j;
    }

    @Override // com.netflix.android.volley.Request
    public Object y() {
        return NetworkRequestType.BROWSE;
    }
}
