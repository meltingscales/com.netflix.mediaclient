package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_InteractiveDebugMenuItem;

/* loaded from: classes.dex */
public abstract class InteractiveDebugMenuItem implements Parcelable {
    public abstract String id();

    public abstract String label();

    public abstract String segmentId();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Double startTime();

    public long startTimeMs() {
        Double startTime = startTime();
        if (startTime == null) {
            return 0L;
        }
        return (long) (startTime.doubleValue() * 1000.0d);
    }

    public static TypeAdapter<InteractiveDebugMenuItem> typeAdapter(Gson gson) {
        return new C$AutoValue_InteractiveDebugMenuItem.GsonTypeAdapter(gson);
    }
}
