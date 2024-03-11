package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import com.netflix.model.leafs.originals.interactive.condition.C$AutoValue_Animations;
import com.netflix.model.leafs.originals.interactive.condition.C$AutoValue_Animations_Config;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Animations implements Parcelable {
    public abstract List<List<InteractiveAnimation>> animations();

    public abstract Config config();

    /* loaded from: classes.dex */
    public static abstract class Config implements Parcelable {
        public abstract Integer delayIncrement();

        public static TypeAdapter<Config> typeAdapter(Gson gson) {
            return new C$AutoValue_Animations_Config.GsonTypeAdapter(gson);
        }
    }

    public static TypeAdapter<Animations> typeAdapter(Gson gson) {
        return new C$AutoValue_Animations.GsonTypeAdapter(gson).setDefaultAnimations(Collections.emptyList());
    }
}
