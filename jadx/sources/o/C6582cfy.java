package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.IMdxSharedState;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault;
import java.util.List;
import o.C8241dgf;

/* renamed from: o.cfy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6582cfy extends BroadcastReceiver {
    private final NetflixActivity e;

    public C6582cfy(NetflixActivity netflixActivity) {
        this.e = netflixActivity;
        C1044Mm.b("nf_mdx", "Receiver created");
    }

    public IntentFilter b() {
        C1044Mm.b("nf_mdx", "Get filter called");
        IntentFilter intentFilter = new IntentFilter("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_READY");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_NOTREADY");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_TARGETLIST");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.PIN_VERIFICATION_SHOW");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_PIN_VERIFICATION_NOT_REQUIRED");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_PLAYBACKSTART");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_STATE");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_CAPABILITY");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_ERROR");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REMOTE_LOGIN_STATUS");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REGPAIR_PIN_CONFIRMATION_DIALOG_SHOW");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REGPAIR_PIN_CONFIRMATION_DIALOG_CANCEL");
        intentFilter.addCategory("com.netflix.mediaclient.intent.category.MDX");
        return intentFilter;
    }

    public IntentFilter d() {
        C1044Mm.b("nf_mdx", "Get global filter called");
        IntentFilter intentFilter = new IntentFilter("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_POSTPLAY");
        intentFilter.addCategory("com.netflix.mediaclient.intent.category.MDX");
        return intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        if (C8054ddD.l(this.e) || (action = intent.getAction()) == null) {
            return;
        }
        if (!this.e.shouldServiceMdxBroadcast()) {
            C1044Mm.e("nf_mdx", "Ignore MDX broadcast " + this.e.getClass().getSimpleName());
            return;
        }
        this.e.mdxStatusUpdatedByMdxReceiver();
        if ("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_NOTREADY".equals(action)) {
            C1044Mm.e("nf_mdx", "MDX is NOT ready, invalidate action bar");
            this.e.invalidateOptionsMenu();
        } else if ("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_READY".equals(action)) {
            C1044Mm.e("nf_mdx", "MDX is ready, invalidate action bar");
            this.e.invalidateOptionsMenu();
        } else if ("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_TARGETLIST".equals(action)) {
            C1044Mm.e("nf_mdx", "MDX is ready, got target list update, invalidate action bar");
            this.e.mdxTargetListChanged();
            this.e.updateTargetSelectionDialog();
        } else if ("com.netflix.mediaclient.intent.action.PIN_VERIFICATION_SHOW".equals(action)) {
            C1044Mm.e("nf_mdx", "MDX PIN show dialog");
            c(intent);
        } else if ("com.netflix.mediaclient.intent.action.MDX_ACTION_PIN_VERIFICATION_NOT_REQUIRED".equals(action)) {
            C1044Mm.e("nf_mdx", "MDX cancel pin dialog - verified on other controller");
            e();
        } else if ("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_POSTPLAY".equals(action)) {
            d(intent, context);
            abortBroadcast();
        } else if ("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_PLAYBACKSTART".equals(action)) {
            e(context);
        } else if (intent.getAction().equals("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_STATE")) {
            IMdxSharedState g = this.e.getServiceManager().q().g();
            if (g == null || g.c() != IMdxSharedState.MdxPlaybackState.Transitioning) {
                return;
            }
            e(context);
        } else if ("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_CAPABILITY".equals(action)) {
            C1044Mm.e("nf_mdx", "MDX is connected, invalidate action bar to finish animation");
            this.e.setConnectingToTarget(false);
            this.e.mdxTargetListChanged();
            LocalBroadcastManager.getInstance(this.e).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.UPDATE_CAPABILITIES_BADGES"));
        } else if ("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REMOTE_LOGIN_STATUS".equals(action)) {
            boolean booleanExtra = intent.getBooleanExtra("remoteLoginStarted", false);
            boolean booleanExtra2 = intent.getBooleanExtra("remoteLoginCompleted", false);
            if (booleanExtra && booleanExtra2) {
                C1044Mm.e("nf_mdx", "MDX remote login is complete");
                C1999aWc d = C1999aWc.d(intent.getIntExtra("remoteLoginPolicy", 0));
                if (d == null || !d.c()) {
                    return;
                }
                this.e.setConnectingToTarget(false);
            }
        } else if ("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_ERROR".equals(action)) {
            C1044Mm.e("nf_mdx", "MDX is has error");
            this.e.setConnectingToTarget(false);
            this.e.mdxTargetListChanged();
        }
    }

    private void e(Context context) {
        LocalBroadcastManager.getInstance(this.e).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_PLAYER_POST_PLAY_ACTION_HIDE"));
    }

    private void d(Intent intent, Context context) {
        String string = intent.getExtras().getString("postplayState");
        if (C8168dfL.g(string)) {
            return;
        }
        C5095bsL c5095bsL = new C5095bsL(string);
        if (c5095bsL.d()) {
            e(c5095bsL);
        } else if (c5095bsL.e()) {
            d(c5095bsL);
        }
    }

    private void e(C5095bsL c5095bsL) {
        C8241dgf.e m;
        InterfaceC5131bsv q = this.e.getServiceManager().q();
        if (!(q instanceof aVM) || (m = ((aVM) q).m()) == null || m.e == null) {
            return;
        }
        this.e.getServiceManager().j().e(String.valueOf(m.e), null, true, new e("nf_mdx", this.e), "MDXReceiver");
    }

    private void d(C5095bsL c5095bsL) {
        C8241dgf.e n;
        if (this.e.getServiceManager().q() == null || (n = this.e.getServiceManager().q().n()) == null || n.e == null) {
            return;
        }
        this.e.getServiceManager().j().a(String.valueOf(n.e), n.d(), PlayLocationType.MDX, new b("nf_mdx", this.e));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.cfy$e */
    /* loaded from: classes4.dex */
    public static class e extends C5087bsD {
        private final NetflixActivity b;
        private boolean e;

        public e(String str, NetflixActivity netflixActivity) {
            super(str);
            this.e = false;
            this.b = netflixActivity;
        }

        @Override // o.C5087bsD, o.InterfaceC5094bsK
        public void e(InterfaceC5227bul interfaceC5227bul, Status status) {
            super.e(interfaceC5227bul, status);
            if (!status.j() || interfaceC5227bul == null || this.e) {
                return;
            }
            Intent intent = new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_PLAYER_POST_PLAY_ACTION_TITLE_NEXT");
            intent.putExtra(SignupConstants.Field.LANG_ID, interfaceC5227bul.getId());
            LocalBroadcastManager.getInstance(this.b).sendBroadcast(intent);
            C6582cfy.b(this.b);
            this.e = true;
        }
    }

    public static void b(Context context) {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.netflix.mediaclient.ui.mdx.NOTIFY_SHOW_AND_DISABLE_INTENT"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.cfy$b */
    /* loaded from: classes4.dex */
    public static class b extends C5087bsD {
        private boolean b;
        private final NetflixActivity e;

        public b(String str, NetflixActivity netflixActivity) {
            super(str);
            this.b = false;
            this.e = netflixActivity;
        }

        @Override // o.C5087bsD, o.InterfaceC5094bsK
        public void b(InterfaceC5190buA interfaceC5190buA, Status status) {
            List<InterfaceC5191buB> aB;
            super.b(interfaceC5190buA, status);
            if (this.b || this.e == null || !status.j() || interfaceC5190buA == null || (aB = interfaceC5190buA.aB()) == null || aB.size() <= 0) {
                return;
            }
            String id = aB.get(0).getId();
            if (TextUtils.isEmpty(id)) {
                return;
            }
            this.e.getServiceManager().j().e(id, null, true, new e("nf_mdx", this.e), "MDXReceiver.PP");
            this.b = true;
        }
    }

    private void e() {
        C1044Mm.e("nf_pin", "cancelPin on MDX_ACTION_PIN_VERIFICATION_NOT_REQUIRED");
        C8082ddf.a().c();
    }

    private void c(Intent intent) {
        String string = intent.getExtras().getString("uuid");
        C1044Mm.e("nf_pin", "verifyPinAndNotify on PIN_VERIFICATION_SHOW");
        PlayVerifierVault playVerifierVault = new PlayVerifierVault(PlayVerifierVault.RequestedBy.e.c(), string);
        C8082ddf a = C8082ddf.a();
        NetflixActivity netflixActivity = this.e;
        a.b(netflixActivity, true, playVerifierVault, netflixActivity);
    }
}
