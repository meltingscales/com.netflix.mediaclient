package com.netflix.mediaclient.service.pushnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.PushNotificationType;
import com.netflix.cl.model.context.CLContext;
import com.netflix.cl.model.context.android.AmazonPushNotificationOptions;
import com.netflix.cl.model.context.android.AndroidPushNotificationOptions;
import com.netflix.cl.model.event.discrete.PushNotificationAcknowledged;
import com.netflix.cl.model.event.discrete.PushNotificationDismissed;
import com.netflix.cl.model.event.discrete.PushNotificationReceived;
import com.netflix.cl.model.event.session.RegisterForPushNotificationsEnded;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.action.RegisterForPushNotifications;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.StopReason;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_SmartDisplay;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.util.NotificationUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.AbstractApplicationC1040Mh;
import o.C1044Mm;
import o.C1071Np;
import o.C1079Nx;
import o.C1332Xp;
import o.C1825aPq;
import o.C8054ddD;
import o.C8055ddE;
import o.C8067ddQ;
import o.C8116deM;
import o.C8119deP;
import o.C8150deu;
import o.C8151dev;
import o.C8157dfA;
import o.C8168dfL;
import o.C8179dfW;
import o.InterfaceC1078Nw;
import o.InterfaceC1598aHf;
import o.InterfaceC1912aSw;
import o.InterfaceC3856bNe;
import o.InterfaceC3857bNf;
import o.InterfaceC5104bsU;
import o.InterfaceC5134bsy;
import o.InterfaceC7089cpd;
import o.InterfaceC9638uF;
import o.NJ;
import o.TQ;
import o.aMF;
import o.aSD;
import o.aUD;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class PushNotificationAgent extends aMF implements InterfaceC5134bsy {
    static final long SERVICE_KILL_DELAY_WAKED_BY_GCM_MS = 600000;
    private static final String TAG = "nf_push";
    private static int idCounter = -1;
    private final InterfaceC3857bNf mCloudGameSSIDBeaconEventHandler;
    private final InterfaceC3856bNe mCloudGameSSIDBeaconJsonAdapter;
    protected Context mContext;
    protected NotificationUserSettings mCurrentUserSettings;
    private InterfaceC9638uF mImageLoaderRepository;
    private InfoEventHandler mInfoEventHandler;
    private boolean mPushInfoEventStartedService;
    private Map<String, NotificationUserSettings> mSettings;
    private final UserAgent mUserAgent;
    protected String registrationId;
    private List<InterfaceC5104bsU.a> mRegistrationListeners = Collections.synchronizedList(new ArrayList());
    private final BroadcastReceiver pushNotificationReceiver = new BroadcastReceiver() { // from class: com.netflix.mediaclient.service.pushnotification.PushNotificationAgent.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("com.netflix.mediaclient.intent.action.PUSH_ONLOGIN".equals(action)) {
                C1044Mm.e(PushNotificationAgent.TAG, "onLogin");
                PushNotificationAgent.this.onLogin();
            } else if ("com.netflix.mediaclient.intent.action.PUSH_ONLOGOUT".equals(action)) {
                C1044Mm.e(PushNotificationAgent.TAG, "onLogout");
                PushNotificationAgent.this.onLogout(PushNotificationAgent.this.createUserData(intent));
            } else if ("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTIN".equals(action)) {
                C1044Mm.e(PushNotificationAgent.TAG, "optIn");
                PushNotificationAgent.this.onNotificationOptIn(true);
            } else if ("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTOUT".equals(action)) {
                C1044Mm.e(PushNotificationAgent.TAG, "optOut");
                PushNotificationAgent.this.onNotificationOptIn(false);
            }
        }
    };

    public String getRegistrationId() {
        return this.registrationId;
    }

    public abstract boolean isPushSupported();

    public void onBackground() {
    }

    public void onForeground() {
    }

    public void onProfileChange() {
    }

    public void start() {
    }

    public void stop() {
    }

    public PushNotificationAgent(Context context, UserAgent userAgent, InterfaceC3857bNf interfaceC3857bNf, InterfaceC3856bNe interfaceC3856bNe) {
        Objects.requireNonNull(context);
        this.mContext = context;
        this.mUserAgent = userAgent;
        this.mCloudGameSSIDBeaconEventHandler = interfaceC3857bNf;
        this.mCloudGameSSIDBeaconJsonAdapter = interfaceC3856bNe;
        C1044Mm.e(TAG, "PushNotificationAgent::");
    }

    @Override // o.aMF
    public void doInit() {
        loadConfiguration();
        registerReceiver();
        this.mImageLoaderRepository = InterfaceC9638uF.a.d(this.mContext);
    }

    @Override // o.aMF
    public void destroy() {
        unregisterReceiver();
        super.destroy();
    }

    private void loadConfiguration() {
        this.mSettings = NotificationUserSettings.loadSettings(getContext());
    }

    private void validateCurrentUser() {
        String e = this.mUserAgent.e();
        if (C8168dfL.g(e)) {
            C1044Mm.d(TAG, "accountOwnerToken ID is empty! nonMember/formerMember ?");
            return;
        }
        NotificationUserSettings notificationUserSettings = this.mCurrentUserSettings;
        if (notificationUserSettings == null || !e.equals(notificationUserSettings.accountOwnerToken)) {
            C1044Mm.e(TAG, "We DO NOT have user! Try to find it from settings");
            NotificationUserSettings notificationUserSettings2 = this.mSettings.get(e);
            this.mCurrentUserSettings = notificationUserSettings2;
            if (notificationUserSettings2 == null) {
                C1044Mm.e(TAG, "User was not know from before");
                this.mCurrentUserSettings = createNewCurrentUserSettings(e);
                return;
            }
            C1044Mm.a(TAG, "User was know from before and he opted in %b", Boolean.valueOf(notificationUserSettings2.optedIn));
        }
    }

    private NotificationUserSettings createNewCurrentUserSettings(String str) {
        NotificationUserSettings notificationUserSettings = new NotificationUserSettings();
        notificationUserSettings.accountOwnerToken = str;
        notificationUserSettings.oldAppVersion = C8055ddE.c(getContext());
        notificationUserSettings.optedIn = true;
        C1044Mm.a(TAG, "creating settings optIn: %s", true);
        this.mSettings.put(str, notificationUserSettings);
        saveSettings();
        return notificationUserSettings;
    }

    protected void updateSettingsOnOptedIn(boolean z) {
        NotificationUserSettings notificationUserSettings = this.mCurrentUserSettings;
        if (notificationUserSettings == null) {
            C1044Mm.e(TAG, "User is NOT logged in, do nothing. We can not register");
            return;
        }
        notificationUserSettings.optedIn = z;
        notificationUserSettings.optInDisplayed = true;
        saveSettings();
    }

    protected void onLogout(aUD aud) {
        synchronized (this) {
            C1044Mm.e(TAG, "User is logging out");
            if (!isPushSupported()) {
                C1044Mm.d(TAG, "We can not do anything because device does not support push notifications!");
                return;
            }
            report(true, true);
            if (aud != null) {
                NotificationUserSettings notificationUserSettings = this.mSettings.get(aud.b);
                this.mCurrentUserSettings = notificationUserSettings;
                if (notificationUserSettings == null) {
                    C1044Mm.d(TAG, "User is logging out and it was unknown before?");
                    NotificationUserSettings notificationUserSettings2 = new NotificationUserSettings();
                    this.mCurrentUserSettings = notificationUserSettings2;
                    notificationUserSettings2.accountOwnerToken = aud.b;
                    notificationUserSettings2.optedIn = true;
                    notificationUserSettings2.oldAppVersion = C8055ddE.c(getContext());
                }
            }
            saveSettings();
            this.mCurrentUserSettings = null;
            aSD.c();
        }
    }

    private void saveSettings() {
        final Map<String, NotificationUserSettings> map = this.mSettings;
        if (map == null) {
            C1044Mm.d(TAG, "This should not happen! Map is null!");
        } else {
            new C1071Np().d(new C1079Nx.b() { // from class: com.netflix.mediaclient.service.pushnotification.PushNotificationAgent$$ExternalSyntheticLambda0
                @Override // o.C1079Nx.b
                public final void run() {
                    PushNotificationAgent.this.lambda$saveSettings$0(map);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveSettings$0(Map map) {
        NotificationUserSettings.saveSettings(getContext(), map);
    }

    protected void onNotificationOptIn(boolean z) {
        C1044Mm.a(TAG, "onNotificationOptIn - user optIn ? %b", Boolean.valueOf(z));
        validateCurrentUser();
        if (z || !ConfigFastPropertyFeatureControlConfig.Companion.j()) {
            updateSettingsOnOptedIn(z);
            C1825aPq.d(getContext(), z);
        }
        report(z, true);
    }

    public boolean isSupported() {
        return isPushSupported();
    }

    @Override // o.InterfaceC5134bsy
    public void report(boolean z, AppView appView) {
        report(z, true);
    }

    private void report(boolean z, boolean z2) {
        CLContext androidPushNotificationOptions;
        if (!isPushSupported()) {
            C1044Mm.d(TAG, "We can not report anything if device does not support push notifications!");
        } else if (C8067ddQ.c() && !NJ.d()) {
            C1044Mm.e(TAG, "skipping push notification reporting - automation run");
        } else {
            boolean b = InterfaceC7089cpd.a(this.mContext).b();
            if (C8168dfL.g(this.registrationId)) {
                return;
            }
            Long startSession = Logger.INSTANCE.startSession(new RegisterForPushNotifications(null, null, null, null));
            PushNotificationType[] pushNotificationTypeArr = C8054ddD.f() ? new PushNotificationType[]{PushNotificationType.alert, PushNotificationType.sound, PushNotificationType.badge} : new PushNotificationType[]{PushNotificationType.alert, PushNotificationType.sound};
            Object[] objArr = new Object[5];
            objArr[0] = Boolean.valueOf(b && z);
            objArr[1] = Boolean.valueOf(z);
            objArr[2] = Boolean.valueOf(z2);
            objArr[3] = Boolean.valueOf(b);
            objArr[4] = this.registrationId;
            C1044Mm.a(TAG, "report allowed && optIn(optIn): %s(%s), InfoOptIn: %s, allowed: %s, registrationId: %s ", objArr);
            if (startSession != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("news", NotificationUtils.d((Context) C1332Xp.b(Context.class)));
                } catch (JSONException unused) {
                }
                String andUpdateOldDeviceToken = getAndUpdateOldDeviceToken(this.mContext, this.registrationId);
                if (C8151dev.c()) {
                    androidPushNotificationOptions = new AmazonPushNotificationOptions(Boolean.valueOf(b && z), jSONObject, andUpdateOldDeviceToken);
                } else {
                    androidPushNotificationOptions = new AndroidPushNotificationOptions(Boolean.valueOf(b && z), jSONObject, andUpdateOldDeviceToken);
                }
                Logger logger = Logger.INSTANCE;
                long addContext = logger.addContext(androidPushNotificationOptions);
                logger.endSession(createSessionEndedEvent(startSession, this.registrationId, pushNotificationTypeArr, z2, b && z, andUpdateOldDeviceToken));
                logger.removeContext(Long.valueOf(addContext));
            }
        }
    }

    private static RegisterForPushNotificationsEnded createSessionEndedEvent(Long l, String str, PushNotificationType[] pushNotificationTypeArr, boolean z, boolean z2, String str2) {
        if (l == null) {
            return null;
        }
        Session session = Logger.INSTANCE.getSession(l);
        if (session instanceof RegisterForPushNotifications) {
            return new RegisterForPushNotificationsEnded((RegisterForPushNotifications) session, pushNotificationTypeArr, Boolean.valueOf(z), Boolean.valueOf(z2), str);
        }
        return null;
    }

    private String getAndUpdateOldDeviceToken(Context context, String str) {
        String e = C8157dfA.e(context, "old_push_message_token", (String) null);
        String e2 = C8157dfA.e(context, "last_push_message_token", (String) null);
        if (C8168dfL.g(str)) {
            return e;
        }
        if (C8168dfL.g(e2)) {
            C8157dfA.a(context, "last_push_message_token", str);
            e2 = str;
        }
        if (C8168dfL.g(e)) {
            C8157dfA.a(context, "old_push_message_token", e2);
            e = e2;
        }
        C1044Mm.a(TAG, "from Pref oldDeviceToken %s, lastDeviceToken %s", e, e2);
        if (C8168dfL.d(e2, str)) {
            return e;
        }
        C1044Mm.e(TAG, "device token changed");
        C8157dfA.a(context, "old_push_message_token", e2);
        C8157dfA.a(context, "last_push_message_token", str);
        C1044Mm.a(TAG, "to Pref oldDeviceToken %s, lastDeviceToken %s", e2, str);
        return e2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public aUD createUserData(Intent intent) {
        aUD aud = new aUD();
        aud.a = intent.getStringExtra("device_cat");
        aud.g = intent.getStringExtra("nid");
        aud.j = intent.getStringExtra("sid");
        aud.b = intent.getStringExtra("uid");
        return aud;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onMessage(Intent intent, InterfaceC1912aSw interfaceC1912aSw) {
        C1044Mm.e(TAG, "Message received, create notification. Running it on main thread.");
        if (this.mInfoEventHandler == null) {
            synchronized (this) {
                if (this.mInfoEventHandler == null) {
                    this.mInfoEventHandler = new InfoEventHandler(interfaceC1912aSw, getConfigurationAgent(), this, this.mCloudGameSSIDBeaconEventHandler);
                }
            }
        }
        if (intent == null) {
            C1044Mm.d(TAG, "NotificationFactory.createNotification:: Intent is null!");
            return;
        }
        Context d = AbstractApplicationC1040Mh.d();
        Payload payload = new Payload(intent, this.mCloudGameSSIDBeaconJsonAdapter);
        Logger.INSTANCE.logEvent(new PushNotificationReceived(null, Long.valueOf(SystemClock.currentThreadTimeMillis()), new PushNotificationTrackingInfo(payload)));
        String isValid = Payload.isValid(payload);
        if (isValid != null) {
            InterfaceC1598aHf.a(isValid);
        } else if (Payload.DEFAULT_INFO_ACTION.equals(payload.defaultActionKey)) {
            TQ netflixPlatform = getNetflixPlatform();
            if (netflixPlatform != null) {
                this.mInfoEventHandler.handleEvent(d, this, netflixPlatform, payload, intent, this.mUserAgent.j());
            }
        } else if (NotificationFactory.handleSocialAction(interfaceC1912aSw, this.mUserAgent.j(), payload, intent)) {
        } else {
            if (C8150deu.f() && !Config_FastProperty_SmartDisplay.Companion.e()) {
                C1044Mm.e(TAG, "Do not display received push notification on smart display");
            } else if (NotificationUtils.b(d) && NotificationUtils.d(d)) {
                NotificationFactory.createNotification(d, payload, this.mImageLoaderRepository, getMessageId(getContext()), this.mUserAgent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onNotificationCanceled(Intent intent) {
        C8119deP.a(getContext(), intent, TAG);
        MessageData createInstance = MessageData.createInstance(intent);
        if (createInstance == null) {
            C1044Mm.d(TAG, "Unable to report canceled notification since message data are missing!");
            return;
        }
        C1044Mm.a(TAG, "User canceled notification %s", createInstance);
        reportNotificationCanceled(getContext(), createInstance);
    }

    public static void reportNotificationCanceled(Context context, MessageData messageData) {
        Logger.INSTANCE.logEvent(new PushNotificationDismissed(0L, new PushNotificationTrackingInfo(messageData)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onNotificationBrowserRedirect(Intent intent) {
        reportNotificationAcknowledged(getContext(), intent);
        C1044Mm.c(TAG, intent);
        C8179dfW.e(getContext(), intent.getStringExtra("target_url"));
    }

    public static void reportNotificationAcknowledged(Context context, Intent intent) {
        MessageData createInstance = MessageData.createInstance(intent);
        if (createInstance == null) {
            C1044Mm.d(TAG, "Unable to report browser redirect notification since message data are missing!");
            return;
        }
        C1044Mm.a(TAG, "User browser redirect notification %s", createInstance);
        reportNotificationAcknowledged(context, createInstance);
    }

    public static void reportNotificationAcknowledged(Context context, MessageData messageData) {
        Logger.INSTANCE.logEvent(new PushNotificationAcknowledged(0L, new PushNotificationTrackingInfo(messageData)));
    }

    private int getMessageId(final Context context) {
        int i;
        synchronized (this) {
            if (idCounter == -1) {
                idCounter = C8157dfA.d(context, "nf_notification_id_counter", 1);
            }
            i = idCounter;
            idCounter = i + 1;
            new C1071Np().d(new C1079Nx.b() { // from class: com.netflix.mediaclient.service.pushnotification.PushNotificationAgent$$ExternalSyntheticLambda1
                @Override // o.C1079Nx.b
                public final void run() {
                    PushNotificationAgent.lambda$getMessageId$1(context);
                }
            });
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getMessageId$1(Context context) {
        C8157dfA.a(context, "nf_notification_id_counter", idCounter);
    }

    private void registerReceiver() {
        C1044Mm.e(TAG, "Register receiver");
        C8116deM.c(getContext(), this.pushNotificationReceiver, "com.netflix.mediaclient.intent.category.PUSH", "com.netflix.mediaclient.intent.action.PUSH_ONLOGIN", "com.netflix.mediaclient.intent.action.PUSH_ONLOGOUT", "com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTIN", "com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTOUT");
    }

    private void unregisterReceiver() {
        C8116deM.a(getContext(), this.pushNotificationReceiver);
    }

    protected void onLogin() {
        if (!isPushSupported()) {
            C1044Mm.d(TAG, "We can not do anything because device does not support push notifications!");
            return;
        }
        String e = this.mUserAgent.e();
        if (e != null) {
            NotificationUserSettings notificationUserSettings = this.mSettings.get(e);
            this.mCurrentUserSettings = notificationUserSettings;
            if (notificationUserSettings == null) {
                C1044Mm.e(TAG, "User was not know from before");
                this.mCurrentUserSettings = createNewCurrentUserSettings(e);
            } else {
                C1044Mm.a(TAG, "User was known from before and he opted in %b", Boolean.valueOf(notificationUserSettings.optedIn));
            }
            try {
                C1044Mm.a(TAG, "report sPushInfoEventStartedService: %s", Boolean.valueOf(this.mPushInfoEventStartedService));
                if (this.mPushInfoEventStartedService) {
                    getNetflixPlatform().a(SERVICE_KILL_DELAY_WAKED_BY_GCM_MS);
                    return;
                }
                C1825aPq.d(getContext(), this.mCurrentUserSettings.optedIn);
                report(this.mCurrentUserSettings.optedIn, AppView.login);
                return;
            } catch (Throwable th) {
                C1044Mm.e(TAG, "Check if we are registered already failed!", th);
                return;
            }
        }
        C1044Mm.j(TAG, "Unknown user, former member case, report regID");
        report(true, AppView.login);
    }

    @Override // o.InterfaceC5134bsy
    public void informServiceStartedOnGcmInfo() {
        C1044Mm.e(TAG, "noting that gcmInfoEvent started NetflixService");
        this.mPushInfoEventStartedService = true;
    }

    @Override // o.InterfaceC5134bsy
    public boolean isOptIn() {
        NotificationUserSettings notificationUserSettings = this.mCurrentUserSettings;
        if (notificationUserSettings != null) {
            return notificationUserSettings.optedIn;
        }
        return false;
    }

    public void onServiceStarted() {
        validateCurrentUser();
        NotificationUserSettings notificationUserSettings = this.mCurrentUserSettings;
        if (notificationUserSettings != null) {
            report(notificationUserSettings.optedIn, AppView.browseTitles);
            return;
        }
        C1044Mm.j(TAG, "Unknown user, report true");
        report(true, AppView.browseTitles);
    }

    public void addRegistrationListener(InterfaceC5104bsU.a aVar) {
        synchronized (this.mRegistrationListeners) {
            this.mRegistrationListeners.add(aVar);
        }
    }

    public boolean removeRegistrationListener(InterfaceC5104bsU.a aVar) {
        boolean remove;
        synchronized (this) {
            synchronized (this.mRegistrationListeners) {
                remove = this.mRegistrationListeners.remove(aVar);
            }
        }
        return remove;
    }

    @Override // o.aMF
    public Status getTimeoutStatus() {
        return InterfaceC1078Nw.ac;
    }

    @Override // o.aMF
    public StopReason getTimeoutStopReason() {
        return StopReason.INIT_TIMED_OUT_PUSH;
    }

    @Override // o.aMF
    public StopReason getStopReasonForInitFailed() {
        return StopReason.INIT_FAILED_PUSH;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void alertListeners(String str) {
        C1044Mm.a(TAG, "Alerting total listeners: %d", Integer.valueOf(this.mRegistrationListeners.size()));
        synchronized (this.mRegistrationListeners) {
            for (InterfaceC5104bsU.a aVar : this.mRegistrationListeners) {
                C1044Mm.a(TAG, "Alerting: %s", aVar.b());
                aVar.a(str);
            }
        }
        C1044Mm.e(TAG, "Alerting done.");
    }
}
