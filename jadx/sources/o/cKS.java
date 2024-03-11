package o;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import o.cKP;

/* loaded from: classes4.dex */
public class cKS extends MO {
    public static final b d = new b(null);

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showNoNetworkOverlayIfNeeded() {
        return true;
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("ProfileLockActivity");
        }

        public final Class<? extends cKS> d() {
            return NetflixApplication.getInstance().M() ? cKM.class : cKS.class;
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
        cKP.c cVar = cKP.b;
        Intent intent = getIntent();
        return cVar.e(intent != null ? intent.getExtras() : null);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
        Fragment h = h();
        NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
        if (netflixFrag == null || !netflixFrag.o()) {
            super.performUpAction();
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        if (k != null) {
            k.b(new e());
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends C5015bql {
        e() {
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
            Fragment h = cKS.this.h();
            NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
            if (netflixFrag != null) {
                netflixFrag.onManagerReady(serviceManager, status);
            }
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) status, "");
            Fragment h = cKS.this.h();
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
