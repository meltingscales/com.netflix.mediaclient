package com.netflix.model.leafs.social;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.mediaclient.servicemgr.interface_.NotificationTypes;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.social.C$$AutoValue_UserNotificationSummary;
import com.netflix.model.leafs.social.C$AutoValue_UserNotificationSummary;
import com.netflix.model.leafs.social.multititle.NotificationLandingPage;
import o.AbstractC0941Im;
import o.C8168dfL;
import o.InterfaceC8319diD;

/* loaded from: classes.dex */
public abstract class UserNotificationSummary extends AbstractC0941Im implements InterfaceC8319diD, NotificationSummaryItem {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract Builder body(String str);

        public abstract UserNotificationSummary build();

        public abstract Builder eventGuid(String str);

        public abstract Builder friendProfile(FriendProfile friendProfile);

        public abstract Builder header(String str);

        public abstract Builder imageAltText(String str);

        public abstract Builder imageTarget(String str);

        public abstract Builder imageUrl(String str);

        public abstract Builder inQueue(boolean z);

        public abstract Builder landingPage(NotificationLandingPage notificationLandingPage);

        public abstract Builder messageGuid(String str);

        public abstract Builder messageName(String str);

        public abstract Builder messageString(String str);

        public abstract Builder read(boolean z);

        public abstract Builder showTimestamp(boolean z);

        public abstract Builder textTarget(String str);

        public abstract Builder timestamp(long j);

        public abstract Builder trackingInfo(UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo);

        public abstract Builder tts(String str);

        public abstract Builder tvCardUrl(String str);

        public abstract Builder urlTarget(String str);

        public abstract Builder videoId(String str);

        public abstract Builder videoTitle(String str);

        public abstract Builder videoType(VideoType videoType);
    }

    public abstract String body();

    public abstract String eventGuid();

    @SerializedName("fromUser")
    public abstract FriendProfile friendProfile();

    public abstract String header();

    public abstract String imageAltText();

    public abstract String imageTarget();

    public abstract String imageUrl();

    public abstract boolean inQueue();

    public abstract NotificationLandingPage landingPage();

    public abstract String messageGuid();

    public abstract String messageName();

    @SerializedName("msgString")
    public abstract String messageString();

    @SerializedName("isRead")
    public abstract boolean read();

    public abstract boolean showTimestamp();

    public abstract String textTarget();

    public abstract long timestamp();

    public abstract Builder toBuilder();

    public abstract UserNotificationLandingTrackingInfo trackingInfo();

    public abstract String tts();

    public abstract String tvCardUrl();

    public abstract String urlTarget();

    public abstract String videoId();

    public abstract String videoTitle();

    public abstract VideoType videoType();

    @Override // o.InterfaceC5154btR
    public NotificationTypes getNotificationType() {
        if (landingPage() != null) {
            return NotificationTypes.MULTI_TITLE_ALERT;
        }
        return NotificationTypes.NEW_SEASON_ALERT;
    }

    @Override // o.InterfaceC5154btR
    public final boolean isValid() {
        return C8168dfL.h(eventGuid()) && C8168dfL.h(messageGuid());
    }

    public static UserNotificationSummary create() {
        return new AutoValue_UserNotificationSummary(null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, -1L, false, null, null, null);
    }

    public static TypeAdapter<UserNotificationSummary> typeAdapter(Gson gson) {
        return new C$AutoValue_UserNotificationSummary.GsonTypeAdapter(gson).setDefaultTimestamp(-1L).setDefaultShowTimestamp(false).setDefaultRead(false).setDefaultInQueue(false);
    }

    public static Builder builder() {
        return new C$$AutoValue_UserNotificationSummary.Builder().timestamp(-1L).showTimestamp(false).read(false).inQueue(false);
    }

    @Override // o.InterfaceC5154btR
    public NotificationSummaryItem makeCopy(boolean z) {
        return toBuilder().read(z).build();
    }
}
