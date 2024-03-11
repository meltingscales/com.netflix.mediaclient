package com.netflix.model.leafs.originals.interactive.animations;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.animations.$$AutoValue_Ease  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_Ease extends Ease {
    private final Map<String, Float> flags;
    private final String type;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.animations.Ease
    public Map<String, Float> flags() {
        return this.flags;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.animations.Ease
    public String type() {
        return this.type;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Ease(String str, Map<String, Float> map) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.type = str;
        this.flags = map;
    }

    public String toString() {
        return "Ease{type=" + this.type + ", flags=" + this.flags + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Ease) {
            Ease ease = (Ease) obj;
            if (this.type.equals(ease.type())) {
                Map<String, Float> map = this.flags;
                if (map == null) {
                    if (ease.flags() == null) {
                        return true;
                    }
                } else if (map.equals(ease.flags())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode();
        Map<String, Float> map = this.flags;
        return ((hashCode ^ 1000003) * 1000003) ^ (map == null ? 0 : map.hashCode());
    }
}
