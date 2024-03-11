package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.android.activity.NetflixActivity;

@InterfaceC1639aIt
/* loaded from: classes4.dex */
public abstract class bZV extends NetflixActivity {
    private static final String ACTION_FINISH_ACCOUNT_ACTIVITIES = "com.netflix.mediaclient.ui.login.ACTION_FINISH_ACCOUNT_ACTIVITIES";
    public cQQ mUserAgentRepository;

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean allowTransitionAnimation() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean hasUpAction() {
        return false;
    }

    public boolean isLoadingData() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showMdxInMenu() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showSettingsInMenu() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showSignOutInMenu() {
        return false;
    }

    public static void finishAllAccountActivities(Context context) {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(ACTION_FINISH_ACCOUNT_ACTIVITIES));
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mUserAgentRepository = new cQQ();
        registerFinishReceiverLocallyWithAutoUnregister(ACTION_FINISH_ACCOUNT_ACTIVITIES);
    }
}
