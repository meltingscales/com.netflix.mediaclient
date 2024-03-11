package com.netflix.mediaclient.ui.notificationpermission.impl;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.notificationpermission.impl.NotificationPermissionImpl;
import com.netflix.mediaclient.ui.notificationpermission.impl.NotificationPermissionImpl$registerForPermissionResult$1;
import o.C7095cpj;
import o.C8632dsu;
import o.InterfaceC7089cpd;

/* loaded from: classes4.dex */
public final class NotificationPermissionImpl$registerForPermissionResult$1 implements DefaultLifecycleObserver {
    final /* synthetic */ NotificationPermissionImpl e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NotificationPermissionImpl$registerForPermissionResult$1(NotificationPermissionImpl notificationPermissionImpl) {
        this.e = notificationPermissionImpl;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner lifecycleOwner) {
        NetflixActivity netflixActivity;
        C8632dsu.c((Object) lifecycleOwner, "");
        NotificationPermissionImpl notificationPermissionImpl = this.e;
        netflixActivity = notificationPermissionImpl.j;
        ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
        final NotificationPermissionImpl notificationPermissionImpl2 = this.e;
        notificationPermissionImpl.i = netflixActivity.registerForActivityResult(requestPermission, new ActivityResultCallback() { // from class: o.cph
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                NotificationPermissionImpl$registerForPermissionResult$1.c(NotificationPermissionImpl.this, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(NotificationPermissionImpl notificationPermissionImpl, Boolean bool) {
        InterfaceC7089cpd interfaceC7089cpd;
        C8632dsu.c((Object) notificationPermissionImpl, "");
        C8632dsu.d(bool);
        if (bool.booleanValue()) {
            C7095cpj.d.d(CommandValue.AllowNotificationsCommand);
            interfaceC7089cpd = notificationPermissionImpl.h;
            interfaceC7089cpd.a(AppView.clientDrivenInterstitialView);
            return;
        }
        C7095cpj.d.d(CommandValue.DontAllowNotificationsCommand);
    }
}
