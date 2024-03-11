package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_ChoiceMapOverride;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ChoiceMapOverride implements Parcelable {
    public abstract Integer defaultIndex();

    public abstract Map<String, Integer> segmentWeights();

    public static TypeAdapter<ChoiceMapOverride> typeAdapter(Gson gson) {
        return new C$AutoValue_ChoiceMapOverride.GsonTypeAdapter(gson).setDefaultSegmentWeights(Collections.EMPTY_MAP);
    }
}
