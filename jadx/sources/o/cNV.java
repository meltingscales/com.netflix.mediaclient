package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.discrete.experimentation.FlexEvent;
import com.netflix.cl.model.event.session.action.SelectProfile;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.profiles.ProfileSelectorImpl$showDialog$observable$1;
import com.netflix.mediaclient.ui.profiles.ProfileSelectorImpl$showDialog$observable$2;
import com.netflix.mediaclient.util.ConnectivityUtils;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.AbstractC7431cwA;
import o.C8169dfM;
import o.C8632dsu;
import o.cNV;
import o.cNW;
import o.dpR;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class cNV extends C1045Mp implements cNW {
    private static boolean d;
    public static final cNV e = new cNV();
    public static final int b = 8;

    @Override // o.cNW
    public boolean b() {
        return d;
    }

    @Override // o.cNW
    public void c(boolean z) {
        d = z;
    }

    private cNV() {
        super("ProfileSelectorImpl");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (ObservableSource) drm.invoke(obj);
    }

    private final boolean d(NetflixActivity netflixActivity, InterfaceC5283bvo interfaceC5283bvo) {
        InterfaceC5283bvo a = C8126deW.a(netflixActivity);
        return a != null && C8168dfL.d(a.getProfileGuid(), interfaceC5283bvo.getProfileGuid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cNW.b h(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (cNW.b) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<cNW.b> e(final NetflixActivity netflixActivity, final ServiceManager serviceManager, final InterfaceC5283bvo interfaceC5283bvo, final Long l) {
        Observable<cNW.b> create;
        if (!d(netflixActivity, interfaceC5283bvo)) {
            if (!ConnectivityUtils.l(netflixActivity)) {
                create = Observable.just(new cNW.b(1, InterfaceC1078Nw.aG, false, 4, null));
            } else {
                create = Observable.create(new ObservableOnSubscribe() { // from class: o.cNZ
                    @Override // io.reactivex.ObservableOnSubscribe
                    public final void subscribe(ObservableEmitter observableEmitter) {
                        cNV.a(NetflixActivity.this, serviceManager, interfaceC5283bvo, l, observableEmitter);
                    }
                });
            }
            C8632dsu.d(create);
            return create;
        }
        getLogTag();
        Observable<cNW.b> just = Observable.just(new cNW.b(3, null, false, 6, null));
        C8632dsu.d(just);
        return just;
    }

    /* loaded from: classes4.dex */
    public static final class c extends BroadcastReceiver {
        final /* synthetic */ InterfaceC5283bvo a;
        final /* synthetic */ NetflixActivity b;
        final /* synthetic */ ObservableEmitter<cNW.b> d;

        c(NetflixActivity netflixActivity, ObservableEmitter<cNW.b> observableEmitter, InterfaceC5283bvo interfaceC5283bvo) {
            this.b = netflixActivity;
            this.d = observableEmitter;
            this.a = interfaceC5283bvo;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            if (intent == null || (action = intent.getAction()) == null) {
                return;
            }
            NetflixActivity netflixActivity = this.b;
            ObservableEmitter<cNW.b> observableEmitter = this.d;
            InterfaceC5283bvo interfaceC5283bvo = this.a;
            int hashCode = action.hashCode();
            if (hashCode != -996035406) {
                if (hashCode == 1606046696 && action.equals("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_ACTIVE")) {
                    cNV cnv = cNV.e;
                    cnv.getLogTag();
                    LocalBroadcastManager.getInstance(netflixActivity).unregisterReceiver(this);
                    C8632dsu.d(observableEmitter);
                    cnv.b(observableEmitter, netflixActivity, interfaceC5283bvo);
                }
            } else if (action.equals("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_SELECTION_RESULT")) {
                StatusCode statusCode = StatusCode.OK;
                StatusCode statusCodeByValue = StatusCode.getStatusCodeByValue(intent.getIntExtra("com.netflix.mediaclient.intent.action.EXTRA_USER_PROFILE_SELECTION_RESULT_INT", statusCode.getValue()));
                C8632dsu.a(statusCodeByValue, "");
                if (statusCodeByValue != statusCode) {
                    LocalBroadcastManager.getInstance(netflixActivity).unregisterReceiver(this);
                    NetflixStatus netflixStatus = new NetflixStatus(statusCodeByValue);
                    netflixStatus.c(true);
                    if (observableEmitter.isDisposed()) {
                        return;
                    }
                    observableEmitter.onNext(new cNW.b(1, netflixStatus, false, 4, null));
                    observableEmitter.onComplete();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public final void b(ObservableEmitter<cNW.b> observableEmitter, NetflixActivity netflixActivity, InterfaceC5283bvo interfaceC5283bvo) {
        if (observableEmitter.isDisposed()) {
            return;
        }
        if (!C8153dex.e(interfaceC5283bvo)) {
            a(this, (ObservableEmitter) observableEmitter, false, 2, (Object) null);
            return;
        }
        UserAgent userAgent = netflixActivity.getUserAgent();
        if (userAgent != null) {
            userAgent.d(new e(interfaceC5283bvo, observableEmitter, netflixActivity));
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends C5015bql {
        final /* synthetic */ NetflixActivity a;
        final /* synthetic */ InterfaceC5283bvo b;
        final /* synthetic */ ObservableEmitter<cNW.b> d;

        e(InterfaceC5283bvo interfaceC5283bvo, ObservableEmitter<cNW.b> observableEmitter, NetflixActivity netflixActivity) {
            this.b = interfaceC5283bvo;
            this.d = observableEmitter;
            this.a = netflixActivity;
        }

        @Override // o.C5015bql, o.InterfaceC5018bqo
        public void a(boolean z, Status status) {
            C8632dsu.c((Object) status, "");
            cNV cnv = cNV.e;
            cnv.getLogTag();
            if (z) {
                Logger.INSTANCE.logEvent(new FlexEvent("MobileOnrampEligible", new String[0], new JSONObject(), new JSONObject()));
                if (!C8153dex.c(this.b)) {
                    cNV.a(cnv, (ObservableEmitter) this.d, false, 2, (Object) null);
                    return;
                }
                Observable<Boolean> take = C4987bqJ.d().takeUntil(this.a.getActivityDestroy()).take(1L);
                C8632dsu.a(take, "");
                final ObservableEmitter<cNW.b> observableEmitter = this.d;
                drM<Throwable, dpR> drm = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileSelectorImpl$handleProfileActive$1$onVerified$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        a(th);
                        return dpR.c;
                    }

                    public final void a(Throwable th) {
                        C8632dsu.c((Object) th, "");
                        cNV.a(cNV.e, (ObservableEmitter) observableEmitter, false, 2, (Object) null);
                    }
                };
                final ObservableEmitter<cNW.b> observableEmitter2 = this.d;
                SubscribersKt.subscribeBy$default(take, drm, (drO) null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileSelectorImpl$handleProfileActive$1$onVerified$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Boolean bool) {
                        d(bool);
                        return dpR.c;
                    }

                    public final void d(Boolean bool) {
                        cNV cnv2 = cNV.e;
                        cnv2.getLogTag();
                        ObservableEmitter<cNW.b> observableEmitter3 = observableEmitter2;
                        C8632dsu.d(bool);
                        cnv2.c(observableEmitter3, bool.booleanValue());
                    }
                }, 2, (Object) null);
                this.a.startActivity(cVB.a(this.a, SignupConstants.Flow.PROFILE_ONBOARDING, SignupConstants.Mode.SECONDARY_LANGUAGES));
                return;
            }
            cNV.a(cnv, (ObservableEmitter) this.d, false, 2, (Object) null);
        }
    }

    public static /* synthetic */ void a(cNV cnv, ObservableEmitter observableEmitter, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        cnv.c(observableEmitter, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(ObservableEmitter<cNW.b> observableEmitter, boolean z) {
        observableEmitter.onNext(new cNW.b(0, null, z));
        observableEmitter.onComplete();
    }

    @Override // o.cNW
    public Observable<cNW.b> e(Activity activity, InterfaceC5283bvo interfaceC5283bvo, AppView appView) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC5283bvo, "");
        C8632dsu.c((Object) appView, "");
        getLogTag();
        final Long startSession = Logger.INSTANCE.startSession(new SelectProfile(AppView.profileAvatar, interfaceC5283bvo.getProfileGuid(), appView, CommandValue.SelectProfileCommand, null));
        Observable<cNW.b> d2 = d((NetflixActivity) C9737vz.e(activity, NetflixActivity.class), interfaceC5283bvo, startSession);
        final drM<cNW.b, dpR> drm = new drM<cNW.b, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileSelectorImpl$selectProfile$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cNW.b bVar) {
                b(bVar);
                return dpR.c;
            }

            public final void b(cNW.b bVar) {
                int a = bVar.a();
                if (a == 0) {
                    cNV.e.c(true);
                    Logger.INSTANCE.endSession(startSession);
                } else if (a == 1) {
                    cNV.e.c(false);
                    ExtLogger.INSTANCE.failedAction(startSession, CLv2Utils.a(C8169dfM.c(bVar.c())));
                } else if (a == 2) {
                    cNV.e.c(false);
                    Logger.INSTANCE.cancelSession(startSession);
                } else if (a != 3) {
                } else {
                    cNV.e.c(false);
                    Logger.INSTANCE.endSession(startSession);
                }
            }
        };
        Observable<cNW.b> doOnNext = d2.doOnNext(new Consumer() { // from class: o.cNX
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                cNV.g(drM.this, obj);
            }
        });
        C8632dsu.a(doOnNext, "");
        return doOnNext;
    }

    private final Observable<cNW.b> d(final NetflixActivity netflixActivity, final InterfaceC5283bvo interfaceC5283bvo, final Long l) {
        getLogTag();
        if (netflixActivity.getSupportFragmentManager().isStateSaved()) {
            Observable<cNW.b> just = Observable.just(new cNW.b(2, InterfaceC1078Nw.e, false, 4, null));
            C8632dsu.a(just, "");
            return just;
        }
        final ServiceManager serviceManager = netflixActivity.getServiceManager();
        if (!serviceManager.c()) {
            Observable<cNW.b> just2 = Observable.just(new cNW.b(1, InterfaceC1078Nw.aK, false, 4, null));
            C8632dsu.a(just2, "");
            return just2;
        } else if (interfaceC5283bvo.isProfileLocked()) {
            Observable<cNW.b> e2 = e(netflixActivity, interfaceC5283bvo);
            final drM<cNW.b, ObservableSource<? extends cNW.b>> drm = new drM<cNW.b, ObservableSource<? extends cNW.b>>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileSelectorImpl$performChecksAndChangeProfile$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: a */
                public final ObservableSource<? extends cNW.b> invoke(cNW.b bVar) {
                    Observable e3;
                    C8632dsu.c((Object) bVar, "");
                    if (bVar.a() == 0) {
                        e3 = cNV.e.e(NetflixActivity.this, serviceManager, interfaceC5283bvo, l);
                        return e3;
                    }
                    Observable just3 = Observable.just(bVar);
                    C8632dsu.d(just3);
                    return just3;
                }
            };
            Observable flatMap = e2.flatMap(new Function() { // from class: o.cNS
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    ObservableSource a;
                    a = cNV.a(drM.this, obj);
                    return a;
                }
            });
            C8632dsu.d(flatMap);
            return flatMap;
        } else {
            return e(netflixActivity, serviceManager, interfaceC5283bvo, l);
        }
    }

    private final Observable<cNW.b> e(NetflixActivity netflixActivity, InterfaceC5283bvo interfaceC5283bvo) {
        getLogTag();
        C7432cwB e2 = C7432cwB.a.e(netflixActivity, interfaceC5283bvo);
        Observable<AbstractC7431cwA> e3 = e2.e();
        final ProfileSelectorImpl$showDialog$observable$1 profileSelectorImpl$showDialog$observable$1 = new drM<AbstractC7431cwA, Boolean>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileSelectorImpl$showDialog$observable$1
            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(AbstractC7431cwA abstractC7431cwA) {
                C8632dsu.c((Object) abstractC7431cwA, "");
                return Boolean.valueOf(((abstractC7431cwA instanceof AbstractC7431cwA.a) && ((AbstractC7431cwA.a) abstractC7431cwA).b()) ? false : true);
            }
        };
        Observable<AbstractC7431cwA> filter = e3.filter(new Predicate() { // from class: o.cOa
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean f;
                f = cNV.f(drM.this, obj);
                return f;
            }
        });
        final ProfileSelectorImpl$showDialog$observable$2 profileSelectorImpl$showDialog$observable$2 = new drM<AbstractC7431cwA, cNW.b>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileSelectorImpl$showDialog$observable$2
            @Override // o.drM
            /* renamed from: a */
            public final cNW.b invoke(AbstractC7431cwA abstractC7431cwA) {
                C8632dsu.c((Object) abstractC7431cwA, "");
                return C8632dsu.c(abstractC7431cwA, AbstractC7431cwA.c.a) ? new cNW.b(0, null, false, 6, null) : C8632dsu.c(abstractC7431cwA, AbstractC7431cwA.b.c) ? new cNW.b(2, null, false, 6, null) : new cNW.b(1, null, false, 6, null);
            }
        };
        Observable map = filter.map(new Function() { // from class: o.cOb
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                cNW.b h;
                h = cNV.h(drM.this, obj);
                return h;
            }
        });
        e2.show(netflixActivity.getSupportFragmentManager(), NetflixActivity.FRAG_DIALOG_TAG);
        C8632dsu.d(map);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(NetflixActivity netflixActivity, ServiceManager serviceManager, InterfaceC5283bvo interfaceC5283bvo, Long l, ObservableEmitter observableEmitter) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) serviceManager, "");
        C8632dsu.c((Object) interfaceC5283bvo, "");
        C8632dsu.c((Object) observableEmitter, "");
        e.getLogTag();
        c cVar = new c(netflixActivity, observableEmitter, interfaceC5283bvo);
        netflixActivity.registerReceiverLocallyWithAutoUnregister(cVar, "com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_ACTIVE");
        netflixActivity.registerReceiverLocallyWithAutoUnregister(cVar, "com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_SELECTION_RESULT");
        serviceManager.a(interfaceC5283bvo.getProfileGuid(), l);
    }
}
