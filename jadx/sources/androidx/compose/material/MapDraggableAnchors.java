package androidx.compose.material;

import java.util.Iterator;
import java.util.Map;
import o.C8576dqs;
import o.C8632dsu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class MapDraggableAnchors<T> implements DraggableAnchors<T> {
    private final Map<T, Float> anchors;

    public MapDraggableAnchors(Map<T, Float> map) {
        this.anchors = map;
    }

    @Override // androidx.compose.material.DraggableAnchors
    public float positionOf(T t) {
        Float f = this.anchors.get(t);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material.DraggableAnchors
    public boolean hasAnchorFor(T t) {
        return this.anchors.containsKey(t);
    }

    @Override // androidx.compose.material.DraggableAnchors
    public T closestAnchor(float f) {
        T next;
        Iterator<T> it = this.anchors.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float abs2 = Math.abs(f - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // androidx.compose.material.DraggableAnchors
    public T closestAnchor(float f, boolean z) {
        T next;
        Iterator<T> it = this.anchors.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f2 = z ? floatValue - f : f - floatValue;
                if (f2 < 0.0f) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f3 = z ? floatValue2 - f : f - floatValue2;
                    if (f3 < 0.0f) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f2, f3) > 0) {
                        next = next2;
                        f2 = f3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // androidx.compose.material.DraggableAnchors
    public float minAnchor() {
        Float M;
        M = C8576dqs.M(this.anchors.values());
        if (M != null) {
            return M.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material.DraggableAnchors
    public float maxAnchor() {
        Float L;
        L = C8576dqs.L(this.anchors.values());
        if (L != null) {
            return L.floatValue();
        }
        return Float.NaN;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MapDraggableAnchors) {
            return C8632dsu.c(this.anchors, ((MapDraggableAnchors) obj).anchors);
        }
        return false;
    }

    public int hashCode() {
        return this.anchors.hashCode() * 31;
    }

    public String toString() {
        return "MapDraggableAnchors(" + this.anchors + ')';
    }
}
