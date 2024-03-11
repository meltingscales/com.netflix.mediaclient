package com.netflix.mediaclient;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.partner.PartnerInstallReceiver;
import o.C1044Mm;
import o.C5008bqe;
import o.C8117deN;
import o.C8157dfA;
import o.C8168dfL;

/* loaded from: classes5.dex */
public class InstallReferrerReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("com.android.vending.INSTALL_REFERRER".equals(intent.getAction())) {
            C1044Mm.e("nf_install", "Installation intent received");
            C1044Mm.c("nf_install", intent);
            e(context, intent);
            c(context, intent);
            return;
        }
        C1044Mm.d("nf_install", "Unexpected intent received");
        C1044Mm.c("nf_install", intent);
    }

    private void c(Context context, Intent intent) {
        String d = C8117deN.d(intent);
        if (C8168dfL.h(d)) {
            C1044Mm.e("nf_install", "got channelId: " + d);
            b(context, d);
        }
        String b = C8117deN.b(intent);
        if (C8168dfL.h(d) || C8168dfL.h(b)) {
            new C5008bqe(context, NetflixApplication.getInstance().h());
        }
    }

    protected static void b(Context context, String str) {
        if (!C8168dfL.g(str) && C8168dfL.g(PartnerInstallReceiver.d(context))) {
            PartnerInstallReceiver.d(context, str);
        }
    }

    private void e(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String e = C8117deN.e(intent);
        String e2 = C8157dfA.e(context, "preference_install_referrer_log", "");
        if (C8168dfL.h(e2) || C8168dfL.g(e)) {
            C1044Mm.e("nf_install", "Ignoring the install referrer since previous value still exists or toPref is null.  inPref: %s, toPref: %s", e2, e);
            return;
        }
        C1044Mm.a("nf_install", "storing install referrer %s", e);
        C8157dfA.a(context, "preference_install_referrer_log", e);
    }
}
