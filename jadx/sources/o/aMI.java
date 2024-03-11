package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.cl.model.SignOutReason;
import com.netflix.mediaclient.service.user.UserAgentImpl;

/* loaded from: classes.dex */
public class aMI extends BroadcastReceiver {
    private static final String e = "PartnerUserAgentBroadcastReceiver";
    private UserAgentImpl b;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str = e;
        C1044Mm.e(str, "on receive intent " + intent);
        if (this.b == null || !"com.netflix.mediaclient.intent.action.LOGOUT".equals(intent.getAction())) {
            return;
        }
        this.b.a(SignOutReason.partnerForced);
    }
}
