package o;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.ui.launch.LaunchActivity;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
/* renamed from: o.bZh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC4183bZh extends bYW {
    @Override // com.netflix.mediaclient.ui.launch.LaunchActivity
    public boolean d() {
        return false;
    }

    @Override // com.netflix.mediaclient.ui.launch.LaunchActivity
    public boolean h() {
        return true;
    }

    public static Intent c(Context context, AppView appView, boolean z, boolean z2) {
        return d(context, appView, z).putExtra("is_profile_activation", true).putExtra("force_new_lolomo", z2);
    }

    public static Intent d(Context context, AppView appView) {
        return d(context, appView, false);
    }

    private static Intent d(Context context, AppView appView, boolean z) {
        Intent putExtra = new Intent(context, k()).putExtra("is_cold_start", z);
        if (appView != null) {
            putExtra.putExtra("navigation_source", appView.name());
        }
        return putExtra;
    }

    private static Class<?> k() {
        return NetflixApplication.getInstance().M() ? ActivityC4186bZk.class : ActivityC4183bZh.class;
    }

    @Override // com.netflix.mediaclient.ui.launch.LaunchActivity
    public boolean i() {
        return !getIntent().getBooleanExtra("is_profile_activation", false);
    }

    public boolean l() {
        return getIntent().getBooleanExtra("is_cold_start", false);
    }

    public boolean m() {
        return getIntent().getBooleanExtra("force_new_lolomo", false);
    }

    public AppView j() {
        if (getIntent().hasExtra("navigation_source")) {
            return AppView.valueOf(getIntent().getStringExtra("navigation_source"));
        }
        return AppView.UNKNOWN;
    }

    @Override // com.netflix.mediaclient.ui.launch.LaunchActivity
    public void f() {
        setContentView(com.netflix.mediaclient.ui.R.i.aq);
        if (((LaunchActivity) this).profileApi.g().a((ViewGroup) findViewById(com.netflix.mediaclient.ui.R.g.fU), false) == null) {
            findViewById(com.netflix.mediaclient.ui.R.g.dk).setVisibility(0);
        }
    }
}
