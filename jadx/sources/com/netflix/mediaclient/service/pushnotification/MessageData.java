package com.netflix.mediaclient.service.pushnotification;

import android.content.Intent;
import o.C1044Mm;
import o.C8168dfL;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class MessageData {
    private static final String TAG = "nf_push";
    private String mGuid;
    private String mMessageGuid;
    private String mOriginator;
    private String sound;

    public String getGuid() {
        return this.mGuid;
    }

    public String getMessageGuid() {
        return this.mMessageGuid;
    }

    public String getOriginator() {
        return this.mOriginator;
    }

    public String getSound() {
        return this.sound;
    }

    private MessageData(String str, String str2, String str3, String str4) {
        this.mGuid = str;
        this.mMessageGuid = str2;
        this.mOriginator = str3;
        this.sound = str4;
    }

    public String toString() {
        return "MessageData [mGuid=" + this.mGuid + ", mMessageGuid=" + this.mMessageGuid + ", mOriginator=" + this.mOriginator + ", sound=" + this.sound + "]";
    }

    public static MessageData createInstance(Intent intent) {
        C1044Mm.b(TAG, "MessageData::", intent);
        String stringExtra = intent.getStringExtra(Payload.PARAM_GUID);
        if (C8168dfL.g(stringExtra)) {
            C1044Mm.j(TAG, "Guid not found, source is not (proper) push notification");
        }
        String stringExtra2 = intent.getStringExtra(Payload.PARAM_MESSAGE_GUID);
        if (C8168dfL.g(stringExtra2)) {
            C1044Mm.e(TAG, "Message guid not found, source is not (proper) push notification");
        }
        String stringExtra3 = intent.getStringExtra(Payload.PARAM_ORIGINATOR);
        if (C8168dfL.g(stringExtra3)) {
            C1044Mm.j(TAG, "Received notification WITHOUT ORIGINATOR! Pass default!");
        }
        String stringExtra4 = intent.getStringExtra(Payload.PARAM_sound);
        if (C8168dfL.g(stringExtra4)) {
            C1044Mm.j(TAG, "Received notification WITHOUT Sound! Pass default!");
        }
        return new MessageData(stringExtra, stringExtra2, stringExtra3, stringExtra4);
    }

    public static MessageData createInstance(JSONObject jSONObject) {
        return new MessageData(jSONObject.optString(Payload.PARAM_GUID), jSONObject.optString(Payload.PARAM_MESSAGE_GUID), jSONObject.optString(Payload.PARAM_ORIGINATOR), jSONObject.optString(Payload.PARAM_sound));
    }

    public static void addMessageDataToIntent(Intent intent, MessageData messageData) {
        if (intent == null || messageData == null) {
            C1044Mm.j(TAG, "Intent or msg is null!");
            return;
        }
        if (C8168dfL.h(messageData.getGuid())) {
            intent.putExtra(Payload.PARAM_GUID, messageData.getGuid());
        }
        if (C8168dfL.h(messageData.getMessageGuid())) {
            intent.putExtra(Payload.PARAM_MESSAGE_GUID, messageData.getMessageGuid());
        }
        if (C8168dfL.h(messageData.getOriginator())) {
            intent.putExtra(Payload.PARAM_ORIGINATOR, messageData.getOriginator());
        }
        if (C8168dfL.h(messageData.getSound())) {
            intent.putExtra(Payload.PARAM_sound, messageData.getSound());
        }
    }

    public static JSONObject getJsonObject(MessageData messageData) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(Payload.PARAM_GUID, messageData.getGuid());
            jSONObject.putOpt(Payload.PARAM_MESSAGE_GUID, messageData.getMessageGuid());
            jSONObject.putOpt(Payload.PARAM_ORIGINATOR, messageData.getOriginator());
            jSONObject.putOpt(Payload.PARAM_sound, messageData.getSound());
        } catch (JSONException e) {
            C1044Mm.e(TAG, "unable to create json object from notification event", e);
        }
        return jSONObject;
    }
}
