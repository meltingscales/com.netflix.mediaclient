package com.netflix.model.leafs.social.multititle;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.social.UserNotificationActionTrackingInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.social.multititle.$$AutoValue_NotificationHeroTitleAction  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_NotificationHeroTitleAction extends NotificationHeroTitleAction {
    private final String action;
    private final String actionType;
    private final UserNotificationActionTrackingInfo trackingInfo;
    private final VideoType videoType;

    @Override // com.netflix.model.leafs.social.multititle.NotificationHeroTitleAction
    public String action() {
        return this.action;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationHeroTitleAction
    public String actionType() {
        return this.actionType;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationHeroTitleAction
    public UserNotificationActionTrackingInfo trackingInfo() {
        return this.trackingInfo;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationHeroTitleAction
    public VideoType videoType() {
        return this.videoType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_NotificationHeroTitleAction(String str, String str2, VideoType videoType, UserNotificationActionTrackingInfo userNotificationActionTrackingInfo) {
        if (str == null) {
            throw new NullPointerException("Null action");
        }
        this.action = str;
        if (str2 == null) {
            throw new NullPointerException("Null actionType");
        }
        this.actionType = str2;
        if (videoType == null) {
            throw new NullPointerException("Null videoType");
        }
        this.videoType = videoType;
        if (userNotificationActionTrackingInfo == null) {
            throw new NullPointerException("Null trackingInfo");
        }
        this.trackingInfo = userNotificationActionTrackingInfo;
    }

    public String toString() {
        return "NotificationHeroTitleAction{action=" + this.action + ", actionType=" + this.actionType + ", videoType=" + this.videoType + ", trackingInfo=" + this.trackingInfo + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NotificationHeroTitleAction) {
            NotificationHeroTitleAction notificationHeroTitleAction = (NotificationHeroTitleAction) obj;
            return this.action.equals(notificationHeroTitleAction.action()) && this.actionType.equals(notificationHeroTitleAction.actionType()) && this.videoType.equals(notificationHeroTitleAction.videoType()) && this.trackingInfo.equals(notificationHeroTitleAction.trackingInfo());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.action.hashCode();
        int hashCode2 = this.actionType.hashCode();
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ this.videoType.hashCode()) * 1000003) ^ this.trackingInfo.hashCode();
    }
}
