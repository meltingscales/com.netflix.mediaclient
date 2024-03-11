package com.netflix.model.leafs.originals.interactive.condition;

import com.netflix.model.leafs.originals.interactive.condition.Animations;

/* renamed from: com.netflix.model.leafs.originals.interactive.condition.$$AutoValue_Animations_Config  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_Animations_Config extends Animations.Config {
    private final Integer delayIncrement;

    @Override // com.netflix.model.leafs.originals.interactive.condition.Animations.Config
    public Integer delayIncrement() {
        return this.delayIncrement;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Animations_Config(Integer num) {
        this.delayIncrement = num;
    }

    public String toString() {
        return "Config{delayIncrement=" + this.delayIncrement + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Animations.Config) {
            Integer num = this.delayIncrement;
            Integer delayIncrement = ((Animations.Config) obj).delayIncrement();
            return num == null ? delayIncrement == null : num.equals(delayIncrement);
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.delayIncrement;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }
}
