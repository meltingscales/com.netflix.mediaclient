package o;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.details.DetailsPageRemindMeDeeplinkHandler$handleRemindMe$1;
import dagger.Lazy;
import io.reactivex.subjects.PublishSubject;
import javax.inject.Inject;
import o.C3651bFt;
import o.C8632dsu;
import o.bFT;
import o.dpR;

/* renamed from: o.bFt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3651bFt {
    private final Activity a;
    private final Lazy<InterfaceC3663bGe> d;

    @Inject
    public C3651bFt(Lazy<InterfaceC3663bGe> lazy, Activity activity) {
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) activity, "");
        this.d = lazy;
        this.a = activity;
    }

    public final void e(final String str, VideoType videoType) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        if (aQU.c.d()) {
            Activity activity = this.a;
            C8632dsu.d(activity);
            C8737dwr.c(LifecycleOwnerKt.getLifecycleScope((ComponentActivity) activity), null, null, new DetailsPageRemindMeDeeplinkHandler$handleRemindMe$1(this, str, null), 3, null);
            return;
        }
        Activity activity2 = this.a;
        C8632dsu.d(activity2);
        PublishSubject<dpR> activityDestroy = ((NetflixActivity) activity2).getActivityDestroy();
        C8632dsu.a(activityDestroy, "");
        C1767aNm.c(new C1767aNm(activityDestroy), str, videoType, true, null, new TrackingInfoHolder(PlayLocationType.DEEPLINK), null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.details.DetailsPageRemindMeDeeplinkHandler$handleRemindMe$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Boolean bool) {
                c(bool.booleanValue());
                return dpR.c;
            }

            public final void c(boolean z) {
                Activity activity3;
                if (z) {
                    C3651bFt.this.d();
                    Intent putExtra = new Intent("action_notify_of_remind_me").putExtra(NetflixActivity.EXTRA_VIDEO_ID, str);
                    C8632dsu.a(putExtra, "");
                    activity3 = C3651bFt.this.a;
                    LocalBroadcastManager.getInstance(activity3).sendBroadcast(putExtra);
                }
            }
        }, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        C8054ddD.c(this.a, bFT.c.j, 1);
    }
}
