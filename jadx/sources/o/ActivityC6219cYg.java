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
import o.C6218cYf;

@aIA
/* renamed from: o.cYg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class ActivityC6219cYg extends MO {
    public static final d d = new d(null);

    @Override // o.MO, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    /* renamed from: o.cYg$d */
    /* loaded from: classes5.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("PlanSelectActivity");
        }

        public final Intent a(Context context, String str) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) str, "");
            Intent putExtra = new Intent(context, b()).putExtra("EXTRA_MESSAGE_CTA_PARAMS", str);
            C8632dsu.a(putExtra, "");
            return putExtra;
        }

        private final Class<? extends ActivityC6219cYg> b() {
            return NetflixApplication.getInstance().M() ? ActivityC6231cYs.class : ActivityC6219cYg.class;
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.planSelection;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.MO
    /* renamed from: c */
    public NetflixFrag d() {
        Bundle extras;
        C6218cYf.d dVar = C6218cYf.k;
        Intent intent = getIntent();
        return dVar.a((intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("EXTRA_MESSAGE_CTA_PARAMS"));
    }

    /* renamed from: o.cYg$e */
    /* loaded from: classes5.dex */
    public static final class e implements InterfaceC5091bsH {
        @Override // o.InterfaceC5091bsH
        public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) status, "");
        }

        e() {
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerReady(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) serviceManager, "");
            C8632dsu.c((Object) status, "");
            Fragment h = ActivityC6219cYg.this.h();
            C8632dsu.d(h);
            ((NetflixFrag) h).onManagerReady(serviceManager, status);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new e();
    }
}
