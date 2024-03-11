package com.netflix.model.leafs.social;

import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.model.leafs.social.UserNotificationsListSummary;
import java.util.List;

/* renamed from: com.netflix.model.leafs.social.$$AutoValue_UserNotificationsListSummary  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_UserNotificationsListSummary extends UserNotificationsListSummary {
    private final int baseTrackId;
    private final int mdpTrackId;
    private final List<NotificationSummaryItem> notifications;
    private final int playerTrackId;
    private final String requestId;

    @Override // com.netflix.model.leafs.social.NotificationsListSummary
    public int baseTrackId() {
        return this.baseTrackId;
    }

    @Override // com.netflix.model.leafs.social.NotificationsListSummary
    public int mdpTrackId() {
        return this.mdpTrackId;
    }

    @Override // com.netflix.model.leafs.social.NotificationsListSummary
    public List<NotificationSummaryItem> notifications() {
        return this.notifications;
    }

    @Override // com.netflix.model.leafs.social.NotificationsListSummary
    public int playerTrackId() {
        return this.playerTrackId;
    }

    @Override // com.netflix.model.leafs.social.NotificationsListSummary
    public String requestId() {
        return this.requestId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_UserNotificationsListSummary(String str, int i, int i2, int i3, List<NotificationSummaryItem> list) {
        this.requestId = str;
        this.baseTrackId = i;
        this.mdpTrackId = i2;
        this.playerTrackId = i3;
        this.notifications = list;
    }

    public String toString() {
        return "UserNotificationsListSummary{requestId=" + this.requestId + ", baseTrackId=" + this.baseTrackId + ", mdpTrackId=" + this.mdpTrackId + ", playerTrackId=" + this.playerTrackId + ", notifications=" + this.notifications + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserNotificationsListSummary) {
            UserNotificationsListSummary userNotificationsListSummary = (UserNotificationsListSummary) obj;
            String str = this.requestId;
            if (str != null ? str.equals(userNotificationsListSummary.requestId()) : userNotificationsListSummary.requestId() == null) {
                if (this.baseTrackId == userNotificationsListSummary.baseTrackId() && this.mdpTrackId == userNotificationsListSummary.mdpTrackId() && this.playerTrackId == userNotificationsListSummary.playerTrackId()) {
                    List<NotificationSummaryItem> list = this.notifications;
                    if (list == null) {
                        if (userNotificationsListSummary.notifications() == null) {
                            return true;
                        }
                    } else if (list.equals(userNotificationsListSummary.notifications())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.requestId;
        int hashCode = str == null ? 0 : str.hashCode();
        int i = this.baseTrackId;
        int i2 = this.mdpTrackId;
        int i3 = this.playerTrackId;
        List<NotificationSummaryItem> list = this.notifications;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ (list != null ? list.hashCode() : 0);
    }

    @Override // com.netflix.model.leafs.social.UserNotificationsListSummary
    public UserNotificationsListSummary.Builder toBuilder() {
        return new Builder(this);
    }

    /* renamed from: com.netflix.model.leafs.social.$$AutoValue_UserNotificationsListSummary$Builder */
    /* loaded from: classes.dex */
    static final class Builder extends UserNotificationsListSummary.Builder {
        private Integer baseTrackId;
        private Integer mdpTrackId;
        private List<NotificationSummaryItem> notifications;
        private Integer playerTrackId;
        private String requestId;

        @Override // com.netflix.model.leafs.social.UserNotificationsListSummary.Builder
        public UserNotificationsListSummary.Builder notifications(List<NotificationSummaryItem> list) {
            this.notifications = list;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationsListSummary.Builder
        public UserNotificationsListSummary.Builder requestId(String str) {
            this.requestId = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(UserNotificationsListSummary userNotificationsListSummary) {
            this.requestId = userNotificationsListSummary.requestId();
            this.baseTrackId = Integer.valueOf(userNotificationsListSummary.baseTrackId());
            this.mdpTrackId = Integer.valueOf(userNotificationsListSummary.mdpTrackId());
            this.playerTrackId = Integer.valueOf(userNotificationsListSummary.playerTrackId());
            this.notifications = userNotificationsListSummary.notifications();
        }

        @Override // com.netflix.model.leafs.social.UserNotificationsListSummary.Builder
        public UserNotificationsListSummary.Builder baseTrackId(int i) {
            this.baseTrackId = Integer.valueOf(i);
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationsListSummary.Builder
        public UserNotificationsListSummary.Builder mdpTrackId(int i) {
            this.mdpTrackId = Integer.valueOf(i);
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationsListSummary.Builder
        public UserNotificationsListSummary.Builder playerTrackId(int i) {
            this.playerTrackId = Integer.valueOf(i);
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationsListSummary.Builder
        public UserNotificationsListSummary build() {
            String str = "";
            if (this.baseTrackId == null) {
                str = " baseTrackId";
            }
            if (this.mdpTrackId == null) {
                str = str + " mdpTrackId";
            }
            if (this.playerTrackId == null) {
                str = str + " playerTrackId";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_UserNotificationsListSummary(this.requestId, this.baseTrackId.intValue(), this.mdpTrackId.intValue(), this.playerTrackId.intValue(), this.notifications);
        }
    }
}
