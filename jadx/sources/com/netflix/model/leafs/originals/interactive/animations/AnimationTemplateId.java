package com.netflix.model.leafs.originals.interactive.animations;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.animations.C$AutoValue_AnimationTemplateId;

/* loaded from: classes.dex */
public abstract class AnimationTemplateId implements Parcelable {
    public abstract String animationTemplateId();

    public static TypeAdapter<AnimationTemplateId> typeAdapter(Gson gson) {
        return new C$AutoValue_AnimationTemplateId.GsonTypeAdapter(gson);
    }
}
