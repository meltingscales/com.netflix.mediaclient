package com.netflix.model.leafs.social.multititle;

import com.netflix.model.leafs.social.UserNotificationActionTrackingInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.social.multititle.$$AutoValue_NotificationGridTitleAction  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_NotificationGridTitleAction extends NotificationGridTitleAction {
    private final String action;
    private final String actionType;
    private final String boxshot;
    private final String boxshotWebp;
    private final String sdp;
    private final String sdpWebp;
    private final String titleId;
    private final UserNotificationActionTrackingInfo trackingInfo;

    @Override // com.netflix.model.leafs.social.multititle.NotificationGridTitleAction
    public String action() {
        return this.action;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationGridTitleAction
    public String actionType() {
        return this.actionType;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationGridTitleAction
    public String boxshot() {
        return this.boxshot;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationGridTitleAction
    public String boxshotWebp() {
        return this.boxshotWebp;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationGridTitleAction
    public String sdp() {
        return this.sdp;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationGridTitleAction
    public String sdpWebp() {
        return this.sdpWebp;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationGridTitleAction
    public String titleId() {
        return this.titleId;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationGridTitleAction
    public UserNotificationActionTrackingInfo trackingInfo() {
        return this.trackingInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_NotificationGridTitleAction(String str, String str2, String str3, String str4, String str5, String str6, String str7, UserNotificationActionTrackingInfo userNotificationActionTrackingInfo) {
        if (str == null) {
            throw new NullPointerException("Null action");
        }
        this.action = str;
        if (str2 == null) {
            throw new NullPointerException("Null boxshot");
        }
        this.boxshot = str2;
        if (str3 == null) {
            throw new NullPointerException("Null boxshotWebp");
        }
        this.boxshotWebp = str3;
        if (str4 == null) {
            throw new NullPointerException("Null actionType");
        }
        this.actionType = str4;
        if (str5 == null) {
            throw new NullPointerException("Null sdp");
        }
        this.sdp = str5;
        if (str6 == null) {
            throw new NullPointerException("Null sdpWebp");
        }
        this.sdpWebp = str6;
        if (str7 == null) {
            throw new NullPointerException("Null titleId");
        }
        this.titleId = str7;
        if (userNotificationActionTrackingInfo == null) {
            throw new NullPointerException("Null trackingInfo");
        }
        this.trackingInfo = userNotificationActionTrackingInfo;
    }

    public String toString() {
        return "NotificationGridTitleAction{action=" + this.action + ", boxshot=" + this.boxshot + ", boxshotWebp=" + this.boxshotWebp + ", actionType=" + this.actionType + ", sdp=" + this.sdp + ", sdpWebp=" + this.sdpWebp + ", titleId=" + this.titleId + ", trackingInfo=" + this.trackingInfo + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NotificationGridTitleAction) {
            NotificationGridTitleAction notificationGridTitleAction = (NotificationGridTitleAction) obj;
            return this.action.equals(notificationGridTitleAction.action()) && this.boxshot.equals(notificationGridTitleAction.boxshot()) && this.boxshotWebp.equals(notificationGridTitleAction.boxshotWebp()) && this.actionType.equals(notificationGridTitleAction.actionType()) && this.sdp.equals(notificationGridTitleAction.sdp()) && this.sdpWebp.equals(notificationGridTitleAction.sdpWebp()) && this.titleId.equals(notificationGridTitleAction.titleId()) && this.trackingInfo.equals(notificationGridTitleAction.trackingInfo());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.action.hashCode();
        int hashCode2 = this.boxshot.hashCode();
        int hashCode3 = this.boxshotWebp.hashCode();
        int hashCode4 = this.actionType.hashCode();
        int hashCode5 = this.sdp.hashCode();
        int hashCode6 = this.sdpWebp.hashCode();
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ this.titleId.hashCode()) * 1000003) ^ this.trackingInfo.hashCode();
    }
}
