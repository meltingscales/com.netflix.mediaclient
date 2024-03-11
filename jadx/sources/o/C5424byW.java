package o;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionFragment;
import javax.inject.Inject;

/* renamed from: o.byW  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5424byW implements InterfaceC5425byX {
    public static final d c = new d(null);
    private final NetflixActivity b;

    @Inject
    public C5424byW(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.b = (NetflixActivity) C9726vo.d(activity, NetflixActivity.class);
    }

    /* renamed from: o.byW$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("CfourSurveyImpl");
        }
    }

    @Override // o.InterfaceC5425byX
    public void a() {
        Fragment findFragmentByTag = this.b.getSupportFragmentManager().findFragmentByTag("SurveyDialogFrag");
        if (findFragmentByTag == null || !findFragmentByTag.isAdded()) {
            C8187dfe.e.a().post(new Runnable() { // from class: o.bzb
                @Override // java.lang.Runnable
                public final void run() {
                    C5424byW.e(C5424byW.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5424byW c5424byW) {
        C8632dsu.c((Object) c5424byW, "");
        if (C9737vz.a(c5424byW.b) || c5424byW.b.getSupportFragmentManager().isStateSaved()) {
            return;
        }
        DemographicCollectionFragment demographicCollectionFragment = new DemographicCollectionFragment();
        demographicCollectionFragment.setStyle(2, com.netflix.mediaclient.ui.R.l.m);
        demographicCollectionFragment.showNow(c5424byW.b.getSupportFragmentManager(), "SurveyDialogFrag");
    }
}
