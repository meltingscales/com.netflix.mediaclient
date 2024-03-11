package com.netflix.model.leafs.social.multititle;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.social.UserNotificationActionTrackingInfo;
import com.netflix.model.leafs.social.multititle.C$AutoValue_NotificationHeroTitleAction;

/* loaded from: classes.dex */
public abstract class NotificationHeroTitleAction implements Parcelable {
    public abstract String action();

    public abstract String actionType();

    public abstract UserNotificationActionTrackingInfo trackingInfo();

    public abstract VideoType videoType();

    public static TypeAdapter<NotificationHeroTitleAction> typeAdapter(Gson gson) {
        return new C$AutoValue_NotificationHeroTitleAction.GsonTypeAdapter(gson);
    }
}
