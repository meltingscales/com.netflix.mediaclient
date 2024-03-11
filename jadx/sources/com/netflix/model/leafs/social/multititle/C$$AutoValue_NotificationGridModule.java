package com.netflix.model.leafs.social.multititle;

import com.netflix.model.leafs.social.multititle.NotificationGridModule;
import java.util.List;

/* renamed from: com.netflix.model.leafs.social.multititle.$$AutoValue_NotificationGridModule  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_NotificationGridModule extends NotificationGridModule {
    private final List<NotificationGridTitleAction> actions;
    private final int columnWidth;
    private final String headlineText;
    private final String layout;

    @Override // com.netflix.model.leafs.social.multititle.NotificationGridModule
    public List<NotificationGridTitleAction> actions() {
        return this.actions;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationGridModule
    public int columnWidth() {
        return this.columnWidth;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationGridModule
    public String headlineText() {
        return this.headlineText;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationGridModule
    public String layout() {
        return this.layout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_NotificationGridModule(String str, int i, String str2, List<NotificationGridTitleAction> list) {
        if (str == null) {
            throw new NullPointerException("Null layout");
        }
        this.layout = str;
        this.columnWidth = i;
        if (str2 == null) {
            throw new NullPointerException("Null headlineText");
        }
        this.headlineText = str2;
        if (list == null) {
            throw new NullPointerException("Null actions");
        }
        this.actions = list;
    }

    public String toString() {
        return "NotificationGridModule{layout=" + this.layout + ", columnWidth=" + this.columnWidth + ", headlineText=" + this.headlineText + ", actions=" + this.actions + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NotificationGridModule) {
            NotificationGridModule notificationGridModule = (NotificationGridModule) obj;
            return this.layout.equals(notificationGridModule.layout()) && this.columnWidth == notificationGridModule.columnWidth() && this.headlineText.equals(notificationGridModule.headlineText()) && this.actions.equals(notificationGridModule.actions());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.layout.hashCode();
        int i = this.columnWidth;
        return ((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.headlineText.hashCode()) * 1000003) ^ this.actions.hashCode();
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationGridModule
    public NotificationGridModule.Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.model.leafs.social.multititle.$$AutoValue_NotificationGridModule$Builder */
    /* loaded from: classes.dex */
    public static final class Builder extends NotificationGridModule.Builder {
        private List<NotificationGridTitleAction> actions;
        private Integer columnWidth;
        private String headlineText;
        private String layout;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(NotificationGridModule notificationGridModule) {
            this.layout = notificationGridModule.layout();
            this.columnWidth = Integer.valueOf(notificationGridModule.columnWidth());
            this.headlineText = notificationGridModule.headlineText();
            this.actions = notificationGridModule.actions();
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationGridModule.Builder
        public NotificationGridModule.Builder layout(String str) {
            if (str != null) {
                this.layout = str;
                return this;
            }
            throw new NullPointerException("Null layout");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationGridModule.Builder
        public NotificationGridModule.Builder columnWidth(int i) {
            this.columnWidth = Integer.valueOf(i);
            return this;
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationGridModule.Builder
        public NotificationGridModule.Builder headlineText(String str) {
            if (str != null) {
                this.headlineText = str;
                return this;
            }
            throw new NullPointerException("Null headlineText");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationGridModule.Builder
        public NotificationGridModule.Builder actions(List<NotificationGridTitleAction> list) {
            if (list != null) {
                this.actions = list;
                return this;
            }
            throw new NullPointerException("Null actions");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationGridModule.Builder
        public NotificationGridModule build() {
            String str = "";
            if (this.layout == null) {
                str = " layout";
            }
            if (this.columnWidth == null) {
                str = str + " columnWidth";
            }
            if (this.headlineText == null) {
                str = str + " headlineText";
            }
            if (this.actions == null) {
                str = str + " actions";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_NotificationGridModule(this.layout, this.columnWidth.intValue(), this.headlineText, this.actions);
        }
    }
}
