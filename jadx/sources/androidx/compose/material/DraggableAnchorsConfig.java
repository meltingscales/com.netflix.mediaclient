package androidx.compose.material;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DraggableAnchorsConfig<T> {
    private final Map<T, Float> anchors = new LinkedHashMap();

    public final Map<T, Float> getAnchors$material_release() {
        return this.anchors;
    }

    public final void at(T t, float f) {
        this.anchors.put(t, Float.valueOf(f));
    }
}
