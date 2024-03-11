package com.netflix.mediaclient.ui.games.impl.games;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixBottomNavBar;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.ActivityC3907bPb;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC3993bSg;
import o.MH;
import o.aIA;
import o.bOX;

@aIA
@AndroidEntryPoint
/* loaded from: classes4.dex */
public class GamesLolomoActivity extends bOX {
    public static final c a = new c(null);
    @Inject
    public InterfaceC3993bSg home;

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean hasProfileAvatarInActionBar() {
        return true;
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("GamesLolomoActivity");
        }

        public final Intent d(Context context) {
            C8632dsu.c((Object) context, "");
            return new Intent(context, d());
        }

        public final Class<? extends NetflixActivity> d() {
            return NetflixApplication.getInstance().M() ? ActivityC3907bPb.class : GamesLolomoActivity.class;
        }
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setFragmentHelper(new FragmentHelper(false, this, MH.c(), null, bundle));
    }

    public final InterfaceC3993bSg c() {
        InterfaceC3993bSg interfaceC3993bSg = this.home;
        if (interfaceC3993bSg != null) {
            return interfaceC3993bSg;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.browseGames;
    }

    @Override // o.MO
    public Fragment d() {
        return c().e("games");
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean hasBottomNavBar() {
        return NetflixBottomNavBar.e();
    }

    @Override // o.MO
    public int j() {
        return MH.a();
    }
}
