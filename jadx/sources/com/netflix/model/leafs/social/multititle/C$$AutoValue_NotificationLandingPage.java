package com.netflix.model.leafs.social.multititle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.social.multititle.$$AutoValue_NotificationLandingPage  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_NotificationLandingPage extends NotificationLandingPage {
    private final String payloadVersion;
    private final NotificationTemplate template;
    private final String templateId;
    private final String templateType;
    private final int trackId;

    @Override // com.netflix.model.leafs.social.multititle.NotificationLandingPage
    public String payloadVersion() {
        return this.payloadVersion;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationLandingPage
    public NotificationTemplate template() {
        return this.template;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationLandingPage
    public String templateId() {
        return this.templateId;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationLandingPage
    public String templateType() {
        return this.templateType;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationLandingPage
    public int trackId() {
        return this.trackId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_NotificationLandingPage(String str, String str2, String str3, NotificationTemplate notificationTemplate, int i) {
        if (str == null) {
            throw new NullPointerException("Null payloadVersion");
        }
        this.payloadVersion = str;
        if (str2 == null) {
            throw new NullPointerException("Null templateId");
        }
        this.templateId = str2;
        if (str3 == null) {
            throw new NullPointerException("Null templateType");
        }
        this.templateType = str3;
        if (notificationTemplate == null) {
            throw new NullPointerException("Null template");
        }
        this.template = notificationTemplate;
        this.trackId = i;
    }

    public String toString() {
        return "NotificationLandingPage{payloadVersion=" + this.payloadVersion + ", templateId=" + this.templateId + ", templateType=" + this.templateType + ", template=" + this.template + ", trackId=" + this.trackId + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NotificationLandingPage) {
            NotificationLandingPage notificationLandingPage = (NotificationLandingPage) obj;
            return this.payloadVersion.equals(notificationLandingPage.payloadVersion()) && this.templateId.equals(notificationLandingPage.templateId()) && this.templateType.equals(notificationLandingPage.templateType()) && this.template.equals(notificationLandingPage.template()) && this.trackId == notificationLandingPage.trackId();
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.payloadVersion.hashCode();
        int hashCode2 = this.templateId.hashCode();
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ this.templateType.hashCode()) * 1000003) ^ this.template.hashCode()) * 1000003) ^ this.trackId;
    }
}
