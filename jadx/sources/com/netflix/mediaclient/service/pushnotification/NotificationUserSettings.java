package com.netflix.mediaclient.service.pushnotification;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import o.C1044Mm;
import o.C8123deT;
import o.C8157dfA;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class NotificationUserSettings {
    static final int NOTIFICATION_SOUND_PREFERENCE_DISABLED = 2;
    static final int NOTIFICATION_SOUND_PREFERENCE_ENABLED = 1;
    static final int NOTIFICATION_SOUND_PREFERENCE_NOT_SAVED = 0;
    private static String PARAM_ACCOUNT_OWNER_TOKEN = "userId";
    private static String PARAM_OLD_APP_VERSION = "oldAppVersion";
    private static String PARAM_OPT_IN = "optIn";
    private static String PARAM_OPT_IN_DISPLAYED = "optInDisplayed";
    private static String PARAM_SOUND_ENABLED = "soundEnabled";
    private static String PARAM_TIMESTAMP = "ts";
    private static final String TAG = "nf_push";
    public String accountOwnerToken;
    public boolean optInDisplayed;
    public boolean optedIn;
    public long timestamp;
    public int oldAppVersion = Integer.MIN_VALUE;
    public int soundEnabled = 0;

    private JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PARAM_ACCOUNT_OWNER_TOKEN, this.accountOwnerToken);
        jSONObject.put(PARAM_OLD_APP_VERSION, this.oldAppVersion);
        jSONObject.put(PARAM_OPT_IN, this.optedIn);
        jSONObject.put(PARAM_SOUND_ENABLED, this.soundEnabled);
        jSONObject.put(PARAM_OPT_IN_DISPLAYED, this.optInDisplayed);
        if (this.timestamp <= 0) {
            this.timestamp = System.currentTimeMillis();
        }
        jSONObject.put(PARAM_TIMESTAMP, this.timestamp);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, NotificationUserSettings> loadSettings(Context context) {
        C1044Mm.e(TAG, "load Notification settings start...");
        try {
            String e = C8157dfA.e(context, "notification_settings", (String) null);
            if (e == null) {
                return new HashMap();
            }
            JSONArray jSONArray = new JSONArray(e);
            HashMap hashMap = new HashMap(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                NotificationUserSettings load = load(jSONArray.getJSONObject(i));
                hashMap.put(load.accountOwnerToken, load);
            }
            C1044Mm.e(TAG, "load Notification settings end.");
            return hashMap;
        } catch (Throwable th) {
            C1044Mm.e(TAG, "Failed to load settings", th);
            return new HashMap();
        }
    }

    static NotificationUserSettings load(JSONObject jSONObject) {
        NotificationUserSettings notificationUserSettings = new NotificationUserSettings();
        notificationUserSettings.accountOwnerToken = jSONObject.optString(PARAM_ACCOUNT_OWNER_TOKEN);
        notificationUserSettings.optedIn = jSONObject.optBoolean(PARAM_OPT_IN, true);
        notificationUserSettings.soundEnabled = jSONObject.optInt(PARAM_SOUND_ENABLED);
        notificationUserSettings.oldAppVersion = jSONObject.optInt(PARAM_OLD_APP_VERSION);
        notificationUserSettings.timestamp = C8123deT.d(jSONObject, PARAM_TIMESTAMP, 0L);
        notificationUserSettings.optInDisplayed = true;
        return notificationUserSettings;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void saveSettings(Context context, Map<String, NotificationUserSettings> map) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (NotificationUserSettings notificationUserSettings : map.values()) {
                jSONArray.put(notificationUserSettings.toJson());
            }
            C8157dfA.a(context, "notification_settings", jSONArray.toString());
        } catch (Throwable th) {
            C1044Mm.e(TAG, "Failed to save settings", th);
        }
    }

    public int hashCode() {
        String str = this.accountOwnerToken;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof NotificationUserSettings)) {
            NotificationUserSettings notificationUserSettings = (NotificationUserSettings) obj;
            String str = this.accountOwnerToken;
            if (str == null) {
                if (notificationUserSettings.accountOwnerToken != null) {
                    return false;
                }
            } else if (!str.equals(notificationUserSettings.accountOwnerToken)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return "NotificationUserSettings{accountOwnerToken='" + this.accountOwnerToken + "', optedIn=" + this.optedIn + ", optInDisplayed=" + this.optInDisplayed + ", oldAppVersion=" + this.oldAppVersion + ", soundEnabled=" + this.soundEnabled + ", timestamp=" + this.timestamp + '}';
    }
}
