package o;

import android.net.Uri;
import com.netflix.android.org.json.JSONObject;
import com.netflix.msl.client.params.MslBootKey;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aYX {
    public static final aYX d = new aYX();

    private aYX() {
    }

    private static final URL a(URL url, Map<String, String> map) {
        if (map.isEmpty()) {
            return url;
        }
        Uri.Builder buildUpon = Uri.parse(url.toString()).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return new URL(buildUpon.build().toString());
    }

    private static final URL b(URL url, int i) {
        Map b;
        if (i != 0) {
            C1044Mm.e("nf_msl_client_appboot", "Created appBoot with key version " + i);
            b = dqD.b(dpD.a("keyVersion", String.valueOf(i)));
            try {
                return a(url, b);
            } catch (MalformedURLException e) {
                throw new IllegalStateException("Unable to create URL", e);
            }
        }
        return url;
    }

    public static final URL b(aOV aov, MslBootKey mslBootKey) {
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) mslBootKey, "");
        String k = aov.w().k();
        C8632dsu.a(k, "");
        C1044Mm.a("nf_msl_client_appboot", "Create appBoot URL for esn prefix %s", k);
        URL c = aov.j().c(k);
        C8632dsu.a(c, "");
        URL b = b(c, mslBootKey.c());
        C1044Mm.a("nf_msl_client_appboot", "Created appBoot URL %s", b);
        return b;
    }

    public static final MslBootKey d(aYZ ayz) {
        C8632dsu.c((Object) ayz, "");
        aOV aov = ayz.b;
        C8632dsu.a(aov, "");
        boolean f = ayz.e.f();
        boolean aF = aov.aF();
        if (aF && (!f || !aYW.a())) {
            C1044Mm.e("nf_msl_client_appboot", "Use ECC appboot key: config forced " + aF + ", ECC fail " + f);
            MslBootKey e = C2079aZb.e();
            C8632dsu.d(e);
            return e;
        }
        C1044Mm.e("nf_msl_client_appboot", "Use RSA appboot key: config forced " + aF + ", ECC fail " + f);
        MslBootKey c = C2079aZb.c();
        C8632dsu.d(c);
        return c;
    }

    public static final URL b(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        try {
            return new URL(str + "/appboot/" + str2);
        } catch (MalformedURLException e) {
            throw new IllegalStateException("Unable to create URL", e);
        }
    }

    public static final JSONObject d(Long l, String str, byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (l != null) {
            jSONObject2.put("hash", l.longValue());
        }
        jSONObject.put("msltruststore", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        if (str != null) {
            jSONObject3.put("hash", str);
        }
        jSONObject.put("ssltruststore", jSONObject3);
        jSONObject.put("retrystrategy", 1);
        if (bArr != null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("challenge", C8427dle.e(bArr));
            jSONObject.put("provision", jSONObject4);
        }
        return jSONObject;
    }

    public static final JSONObject e(Long l, String str) {
        return d(l, str, null);
    }

    public static final void a(int i) {
        if (i > 0) {
            C1044Mm.a("nf_msl_client_appboot", "waitIfNeeded:: wait on %d", Integer.valueOf(i + 1));
            e();
        }
        C1044Mm.a("nf_msl_client_appboot", "Trying appboot workflow, attempt number: %d", Integer.valueOf(i + 1));
    }

    private static final void e() {
        int d2 = aYW.d();
        if (d2 <= 0) {
            return;
        }
        C8166dfJ.b(null, false, 3, null);
        try {
            Thread.sleep(d2);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
