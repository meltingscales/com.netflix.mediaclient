package com.netflix.model.leafs.social;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.social.C$AutoValue_FriendProfile;
import o.C8168dfL;

/* loaded from: classes.dex */
public abstract class FriendProfile implements Parcelable {
    public abstract String bigImageUrl();

    public abstract String firstName();

    public abstract String id();

    public abstract String imageUrl();

    public abstract String lastName();

    public static TypeAdapter<FriendProfile> typeAdapter(Gson gson) {
        return new C$AutoValue_FriendProfile.GsonTypeAdapter(gson);
    }

    public String getFullName() {
        if (C8168dfL.h(firstName()) || C8168dfL.h(lastName())) {
            StringBuilder sb = new StringBuilder();
            if (C8168dfL.h(firstName())) {
                sb.append(firstName());
                sb.append(" ");
            }
            if (C8168dfL.h(lastName())) {
                sb.append(lastName());
            }
            return sb.toString().trim();
        }
        return null;
    }
}
