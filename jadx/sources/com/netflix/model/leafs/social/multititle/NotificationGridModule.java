package com.netflix.model.leafs.social.multititle;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.social.multititle.C$$AutoValue_NotificationGridModule;
import com.netflix.model.leafs.social.multititle.C$AutoValue_NotificationGridModule;
import java.util.List;

/* loaded from: classes.dex */
public abstract class NotificationGridModule implements NotificationModule {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract Builder actions(List<NotificationGridTitleAction> list);

        public abstract NotificationGridModule build();

        public abstract Builder columnWidth(int i);

        public abstract Builder headlineText(String str);

        public abstract Builder layout(String str);
    }

    public abstract List<NotificationGridTitleAction> actions();

    public abstract int columnWidth();

    public abstract String headlineText();

    public abstract String layout();

    public abstract Builder toBuilder();

    public static TypeAdapter<NotificationGridModule> typeAdapter(Gson gson) {
        return new C$AutoValue_NotificationGridModule.GsonTypeAdapter(gson);
    }

    public static Builder builder() {
        return new C$$AutoValue_NotificationGridModule.Builder();
    }
}
