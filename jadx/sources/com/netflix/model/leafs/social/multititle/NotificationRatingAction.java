package com.netflix.model.leafs.social.multititle;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.social.UserNotificationActionTrackingInfo;
import com.netflix.model.leafs.social.multititle.C$$AutoValue_NotificationRatingAction;
import com.netflix.model.leafs.social.multititle.C$AutoValue_NotificationRatingAction;

/* loaded from: classes.dex */
public abstract class NotificationRatingAction implements Parcelable {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract Builder action(String str);

        public abstract Builder actionType(String str);

        public abstract NotificationRatingAction build();

        public abstract Builder trackingInfo(UserNotificationActionTrackingInfo userNotificationActionTrackingInfo);

        public abstract Builder videoType(VideoType videoType);
    }

    public abstract String action();

    public abstract String actionType();

    public abstract UserNotificationActionTrackingInfo trackingInfo();

    public abstract VideoType videoType();

    public static TypeAdapter<NotificationRatingAction> typeAdapter(Gson gson) {
        return new C$AutoValue_NotificationRatingAction.GsonTypeAdapter(gson);
    }

    public static Builder builder() {
        return new C$$AutoValue_NotificationRatingAction.Builder();
    }
}
