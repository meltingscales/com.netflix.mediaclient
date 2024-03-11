package com.netflix.mediaclient.service.user;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import o.C1044Mm;
import o.C8157dfA;

/* loaded from: classes4.dex */
public final class PartnerReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("com.netflix.mediaclient.intent.action.USER_STATUS".equals(intent.getAction())) {
            e(context, intent);
            return;
        }
        C1044Mm.j("nf_receiver", "Received Unintented action : " + intent.getAction());
    }

    private void e(Context context, Intent intent) {
        C1044Mm.e("nf_receiver", "Received user status request");
        d(context, C8157dfA.b(context, "nf_user_status_loggedin", false));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Context context, boolean z) {
        C1044Mm.e("nf_receiver", "broadcastUserStatus");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.USER_STATUS_RESPONSE");
        intent.putExtra("loggedIn", z);
        context.sendBroadcast(intent);
    }
}
