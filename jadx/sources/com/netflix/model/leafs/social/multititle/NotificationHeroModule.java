package com.netflix.model.leafs.social.multititle;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.social.multititle.C$$AutoValue_NotificationHeroModule;
import com.netflix.model.leafs.social.multititle.C$AutoValue_NotificationHeroModule;
import java.util.List;

/* loaded from: classes.dex */
public abstract class NotificationHeroModule implements NotificationModule {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract Builder actions(List<NotificationHeroTitleAction> list);

        public abstract Builder bodyCopy(String str);

        public abstract NotificationHeroModule build();

        public abstract Builder heroImage(String str);

        public abstract Builder heroImageWebp(String str);

        public abstract Builder layout(String str);

        public abstract Builder titleId(int i);

        public abstract Builder videoType(VideoType videoType);
    }

    public abstract List<NotificationHeroTitleAction> actions();

    public abstract String bodyCopy();

    public abstract String heroImage();

    public abstract String heroImageWebp();

    public abstract String layout();

    public abstract int titleId();

    public abstract Builder toBuilder();

    public abstract VideoType videoType();

    public static TypeAdapter<NotificationHeroModule> typeAdapter(Gson gson) {
        return new C$AutoValue_NotificationHeroModule.GsonTypeAdapter(gson);
    }

    public static Builder builder() {
        return new C$$AutoValue_NotificationHeroModule.Builder();
    }
}
