package com.netflix.model.leafs.social;

/* renamed from: com.netflix.model.leafs.social.$$AutoValue_UserNotificationCtaTrackingInfo  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_UserNotificationCtaTrackingInfo extends UserNotificationCtaTrackingInfo {
    private final String action;
    private final String messageGuid;

    @Override // com.netflix.model.leafs.social.UserNotificationCtaTrackingInfo
    public String action() {
        return this.action;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationCtaTrackingInfo
    public String messageGuid() {
        return this.messageGuid;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_UserNotificationCtaTrackingInfo(String str, String str2) {
        this.action = str;
        this.messageGuid = str2;
    }

    public String toString() {
        return "UserNotificationCtaTrackingInfo{action=" + this.action + ", messageGuid=" + this.messageGuid + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserNotificationCtaTrackingInfo) {
            UserNotificationCtaTrackingInfo userNotificationCtaTrackingInfo = (UserNotificationCtaTrackingInfo) obj;
            String str = this.action;
            if (str != null ? str.equals(userNotificationCtaTrackingInfo.action()) : userNotificationCtaTrackingInfo.action() == null) {
                String str2 = this.messageGuid;
                if (str2 == null) {
                    if (userNotificationCtaTrackingInfo.messageGuid() == null) {
                        return true;
                    }
                } else if (str2.equals(userNotificationCtaTrackingInfo.messageGuid())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.action;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.messageGuid;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }
}
