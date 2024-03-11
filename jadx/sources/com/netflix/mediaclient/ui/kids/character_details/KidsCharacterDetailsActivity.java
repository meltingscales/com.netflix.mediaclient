package com.netflix.mediaclient.ui.kids.character_details;

import android.os.Bundle;
import android.view.Menu;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.logging.perf.PerformanceProfilerImpl;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.details.DetailsActivity;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.kids.character_details.KidsCharacterDetailsActivity;
import com.netflix.mediaclient.util.PlayContext;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import java.util.Optional;
import javax.inject.Inject;
import o.AbstractActivityC4155bYg;
import o.ActivityC5364bxP;
import o.C1044Mm;
import o.C5165btc;
import o.InterfaceC1077Nv;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1640aIu;
import o.InterfaceC5091bsH;
import o.aIB;
import o.bDE;
import o.bFP;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public class KidsCharacterDetailsActivity extends AbstractActivityC4155bYg {
    private static boolean c;
    private static boolean g;
    private static boolean i;
    @Inject
    public Optional<DebugMenuItems> debugMenuItems;
    private VideoType f = VideoType.CHARACTERS;

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean allowTransitionAnimation() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public int getActionBarParentViewId() {
        return R.g.aG;
    }

    @Override // o.MO
    public int j() {
        return R.i.j;
    }

    @Override // com.netflix.mediaclient.ui.details.DetailsActivity
    public VideoType p() {
        return this.f;
    }

    public static Class<? extends KidsCharacterDetailsActivity> q() {
        return NetflixApplication.getInstance().M() ? ActivityC5364bxP.class : KidsCharacterDetailsActivity.class;
    }

    @Override // com.netflix.mediaclient.ui.details.DetailsActivity, o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!getIntent().hasExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE)) {
            InterfaceC1593aHa.b("SPY-37222 Start intent must provide extra value: extra_video_type_string_value");
        } else {
            this.f = VideoType.create(getIntent().getStringExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE));
        }
        if (bundle == null) {
            v();
        }
        super.onCreate(bundle);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void setTheme() {
        if (BrowseExperience.e()) {
            setTheme(R.l.t);
        } else {
            setTheme(R.l.l);
        }
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean handleBackPressed() {
        return ((bFP) h()).o();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
        if (handleBackPressed()) {
            return;
        }
        finish();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onCreateOptionsMenu(Menu menu, Menu menu2) {
        if (menu2 == null || !this.debugMenuItems.isPresent()) {
            return;
        }
        this.debugMenuItems.get().e(menu2);
    }

    @Override // com.netflix.mediaclient.ui.details.DetailsActivity, com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new InterfaceC5091bsH() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterDetailsActivity.1
            @Override // o.InterfaceC5091bsH
            public void onManagerReady(ServiceManager serviceManager, Status status) {
                KidsCharacterDetailsActivity.this.setupInteractiveTracking(new bDE.d(), KidsCharacterDetailsActivity.this.w());
                ((InterfaceC5091bsH) KidsCharacterDetailsActivity.this.h()).onManagerReady(serviceManager, status);
                KidsCharacterDetailsActivity.this.x();
            }

            @Override // o.InterfaceC5091bsH
            public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
                ((InterfaceC5091bsH) KidsCharacterDetailsActivity.this.h()).onManagerUnavailable(serviceManager, status);
            }
        };
    }

    @Override // o.MO
    public Fragment d() {
        PlayContext y_ = y_();
        return KidsCharacterFrag.e(((DetailsActivity) this).a, new TrackingInfoHolder(y_.e()).d(Integer.parseInt(((DetailsActivity) this).a), y_));
    }

    @Override // com.netflix.mediaclient.ui.details.DetailsActivity, com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.characterDetails;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, o.AbstractActivityC1635aIp, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (isFinishing()) {
            s();
        }
        super.onDestroy();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, android.app.Activity
    public void finish() {
        s();
        super.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        setLoadingStatusCallback(new InterfaceC1077Nv.e() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterDetailsActivity.3
            @Override // o.InterfaceC1077Nv.e
            public void c(Status status) {
                IClientLogging.CompletionReason completionReason;
                if (status.j()) {
                    completionReason = IClientLogging.CompletionReason.success;
                } else {
                    completionReason = IClientLogging.CompletionReason.failed;
                }
                if (KidsCharacterDetailsActivity.c) {
                    KidsCharacterDetailsActivity.this.c(completionReason);
                }
                if (status.i() && KidsCharacterDetailsActivity.i) {
                    KidsCharacterDetailsActivity.this.a(completionReason, status);
                }
                KidsCharacterDetailsActivity kidsCharacterDetailsActivity = KidsCharacterDetailsActivity.this;
                kidsCharacterDetailsActivity.setLoadingStatusCallback(null);
                if (kidsCharacterDetailsActivity.isFinishing() || !status.i()) {
                    return;
                }
                InterfaceC1640aIu.e(kidsCharacterDetailsActivity, status);
            }
        });
    }

    private void v() {
        u();
        y();
    }

    private void u() {
        if (c) {
            C1044Mm.e("KidsCharacterDetailsActivity", "Received a start DP TTI session while already tracking another");
            c(IClientLogging.CompletionReason.canceled);
        }
        c = true;
        PerformanceProfilerImpl.INSTANCE.d(Sessions.DP_TTI);
    }

    private void y() {
        if (i) {
            C1044Mm.e("KidsCharacterDetailsActivity", "Received a start DP TTR session while already tracking another");
            a(IClientLogging.CompletionReason.canceled, (Status) null);
        }
        i = true;
        PerformanceProfilerImpl.INSTANCE.d(Sessions.DP_TTR);
        aIB.b(this, new aIB.e() { // from class: o.bYi
            @Override // o.aIB.e
            public final void run(ServiceManager serviceManager) {
                KidsCharacterDetailsActivity.this.a(serviceManager);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ServiceManager serviceManager) {
        setupInteractiveTracking(new bDE.d(), w()).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(IClientLogging.CompletionReason completionReason) {
        if (!c) {
            InterfaceC1598aHf.a("Received a end DP TTI session while not tracking any");
        }
        c = false;
        PerformanceProfilerImpl.INSTANCE.d(Sessions.DP_TTI, b(completionReason));
        logMetadataRenderedEvent(false);
        if (g) {
            g = false;
            a(completionReason, (Status) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IClientLogging.CompletionReason completionReason, Status status) {
        if (!i) {
            InterfaceC1598aHf.a("Received a end DP TTR session while not tracking any");
        }
        if (c) {
            g = true;
            C1044Mm.e("KidsCharacterDetailsActivity", "Defer DP_TTR end until DP_TTI is complete.");
            return;
        }
        i = false;
        endRenderNavigationLevelSession(completionReason, status);
        PerformanceProfilerImpl.INSTANCE.d(Sessions.DP_TTR, b(completionReason));
        flushPerformanceProfilerEvents();
    }

    private void s() {
        if (c) {
            c(IClientLogging.CompletionReason.canceled);
        }
        if (i) {
            a(IClientLogging.CompletionReason.canceled, (Status) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InteractiveTrackerInterface.c w() {
        return new InteractiveTrackerInterface.c() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterDetailsActivity.2
            @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface.c
            public void c(InteractiveTrackerInterface.Reason reason, String str, List<C5165btc> list) {
                if (KidsCharacterDetailsActivity.i) {
                    KidsCharacterDetailsActivity.this.a(IClientLogging.CompletionReason.fromImageLoaderReason(reason), (Status) null);
                }
            }
        };
    }
}
