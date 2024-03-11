package com.netflix.model.leafs.originals.interactive.condition;

import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import com.netflix.model.leafs.originals.interactive.condition.Animations;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.condition.$$AutoValue_Animations  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_Animations extends Animations {
    private final List<List<InteractiveAnimation>> animations;
    private final Animations.Config config;

    @Override // com.netflix.model.leafs.originals.interactive.condition.Animations
    public List<List<InteractiveAnimation>> animations() {
        return this.animations;
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.Animations
    public Animations.Config config() {
        return this.config;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Animations(Animations.Config config, List<List<InteractiveAnimation>> list) {
        this.config = config;
        if (list == null) {
            throw new NullPointerException("Null animations");
        }
        this.animations = list;
    }

    public String toString() {
        return "Animations{config=" + this.config + ", animations=" + this.animations + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Animations) {
            Animations animations = (Animations) obj;
            Animations.Config config = this.config;
            if (config != null ? config.equals(animations.config()) : animations.config() == null) {
                if (this.animations.equals(animations.animations())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Animations.Config config = this.config;
        return (((config == null ? 0 : config.hashCode()) ^ 1000003) * 1000003) ^ this.animations.hashCode();
    }
}
