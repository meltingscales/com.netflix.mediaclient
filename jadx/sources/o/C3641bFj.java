package o;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.details.DetailsActivityAction;
import com.netflix.mediaclient.ui.detailspage.api.DetailsPageParams;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.util.PlayContext;
import org.chromium.net.NetError;

/* renamed from: o.bFj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3641bFj implements InterfaceC5345bwx {
    private FragmentHelper c;
    private NetflixActivity d;

    @Override // o.InterfaceC5345bwx
    public void b(Intent intent, Fragment fragment, Intent intent2, boolean z) {
    }

    @Override // o.InterfaceC5345bwx
    public void c(Intent intent, Fragment fragment, boolean z) {
    }

    public C3641bFj(FragmentHelper fragmentHelper, NetflixActivity netflixActivity) {
        this.c = fragmentHelper;
        this.d = netflixActivity;
    }

    @Override // o.InterfaceC5345bwx
    public boolean e(Intent intent) {
        String stringExtra = intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_ID);
        boolean z = intent.getComponent() != null && (j(intent) || g(intent));
        if (z && stringExtra == null) {
            InterfaceC1593aHa.b("SPY-31405: DetailsHelper: videoId is null in canHandleIntent " + intent);
        }
        return z && stringExtra != null;
    }

    private boolean j(Intent intent) {
        intent.setExtrasClassLoader(getClass().getClassLoader());
        return intent.getComponent() != null && intent.getComponent().getClassName().equals(bFS.t().getCanonicalName()) && VideoType.MOVIE.getValue().equals(intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE));
    }

    private boolean g(Intent intent) {
        intent.setExtrasClassLoader(getClass().getClassLoader());
        return intent.getComponent() != null && intent.getComponent().getClassName().equals(bFS.t().getCanonicalName()) && VideoType.SHOW.getValue().equals(intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE));
    }

    @Override // o.InterfaceC5345bwx
    public Fragment d(Intent intent) {
        TrackingInfoHolder trackingInfoHolder;
        if (e(intent)) {
            String stringExtra = intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_ID);
            int intExtra = intent.getIntExtra("extra_model_view_id", AppView.UNKNOWN.ordinal());
            TrackingInfoHolder trackingInfoHolder2 = (TrackingInfoHolder) intent.getParcelableExtra(NetflixActivity.EXTRA_TRACKINGINFO_HOLDER);
            if (trackingInfoHolder2 == null) {
                InterfaceC1598aHf.a("DetailsHelper: trackingInfoHolder was null");
                PlayContext i = i(intent);
                TrackingInfoHolder trackingInfoHolder3 = new TrackingInfoHolder(PlayLocationType.VIDEO_VIEW);
                trackingInfoHolder3.d(Integer.parseInt(stringExtra), i);
                trackingInfoHolder = trackingInfoHolder3;
            } else {
                trackingInfoHolder = trackingInfoHolder2;
            }
            return a(this.d, stringExtra, VideoType.create(intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE)), intent.getStringExtra("extra_video_title"), intent.getStringExtra(NetflixActivity.EXTRA_TRAILER_ID), Long.valueOf(intent.getLongExtra(NetflixActivity.EXTRA_TRAILER_BOOKMARK_MS, -1L)), trackingInfoHolder, intExtra, (PlayerExtras) intent.getParcelableExtra(NetflixActivity.EXTRA_PLAYER_EXTRAS));
        }
        return null;
    }

    @Override // o.InterfaceC5345bwx
    public boolean a() {
        return this.c.e();
    }

    @Override // o.InterfaceC5345bwx
    public AppView a(Intent intent) {
        return AppView.movieDetails;
    }

    @Override // o.InterfaceC5345bwx
    public TrackingInfo b(Intent intent) {
        return new C8263dhA(i(intent), h(intent));
    }

    @Override // o.InterfaceC5345bwx
    public void a(Intent intent, Fragment fragment) {
        if (fragment instanceof NetflixFrag) {
            ((NetflixFrag) fragment).bt_();
        }
    }

    @Override // o.InterfaceC5345bwx
    public boolean c(Intent intent, Fragment fragment) {
        return ConfigFastPropertyFeatureControlConfig.Companion.d();
    }

    private String h(Intent intent) {
        return intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_ID);
    }

    private PlayContext i(Intent intent) {
        PlayContext playContext;
        TrackingInfoHolder trackingInfoHolder = (TrackingInfoHolder) intent.getParcelableExtra(NetflixActivity.EXTRA_TRACKINGINFO_HOLDER);
        if (trackingInfoHolder != null) {
            playContext = trackingInfoHolder.d(false);
        } else {
            playContext = (PlayContext) intent.getParcelableExtra(NetflixActivity.EXTRA_PLAY_CONTEXT);
        }
        if (playContext == null) {
            InterfaceC1598aHf.a("playContext is null!  id: " + h(intent) + " action: " + c(intent) + " actionToken: " + f(intent));
            return new EmptyPlayContext("DetailsHelper", NetError.ERR_TOO_MANY_ACCEPT_CH_RESTARTS);
        }
        return playContext;
    }

    private String f(Intent intent) {
        return intent.getStringExtra("extra_action_token");
    }

    private DetailsActivityAction c(Intent intent) {
        return (DetailsActivityAction) intent.getSerializableExtra("extra_action");
    }

    public static NetflixFrag a(NetflixActivity netflixActivity, String str, VideoType videoType, String str2, String str3, Long l, TrackingInfoHolder trackingInfoHolder, int i, PlayerExtras playerExtras) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("trackingInfoHolderKey", trackingInfoHolder);
        return (NetflixFrag) InterfaceC3661bGc.d(netflixActivity).c(new DetailsPageParams.FullDp(str, videoType, str2, str3, l, i, "trackingInfoHolderKey", bundle, playerExtras));
    }
}
