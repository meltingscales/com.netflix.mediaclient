package com.netflix.model.leafs.social.multititle;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.social.multititle.C$$AutoValue_NotificationRatingInfoModule;
import com.netflix.model.leafs.social.multititle.C$AutoValue_NotificationRatingInfoModule;
import java.util.List;

/* loaded from: classes.dex */
public abstract class NotificationRatingInfoModule implements NotificationModule {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract Builder actions(List<NotificationRatingAction> list);

        public abstract Builder bodyCopy(String str);

        public abstract Builder bodyCopyConfirmationThumbsDown(String str);

        public abstract Builder bodyCopyConfirmationThumbsUp(String str);

        public abstract Builder bodyCopyConfirmationThumbsUpDouble(String str);

        public abstract Builder boxshot(String str);

        public abstract Builder boxshotWebp(String str);

        public abstract NotificationRatingInfoModule build();

        public abstract Builder layout(String str);

        public abstract Builder titleId(int i);

        public abstract Builder videoType(VideoType videoType);
    }

    public abstract List<NotificationRatingAction> actions();

    public abstract String bodyCopy();

    public abstract String bodyCopyConfirmationThumbsDown();

    public abstract String bodyCopyConfirmationThumbsUp();

    public abstract String bodyCopyConfirmationThumbsUpDouble();

    public abstract String boxshot();

    public abstract String boxshotWebp();

    public abstract String layout();

    public abstract int titleId();

    public abstract Builder toBuilder();

    public abstract VideoType videoType();

    public static TypeAdapter<NotificationRatingInfoModule> typeAdapter(Gson gson) {
        return new C$AutoValue_NotificationRatingInfoModule.GsonTypeAdapter(gson);
    }

    public static Builder builder() {
        return new C$$AutoValue_NotificationRatingInfoModule.Builder();
    }
}
