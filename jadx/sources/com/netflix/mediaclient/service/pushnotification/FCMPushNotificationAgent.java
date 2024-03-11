package com.netflix.mediaclient.service.pushnotification;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.user.UserAgent;
import o.C1044Mm;
import o.C8150deu;
import o.InterfaceC1078Nw;
import o.InterfaceC1912aSw;
import o.InterfaceC3856bNe;
import o.InterfaceC3857bNf;

/* loaded from: classes4.dex */
public class FCMPushNotificationAgent extends PushNotificationAgent {
    private static final String TAG = "nf_push";
    private CloudPushSupport mCloudPushSupport;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum CloudPushSupport {
        NOT_SUPPORTED,
        SUPPORTED,
        UNKNOWN
    }

    @Override // o.aMF
    public String agentName() {
        return "fcmPush";
    }

    public FCMPushNotificationAgent(Context context, UserAgent userAgent, InterfaceC3857bNf interfaceC3857bNf, InterfaceC3856bNe interfaceC3856bNe) {
        super(context, userAgent, interfaceC3857bNf, interfaceC3856bNe);
        this.mCloudPushSupport = CloudPushSupport.UNKNOWN;
    }

    @Override // o.aMF
    public Sessions getAgentLoadEventName() {
        return Sessions.FCM_PUSH_NOTIFICATION_AGENT_LOADED;
    }

    @Override // com.netflix.mediaclient.service.pushnotification.PushNotificationAgent, o.aMF
    public void doInit() {
        super.doInit();
        verifyFCM();
        doFcmRegistration();
        initCompleted(InterfaceC1078Nw.aJ);
    }

    @Override // com.netflix.mediaclient.service.pushnotification.PushNotificationAgent, o.aMF
    public void destroy() {
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.service.pushnotification.FCMPushNotificationAgent$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$netflix$mediaclient$service$pushnotification$FCMPushNotificationAgent$CloudPushSupport;

        static {
            int[] iArr = new int[CloudPushSupport.values().length];
            $SwitchMap$com$netflix$mediaclient$service$pushnotification$FCMPushNotificationAgent$CloudPushSupport = iArr;
            try {
                iArr[CloudPushSupport.SUPPORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$netflix$mediaclient$service$pushnotification$FCMPushNotificationAgent$CloudPushSupport[CloudPushSupport.NOT_SUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$netflix$mediaclient$service$pushnotification$FCMPushNotificationAgent$CloudPushSupport[CloudPushSupport.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.netflix.mediaclient.service.pushnotification.PushNotificationAgent
    public boolean isPushSupported() {
        int i = AnonymousClass1.$SwitchMap$com$netflix$mediaclient$service$pushnotification$FCMPushNotificationAgent$CloudPushSupport[this.mCloudPushSupport.ordinal()];
        if (i != 1) {
            if (i != 2) {
                verifyFCM();
                return this.mCloudPushSupport == CloudPushSupport.SUPPORTED;
            }
            return false;
        }
        return true;
    }

    public void verifyFCM() {
        Context context;
        if (this.mCloudPushSupport == CloudPushSupport.UNKNOWN && (context = this.mContext) != null) {
            updateCloudSupportInfo(C8150deu.a(context));
            C1044Mm.a(TAG, "Device supports FCM: %s", this.mCloudPushSupport);
        }
    }

    private void updateCloudSupportInfo(boolean z) {
        this.mCloudPushSupport = z ? CloudPushSupport.SUPPORTED : CloudPushSupport.NOT_SUPPORTED;
    }

    private void doFcmRegistration() {
        if (!isPushSupported()) {
            C1044Mm.d(TAG, "device does NOT support FCM!");
        } else {
            FirebaseInstanceId.getInstance().getInstanceId().addOnSuccessListener(new OnSuccessListener() { // from class: com.netflix.mediaclient.service.pushnotification.FCMPushNotificationAgent$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    FCMPushNotificationAgent.this.lambda$doFcmRegistration$0((InstanceIdResult) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doFcmRegistration$0(InstanceIdResult instanceIdResult) {
        String token = instanceIdResult.getToken();
        this.registrationId = token;
        C1044Mm.a(TAG, "device supports FCM token: %s", token);
    }

    private void onFcmRegistration(String str) {
        this.registrationId = str;
        report(this.mCurrentUserSettings.optedIn, AppView.login);
        alertListeners(str);
    }

    @Override // o.InterfaceC5134bsy
    public boolean handleCommand(Intent intent, InterfaceC1912aSw interfaceC1912aSw) {
        if (intent == null) {
            C1044Mm.j(TAG, "Intent is null");
            return false;
        } else if ("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_ONREGISTERED".equals(intent.getAction())) {
            C1044Mm.e(TAG, "Handle registration");
            onFcmRegistration(intent.getStringExtra("reg_id"));
            return true;
        } else if ("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_ONMESSAGE".equals(intent.getAction())) {
            C1044Mm.e(TAG, "Handle message");
            onMessage(intent, interfaceC1912aSw);
            return true;
        } else if ("com.netflix.mediaclient.intent.action.NOTIFICATION_CANCELED".equals(intent.getAction())) {
            C1044Mm.e(TAG, "Handle notification canceled");
            onNotificationCanceled(intent);
            return true;
        } else if ("com.netflix.mediaclient.intent.action.NOTIFICATION_BROWSER_REDIRECT".equals(intent.getAction())) {
            C1044Mm.e(TAG, "Handle notification browser redirect");
            onNotificationBrowserRedirect(intent);
            return true;
        } else {
            C1044Mm.d(TAG, "Unknown command!");
            return false;
        }
    }
}
