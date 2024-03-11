package com.netflix.mediaclient.partner;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.NetflixApplication;
import o.C1044Mm;
import o.C1332Xp;
import o.C1809aPa;
import o.C5008bqe;
import o.C8157dfA;
import o.C8168dfL;

/* loaded from: classes6.dex */
public class PartnerInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C1044Mm.e("partnerInstallReceiver", "Received an action: " + intent.getAction());
        if ("com.netflix.mediaclient.partner.intent.action.POST_INSTALL_ACTION".equals(intent.getAction())) {
            C1044Mm.e("partnerInstallReceiver", "Install intent received");
            c(context, intent);
            return;
        }
        C1044Mm.e("partnerInstallReceiver", "Not supported!");
    }

    private void c(Context context, Intent intent) {
        if (intent.hasExtra("installToken")) {
            String stringExtra = intent.getStringExtra("installToken");
            C1044Mm.a("partnerInstallReceiver", "received install token %s", stringExtra);
            C8157dfA.a(context, "channelIdSource", "I");
            d(context, stringExtra);
            new C5008bqe(context, NetflixApplication.getInstance().h());
            return;
        }
        C1044Mm.e("partnerInstallReceiver", "no token present");
    }

    public static void d(Context context, String str) {
        if (C8168dfL.h(str)) {
            C8157dfA.a(context, "channelIdValue", str);
            C1044Mm.a("partnerInstallReceiver", "stored postload channelId : %s", str);
        }
        C8157dfA.d(context, "isPostLoaded", true);
        try {
            ((C1809aPa) C1332Xp.b(C1809aPa.class)).d();
        } catch (IllegalArgumentException unused) {
        }
    }

    public static String d(Context context) {
        return C8157dfA.e(context, "channelIdValue", "");
    }
}
