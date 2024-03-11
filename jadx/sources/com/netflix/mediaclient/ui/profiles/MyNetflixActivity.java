package com.netflix.mediaclient.ui.profiles;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.widget.NetflixBottomNavBar;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;
import com.netflix.mediaclient.util.PlayContext;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.C1045Mp;
import o.C6491ceM;
import o.C8627dsp;
import o.C8632dsu;
import o.C9936zQ;
import o.InterfaceC3993bSg;
import o.InterfaceC7084cpY;
import o.MH;
import o.aIA;
import o.bDG;
import o.bRZ;
import o.cLO;
import o.cML;
import org.chromium.net.NetError;

@aIA
@AndroidEntryPoint
/* loaded from: classes4.dex */
public class MyNetflixActivity extends cLO implements bDG {
    public static final d d = new d(null);
    public static final int e = 8;
    @Inject
    public InterfaceC3993bSg home;
    @Inject
    public InterfaceC7084cpY notificationsUi;

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean canApplyBrowseExperience() {
        return true;
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MyNetflixActivity");
        }

        public final Intent d(Context context) {
            C8632dsu.c((Object) context, "");
            Intent e = e(context);
            e.putExtra("showDownloads", true);
            return e;
        }

        public final Intent e(Context context) {
            C8632dsu.c((Object) context, "");
            return new Intent(context, NetflixApplication.getInstance().M() ? cML.class : MyNetflixActivity.class);
        }
    }

    public final InterfaceC7084cpY m() {
        InterfaceC7084cpY interfaceC7084cpY = this.notificationsUi;
        if (interfaceC7084cpY != null) {
            return interfaceC7084cpY;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC3993bSg c() {
        InterfaceC3993bSg interfaceC3993bSg = this.home;
        if (interfaceC3993bSg != null) {
            return interfaceC3993bSg;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentHelper fragmentHelper = new FragmentHelper(false, this, MH.c(), null, bundle);
        fragmentHelper.b(this.offlineApi.b(fragmentHelper));
        fragmentHelper.b(m().b(fragmentHelper));
        setFragmentHelper(fragmentHelper);
        if (getIntent().getBooleanExtra("showDownloads", false)) {
            startActivity(this.offlineApi.e(this));
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.myProfileView;
    }

    @Override // o.MO
    public Fragment d() {
        return c().a();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean hasBottomNavBar() {
        return NetflixBottomNavBar.e();
    }

    @Override // o.MO
    public int j() {
        return MH.a();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onCreateOptionsMenu(Menu menu, Menu menu2) {
        C8632dsu.c((Object) menu, "");
        C6491ceM.c(this, menu);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void bottomTabReselected(C9936zQ c9936zQ) {
        C8632dsu.c((Object) c9936zQ, "");
        if (this.fragmentHelper.c() == null) {
            Fragment h = h();
            if (h instanceof bRZ) {
                ((bRZ) h).a(false);
                return;
            }
            return;
        }
        super.bottomTabReselected(c9936zQ);
    }

    @Override // o.bDG
    public PlayContext y_() {
        if (this.fragmentHelper.h()) {
            PlayContext d2 = this.fragmentHelper.d();
            C8632dsu.d(d2);
            return d2;
        }
        return new EmptyPlayContext(d.getLogTag(), NetError.ERR_FTP_SYNTAX_ERROR);
    }
}
