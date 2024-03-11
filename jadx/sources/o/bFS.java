package o;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.transition.Fade;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.details.BackStackData;
import com.netflix.mediaclient.ui.details.DetailsActivity;
import com.netflix.mediaclient.ui.details.DetailsActivityAction;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.util.PlayContext;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import o.C9834xU;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public class bFS extends bFH {
    private boolean h;
    private ServiceManager j;
    private final ArrayList<BackStackData> c = new ArrayList<>();
    private VideoType i = VideoType.UNKNOWN;

    @Override // com.netflix.mediaclient.ui.details.DetailsActivity
    public VideoType p() {
        return this.i;
    }

    public static Class<? extends DetailsActivity> t() {
        return NetflixApplication.getInstance().M() ? bFM.class : bFS.class;
    }

    @Override // com.netflix.mediaclient.ui.details.DetailsActivity, o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null && bundle.containsKey("extra_back_stack")) {
            Iterator it = bundle.getParcelableArrayList("extra_back_stack").iterator();
            while (it.hasNext()) {
                this.c.add((BackStackData) ((Parcelable) it.next()));
            }
        }
        r();
        super.onCreate(bundle);
        if (C8150deu.h()) {
            overridePendingTransition(C9834xU.d.a, com.netflix.mediaclient.ui.R.d.g);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        C1044Mm.b("VideoDetailsActivity", "onNewIntent: ", intent);
        super.onNewIntent(intent);
        setIntent(intent);
        r();
        if (this.j == null) {
            this.h = true;
        } else {
            c(null);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public int getActionBarParentViewId() {
        int i = com.netflix.mediaclient.ui.R.g.gw;
        return findViewById(i) != null ? i : super.getActionBarParentViewId();
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean handleBackPressed() {
        C1044Mm.b("VideoDetailsActivity", "Back pressed, backStack size: " + this.c.size());
        if (this.c.size() > 0) {
            ArrayList<BackStackData> arrayList = this.c;
            BackStackData remove = arrayList.remove(arrayList.size() - 1);
            String str = remove.e;
            Objects.requireNonNull(str);
            e(str);
            this.i = VideoType.create(remove.b);
            d(remove.a);
            c(remove.d);
            return true;
        }
        C1044Mm.b("VideoDetailsActivity", "No more videos in back stack, finishing...");
        return false;
    }

    @Override // com.netflix.mediaclient.ui.details.DetailsActivity, o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
        super.onManagerReady(serviceManager, status);
        this.j = serviceManager;
        if (!this.h || serviceManager == null) {
            return;
        }
        c(null);
        this.h = false;
    }

    @Override // com.netflix.mediaclient.ui.details.DetailsActivity, o.InterfaceC5091bsH
    public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
        super.onManagerUnavailable(serviceManager, status);
        this.j = null;
    }

    @Override // o.MO
    public Fragment d() {
        TrackingInfoHolder trackingInfoHolder;
        String o2 = o();
        if (C8168dfL.g(o2)) {
            InterfaceC1593aHa.b("SPY-31405: VideoDetailsActivity: videoIdForDp is null");
            o2 = getIntent().getStringExtra(NetflixActivity.EXTRA_VIDEO_ID);
            if (C8168dfL.g(o2)) {
                InterfaceC1593aHa.b("SPY-31405: VideoDetailsActivity: videoIdForDp is still null after retry");
                InterfaceC1598aHf.a("SPY-31405: VideoDetailsActivity: videoIdForDp is still null after retry");
                return null;
            }
            e(o2);
        }
        String str = o2;
        InterfaceC1593aHa.b("SPY-18272: VideoDetailsActivity: videoIdForDp is " + str);
        TrackingInfoHolder trackingInfoHolder2 = (TrackingInfoHolder) getIntent().getParcelableExtra(NetflixActivity.EXTRA_TRACKINGINFO_HOLDER);
        if (trackingInfoHolder2 == null) {
            C1044Mm.d("VideoDetailsActivity", "EXTRA_TRACKINGINFO_HOLDER was missing");
            TrackingInfoHolder trackingInfoHolder3 = new TrackingInfoHolder(PlayLocationType.VIDEO_VIEW);
            trackingInfoHolder3.d(Integer.parseInt(str), (PlayContext) getIntent().getParcelableExtra(NetflixActivity.EXTRA_PLAY_CONTEXT));
            trackingInfoHolder = trackingInfoHolder3;
        } else {
            trackingInfoHolder = trackingInfoHolder2;
        }
        PlayerExtras playerExtras = (PlayerExtras) getIntent().getParcelableExtra(NetflixActivity.EXTRA_PLAYER_EXTRAS);
        VideoType p = p();
        String stringExtra = getIntent().getStringExtra("extra_video_title");
        String stringExtra2 = getIntent().getStringExtra(NetflixActivity.EXTRA_TRAILER_ID);
        long longExtra = getIntent().getLongExtra(NetflixActivity.EXTRA_TRAILER_BOOKMARK_MS, -1L);
        return C3641bFj.a(this, str, p, stringExtra, stringExtra2, Long.valueOf(longExtra), trackingInfoHolder, ((DetailsActivity) this).e, playerExtras);
    }

    @Override // com.netflix.mediaclient.ui.details.DetailsActivity, com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("extra_back_stack", this.c);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onCreateOptionsMenu(Menu menu, Menu menu2) {
        C6491ceM.c(this, menu);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (C8150deu.h()) {
            overridePendingTransition(com.netflix.mediaclient.ui.R.d.i, C9834xU.d.c);
        }
    }

    private void r() {
        if (C8168dfL.h(o())) {
            this.c.add(new BackStackData(o(), y_(), h() instanceof bFO ? ((bFO) h()).a() : null, this.i.getValue()));
        }
        String stringExtra = getIntent().getStringExtra(NetflixActivity.EXTRA_VIDEO_ID);
        Objects.requireNonNull(stringExtra);
        e(stringExtra);
        VideoType create = VideoType.create(getIntent().getStringExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE));
        this.i = create;
        if (!b(create)) {
            InterfaceC1598aHf.a("Inside VideoVideoDetailsActivity: Unsupported videoType " + this.i);
        }
        TrackingInfoHolder trackingInfoHolder = (TrackingInfoHolder) getIntent().getParcelableExtra(NetflixActivity.EXTRA_TRACKINGINFO_HOLDER);
        if (trackingInfoHolder != null) {
            d(trackingInfoHolder.d(false));
        } else {
            InterfaceC1598aHf.a("VideoDetailsActivity: trackingInfoHolder was null");
            d((PlayContext) getIntent().getParcelableExtra(NetflixActivity.EXTRA_PLAY_CONTEXT));
        }
        b((DetailsActivityAction) getIntent().getSerializableExtra("extra_action"), getIntent().getStringExtra("extra_action_token"));
    }

    protected boolean b(VideoType videoType) {
        return videoType == VideoType.SHOW || videoType == VideoType.MOVIE;
    }

    private void c(Parcelable parcelable) {
        if (this.j != null) {
            Fragment h = h();
            Fragment d = d();
            b(d);
            if (d instanceof bFO) {
                ((bFO) d).e(parcelable);
            } else {
                C1044Mm.j("VideoDetailsActivity", "showNewDetailsFrag: newFrag didn't implement ILayoutManager");
            }
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            e(h, d, parcelable != null);
            beginTransaction.replace(com.netflix.mediaclient.ui.R.g.eF, d, "primary");
            beginTransaction.commit();
            getSupportFragmentManager().executePendingTransactions();
            ((InterfaceC5091bsH) d).onManagerReady(this.j, InterfaceC1078Nw.aJ);
            NetflixApplication.getInstance().y().b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [o.dig] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.transition.Fade] */
    public void e(Fragment fragment, Fragment fragment2, boolean z) {
        Object s = s();
        d((C8348dig) s);
        if (fragment2 != null) {
            fragment2.setEnterTransition(z ? new Fade() : s);
        }
        if (fragment != null) {
            if (!z) {
                s = new Fade();
            }
            fragment.setExitTransition(s);
        }
    }

    private static C8348dig s() {
        return C8150deu.h() ? new C8353dil(true) : new C8348dig(false);
    }

    private void d(C8348dig c8348dig) {
        c8348dig.a(BrowseExperience.e(this, 16842836));
        c8348dig.setDuration(C8054ddD.e(NetflixApplication.getInstance(), C9834xU.f.e));
    }
}
