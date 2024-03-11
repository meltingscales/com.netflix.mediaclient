package com.netflix.model.leafs.social.multititle;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.social.multititle.NotificationHeroModule;
import java.util.List;

/* renamed from: com.netflix.model.leafs.social.multititle.$$AutoValue_NotificationHeroModule  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_NotificationHeroModule extends NotificationHeroModule {
    private final List<NotificationHeroTitleAction> actions;
    private final String bodyCopy;
    private final String heroImage;
    private final String heroImageWebp;
    private final String layout;
    private final int titleId;
    private final VideoType videoType;

    @Override // com.netflix.model.leafs.social.multititle.NotificationHeroModule
    public List<NotificationHeroTitleAction> actions() {
        return this.actions;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationHeroModule
    public String bodyCopy() {
        return this.bodyCopy;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationHeroModule
    public String heroImage() {
        return this.heroImage;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationHeroModule
    public String heroImageWebp() {
        return this.heroImageWebp;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationHeroModule
    public String layout() {
        return this.layout;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationHeroModule
    public int titleId() {
        return this.titleId;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationHeroModule
    public VideoType videoType() {
        return this.videoType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_NotificationHeroModule(String str, String str2, String str3, String str4, int i, VideoType videoType, List<NotificationHeroTitleAction> list) {
        if (str == null) {
            throw new NullPointerException("Null layout");
        }
        this.layout = str;
        if (str2 == null) {
            throw new NullPointerException("Null bodyCopy");
        }
        this.bodyCopy = str2;
        if (str3 == null) {
            throw new NullPointerException("Null heroImage");
        }
        this.heroImage = str3;
        if (str4 == null) {
            throw new NullPointerException("Null heroImageWebp");
        }
        this.heroImageWebp = str4;
        this.titleId = i;
        if (videoType == null) {
            throw new NullPointerException("Null videoType");
        }
        this.videoType = videoType;
        if (list == null) {
            throw new NullPointerException("Null actions");
        }
        this.actions = list;
    }

    public String toString() {
        return "NotificationHeroModule{layout=" + this.layout + ", bodyCopy=" + this.bodyCopy + ", heroImage=" + this.heroImage + ", heroImageWebp=" + this.heroImageWebp + ", titleId=" + this.titleId + ", videoType=" + this.videoType + ", actions=" + this.actions + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NotificationHeroModule) {
            NotificationHeroModule notificationHeroModule = (NotificationHeroModule) obj;
            return this.layout.equals(notificationHeroModule.layout()) && this.bodyCopy.equals(notificationHeroModule.bodyCopy()) && this.heroImage.equals(notificationHeroModule.heroImage()) && this.heroImageWebp.equals(notificationHeroModule.heroImageWebp()) && this.titleId == notificationHeroModule.titleId() && this.videoType.equals(notificationHeroModule.videoType()) && this.actions.equals(notificationHeroModule.actions());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.layout.hashCode();
        int hashCode2 = this.bodyCopy.hashCode();
        int hashCode3 = this.heroImage.hashCode();
        int hashCode4 = this.heroImageWebp.hashCode();
        int i = this.titleId;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i) * 1000003) ^ this.videoType.hashCode()) * 1000003) ^ this.actions.hashCode();
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationHeroModule
    public NotificationHeroModule.Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.model.leafs.social.multititle.$$AutoValue_NotificationHeroModule$Builder */
    /* loaded from: classes.dex */
    public static final class Builder extends NotificationHeroModule.Builder {
        private List<NotificationHeroTitleAction> actions;
        private String bodyCopy;
        private String heroImage;
        private String heroImageWebp;
        private String layout;
        private Integer titleId;
        private VideoType videoType;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(NotificationHeroModule notificationHeroModule) {
            this.layout = notificationHeroModule.layout();
            this.bodyCopy = notificationHeroModule.bodyCopy();
            this.heroImage = notificationHeroModule.heroImage();
            this.heroImageWebp = notificationHeroModule.heroImageWebp();
            this.titleId = Integer.valueOf(notificationHeroModule.titleId());
            this.videoType = notificationHeroModule.videoType();
            this.actions = notificationHeroModule.actions();
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationHeroModule.Builder
        public NotificationHeroModule.Builder layout(String str) {
            if (str != null) {
                this.layout = str;
                return this;
            }
            throw new NullPointerException("Null layout");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationHeroModule.Builder
        public NotificationHeroModule.Builder bodyCopy(String str) {
            if (str != null) {
                this.bodyCopy = str;
                return this;
            }
            throw new NullPointerException("Null bodyCopy");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationHeroModule.Builder
        public NotificationHeroModule.Builder heroImage(String str) {
            if (str != null) {
                this.heroImage = str;
                return this;
            }
            throw new NullPointerException("Null heroImage");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationHeroModule.Builder
        public NotificationHeroModule.Builder heroImageWebp(String str) {
            if (str != null) {
                this.heroImageWebp = str;
                return this;
            }
            throw new NullPointerException("Null heroImageWebp");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationHeroModule.Builder
        public NotificationHeroModule.Builder titleId(int i) {
            this.titleId = Integer.valueOf(i);
            return this;
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationHeroModule.Builder
        public NotificationHeroModule.Builder videoType(VideoType videoType) {
            if (videoType != null) {
                this.videoType = videoType;
                return this;
            }
            throw new NullPointerException("Null videoType");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationHeroModule.Builder
        public NotificationHeroModule.Builder actions(List<NotificationHeroTitleAction> list) {
            if (list != null) {
                this.actions = list;
                return this;
            }
            throw new NullPointerException("Null actions");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationHeroModule.Builder
        public NotificationHeroModule build() {
            String str = "";
            if (this.layout == null) {
                str = " layout";
            }
            if (this.bodyCopy == null) {
                str = str + " bodyCopy";
            }
            if (this.heroImage == null) {
                str = str + " heroImage";
            }
            if (this.heroImageWebp == null) {
                str = str + " heroImageWebp";
            }
            if (this.titleId == null) {
                str = str + " titleId";
            }
            if (this.videoType == null) {
                str = str + " videoType";
            }
            if (this.actions == null) {
                str = str + " actions";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_NotificationHeroModule(this.layout, this.bodyCopy, this.heroImage, this.heroImageWebp, this.titleId.intValue(), this.videoType, this.actions);
        }
    }
}
