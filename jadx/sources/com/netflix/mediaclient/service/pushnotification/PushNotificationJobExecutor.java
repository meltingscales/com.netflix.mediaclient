package com.netflix.mediaclient.service.pushnotification;

import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.job.NetflixJob;
import com.netflix.mediaclient.service.job.NetflixJobExecutor;
import com.netflix.mediaclient.service.pushnotification.PushJobServiceUtils;
import java.net.URISyntaxException;
import o.C1044Mm;
import o.C8157dfA;
import o.C8168dfL;
import o.InterfaceC1929aTm;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PushNotificationJobExecutor implements NetflixJobExecutor {
    private static final String TAG = "nf_push_job";
    private Context mContext;
    private InterfaceC1929aTm mNetflixJobScheduler;

    public PushNotificationJobExecutor(Context context, InterfaceC1929aTm interfaceC1929aTm) {
        this.mContext = context;
        this.mNetflixJobScheduler = interfaceC1929aTm;
    }

    public static void schedulePushNotificationJob(InterfaceC1929aTm interfaceC1929aTm, NetflixJob netflixJob) {
        if (interfaceC1929aTm == null || interfaceC1929aTm.d(NetflixJob.NetflixJobId.PUSH_NOTIFICATION)) {
            return;
        }
        interfaceC1929aTm.a(netflixJob);
    }

    @Override // com.netflix.mediaclient.service.job.NetflixJobExecutor
    public void onNetflixStartJob(NetflixJob.NetflixJobId netflixJobId) {
        C1044Mm.e(TAG, "push job started");
        if (handlePendingPushNotificationRegistration()) {
            this.mNetflixJobScheduler.e(NetflixJob.NetflixJobId.PUSH_NOTIFICATION, false);
        } else if (handlePendingPushNotificationActions() && handlePendingPushNotificationMessages()) {
            this.mNetflixJobScheduler.e(NetflixJob.NetflixJobId.PUSH_NOTIFICATION, false);
        }
    }

    private boolean handlePendingPushNotificationActions() {
        String e = C8157dfA.e(this.mContext, "notification_actions_to_log", (String) null);
        if (C8168dfL.g(e)) {
            this.mNetflixJobScheduler.e(NetflixJob.NetflixJobId.PUSH_NOTIFICATION, false);
            return false;
        }
        C1044Mm.a(TAG, "savedActions: %s", e);
        C8157dfA.a(this.mContext, "notification_actions_to_log", (String) null);
        try {
            JSONArray jSONArray = new JSONArray(e);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                handlePushNotificationAction(jSONObject.getString(SignupConstants.Error.DEBUG_INFO_ACTION), MessageData.createInstance(jSONObject));
            }
            return true;
        } catch (JSONException e2) {
            C1044Mm.e(TAG, "error retrieving saved Notification actions", e2);
            return true;
        }
    }

    private void handlePushNotificationAction(String str, MessageData messageData) {
        if (C8168dfL.g(str) || messageData == null) {
            return;
        }
        C1044Mm.a(TAG, "action: %s, msgData: %s", str, messageData);
        if ("com.netflix.mediaclient.intent.action.NOTIFICATION_CANCELED".equals(str)) {
            C1044Mm.e(TAG, "Handle notification canceled");
            PushNotificationAgent.reportNotificationCanceled(this.mContext, messageData);
        } else if ("com.netflix.mediaclient.intent.action.NOTIFICATION_BROWSER_REDIRECT".equals(str)) {
            C1044Mm.e(TAG, "Handle notification browser redirect");
            PushNotificationAgent.reportNotificationAcknowledged(this.mContext, messageData);
        }
    }

    private boolean handlePendingPushNotificationMessages() {
        C1044Mm.e(TAG, "handlePendingMessages started");
        String e = C8157dfA.e(this.mContext, "notification_messages_to_log", (String) null);
        if (C8168dfL.g(e)) {
            this.mNetflixJobScheduler.e(NetflixJob.NetflixJobId.PUSH_NOTIFICATION, false);
            return false;
        }
        C1044Mm.a(TAG, "savedMessages: %s", e);
        C8157dfA.a(this.mContext, "notification_messages_to_log", (String) null);
        try {
            JSONArray jSONArray = new JSONArray(e);
            for (int i = 0; i < jSONArray.length(); i++) {
                Intent parseUri = Intent.parseUri(jSONArray.getString(i), 1);
                if (parseUri != null) {
                    Context context = this.mContext;
                    if (!context.bindService(PushJobServiceUtils.Companion.getNetflixServiceIntent(context), new PushJobServiceUtils.NetflixServiceConnection(parseUri.getExtras()), 1)) {
                        C1044Mm.d(TAG, "handlePendingPushNotificationMessages could not bind to NetflixService!");
                    }
                }
            }
        } catch (URISyntaxException e2) {
            C1044Mm.e(TAG, "error parsing saved uri", e2);
        } catch (JSONException e3) {
            C1044Mm.e(TAG, "error retrieving saved Notification message", e3);
        }
        return true;
    }

    @Override // com.netflix.mediaclient.service.job.NetflixJobExecutor
    public void onNetflixStopJob(NetflixJob.NetflixJobId netflixJobId) {
        C1044Mm.e(TAG, "install token job stopped");
    }

    public static void storeNotificationActionForLater(Context context, Intent intent) {
        JSONArray jSONArray = null;
        String e = C8157dfA.e(context, "notification_actions_to_log", (String) null);
        try {
            jSONArray = C8168dfL.h(e) ? new JSONArray(e) : new JSONArray();
        } catch (JSONException e2) {
            C1044Mm.e(TAG, "error retrieving saved Notification actions", e2);
        }
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        JSONObject jsonObject = MessageData.getJsonObject(MessageData.createInstance(intent));
        try {
            jsonObject.putOpt(SignupConstants.Error.DEBUG_INFO_ACTION, intent.getAction());
        } catch (JSONException e3) {
            C1044Mm.e(TAG, "error adding string to jsonObject", e3);
        }
        jSONArray.put(jsonObject);
        C8157dfA.a(context, "notification_actions_to_log", jSONArray.toString());
        schedulePushNotificationJob(NetflixApplication.getInstance().h(), NetflixJob.e());
    }

    public static void storeNotificationMessageForLater(Context context, Intent intent) {
        JSONArray jSONArray = null;
        String e = C8157dfA.e(context, "notification_messages_to_log", (String) null);
        try {
            jSONArray = C8168dfL.h(e) ? new JSONArray(e) : new JSONArray();
        } catch (JSONException e2) {
            C1044Mm.e(TAG, "error retrieving saved Notification messages", e2);
        }
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        jSONArray.put(intent.toUri(1));
        C1044Mm.a(TAG, "Updating pending message preference %s", jSONArray.toString());
        C8157dfA.a(context, "notification_messages_to_log", jSONArray.toString());
    }

    public static void storeNotificationRegistrationForLater(Context context, String str) {
        if (C8168dfL.g(str)) {
            return;
        }
        C1044Mm.a(TAG, "Saving pending registration to preference %s", str);
        C8157dfA.a(context, "notification_registration_to_log", str);
    }

    private boolean handlePendingPushNotificationRegistration() {
        C1044Mm.e(TAG, "handlePendingRegistration started");
        String e = C8157dfA.e(this.mContext, "notification_registration_to_log", (String) null);
        if (C8168dfL.g(e)) {
            this.mNetflixJobScheduler.e(NetflixJob.NetflixJobId.PUSH_NOTIFICATION, false);
            return false;
        }
        C1044Mm.a(TAG, "registrationId: %s", e);
        C8157dfA.a(this.mContext, "notification_registration_to_log", (String) null);
        PushJobServiceUtils.Companion companion = PushJobServiceUtils.Companion;
        Intent buildOnRegisteredIntent = companion.buildOnRegisteredIntent(this.mContext, e);
        if (buildOnRegisteredIntent != null) {
            Context context = this.mContext;
            if (!context.bindService(companion.getNetflixServiceIntent(context), new PushJobServiceUtils.NetflixServiceConnection(buildOnRegisteredIntent.getExtras()), 1)) {
                C1044Mm.d(TAG, "handlePendingPushNotificationMessages could not bind to NetflixService!");
            }
        }
        return true;
    }
}
