package com.netflix.model.leafs.social;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.social.UserNotificationSummary;
import com.netflix.model.leafs.social.multititle.NotificationLandingPage;

/* renamed from: com.netflix.model.leafs.social.$$AutoValue_UserNotificationSummary  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_UserNotificationSummary extends UserNotificationSummary {
    private final String body;
    private final String eventGuid;
    private final FriendProfile friendProfile;
    private final String header;
    private final String imageAltText;
    private final String imageTarget;
    private final String imageUrl;
    private final boolean inQueue;
    private final NotificationLandingPage landingPage;
    private final String messageGuid;
    private final String messageName;
    private final String messageString;
    private final boolean read;
    private final boolean showTimestamp;
    private final String textTarget;
    private final long timestamp;
    private final UserNotificationLandingTrackingInfo trackingInfo;
    private final String tts;
    private final String tvCardUrl;
    private final String urlTarget;
    private final String videoId;
    private final String videoTitle;
    private final VideoType videoType;

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    public String body() {
        return this.body;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    public String eventGuid() {
        return this.eventGuid;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    @SerializedName("fromUser")
    public FriendProfile friendProfile() {
        return this.friendProfile;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    public String header() {
        return this.header;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    public String imageAltText() {
        return this.imageAltText;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    public String imageTarget() {
        return this.imageTarget;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    public String imageUrl() {
        return this.imageUrl;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    public boolean inQueue() {
        return this.inQueue;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    public NotificationLandingPage landingPage() {
        return this.landingPage;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    public String messageGuid() {
        return this.messageGuid;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary
    public String messageName() {
        return this.messageName;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    @SerializedName("msgString")
    public String messageString() {
        return this.messageString;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    @SerializedName("isRead")
    public boolean read() {
        return this.read;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    public boolean showTimestamp() {
        return this.showTimestamp;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary
    public String textTarget() {
        return this.textTarget;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    public long timestamp() {
        return this.timestamp;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    public UserNotificationLandingTrackingInfo trackingInfo() {
        return this.trackingInfo;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    public String tts() {
        return this.tts;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary
    public String tvCardUrl() {
        return this.tvCardUrl;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    public String urlTarget() {
        return this.urlTarget;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    public String videoId() {
        return this.videoId;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    public String videoTitle() {
        return this.videoTitle;
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary, o.InterfaceC5154btR
    public VideoType videoType() {
        return this.videoType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_UserNotificationSummary(String str, String str2, String str3, String str4, VideoType videoType, String str5, boolean z, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, NotificationLandingPage notificationLandingPage, boolean z2, long j, boolean z3, UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo, FriendProfile friendProfile, String str15) {
        this.messageName = str;
        this.messageGuid = str2;
        this.eventGuid = str3;
        this.videoId = str4;
        this.videoType = videoType;
        this.videoTitle = str5;
        this.inQueue = z;
        this.imageUrl = str6;
        this.imageAltText = str7;
        this.imageTarget = str8;
        this.tvCardUrl = str9;
        this.header = str10;
        this.body = str11;
        this.tts = str12;
        this.textTarget = str13;
        this.urlTarget = str14;
        this.landingPage = notificationLandingPage;
        this.read = z2;
        this.timestamp = j;
        this.showTimestamp = z3;
        this.trackingInfo = userNotificationLandingTrackingInfo;
        this.friendProfile = friendProfile;
        this.messageString = str15;
    }

    public String toString() {
        return "UserNotificationSummary{messageName=" + this.messageName + ", messageGuid=" + this.messageGuid + ", eventGuid=" + this.eventGuid + ", videoId=" + this.videoId + ", videoType=" + this.videoType + ", videoTitle=" + this.videoTitle + ", inQueue=" + this.inQueue + ", imageUrl=" + this.imageUrl + ", imageAltText=" + this.imageAltText + ", imageTarget=" + this.imageTarget + ", tvCardUrl=" + this.tvCardUrl + ", header=" + this.header + ", body=" + this.body + ", tts=" + this.tts + ", textTarget=" + this.textTarget + ", urlTarget=" + this.urlTarget + ", landingPage=" + this.landingPage + ", read=" + this.read + ", timestamp=" + this.timestamp + ", showTimestamp=" + this.showTimestamp + ", trackingInfo=" + this.trackingInfo + ", friendProfile=" + this.friendProfile + ", messageString=" + this.messageString + "}";
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        NotificationLandingPage notificationLandingPage;
        UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo;
        FriendProfile friendProfile;
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserNotificationSummary) {
            UserNotificationSummary userNotificationSummary = (UserNotificationSummary) obj;
            String str10 = this.messageName;
            if (str10 != null ? str10.equals(userNotificationSummary.messageName()) : userNotificationSummary.messageName() == null) {
                String str11 = this.messageGuid;
                if (str11 != null ? str11.equals(userNotificationSummary.messageGuid()) : userNotificationSummary.messageGuid() == null) {
                    String str12 = this.eventGuid;
                    if (str12 != null ? str12.equals(userNotificationSummary.eventGuid()) : userNotificationSummary.eventGuid() == null) {
                        String str13 = this.videoId;
                        if (str13 != null ? str13.equals(userNotificationSummary.videoId()) : userNotificationSummary.videoId() == null) {
                            VideoType videoType = this.videoType;
                            if (videoType != null ? videoType.equals(userNotificationSummary.videoType()) : userNotificationSummary.videoType() == null) {
                                String str14 = this.videoTitle;
                                if (str14 != null ? str14.equals(userNotificationSummary.videoTitle()) : userNotificationSummary.videoTitle() == null) {
                                    if (this.inQueue == userNotificationSummary.inQueue() && ((str = this.imageUrl) != null ? str.equals(userNotificationSummary.imageUrl()) : userNotificationSummary.imageUrl() == null) && ((str2 = this.imageAltText) != null ? str2.equals(userNotificationSummary.imageAltText()) : userNotificationSummary.imageAltText() == null) && ((str3 = this.imageTarget) != null ? str3.equals(userNotificationSummary.imageTarget()) : userNotificationSummary.imageTarget() == null) && ((str4 = this.tvCardUrl) != null ? str4.equals(userNotificationSummary.tvCardUrl()) : userNotificationSummary.tvCardUrl() == null) && ((str5 = this.header) != null ? str5.equals(userNotificationSummary.header()) : userNotificationSummary.header() == null) && ((str6 = this.body) != null ? str6.equals(userNotificationSummary.body()) : userNotificationSummary.body() == null) && ((str7 = this.tts) != null ? str7.equals(userNotificationSummary.tts()) : userNotificationSummary.tts() == null) && ((str8 = this.textTarget) != null ? str8.equals(userNotificationSummary.textTarget()) : userNotificationSummary.textTarget() == null) && ((str9 = this.urlTarget) != null ? str9.equals(userNotificationSummary.urlTarget()) : userNotificationSummary.urlTarget() == null) && ((notificationLandingPage = this.landingPage) != null ? notificationLandingPage.equals(userNotificationSummary.landingPage()) : userNotificationSummary.landingPage() == null) && this.read == userNotificationSummary.read() && this.timestamp == userNotificationSummary.timestamp() && this.showTimestamp == userNotificationSummary.showTimestamp() && ((userNotificationLandingTrackingInfo = this.trackingInfo) != null ? userNotificationLandingTrackingInfo.equals(userNotificationSummary.trackingInfo()) : userNotificationSummary.trackingInfo() == null) && ((friendProfile = this.friendProfile) != null ? friendProfile.equals(userNotificationSummary.friendProfile()) : userNotificationSummary.friendProfile() == null)) {
                                        String str15 = this.messageString;
                                        if (str15 == null) {
                                            if (userNotificationSummary.messageString() == null) {
                                                return true;
                                            }
                                        } else if (str15.equals(userNotificationSummary.messageString())) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.messageName;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.messageGuid;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.eventGuid;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.videoId;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        VideoType videoType = this.videoType;
        int hashCode5 = videoType == null ? 0 : videoType.hashCode();
        String str5 = this.videoTitle;
        int hashCode6 = str5 == null ? 0 : str5.hashCode();
        int i = this.inQueue ? 1231 : 1237;
        String str6 = this.imageUrl;
        int hashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.imageAltText;
        int hashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.imageTarget;
        int hashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.tvCardUrl;
        int hashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.header;
        int hashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.body;
        int hashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.tts;
        int hashCode13 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.textTarget;
        int hashCode14 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.urlTarget;
        int hashCode15 = str14 == null ? 0 : str14.hashCode();
        NotificationLandingPage notificationLandingPage = this.landingPage;
        int hashCode16 = notificationLandingPage == null ? 0 : notificationLandingPage.hashCode();
        int i2 = hashCode13;
        int i3 = this.read ? 1231 : 1237;
        long j = this.timestamp;
        int i4 = (int) (j ^ (j >>> 32));
        int i5 = this.showTimestamp ? 1231 : 1237;
        UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo = this.trackingInfo;
        int hashCode17 = userNotificationLandingTrackingInfo == null ? 0 : userNotificationLandingTrackingInfo.hashCode();
        FriendProfile friendProfile = this.friendProfile;
        int hashCode18 = friendProfile == null ? 0 : friendProfile.hashCode();
        String str15 = this.messageString;
        return ((((((((((((((((((((((((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ i) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ hashCode11) * 1000003) ^ hashCode12) * 1000003) ^ i2) * 1000003) ^ hashCode14) * 1000003) ^ hashCode15) * 1000003) ^ hashCode16) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ hashCode17) * 1000003) ^ hashCode18) * 1000003) ^ (str15 == null ? 0 : str15.hashCode());
    }

    @Override // com.netflix.model.leafs.social.UserNotificationSummary
    public UserNotificationSummary.Builder toBuilder() {
        return new Builder(this);
    }

    /* renamed from: com.netflix.model.leafs.social.$$AutoValue_UserNotificationSummary$Builder */
    /* loaded from: classes.dex */
    static final class Builder extends UserNotificationSummary.Builder {
        private String body;
        private String eventGuid;
        private FriendProfile friendProfile;
        private String header;
        private String imageAltText;
        private String imageTarget;
        private String imageUrl;
        private Boolean inQueue;
        private NotificationLandingPage landingPage;
        private String messageGuid;
        private String messageName;
        private String messageString;
        private Boolean read;
        private Boolean showTimestamp;
        private String textTarget;
        private Long timestamp;
        private UserNotificationLandingTrackingInfo trackingInfo;
        private String tts;
        private String tvCardUrl;
        private String urlTarget;
        private String videoId;
        private String videoTitle;
        private VideoType videoType;

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder body(String str) {
            this.body = str;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder eventGuid(String str) {
            this.eventGuid = str;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder friendProfile(FriendProfile friendProfile) {
            this.friendProfile = friendProfile;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder header(String str) {
            this.header = str;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder imageAltText(String str) {
            this.imageAltText = str;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder imageTarget(String str) {
            this.imageTarget = str;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder imageUrl(String str) {
            this.imageUrl = str;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder landingPage(NotificationLandingPage notificationLandingPage) {
            this.landingPage = notificationLandingPage;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder messageGuid(String str) {
            this.messageGuid = str;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder messageName(String str) {
            this.messageName = str;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder messageString(String str) {
            this.messageString = str;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder textTarget(String str) {
            this.textTarget = str;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder trackingInfo(UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo) {
            this.trackingInfo = userNotificationLandingTrackingInfo;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder tts(String str) {
            this.tts = str;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder tvCardUrl(String str) {
            this.tvCardUrl = str;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder urlTarget(String str) {
            this.urlTarget = str;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder videoId(String str) {
            this.videoId = str;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder videoTitle(String str) {
            this.videoTitle = str;
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder videoType(VideoType videoType) {
            this.videoType = videoType;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(UserNotificationSummary userNotificationSummary) {
            this.messageName = userNotificationSummary.messageName();
            this.messageGuid = userNotificationSummary.messageGuid();
            this.eventGuid = userNotificationSummary.eventGuid();
            this.videoId = userNotificationSummary.videoId();
            this.videoType = userNotificationSummary.videoType();
            this.videoTitle = userNotificationSummary.videoTitle();
            this.inQueue = Boolean.valueOf(userNotificationSummary.inQueue());
            this.imageUrl = userNotificationSummary.imageUrl();
            this.imageAltText = userNotificationSummary.imageAltText();
            this.imageTarget = userNotificationSummary.imageTarget();
            this.tvCardUrl = userNotificationSummary.tvCardUrl();
            this.header = userNotificationSummary.header();
            this.body = userNotificationSummary.body();
            this.tts = userNotificationSummary.tts();
            this.textTarget = userNotificationSummary.textTarget();
            this.urlTarget = userNotificationSummary.urlTarget();
            this.landingPage = userNotificationSummary.landingPage();
            this.read = Boolean.valueOf(userNotificationSummary.read());
            this.timestamp = Long.valueOf(userNotificationSummary.timestamp());
            this.showTimestamp = Boolean.valueOf(userNotificationSummary.showTimestamp());
            this.trackingInfo = userNotificationSummary.trackingInfo();
            this.friendProfile = userNotificationSummary.friendProfile();
            this.messageString = userNotificationSummary.messageString();
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder inQueue(boolean z) {
            this.inQueue = Boolean.valueOf(z);
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder read(boolean z) {
            this.read = Boolean.valueOf(z);
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder timestamp(long j) {
            this.timestamp = Long.valueOf(j);
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary.Builder showTimestamp(boolean z) {
            this.showTimestamp = Boolean.valueOf(z);
            return this;
        }

        @Override // com.netflix.model.leafs.social.UserNotificationSummary.Builder
        public UserNotificationSummary build() {
            String str = "";
            if (this.inQueue == null) {
                str = " inQueue";
            }
            if (this.read == null) {
                str = str + " read";
            }
            if (this.timestamp == null) {
                str = str + " timestamp";
            }
            if (this.showTimestamp == null) {
                str = str + " showTimestamp";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_UserNotificationSummary(this.messageName, this.messageGuid, this.eventGuid, this.videoId, this.videoType, this.videoTitle, this.inQueue.booleanValue(), this.imageUrl, this.imageAltText, this.imageTarget, this.tvCardUrl, this.header, this.body, this.tts, this.textTarget, this.urlTarget, this.landingPage, this.read.booleanValue(), this.timestamp.longValue(), this.showTimestamp.booleanValue(), this.trackingInfo, this.friendProfile, this.messageString);
        }
    }
}
