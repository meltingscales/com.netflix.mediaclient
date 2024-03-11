package com.netflix.model.leafs.originals.interactive.animations;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.animations.C$AutoValue_TransitionDefinitions;
import com.netflix.model.leafs.originals.interactive.animations.C$AutoValue_TransitionDefinitions_TransitionIds;
import java.util.List;

/* loaded from: classes.dex */
public abstract class TransitionDefinitions implements Parcelable {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract List<TransitionIds> transitionIds();

    public String transitionId() {
        return transitionIds().get(0).transitionId();
    }

    /* loaded from: classes.dex */
    public static abstract class TransitionIds implements Parcelable {
        public abstract String transitionId();

        public static TypeAdapter<TransitionIds> typeAdapter(Gson gson) {
            return new C$AutoValue_TransitionDefinitions_TransitionIds.GsonTypeAdapter(gson);
        }
    }

    public static TypeAdapter<TransitionDefinitions> typeAdapter(Gson gson) {
        return new C$AutoValue_TransitionDefinitions.GsonTypeAdapter(gson);
    }
}
