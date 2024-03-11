package com.netflix.mediaclient.service.pushnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import o.aMH;

/* loaded from: classes4.dex */
public final class NotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        aMH.c().a(context, intent);
    }
}
