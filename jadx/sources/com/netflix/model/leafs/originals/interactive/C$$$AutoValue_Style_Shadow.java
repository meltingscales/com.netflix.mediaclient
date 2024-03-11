package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.Style;
import java.util.Map;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$$AutoValue_Style_Shadow  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$$AutoValue_Style_Shadow extends Style.Shadow {
    private final Color color;
    private final Map<String, Float> offset;
    private final Float radius;

    @Override // com.netflix.model.leafs.originals.interactive.Style.Shadow
    public Color color() {
        return this.color;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Style.Shadow
    public Map<String, Float> offset() {
        return this.offset;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Style.Shadow
    public Float radius() {
        return this.radius;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$$AutoValue_Style_Shadow(Color color, Float f, Map<String, Float> map) {
        this.color = color;
        if (f == null) {
            throw new NullPointerException("Null radius");
        }
        this.radius = f;
        this.offset = map;
    }

    public String toString() {
        return "Shadow{color=" + this.color + ", radius=" + this.radius + ", offset=" + this.offset + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Style.Shadow) {
            Style.Shadow shadow = (Style.Shadow) obj;
            Color color = this.color;
            if (color != null ? color.equals(shadow.color()) : shadow.color() == null) {
                if (this.radius.equals(shadow.radius())) {
                    Map<String, Float> map = this.offset;
                    if (map == null) {
                        if (shadow.offset() == null) {
                            return true;
                        }
                    } else if (map.equals(shadow.offset())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Color color = this.color;
        int hashCode = color == null ? 0 : color.hashCode();
        int hashCode2 = this.radius.hashCode();
        Map<String, Float> map = this.offset;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ (map != null ? map.hashCode() : 0);
    }
}
