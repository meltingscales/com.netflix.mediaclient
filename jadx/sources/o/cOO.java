package o;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.profiles.languages.impl.ProfileLanguagesFragment;

/* loaded from: classes4.dex */
public class cOO extends MO {
    public static final c e = new c(null);

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
            super("ProfileLanguageActivity");
        }

        public final Class<? extends cOO> e() {
            return NetflixApplication.getInstance().M() ? cOM.class : cOO.class;
        }
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

    @Override // o.MO
    public Fragment d() {
        ProfileLanguagesFragment.d dVar = ProfileLanguagesFragment.b;
        Intent intent = getIntent();
        return dVar.c(intent != null ? intent.getExtras() : null);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
        Fragment h = h();
        NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
        if (netflixFrag == null || !netflixFrag.o()) {
            super.performUpAction();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC5091bsH {
        d() {
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerReady(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) serviceManager, "");
            C8632dsu.c((Object) status, "");
            Fragment h = cOO.this.h();
            NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
            if (netflixFrag != null) {
                netflixFrag.onManagerReady(serviceManager, status);
            }
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) status, "");
            Fragment h = cOO.this.h();
            NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
            if (netflixFrag != null) {
                netflixFrag.onManagerUnavailable(serviceManager, status);
            }
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new d();
    }
}
