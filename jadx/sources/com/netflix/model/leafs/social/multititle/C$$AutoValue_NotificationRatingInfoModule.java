package com.netflix.model.leafs.social.multititle;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule;
import java.util.List;

/* renamed from: com.netflix.model.leafs.social.multititle.$$AutoValue_NotificationRatingInfoModule  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_NotificationRatingInfoModule extends NotificationRatingInfoModule {
    private final List<NotificationRatingAction> actions;
    private final String bodyCopy;
    private final String bodyCopyConfirmationThumbsDown;
    private final String bodyCopyConfirmationThumbsUp;
    private final String bodyCopyConfirmationThumbsUpDouble;
    private final String boxshot;
    private final String boxshotWebp;
    private final String layout;
    private final int titleId;
    private final VideoType videoType;

    @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule
    public List<NotificationRatingAction> actions() {
        return this.actions;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule
    public String bodyCopy() {
        return this.bodyCopy;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule
    public String bodyCopyConfirmationThumbsDown() {
        return this.bodyCopyConfirmationThumbsDown;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule
    public String bodyCopyConfirmationThumbsUp() {
        return this.bodyCopyConfirmationThumbsUp;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule
    public String bodyCopyConfirmationThumbsUpDouble() {
        return this.bodyCopyConfirmationThumbsUpDouble;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule
    public String boxshot() {
        return this.boxshot;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule
    public String boxshotWebp() {
        return this.boxshotWebp;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule
    public String layout() {
        return this.layout;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule
    public int titleId() {
        return this.titleId;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule
    public VideoType videoType() {
        return this.videoType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_NotificationRatingInfoModule(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<NotificationRatingAction> list, int i, VideoType videoType) {
        if (str == null) {
            throw new NullPointerException("Null layout");
        }
        this.layout = str;
        if (str2 == null) {
            throw new NullPointerException("Null bodyCopy");
        }
        this.bodyCopy = str2;
        if (str3 == null) {
            throw new NullPointerException("Null bodyCopyConfirmationThumbsUp");
        }
        this.bodyCopyConfirmationThumbsUp = str3;
        this.bodyCopyConfirmationThumbsUpDouble = str4;
        if (str5 == null) {
            throw new NullPointerException("Null bodyCopyConfirmationThumbsDown");
        }
        this.bodyCopyConfirmationThumbsDown = str5;
        if (str6 == null) {
            throw new NullPointerException("Null boxshot");
        }
        this.boxshot = str6;
        if (str7 == null) {
            throw new NullPointerException("Null boxshotWebp");
        }
        this.boxshotWebp = str7;
        if (list == null) {
            throw new NullPointerException("Null actions");
        }
        this.actions = list;
        this.titleId = i;
        if (videoType == null) {
            throw new NullPointerException("Null videoType");
        }
        this.videoType = videoType;
    }

    public String toString() {
        return "NotificationRatingInfoModule{layout=" + this.layout + ", bodyCopy=" + this.bodyCopy + ", bodyCopyConfirmationThumbsUp=" + this.bodyCopyConfirmationThumbsUp + ", bodyCopyConfirmationThumbsUpDouble=" + this.bodyCopyConfirmationThumbsUpDouble + ", bodyCopyConfirmationThumbsDown=" + this.bodyCopyConfirmationThumbsDown + ", boxshot=" + this.boxshot + ", boxshotWebp=" + this.boxshotWebp + ", actions=" + this.actions + ", titleId=" + this.titleId + ", videoType=" + this.videoType + "}";
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof NotificationRatingInfoModule) {
            NotificationRatingInfoModule notificationRatingInfoModule = (NotificationRatingInfoModule) obj;
            return this.layout.equals(notificationRatingInfoModule.layout()) && this.bodyCopy.equals(notificationRatingInfoModule.bodyCopy()) && this.bodyCopyConfirmationThumbsUp.equals(notificationRatingInfoModule.bodyCopyConfirmationThumbsUp()) && ((str = this.bodyCopyConfirmationThumbsUpDouble) != null ? str.equals(notificationRatingInfoModule.bodyCopyConfirmationThumbsUpDouble()) : notificationRatingInfoModule.bodyCopyConfirmationThumbsUpDouble() == null) && this.bodyCopyConfirmationThumbsDown.equals(notificationRatingInfoModule.bodyCopyConfirmationThumbsDown()) && this.boxshot.equals(notificationRatingInfoModule.boxshot()) && this.boxshotWebp.equals(notificationRatingInfoModule.boxshotWebp()) && this.actions.equals(notificationRatingInfoModule.actions()) && this.titleId == notificationRatingInfoModule.titleId() && this.videoType.equals(notificationRatingInfoModule.videoType());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.layout.hashCode();
        int hashCode2 = this.bodyCopy.hashCode();
        int hashCode3 = this.bodyCopyConfirmationThumbsUp.hashCode();
        String str = this.bodyCopyConfirmationThumbsUpDouble;
        int hashCode4 = str == null ? 0 : str.hashCode();
        int hashCode5 = this.bodyCopyConfirmationThumbsDown.hashCode();
        int hashCode6 = this.boxshot.hashCode();
        int hashCode7 = this.boxshotWebp.hashCode();
        return ((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ this.actions.hashCode()) * 1000003) ^ this.titleId) * 1000003) ^ this.videoType.hashCode();
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule
    public NotificationRatingInfoModule.Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.model.leafs.social.multititle.$$AutoValue_NotificationRatingInfoModule$Builder */
    /* loaded from: classes.dex */
    public static final class Builder extends NotificationRatingInfoModule.Builder {
        private List<NotificationRatingAction> actions;
        private String bodyCopy;
        private String bodyCopyConfirmationThumbsDown;
        private String bodyCopyConfirmationThumbsUp;
        private String bodyCopyConfirmationThumbsUpDouble;
        private String boxshot;
        private String boxshotWebp;
        private String layout;
        private Integer titleId;
        private VideoType videoType;

        @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule.Builder
        public NotificationRatingInfoModule.Builder bodyCopyConfirmationThumbsUpDouble(String str) {
            this.bodyCopyConfirmationThumbsUpDouble = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(NotificationRatingInfoModule notificationRatingInfoModule) {
            this.layout = notificationRatingInfoModule.layout();
            this.bodyCopy = notificationRatingInfoModule.bodyCopy();
            this.bodyCopyConfirmationThumbsUp = notificationRatingInfoModule.bodyCopyConfirmationThumbsUp();
            this.bodyCopyConfirmationThumbsUpDouble = notificationRatingInfoModule.bodyCopyConfirmationThumbsUpDouble();
            this.bodyCopyConfirmationThumbsDown = notificationRatingInfoModule.bodyCopyConfirmationThumbsDown();
            this.boxshot = notificationRatingInfoModule.boxshot();
            this.boxshotWebp = notificationRatingInfoModule.boxshotWebp();
            this.actions = notificationRatingInfoModule.actions();
            this.titleId = Integer.valueOf(notificationRatingInfoModule.titleId());
            this.videoType = notificationRatingInfoModule.videoType();
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule.Builder
        public NotificationRatingInfoModule.Builder layout(String str) {
            if (str != null) {
                this.layout = str;
                return this;
            }
            throw new NullPointerException("Null layout");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule.Builder
        public NotificationRatingInfoModule.Builder bodyCopy(String str) {
            if (str != null) {
                this.bodyCopy = str;
                return this;
            }
            throw new NullPointerException("Null bodyCopy");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule.Builder
        public NotificationRatingInfoModule.Builder bodyCopyConfirmationThumbsUp(String str) {
            if (str != null) {
                this.bodyCopyConfirmationThumbsUp = str;
                return this;
            }
            throw new NullPointerException("Null bodyCopyConfirmationThumbsUp");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule.Builder
        public NotificationRatingInfoModule.Builder bodyCopyConfirmationThumbsDown(String str) {
            if (str != null) {
                this.bodyCopyConfirmationThumbsDown = str;
                return this;
            }
            throw new NullPointerException("Null bodyCopyConfirmationThumbsDown");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule.Builder
        public NotificationRatingInfoModule.Builder boxshot(String str) {
            if (str != null) {
                this.boxshot = str;
                return this;
            }
            throw new NullPointerException("Null boxshot");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule.Builder
        public NotificationRatingInfoModule.Builder boxshotWebp(String str) {
            if (str != null) {
                this.boxshotWebp = str;
                return this;
            }
            throw new NullPointerException("Null boxshotWebp");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule.Builder
        public NotificationRatingInfoModule.Builder actions(List<NotificationRatingAction> list) {
            if (list != null) {
                this.actions = list;
                return this;
            }
            throw new NullPointerException("Null actions");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule.Builder
        public NotificationRatingInfoModule.Builder titleId(int i) {
            this.titleId = Integer.valueOf(i);
            return this;
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule.Builder
        public NotificationRatingInfoModule.Builder videoType(VideoType videoType) {
            if (videoType != null) {
                this.videoType = videoType;
                return this;
            }
            throw new NullPointerException("Null videoType");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule.Builder
        public NotificationRatingInfoModule build() {
            String str = "";
            if (this.layout == null) {
                str = " layout";
            }
            if (this.bodyCopy == null) {
                str = str + " bodyCopy";
            }
            if (this.bodyCopyConfirmationThumbsUp == null) {
                str = str + " bodyCopyConfirmationThumbsUp";
            }
            if (this.bodyCopyConfirmationThumbsDown == null) {
                str = str + " bodyCopyConfirmationThumbsDown";
            }
            if (this.boxshot == null) {
                str = str + " boxshot";
            }
            if (this.boxshotWebp == null) {
                str = str + " boxshotWebp";
            }
            if (this.actions == null) {
                str = str + " actions";
            }
            if (this.titleId == null) {
                str = str + " titleId";
            }
            if (this.videoType == null) {
                str = str + " videoType";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_NotificationRatingInfoModule(this.layout, this.bodyCopy, this.bodyCopyConfirmationThumbsUp, this.bodyCopyConfirmationThumbsUpDouble, this.bodyCopyConfirmationThumbsDown, this.boxshot, this.boxshotWebp, this.actions, this.titleId.intValue(), this.videoType);
        }
    }
}
