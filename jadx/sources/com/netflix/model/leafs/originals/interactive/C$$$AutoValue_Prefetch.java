package com.netflix.model.leafs.originals.interactive;

import java.util.List;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$$AutoValue_Prefetch  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$$AutoValue_Prefetch extends Prefetch {
    private final String intent;
    private final Long ttlSec;
    private final List<Long> windowMs;

    @Override // com.netflix.model.leafs.originals.interactive.Prefetch
    public String intent() {
        return this.intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Prefetch
    public Long ttlSec() {
        return this.ttlSec;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Prefetch
    public List<Long> windowMs() {
        return this.windowMs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$$AutoValue_Prefetch(String str, Long l, List<Long> list) {
        if (str == null) {
            throw new NullPointerException("Null intent");
        }
        this.intent = str;
        this.ttlSec = l;
        this.windowMs = list;
    }

    public String toString() {
        return "Prefetch{intent=" + this.intent + ", ttlSec=" + this.ttlSec + ", windowMs=" + this.windowMs + "}";
    }

    public boolean equals(Object obj) {
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Prefetch) {
            Prefetch prefetch = (Prefetch) obj;
            if (this.intent.equals(prefetch.intent()) && ((l = this.ttlSec) != null ? l.equals(prefetch.ttlSec()) : prefetch.ttlSec() == null)) {
                List<Long> list = this.windowMs;
                if (list == null) {
                    if (prefetch.windowMs() == null) {
                        return true;
                    }
                } else if (list.equals(prefetch.windowMs())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.intent.hashCode();
        Long l = this.ttlSec;
        int hashCode2 = l == null ? 0 : l.hashCode();
        List<Long> list = this.windowMs;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ (list != null ? list.hashCode() : 0);
    }
}
