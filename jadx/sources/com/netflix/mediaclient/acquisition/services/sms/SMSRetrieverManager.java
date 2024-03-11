package com.netflix.mediaclient.acquisition.services.sms;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import androidx.core.content.pm.PackageInfoCompat;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.mediaclient.acquisition.api.sms.SMSRetriever;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_SmsOtpVersionCheck;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import kotlin.text.Regex;
import o.C1044Mm;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8678dum;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes3.dex */
public final class SMSRetrieverManager implements SMSRetriever {
    private static final String TAG = "SMSRetrieverManager";
    private final NetflixActivity activity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final NetflixActivity getActivity() {
        return this.activity;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    public SMSRetrieverManager(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        this.activity = netflixActivity;
    }

    public final boolean isEnabled(Field field) {
        try {
            long longVersionCode = PackageInfoCompat.getLongVersionCode(this.activity.getPackageManager().getPackageInfo("com.google.android.gms", 0));
            if (field != null) {
                return longVersionCode >= ((long) Config_FastProperty_SmsOtpVersionCheck.Companion.c());
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.netflix.mediaclient.acquisition.api.sms.SMSRetriever
    public void listenForSMS(drM<? super String, dpR> drm, drO<dpR> dro, drO<dpR> dro2) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) dro2, "");
        this.activity.registerReceiverWithAutoUnregister((BroadcastReceiver) new SMSBroadcastReceiver(drm, dro, dro2), new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), true);
        Task<Void> startSmsRetriever = SmsRetriever.getClient(this.activity).startSmsRetriever();
        final SMSRetrieverManager$listenForSMS$1 sMSRetrieverManager$listenForSMS$1 = new drM<Void, dpR>() { // from class: com.netflix.mediaclient.acquisition.services.sms.SMSRetrieverManager$listenForSMS$1
            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Void r1) {
                invoke2(r1);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Void r2) {
                C1044Mm.e("SMSRetrieverManager", "addOnSuccessListener");
            }
        };
        startSmsRetriever.addOnSuccessListener(new OnSuccessListener() { // from class: com.netflix.mediaclient.acquisition.services.sms.SMSRetrieverManager$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                SMSRetrieverManager.listenForSMS$lambda$0(drM.this, obj);
            }
        });
        startSmsRetriever.addOnFailureListener(new OnFailureListener() { // from class: com.netflix.mediaclient.acquisition.services.sms.SMSRetrieverManager$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                SMSRetrieverManager.listenForSMS$lambda$1(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listenForSMS$lambda$0(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listenForSMS$lambda$1(Exception exc) {
        C8632dsu.c((Object) exc, "");
        C1044Mm.e(TAG, "addOnFailureListener");
    }

    @Override // com.netflix.mediaclient.acquisition.api.sms.SMSRetriever
    public String extractOTPFromSMS(String str) {
        C8632dsu.c((Object) str, "");
        InterfaceC8678dum a = Regex.a(new Regex("[0-9]{4,}"), str, 0, 2, null);
        if (a != null) {
            return a.c();
        }
        return null;
    }

    @Module
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes3.dex */
    public static final class SMSRetrieverModule {
        public static final int $stable = 0;

        @Provides
        public final SMSRetriever providesSMSRetriever(Activity activity) {
            C8632dsu.c((Object) activity, "");
            return new SMSRetrieverManager((NetflixActivity) activity);
        }
    }
}
