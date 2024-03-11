package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.player.drm.LicenseRequestFlavor;
import com.netflix.mediaclient.service.user.UserAgent;
import java.util.Arrays;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.bdi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4396bdi {
    long a;
    String b;
    UserAgent c;
    LicenseRequestFlavor d;
    String e;
    String j;

    C4396bdi a(String str) {
        this.e = str;
        return this;
    }

    C4396bdi b(String str) {
        this.j = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4396bdi c(LicenseRequestFlavor licenseRequestFlavor) {
        this.d = licenseRequestFlavor;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4396bdi d(long j) {
        this.a = j;
        return this;
    }

    C4396bdi e(String str) {
        this.b = str;
        return this;
    }

    public C4396bdi(UserAgent userAgent) {
        this.c = userAgent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", 2);
            jSONObject.put(SignupConstants.Field.URL, this.e);
            JSONObject jSONObject2 = new JSONObject();
            long j = this.a;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            jSONObject2.putOpt("clientTime", Long.valueOf(j));
            jSONObject2.put("challengeBase64", this.b);
            if (LicenseRequestFlavor.STANDARD == this.d) {
                jSONObject2.put("xid", this.j);
            }
            jSONObject.put("params", jSONObject2);
            if (this.c.v()) {
                jSONObject.put("languages", new JSONArray((Collection) Arrays.asList(this.c.j().getLanguages())));
            } else {
                jSONObject.put("languages", new JSONArray((Collection) Arrays.asList(this.c.d())));
            }
            C1044Mm.a("nf_msl_volley_FetchLicenseRequest", "licenseRequestParams, %s", jSONObject);
        } catch (Exception e) {
            C1044Mm.b("nf_msl_volley_FetchLicenseRequest", e, "error creating manifest params", new Object[0]);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4396bdi b(InterfaceC4416beB interfaceC4416beB) {
        return a(interfaceC4416beB.j()).e(interfaceC4416beB.a()).b(interfaceC4416beB.n());
    }
}
