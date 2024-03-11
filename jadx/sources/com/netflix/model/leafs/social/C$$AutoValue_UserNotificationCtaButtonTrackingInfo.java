package com.netflix.model.leafs.social;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.social.$$AutoValue_UserNotificationCtaButtonTrackingInfo  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_UserNotificationCtaButtonTrackingInfo extends UserNotificationCtaButtonTrackingInfo {
    private final String action;
    private final String buttonText;
    private final UserNotificationCtaTrackingInfo trackingInfo;

    @Override // com.netflix.model.leafs.social.UserNotificationCtaButtonTrackingInfo
    public String action() {
        return this.action;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationCtaButtonTrackingInfo
    public String buttonText() {
        return this.buttonText;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationCtaButtonTrackingInfo
    public UserNotificationCtaTrackingInfo trackingInfo() {
        return this.trackingInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_UserNotificationCtaButtonTrackingInfo(String str, String str2, UserNotificationCtaTrackingInfo userNotificationCtaTrackingInfo) {
        this.action = str;
        this.buttonText = str2;
        this.trackingInfo = userNotificationCtaTrackingInfo;
    }

    public String toString() {
        return "UserNotificationCtaButtonTrackingInfo{action=" + this.action + ", buttonText=" + this.buttonText + ", trackingInfo=" + this.trackingInfo + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserNotificationCtaButtonTrackingInfo) {
            UserNotificationCtaButtonTrackingInfo userNotificationCtaButtonTrackingInfo = (UserNotificationCtaButtonTrackingInfo) obj;
            String str = this.action;
            if (str != null ? str.equals(userNotificationCtaButtonTrackingInfo.action()) : userNotificationCtaButtonTrackingInfo.action() == null) {
                String str2 = this.buttonText;
                if (str2 != null ? str2.equals(userNotificationCtaButtonTrackingInfo.buttonText()) : userNotificationCtaButtonTrackingInfo.buttonText() == null) {
                    UserNotificationCtaTrackingInfo userNotificationCtaTrackingInfo = this.trackingInfo;
                    if (userNotificationCtaTrackingInfo == null) {
                        if (userNotificationCtaButtonTrackingInfo.trackingInfo() == null) {
                            return true;
                        }
                    } else if (userNotificationCtaTrackingInfo.equals(userNotificationCtaButtonTrackingInfo.trackingInfo())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.action;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.buttonText;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        UserNotificationCtaTrackingInfo userNotificationCtaTrackingInfo = this.trackingInfo;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ (userNotificationCtaTrackingInfo != null ? userNotificationCtaTrackingInfo.hashCode() : 0);
    }
}
