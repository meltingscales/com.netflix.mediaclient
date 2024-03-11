package com.netflix.model.leafs.originals.interactive;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_ChoiceMapOverride  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_ChoiceMapOverride extends ChoiceMapOverride {
    private final Integer defaultIndex;
    private final Map<String, Integer> segmentWeights;

    @Override // com.netflix.model.leafs.originals.interactive.ChoiceMapOverride
    public Integer defaultIndex() {
        return this.defaultIndex;
    }

    @Override // com.netflix.model.leafs.originals.interactive.ChoiceMapOverride
    public Map<String, Integer> segmentWeights() {
        return this.segmentWeights;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_ChoiceMapOverride(Integer num, Map<String, Integer> map) {
        this.defaultIndex = num;
        if (map == null) {
            throw new NullPointerException("Null segmentWeights");
        }
        this.segmentWeights = map;
    }

    public String toString() {
        return "ChoiceMapOverride{defaultIndex=" + this.defaultIndex + ", segmentWeights=" + this.segmentWeights + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ChoiceMapOverride) {
            ChoiceMapOverride choiceMapOverride = (ChoiceMapOverride) obj;
            Integer num = this.defaultIndex;
            if (num != null ? num.equals(choiceMapOverride.defaultIndex()) : choiceMapOverride.defaultIndex() == null) {
                if (this.segmentWeights.equals(choiceMapOverride.segmentWeights())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.defaultIndex;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.segmentWeights.hashCode();
    }
}
