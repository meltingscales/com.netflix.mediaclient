package com.netflix.model.leafs.social.multititle;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.social.multititle.C$AutoValue_NotificationLandingPage;
import org.chromium.net.NetError;

/* loaded from: classes.dex */
public abstract class NotificationLandingPage implements Parcelable {
    public abstract String payloadVersion();

    public abstract NotificationTemplate template();

    public abstract String templateId();

    public abstract String templateType();

    public abstract int trackId();

    public static TypeAdapter<NotificationLandingPage> typeAdapter(Gson gson) {
        return new C$AutoValue_NotificationLandingPage.GsonTypeAdapter(gson).setDefaultTrackId(NetError.ERR_SSL_PINNED_KEY_NOT_IN_CERT_CHAIN);
    }
}
