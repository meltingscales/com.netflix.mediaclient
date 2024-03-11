package com.netflix.model.leafs.social.multititle;

import com.netflix.model.leafs.social.UserNotificationCtaButtonTrackingInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.social.multititle.$$AutoValue_NotificationCtaButton  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_NotificationCtaButton extends NotificationCtaButton {
    private final String action;
    private final String buttonText;
    private final UserNotificationCtaButtonTrackingInfo trackingInfo;

    @Override // com.netflix.model.leafs.social.multititle.NotificationCtaButton
    public String action() {
        return this.action;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationCtaButton
    public String buttonText() {
        return this.buttonText;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationCtaButton
    public UserNotificationCtaButtonTrackingInfo trackingInfo() {
        return this.trackingInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_NotificationCtaButton(String str, String str2, UserNotificationCtaButtonTrackingInfo userNotificationCtaButtonTrackingInfo) {
        if (str == null) {
            throw new NullPointerException("Null action");
        }
        this.action = str;
        if (str2 == null) {
            throw new NullPointerException("Null buttonText");
        }
        this.buttonText = str2;
        if (userNotificationCtaButtonTrackingInfo == null) {
            throw new NullPointerException("Null trackingInfo");
        }
        this.trackingInfo = userNotificationCtaButtonTrackingInfo;
    }

    public String toString() {
        return "NotificationCtaButton{action=" + this.action + ", buttonText=" + this.buttonText + ", trackingInfo=" + this.trackingInfo + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NotificationCtaButton) {
            NotificationCtaButton notificationCtaButton = (NotificationCtaButton) obj;
            return this.action.equals(notificationCtaButton.action()) && this.buttonText.equals(notificationCtaButton.buttonText()) && this.trackingInfo.equals(notificationCtaButton.trackingInfo());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.action.hashCode();
        return ((((hashCode ^ 1000003) * 1000003) ^ this.buttonText.hashCode()) * 1000003) ^ this.trackingInfo.hashCode();
    }
}
