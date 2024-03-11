package com.netflix.model.leafs.social;

/* renamed from: com.netflix.model.leafs.social.$$AutoValue_UserNotificationActionTrackingInfo  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_UserNotificationActionTrackingInfo extends UserNotificationActionTrackingInfo {
    private final String action;
    private final String messageGuid;
    private final String titleId;
    private final Integer trackId;

    @Override // com.netflix.model.leafs.social.UserNotificationActionTrackingInfo
    public String action() {
        return this.action;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationActionTrackingInfo
    public String messageGuid() {
        return this.messageGuid;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationActionTrackingInfo
    public String titleId() {
        return this.titleId;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationActionTrackingInfo
    public Integer trackId() {
        return this.trackId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_UserNotificationActionTrackingInfo(String str, String str2, String str3, Integer num) {
        this.titleId = str;
        this.action = str2;
        this.messageGuid = str3;
        this.trackId = num;
    }

    public String toString() {
        return "UserNotificationActionTrackingInfo{titleId=" + this.titleId + ", action=" + this.action + ", messageGuid=" + this.messageGuid + ", trackId=" + this.trackId + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserNotificationActionTrackingInfo) {
            UserNotificationActionTrackingInfo userNotificationActionTrackingInfo = (UserNotificationActionTrackingInfo) obj;
            String str = this.titleId;
            if (str != null ? str.equals(userNotificationActionTrackingInfo.titleId()) : userNotificationActionTrackingInfo.titleId() == null) {
                String str2 = this.action;
                if (str2 != null ? str2.equals(userNotificationActionTrackingInfo.action()) : userNotificationActionTrackingInfo.action() == null) {
                    String str3 = this.messageGuid;
                    if (str3 != null ? str3.equals(userNotificationActionTrackingInfo.messageGuid()) : userNotificationActionTrackingInfo.messageGuid() == null) {
                        Integer num = this.trackId;
                        if (num == null) {
                            if (userNotificationActionTrackingInfo.trackId() == null) {
                                return true;
                            }
                        } else if (num.equals(userNotificationActionTrackingInfo.trackId())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.titleId;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.action;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.messageGuid;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.trackId;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (num != null ? num.hashCode() : 0);
    }
}
