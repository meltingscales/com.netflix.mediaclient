package o;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouSettingsFragment;

@aIA
/* loaded from: classes4.dex */
public class cUH extends MO {
    public static final d b = new d(null);

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean canApplyBrowseExperience() {
        return true;
    }

    @Override // o.MO
    public int j() {
        return com.netflix.mediaclient.ui.R.i.Y;
    }

    @Override // o.MO
    public Fragment d() {
        return new DownloadedForYouSettingsFragment();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.downloadedForYouSetup;
    }

    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final Intent e(Context context) {
            C8632dsu.c((Object) context, "");
            return new Intent(context, cUH.class);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC5091bsH {
        e() {
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerReady(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) serviceManager, "");
            C8632dsu.c((Object) status, "");
            Fragment h = cUH.this.h();
            DownloadedForYouSettingsFragment downloadedForYouSettingsFragment = h instanceof DownloadedForYouSettingsFragment ? (DownloadedForYouSettingsFragment) h : null;
            if (downloadedForYouSettingsFragment != null) {
                downloadedForYouSettingsFragment.onManagerReady(serviceManager, status);
            }
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) status, "");
            Fragment h = cUH.this.h();
            DownloadedForYouSettingsFragment downloadedForYouSettingsFragment = h instanceof DownloadedForYouSettingsFragment ? (DownloadedForYouSettingsFragment) h : null;
            if (downloadedForYouSettingsFragment != null) {
                downloadedForYouSettingsFragment.onManagerUnavailable(serviceManager, status);
            }
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new e();
    }
}
