package o;

import android.content.Intent;
import android.util.Base64;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.command.ViewProfilesCommand;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.service.webclient.volley.StatusCodeError;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.model.leafs.social.UserNotificationLandingTrackingInfo;
import com.netflix.model.leafs.social.multititle.NotificationLandingPage;
import com.netflix.model.leafs.social.multititle.NotificationModule;
import com.netflix.model.leafs.social.multititle.NotificationModuleList;
import com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule;
import com.netflix.model.leafs.social.multititle.NotificationTemplate;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.rxkotlin.SubscribersKt;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC3643bFl;
import o.InterfaceC5157btU;
import o.aKS;
import o.aLN;
import o.dpR;

/* loaded from: classes3.dex */
public final class aKS implements aKP {
    public static final e a;
    private static int d = 1;
    private static int e;
    private static byte e$ss2$154;
    private final Map<String, String> b;
    private final InterfaceC7084cpY c;

    @AssistedFactory
    /* loaded from: classes3.dex */
    public interface d {
        aKS c(Map<String, String> map);
    }

    static {
        c();
        a = new e(null);
    }

    static void c() {
        e$ss2$154 = (byte) 24;
    }

    @AssistedInject
    public aKS(InterfaceC7084cpY interfaceC7084cpY, @Assisted Map<String, String> map) {
        C8632dsu.c((Object) interfaceC7084cpY, "");
        C8632dsu.c((Object) map, "");
        this.c = interfaceC7084cpY;
        this.b = map;
    }

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("NetflixComNotificationHandler");
        }
    }

    @Override // o.aKP
    public boolean c(List<String> list) {
        C8632dsu.c((Object) list, "");
        return list.size() > 1;
    }

    /* loaded from: classes3.dex */
    public static final class a<T> implements ObservableOnSubscribe {
        final /* synthetic */ LifecycleOwner b;

        public a(LifecycleOwner lifecycleOwner) {
            this.b = lifecycleOwner;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(final ObservableEmitter<dpR> observableEmitter) {
            C8632dsu.c((Object) observableEmitter, "");
            LifecycleOwner lifecycleOwner = this.b;
            if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                observableEmitter.onNext(dpR.c);
                observableEmitter.onComplete();
                return;
            }
            this.b.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.protocol.netflixcom.DeepLinkNotificationHandler$triggerRatingInputNetworkCallIfRequired$lambda$3$$inlined$createDestroyObservable$1$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner2) {
                    C8632dsu.c((Object) lifecycleOwner2, "");
                    if (!ObservableEmitter.this.isDisposed()) {
                        ObservableEmitter.this.onNext(dpR.c);
                        try {
                            ObservableEmitter.this.onComplete();
                        } catch (CancellationException unused) {
                        }
                    }
                    super.onDestroy(lifecycleOwner2);
                }
            });
        }
    }

    @Override // o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) list, "");
        if (list.size() > 1) {
            String str2 = list.get(1);
            if (str2.length() > 0) {
                e(netflixActivity, str2);
            }
        }
        return NflxHandler.Response.HANDLING_WITH_DELAY;
    }

    @Override // o.aKP
    /* renamed from: a */
    public ViewProfilesCommand d() {
        return new ViewProfilesCommand();
    }

    private final void e(NetflixActivity netflixActivity, String str) {
        netflixActivity.getServiceManager().j().e(str, false, (InterfaceC5094bsK) new b(netflixActivity, str));
    }

    /* loaded from: classes3.dex */
    public static final class b extends AbstractC5164btb {
        final /* synthetic */ NetflixActivity a;
        final /* synthetic */ String e;

        b(NetflixActivity netflixActivity, String str) {
            this.a = netflixActivity;
            this.e = str;
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void c(NotificationSummaryItem notificationSummaryItem, Status status) {
            Map d;
            Map k;
            Throwable th;
            Map d2;
            Map k2;
            Throwable th2;
            boolean g;
            C8632dsu.c((Object) status, "");
            super.c(notificationSummaryItem, status);
            if (notificationSummaryItem != null) {
                if (notificationSummaryItem.landingPage() != null) {
                    aKS.this.d(this.a, notificationSummaryItem.landingPage(), notificationSummaryItem.trackingInfo());
                    return;
                }
                String videoId = notificationSummaryItem.videoId();
                if (videoId != null) {
                    g = C8691duz.g(videoId);
                    if (!g) {
                        e eVar = aKS.a;
                        InterfaceC3643bFl.c.a(InterfaceC3643bFl.c.a(this.a), this.a, notificationSummaryItem.videoType(), videoId, notificationSummaryItem.videoTitle(), new TrackingInfoHolder(PlayLocationType.DEEPLINK).d(Integer.parseInt(videoId), new EmptyPlayContext(eVar.getLogTag(), -550)), eVar.getLogTag(), null, 64, null);
                    }
                }
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                String str = aKS.a.getLogTag() + ": error - videoId is null for eventGuid: " + this.e;
                d2 = dqE.d();
                k2 = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd(str, null, null, false, k2, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        c1596aHd.a(errorType.c() + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    Throwable th3 = c1596aHd.i;
                    if (th3 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th3 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } else {
                        th2 = th3;
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            } else {
                InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                String str2 = aKS.a.getLogTag() + ": error - notification is null for eventGuid: " + this.e;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd2 = new C1596aHd(str2, null, null, false, k, false, false, 96, null);
                ErrorType errorType2 = c1596aHd2.a;
                if (errorType2 != null) {
                    c1596aHd2.e.put("errorType", errorType2.c());
                    String b2 = c1596aHd2.b();
                    if (b2 != null) {
                        c1596aHd2.a(errorType2.c() + " " + b2);
                    }
                }
                if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                    th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                } else if (c1596aHd2.b() != null) {
                    th = new Throwable(c1596aHd2.b());
                } else {
                    Throwable th4 = c1596aHd2.i;
                    if (th4 == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th4 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } else {
                        th = th4;
                    }
                }
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar2.a();
                if (a2 != null) {
                    a2.e(c1596aHd2, th);
                } else {
                    dVar2.e().b(c1596aHd2, th);
                }
            }
            C8194dfl.c(this.a);
        }
    }

    private final void c(NetflixActivity netflixActivity, NotificationLandingPage notificationLandingPage, UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo) {
        if (notificationLandingPage != null) {
            InterfaceC7084cpY interfaceC7084cpY = this.c;
            Map<String, String> map = this.b;
            netflixActivity.startActivity(interfaceC7084cpY.b(netflixActivity, notificationLandingPage, userNotificationLandingTrackingInfo, map instanceof HashMap ? (HashMap) map : null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(final NetflixActivity netflixActivity, final NotificationLandingPage notificationLandingPage, final UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo) {
        NotificationModule notificationModule;
        int i;
        NotificationTemplate template;
        NotificationModuleList modulesList;
        List<NotificationModule> modules;
        Object obj;
        String str = this.b.get("thumbs");
        if (str == null) {
            str = "ratingInput";
        }
        int hashCode = str.hashCode();
        if (hashCode == -1699402849 ? str.equals("thumbsDown") : hashCode == 1566945496 ? str.equals("thumbsUp") : !(hashCode != 1660950217 || !str.equals("thumbsUpDouble"))) {
            if (notificationLandingPage == null || (template = notificationLandingPage.template()) == null || (modulesList = template.modulesList()) == null || (modules = modulesList.modules()) == null) {
                notificationModule = null;
            } else {
                C8632dsu.d(modules);
                Iterator<T> it = modules.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((NotificationModule) obj) instanceof NotificationRatingInfoModule) {
                        break;
                    }
                }
                notificationModule = (NotificationModule) obj;
            }
            NotificationRatingInfoModule notificationRatingInfoModule = notificationModule instanceof NotificationRatingInfoModule ? (NotificationRatingInfoModule) notificationModule : null;
            if (notificationRatingInfoModule != null) {
                if (C8632dsu.c((Object) str, (Object) "thumbsUp")) {
                    i = 2;
                } else {
                    i = C8632dsu.c((Object) str, (Object) "thumbsUpDouble") ? 3 : 1;
                }
                aLN.b bVar = aLN.a;
                Observable<dpR> subscribeOn = Observable.create(new a(netflixActivity)).subscribeOn(AndroidSchedulers.mainThread());
                C8632dsu.a(subscribeOn, "");
                aLP a2 = bVar.a(subscribeOn);
                final Long startSession = Logger.INSTANCE.startSession(cPU.e.d(i, AppView.thumbButton, AppView.notificationItem, userNotificationLandingTrackingInfo != null ? CLv2Utils.a(userNotificationLandingTrackingInfo) : null));
                if (SubscribersKt.subscribeBy$default(a2.e(new C1004Kx(String.valueOf(notificationRatingInfoModule.titleId()), i, notificationLandingPage.trackId())), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.protocol.netflixcom.DeepLinkNotificationHandler$triggerRatingInputNetworkCallIfRequired$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        c(th);
                        return dpR.c;
                    }

                    public final void c(Throwable th) {
                        StatusCode statusCode;
                        C8632dsu.c((Object) th, "");
                        if (th instanceof StatusCodeError) {
                            statusCode = ((StatusCodeError) th).d();
                        } else {
                            statusCode = StatusCode.UNKNOWN;
                        }
                        aKS aks = aKS.this;
                        NetflixActivity netflixActivity2 = netflixActivity;
                        Long l = startSession;
                        C8632dsu.d(statusCode);
                        aks.c(netflixActivity2, l, statusCode);
                    }
                }, (drO) null, new drM<Pair<? extends InterfaceC5157btU, ? extends Status>, dpR>() { // from class: com.netflix.mediaclient.protocol.netflixcom.DeepLinkNotificationHandler$triggerRatingInputNetworkCallIfRequired$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Pair<? extends InterfaceC5157btU, ? extends Status> pair) {
                        d(pair);
                        return dpR.c;
                    }

                    public final void d(Pair<? extends InterfaceC5157btU, ? extends Status> pair) {
                        C8632dsu.c((Object) pair, "");
                        InterfaceC5157btU d2 = pair.d();
                        Status a3 = pair.a();
                        if (a3.j() && d2 != null) {
                            Logger.INSTANCE.endSession(startSession);
                            this.a(netflixActivity, notificationLandingPage, userNotificationLandingTrackingInfo);
                            return;
                        }
                        aKS aks = this;
                        NetflixActivity netflixActivity2 = netflixActivity;
                        Long l = startSession;
                        StatusCode c = a3.c();
                        C8632dsu.a(c, "");
                        aks.c(netflixActivity2, l, c);
                    }
                }, 2, (Object) null) != null) {
                    return;
                }
            }
            a(netflixActivity, notificationLandingPage, userNotificationLandingTrackingInfo);
            dpR dpr = dpR.c;
            return;
        }
        a(netflixActivity, notificationLandingPage, userNotificationLandingTrackingInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(NetflixActivity netflixActivity, Long l, StatusCode statusCode) {
        int i = 2 % 2;
        int i2 = e + 115;
        d = i2 % 128;
        int i3 = i2 % 2;
        ExtLogger.INSTANCE.failedAction(l, C8169dfM.b(statusCode));
        String string = netflixActivity.getString(com.netflix.mediaclient.ui.R.o.dI);
        if (string.startsWith("'!#+")) {
            int i4 = d + 7;
            e = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            f(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        C8054ddD.a(netflixActivity, string, 0);
        this.c.d(netflixActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(NetflixActivity netflixActivity, NotificationLandingPage notificationLandingPage, UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo) {
        c(netflixActivity, notificationLandingPage, userNotificationLandingTrackingInfo);
        C8194dfl.c(netflixActivity);
        this.c.d(netflixActivity);
    }

    private void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$154);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
