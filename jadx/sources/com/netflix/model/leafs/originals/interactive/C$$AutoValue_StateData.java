package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.condition.Condition;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_StateData  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_StateData extends StateData {
    private final Map<String, Condition> global;
    private final Map<String, Condition> passthrough;
    private final Map<String, Condition> persistent;
    private final Map<String, Condition> session;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.StateData
    public Map<String, Condition> global() {
        return this.global;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.StateData
    public Map<String, Condition> passthrough() {
        return this.passthrough;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.StateData
    public Map<String, Condition> persistent() {
        return this.persistent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.StateData
    public Map<String, Condition> session() {
        return this.session;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_StateData(Map<String, Condition> map, Map<String, Condition> map2, Map<String, Condition> map3, Map<String, Condition> map4) {
        this.persistent = map;
        this.session = map2;
        this.global = map3;
        this.passthrough = map4;
    }

    public String toString() {
        return "StateData{persistent=" + this.persistent + ", session=" + this.session + ", global=" + this.global + ", passthrough=" + this.passthrough + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StateData) {
            StateData stateData = (StateData) obj;
            Map<String, Condition> map = this.persistent;
            if (map != null ? map.equals(stateData.persistent()) : stateData.persistent() == null) {
                Map<String, Condition> map2 = this.session;
                if (map2 != null ? map2.equals(stateData.session()) : stateData.session() == null) {
                    Map<String, Condition> map3 = this.global;
                    if (map3 != null ? map3.equals(stateData.global()) : stateData.global() == null) {
                        Map<String, Condition> map4 = this.passthrough;
                        if (map4 == null) {
                            if (stateData.passthrough() == null) {
                                return true;
                            }
                        } else if (map4.equals(stateData.passthrough())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Map<String, Condition> map = this.persistent;
        int hashCode = map == null ? 0 : map.hashCode();
        Map<String, Condition> map2 = this.session;
        int hashCode2 = map2 == null ? 0 : map2.hashCode();
        Map<String, Condition> map3 = this.global;
        int hashCode3 = map3 == null ? 0 : map3.hashCode();
        Map<String, Condition> map4 = this.passthrough;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (map4 != null ? map4.hashCode() : 0);
    }
}
