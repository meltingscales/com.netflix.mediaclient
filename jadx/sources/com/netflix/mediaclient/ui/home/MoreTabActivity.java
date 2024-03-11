package com.netflix.mediaclient.ui.home;

import android.os.Bundle;
import android.view.Menu;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.android.widget.NetflixBottomNavBar;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;
import com.netflix.mediaclient.ui.more.MoreFragment;
import com.netflix.mediaclient.util.PlayContext;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.ActivityC3996bSj;
import o.C1044Mm;
import o.C6491ceM;
import o.C8153dex;
import o.InterfaceC5091bsH;
import o.InterfaceC6068cSu;
import o.MH;
import o.aIA;
import o.bDG;
import o.bRK;

@aIA
@AndroidEntryPoint
/* loaded from: classes4.dex */
public class MoreTabActivity extends bRK implements bDG {
    @Inject
    public InterfaceC6068cSu search;

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean canApplyBrowseExperience() {
        return true;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public int getActionBarParentViewId() {
        return R.g.aG;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean shouldUseFullscreenTheme() {
        return true;
    }

    public static Class c() {
        return NetflixApplication.getInstance().M() ? ActivityC3996bSj.class : MoreTabActivity.class;
    }

    @Override // o.MO
    public int j() {
        return MH.a();
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setFragmentHelper(new FragmentHelper(false, this, R.g.ga, null, bundle));
        if (canShowActionBar()) {
            return;
        }
        getNetflixActionBar().a(false);
    }

    @Override // o.MO
    public Fragment d() {
        return MoreFragment.e();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onCreateOptionsMenu(Menu menu, Menu menu2) {
        C6491ceM.c(this, menu);
        if (C8153dex.Q()) {
            return;
        }
        this.search.a(menu).setVisible(true);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.accountMenu;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new InterfaceC5091bsH() { // from class: com.netflix.mediaclient.ui.home.MoreTabActivity.5
            @Override // o.InterfaceC5091bsH
            public void onManagerReady(ServiceManager serviceManager, Status status) {
                ((MoreFragment) MoreTabActivity.this.h()).onManagerReady(serviceManager, status);
            }

            @Override // o.InterfaceC5091bsH
            public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
                C1044Mm.d("MoreTabActivity", "NetflixService is NOT available!");
                ((NetflixFrag) MoreTabActivity.this.h()).onManagerUnavailable(serviceManager, status);
            }
        };
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean hasBottomNavBar() {
        return C8153dex.B() && NetflixBottomNavBar.e();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean canShowActionBar() {
        return !hasBottomNavBar() || this.fragmentHelper.h();
    }

    @Override // o.bDG
    public PlayContext y_() {
        return this.fragmentHelper.h() ? this.fragmentHelper.d() : new EmptyPlayContext("MoreTabActivity", -490);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onConfigureActionBarState(NetflixActionBar.b.C0051b c0051b) {
        c0051b.i(false).k(true).h(false).g(false).f(false);
    }
}
