package o;

import com.netflix.mediaclient.repository.SecureStoreProvider;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MSLTransport;
import o.InterfaceC5129bst;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aQl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1847aQl implements InterfaceC5129bst.d {
    private long a;
    private boolean b;
    private String c;
    private long d;

    public String d() {
        return this.c;
    }

    public C1847aQl(String str) {
        b(str);
    }

    public boolean c(Long l) {
        if (l == null) {
            C1044Mm.d("PROXY-ESN", "Current MT serial number is null. It should not happen!");
            return true;
        } else if (this.d != l.longValue()) {
            C1044Mm.e("PROXY-ESN", "Current MT serial number is different than one used to get proxy ESN. Get it again.");
            return true;
        } else {
            C1044Mm.a("PROXY-ESN", "Same MT as before, should we refresh proxy ESN: %b", Boolean.valueOf(this.b));
            return this.b;
        }
    }

    private void b(String str) {
        String e = C8157dfA.e(AbstractApplicationC1040Mh.d(), "nf_drm_proxy_esn", (String) null);
        if (C8168dfL.g(e)) {
            c(str);
        } else {
            d(e, str);
        }
    }

    private void d(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.c = jSONObject.getString("esn");
            this.a = jSONObject.getLong("ts");
            this.d = jSONObject.getLong("sn");
        } catch (JSONException e) {
            C1044Mm.b("PROXY-ESN", e, "Not able to load proxy esn", new Object[0]);
            this.b = true;
            e(str2);
        }
        C1044Mm.a("PROXY-ESN", "Proxy ESN found: %s", toString());
        long proxyEsnRefreshTimeInMs = Config_FastProperty_MSLTransport.getProxyEsnRefreshTimeInMs();
        if (proxyEsnRefreshTimeInMs < 1) {
            C1044Mm.j("PROXY-ESN", "Proxy ESN does not need to be refreshed");
            this.b = false;
            return;
        }
        boolean d = C8175dfS.d(Config_FastProperty_MSLTransport.getProxyEsnRefreshTimeInMs(), this.a);
        C1044Mm.a("PROXY-ESN", "Proxy ESN needs to be refreshed every %d, last know was created %s ago, should refresh %b", Long.valueOf(proxyEsnRefreshTimeInMs), Boolean.valueOf(d));
        this.b = d;
    }

    private void c(String str) {
        C1044Mm.j("PROXY-ESN", "No previous proxy ESN, we need to get it.");
        this.b = true;
        String e = C8157dfA.e(AbstractApplicationC1040Mh.d(), "nf_drm_esn", (String) null);
        if (C8168dfL.g(e)) {
            e(str);
        } else {
            this.c = e;
        }
    }

    private void e(String str) {
        this.c = str + AbstractC1838aQc.d + C1844aQi.k;
    }

    @Override // o.InterfaceC5129bst.d
    public void a(String str, Long l) {
        synchronized (this) {
            if (C8168dfL.g(str)) {
                C1044Mm.d("PROXY-ESN", "Failed to get proxy ESN!");
                this.c = "";
            } else {
                C1044Mm.a("PROXY-ESN", "Proxy ESN: %s", str);
                this.c = str;
                C8157dfA.a(AbstractApplicationC1040Mh.d(), "nf_drm_esn", str);
                this.a = System.currentTimeMillis();
                if (l != null) {
                    this.d = l.longValue();
                } else {
                    C1044Mm.d("PROXY-ESN", "Master token serial number was null! This should never happen!");
                    this.d = 0L;
                }
                e();
                aLR d = SecureStoreProvider.INSTANCE.d();
                if (d instanceof aLH) {
                    ((aLH) d).d();
                }
            }
        }
    }

    private void e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("esn", this.c);
            jSONObject.put("ts", this.a);
            jSONObject.put("sn", this.d);
            C8157dfA.a(AbstractApplicationC1040Mh.d(), "nf_drm_proxy_esn", jSONObject.toString());
        } catch (JSONException e) {
            C1044Mm.b("PROXY-ESN", e, "This should not happen!", new Object[0]);
        }
    }

    public String toString() {
        return "ProxyEsn{esn='" + this.c + "', createdInMs=" + this.a + ", masterTokenSerialNumber=" + this.d + '}';
    }
}
