package com.netflix.mediaclient.ui.games.game_details;

import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.util.PlayContext;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.C8632dsu;
import o.aIA;
import o.bNH;
import o.bNX;

@aIA
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class GameDetailsActivity extends bNX {
    @Inject
    public bNH gameDetail;

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean hasProfileAvatarInActionBar() {
        return true;
    }

    public final bNH s() {
        bNH bnh = this.gameDetail;
        if (bnh != null) {
            return bnh;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.bFS, o.MO
    public Fragment d() {
        String o2 = o();
        PlayContext y_ = y_();
        C8632dsu.a(y_, "");
        PlayLocationType e = y_.e();
        C8632dsu.a(e, "");
        TrackingInfoHolder trackingInfoHolder = new TrackingInfoHolder(e);
        C8632dsu.d((Object) o2);
        return s().e(o2, trackingInfoHolder.d(Integer.parseInt(o2), y_));
    }

    @Override // o.bFS, com.netflix.mediaclient.ui.details.DetailsActivity
    public VideoType p() {
        return VideoType.GAMES;
    }

    @Override // o.bFS
    public boolean b(VideoType videoType) {
        C8632dsu.c((Object) videoType, "");
        return videoType == VideoType.GAMES;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void setTheme() {
        setTheme(R.l.f13251o);
    }

    @Override // o.bFS, o.MO, com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean handleBackPressed() {
        if (h() instanceof NetflixFrag) {
            Fragment h = h();
            C8632dsu.d(h);
            if (((NetflixFrag) h).o()) {
                return true;
            }
        }
        return super.handleBackPressed();
    }

    @Override // com.netflix.mediaclient.ui.details.DetailsActivity, com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.gameDetails;
    }
}
