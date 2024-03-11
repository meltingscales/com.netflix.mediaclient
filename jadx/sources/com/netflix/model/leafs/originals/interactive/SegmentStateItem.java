package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_SegmentStateItem;

/* loaded from: classes.dex */
public abstract class SegmentStateItem implements Parcelable {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract StateData data();

    public abstract String preconditionId();

    public ImpressionData impressionData() {
        return new AutoValue_ImpressionData(null, data());
    }

    public static TypeAdapter<SegmentStateItem> typeAdapter(Gson gson) {
        return new C$AutoValue_SegmentStateItem.GsonTypeAdapter(gson);
    }
}
