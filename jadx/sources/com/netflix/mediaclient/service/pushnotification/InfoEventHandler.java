package com.netflix.mediaclient.service.pushnotification;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.graphqlrepo.api.errors.ErrorType;
import com.netflix.mediaclient.graphqlrepo.api.kotlinx.NetflixGraphQLException;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.pushnotification.InfoEventHandler;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.util.ConnectivityUtils;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.Locale;
import java.util.function.Predicate;
import o.AbstractApplicationC1040Mh;
import o.AbstractC0947Is;
import o.AbstractC3855bNd;
import o.C1044Mm;
import o.C1332Xp;
import o.C1825aPq;
import o.C8168dfL;
import o.C8207dfy;
import o.InterfaceC1593aHa;
import o.InterfaceC1912aSw;
import o.InterfaceC3857bNf;
import o.InterfaceC4005bSs;
import o.InterfaceC5134bsy;
import o.InterfaceC5283bvo;
import o.TQ;
import o.aCS;
import o.aOV;
import o.cQF;
import o.cQQ;
import o.dpR;

/* loaded from: classes4.dex */
public class InfoEventHandler {
    private static final long GCM_BROWSE_EVENT_RATE_LIMIT_DELAY_MS = 1000;
    private static final long GCM_NOTIFICATION_LIST_CHANGE_EVENT_RATE_LIMIT_DELAY_MS = 1000;
    private static final String TAG = "nf_push_info";
    protected final InterfaceC1912aSw mBrowseAgent;
    private final InterfaceC3857bNf mCloudGameSSIDBeaconEventHandler;
    private final aOV mConfigAgent;
    private final InterfaceC5134bsy mPushAgent;
    private final PublishSubject<dpR> destroyObservable = PublishSubject.create();
    protected final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private final RefreshListRunnable refreshListRunnable = new RefreshListRunnable();
    private final RefreshLolomoRunnable refreshLolomoRunnable = new RefreshLolomoRunnable();
    private final RefreshAccountDataRunnable refreshAccountDataRunnable = new RefreshAccountDataRunnable();
    private final Runnable refreshSocialNotificationRunnable = new Runnable() { // from class: com.netflix.mediaclient.service.pushnotification.InfoEventHandler.1
        @Override // java.lang.Runnable
        public void run() {
            C1044Mm.a(InfoEventHandler.TAG, "Refreshing socialNotifications via runnable");
            InterfaceC1912aSw interfaceC1912aSw = InfoEventHandler.this.mBrowseAgent;
            if (interfaceC1912aSw != null) {
                interfaceC1912aSw.e(true, false, true, (MessageData) null);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class RefreshListRunnable implements Runnable {
        private String mListContext;
        private String mRenoMessageId;
        private InterfaceC5283bvo mUserProfile;

        public void setParams(String str, String str2, InterfaceC5283bvo interfaceC5283bvo) {
            this.mListContext = str;
            this.mRenoMessageId = str2;
            this.mUserProfile = interfaceC5283bvo;
        }

        private RefreshListRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1044Mm.c(InfoEventHandler.TAG, "Refreshing list %s via runnable", this.mListContext);
            if (AbstractApplicationC1040Mh.getInstance().n()) {
                final Context context = (Context) C1332Xp.b(Context.class);
                final InterfaceC4005bSs a = InterfaceC4005bSs.a(context, this.mUserProfile);
                if (ConnectivityUtils.l(context)) {
                    a.a(this.mListContext, this.mRenoMessageId).onErrorResumeNext(new Function() { // from class: com.netflix.mediaclient.service.pushnotification.InfoEventHandler$RefreshListRunnable$$ExternalSyntheticLambda0
                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj) {
                            CompletableSource lambda$run$1;
                            lambda$run$1 = InfoEventHandler.RefreshListRunnable.lambda$run$1(context, a, (Throwable) obj);
                            return lambda$run$1;
                        }
                    }).onErrorComplete().subscribe();
                }
            } else if (InfoEventHandler.this.mBrowseAgent != null) {
                InterfaceC1593aHa.b(String.format(Locale.ENGLISH, "gcm.%s.refresh", this.mListContext));
                InfoEventHandler.this.mBrowseAgent.e(this.mListContext, (String) null, this.mRenoMessageId, "InfoEventHandler");
                this.mRenoMessageId = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ CompletableSource lambda$run$1(Context context, InterfaceC4005bSs interfaceC4005bSs, Throwable th) {
            if (th instanceof NetflixGraphQLException) {
                NetflixGraphQLException netflixGraphQLException = (NetflixGraphQLException) th;
                if (netflixGraphQLException.d() != null && netflixGraphQLException.d().stream().anyMatch(new Predicate() { // from class: com.netflix.mediaclient.service.pushnotification.InfoEventHandler$RefreshListRunnable$$ExternalSyntheticLambda1
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        boolean lambda$run$0;
                        lambda$run$0 = InfoEventHandler.RefreshListRunnable.lambda$run$0((aCS) obj);
                        return lambda$run$0;
                    }
                }) && ConnectivityUtils.l(context)) {
                    return interfaceC4005bSs.e(1, null, true, false, false);
                }
            }
            return Completable.complete();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$run$0(aCS acs) {
            return acs.b().c() == ErrorType.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class RefreshLolomoRunnable implements Runnable {
        private String mRenoMessageId;
        private InterfaceC5283bvo mUserProfile;

        public void setRenoMessageId(String str, InterfaceC5283bvo interfaceC5283bvo) {
            this.mRenoMessageId = str;
            this.mUserProfile = interfaceC5283bvo;
        }

        public void setUserProfile(InterfaceC5283bvo interfaceC5283bvo) {
            this.mUserProfile = interfaceC5283bvo;
        }

        private RefreshLolomoRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1044Mm.a(InfoEventHandler.TAG, "Refreshing ALL lolomo via runnable");
            Context context = (Context) C1332Xp.b(Context.class);
            if (ConnectivityUtils.l(context)) {
                InterfaceC4005bSs a = InterfaceC4005bSs.a(context, this.mUserProfile);
                a.e().andThen(a.d(this.mRenoMessageId)).onErrorComplete().subscribe();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class RefreshAccountDataRunnable implements Runnable {
        private RefreshAccountDataRunnable() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"CheckResult"})
        public void run() {
            C1044Mm.a(InfoEventHandler.TAG, "MembershipPlanChange, refreshing customer config data");
            new cQF().a(new cQQ(), false).subscribe(new Consumer() { // from class: com.netflix.mediaclient.service.pushnotification.InfoEventHandler$RefreshAccountDataRunnable$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    InfoEventHandler.RefreshAccountDataRunnable.lambda$run$0((Boolean) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$run$0(Boolean bool) {
            C1044Mm.a(InfoEventHandler.TAG, "MembershipPlanChange, success=" + bool);
        }
    }

    public InfoEventHandler(InterfaceC1912aSw interfaceC1912aSw, aOV aov, InterfaceC5134bsy interfaceC5134bsy, InterfaceC3857bNf interfaceC3857bNf) {
        this.mBrowseAgent = interfaceC1912aSw;
        this.mConfigAgent = aov;
        this.mPushAgent = interfaceC5134bsy;
        this.mCloudGameSSIDBeaconEventHandler = interfaceC3857bNf;
    }

    public void handleEvent(Context context, InterfaceC5134bsy interfaceC5134bsy, TQ tq, Payload payload, Intent intent, InterfaceC5283bvo interfaceC5283bvo) {
        if (interfaceC5283bvo != null && C8168dfL.h(payload.profileGuid)) {
            boolean d = C8168dfL.d(payload.renoMessageType, Payload.PARAM_RENO_MESSAGE_TYPE_PROFILE_CHANGE);
            String profileGuid = interfaceC5283bvo.getProfileGuid();
            if (!C8168dfL.d(profileGuid, payload.profileGuid) && !d) {
                C1044Mm.e(TAG, String.format("drop push event - currentProfile :%s != profileGuid:%s", profileGuid, payload.profileGuid));
                return;
            }
        } else {
            C1044Mm.j(TAG, "processing message, payload has no profileId or currentProfile is null ");
        }
        boolean b = C8207dfy.b(intent, "isRunning");
        boolean b2 = AbstractC0947Is.b();
        boolean equalsIgnoreCase = "true".equalsIgnoreCase(payload.hasPing);
        if (equalsIgnoreCase) {
            C1044Mm.e(TAG, "received message contains ping param. reporting current state");
            interfaceC5134bsy.report(C1825aPq.b(context), AppView.homeTab);
        }
        if ((!b2) && !b && !equalsIgnoreCase) {
            C1044Mm.e(TAG, "handleEvent bailing because !wasServiceRunning && !isWidgetInstalled");
            killSelf(tq);
        } else if (interfaceC5283bvo == null) {
            C1044Mm.e(TAG, String.format("currentProfile null dropping gcm event payload:%s", payload));
        } else if (Payload.PARAM_RENO_MESSAGE_TYPE_NEW_LOLOMO.equalsIgnoreCase(payload.renoMessageType)) {
            handleLolomoRefreshEvent(context, tq, b, payload, interfaceC5283bvo);
        } else if (Payload.PARAM_RENO_MESSAGE_TYPE_REFRESH_LIST.equalsIgnoreCase(payload.renoMessageType)) {
            String str = payload.renoRefreshListContext;
            String str2 = payload.renoInvisibleMessageId;
            if (str2 == null) {
                str2 = payload.messageGuid;
            }
            handleRefreshListEvent(b, str, str2, interfaceC5283bvo);
        } else if (Payload.PARAM_RENO_MESSAGE_TYPE_MEMBERSHIP_PLAN_CHANGE.equalsIgnoreCase(payload.renoMessageType)) {
            handleMembershipPlanChangeEvent();
        } else if (Payload.PARAM_RENO_MESSAGE_TYPE_PROFILE_CHANGE.equalsIgnoreCase(payload.renoMessageType)) {
            handleProfileChangeEvent(payload.profileGuid);
        } else if (Payload.ActionInfoType.isNotificationReadEvent(payload.actionInfoType)) {
            handleNReadEvent(b);
        } else if (Payload.ActionInfoType.isNotificationListChangedEvent(payload.actionInfoType)) {
            handleNListChangeEvent(b);
        } else {
            AbstractC3855bNd abstractC3855bNd = payload.cloudGameSSIDBeacon;
            if (abstractC3855bNd != null) {
                this.mCloudGameSSIDBeaconEventHandler.d(this.mMainHandler, abstractC3855bNd);
            } else {
                C1044Mm.a(TAG, "unknown message - dropping - %s", payload);
            }
        }
    }

    private void handleLolomoRefreshEvent(Context context, TQ tq, boolean z, Payload payload, InterfaceC5283bvo interfaceC5283bvo) {
        if (!z) {
            killSelf(tq);
            return;
        }
        this.mMainHandler.removeCallbacks(this.refreshLolomoRunnable);
        String str = payload.renoInvisibleMessageId;
        if (str == null) {
            str = payload.messageGuid;
        }
        if (!TextUtils.isEmpty(str)) {
            this.refreshLolomoRunnable.setRenoMessageId(str, interfaceC5283bvo);
        }
        this.mMainHandler.postDelayed(this.refreshLolomoRunnable, getBrowseEventRateLimitMs());
    }

    private void handleRefreshListEvent(boolean z, String str, String str2, InterfaceC5283bvo interfaceC5283bvo) {
        if (z) {
            this.refreshListRunnable.setParams(str, str2, interfaceC5283bvo);
            this.mMainHandler.removeCallbacks(this.refreshListRunnable);
            this.mMainHandler.postDelayed(this.refreshListRunnable, getBrowseEventRateLimitMs());
        }
    }

    private void handleMembershipPlanChangeEvent() {
        this.mMainHandler.post(this.refreshAccountDataRunnable);
    }

    private void handleProfileChangeEvent(String str) {
        if (ConfigFastPropertyFeatureControlConfig.Companion.m()) {
            C1044Mm.a(TAG, "ProfileChange, refreshing account data");
            UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
            if (k != null) {
                k.a(str);
            } else {
                C1044Mm.j(TAG, "ProfileChange event dropped: userAgent was null.");
            }
        }
    }

    private void handleNReadEvent(boolean z) {
        if (z) {
            C1044Mm.e(TAG, "handling EVENT_NOTIFICATION_READ");
            this.mMainHandler.removeCallbacks(this.refreshSocialNotificationRunnable);
            this.mMainHandler.postDelayed(this.refreshSocialNotificationRunnable, getNListChangeEventRateLimit());
        }
    }

    private void handleNListChangeEvent(boolean z) {
        if (z) {
            C1044Mm.e(TAG, "handling EVENT_NOTIFICATION_LIST_CHANGED");
            this.mMainHandler.removeCallbacks(this.refreshSocialNotificationRunnable);
            this.mMainHandler.postDelayed(this.refreshSocialNotificationRunnable, getNListChangeEventRateLimit());
        }
    }

    private void killSelf(TQ tq) {
        C1044Mm.e(TAG, "Skip handling event - gcmInfoEvent woke up netflixService intent: ");
        this.mPushAgent.informServiceStartedOnGcmInfo();
        this.destroyObservable.onNext(dpR.c);
        this.destroyObservable.onComplete();
        C1044Mm.a(TAG, "kill service in %d ms", 600000L);
        tq.a(600000L);
    }

    protected long getBrowseEventRateLimitMs() {
        int S = this.mConfigAgent.S();
        if (S < 0) {
            return 0L;
        }
        if (S > 0) {
            return S * 1000;
        }
        return 1000L;
    }

    private long getNListChangeEventRateLimit() {
        int R = this.mConfigAgent.R();
        if (R < 0) {
            return 0L;
        }
        if (R > 0) {
            return R * 1000;
        }
        return 1000L;
    }
}
