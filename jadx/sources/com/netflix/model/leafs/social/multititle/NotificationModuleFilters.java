package com.netflix.model.leafs.social.multititle;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.social.multititle.C$AutoValue_NotificationModuleFilters;
import java.util.List;

/* loaded from: classes.dex */
public abstract class NotificationModuleFilters implements Parcelable {
    @SerializedName("ratingInput")
    public abstract List<String> ratingInputActionFilteredModules();

    @SerializedName("thumbsDown")
    public abstract List<String> thumbsDownActionFilteredModules();

    @SerializedName("thumbsUp")
    public abstract List<String> thumbsUpActionFilteredModules();

    @SerializedName("thumbsUpDouble")
    public abstract List<String> thumbsUpDoubleActionFilteredModules();

    public static TypeAdapter<NotificationModuleFilters> typeAdapter(Gson gson) {
        return new C$AutoValue_NotificationModuleFilters.GsonTypeAdapter(gson);
    }
}
