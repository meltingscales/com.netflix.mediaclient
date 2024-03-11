package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.DebugEvent;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aZk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2088aZk implements InterfaceC2087aZj, InterfaceC2089aZl {
    private final aOV e;

    public C2088aZk(aOV aov) {
        this.e = aov;
    }

    private String a(List<String> list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // o.InterfaceC2087aZj
    public void e(Map<String, List<String>> map) {
        b(map, false);
    }

    private void b(Map<String, List<String>> map, boolean z) {
        if (map == null) {
            C1044Mm.j("nf_http_headers_response", "processResponseHeaders:: response headers are missing!");
            return;
        }
        C1044Mm.a("nf_http_headers_response", "processResponseHeaders::  headers found: %d", Integer.valueOf(map.size()));
        for (String str : map.keySet()) {
            String a = a(map.get(str));
            C1044Mm.a("nf_http_headers_response", "processResponseHeaders:: Header %s = %s", str, a);
            if ("x-netflix-deviceidtoken".equalsIgnoreCase(str) && a != null) {
                C1044Mm.a("nf_http_headers_response", "processResponseHeaders:: got deviceIdToken %s = %s", str, a);
                this.e.d(a);
                if (z) {
                    b();
                }
            }
            if ("x-netflix-ssotoken".equalsIgnoreCase(str) && a != null) {
                C1044Mm.a("nf_http_headers_response", "processResponseHeaders:: got ssoToken %s = %s", str, a);
                this.e.e(a);
            }
        }
    }

    private void b() {
        C1044Mm.a("nf_http_headers_response", "logDeviceIdViaHandshake::");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceIdViaHandshake", "true");
            Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
        } catch (JSONException unused) {
        }
    }

    @Override // o.InterfaceC2089aZl
    public void a(InterfaceC8413dkr interfaceC8413dkr, InputStream inputStream) {
        if (interfaceC8413dkr == null || inputStream == null) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(interfaceC8413dkr != null);
            objArr[1] = Boolean.valueOf(inputStream != null);
            C1044Mm.e("nf_http_headers_response", "inspectHandshakeMessage:: hasUrl=%b has inputStream=%b", objArr);
        } else if (!(interfaceC8413dkr instanceof C2082aZe)) {
            C1044Mm.d("nf_http_headers_response", "inspectHandshakeMessage:: url is not of type MslUrlHttpURLConnectionImpl");
        } else {
            int hashCode = inputStream.hashCode();
            C1044Mm.a("nf_http_headers_response", "inspectHandshakeMessage:: source hashcode: %d", Integer.valueOf(hashCode));
            b(((C2082aZe) interfaceC8413dkr).d(hashCode), true);
        }
    }
}
