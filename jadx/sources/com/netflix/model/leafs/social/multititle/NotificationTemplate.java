package com.netflix.model.leafs.social.multititle;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.social.multititle.C$AutoValue_NotificationTemplate;

/* loaded from: classes.dex */
public abstract class NotificationTemplate implements Parcelable {
    public abstract String bodyText();

    public abstract NotificationCtaButton ctaButton();

    public abstract String headlineText();

    @SerializedName("showModulesOnAction")
    public abstract NotificationModuleFilters moduleFiltersForActions();

    @SerializedName("modules")
    public abstract NotificationModuleList modulesList();

    public static TypeAdapter<NotificationTemplate> typeAdapter(Gson gson) {
        return new C$AutoValue_NotificationTemplate.GsonTypeAdapter(gson);
    }
}
