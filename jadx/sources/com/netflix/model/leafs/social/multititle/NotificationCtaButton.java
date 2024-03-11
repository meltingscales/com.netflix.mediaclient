package com.netflix.model.leafs.social.multititle;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.social.UserNotificationCtaButtonTrackingInfo;
import com.netflix.model.leafs.social.multititle.C$AutoValue_NotificationCtaButton;

/* loaded from: classes.dex */
public abstract class NotificationCtaButton implements Parcelable {
    public abstract String action();

    public abstract String buttonText();

    public abstract UserNotificationCtaButtonTrackingInfo trackingInfo();

    public static TypeAdapter<NotificationCtaButton> typeAdapter(Gson gson) {
        return new C$AutoValue_NotificationCtaButton.GsonTypeAdapter(gson);
    }
}
