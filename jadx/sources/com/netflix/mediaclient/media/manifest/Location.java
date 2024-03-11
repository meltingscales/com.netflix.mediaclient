package com.netflix.mediaclient.media.manifest;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.media.manifest.AutoValue_Location;
import java.util.List;
import o.C8168dfL;

/* loaded from: classes.dex */
public abstract class Location {
    @SerializedName(SignupConstants.Error.DEBUG_FIELD_KEY)
    public abstract String key();

    @SerializedName("level")
    public abstract int level();

    @SerializedName("rank")
    public abstract int rank();

    @SerializedName("weight")
    public abstract int weight();

    public static TypeAdapter<Location> typeAdapter(Gson gson) {
        return new AutoValue_Location.GsonTypeAdapter(gson);
    }

    public static Location create(int i, int i2, int i3, String str) {
        return new AutoValue_Location(i, i2, i3, str);
    }

    public static Location getLocation(String str, List<Location> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Location location = list.get(0);
        for (Location location2 : list) {
            if (C8168dfL.d(str, location2.key())) {
                return location2;
            }
        }
        return location;
    }
}
