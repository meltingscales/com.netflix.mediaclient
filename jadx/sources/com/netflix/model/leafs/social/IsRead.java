package com.netflix.model.leafs.social;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.social.C$$AutoValue_IsRead;
import com.netflix.model.leafs.social.C$AutoValue_IsRead;

/* loaded from: classes.dex */
public abstract class IsRead implements Parcelable {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract IsRead build();

        public abstract Builder read(boolean z);
    }

    @SerializedName("isRead")
    public abstract boolean read();

    public abstract Builder toBuilder();

    public static IsRead create() {
        return new AutoValue_IsRead(false);
    }

    public static TypeAdapter<IsRead> typeAdapter(Gson gson) {
        return new C$AutoValue_IsRead.GsonTypeAdapter(gson).setDefaultRead(false);
    }

    public static Builder builder() {
        return new C$$AutoValue_IsRead.Builder().read(false);
    }
}
