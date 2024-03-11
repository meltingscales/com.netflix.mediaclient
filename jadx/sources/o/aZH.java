package o;

import android.os.SystemClock;
import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.webclient.volley.ParseException;
import com.netflix.msl.MslErrorException;
import com.netflix.msl.MslException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Objects;
import o.InterfaceC5129bst;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class aZH extends AbstractC2102aZy<JSONObject> {
    @Override // o.AbstractC2102aZy
    protected String P() {
        return "router";
    }

    @Override // o.aZE
    protected boolean e(Exception exc) {
        return false;
    }

    public aZH(int i) {
        super(i);
    }

    @Override // o.aZE
    protected void L() {
        k(((aZE) this).i.j().a((String) null).toExternalForm());
    }

    @Override // com.netflix.android.volley.Request
    public Object y() {
        return NetworkRequestType.API;
    }

    protected JSONObject c(C8380djl c8380djl) {
        JSONObject jSONObject;
        ((aZE) this).f13461o = SystemClock.elapsedRealtime();
        try {
            j(c8380djl);
            jSONObject = d(c8380djl);
        } catch (Exception e) {
            a(e);
            jSONObject = null;
        }
        aj();
        ((aZE) this).f13461o = SystemClock.elapsedRealtime() - ((aZE) this).f13461o;
        if (!Q() && jSONObject == null) {
            throw new FalkorException("Parsing returned null at PCNMSVR. Response: " + c8380djl.c());
        }
        Objects.requireNonNull(jSONObject);
        return jSONObject;
    }

    protected JSONObject d(C8380djl c8380djl) {
        String c2 = c8380djl.c();
        C1044Mm.e("nf_pbo_msl", "parseApiResponse: " + c2);
        return a(c2);
    }

    protected JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            C1044Mm.e("nf_pbo_msl", "error parsing json", e);
            return null;
        }
    }

    @Override // o.aZE
    public C8386djr d(Map<String, String> map) {
        try {
            return c(map);
        } catch (com.netflix.android.org.json.JSONException e) {
            C1044Mm.b("nf_pbo_msl", e, "API request failed with JSON exception", new Object[0]);
            throw new IOException(e);
        } catch (MslErrorException e2) {
            b(e2);
            throw new IOException(e2);
        } catch (MslException e3) {
            C1044Mm.b("nf_pbo_msl", e3, "API request failed with MSL exception", new Object[0]);
            Throwable c2 = c(e3);
            if (c2 instanceof IOException) {
                throw ((IOException) c2);
            }
            throw new IOException(e3);
        }
    }

    private byte[] a(InterfaceC5129bst.b bVar) {
        if (C8168dfL.g(bVar.a)) {
            return bVar.c.getBytes(StandardCharsets.UTF_8);
        }
        return bVar.a.getBytes(StandardCharsets.UTF_8);
    }

    private C8386djr c(Map<String, String> map) {
        C1044Mm.a("nf_pbo_msl", "ExecuteWithoutEdgeEnvelope:: %s", getClass().getSimpleName());
        InterfaceC8387djs aa = aa();
        InterfaceC5129bst.b b = b(map);
        c U = U();
        if (C1865aRc.m() && (aa instanceof aYS)) {
            int c2 = C1865aRc.j().c() * ((t() == null ? 0 : t().b()) + 1);
            if (s() == Request.Priority.LOW) {
                c2 = 120000;
            }
            aYS ays = (aYS) aa;
            String u = u();
            byte[] a = a(b);
            Map<String, String> map2 = b.d;
            String str = U.c;
            AbstractC8424dlb abstractC8424dlb = U.d;
            return ays.d(u, a, map2, str, abstractC8424dlb, d(abstractC8424dlb), y(), p(), false, F_(), c2);
        }
        String u2 = u();
        byte[] a2 = a(b);
        Map<String, String> map3 = b.d;
        String str2 = U.c;
        AbstractC8424dlb abstractC8424dlb2 = U.d;
        return aa.d(u2, a2, map3, str2, abstractC8424dlb2, d(abstractC8424dlb2), y(), p(), false, F_());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class c {
        String c;
        AbstractC8424dlb d;

        public c(String str, AbstractC8424dlb abstractC8424dlb) {
            this.c = str;
            this.d = abstractC8424dlb;
        }
    }

    private c U() {
        String str;
        AbstractC8424dlb abstractC8424dlb;
        if (Z() != null) {
            str = Z().d();
            abstractC8424dlb = Z().c();
        } else {
            str = null;
            abstractC8424dlb = null;
        }
        return new c(str, abstractC8424dlb);
    }

    @Override // com.netflix.android.volley.Request
    public C9864xy<JSONObject> b(C9858xs c9858xs) {
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
                    C1044Mm.b("nf_pbo_msl", th, "Failed to parse server execution time!", new Object[0]);
                }
            }
            if (C8168dfL.h(str)) {
                try {
                    ((aZE) this).h = Long.parseLong(str);
                } catch (Throwable th2) {
                    C1044Mm.b("nf_pbo_msl", th2, "Failed to parse api script execution time!", new Object[0]);
                }
            }
        } else {
            C1044Mm.j("nf_pbo_msl", "execTime not found!");
        }
        if (c9858xs != null && (bArr = c9858xs.c) != null) {
            this.c = bArr.length;
        }
        try {
            Objects.requireNonNull(c9858xs);
            try {
                return C9864xy.c(c(d(c9858xs)), null);
            } catch (Exception e) {
                if (e instanceof VolleyError) {
                    return C9864xy.a((VolleyError) e);
                }
                return C9864xy.a(new VolleyError(e));
            }
        } catch (com.netflix.android.org.json.JSONException | UnsupportedEncodingException e2) {
            C1044Mm.b("nf_pbo_msl", e2, "Failed to unwrap response ", new Object[0]);
            return C9864xy.a(new ParseException(e2));
        }
    }

    protected C8380djl d(C9858xs c9858xs) {
        byte[] bArr = c9858xs.c;
        C1044Mm.e("nf_pbo_msl", "createApiHttpWrapper:: response is always without edge envelope...");
        return new C8380djl("noedge", c9858xs.d, c9858xs.e, bArr);
    }
}
