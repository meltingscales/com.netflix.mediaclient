package com.netflix.model.leafs.originals.interactive.animations;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.animations.C$AutoValue_ChoicePointAnimations;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public abstract class ChoicePointAnimations implements Parcelable {
    public abstract Map<String, List<InteractiveAnimation>> hide();

    public abstract Map<String, List<InteractiveAnimation>> hideSelected();

    public abstract Map<String, List<InteractiveAnimation>> show();

    public static TypeAdapter<ChoicePointAnimations> typeAdapter(Gson gson) {
        return new C$AutoValue_ChoicePointAnimations.GsonTypeAdapter(gson);
    }
}
