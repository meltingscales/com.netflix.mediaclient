package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.view.View;
import android.widget.LinearLayout;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.cs.ChatCommand;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_ConsumptionOnlyHelpCenter;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration;
import com.netflix.mediaclient.servicemgr.CustomerServiceLogging;
import com.netflix.mediaclient.ui.voip.VoIpModuleInstallScreen;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.ViewUtils;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import o.C1044Mm;
import o.C1163Rc;
import o.C8086ddj;
import o.C8094ddr;
import o.C8096ddt;
import o.C8168dfL;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.cQQ;
import o.dpR;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ddj  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8086ddj {
    public static final e b;
    private static byte e$ss2$2012 = 0;
    private static int l = 1;

    /* renamed from: o  reason: collision with root package name */
    private static int f13832o;
    private final View a;
    private final View c;
    private final View d;
    private final View e;
    private final VoIpModuleInstallScreen f;
    private final CompositeDisposable g;
    private final ActivityC8087ddk h;
    private final View i;
    private cQQ j;
    private final LinearLayout n;

    static {
        d();
        b = new e(null);
    }

    static void d() {
        e$ss2$2012 = (byte) 24;
    }

    public final View c() {
        return this.c;
    }

    public C8086ddj(ActivityC8087ddk activityC8087ddk) {
        C8632dsu.c((Object) activityC8087ddk, "");
        this.h = activityC8087ddk;
        this.g = new CompositeDisposable();
        this.j = new cQQ();
        View findViewById = activityC8087ddk.findViewById(C8094ddr.b.T);
        C8632dsu.a(findViewById, "");
        this.n = (LinearLayout) findViewById;
        View findViewById2 = activityC8087ddk.findViewById(C8094ddr.b.s);
        C8632dsu.a(findViewById2, "");
        this.c = findViewById2;
        View findViewById3 = activityC8087ddk.findViewById(C8094ddr.b.G);
        C8632dsu.a(findViewById3, "");
        this.a = findViewById3;
        View findViewById4 = activityC8087ddk.findViewById(C8094ddr.b.r);
        C8632dsu.a(findViewById4, "");
        this.e = findViewById4;
        View findViewById5 = activityC8087ddk.findViewById(C8094ddr.b.E);
        C8632dsu.a(findViewById5, "");
        this.d = findViewById5;
        View findViewById6 = activityC8087ddk.findViewById(C8094ddr.b.f13835J);
        C8632dsu.a(findViewById6, "");
        this.i = findViewById6;
        this.f = new VoIpModuleInstallScreen(activityC8087ddk);
        h();
        a();
    }

    private final void h() {
        Context applicationContext = this.h.getApplicationContext();
        C8632dsu.a(applicationContext, "");
        if (C8153dex.e(applicationContext)) {
            if (!Config_FastProperty_ConsumptionOnlyHelpCenter.Companion.c() || !e()) {
                this.e.setVisibility(8);
                this.d.setVisibility(8);
            }
            this.i.setVisibility(8);
        }
    }

    public final void b() {
        VoIpModuleInstallScreen voIpModuleInstallScreen = this.f;
        if (voIpModuleInstallScreen != null) {
            voIpModuleInstallScreen.d();
        }
        this.g.dispose();
    }

    public final void a() {
        boolean z;
        ViewUtils.Visibility visibility;
        View findViewById = this.h.findViewById(C8094ddr.b.N);
        View findViewById2 = this.h.findViewById(C8094ddr.b.L);
        boolean g = g();
        if (j()) {
            ViewUtils.d(this.c, ViewUtils.Visibility.GONE);
            ViewUtils.d(findViewById2, ViewUtils.Visibility.INVISIBLE);
            z = false;
        } else {
            View view = this.c;
            ViewUtils.Visibility visibility2 = ViewUtils.Visibility.VISIBLE;
            ViewUtils.d(view, visibility2);
            ViewUtils.d(findViewById2, visibility2);
            z = true;
        }
        if (g) {
            ViewUtils.d(this.a, ViewUtils.Visibility.GONE);
            if (!z) {
                visibility = ViewUtils.Visibility.INVISIBLE;
                ViewUtils.d(findViewById, visibility);
            }
        } else {
            ViewUtils.d(this.a, ViewUtils.Visibility.VISIBLE);
        }
        visibility = ViewUtils.Visibility.VISIBLE;
        ViewUtils.d(findViewById, visibility);
    }

    private final boolean g() {
        try {
            if (this.h.getServiceManager() != null && this.h.getServiceManager().g() != null) {
                aOV g = this.h.getServiceManager().g();
                C8632dsu.d(g);
                VoipConfiguration ac = g.ac();
                if (ac == null) {
                    C1044Mm.e("VoipActivity", "VOIP config does not exist, by default it is enabled");
                    return false;
                }
                return ac.isDisableChatButton();
            }
        } catch (Throwable unused) {
            C1044Mm.d("VoipActivity", "Something is very wrong, go with default .");
        }
        return false;
    }

    private final boolean j() {
        try {
        } catch (Throwable unused) {
            C1044Mm.d("VoipActivity", "Something is very wrong, go with default .");
        }
        if (this.h.getServiceManager() != null && this.h.getServiceManager().g() != null) {
            aOV g = this.h.getServiceManager().g();
            C8632dsu.d(g);
            VoipConfiguration ac = g.ac();
            if (ac == null) {
                C1044Mm.e("VoipActivity", "VOIP config does not exist, by default it is enabled");
                return false;
            }
            boolean m = ConnectivityUtils.m(this.h);
            if (ConnectivityUtils.p(this.h)) {
                return !ac.isEnableVoipOverData();
            }
            if (m) {
                boolean isEnableVoipOverWiFi = ac.isEnableVoipOverWiFi();
                C1044Mm.e("VoipActivity", "On WiFi, VOIP call is enabled " + isEnableVoipOverWiFi);
                return !ac.isEnableVoipOverWiFi();
            }
            C1044Mm.j("VoipActivity", "Not on data or WiFi? We most likely do not have network Hide by default");
            return true;
        }
        C1044Mm.j("VoipActivity", "Service manager or configuration not found, hide VOIP");
        return true;
    }

    public final boolean d(View view) {
        String str;
        String string;
        int i = 2 % 2;
        int i2 = f13832o + 105;
        l = i2 % 128;
        if (i2 % 2 != 0) {
            if (view == null) {
                C1044Mm.d("VoipActivity", "launchBrowser:: null view? This should never happen!");
                return true;
            }
            int id = view.getId();
            if (id != C8094ddr.b.I) {
                if (id == C8094ddr.b.F) {
                    String string2 = this.h.getString(C8094ddr.i.C);
                    if (string2.startsWith("'!#+")) {
                        Object[] objArr = new Object[1];
                        k(string2.substring(4), objArr);
                        string2 = ((String) objArr[0]).intern();
                    }
                    C8632dsu.a(string2, "");
                    e(this, string2, null, 2, null);
                } else if (id == C8094ddr.b.C) {
                    string = this.h.getString(C8094ddr.i.A);
                    if (string.startsWith("'!#+")) {
                        Object[] objArr2 = new Object[1];
                        k(string.substring(4), objArr2);
                        string = ((String) objArr2[0]).intern();
                    }
                } else if (id == C8094ddr.b.E) {
                    int i3 = f13832o + 27;
                    l = i3 % 128;
                    int i4 = i3 % 2;
                    String string3 = this.h.getString(C8094ddr.i.z);
                    if (string3.startsWith("'!#+")) {
                        Object[] objArr3 = new Object[1];
                        k(string3.substring(4), objArr3);
                        string3 = ((String) objArr3[0]).intern();
                        int i5 = f13832o + 35;
                        l = i5 % 128;
                        int i6 = i5 % 2;
                    }
                    C8632dsu.a(string3, "");
                    a(this, string3, null, null, 6, null);
                } else if (id == C8094ddr.b.r) {
                    String string4 = this.h.getString(C8096ddt.e.b);
                    if (string4.startsWith("'!#+")) {
                        Object[] objArr4 = new Object[1];
                        k(string4.substring(4), objArr4);
                        string4 = ((String) objArr4[0]).intern();
                        int i7 = l + 115;
                        f13832o = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    C8632dsu.a(string4, "");
                    a(this, string4, null, null, 6, null);
                } else if (id == C8094ddr.b.M) {
                    String string5 = this.h.getString(C8094ddr.i.H);
                    if (string5.startsWith("'!#+")) {
                        int i9 = f13832o + 25;
                        l = i9 % 128;
                        int i10 = i9 % 2;
                        Object[] objArr5 = new Object[1];
                        k(string5.substring(4), objArr5);
                        string5 = ((String) objArr5[0]).intern();
                    }
                    C8632dsu.a(string5, "");
                    e(this, string5, null, 2, null);
                } else if (id == C8094ddr.b.f13835J) {
                    String string6 = this.h.getString(C8094ddr.i.F);
                    if (string6.startsWith("'!#+")) {
                        int i11 = l + 45;
                        f13832o = i11 % 128;
                        int i12 = i11 % 2;
                        String substring = string6.substring(4);
                        Object[] objArr6 = new Object[1];
                        k(substring, objArr6);
                        string6 = ((String) objArr6[0]).intern();
                    }
                    C8632dsu.a(string6, "");
                    a(this, string6, null, null, 6, null);
                } else if (id == C8094ddr.b.B) {
                    StringBuilder sb = new StringBuilder(this.h.getString(C8094ddr.i.B));
                    if (Locale.getDefault() != null) {
                        int i13 = f13832o + 3;
                        l = i13 % 128;
                        int i14 = i13 % 2;
                        str = Locale.getDefault().getLanguage();
                    } else {
                        str = SignupConstants.Language.ENGLISH_EN;
                    }
                    sb.append(str);
                    String string7 = this.h.getString(C8094ddr.i.D);
                    if (string7.startsWith("'!#+")) {
                        Object[] objArr7 = new Object[1];
                        k(string7.substring(4), objArr7);
                        string7 = ((String) objArr7[0]).intern();
                    }
                    sb.append(string7);
                    String sb2 = sb.toString();
                    C8632dsu.a(sb2, "");
                    e(this, sb2, null, 2, null);
                } else if (id == C8094ddr.b.s) {
                    i();
                    this.h.c();
                } else if (id == C8094ddr.b.G) {
                    C1163Rc.e eVar = new C1163Rc.e(null, d(C8094ddr.i.j), d(C8094ddr.i.c), new Runnable() { // from class: o.ddm
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8086ddj.b(C8086ddj.this);
                        }
                    }, d(C8094ddr.i.e), null);
                    ActivityC8087ddk activityC8087ddk = this.h;
                    this.h.displayDialog(C1163Rc.c(activityC8087ddk, activityC8087ddk.getHandler(), eVar, null));
                } else if (id != C8094ddr.b.K) {
                    return false;
                } else {
                    C1044Mm.e("VoipActivity", "Perform up action");
                    this.h.performUpAction();
                }
                return true;
            }
            int i15 = f13832o + 51;
            l = i15 % 128;
            int i16 = i15 % 2;
            string = this.h.getString(C8096ddt.e.d);
            if (string.startsWith("'!#+")) {
                Object[] objArr8 = new Object[1];
                k(string.substring(4), objArr8);
                string = ((String) objArr8[0]).intern();
            }
            C8632dsu.a(string, "");
            e(this, string, null, 2, null);
            return true;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C8086ddj c8086ddj) {
        C8632dsu.c((Object) c8086ddj, "");
        C1044Mm.e("VoipActivity", "User confirmed for live chat!");
        CLv2Utils.INSTANCE.e(new Focus(AppView.csChatButton, null), new ChatCommand());
        c8086ddj.c("https://help.netflix.com/mobilechat", "?netflixsource=android&", CustomerServiceLogging.Action.url);
    }

    private final String d(int i) {
        int i2 = 2 % 2;
        int i3 = l + 81;
        f13832o = i3 % 128;
        int i4 = i3 % 2;
        String string = this.h.getString(i);
        if (!(!string.startsWith("'!#+"))) {
            int i5 = f13832o + 107;
            l = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            k(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i7 = l + 13;
            f13832o = i7 % 128;
            int i8 = i7 % 2;
        }
        C8632dsu.a(string, "");
        return string;
    }

    private final void i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "voipCallButtonPress");
            Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
        } catch (JSONException unused) {
        }
    }

    static /* synthetic */ void a(C8086ddj c8086ddj, String str, String str2, CustomerServiceLogging.Action action, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "?";
        }
        if ((i & 4) != 0) {
            action = CustomerServiceLogging.Action.url;
        }
        c8086ddj.c(str, str2, action);
    }

    private final void c(final String str, final String str2, final CustomerServiceLogging.Action action) {
        if (e()) {
            this.g.add(SubscribersKt.subscribeBy$default(this.j.a(C8051ddA.e(str)), (drM) null, new drM<cQQ.d, dpR>() { // from class: com.netflix.mediaclient.ui.voip.LandingPageScreen$openUrlWithAutoLoginToken$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cQQ.d dVar) {
                    b(dVar);
                    return dpR.c;
                }

                public final void b(cQQ.d dVar) {
                    C8632dsu.c((Object) dVar, "");
                    if (dVar.e().j() && !C8168dfL.g(dVar.b())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        String str3 = str2;
                        sb.append(str3 + "nftoken=");
                        sb.append(dVar.b());
                        C8086ddj c8086ddj = this;
                        String sb2 = sb.toString();
                        C8632dsu.a(sb2, "");
                        c8086ddj.a(sb2, action);
                        return;
                    }
                    C1044Mm.e("VoipActivity", "Couldn't fetch token, opening url without auto login");
                    this.a(str, action);
                }
            }, 1, (Object) null));
        } else {
            a(str, action);
        }
    }

    private final boolean e() {
        UserAgent c = C8126deW.c(this.h);
        return c != null && c.v();
    }

    static /* synthetic */ void e(C8086ddj c8086ddj, String str, CustomerServiceLogging.Action action, int i, Object obj) {
        if ((i & 2) != 0) {
            action = CustomerServiceLogging.Action.url;
        }
        c8086ddj.a(str, action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, CustomerServiceLogging.Action action) {
        Throwable th;
        try {
            Intent data = new Intent("android.intent.action.VIEW").setData(C8139dej.b.a(this.h, str));
            C8632dsu.a(data, "");
            data.addFlags(268435456);
            if (data.resolveActivity(this.h.getPackageManager()) == null) {
                C1044Mm.d("VoipActivity", "Unable to launchHelp");
            } else {
                this.h.startActivity(data);
            }
        } catch (ActivityNotFoundException e2) {
            String str2 = "Activity to handle url " + str + " not found. This should NOT happen.";
            C1044Mm.b("VoipActivity", e2, str2, new Object[0]);
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            C1596aHd b2 = new C1596aHd(str2, null, null, false, null, false, false, 126, null).b(ErrorType.f);
            ErrorType errorType = b2.a;
            if (errorType != null) {
                b2.e.put("errorType", errorType.c());
                String b3 = b2.b();
                if (b3 != null) {
                    b2.a(errorType.c() + " " + b3);
                }
            }
            if (b2.b() != null && b2.i != null) {
                th = new Throwable(b2.b(), b2.i);
            } else if (b2.b() != null) {
                th = new Throwable(b2.b());
            } else {
                th = b2.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(b2, th);
            } else {
                dVar.e().b(b2, th);
            }
        }
    }

    /* renamed from: o.ddj$e */
    /* loaded from: classes5.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$2012);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
