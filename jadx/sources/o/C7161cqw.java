package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.PlayCommand;
import com.netflix.cl.model.event.session.command.SelectCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.model.leafs.social.UserNotificationActionTrackingInfo;
import com.netflix.model.leafs.social.multititle.NotificationHeroTitleAction;
import o.C7119cqG;
import o.C9935zP;

/* renamed from: o.cqw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7161cqw extends RelativeLayout {
    private C6950cmv a;
    private final C7139cqa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7161cqw(Context context) {
        super(context);
        C8632dsu.c((Object) context, "");
        C7139cqa c = C7139cqa.c(LayoutInflater.from(getContext()), this, true);
        C8632dsu.a(c, "");
        this.c = c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7161cqw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) attributeSet, "");
        C7139cqa c = C7139cqa.c(LayoutInflater.from(getContext()), this, true);
        C8632dsu.a(c, "");
        this.c = c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7161cqw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) attributeSet, "");
        C7139cqa c = C7139cqa.c(LayoutInflater.from(getContext()), this, true);
        C8632dsu.a(c, "");
        this.c = c;
    }

    public final void a() {
        Context context = getContext();
        C8632dsu.a(context, "");
        C1206St c1206St = this.c.e;
        C8632dsu.a(c1206St, "");
        C6906cmD c6906cmD = new C6906cmD(c1206St, false, 2, null);
        C9935zP.b bVar = C9935zP.b;
        Context context2 = getContext();
        C8632dsu.a(context2, "");
        this.a = new C6950cmv((NetflixActivity) C9737vz.e(context, NetflixActivity.class), c6906cmD, bVar.d((LifecycleOwner) C9737vz.e(context2, LifecycleOwner.class)).d());
    }

    public final void d() {
        C6950cmv c6950cmv = this.a;
        if (c6950cmv != null) {
            c6950cmv.b();
        }
    }

    private final void e(String str) {
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.b(getContext(), NetflixActivity.class);
        if (netflixActivity != null) {
            C7119cqG.c cVar = C7119cqG.a;
            C1203Sq c1203Sq = this.c.a;
            C8632dsu.a(c1203Sq, "");
            cVar.b(netflixActivity, c1203Sq, str);
        }
    }

    private final void a(String str, VideoType videoType, UserNotificationActionTrackingInfo userNotificationActionTrackingInfo) {
        C6950cmv c6950cmv = this.a;
        if (c6950cmv == null) {
            throw new IllegalStateException();
        }
        Integer trackId = userNotificationActionTrackingInfo.trackId();
        if (trackId == null) {
            trackId = -531;
        }
        int intValue = trackId.intValue();
        TrackingInfo a = CLv2Utils.a(userNotificationActionTrackingInfo);
        C8632dsu.a(a, "");
        c6950cmv.d(str, videoType, intValue, (String) null, a);
    }

    private final void b(InterfaceC5198buI interfaceC5198buI) {
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.b(getContext(), NetflixActivity.class);
        if (netflixActivity != null) {
            this.c.d.setStateFromPlayable(interfaceC5198buI.aE_(), netflixActivity);
        }
        if (this.c.d.c() != DownloadButton.ButtonState.NOT_AVAILABLE) {
            e();
        }
    }

    private final void e() {
        ViewUtils.d((View) this.c.d, true);
    }

    private final void c(View view, final TrackingInfo trackingInfo, final Command command, final boolean z) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: o.cqu
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean a;
                a = C7161cqw.a(TrackingInfo.this, command, z, view2, motionEvent);
                return a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(TrackingInfo trackingInfo, Command command, boolean z, View view, MotionEvent motionEvent) {
        C8632dsu.c((Object) command, "");
        if (motionEvent.getAction() == 0) {
            CLv2Utils.INSTANCE.b(new Focus(AppView.notificationLandingItem, trackingInfo), command, z);
            return false;
        }
        return false;
    }

    public final void e(boolean z) {
        C6950cmv c6950cmv = this.a;
        if (c6950cmv != null) {
            c6950cmv.e(z);
        }
    }

    public final void e(NotificationHeroTitleAction notificationHeroTitleAction, InterfaceC5198buI interfaceC5198buI) {
        boolean g;
        C8632dsu.c((Object) notificationHeroTitleAction, "");
        C8632dsu.c((Object) interfaceC5198buI, "");
        String action = notificationHeroTitleAction.action();
        String titleId = notificationHeroTitleAction.trackingInfo().titleId();
        if (titleId != null) {
            g = C8691duz.g(titleId);
            if (g) {
                return;
            }
            String actionType = notificationHeroTitleAction.actionType();
            C8632dsu.a(actionType, "");
            String lowerCase = actionType.toLowerCase();
            C8632dsu.a(lowerCase, "");
            int hashCode = lowerCase.hashCode();
            if (hashCode == 96417) {
                if (lowerCase.equals("add")) {
                    this.c.e.setVisibility(0);
                    VideoType videoType = notificationHeroTitleAction.videoType();
                    C8632dsu.a(videoType, "");
                    UserNotificationActionTrackingInfo trackingInfo = notificationHeroTitleAction.trackingInfo();
                    C8632dsu.a(trackingInfo, "");
                    a(titleId, videoType, trackingInfo);
                }
            } else if (hashCode != 112903375) {
                if (hashCode == 1427818632 && lowerCase.equals("download")) {
                    b(interfaceC5198buI);
                    DownloadButton downloadButton = this.c.d;
                    C8632dsu.a(downloadButton, "");
                    c(downloadButton, CLv2Utils.a(notificationHeroTitleAction.trackingInfo()), new SelectCommand(), false);
                }
            } else if (lowerCase.equals("watch")) {
                C8632dsu.d((Object) action);
                e(action);
                C1203Sq c1203Sq = this.c.a;
                C8632dsu.a(c1203Sq, "");
                c(c1203Sq, CLv2Utils.a(notificationHeroTitleAction.trackingInfo()), new PlayCommand(null), true);
            }
        }
    }

    public final void c(String str, Integer num) {
        String c;
        if (num == null || num.intValue() <= 0) {
            return;
        }
        C1203Sq c1203Sq = this.c.a;
        if (str == null || str.length() == 0) {
            c = C1333Xq.d(com.netflix.mediaclient.ui.R.o.dr).d("episodeNumber", num).c();
        } else {
            c = getContext().getString(com.netflix.mediaclient.ui.R.o.ge, str, num);
        }
        c1203Sq.setText(c);
    }
}
