package o;

import com.netflix.android.volley.Request;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.webclient.ftl.FtlSession;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.json.JSONException;

/* renamed from: o.brz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5082brz extends aUI {
    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        return "ftlerror";
    }

    public C5082brz(FtlSession ftlSession, Request request, C5032brB c5032brB, boolean z, boolean z2) {
        NetworkRequestType networkRequestType;
        d();
        InterfaceC9818xE f = request.f();
        if (request.y() instanceof NetworkRequestType) {
            networkRequestType = (NetworkRequestType) request.y();
        } else {
            networkRequestType = request.y() instanceof Object ? NetworkRequestType.API : null;
        }
        try {
            this.i.put("hostname", f.host());
            this.i.put("proto", "https");
            this.i.put("error_code", c5032brB.a);
            this.i.put("err", c5032brB.b);
            this.i.put("fallback", z);
            this.i.put("pf_err", c5032brB.d);
            this.i.put("comp", "unified");
            this.i.put("via", c5032brB.c);
            this.i.put("duration", request.h());
            this.i.put("tag", networkRequestType);
            this.i.put("error_count", ftlSession.a());
            this.i.put("request_count", ftlSession.e());
            this.i.put("time_since_start", ftlSession.h());
            this.i.put("consecutive_error_count", ftlSession.d());
            this.i.put("foreground", ftlSession.j());
            this.i.put("online", ftlSession.i());
            this.i.put("target", f.name());
            this.i.put("throttled", z2);
            try {
                this.i.put("server_ip", InetAddress.getByName(f.host()).getHostAddress());
            } catch (SecurityException | UnknownHostException unused) {
            }
            e(ftlSession);
        } catch (JSONException unused2) {
            C1044Mm.d("nf_ftl", "unable to create ftlerror logblob");
        }
    }
}
