package com.netflix.mediaclient.service.pushnotification;

import com.netflix.cl.model.TrackingInfo;
import o.C1596aHd;
import o.C8168dfL;
import o.InterfaceC1598aHf;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class PushNotificationTrackingInfo implements TrackingInfo {
    private String mEventGuid;
    private String mMessageGuid;
    private String mMessageId;
    private String mTrackingInfo;

    public String getEventGuid() {
        return this.mEventGuid;
    }

    public String getMessageGuid() {
        return this.mMessageGuid;
    }

    public String getMessageId() {
        return this.mMessageId;
    }

    public PushNotificationTrackingInfo(MessageData messageData) {
        if (messageData == null) {
            return;
        }
        this.mMessageId = messageData.getGuid();
        this.mMessageGuid = messageData.getMessageGuid();
        this.mEventGuid = messageData.getGuid();
    }

    public PushNotificationTrackingInfo(Payload payload) {
        if (payload == null) {
            return;
        }
        String str = payload.guid;
        this.mMessageId = str;
        this.mMessageGuid = payload.messageGuid;
        this.mEventGuid = str;
        this.mTrackingInfo = payload.trackingInfo;
    }

    @Override // com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        if (C8168dfL.h(this.mTrackingInfo)) {
            try {
                jSONObject = new JSONObject(this.mTrackingInfo);
            } catch (Exception e) {
                InterfaceC1598aHf.a(new C1596aHd().d(e));
            }
        }
        if (C8168dfL.h(this.mMessageId)) {
            jSONObject.put("messageId", this.mMessageId);
        }
        if (C8168dfL.h(this.mMessageGuid)) {
            jSONObject.put(Payload.PARAM_MESSAGE_GUID, this.mMessageGuid);
        }
        if (C8168dfL.h(this.mEventGuid)) {
            jSONObject.put("eventGuid", this.mEventGuid);
        }
        return jSONObject;
    }

    public String toString() {
        return "TrackingInfo{messageId='" + this.mMessageId + "', messageGuid='" + this.mMessageGuid + "', eventGuid='" + this.mEventGuid + "'}";
    }
}
