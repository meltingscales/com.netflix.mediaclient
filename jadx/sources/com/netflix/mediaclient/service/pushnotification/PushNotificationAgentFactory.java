package com.netflix.mediaclient.service.pushnotification;

import android.content.Context;
import com.netflix.mediaclient.service.user.UserAgent;
import o.C1044Mm;
import o.C8151dev;
import o.InterfaceC3856bNe;
import o.InterfaceC3857bNf;
import o.aOV;

/* loaded from: classes.dex */
public class PushNotificationAgentFactory {
    private static final String ADM_IMPL = "com.netflix.mediaclient.service.pushnotification.ADMPushNotificationAgent";
    private static final String TAG = "NetflixService_PushNotificationAgentFactory";

    private PushNotificationAgentFactory() {
    }

    public static PushNotificationAgent createPushNotificationAgent(Context context, aOV aov, UserAgent userAgent, InterfaceC3857bNf interfaceC3857bNf, InterfaceC3856bNe interfaceC3856bNe) {
        if (C8151dev.c()) {
            if (!aov.ay()) {
                C1044Mm.e(TAG, "Running on Amazon device and not disabled, try to load ");
                try {
                    Object newInstance = Class.forName(ADM_IMPL).getConstructor(Context.class, UserAgent.class).newInstance(context, userAgent);
                    if (newInstance instanceof PushNotificationAgent) {
                        return (PushNotificationAgent) newInstance;
                    }
                } catch (Exception e) {
                    C1044Mm.b(TAG, e, "Could not successfully create ADMPushNotificationAgent instance", new Object[0]);
                }
            } else {
                C1044Mm.j(TAG, "Running on Amazon device, but ADM is disabled");
            }
            return null;
        }
        C1044Mm.e(TAG, "Running on Android device, return FCM implementation");
        return new FCMPushNotificationAgent(context, userAgent, interfaceC3857bNf, interfaceC3856bNe);
    }
}
