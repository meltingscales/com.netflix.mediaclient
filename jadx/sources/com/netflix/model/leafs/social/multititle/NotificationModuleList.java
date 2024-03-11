package com.netflix.model.leafs.social.multititle;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.social.multititle.C$$AutoValue_NotificationModuleList;
import com.netflix.model.leafs.social.multititle.C$AutoValue_NotificationModuleList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class NotificationModuleList implements Parcelable {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract NotificationModuleList build();

        public abstract Builder modules(List<NotificationModule> list);
    }

    public abstract List<NotificationModule> modules();

    public static TypeAdapter<NotificationModuleList> typeAdapter(Gson gson) {
        return new C$AutoValue_NotificationModuleList.GsonTypeAdapter(gson);
    }

    public static Builder builder() {
        return new C$$AutoValue_NotificationModuleList.Builder();
    }
}
