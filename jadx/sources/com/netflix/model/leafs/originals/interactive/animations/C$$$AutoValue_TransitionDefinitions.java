package com.netflix.model.leafs.originals.interactive.animations;

import com.netflix.model.leafs.originals.interactive.animations.TransitionDefinitions;
import java.util.List;

/* renamed from: com.netflix.model.leafs.originals.interactive.animations.$$$AutoValue_TransitionDefinitions  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$$AutoValue_TransitionDefinitions extends TransitionDefinitions {
    private final List<TransitionDefinitions.TransitionIds> transitionIds;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.animations.TransitionDefinitions
    public List<TransitionDefinitions.TransitionIds> transitionIds() {
        return this.transitionIds;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$$AutoValue_TransitionDefinitions(List<TransitionDefinitions.TransitionIds> list) {
        if (list == null) {
            throw new NullPointerException("Null transitionIds");
        }
        this.transitionIds = list;
    }

    public String toString() {
        return "TransitionDefinitions{transitionIds=" + this.transitionIds + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TransitionDefinitions) {
            return this.transitionIds.equals(((TransitionDefinitions) obj).transitionIds());
        }
        return false;
    }

    public int hashCode() {
        return this.transitionIds.hashCode() ^ 1000003;
    }
}
