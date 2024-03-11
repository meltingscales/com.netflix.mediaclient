package com.netflix.model.leafs.social.multititle;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.social.UserNotificationActionTrackingInfo;
import com.netflix.model.leafs.social.multititle.C$AutoValue_NotificationGridTitleAction;

/* loaded from: classes.dex */
public abstract class NotificationGridTitleAction implements Parcelable {
    public abstract String action();

    public abstract String actionType();

    public abstract String boxshot();

    public abstract String boxshotWebp();

    public abstract String sdp();

    public abstract String sdpWebp();

    public abstract String titleId();

    public abstract UserNotificationActionTrackingInfo trackingInfo();

    public static TypeAdapter<NotificationGridTitleAction> typeAdapter(Gson gson) {
        return new C$AutoValue_NotificationGridTitleAction.GsonTypeAdapter(gson);
    }
}
