package com.netflix.mediaclient.ui.notifications;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.service.pushnotification.MessageData;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.AbstractActivityC7062cpC;
import o.ActivityC7083cpX;
import o.C1044Mm;
import o.C6491ceM;
import o.C8153dex;
import o.C8194dfl;
import o.InterfaceC5091bsH;
import o.InterfaceC6068cSu;
import o.aIA;

@aIA
@AndroidEntryPoint
/* loaded from: classes4.dex */
public class NotificationsActivity extends AbstractActivityC7062cpC {
    private static final String a = "NotificationsActivity";
    private boolean c;
    private boolean e;
    @Inject
    public InterfaceC6068cSu search;

    @Override // o.MO
    public boolean i() {
        return true;
    }

    @Override // o.MO
    public int j() {
        return R.i.ah;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showSettingsInMenu() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showSignOutInMenu() {
        return false;
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.e = bundle.getBoolean("notification_beacon_sent");
        }
    }

    public static Class<?> o() {
        return NetflixApplication.getInstance().M() ? ActivityC7083cpX.class : NotificationsActivity.class;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        C1044Mm.b(a, "onNewIntent: ", intent);
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("notification_beacon_sent", this.e);
        super.onSaveInstanceState(bundle);
    }

    @Override // o.MO
    public Fragment d() {
        return new NotificationsFrag();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new InterfaceC5091bsH() { // from class: com.netflix.mediaclient.ui.notifications.NotificationsActivity.1
            @Override // o.InterfaceC5091bsH
            public void onManagerReady(ServiceManager serviceManager, Status status) {
                C1044Mm.e(NotificationsActivity.a, "Manager is here!");
                ((InterfaceC5091bsH) NotificationsActivity.this.h()).onManagerReady(serviceManager, status);
                NotificationsActivity.this.c = true;
                if (NotificationsActivity.this.e) {
                    return;
                }
                NotificationsActivity.this.e = true;
                C8194dfl.a(NotificationsActivity.this.getIntent());
            }

            @Override // o.InterfaceC5091bsH
            public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
                C1044Mm.e(NotificationsActivity.a, "Manager isn't available!");
                ((InterfaceC5091bsH) NotificationsActivity.this.h()).onManagerUnavailable(serviceManager, status);
            }
        };
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.notificationSelector;
    }

    @Override // o.MO, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return this.c && h() != null && ((NetflixFrag) h()).isLoadingData();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onCreateOptionsMenu(Menu menu, Menu menu2) {
        C6491ceM.c(this, menu);
        if (C8153dex.Q()) {
            return;
        }
        this.search.a(menu).setVisible(true);
    }

    public static Intent b(MessageData messageData) {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.NOTIFICATION_IRIS");
        MessageData.addMessageDataToIntent(intent, messageData);
        return intent;
    }

    public static Intent e(Context context) {
        return new Intent(context, o());
    }
}
