package com.netflix.mediaclient.service.pushnotification;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o.AbstractC3855bNd;
import o.C1044Mm;
import o.C8123deT;
import o.C8168dfL;
import o.InterfaceC1598aHf;
import o.InterfaceC3856bNe;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Payload {
    private static final String ACTION_HOME = "action=home&source=pn";
    private static final String BROWSE = "nflx://www.netflix.com/Browse?q=";
    public static final String DEFAULT_INFO_ACTION = "INFO";
    public static final String DEFAULT_SOCIAL_ACTION = "SOCIAL";
    public static final String DEFAULT_sound_KEY = "default";
    public static final String EXTRA_RENO_MESSAGE_ID = "renoMessageId";
    private static final String PARAM_ActionInfoType = "type";
    public static final String PARAM_GUID = "guid";
    public static final String PARAM_MESSAGE_GUID = "messageGuid";
    public static final String PARAM_ORIGINATOR = "originator";
    public static final String PARAM_RENO_CAUSE = "cause";
    public static final String PARAM_RENO_CREATION_TS = "creationTS";
    public static final String PARAM_RENO_EVENT_TYPE = "eventType";
    public static final String PARAM_RENO_INTERNAL_ATTRIBUTES = "internalAttributes";
    public static final String PARAM_RENO_MESSAGE_ATRRIBUTES = "messageAttributes";
    public static final String PARAM_RENO_MESSAGE_GUID = "messageGUID";
    public static final String PARAM_RENO_MESSAGE_ID = "renoMessageId";
    public static final String PARAM_RENO_MESSAGE_TYPE = "messageType";
    public static final String PARAM_RENO_MESSAGE_TYPE_MEMBERSHIP_PLAN_CHANGE = "MembershipPlanChange";
    public static final String PARAM_RENO_MESSAGE_TYPE_NEW_LOLOMO = "NewLolomo";
    public static final String PARAM_RENO_MESSAGE_TYPE_PROFILE_CHANGE = "ProfileChange";
    public static final String PARAM_RENO_MESSAGE_TYPE_REFRESH_LIST = "NewRow";
    public static final String PARAM_RENO_PAYLOAD = "invisiblePayload";
    public static final String PARAM_RENO_REFRESH_LIST_CONTEXT = "listContext";
    public static final String PARAM_RENO_REQUEST_ID = "requestId";
    private static final String PARAM_actionIcon = "actionIcon.";
    private static final String PARAM_actionKey = "actionKey.";
    private static final String PARAM_actionPayload = "actionPayload.";
    private static final String PARAM_actionText = "actionText.";
    private static final String PARAM_actionTrackingInfo = "trackingInfo.";
    private static final String PARAM_bigViewPicture = "bigViewPicture";
    private static final String PARAM_bigViewSummary = "bigViewSummary";
    private static final String PARAM_bigViewText = "bigViewText";
    private static final String PARAM_bigViewTitle = "bigViewTitle";
    public static final String PARAM_defaultActionKey = "defaultActionKey";
    private static final String PARAM_defaultActionPayload = "defaultActionPayload";
    private static final String PARAM_info = "info";
    private static final String PARAM_largeIcon = "largeIcon";
    private static final String PARAM_ledColor = "ledColor";
    private static final String PARAM_pingKey = "ping";
    private static final String PARAM_profileGuid = "profileId";
    private static final String PARAM_smallIcon = "smallIcon";
    public static final String PARAM_sound = "sound";
    private static final String PARAM_subtext = "subtext";
    private static final String PARAM_text = "text";
    private static final String PARAM_ticker = "ticker";
    private static final String PARAM_title = "title";
    private static final String PARAM_trackingInfo = "trackingInfo";
    private static final String PARAM_vibrate = "vibrate";
    private static final String PARAM_videoBookmark = "bookmark";
    private static final String PARAM_videoId = "videoId";
    private static final String PARAM_videoTitle = "videoTitle";
    private static final String PARAM_when = "when";
    private static final String PROTOCOL_HTTP = "http://";
    private static final String PROTOCOL_HTTPS = "https://";
    private static final String PROTOCOL_NFLX = "nflx://";
    private static final String TAG = "nf_push";
    private static final String TARGET_URL = "target_url=";
    public String actionInfoType;
    protected List<Action> actions = new ArrayList();
    public String bigViewPicture;
    public String bigViewSummary;
    public String bigViewText;
    public String bigViewTitle;
    public AbstractC3855bNd cloudGameSSIDBeacon;
    public String defaultActionKey;
    private String defaultActionPayload;
    public String guid;
    public String hasPing;
    public String info;
    public String largeIcon;
    public int ledColor;
    public String messageGuid;
    public String originator;
    public String profileGuid;
    public String renoCause;
    public long renoCreationTimestamp;
    public String renoInvisibleMessageId;
    public int renoMessageAtrributesVideoBookmark;
    public String renoMessageAtrributesVideoId;
    public String renoMessageGuid;
    public String renoMessageType;
    public String renoRefreshListContext;
    public String smallIcon;
    public String sound;
    public String subtext;
    public String text;
    private String ticker;
    private String title;
    public String trackingInfo;
    public String vibrate;
    private String videoId;
    private String videoTitle;
    private long when;

    String getRenoInvisibleMessageId() {
        return this.renoInvisibleMessageId;
    }

    String getRenoMessageType() {
        return this.renoMessageType;
    }

    String getRenoRefreshListContext() {
        return this.renoRefreshListContext;
    }

    public String getTicker(String str) {
        String str2 = this.ticker;
        return str2 != null ? str2 : str;
    }

    public String getTitle(String str) {
        String str2 = this.title;
        return str2 != null ? str2 : str;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public String getVideoTitle(String str) {
        String str2 = this.videoTitle;
        return str2 != null ? str2 : str;
    }

    /* loaded from: classes4.dex */
    public enum ActionInfoType {
        EVENT_NOTIFICATION_LIST_CHANGED("N"),
        EVENT_NOTIFICATION_READ("NR"),
        UNKNOWN("");
        
        private String value;

        public String getValue() {
            return this.value;
        }

        ActionInfoType(String str) {
            this.value = str;
        }

        public static ActionInfoType create(String str) {
            ActionInfoType[] values;
            for (ActionInfoType actionInfoType : values()) {
                if (actionInfoType.value.equalsIgnoreCase(str)) {
                    return actionInfoType;
                }
            }
            return UNKNOWN;
        }

        public static boolean isNotificationListChangedEvent(String str) {
            return C8168dfL.d(str, EVENT_NOTIFICATION_LIST_CHANGED.getValue());
        }

        public static boolean isNotificationReadEvent(String str) {
            return C8168dfL.d(str, EVENT_NOTIFICATION_READ.getValue());
        }
    }

    public Payload(Intent intent, InterfaceC3856bNe interfaceC3856bNe) {
        this.cloudGameSSIDBeacon = null;
        if (intent.hasExtra(PARAM_bigViewPicture)) {
            this.bigViewPicture = intent.getStringExtra(PARAM_bigViewPicture);
        }
        if (intent.hasExtra(PARAM_bigViewSummary)) {
            this.bigViewSummary = intent.getStringExtra(PARAM_bigViewSummary);
        }
        if (intent.hasExtra(PARAM_bigViewText)) {
            this.bigViewText = intent.getStringExtra(PARAM_bigViewText);
        }
        if (intent.hasExtra(PARAM_bigViewTitle)) {
            this.bigViewTitle = intent.getStringExtra(PARAM_bigViewTitle);
        }
        if (intent.hasExtra(PARAM_defaultActionKey)) {
            this.defaultActionKey = intent.getStringExtra(PARAM_defaultActionKey);
        }
        if (intent.hasExtra(PARAM_defaultActionPayload)) {
            this.defaultActionPayload = intent.getStringExtra(PARAM_defaultActionPayload);
        }
        if (intent.hasExtra(PARAM_trackingInfo)) {
            this.trackingInfo = intent.getStringExtra(PARAM_trackingInfo);
        }
        if (intent.hasExtra("info")) {
            this.info = intent.getStringExtra("info");
        }
        if (intent.hasExtra(PARAM_largeIcon)) {
            this.largeIcon = intent.getStringExtra(PARAM_largeIcon);
        }
        if (intent.hasExtra(PARAM_smallIcon)) {
            this.smallIcon = intent.getStringExtra(PARAM_smallIcon);
        }
        int i = 0;
        if (intent.hasExtra(PARAM_ledColor)) {
            String stringExtra = intent.getStringExtra(PARAM_ledColor);
            this.ledColor = C8168dfL.i(stringExtra) ? Integer.parseInt(stringExtra) : 0;
        }
        if (intent.hasExtra(PARAM_sound)) {
            this.sound = intent.getStringExtra(PARAM_sound);
        }
        if (intent.hasExtra(PARAM_subtext)) {
            this.subtext = intent.getStringExtra(PARAM_subtext);
        }
        if (intent.hasExtra(PARAM_text)) {
            this.text = intent.getStringExtra(PARAM_text);
        }
        if (intent.hasExtra(PARAM_ticker)) {
            this.ticker = intent.getStringExtra(PARAM_ticker);
        }
        if (intent.hasExtra("title")) {
            this.title = intent.getStringExtra("title");
        }
        if (intent.hasExtra(PARAM_videoTitle)) {
            this.videoTitle = intent.getStringExtra(PARAM_videoTitle);
        }
        if (intent.hasExtra("videoId")) {
            this.videoId = intent.getStringExtra("videoId");
        }
        if (intent.hasExtra(PARAM_vibrate)) {
            this.vibrate = intent.getStringExtra(PARAM_vibrate);
        }
        if (intent.hasExtra(PARAM_when)) {
            String stringExtra2 = intent.getStringExtra(PARAM_when);
            this.when = C8168dfL.i(stringExtra2) ? Long.parseLong(stringExtra2) : 0L;
        }
        if (intent.hasExtra(PARAM_GUID)) {
            this.guid = intent.getStringExtra(PARAM_GUID);
        }
        if (intent.hasExtra(PARAM_MESSAGE_GUID)) {
            this.messageGuid = intent.getStringExtra(PARAM_MESSAGE_GUID);
        }
        if (intent.hasExtra(PARAM_profileGuid)) {
            this.profileGuid = intent.getStringExtra(PARAM_profileGuid);
        }
        if (intent.hasExtra(PARAM_pingKey)) {
            this.hasPing = intent.getStringExtra(PARAM_pingKey);
        }
        if (intent.hasExtra("type")) {
            this.actionInfoType = intent.getStringExtra("type");
        }
        if (intent.hasExtra(PARAM_RENO_PAYLOAD)) {
            String stringExtra3 = intent.getStringExtra(PARAM_RENO_PAYLOAD);
            if (C8168dfL.h(stringExtra3)) {
                try {
                    JSONObject jSONObject = new JSONObject(stringExtra3);
                    AbstractC3855bNd c = interfaceC3856bNe.c(stringExtra3);
                    if (c != null) {
                        this.cloudGameSSIDBeacon = c;
                        C1044Mm.e(TAG, "CreateBeacon notification received:");
                        C1044Mm.e(TAG, interfaceC3856bNe.a(c));
                    }
                    String a = C8123deT.a(jSONObject, PARAM_RENO_MESSAGE_ATRRIBUTES, (String) null);
                    if (!TextUtils.isEmpty(a)) {
                        JSONObject jSONObject2 = new JSONObject(a);
                        this.renoRefreshListContext = C8123deT.a(jSONObject2, PARAM_RENO_REFRESH_LIST_CONTEXT, (String) null);
                        this.renoMessageAtrributesVideoId = C8123deT.a(jSONObject2, "videoId", (String) null);
                        this.renoMessageAtrributesVideoBookmark = C8123deT.a(jSONObject2, PARAM_videoBookmark, -1);
                    }
                    this.renoCause = C8123deT.a(jSONObject, PARAM_RENO_CAUSE, (String) null);
                    this.renoMessageGuid = C8123deT.a(jSONObject, PARAM_RENO_MESSAGE_GUID, (String) null);
                    this.renoCreationTimestamp = C8123deT.d(jSONObject, PARAM_RENO_CREATION_TS, System.currentTimeMillis());
                    this.renoMessageType = C8123deT.a(jSONObject, PARAM_RENO_MESSAGE_TYPE, (String) null);
                    this.renoInvisibleMessageId = C8123deT.a(jSONObject, "renoMessageId", (String) null);
                } catch (JSONException e) {
                    C1044Mm.e(TAG, String.format("invalid renoPayload %s", stringExtra3), e);
                }
            }
        }
        this.originator = extractOriginator(this.defaultActionPayload);
        while (i > -1) {
            String str = PARAM_actionKey + i;
            if (intent.hasExtra(str)) {
                Action action = new Action(this.guid);
                action.key = intent.getStringExtra(str);
                String str2 = PARAM_actionIcon + i;
                if (intent.hasExtra(str2)) {
                    action.icon = intent.getStringExtra(str2);
                }
                String str3 = PARAM_actionPayload + i;
                if (intent.hasExtra(str3)) {
                    action.payload = intent.getStringExtra(str3);
                }
                String str4 = PARAM_actionText + i;
                if (intent.hasExtra(str4)) {
                    action.text = intent.getStringExtra(str4);
                }
                String str5 = PARAM_actionTrackingInfo + i;
                if (intent.hasExtra(str5)) {
                    action.trackingInfo = intent.getStringExtra(str5);
                }
                if (this.messageGuid == null && action.trackingInfo != null) {
                    try {
                        JSONObject jSONObject3 = new JSONObject(action.trackingInfo);
                        if (jSONObject3.has(PARAM_MESSAGE_GUID)) {
                            String optString = jSONObject3.optString(PARAM_MESSAGE_GUID);
                            this.messageGuid = optString;
                            C1044Mm.a(TAG, "got messageGuid from trackingInfo %s", optString);
                        }
                    } catch (JSONException e2) {
                        InterfaceC1598aHf.e("error while reading action.trackingInfo", e2);
                    }
                }
                i++;
                if (action.payload == null || action.text == null || !Action.isSupportedActionKey(action.key)) {
                    C1044Mm.d(TAG, "Invalid action: " + action);
                } else {
                    this.actions.add(action);
                }
            } else {
                i = -1;
            }
        }
    }

    public long getWhen() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.when;
        if (j >= currentTimeMillis) {
            return j;
        }
        C1044Mm.e(TAG, "Post notification now!");
        return currentTimeMillis;
    }

    public Uri getDefaultActionPayload() {
        try {
            return parsePayload(this.defaultActionPayload, this.defaultActionKey);
        } catch (Throwable th) {
            C1044Mm.e(TAG, "defaultActionPayload URI is wrong: " + this.defaultActionPayload, th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Uri parsePayload(String str, String str2) {
        if (C8168dfL.g(str)) {
            C1044Mm.e(TAG, "Empty payload, return URI that will launch our application to HOME page");
            return Uri.parse(BROWSE + URLEncoder.encode(ACTION_HOME, "UTF-8"));
        } else if (str2 != null && Action.CUSTOM.equalsIgnoreCase(str2.trim())) {
            return Uri.parse(str);
        } else {
            Locale locale = Locale.US;
            if (str.toLowerCase(locale).startsWith(PROTOCOL_NFLX)) {
                return Uri.parse(BROWSE + URLEncoder.encode(TARGET_URL + str, "UTF-8"));
            } else if (str.toLowerCase(locale).startsWith(PROTOCOL_HTTPS)) {
                return Uri.parse(str);
            } else {
                if (str.toLowerCase(locale).startsWith(PROTOCOL_HTTP)) {
                    String str3 = PROTOCOL_NFLX + str.substring(7);
                    return Uri.parse(BROWSE + URLEncoder.encode(TARGET_URL + str3, "UTF-8"));
                }
                C1044Mm.e(TAG, "Unsuported protocol, return URI that will launch our application to HOME page");
                return Uri.parse(BROWSE + URLEncoder.encode(ACTION_HOME, "UTF-8"));
            }
        }
    }

    public Action[] getActions() {
        List<Action> list = this.actions;
        return (Action[]) list.toArray(new Action[list.size()]);
    }

    public static String isValid(Payload payload) {
        if (DEFAULT_INFO_ACTION.equals(payload.defaultActionKey)) {
            return null;
        }
        if (C8168dfL.g(payload.title)) {
            return "Payload:: title is missing!";
        }
        if (C8168dfL.g(payload.text)) {
            return "Payload:: text is missing!";
        }
        if (C8168dfL.g(payload.defaultActionKey)) {
            return "Payload:: defaultActionPayload is missing!";
        }
        return null;
    }

    /* loaded from: classes4.dex */
    public static class Action {
        public static final String ADD2QUEUE = "ADD2QUEUE";
        public static final String CUSTOM = "CUSTOM";
        public static final String DOWNLOAD = "DOWNLOAD";
        public static final String MDP = "MDP";
        public static final String PLAY = "PLAY";
        public static final String SHARE = "SHARE";
        public static final String THUMBS_DOWN = "THUMBS_DOWN";
        public static final String THUMBS_UP = "THUMBS_UP";
        public String guid;
        public String icon;
        public String key;
        public String payload;
        public String text;
        public String trackingInfo;

        public Action(String str) {
            this.guid = str;
        }

        public Uri getPayload() {
            try {
                return Payload.parsePayload(this.payload, this.key);
            } catch (Throwable th) {
                C1044Mm.e(Payload.TAG, "Action.Payload URI is wrong: " + this.payload, th);
                return null;
            }
        }

        public static boolean isSupportedActionKey(String str) {
            if (str == null) {
                return false;
            }
            return MDP.equals(str) || PLAY.equals(str) || ADD2QUEUE.equals(str) || DOWNLOAD.equals(str) || SHARE.equals(str) || CUSTOM.equals(str) || THUMBS_UP.equals(str) || THUMBS_DOWN.equals(str);
        }

        public String toString() {
            return "Action [key=" + this.key + ", text=" + this.text + ", payload=" + this.payload + ", icon=" + this.icon + "]";
        }
    }

    public String toString() {
        return "Payload [title=" + this.title + ", text=" + this.text + ", subtext=" + this.subtext + ", info=" + this.info + ", ticker=" + this.ticker + ", ledColor=" + this.ledColor + ", sound=" + this.sound + ", vibrate=" + this.vibrate + ", when=" + this.when + ", smallIcon=" + this.smallIcon + ", largeIcon=" + this.largeIcon + ", bigViewText=" + this.bigViewText + ", bigViewPicture=" + this.bigViewPicture + ", bigViewTitle=" + this.bigViewTitle + ", bigViewSummary=" + this.bigViewSummary + ", defaultActionKey=" + this.defaultActionKey + ", defaultActionPayload=" + this.defaultActionPayload + ", actions=" + this.actions + ", guid=" + this.guid + ", messageGuid=" + this.messageGuid + "]";
    }

    private static String extractOriginator(String str) {
        int indexOf;
        int i;
        int i2;
        if (str != null && (indexOf = str.toLowerCase(Locale.ENGLISH).indexOf("source=")) >= 0 && (i = indexOf + 7) < str.length() && indexOf - 1 >= 0) {
            char charAt = str.charAt(i2);
            if (charAt == '?' || charAt == '&') {
                String substring = str.substring(i);
                int indexOf2 = substring.indexOf(38);
                if (indexOf2 < 0) {
                    return substring.trim();
                }
                return substring.substring(0, indexOf2);
            } else if (i >= str.length()) {
                return null;
            } else {
                return extractOriginator(str.substring(i));
            }
        }
        return null;
    }
}
