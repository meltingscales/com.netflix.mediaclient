package com.netflix.model.leafs.social;

/* renamed from: com.netflix.model.leafs.social.$$AutoValue_UserNotificationLandingTrackingInfo  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_UserNotificationLandingTrackingInfo extends UserNotificationLandingTrackingInfo {
    private final String action;
    private final String messageGuid;
    private final String notificationItemType;
    private final String titleId;
    private final Integer trackId;

    @Override // com.netflix.model.leafs.social.UserNotificationLandingTrackingInfo
    public String action() {
        return this.action;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationLandingTrackingInfo
    public String messageGuid() {
        return this.messageGuid;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationLandingTrackingInfo
    public String notificationItemType() {
        return this.notificationItemType;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationLandingTrackingInfo
    public String titleId() {
        return this.titleId;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationLandingTrackingInfo
    public Integer trackId() {
        return this.trackId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_UserNotificationLandingTrackingInfo(String str, String str2, String str3, Integer num, String str4) {
        this.messageGuid = str;
        this.titleId = str2;
        this.notificationItemType = str3;
        this.trackId = num;
        this.action = str4;
    }

    public String toString() {
        return "UserNotificationLandingTrackingInfo{messageGuid=" + this.messageGuid + ", titleId=" + this.titleId + ", notificationItemType=" + this.notificationItemType + ", trackId=" + this.trackId + ", action=" + this.action + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserNotificationLandingTrackingInfo) {
            UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo = (UserNotificationLandingTrackingInfo) obj;
            String str = this.messageGuid;
            if (str != null ? str.equals(userNotificationLandingTrackingInfo.messageGuid()) : userNotificationLandingTrackingInfo.messageGuid() == null) {
                String str2 = this.titleId;
                if (str2 != null ? str2.equals(userNotificationLandingTrackingInfo.titleId()) : userNotificationLandingTrackingInfo.titleId() == null) {
                    String str3 = this.notificationItemType;
                    if (str3 != null ? str3.equals(userNotificationLandingTrackingInfo.notificationItemType()) : userNotificationLandingTrackingInfo.notificationItemType() == null) {
                        Integer num = this.trackId;
                        if (num != null ? num.equals(userNotificationLandingTrackingInfo.trackId()) : userNotificationLandingTrackingInfo.trackId() == null) {
                            String str4 = this.action;
                            if (str4 == null) {
                                if (userNotificationLandingTrackingInfo.action() == null) {
                                    return true;
                                }
                            } else if (str4.equals(userNotificationLandingTrackingInfo.action())) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.messageGuid;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.titleId;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.notificationItemType;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.trackId;
        int hashCode4 = num == null ? 0 : num.hashCode();
        String str4 = this.action;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
    }
}
