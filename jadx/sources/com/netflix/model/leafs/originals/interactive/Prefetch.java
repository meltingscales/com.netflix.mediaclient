package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Prefetch;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Prefetch implements Parcelable {
    public static final int NANOSECONDS_PER_MILLISECOND = 1000000;
    public static final int NANOSECONDS_PER_SECOND = 1000000000;

    public abstract String intent();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Long ttlSec();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract List<Long> windowMs();

    public boolean isInWindow(long j) {
        List<Long> windowMs = windowMs();
        return windowMs != null && windowMs.size() == 2 && j >= windowMs.get(0).longValue() && j < windowMs.get(1).longValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long windowDurationMs() {
        List<Long> windowMs = windowMs();
        if (windowMs == null || windowMs.size() != 2) {
            return -1L;
        }
        return windowMs.get(1).longValue() - windowMs.get(0).longValue();
    }

    public Long timeToLiveNano() {
        Long ttlSec = ttlSec();
        if (ttlSec == null) {
            return null;
        }
        return Long.valueOf(Math.max(ttlSec.longValue() * 1000000000, windowDurationMs() * 1000000));
    }

    public static TypeAdapter<Prefetch> typeAdapter(Gson gson) {
        return new C$AutoValue_Prefetch.GsonTypeAdapter(gson);
    }
}
