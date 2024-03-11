package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.StopReason;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.preapp.PreAppAgentEventType;
import com.netflix.mediaclient.service.user.UserAgent;
import o.aMN;

/* renamed from: o.bpz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4976bpz extends aMF {
    private InterfaceC1926aTj b;
    private C4926bpB d;
    private final UserAgent g;
    private final BroadcastReceiver c = new BroadcastReceiver() { // from class: o.bpz.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if (!aSS.a(context)) {
                C1044Mm.e("nf_preappagent", "widget not installed && !partnerDevice - skip fetching data");
            } else if ("com.netflix.mediaclient.intent.action.PREAPP_AGENT_TO_ALL_MEMBER_UPDATED".equals(action)) {
                C4976bpz.this.d.d(PreAppAgentEventType.ALL_MEMBER_UPDATED);
            }
        }
    };
    private final BroadcastReceiver e = new BroadcastReceiver() { // from class: o.bpz.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !C1849aQn.e()) {
                return;
            }
            String action = intent.getAction();
            C1044Mm.a("nf_preappagent", "received intent %s", action);
            if (!aSS.c(context) || !((aMN) C1332Xp.b(aMN.class)).c(aMN.d.e)) {
                C1044Mm.e("nf_preappagent", "partner module not installed - skip ");
            } else if ("com.netflix.mediaclient.intent.action.DEBUG_MINUSONE_FORCE_TEMPLATE".equals(action)) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("templateId");
                    if (C8168dfL.g(string)) {
                        return;
                    }
                    C8157dfA.a(context, "partner_force_template", string);
                    C8157dfA.d(context, "partner_to_Play", extras.getBoolean("toPlay"));
                }
            } else if ("com.netflix.mediaclient.intent.action.DEBUG_MINUSONE_CLEAR_TEMPLATE".equals(action)) {
                C8157dfA.a(context, "partner_force_template", (String) null);
                C8157dfA.d(context, "partner_to_Play", false);
            } else {
                C1044Mm.e("nf_preappagent", "unknown intent, ignoring");
            }
        }
    };
    public final BroadcastReceiver a = new BroadcastReceiver() { // from class: o.bpz.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_DEACTIVE".equals(action)) {
                C1044Mm.a("nf_preappagent", "UserAgentIntentReceiver invoked and received Intent with Action NOTIFY_USER_ACCOUNT_DEACTIVE");
                C4976bpz.this.d(context);
                C4976bpz.this.a();
            }
            if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_ACTIVE".equals(action)) {
                C4976bpz.this.a();
            }
        }
    };

    @Override // o.aMF
    public String agentName() {
        return "preapp";
    }

    public C4976bpz(InterfaceC1926aTj interfaceC1926aTj, UserAgent userAgent) {
        this.b = interfaceC1926aTj;
        this.g = userAgent;
    }

    @Override // o.aMF
    public Sessions getAgentLoadEventName() {
        return Sessions.PRE_APP_AGENT_LOADED;
    }

    @Override // o.aMF
    public void doInit() {
        this.d = new C4926bpB(getContext(), this);
        c();
        b();
        d();
        a();
        initCompleted(InterfaceC1078Nw.aJ);
    }

    @Override // o.aMF
    public void destroy() {
        e();
        h();
        i();
        super.destroy();
    }

    private void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.netflix.mediaclient.intent.action.PREAPP_AGENT_TO_ALL_MEMBER_UPDATED");
        LocalBroadcastManager.getInstance(getContext()).registerReceiver(this.c, intentFilter);
    }

    private void d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.netflix.mediaclient.intent.action.DEBUG_MINUSONE_CLEAR_TEMPLATE");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.DEBUG_MINUSONE_FORCE_TEMPLATE");
        ContextCompat.registerReceiver(getContext(), this.e, intentFilter, 4);
    }

    private void i() {
        try {
            getContext().unregisterReceiver(this.e);
        } catch (Exception e) {
            C1044Mm.a("nf_preappagent", "unregisterMinusoneDebugReeiver " + e);
        }
    }

    private void e() {
        try {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.c);
        } catch (Exception e) {
            C1044Mm.a("nf_preappagent", "unregisterDataUpdateReceiver " + e);
        }
    }

    private void b() {
        LocalBroadcastManager.getInstance(getContext()).registerReceiver(this.a, C5020bqq.b());
    }

    private void h() {
        try {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.a);
        } catch (Exception e) {
            C1044Mm.a("nf_preappagent", "unregisterUserAgentIntentReceiver " + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context) {
        this.d.a(PreAppAgentEventType.ACCOUNT_DEACTIVATED);
    }

    @Override // o.aMF
    public Status getTimeoutStatus() {
        return InterfaceC1078Nw.U;
    }

    @Override // o.aMF
    public StopReason getTimeoutStopReason() {
        return StopReason.INIT_TIMED_OUT_PREAPP;
    }

    @Override // o.aMF
    public StopReason getStopReasonForInitFailed() {
        return StopReason.INIT_FAILED_PREAPP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (!C8151dev.c() || C8151dev.d(getContext())) {
            return;
        }
        C4925bpA.b(getContext());
    }
}
