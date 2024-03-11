package o;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import o.bQD;

/* renamed from: o.bQx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ActivityC3956bQx extends MO {
    public static final c e = new c(null);

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showNoNetworkOverlayIfNeeded() {
        return true;
    }

    /* renamed from: o.bQx$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("IdentityActivity");
        }

        public final Class<? extends ActivityC3956bQx> b() {
            return NetflixApplication.getInstance().M() ? bQE.class : ActivityC3956bQx.class;
        }

        public final Intent d(Context context) {
            C8632dsu.c((Object) context, "");
            return new Intent(context, b());
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
        bQD.d dVar = bQD.e;
        Intent intent = getIntent();
        return dVar.e(intent != null ? intent.getExtras() : null);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
        Fragment h = h();
        NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
        if (netflixFrag == null || !netflixFrag.o()) {
            super.performUpAction();
        }
    }

    /* renamed from: o.bQx$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC5091bsH {
        d() {
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerReady(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) serviceManager, "");
            C8632dsu.c((Object) status, "");
            Fragment h = ActivityC3956bQx.this.h();
            NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
            if (netflixFrag != null) {
                netflixFrag.onManagerReady(serviceManager, status);
            }
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) status, "");
            Fragment h = ActivityC3956bQx.this.h();
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
