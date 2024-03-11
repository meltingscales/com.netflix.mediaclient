package com.netflix.model.leafs.originals.interactive.animations;

import com.netflix.model.leafs.originals.interactive.animations.TransitionDefinitions;

/* renamed from: com.netflix.model.leafs.originals.interactive.animations.$$AutoValue_TransitionDefinitions_TransitionIds  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_TransitionDefinitions_TransitionIds extends TransitionDefinitions.TransitionIds {
    private final String transitionId;

    @Override // com.netflix.model.leafs.originals.interactive.animations.TransitionDefinitions.TransitionIds
    public String transitionId() {
        return this.transitionId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_TransitionDefinitions_TransitionIds(String str) {
        if (str == null) {
            throw new NullPointerException("Null transitionId");
        }
        this.transitionId = str;
    }

    public String toString() {
        return "TransitionIds{transitionId=" + this.transitionId + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TransitionDefinitions.TransitionIds) {
            return this.transitionId.equals(((TransitionDefinitions.TransitionIds) obj).transitionId());
        }
        return false;
    }

    public int hashCode() {
        return this.transitionId.hashCode() ^ 1000003;
    }
}
