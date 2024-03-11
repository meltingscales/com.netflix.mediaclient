package o;

import android.os.SystemClock;
import com.netflix.android.org.json.JSONException;
import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import com.netflix.cl.model.SignOutReason;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import com.netflix.mediaclient.service.webclient.volley.ParseException;
import com.netflix.model.leafs.originals.interactive.animations.Ease;
import com.netflix.msl.MslErrorException;
import com.netflix.msl.MslException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import o.InterfaceC5129bst;

/* renamed from: o.aZw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2100aZw<T> extends aZE<T> {
    protected ApiEndpointRegistry.ResponsePathFormat f;

    protected abstract List<String> J();

    public String K() {
        return null;
    }

    protected String M() {
        return "get";
    }

    protected boolean S_() {
        return false;
    }

    protected abstract T a(String str);

    public AbstractC2100aZw() {
        super(0);
        this.f = ApiEndpointRegistry.ResponsePathFormat.HIERARCHICAL;
    }

    public AbstractC2100aZw(ApiEndpointRegistry.ResponsePathFormat responsePathFormat) {
        super(0);
        this.f = responsePathFormat;
    }

    @Override // o.aZE, com.netflix.android.volley.Request
    public Map<String, String> o() {
        Map<String, String> o2 = super.o();
        o2.put("method", M());
        if (S_()) {
            o2.put("materialize", "true");
        }
        List<String> J2 = J();
        if (J2 == null) {
            throw new IllegalArgumentException("List of queries is null!");
        }
        for (String str : J2) {
            o2.put(R_(), str);
        }
        return o2;
    }

    protected String R_() {
        return "get".equals(M()) ? Ease.ANIMATION_EASE_TYPE.PATH : "callPath";
    }

    @Override // o.aZE
    public C8386djr d(Map<String, String> map) {
        ac();
        try {
            return c(map);
        } catch (JSONException e) {
            C1044Mm.b("FalkorMSLVolleyRequest", e, "API request failed with JSON exception", new Object[0]);
            throw new IOException(e);
        } catch (MslErrorException e2) {
            b(e2);
            throw new IOException(e2);
        } catch (MslException e3) {
            C1044Mm.b("FalkorMSLVolleyRequest", e3, "API request failed with MSL exception", new Object[0]);
            Throwable c2 = c(e3);
            if (c2 instanceof IOException) {
                throw ((IOException) c2);
            }
            throw new IOException(e3);
        }
    }

    private byte[] d(InterfaceC5129bst.b bVar) {
        if (C8168dfL.g(bVar.a)) {
            return bVar.c.getBytes("UTF-8");
        }
        return bVar.a.getBytes("UTF-8");
    }

    private C8386djr c(Map<String, String> map) {
        C1044Mm.a("FalkorMSLVolleyRequest", "ExecuteWithoutEdgeEnvelope:: %s", getClass().getSimpleName());
        InterfaceC8387djs aa = aa();
        InterfaceC5129bst.b b = b(map);
        c T = T();
        if (C1865aRc.m() && (aa instanceof aYS)) {
            int c2 = C1865aRc.j().c() * ((t() == null ? 0 : t().b()) + 1);
            if (s() == Request.Priority.LOW) {
                c2 = 120000;
            }
            aYS ays = (aYS) aa;
            String u = u();
            byte[] d = d(b);
            Map<String, String> map2 = b.d;
            String str = T.e;
            AbstractC8424dlb abstractC8424dlb = T.c;
            return ays.d(u, d, map2, str, abstractC8424dlb, d(abstractC8424dlb), y(), p(), false, F_(), c2);
        }
        String u2 = u();
        byte[] d2 = d(b);
        Map<String, String> map3 = b.d;
        String str2 = T.e;
        AbstractC8424dlb abstractC8424dlb2 = T.c;
        return aa.d(u2, d2, map3, str2, abstractC8424dlb2, d(abstractC8424dlb2), y(), p(), false, F_());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aZw$c */
    /* loaded from: classes3.dex */
    public static class c {
        AbstractC8424dlb c;
        String e;

        public c(String str, AbstractC8424dlb abstractC8424dlb) {
            this.e = str;
            this.c = abstractC8424dlb;
        }
    }

    private c T() {
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
                    C1044Mm.b("FalkorMSLVolleyRequest", th, "Failed to parse server execution time!", new Object[0]);
                }
            }
            if (C8168dfL.h(str)) {
                try {
                    ((aZE) this).h = Long.parseLong(str);
                } catch (Throwable th2) {
                    C1044Mm.b("FalkorMSLVolleyRequest", th2, "Failed to parse api script execution time!", new Object[0]);
                }
            }
        } else {
            C1044Mm.j("FalkorMSLVolleyRequest", "execTime not found!");
        }
        if (c9858xs != null && (bArr = c9858xs.c) != null) {
            this.c = bArr.length;
        }
        try {
            C8380djl a = a(c9858xs);
            try {
                T e = e(a);
                if (a.b() != null) {
                    Map<String, String> a2 = C8284dhV.a(a.b());
                    boolean a3 = C1815aPg.d(AbstractApplicationC1040Mh.d()).a();
                    String str3 = a2.get(C8284dhV.c(a3));
                    String str4 = a2.get(C8284dhV.b(a3));
                    if (C8168dfL.h(str3) && C8168dfL.h(str4)) {
                        C8284dhV.a(str3, str4, a3);
                    }
                }
                if (!Q() && e == null) {
                    return C9864xy.a(new ParseException("Parsing returned null."));
                }
                return C9864xy.c(e, null);
            } catch (Exception e2) {
                if (e2 instanceof VolleyError) {
                    return C9864xy.a((VolleyError) e2);
                }
                return C9864xy.a(new VolleyError(e2));
            }
        } catch (JSONException | UnsupportedEncodingException e3) {
            C1044Mm.b("FalkorMSLVolleyRequest", e3, "Failed to unwrap response ", new Object[0]);
            return C9864xy.a(new ParseException(e3));
        }
    }

    protected C8380djl a(C9858xs c9858xs) {
        byte[] bArr = c9858xs.c;
        C1044Mm.e("FalkorMSLVolleyRequest", "createApiHttpWrapper:: WITHOUT using edge envelope...");
        return new C8380djl("noedge", c9858xs.d, c9858xs.e, c9858xs.c);
    }

    protected T e(C8380djl c8380djl) {
        T t;
        ((aZE) this).f13461o = SystemClock.elapsedRealtime();
        try {
            j(c8380djl);
            t = d(c8380djl);
        } catch (Exception e) {
            a(e);
            t = null;
        }
        aj();
        ((aZE) this).f13461o = SystemClock.elapsedRealtime() - ((aZE) this).f13461o;
        if (Q() || t != null) {
            return t;
        }
        throw new FalkorException("Parsing returned null at FMSVR. Response: " + c8380djl.c());
    }

    @Override // o.aZE
    protected boolean e(Exception exc) {
        if (!(exc instanceof FalkorException)) {
            C1044Mm.e("FalkorMSLVolleyRequest", "handleNotAuthorized:: regular API failure");
            return false;
        }
        FalkorException falkorException = (FalkorException) exc;
        NetflixStatus a = C8237dgb.a(falkorException, StatusCode.INT_ERR_FALKOR_EXCEPTION);
        if (a != null && a.c() == StatusCode.USER_NOT_AUTHORIZED) {
            if (((aZE) this).t >= 2) {
                C1044Mm.e("FalkorMSLVolleyRequest", "handleNotAuthorized:: regular API failure");
                this.w = false;
                return true;
            } else if (aZE.j.get()) {
                C1044Mm.j("FalkorMSLVolleyRequest", "User relogin attempt is in process, just retry later...");
                ((aZE) this).t++;
                this.w = true;
                return true;
            } else {
                C1044Mm.j("FalkorMSLVolleyRequest", "handleNotAuthorized:: User is not authorized, see if we can relogin...");
                if (af()) {
                    C1044Mm.j("FalkorMSLVolleyRequest", "handleNotAuthorized:: Trying to relogin using old master token and user id token...");
                    this.w = true;
                    return true;
                } else if (ah()) {
                    C1044Mm.j("FalkorMSLVolleyRequest", "handleNotAuthorized:: Trying to relogin using cookies....");
                    this.w = true;
                    return true;
                } else if (((aZE) this).p.v() && !((aZE) this).k) {
                    InterfaceC1598aHf.a(new C1596aHd("MSL logout:: volley").b(false).b(ErrorType.p).e("message", falkorException.getMessage()).e("pql", (String) J().stream().collect(Collectors.joining())));
                    C1044Mm.e("FalkorMSLVolleyRequest", "handleNotAuthorized:: User is currently logged in, logged him out...");
                    ((aZE) this).p.e(SignOutReason.reauth, false);
                } else {
                    C1044Mm.e("FalkorMSLVolleyRequest", "handleNotAuthorized:: User is NOT currently logged in, pass this failure regular way...");
                }
            }
        }
        C1044Mm.e("FalkorMSLVolleyRequest", "handleNotAuthorized:: regular API failure");
        this.w = false;
        return true;
    }

    public T d(C8380djl c8380djl) {
        return a(c8380djl.c());
    }

    public static boolean j(String str) {
        if (C8168dfL.h(str)) {
            return FalkorException.c(str.toLowerCase());
        }
        return false;
    }
}
