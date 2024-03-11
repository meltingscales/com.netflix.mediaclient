package com.netflix.model.leafs.social.multititle;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.social.UserNotificationActionTrackingInfo;
import com.netflix.model.leafs.social.multititle.NotificationRatingAction;

/* renamed from: com.netflix.model.leafs.social.multititle.$$AutoValue_NotificationRatingAction  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_NotificationRatingAction extends NotificationRatingAction {
    private final String action;
    private final String actionType;
    private final UserNotificationActionTrackingInfo trackingInfo;
    private final VideoType videoType;

    @Override // com.netflix.model.leafs.social.multititle.NotificationRatingAction
    public String action() {
        return this.action;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationRatingAction
    public String actionType() {
        return this.actionType;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationRatingAction
    public UserNotificationActionTrackingInfo trackingInfo() {
        return this.trackingInfo;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationRatingAction
    public VideoType videoType() {
        return this.videoType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_NotificationRatingAction(String str, String str2, UserNotificationActionTrackingInfo userNotificationActionTrackingInfo, VideoType videoType) {
        if (str == null) {
            throw new NullPointerException("Null action");
        }
        this.action = str;
        if (str2 == null) {
            throw new NullPointerException("Null actionType");
        }
        this.actionType = str2;
        if (userNotificationActionTrackingInfo == null) {
            throw new NullPointerException("Null trackingInfo");
        }
        this.trackingInfo = userNotificationActionTrackingInfo;
        if (videoType == null) {
            throw new NullPointerException("Null videoType");
        }
        this.videoType = videoType;
    }

    public String toString() {
        return "NotificationRatingAction{action=" + this.action + ", actionType=" + this.actionType + ", trackingInfo=" + this.trackingInfo + ", videoType=" + this.videoType + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NotificationRatingAction) {
            NotificationRatingAction notificationRatingAction = (NotificationRatingAction) obj;
            return this.action.equals(notificationRatingAction.action()) && this.actionType.equals(notificationRatingAction.actionType()) && this.trackingInfo.equals(notificationRatingAction.trackingInfo()) && this.videoType.equals(notificationRatingAction.videoType());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.action.hashCode();
        int hashCode2 = this.actionType.hashCode();
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ this.trackingInfo.hashCode()) * 1000003) ^ this.videoType.hashCode();
    }

    /* renamed from: com.netflix.model.leafs.social.multititle.$$AutoValue_NotificationRatingAction$Builder */
    /* loaded from: classes.dex */
    static final class Builder extends NotificationRatingAction.Builder {
        private String action;
        private String actionType;
        private UserNotificationActionTrackingInfo trackingInfo;
        private VideoType videoType;

        @Override // com.netflix.model.leafs.social.multititle.NotificationRatingAction.Builder
        public NotificationRatingAction.Builder action(String str) {
            if (str != null) {
                this.action = str;
                return this;
            }
            throw new NullPointerException("Null action");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationRatingAction.Builder
        public NotificationRatingAction.Builder actionType(String str) {
            if (str != null) {
                this.actionType = str;
                return this;
            }
            throw new NullPointerException("Null actionType");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationRatingAction.Builder
        public NotificationRatingAction.Builder trackingInfo(UserNotificationActionTrackingInfo userNotificationActionTrackingInfo) {
            if (userNotificationActionTrackingInfo != null) {
                this.trackingInfo = userNotificationActionTrackingInfo;
                return this;
            }
            throw new NullPointerException("Null trackingInfo");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationRatingAction.Builder
        public NotificationRatingAction.Builder videoType(VideoType videoType) {
            if (videoType != null) {
                this.videoType = videoType;
                return this;
            }
            throw new NullPointerException("Null videoType");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationRatingAction.Builder
        public NotificationRatingAction build() {
            String str = "";
            if (this.action == null) {
                str = " action";
            }
            if (this.actionType == null) {
                str = str + " actionType";
            }
            if (this.trackingInfo == null) {
                str = str + " trackingInfo";
            }
            if (this.videoType == null) {
                str = str + " videoType";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_NotificationRatingAction(this.action, this.actionType, this.trackingInfo, this.videoType);
        }
    }
}
