package com.netflix.mediaclient.service.pushnotification;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.PushNotificationIgnored;
import com.netflix.mediaclient.service.user.UserAgent;
import o.AbstractApplicationC1040Mh;
import o.C1044Mm;
import o.C1332Xp;
import o.C8168dfL;
import o.InterfaceC1912aSw;
import o.InterfaceC5283bvo;
import o.InterfaceC5300bwE;
import o.InterfaceC9638uF;

/* loaded from: classes4.dex */
public final class NotificationFactory {
    public static final String DATA = "data";
    private static final String TAG = "nf_push_notificationFactory";

    private NotificationFactory() {
    }

    public static void createNotification(Context context, Payload payload, InterfaceC9638uF interfaceC9638uF, int i, UserAgent userAgent) {
        InterfaceC5283bvo j = userAgent.j();
        boolean v = userAgent.v();
        boolean z = userAgent.v() && userAgent.u();
        if (C8168dfL.h(payload.profileGuid) && v && !z && j != null) {
            String profileGuid = j.getProfileGuid();
            if (!C8168dfL.d(profileGuid, payload.profileGuid)) {
                C1044Mm.e(TAG, String.format("drop push event - currentProfile :%s != profileGuid:%s", profileGuid, payload.profileGuid));
                return;
            }
        } else {
            C1044Mm.j(TAG, "processing message ");
        }
        if (AbstractApplicationC1040Mh.e()) {
            C1044Mm.a(TAG, "App is active - don't send a notification to Android status bar");
            Logger.INSTANCE.logEvent(new PushNotificationIgnored(Long.valueOf(SystemClock.currentThreadTimeMillis()), new PushNotificationTrackingInfo(payload)));
            return;
        }
        ((InterfaceC5300bwE) C1332Xp.b(InterfaceC5300bwE.class)).c(context, payload, interfaceC9638uF, i);
    }

    public static boolean handleSocialAction(InterfaceC1912aSw interfaceC1912aSw, InterfaceC5283bvo interfaceC5283bvo, Payload payload, Intent intent) {
        if (Payload.DEFAULT_SOCIAL_ACTION.equals(payload.defaultActionKey)) {
            if (interfaceC5283bvo == null) {
                return true;
            }
            interfaceC1912aSw.e(true, true, false, MessageData.createInstance(intent));
            return true;
        }
        return false;
    }
}
