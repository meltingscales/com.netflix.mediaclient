package o;

import android.content.Context;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.configuration.EdgeStack;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.AUIApiEndpointRegistry;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes3.dex */
public class aMM implements AUIApiEndpointRegistry {
    private aMU a;
    private String b = h();
    private String c = j();
    private aOV d;
    private final Context e;
    private UserAgent g;

    private String j() {
        return "/aui/pathEvaluator/mobile/latest";
    }

    private boolean l() {
        return true;
    }

    @Override // com.netflix.mediaclient.service.webclient.ApiEndpointRegistry
    public Map<String, String> a() {
        return null;
    }

    @Override // com.netflix.mediaclient.service.webclient.ApiEndpointRegistry
    public Map<String, String> a(ApiEndpointRegistry.ResponsePathFormat responsePathFormat) {
        return null;
    }

    @Override // com.netflix.mediaclient.service.webclient.ApiEndpointRegistry
    public String b() {
        return this.b;
    }

    @Override // com.netflix.mediaclient.service.webclient.ApiEndpointRegistry
    public String b(String str) {
        return null;
    }

    @Override // o.InterfaceC5081bry
    public URL c(String str) {
        return null;
    }

    @Override // com.netflix.mediaclient.service.webclient.ApiEndpointRegistry
    public Map<String, String> c() {
        return null;
    }

    @Override // com.netflix.mediaclient.service.webclient.ApiEndpointRegistry
    public String d(String str) {
        return null;
    }

    @Override // com.netflix.mediaclient.service.webclient.ApiEndpointRegistry
    public boolean d() {
        return true;
    }

    @Override // o.InterfaceC5081bry
    public URL e() {
        return null;
    }

    @Override // com.netflix.mediaclient.service.webclient.ApiEndpointRegistry
    public String g() {
        return null;
    }

    public aMM(Context context, UserAgent userAgent, aMS ams, InterfaceC4208baF interfaceC4208baF, C1812aPd c1812aPd) {
        this.e = context;
        this.g = userAgent;
        this.a = ams;
        this.d = c1812aPd;
    }

    @Override // com.netflix.mediaclient.service.webclient.AUIApiEndpointRegistry
    public Map<String, String> f() {
        Map<String, String> m;
        synchronized (this) {
            m = m();
        }
        return m;
    }

    private Map<String, String> m() {
        C8190dfh c8190dfh;
        synchronized (this) {
            c8190dfh = new C8190dfh();
            c8190dfh.put("responseFormat", "json");
            c8190dfh.put("pathFormat", AUIApiEndpointRegistry.ResponsePathFormat.HIERARCHICAL.e);
            C1817aPi g = this.a.g();
            c8190dfh.put("devmod", AbstractC1838aQc.c());
            c8190dfh.put("appVer", g.a());
            c8190dfh.put("appVersion", g.e());
            c8190dfh.put("appType", "samurai");
            c8190dfh.put("deviceLocale", C4984bqG.b.e().b());
            c8190dfh.put("installType", this.d.B());
            c8190dfh.put("isNetflixPreloaded", String.valueOf(this.d.at()));
            String n = this.d.n();
            if (C8168dfL.h(n)) {
                c8190dfh.put("channelId", n);
            }
            c8190dfh.put(SignupConstants.Key.NETFLIX_CLIENT_PLATFORM, SignupConstants.AndroidPlatform.ANDROID_NATIVE);
            c8190dfh.put("landingOrigin", C1814aPf.b(this.e));
            c8190dfh.put("isConsumptionOnly", String.valueOf(true));
            c8190dfh.put("inApp", "true");
            c8190dfh.put("nglVersion", "NGL_LATEST_RELEASE");
            c8190dfh.put("languages", aMH.c().e(this.e).getLanguage());
            UserAgent userAgent = this.g;
            if (userAgent != null && C8168dfL.h(userAgent.d())) {
                c8190dfh.put("availableLocales", this.g.d());
            }
            c8190dfh.put("original_path", "/aui/pathEvaluator/mobile/latest");
            d(c8190dfh);
            aMP.d.d(c8190dfh);
        }
        return c8190dfh;
    }

    @Override // com.netflix.mediaclient.service.webclient.AUIApiEndpointRegistry
    public Map<String, String> d(AUIApiEndpointRegistry.ResponsePathFormat responsePathFormat) {
        C8190dfh c8190dfh;
        synchronized (this) {
            c8190dfh = new C8190dfh();
            c8190dfh.put("responseFormat", "json");
            C1817aPi g = this.a.g();
            c8190dfh.put("devmod", AbstractC1838aQc.c());
            c8190dfh.put("appVer", g.a());
            c8190dfh.put("appVersion", g.e());
            c8190dfh.put("appType", "samurai");
            c8190dfh.put("installType", this.d.B());
            c8190dfh.put("isNetflixPreloaded", String.valueOf(this.d.at()));
            String n = this.d.n();
            if (C8168dfL.h(n)) {
                c8190dfh.put("channelId", n);
            }
            c8190dfh.put(SignupConstants.Key.NETFLIX_CLIENT_PLATFORM, SignupConstants.AndroidPlatform.ANDROID_NATIVE);
            c8190dfh.put("nglVersion", "NGL_LATEST_RELEASE");
            c8190dfh.put("landingOrigin", C1814aPf.b(this.e));
            c8190dfh.put("isConsumptionOnly", String.valueOf(true));
            c8190dfh.put("inApp", "true");
            c8190dfh.put("languages", aMH.c().e(this.e).getLanguage());
            UserAgent userAgent = this.g;
            if (userAgent != null && C8168dfL.h(userAgent.d())) {
                c8190dfh.put("availableLocales", aMH.c().c(this.g));
            }
            c8190dfh.put("original_path", "/aui/pathEvaluator/mobile/latest");
            d(c8190dfh);
        }
        return c8190dfh;
    }

    @Override // o.InterfaceC5081bry
    public URL a(String str) {
        return a(this.b, this.c, str);
    }

    @Override // o.InterfaceC5081bry
    public URL i() {
        return a(this.b, "/nq/aui/endpoint/^1.0.0-mobile/pathEvaluator", null);
    }

    private URL a(String str, String str2, String str3) {
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

    private StringBuilder o() {
        StringBuilder sb = new StringBuilder();
        if (l()) {
            sb.append("https://");
        } else {
            sb.append("http://");
        }
        return sb;
    }

    private InterfaceC8195dfm<String, String> d(InterfaceC8195dfm<String, String> interfaceC8195dfm) {
        if (C8206dfx.e()) {
            String e = C8157dfA.e(this.e, "signup_stack_preference", "");
            if (!"".equals(e)) {
                interfaceC8195dfm.put("stack", e);
            } else {
                int i = AnonymousClass4.a[b(this.e).ordinal()];
                if (i == 1) {
                    interfaceC8195dfm.put("stack", "staging");
                } else if (i == 2) {
                    interfaceC8195dfm.put("stack", "int");
                } else if (i == 3) {
                    interfaceC8195dfm.put("stack", "test");
                }
            }
            return interfaceC8195dfm;
        }
        return interfaceC8195dfm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aMM$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EdgeStack.values().length];
            a = iArr;
            try {
                iArr[EdgeStack.STAGING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EdgeStack.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EdgeStack.TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EdgeStack.PROD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static EdgeStack b(Context context) {
        return C1816aPh.b(context);
    }

    private String h() {
        if (C8206dfx.e()) {
            int i = AnonymousClass4.a[b(this.e).ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? "android.prod.cloud.netflix.com" : "android.test.cloud.netflix.com" : "android.int.cloud.netflix.com" : "android.staging.cloud.netflix.com";
        }
        return "android.prod.cloud.netflix.com";
    }
}
