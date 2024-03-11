package o;

import android.net.Uri;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.net.InetAddress;
import org.json.JSONException;

/* loaded from: classes3.dex */
class aZX extends aUI {
    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        return "ftlProbeError";
    }

    public aZX(aHI ahi) {
        int c = ahi.c();
        try {
            this.i.put(SignupConstants.Field.URL, ahi.n());
            this.i.put("d", ahi.g());
            this.i.put("tcp", ahi.j());
            this.i.put("dns", ahi.b());
            this.i.put("tls", ahi.f());
            this.i.put("ttfb", ahi.h());
            this.i.put("pf_code", c);
            this.i.put("err", ahi.a());
            this.i.put("via", ahi.o());
            this.i.put("sc", C5044brN.c(ahi.c()));
            if (ahi.n() != null) {
                try {
                    this.i.put("ip", InetAddress.getByName(Uri.parse(ahi.n()).getHost()).getHostAddress());
                } catch (Exception unused) {
                }
            }
        } catch (JSONException unused2) {
            C1044Mm.d("nf_probe", "unable to create probe error logblob");
        }
    }
}
