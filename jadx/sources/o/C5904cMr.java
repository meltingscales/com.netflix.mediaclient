package o;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.context.DeepLinkInput;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.PlayCommand;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.model.leafs.social.NotificationsListSummary;
import com.netflix.model.leafs.social.UserNotificationLandingTrackingInfo;
import com.netflix.model.leafs.social.multititle.NotificationLandingPage;
import dagger.Lazy;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC5164btb;
import o.C5904cMr;
import o.C8054ddD;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5125bsp;
import o.InterfaceC7084cpY;
import o.dpR;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.cMr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5904cMr {
    public static final c a = new c(null);
    public static final int c = 8;
    private final Lazy<bEX> b;
    private final Activity d;
    private final Lazy<InterfaceC3643bFl> e;
    private final Lazy<bDI> f;
    private final Lazy<InterfaceC7084cpY> j;

    @Inject
    public C5904cMr(Activity activity, Lazy<InterfaceC7084cpY> lazy, Lazy<bEX> lazy2, Lazy<bDI> lazy3, Lazy<InterfaceC3643bFl> lazy4) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) lazy2, "");
        C8632dsu.c((Object) lazy3, "");
        C8632dsu.c((Object) lazy4, "");
        this.d = activity;
        this.j = lazy;
        this.b = lazy2;
        this.f = lazy3;
        this.e = lazy4;
    }

    public final void a(final NotificationSummaryItem notificationSummaryItem, final NotificationsListSummary notificationsListSummary, final int i) {
        String str;
        Map d;
        Map k;
        Throwable th;
        Command viewDetailsCommand;
        C8632dsu.c((Object) notificationSummaryItem, "");
        C8632dsu.c((Object) notificationsListSummary, "");
        NotificationLandingPage landingPage = notificationSummaryItem.landingPage();
        String urlTarget = notificationSummaryItem.urlTarget();
        if (landingPage != null) {
            UserNotificationLandingTrackingInfo trackingInfo = notificationSummaryItem.trackingInfo();
            b(trackingInfo != null ? CLv2Utils.a(trackingInfo) : null);
            Activity activity = this.d;
            InterfaceC7084cpY interfaceC7084cpY = this.j.get();
            C8632dsu.a(interfaceC7084cpY, "");
            activity.startActivity(InterfaceC7084cpY.a.a(interfaceC7084cpY, this.d, landingPage, notificationSummaryItem.trackingInfo(), null, 8, null));
        } else if (urlTarget != null && urlTarget.length() > 0) {
            this.b.get().c(bEX.b.e(new Intent("android.intent.action.VIEW", Uri.parse(urlTarget))));
            b(new TrackingInfo() { // from class: o.cMt
                @Override // com.netflix.cl.model.JsonSerializer
                public final JSONObject toJSONObject() {
                    JSONObject e;
                    e = C5904cMr.e(NotificationSummaryItem.this, notificationsListSummary, i);
                    return e;
                }
            });
        } else {
            String imageTarget = notificationSummaryItem.imageTarget();
            if (imageTarget != null) {
                str = imageTarget.toUpperCase(Locale.ROOT);
                C8632dsu.a(str, "");
            } else {
                str = null;
            }
            String videoId = notificationSummaryItem.videoId();
            VideoType videoType = notificationSummaryItem.videoType();
            if (videoId == null || videoType == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("SPY-16126 Empty videoID or videoType", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        c1596aHd.a(errorType.c() + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th);
                    return;
                } else {
                    dVar.e().b(c1596aHd, th);
                    return;
                }
            }
            String requestId = notificationsListSummary.requestId();
            if (C8632dsu.c((Object) str, (Object) "PLAYBACK")) {
                c(requestId, notificationsListSummary, videoId, videoType);
                viewDetailsCommand = new PlayCommand(null);
            } else {
                a(notificationSummaryItem, requestId, notificationsListSummary, videoId, videoType);
                viewDetailsCommand = new ViewDetailsCommand();
            }
            if (notificationSummaryItem.urlTarget() != null) {
                a.c(notificationSummaryItem, viewDetailsCommand);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject e(NotificationSummaryItem notificationSummaryItem, NotificationsListSummary notificationsListSummary, int i) {
        C8632dsu.c((Object) notificationSummaryItem, "");
        C8632dsu.c((Object) notificationsListSummary, "");
        return a.a(notificationSummaryItem, notificationsListSummary, i);
    }

    private final void b(TrackingInfo trackingInfo) {
        CLv2Utils.INSTANCE.d(AppView.accountMenu, CommandValue.ViewDetailsCommand, trackingInfo, new Focus(AppView.notificationItem, trackingInfo), null, true, null);
    }

    private final void c(String str, NotificationsListSummary notificationsListSummary, String str2, VideoType videoType) {
        this.d.startActivity(this.f.get().a(this.d, str2, videoType, new PlayContextImp(str, notificationsListSummary.playerTrackId(), 0, 0), new PlayerExtras(-1L, 0L, 0, false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32766, null)));
    }

    private final void a(NotificationSummaryItem notificationSummaryItem, String str, NotificationsListSummary notificationsListSummary, String str2, VideoType videoType) {
        final String eventGuid = notificationSummaryItem.eventGuid();
        if (!notificationSummaryItem.read() && eventGuid != null) {
            C1645aIz.a(this.d, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixNotificationClickHandler$openDP$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                    b(serviceManager);
                    return dpR.c;
                }

                public final void b(ServiceManager serviceManager) {
                    C8632dsu.c((Object) serviceManager, "");
                    final InterfaceC5125bsp j = serviceManager.j();
                    String str3 = eventGuid;
                    final C5904cMr c5904cMr = this;
                    j.e(str3, new AbstractC5164btb() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixNotificationClickHandler$openDP$1.2
                        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
                        public void l(List<NotificationSummaryItem> list, Status status) {
                            Activity activity;
                            C8632dsu.c((Object) status, "");
                            if (list != null) {
                                activity = C5904cMr.this.d;
                                if (C8054ddD.l(activity)) {
                                    return;
                                }
                                j.c(true);
                            }
                        }
                    });
                }
            });
        }
        PlayContextImp playContextImp = new PlayContextImp(str, notificationsListSummary.mdpTrackId(), 0, 0);
        PlayLocationType j = playContextImp.j();
        C8632dsu.a(j, "");
        this.e.get().b(this.d, videoType, str2, notificationSummaryItem.videoTitle(), new TrackingInfoHolder(j).d(Integer.parseInt(str2), playContextImp), "SocialNotif", new PlayerExtras(0L, 0L, 0, false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32767, null));
    }

    /* renamed from: o.cMr$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(NotificationSummaryItem notificationSummaryItem, Command command) {
            String urlTarget = notificationSummaryItem.urlTarget();
            if (urlTarget == null) {
                return;
            }
            DeepLinkInput deepLinkInput = new DeepLinkInput(Boolean.FALSE, urlTarget, Double.valueOf(1.0d));
            Logger logger = Logger.INSTANCE;
            long addContext = logger.addContext(deepLinkInput);
            CLv2Utils.d(command);
            logger.removeContext(Long.valueOf(addContext));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final JSONObject a(NotificationSummaryItem notificationSummaryItem, NotificationsListSummary notificationsListSummary, int i) {
            JSONObject jSONObject = new JSONObject();
            try {
                NotificationLandingPage landingPage = notificationSummaryItem.landingPage();
                UserNotificationLandingTrackingInfo trackingInfo = notificationSummaryItem.trackingInfo();
                if (landingPage != null && trackingInfo != null) {
                    JSONObject jSONObject2 = trackingInfo.toJSONObject();
                    C8632dsu.a(jSONObject2, "");
                    try {
                        jSONObject2.put("trackId", landingPage.trackId());
                        jSONObject = jSONObject2;
                    } catch (JSONException unused) {
                        return jSONObject2;
                    }
                } else {
                    jSONObject.put("trackId", notificationsListSummary.baseTrackId());
                }
                jSONObject.put("position", i);
                jSONObject.put(Payload.PARAM_MESSAGE_GUID, notificationSummaryItem.messageGuid());
                jSONObject.put("titleId", notificationSummaryItem.videoId());
            } catch (JSONException unused2) {
            }
            return jSONObject;
        }
    }
}
