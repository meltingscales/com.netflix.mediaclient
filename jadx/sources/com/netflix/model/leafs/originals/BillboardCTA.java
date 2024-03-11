package com.netflix.model.leafs.originals;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.AutoValue_BillboardCTA;

/* loaded from: classes.dex */
public abstract class BillboardCTA {
    public abstract String billboardPhase();

    public abstract String bookmarkPosition();

    public abstract String galleryId();

    public abstract boolean ignoreBookmark();

    public abstract int index();

    public abstract String name();

    public abstract String sequenceNumber();

    public abstract boolean suppressPostPlay();

    public abstract String type();

    public abstract String videoId();

    public static TypeAdapter<BillboardCTA> typeAdapter(Gson gson) {
        return new AutoValue_BillboardCTA.GsonTypeAdapter(gson);
    }
}
