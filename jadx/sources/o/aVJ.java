package o;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.mdx.MdxLoginPolicyEnum;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aVJ implements InterfaceC2008aWl {
    private final Context c;
    private final Map<String, C2003aWg> d = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public aVJ(Context context) {
        this.c = context;
        C1044Mm.b("nf_mdx", "Creating client notifier");
    }

    private void g(String str) {
        if (this.d.containsKey(str)) {
            return;
        }
        this.d.put(str, new C2003aWg(str));
    }

    public void b(String str) {
        synchronized (this.d) {
            g(str);
            this.d.get(str).d();
        }
    }

    public C2003aWg d(String str) {
        C2003aWg c2003aWg;
        synchronized (this.d) {
            c2003aWg = this.d.get(str);
        }
        return c2003aWg;
    }

    public void e() {
        this.d.clear();
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_NOTREADY").addCategory("com.netflix.mediaclient.intent.category.MDX"));
        C1044Mm.b("nf_mdx", "Intent NOTREADY sent");
    }

    public void b() {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_TARGETLIST").addCategory("com.netflix.mediaclient.intent.category.MDX"));
        C1044Mm.b("nf_mdx", "Intent MDXUPDATE_TARGETLIST sent");
    }

    public void a(String str, String str2) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_CAPABILITY").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("stringBlob", str2));
        C1044Mm.b("nf_mdx", "Intent MDX_ACTION_UPDATE_CAPABILITY sent");
    }

    public void b(String str, String str2) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_METADATA").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("stringBlob", str2));
        C1044Mm.b("nf_mdx", "Intent MDX_ACTION_UPDATE_METADATA sent");
    }

    @Override // o.InterfaceC2008aWl
    public void c(String str, String str2) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_AUDIOSUB").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("stringBlob", str2));
        C1044Mm.b("nf_mdx", "Intent MDX_ACTION_UPDATE_AUDIOSUB sent");
    }

    public void d(String str, String str2) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_DIALOGSHOW").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("stringBlob", str2));
        C1044Mm.b("nf_mdx", "Intent MDX_ACTION_UPDATE_DIALOGSHOW sent");
    }

    public void e(String str, String str2) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_DIALOGCANCEL").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("stringBlob", str2));
        C1044Mm.b("nf_mdx", "Intent MDX_ACTION_UPDATE_DIALOGCANCEL sent");
    }

    public void h(String str, String str2) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REMOTE_LOGIN_CONSENT_DIALOG_SHOW").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("friendlyName", str2));
        C1044Mm.b("nf_mdx", "Intent MDX_ACTION_UPDATE_REMOTE_LOGIN_CONSENT sent");
    }

    public void a(String str) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REMOTE_LOGIN_CONSENT_DIALOG_CANCEL").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str));
        C1044Mm.b("nf_mdx", "Intent MDX_ACTION_UPDATE_REMOTE_LOGIN_CONSENT_DIALOG_CANCEL sent");
    }

    public void c(String str, MdxLoginPolicyEnum mdxLoginPolicyEnum, String str2, String str3) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_REMOTE_LOGIN_REQUESTED_BY_TARGET").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("remoteLoginPolicy", mdxLoginPolicyEnum.a()).putExtra("remoteLoginSessionUuid", str3).putExtra("friendlyName", str2));
    }

    public void c(String str, MdxLoginPolicyEnum mdxLoginPolicyEnum) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REMOTE_LOGIN_STATUS").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("remoteLoginPolicy", mdxLoginPolicyEnum.a()).putExtra("remoteLoginStarted", true));
    }

    public void a(String str, MdxLoginPolicyEnum mdxLoginPolicyEnum) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REMOTE_LOGIN_STATUS").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("remoteLoginPolicy", mdxLoginPolicyEnum.a()).putExtra("remoteLoginStarted", true).putExtra("remoteLoginCompleted", true));
    }

    public void f(String str, String str2) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_SHOW_TOAST").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("toastMessage", str2));
    }

    public void c(String str, MdxLoginPolicyEnum mdxLoginPolicyEnum, String str2) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REMOTE_LOGIN_STATUS").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("remoteLoginPolicy", mdxLoginPolicyEnum.a()).putExtra("remoteLoginStarted", true).putExtra("remoteLoginCompleted", true).putExtra("errorDisplayCode", str2));
    }

    public void b(String str, int i, String str2, String str3) {
        Intent putExtra = new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_ERROR").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("errorDesc", str2).putExtra("errorCode", i);
        if (C8168dfL.h(str3)) {
            putExtra.putExtra("errorDisplayCode", str3);
        }
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(putExtra);
        C1044Mm.d("nf_mdx", "Intent MDX_ACTION_UPDATE_ERROR sent %d %s", Integer.valueOf(i), str2);
    }

    public void b(String str, int i, String str2) {
        b(str, i, str2, (String) null);
    }

    @Override // o.InterfaceC2008aWl
    public void d(String str, String str2, boolean z) {
        synchronized (this.d) {
            if (this.d.get(str) != null) {
                this.d.get(str).a();
            }
        }
        Intent putExtra = new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_PLAYBACKEND").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("updateCW", !z);
        if (!TextUtils.isEmpty(str2)) {
            putExtra.putExtra("postplayState", str2);
        }
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(putExtra);
        C1044Mm.b("nf_mdx", "Intent MDX_ACTION_UPDATE_PLAYBACKEND sent");
    }

    @Override // o.InterfaceC2008aWl
    public void h(String str) {
        synchronized (this.d) {
            g(str);
            this.d.get(str).b();
        }
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_PLAYBACKSTART").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str));
        C1044Mm.b("nf_mdx", "Intent MDX_ACTION_UPDATE_PLAYBACKSTART sent");
    }

    @Override // o.InterfaceC2008aWl
    public void b(String str, String str2, String str3, int i) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_MOVIEMETADA").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("catalogId", str2).putExtra("episodeId", str3).putExtra("duration", i));
        C1044Mm.b("nf_mdx", "Intent MDXUPDATE_MOVIEDATA sent");
    }

    @Override // o.InterfaceC2008aWl
    public void c(String str, String str2, int i, int i2, boolean z, String str3, String str4) {
        synchronized (this.d) {
            if (this.d.get(str) != null) {
                this.d.get(str).a(str2, i, i2);
            }
        }
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_STATE").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("currentState", str2).putExtra("time", i).putExtra("volume", i2).putExtra("isInSkipIntroWindow", z).putExtra("skipIntroText", str3).putExtra("skipIntroType", str4));
        C1044Mm.b("nf_mdx", "Intent MDX_ACTION_UPDATE_STATE sent");
    }

    public void f(String str) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_MOVIEMETADATA_AVAILABLE").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str));
        C1044Mm.b("nf_mdx", "Intent MOVIEMETADATA_AVAILABLE sent");
    }

    @Override // o.InterfaceC2008aWl
    public void c(String str, boolean z, boolean z2, boolean z3, String str2, String str3) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_SIMPLE_PLAYBACKSTATE").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("paused", z).putExtra("transitioning", z2).putExtra("isInSkipIntroWindow", z3).putExtra("skipIntroType", str2).putExtra("postplayState", str3));
    }

    @Override // o.InterfaceC2008aWl
    public void i(String str, String str2) {
        if (this.d.get(str) != null) {
            this.d.get(str).b(str2);
        }
        this.c.sendOrderedBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_POSTPLAY").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("postplayState", str2), null);
    }

    public void d(String str, String str2, MdxLoginPolicyEnum mdxLoginPolicyEnum) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REGPAIR_PIN_CONFIRMATION_DIALOG_SHOW").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("remoteLoginPolicy", mdxLoginPolicyEnum.a()).putExtra("message", str2));
    }

    public void j(String str, String str2) {
        d(str, str2, MdxLoginPolicyEnum.LoginDisabled);
    }

    public void c(String str) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REGPAIR_PIN_CONFIRMATION_DIALOG_CANCEL").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str));
    }

    public void a(String str, String str2, int i, int i2, String str3) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.PIN_VERIFICATION_SHOW").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra(SignupConstants.Field.VIDEO_TITLE, str2).putExtra("ancestorVideoType", str3).putExtra(SignupConstants.Field.VIDEO_ID, i).putExtra("ancestorVideoId", i2));
    }

    public void a(String str, boolean z) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_PIN_VERIFICATION_NOT_REQUIRED").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str).putExtra("isPinVerified", z));
    }

    public void b(boolean z) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_NETWORK_CONNECTIVITY_CHANGE").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("networkConnected", z));
    }

    public void e(String str) {
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_PIN_VERIFICATION_INCORRECT_PIN").addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str));
    }
}
