package o;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.settings.PlaybackSpecificationFragment;

@aIA
/* loaded from: classes4.dex */
public class cUP extends MO {
    public static final c a = new c(null);

    public static final Intent b(Context context) {
        return a.a(context);
    }

    @Override // o.MO
    public boolean g() {
        return true;
    }

    @Override // o.MO
    public int j() {
        return com.netflix.mediaclient.ui.R.i.Y;
    }

    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final Intent a(Context context) {
            C8632dsu.c((Object) context, "");
            return NetflixApplication.getInstance().M() ? new Intent(context, cUQ.class) : new Intent(context, cUP.class);
        }
    }

    @Override // o.MO
    public Fragment d() {
        return new PlaybackSpecificationFragment();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.diagnosticsPlaybackSpecification;
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC5091bsH {
        b() {
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerReady(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) serviceManager, "");
            C8632dsu.c((Object) status, "");
            Fragment h = cUP.this.h();
            C8632dsu.d(h);
            ((PlaybackSpecificationFragment) h).onManagerReady(serviceManager, status);
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) status, "");
            Fragment h = cUP.this.h();
            C8632dsu.d(h);
            ((PlaybackSpecificationFragment) h).onManagerUnavailable(serviceManager, status);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new b();
    }
}
