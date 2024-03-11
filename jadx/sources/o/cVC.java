package o;

import android.content.Context;
import android.net.Uri;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import java.net.URLEncoder;

/* loaded from: classes4.dex */
public final class cVC {
    private String a;
    private String b;
    private String c;
    private String d;
    private ServiceManager e;

    public void b(String str) {
        this.d = str;
    }

    public String c() {
        return this.a;
    }

    public cVC(ServiceManager serviceManager, String str, String str2, String str3) {
        if (serviceManager == null) {
            throw new IllegalArgumentException("Service Manager can not be null!");
        }
        this.e = serviceManager;
        this.c = str2;
        this.b = str3;
        a(str);
    }

    public void a(String str) {
        StringBuilder sb = new StringBuilder();
        if (Uri.parse(str).getQuery() != null) {
            sb.append(str);
            sb.append('&');
        } else {
            sb.append(str);
            sb.append("?");
        }
        sb.append("esn");
        sb.append('=');
        sb.append(c(this.e.k().m()));
        sb.append('&');
        sb.append("sw_version");
        sb.append('=');
        sb.append(c(this.e.v()));
        sb.append('&');
        sb.append("os");
        sb.append('=');
        sb.append(String.valueOf(C8054ddD.c()));
        sb.append('&');
        sb.append("device_cat");
        sb.append('=');
        sb.append(c(this.e.i().c()));
        sb.append('&');
        sb.append("locale");
        sb.append('=');
        sb.append(c(this.c));
        sb.append('&');
        sb.append("inapp");
        sb.append("=true&");
        boolean at = this.e.g().at();
        sb.append("isNetflixPreloaded");
        sb.append('=');
        sb.append(at ? "true" : "false");
        sb.append('&');
        String b = C1814aPf.b(this.e.f());
        sb.append("landingOrigin");
        sb.append('=');
        sb.append(b);
        sb.append('&');
        sb.append('&');
        sb.append("installType");
        sb.append('=');
        sb.append(this.e.g().B());
        String n = this.e.g().n();
        if (C8168dfL.h(n)) {
            sb.append('&');
            sb.append("channelId");
            sb.append('=');
            sb.append(n);
        }
        if (this.b != null) {
            sb.append('&');
            sb.append("uuid");
            sb.append('=');
            sb.append(this.b);
        }
        if (this.d != null) {
            sb.append('&');
            sb.append("titleVideoId");
            sb.append('=');
            sb.append(this.d);
        }
        Context f = this.e.f();
        if (C8157dfA.c(f, "isAutomation")) {
            boolean b2 = C8157dfA.b(f, "isAutomation", false);
            sb.append('&');
            sb.append("isAutomation");
            sb.append('=');
            sb.append(b2);
        }
        if (C8157dfA.c(f, "allocAutomation")) {
            boolean b3 = C8157dfA.b(f, "allocAutomation", true);
            sb.append('&');
            sb.append("allocAutomation");
            sb.append('=');
            sb.append(b3);
        }
        aMP.d.b(sb);
        this.a = sb.toString();
    }

    private String c(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
            return str;
        }
    }
}
