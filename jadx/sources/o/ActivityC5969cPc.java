package o;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import o.C5972cPf;

/* renamed from: o.cPc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ActivityC5969cPc extends MO {
    public static final d c = new d(null);

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showNoNetworkOverlayIfNeeded() {
        return true;
    }

    /* renamed from: o.cPc$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("ProfileSubtitleAppearanceActivity");
        }

        public final Class<? extends ActivityC5969cPc> e() {
            return NetflixApplication.getInstance().M() ? cOZ.class : ActivityC5969cPc.class;
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
        C5972cPf.d dVar = C5972cPf.b;
        Intent intent = getIntent();
        return dVar.a(intent != null ? intent.getExtras() : null);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
        Fragment h = h();
        NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
        if (netflixFrag == null || !netflixFrag.o()) {
            super.performUpAction();
        }
    }

    /* renamed from: o.cPc$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC5091bsH {
        e() {
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerReady(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) serviceManager, "");
            C8632dsu.c((Object) status, "");
            Fragment h = ActivityC5969cPc.this.h();
            NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
            if (netflixFrag != null) {
                netflixFrag.onManagerReady(serviceManager, status);
            }
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) status, "");
            Fragment h = ActivityC5969cPc.this.h();
            NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
            if (netflixFrag != null) {
                netflixFrag.onManagerUnavailable(serviceManager, status);
            }
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new e();
    }
}
