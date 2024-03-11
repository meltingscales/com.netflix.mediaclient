package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_SpriteImage;

/* loaded from: classes.dex */
public abstract class SpriteImage implements Parcelable {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract ImageAssetId image();

    public abstract SourceRect rect();

    public String assetId() {
        ImageAssetId image = image();
        if (image == null) {
            return null;
        }
        return image.assetId();
    }

    public static TypeAdapter<SpriteImage> typeAdapter(Gson gson) {
        return new C$AutoValue_SpriteImage.GsonTypeAdapter(gson).setDefaultRect(new AutoValue_SourceRect(0, 0, 0, 0));
    }
}
