package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.profiles.AddProfileFragment;
import com.netflix.mediaclient.ui.profiles.ProfileCreator;
import com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment;

@InterfaceC1631aIl
/* loaded from: classes4.dex */
public class cMX extends MO {
    public static final c c = new c(null);

    public static final Intent b(Context context, String str) {
        return c.d(context, str);
    }

    @Override // o.MO, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showNoNetworkOverlayIfNeeded() {
        return true;
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("ProfileDetailsActivity");
        }

        public final Intent d(Context context, String str) {
            boolean g;
            C8632dsu.c((Object) context, "");
            Intent intent = new Intent(context, a());
            if (str != null) {
                g = C8691duz.g(str);
                if (!g) {
                    intent.putExtra("extra_profile_id", str);
                }
            }
            return intent;
        }

        public final Intent a(Context context, ProfileCreator.AgeSetting ageSetting) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) ageSetting, "");
            Intent intent = new Intent(context, a());
            intent.putExtra("extra_new_profile_age_setting", ageSetting.ordinal());
            return intent;
        }

        public final Class<? extends cMX> a() {
            return NetflixApplication.getInstance().M() ? cMN.class : cMX.class;
        }
    }

    @Override // o.MO
    public Fragment d() {
        Fragment profileDetailsFragment;
        if (c()) {
            profileDetailsFragment = new AddProfileFragment();
            Intent intent = getIntent();
            profileDetailsFragment.setArguments(intent != null ? intent.getExtras() : null);
        } else {
            profileDetailsFragment = new ProfileDetailsFragment();
            Intent intent2 = getIntent();
            profileDetailsFragment.setArguments(intent2 != null ? intent2.getExtras() : null);
        }
        return profileDetailsFragment;
    }

    private final boolean c() {
        Bundle extras;
        Intent intent = getIntent();
        return ((intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("extra_profile_id")) == null;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        Fragment h = h();
        NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
        if (netflixFrag != null) {
            return netflixFrag.bh_();
        }
        return null;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, android.app.Activity
    public void finish() {
        if (getIntent().hasExtra("EXTRA_ORIGINAL_ICONS_DEEPLINK")) {
            AppView uiScreen = getUiScreen();
            if (uiScreen == null) {
                uiScreen = AppView.editProfile;
            }
            startActivity(HomeActivity.b((Context) this, uiScreen, false));
        }
        super.finish();
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC5091bsH {
        b() {
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerReady(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) serviceManager, "");
            C8632dsu.c((Object) status, "");
            Fragment h = cMX.this.h();
            NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
            if (netflixFrag != null) {
                netflixFrag.onManagerReady(serviceManager, status);
            }
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) status, "");
            Fragment h = cMX.this.h();
            NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
            if (netflixFrag != null) {
                netflixFrag.onManagerUnavailable(serviceManager, status);
            }
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new b();
    }
}
