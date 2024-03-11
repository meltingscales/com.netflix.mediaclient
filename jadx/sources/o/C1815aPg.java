package o;

import android.content.Context;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.configuration.EdgeStack;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.aPg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1815aPg implements ApiEndpointRegistry {
    private URL a;
    private final Context d;
    private final aOV e;
    private final InterfaceC4208baF g;
    private boolean h;
    private final UserAgent i;
    private String j;
    private String c = j();
    private final String l = f();
    private String b = C8159dfC.a();
    private final String f = AbstractC1838aQc.c();

    private void d(Map<String, String> map) {
    }

    private boolean m() {
        return true;
    }

    @Override // com.netflix.mediaclient.service.webclient.ApiEndpointRegistry
    public String b() {
        return this.c;
    }

    @Override // com.netflix.mediaclient.service.webclient.ApiEndpointRegistry
    public String g() {
        return this.l;
    }

    public C1815aPg(Context context, UserAgent userAgent, aOV aov, InterfaceC4208baF interfaceC4208baF, IClientLogging iClientLogging) {
        this.d = context;
        this.i = userAgent;
        this.e = aov;
        this.g = interfaceC4208baF;
    }

    @Override // com.netflix.mediaclient.service.webclient.ApiEndpointRegistry
    public Map<String, String> c() {
        Map<String, String> n;
        synchronized (this) {
            n = n();
        }
        return n;
    }

    private Map<String, String> n() {
        InterfaceC8195dfm<String, String> c8190dfh;
        synchronized (this) {
            c8190dfh = new C8190dfh<>();
            boolean av = this.e.av();
            boolean z = false;
            C1044Mm.c("EndpointRegistryProvider", "getConfigParams firstRequest=%b", Boolean.valueOf(av));
            c8190dfh.put("responseFormat", "json");
            c8190dfh.put("progressive", "false");
            c8190dfh.put("pathFormat", ApiEndpointRegistry.ResponsePathFormat.HIERARCHICAL.e);
            C1817aPi q = this.e.q();
            c8190dfh.put("appType", "samurai");
            if (!C8159dfC.j() && !C8159dfC.b()) {
                z = true;
            }
            c8190dfh.put("dbg", String.valueOf(z));
            if (EdgeStack.PROD != d(this.d)) {
                c8190dfh.put("revision", "latest");
            }
            if (!av) {
                c8190dfh.put("qlty", C8189dfg.b() ? "hd" : "sd");
            }
            c8190dfh.put("ffbc", C8151dev.e());
            c8190dfh.put("osBoard", q.b());
            c8190dfh.put("osDevice", q.d());
            c8190dfh.put("osDisplay", q.i());
            c8190dfh.put("appVer", q.a());
            c8190dfh.put("appVersion", q.e());
            c8190dfh.put("mId", q.h());
            c8190dfh.put("model", q.f());
            c8190dfh.put("api", q.c());
            c8190dfh.put("mnf", q.g());
            c8190dfh.put("store", C8061ddK.b());
            c8190dfh.put("memLevel", C8120deQ.c());
            C4984bqG c4984bqG = C4984bqG.b;
            c8190dfh.put("lackLocale", String.valueOf(c4984bqG.b()));
            c8190dfh.put("deviceLocale", c4984bqG.e().b());
            String l = this.e.l();
            c8190dfh.put("chipset", l);
            c8190dfh.put("chipsetHardware", this.e.m());
            b(c8190dfh, l);
            c8190dfh.put(SignupConstants.Key.NETFLIX_CLIENT_PLATFORM, SignupConstants.AndroidPlatform.ANDROID_NATIVE);
            c8190dfh.put("platform", "android");
            c8190dfh.put("landingOrigin", C1814aPf.b(this.d));
            if (C8168dfL.h(this.e.X())) {
                c8190dfh.put("roBspVer", this.e.X());
            }
            c8190dfh.put("devmod", this.f);
            if (C8159dfC.b()) {
                c8190dfh.put("isPartnerBuild", Boolean.TRUE.toString());
            }
            String n = this.e.n();
            if (C8168dfL.h(n)) {
                c8190dfh.put("channelId", n);
            }
            c8190dfh.put("isNetflixPreloaded", String.valueOf(this.e.at()));
            c8190dfh.put("installType", this.e.B());
            c8190dfh.put("preloadSignupRoValue", C8054ddD.e());
            c8190dfh.put("isStubInSystemPartition", String.valueOf(C8054ddD.k(this.d)));
            c8190dfh.put("isPlayBillingEnabled", String.valueOf(true ^ this.e.au()));
            c8190dfh.put("ctgr", this.e.r().c());
            ConnectivityUtils.NetType d = TN.a.d();
            if (d != null) {
                c8190dfh.put("networkType", d.name());
            }
            a(c8190dfh);
            d(c8190dfh);
            if (!av) {
                C8147der.a(c8190dfh);
            }
        }
        return c8190dfh;
    }

    private void b(InterfaceC8195dfm<String, String> interfaceC8195dfm, String str) {
        if (this.h) {
            if (C8168dfL.h(this.j)) {
                interfaceC8195dfm.put("teeInfo", this.j);
                return;
            }
            return;
        }
        this.h = true;
        if (C8168dfL.g(str) || !str.toLowerCase(Locale.US).startsWith("mt")) {
            return;
        }
        String I = this.e.I();
        this.j = I;
        if (C8168dfL.h(I)) {
            interfaceC8195dfm.put("teeInfo", this.j);
        }
    }

    @Override // com.netflix.mediaclient.service.webclient.ApiEndpointRegistry
    public Map<String, String> a(ApiEndpointRegistry.ResponsePathFormat responsePathFormat) {
        C8190dfh c8190dfh;
        synchronized (this) {
            c8190dfh = new C8190dfh();
            c8190dfh.put("responseFormat", "json");
            c8190dfh.put("progressive", "false");
            c8190dfh.put("ffbc", C8151dev.e());
            c8190dfh.put("appVersion", this.e.q().e());
            c8190dfh.put(SignupConstants.Key.NETFLIX_CLIENT_PLATFORM, SignupConstants.AndroidPlatform.ANDROID_NATIVE);
            c8190dfh.put("landingOrigin", C1814aPf.b(this.d));
            c8190dfh.put("installType", this.e.B());
            String n = this.e.n();
            if (C8168dfL.h(n)) {
                c8190dfh.put("channelId", n);
            }
            if (EdgeStack.PROD != d(this.d)) {
                c8190dfh.put("revision", "latest");
            }
            UserAgent userAgent = this.i;
            if (userAgent != null && C8168dfL.h(userAgent.d())) {
                c8190dfh.put("languages", aMH.c().c(this.i));
            }
            InterfaceC4208baF interfaceC4208baF = this.g;
            if (interfaceC4208baF != null && interfaceC4208baF.s()) {
                c8190dfh.put("dlEnabled", Boolean.TRUE.toString());
            }
            if (responsePathFormat != null) {
                c8190dfh.put("pathFormat", responsePathFormat.e);
            } else {
                c8190dfh.put("pathFormat", ApiEndpointRegistry.ResponsePathFormat.GRAPH.e);
            }
            c8190dfh.put("res", this.e.C().d);
            c8190dfh.put("imgpref", l());
            if (aQI.c()) {
                c8190dfh.put("avif", "true");
            }
            c8190dfh.put("isPlayBillingEnabled", String.valueOf(!this.e.au()));
            if (!this.e.ag()) {
                c8190dfh.put("accurate_start_point_disabled", String.valueOf(true));
            }
            aMH.c().d().b(this.d, c8190dfh);
            a(c8190dfh);
        }
        return c8190dfh;
    }

    @Override // com.netflix.mediaclient.service.webclient.ApiEndpointRegistry
    public Map<String, String> a() {
        return aMH.c().d().a();
    }

    private String l() {
        String y = this.e.y();
        return C8168dfL.h(y) ? y : "webp";
    }

    @Override // o.InterfaceC5081bry
    public URL c(String str) {
        URL url = this.a;
        if (url != null) {
            return url;
        }
        StringBuilder sb = new StringBuilder();
        if (d()) {
            sb.append("https://");
        } else {
            sb.append("http://");
        }
        sb.append(h());
        sb.append("/appboot/");
        sb.append(str);
        try {
            URL url2 = new URL(sb.toString());
            this.a = url2;
            return url2;
        } catch (MalformedURLException e) {
            throw new IllegalStateException("Unable to create URL", e);
        }
    }

    @Override // o.InterfaceC5081bry
    public URL a(String str) {
        return d(this.c, this.b, str);
    }

    @Override // o.InterfaceC5081bry
    public URL i() {
        return d(this.c, k(), null);
    }

    private String k() {
        return a(this.d);
    }

    @Override // o.InterfaceC5081bry
    public URL e() {
        return d(this.c, "/graphql", null);
    }

    public static String a(Context context) {
        if (context == null || !C8206dfx.e()) {
            return "/nq/androidui/samurai/~8.105.0/api";
        }
        String e = C8157dfA.e(context, "staging_api_version", "");
        if (C8168dfL.h(e)) {
            return "/nq/androidui/samurai/" + e + "/api";
        }
        return "/nq/androidui/samurai/~8.105.0/api";
    }

    private URL d(String str, String str2, String str3) {
        StringBuilder o2 = o();
        o2.append(str);
        if (str3 != null) {
            o2.append(str3);
        }
        o2.append(str2);
        try {
            return new URL(o2.toString());
        } catch (MalformedURLException e) {
            throw new IllegalStateException("Unable to create URL", e);
        }
    }

    @Override // com.netflix.mediaclient.service.webclient.ApiEndpointRegistry
    public String b(String str) {
        StringBuilder o2 = o();
        o2.append(this.c);
        if (str != null) {
            o2.append(str);
        }
        o2.append("/nq/androidui/samurai/v1/config");
        return o2.toString();
    }

    @Override // com.netflix.mediaclient.service.webclient.ApiEndpointRegistry
    public String d(String str) {
        StringBuilder o2 = o();
        o2.append(this.c);
        if (str != null) {
            o2.append(str);
        }
        return o2.toString();
    }

    private StringBuilder o() {
        StringBuilder sb = new StringBuilder();
        if (m()) {
            sb.append("https://");
        } else {
            sb.append("http://");
        }
        return sb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aPg$5  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[EdgeStack.values().length];
            e = iArr;
            try {
                iArr[EdgeStack.PROD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[EdgeStack.STAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[EdgeStack.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[EdgeStack.TEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private String j() {
        int i = AnonymousClass5.e[d(this.d).ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "android.staging.cloud.netflix.com";
            }
            if (i == 3) {
                return "android.int.cloud.netflix.com";
            }
            if (i == 4) {
                return "android.test.cloud.netflix.com";
            }
        }
        return "android.prod.cloud.netflix.com";
    }

    private String f() {
        int i;
        return (!C8206dfx.e() || (i = AnonymousClass5.e[d(this.d).ordinal()]) == 1 || i == 2) ? "wss://push.prod.netflix.com/ws" : (i == 3 || i == 4) ? "wss://ws.test.netflix.con/ws" : "wss://push.prod.netflix.com/ws";
    }

    public static EdgeStack d(Context context) {
        return C1816aPh.b(context);
    }

    private String h() {
        int i = AnonymousClass5.e[C1816aPh.b(this.d).ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "android-appboot-staging.netflix.com";
            }
            if (i == 3 || i == 4) {
                return "appboot.test.netflix.net";
            }
        }
        return "android-appboot.netflix.com";
    }

    @Override // com.netflix.mediaclient.service.webclient.ApiEndpointRegistry
    public boolean d() {
        if (C8206dfx.e()) {
            int i = AnonymousClass5.e[C1816aPh.b(this.d).ordinal()];
            return i == 1 || i == 2;
        }
        return true;
    }

    public static boolean e(String str) {
        return str != null && (str.equals("android.int.cloud.netflix.com") || str.equals("android.test.cloud.netflix.com"));
    }

    private void a(Map<String, String> map) {
        map.put("isAutomation", String.valueOf(MI.a.a()));
    }
}
