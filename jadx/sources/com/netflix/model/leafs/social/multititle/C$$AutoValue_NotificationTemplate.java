package com.netflix.model.leafs.social.multititle;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.social.multititle.$$AutoValue_NotificationTemplate  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_NotificationTemplate extends NotificationTemplate {
    private final String bodyText;
    private final NotificationCtaButton ctaButton;
    private final String headlineText;
    private final NotificationModuleFilters moduleFiltersForActions;
    private final NotificationModuleList modulesList;

    @Override // com.netflix.model.leafs.social.multititle.NotificationTemplate
    public String bodyText() {
        return this.bodyText;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationTemplate
    public NotificationCtaButton ctaButton() {
        return this.ctaButton;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationTemplate
    public String headlineText() {
        return this.headlineText;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationTemplate
    @SerializedName("showModulesOnAction")
    public NotificationModuleFilters moduleFiltersForActions() {
        return this.moduleFiltersForActions;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationTemplate
    @SerializedName("modules")
    public NotificationModuleList modulesList() {
        return this.modulesList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_NotificationTemplate(String str, String str2, NotificationCtaButton notificationCtaButton, NotificationModuleList notificationModuleList, NotificationModuleFilters notificationModuleFilters) {
        if (str == null) {
            throw new NullPointerException("Null headlineText");
        }
        this.headlineText = str;
        if (str2 == null) {
            throw new NullPointerException("Null bodyText");
        }
        this.bodyText = str2;
        if (notificationCtaButton == null) {
            throw new NullPointerException("Null ctaButton");
        }
        this.ctaButton = notificationCtaButton;
        this.modulesList = notificationModuleList;
        this.moduleFiltersForActions = notificationModuleFilters;
    }

    public String toString() {
        return "NotificationTemplate{headlineText=" + this.headlineText + ", bodyText=" + this.bodyText + ", ctaButton=" + this.ctaButton + ", modulesList=" + this.modulesList + ", moduleFiltersForActions=" + this.moduleFiltersForActions + "}";
    }

    public boolean equals(Object obj) {
        NotificationModuleList notificationModuleList;
        if (obj == this) {
            return true;
        }
        if (obj instanceof NotificationTemplate) {
            NotificationTemplate notificationTemplate = (NotificationTemplate) obj;
            if (this.headlineText.equals(notificationTemplate.headlineText()) && this.bodyText.equals(notificationTemplate.bodyText()) && this.ctaButton.equals(notificationTemplate.ctaButton()) && ((notificationModuleList = this.modulesList) != null ? notificationModuleList.equals(notificationTemplate.modulesList()) : notificationTemplate.modulesList() == null)) {
                NotificationModuleFilters notificationModuleFilters = this.moduleFiltersForActions;
                if (notificationModuleFilters == null) {
                    if (notificationTemplate.moduleFiltersForActions() == null) {
                        return true;
                    }
                } else if (notificationModuleFilters.equals(notificationTemplate.moduleFiltersForActions())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.headlineText.hashCode();
        int hashCode2 = this.bodyText.hashCode();
        int hashCode3 = this.ctaButton.hashCode();
        NotificationModuleList notificationModuleList = this.modulesList;
        int hashCode4 = notificationModuleList == null ? 0 : notificationModuleList.hashCode();
        NotificationModuleFilters notificationModuleFilters = this.moduleFiltersForActions;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (notificationModuleFilters != null ? notificationModuleFilters.hashCode() : 0);
    }
}
