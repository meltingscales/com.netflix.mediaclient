package com.netflix.model.leafs.originals.interactive.condition;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.condition.$$AutoValue_StateHistory  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_StateHistory extends StateHistory {
    private final State global;
    private final State persistent;

    @Override // com.netflix.model.leafs.originals.interactive.condition.StateHistory
    public State global() {
        return this.global;
    }

    @Override // com.netflix.model.leafs.originals.interactive.condition.StateHistory
    public State persistent() {
        return this.persistent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_StateHistory(State state, State state2) {
        if (state == null) {
            throw new NullPointerException("Null persistent");
        }
        this.persistent = state;
        if (state2 == null) {
            throw new NullPointerException("Null global");
        }
        this.global = state2;
    }

    public String toString() {
        return "StateHistory{persistent=" + this.persistent + ", global=" + this.global + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StateHistory) {
            StateHistory stateHistory = (StateHistory) obj;
            return this.persistent.equals(stateHistory.persistent()) && this.global.equals(stateHistory.global());
        }
        return false;
    }

    public int hashCode() {
        return ((this.persistent.hashCode() ^ 1000003) * 1000003) ^ this.global.hashCode();
    }
}
