package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.cl.model.secondscreen.ConnectionSource;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_AutoLogin;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_GameController;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_OauthTwoViaBrowser;
import com.netflix.mediaclient.service.user.UserAgent;
import o.C8246dgk;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class MB implements InterfaceC8940gG {
    private InterfaceC6704ciN a;
    private AbstractC8935gB b;
    private C8246dgk c;
    private boolean d = false;
    private Context e;
    private UserAgent j;

    @Override // o.InterfaceC8940gG
    public void d() {
    }

    public MB(Context context, UserAgent userAgent, InterfaceC6704ciN interfaceC6704ciN, C8246dgk c8246dgk) {
        this.e = context;
        this.j = userAgent;
        this.a = interfaceC6704ciN;
        this.c = c8246dgk;
    }

    private boolean b() {
        return !C8157dfA.b(this.e, "preference_read_pai_referrer", false);
    }

    private void c() {
        C8157dfA.d(this.e, "preference_read_pai_referrer", true);
    }

    public void a() {
        if (b()) {
            try {
                AbstractC8935gB b = AbstractC8935gB.d(this.e).b();
                this.b = b;
                b.b(this);
                return;
            } catch (SecurityException unused) {
                C1044Mm.e("PlayAutoInstallReferrer", "Probably an AOSP device with GPS!!!");
                return;
            }
        }
        C1044Mm.e("PlayAutoInstallReferrer", "start: skipped - isFirstTime: " + b());
    }

    @Override // o.InterfaceC8940gG
    public void c(int i) {
        if (i != 0) {
            if (i == 1) {
                C1044Mm.j("PlayAutoInstallReferrer", "Unable to connect to the service");
                return;
            } else if (i == 2) {
                C1044Mm.j("PlayAutoInstallReferrer", "InstallReferrer not supported");
                return;
            } else {
                C1044Mm.j("PlayAutoInstallReferrer", "responseCode not found. responseCode: " + i);
                return;
            }
        }
        try {
            C1044Mm.b("PlayAutoInstallReferrer", "InstallReferrer connected");
            d(this.b.b());
            this.b.a();
        } catch (RemoteException e) {
            C1044Mm.b("PlayAutoInstallReferrer", e, "Failed to get response from client", new Object[0]);
        } catch (SecurityException e2) {
            C1044Mm.b("PlayAutoInstallReferrer", e2, "SPY-38241: most likely installed on Google not certified device", new Object[0]);
            InterfaceC1598aHf.a(new C1596aHd("SPY-38241: most likely installed on Google not certified device").b(false).d(e2).b(ErrorType.c));
        }
    }

    private void d(C8939gF c8939gF) {
        String d = c8939gF.d();
        long e = c8939gF.e();
        long b = c8939gF.b();
        C1044Mm.e("PlayAutoInstallReferrer", "handleReferrer: referrerUrl: " + d + ",  clickTime: " + e + ", installTime: " + b);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "handleReferrer");
            jSONObject.put("referrerUrl", d);
            jSONObject.put("clickTime", e);
            jSONObject.put("installTime", b);
        } catch (JSONException unused) {
        }
        Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
        C8157dfA.a(this.e, "playReferrer", d);
        C8157dfA.e(this.e, "playAppInstallTime", b);
        if (this.d) {
            a("02370EE9-3E5D-427C-86CC-09A3AC1B4CBC");
        } else {
            String e2 = C8117deN.e(d);
            if (C8168dfL.h(e2) && C8117deN.a(d)) {
                a(e2);
            }
        }
        d(d);
        i();
        d(d, b);
        b(d);
        c();
    }

    private boolean e() {
        return C8157dfA.b(this.e, "nf_first_start_after_install", -1L) < 0;
    }

    private void b(String str) {
        if (!Config_FastProperty_GameController.Companion.a()) {
            C1044Mm.j("PlayAutoInstallReferrer", "Cloud controller deep link is NOT enabled. Ignore.");
            return;
        }
        String c = C8117deN.c(str);
        if (C8168dfL.g(c)) {
            C1044Mm.j("PlayAutoInstallReferrer", "Cloud controller deep link is enabled, but beacon code is empty. Ignore.");
            return;
        }
        C1044Mm.a("PlayAutoInstallReferrer", "Starting game controller activity with beacon %s", c);
        if (!e()) {
            C1044Mm.j("PlayAutoInstallReferrer", "Cloud controller deep link can not be used after first app start. Ignore.");
            return;
        }
        AbstractApplicationC1040Mh.getInstance().c(this.a.c(this.e, c, ConnectionSource.deferredDeepLink));
    }

    private void d(String str, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        String d = C8117deN.d(str);
        if (C8168dfL.g(d)) {
            return;
        }
        if (currentTimeMillis - j > Config_FastProperty_AutoLogin.Companion.b()) {
            C1044Mm.j("PlayAutoInstallReferrer", "Autologin token expired, do nothing");
        } else {
            this.j.d(d);
        }
    }

    private void d(String str) {
        if (C8117deN.b(str) && Config_FastProperty_OauthTwoViaBrowser.Companion.e()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://app.netflix.com/oAuth2Init"));
            AbstractApplicationC1040Mh.getInstance().c(intent);
        }
    }

    private void a(String str) {
        C1044Mm.e("PlayAutoInstallReferrer", "recordGpaiChannelId: recording channelId: " + str);
        C8157dfA.a(this.e, "channelIdValue", str);
        C8157dfA.d(this.e, "isPaiPreload", true);
        ((C1809aPa) C1332Xp.b(C1809aPa.class)).d();
    }

    private void i() {
        this.c.d(new C8246dgk.e() { // from class: o.MB.5
            @Override // o.C8246dgk.e
            public void c(String str, boolean z) {
                MB.this.c("successfully retrieved block store login token");
                MB.this.j.j(str);
                MB.this.c.a();
            }

            @Override // o.C8246dgk.e
            public void c(Exception exc) {
                MB.this.c(String.format("Could not retrieve block storelogin token: %s", exc.getMessage()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        C1044Mm.e("PlayAutoInstallReferrer", str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SignupConstants.Field.LANG_ID, "PlayAutoInstallReferrer");
            jSONObject.put("status", str);
            Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
        } catch (JSONException e) {
            C1044Mm.e("PlayAutoInstallReferrer", "can not create json object for auto login token logging", e);
        }
    }
}
