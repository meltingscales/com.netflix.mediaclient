package com.netflix.mediaclient.ui.notifications;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.servicemgr.interface_.NotificationTypes;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;
import com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationsActivity;
import com.netflix.model.leafs.social.UserNotificationLandingTrackingInfo;
import com.netflix.model.leafs.social.multititle.NotificationLandingPage;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.HashMap;
import o.AbstractC7065cpF;
import o.C7080cpU;
import o.C7082cpW;
import o.C7085cpZ;
import o.C7132cqT;
import o.C7138cqZ;
import o.C7140cqb;
import o.C8632dsu;
import o.InterfaceC5300bwE;
import o.InterfaceC5345bwx;
import o.InterfaceC7084cpY;
import o.InterfaceC7141cqc;

/* loaded from: classes4.dex */
public final class NotificationsUiImpl implements InterfaceC7084cpY {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface NotificationsUiModule {
        @Binds
        InterfaceC7084cpY b(NotificationsUiImpl notificationsUiImpl);
    }

    @Override // o.InterfaceC7084cpY
    public void e(Context context, Intent intent) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) intent, "");
        AbstractC7065cpF.c(context, intent);
    }

    @Override // o.InterfaceC7084cpY
    public boolean e(Intent intent) {
        C8632dsu.c((Object) intent, "");
        return AbstractC7065cpF.b(intent);
    }

    @Override // o.InterfaceC7084cpY
    public InterfaceC7141cqc e() {
        return new C7082cpW();
    }

    @Override // o.InterfaceC7084cpY
    public InterfaceC5345bwx b(Object obj) {
        C8632dsu.c(obj, "");
        FragmentHelper fragmentHelper = (FragmentHelper) obj;
        C7080cpU c7080cpU = new C7080cpU(fragmentHelper);
        fragmentHelper.b(c7080cpU);
        return c7080cpU;
    }

    @Override // o.InterfaceC7084cpY
    public InterfaceC5300bwE d() {
        return new C7140cqb();
    }

    @Override // o.InterfaceC7084cpY
    public void a() {
        C7085cpZ.d(NotificationTypes.NEW_SEASON_ALERT, new C7138cqZ());
        C7085cpZ.d(NotificationTypes.MULTI_TITLE_ALERT, new C7132cqT());
    }

    @Override // o.InterfaceC7084cpY
    public Class<?> c() {
        Class<?> o2 = NotificationsActivity.o();
        C8632dsu.a(o2, "");
        return o2;
    }

    @Override // o.InterfaceC7084cpY
    public Intent a(Context context) {
        C8632dsu.c((Object) context, "");
        Intent e = NotificationsActivity.e(context);
        C8632dsu.a(e, "");
        return e;
    }

    @Override // o.InterfaceC7084cpY
    public Intent b(Context context, NotificationLandingPage notificationLandingPage, UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo, HashMap<String, String> hashMap) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) notificationLandingPage, "");
        return MultiTitleNotificationsActivity.d.b(context, notificationLandingPage, userNotificationLandingTrackingInfo, hashMap, true);
    }

    @Override // o.InterfaceC7084cpY
    public void d(Activity activity) {
        C8632dsu.c((Object) activity, "");
        if (activity instanceof MultiTitleNotificationsActivity) {
            ((MultiTitleNotificationsActivity) activity).p();
        }
    }
}
