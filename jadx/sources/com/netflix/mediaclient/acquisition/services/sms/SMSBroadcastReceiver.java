package com.netflix.mediaclient.acquisition.services.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import o.C1044Mm;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes3.dex */
public final class SMSBroadcastReceiver extends BroadcastReceiver {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SMSBroadcastReceiver";
    private final drO<dpR> onError;
    private final drM<String, dpR> onSuccess;
    private final drO<dpR> onTimeout;

    public final drO<dpR> getOnError() {
        return this.onError;
    }

    public final drM<String, dpR> getOnSuccess() {
        return this.onSuccess;
    }

    public final drO<dpR> getOnTimeout() {
        return this.onTimeout;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SMSBroadcastReceiver(drM<? super String, dpR> drm, drO<dpR> dro, drO<dpR> dro2) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) dro2, "");
        this.onSuccess = drm;
        this.onTimeout = dro;
        this.onError = dro2;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) intent, "");
        if (C8632dsu.c((Object) "com.google.android.gms.auth.api.phone.SMS_RETRIEVED", (Object) intent.getAction())) {
            Bundle extras = intent.getExtras();
            Object obj = extras != null ? extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS") : null;
            Status status = obj instanceof Status ? (Status) obj : null;
            if (status != null) {
                int statusCode = status.getStatusCode();
                if (statusCode == 0) {
                    C1044Mm.e(TAG, "onSuccess");
                    this.onSuccess.invoke(extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE"));
                } else if (statusCode == 15) {
                    C1044Mm.e(TAG, "onTimeout");
                    this.onTimeout.invoke();
                } else {
                    C1044Mm.e(TAG, "onError");
                    this.onError.invoke();
                }
            }
        }
    }
}
