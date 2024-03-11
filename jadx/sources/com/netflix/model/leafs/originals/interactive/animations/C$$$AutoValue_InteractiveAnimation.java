package com.netflix.model.leafs.originals.interactive.animations;

import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.Map;

/* renamed from: com.netflix.model.leafs.originals.interactive.animations.$$$AutoValue_InteractiveAnimation  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$$AutoValue_InteractiveAnimation extends InteractiveAnimation {
    private final long delay;
    private final Float delta;
    private final long duration;
    private final Ease ease;
    private final boolean fromOrigin;
    private final Float fromValue;
    private final Map<String, Float> pivot;
    private final Integer repeatCount;
    private final Integer repeatSequenceCount;
    private final Boolean reverse;
    private final boolean shouldBeRelativeToLastValue;
    private final Float toValue;

    @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation
    public long delay() {
        return this.delay;
    }

    @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation
    public Float delta() {
        return this.delta;
    }

    @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation
    public long duration() {
        return this.duration;
    }

    @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation
    public Ease ease() {
        return this.ease;
    }

    @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation
    public boolean fromOrigin() {
        return this.fromOrigin;
    }

    @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation
    public Float fromValue() {
        return this.fromValue;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation
    public Map<String, Float> pivot() {
        return this.pivot;
    }

    @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation
    public Integer repeatCount() {
        return this.repeatCount;
    }

    @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation
    public Integer repeatSequenceCount() {
        return this.repeatSequenceCount;
    }

    @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation
    public Boolean reverse() {
        return this.reverse;
    }

    @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation
    public boolean shouldBeRelativeToLastValue() {
        return this.shouldBeRelativeToLastValue;
    }

    @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation
    public Float toValue() {
        return this.toValue;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$$AutoValue_InteractiveAnimation(Float f, Float f2, long j, long j2, Float f3, boolean z, Map<String, Float> map, Ease ease, Integer num, Integer num2, Boolean bool, boolean z2) {
        this.fromValue = f;
        this.toValue = f2;
        this.delay = j;
        this.duration = j2;
        this.delta = f3;
        this.fromOrigin = z;
        this.pivot = map;
        this.ease = ease;
        this.repeatSequenceCount = num;
        this.repeatCount = num2;
        this.reverse = bool;
        this.shouldBeRelativeToLastValue = z2;
    }

    public String toString() {
        return "InteractiveAnimation{fromValue=" + this.fromValue + ", toValue=" + this.toValue + ", delay=" + this.delay + ", duration=" + this.duration + ", delta=" + this.delta + ", fromOrigin=" + this.fromOrigin + ", pivot=" + this.pivot + ", ease=" + this.ease + ", repeatSequenceCount=" + this.repeatSequenceCount + ", repeatCount=" + this.repeatCount + ", reverse=" + this.reverse + ", shouldBeRelativeToLastValue=" + this.shouldBeRelativeToLastValue + "}";
    }

    public boolean equals(Object obj) {
        Float f;
        Map<String, Float> map;
        Ease ease;
        Integer num;
        Integer num2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InteractiveAnimation) {
            InteractiveAnimation interactiveAnimation = (InteractiveAnimation) obj;
            Float f2 = this.fromValue;
            if (f2 != null ? f2.equals(interactiveAnimation.fromValue()) : interactiveAnimation.fromValue() == null) {
                Float f3 = this.toValue;
                if (f3 != null ? f3.equals(interactiveAnimation.toValue()) : interactiveAnimation.toValue() == null) {
                    if (this.delay == interactiveAnimation.delay() && this.duration == interactiveAnimation.duration() && ((f = this.delta) != null ? f.equals(interactiveAnimation.delta()) : interactiveAnimation.delta() == null) && this.fromOrigin == interactiveAnimation.fromOrigin() && ((map = this.pivot) != null ? map.equals(interactiveAnimation.pivot()) : interactiveAnimation.pivot() == null) && ((ease = this.ease) != null ? ease.equals(interactiveAnimation.ease()) : interactiveAnimation.ease() == null) && ((num = this.repeatSequenceCount) != null ? num.equals(interactiveAnimation.repeatSequenceCount()) : interactiveAnimation.repeatSequenceCount() == null) && ((num2 = this.repeatCount) != null ? num2.equals(interactiveAnimation.repeatCount()) : interactiveAnimation.repeatCount() == null) && ((bool = this.reverse) != null ? bool.equals(interactiveAnimation.reverse()) : interactiveAnimation.reverse() == null) && this.shouldBeRelativeToLastValue == interactiveAnimation.shouldBeRelativeToLastValue()) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Float f = this.fromValue;
        int hashCode = f == null ? 0 : f.hashCode();
        Float f2 = this.toValue;
        int hashCode2 = f2 == null ? 0 : f2.hashCode();
        long j = this.delay;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.duration;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        Float f3 = this.delta;
        int hashCode3 = f3 == null ? 0 : f3.hashCode();
        int i3 = this.fromOrigin ? 1231 : 1237;
        Map<String, Float> map = this.pivot;
        int hashCode4 = map == null ? 0 : map.hashCode();
        Ease ease = this.ease;
        int hashCode5 = ease == null ? 0 : ease.hashCode();
        Integer num = this.repeatSequenceCount;
        int hashCode6 = num == null ? 0 : num.hashCode();
        Integer num2 = this.repeatCount;
        int hashCode7 = num2 == null ? 0 : num2.hashCode();
        Boolean bool = this.reverse;
        return ((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ hashCode3) * 1000003) ^ i3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ (this.shouldBeRelativeToLastValue ? 1231 : 1237);
    }

    @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation
    public InteractiveAnimation.Builder toBuilder() {
        return new Builder(this);
    }

    /* renamed from: com.netflix.model.leafs.originals.interactive.animations.$$$AutoValue_InteractiveAnimation$Builder */
    /* loaded from: classes.dex */
    static final class Builder extends InteractiveAnimation.Builder {
        private Long delay;
        private Float delta;
        private Long duration;
        private Ease ease;
        private Boolean fromOrigin;
        private Float fromValue;
        private Map<String, Float> pivot;
        private Integer repeatCount;
        private Integer repeatSequenceCount;
        private Boolean reverse;
        private Boolean shouldBeRelativeToLastValue;
        private Float toValue;

        @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.Builder
        public InteractiveAnimation.Builder delta(Float f) {
            this.delta = f;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.Builder
        public InteractiveAnimation.Builder ease(Ease ease) {
            this.ease = ease;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.Builder
        public InteractiveAnimation.Builder fromValue(Float f) {
            this.fromValue = f;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.Builder
        public InteractiveAnimation.Builder pivot(Map<String, Float> map) {
            this.pivot = map;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.Builder
        public InteractiveAnimation.Builder repeatCount(Integer num) {
            this.repeatCount = num;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.Builder
        public InteractiveAnimation.Builder repeatSequenceCount(Integer num) {
            this.repeatSequenceCount = num;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.Builder
        public InteractiveAnimation.Builder reverse(Boolean bool) {
            this.reverse = bool;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.Builder
        public InteractiveAnimation.Builder toValue(Float f) {
            this.toValue = f;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(InteractiveAnimation interactiveAnimation) {
            this.fromValue = interactiveAnimation.fromValue();
            this.toValue = interactiveAnimation.toValue();
            this.delay = Long.valueOf(interactiveAnimation.delay());
            this.duration = Long.valueOf(interactiveAnimation.duration());
            this.delta = interactiveAnimation.delta();
            this.fromOrigin = Boolean.valueOf(interactiveAnimation.fromOrigin());
            this.pivot = interactiveAnimation.pivot();
            this.ease = interactiveAnimation.ease();
            this.repeatSequenceCount = interactiveAnimation.repeatSequenceCount();
            this.repeatCount = interactiveAnimation.repeatCount();
            this.reverse = interactiveAnimation.reverse();
            this.shouldBeRelativeToLastValue = Boolean.valueOf(interactiveAnimation.shouldBeRelativeToLastValue());
        }

        @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.Builder
        public InteractiveAnimation.Builder delay(long j) {
            this.delay = Long.valueOf(j);
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.Builder
        public InteractiveAnimation.Builder duration(long j) {
            this.duration = Long.valueOf(j);
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.Builder
        public InteractiveAnimation.Builder fromOrigin(boolean z) {
            this.fromOrigin = Boolean.valueOf(z);
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.Builder
        public InteractiveAnimation.Builder shouldBeRelativeToLastValue(boolean z) {
            this.shouldBeRelativeToLastValue = Boolean.valueOf(z);
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.Builder
        public InteractiveAnimation build() {
            String str = "";
            if (this.delay == null) {
                str = " delay";
            }
            if (this.duration == null) {
                str = str + " duration";
            }
            if (this.fromOrigin == null) {
                str = str + " fromOrigin";
            }
            if (this.shouldBeRelativeToLastValue == null) {
                str = str + " shouldBeRelativeToLastValue";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_InteractiveAnimation(this.fromValue, this.toValue, this.delay.longValue(), this.duration.longValue(), this.delta, this.fromOrigin.booleanValue(), this.pivot, this.ease, this.repeatSequenceCount, this.repeatCount, this.reverse, this.shouldBeRelativeToLastValue.booleanValue());
        }
    }
}
