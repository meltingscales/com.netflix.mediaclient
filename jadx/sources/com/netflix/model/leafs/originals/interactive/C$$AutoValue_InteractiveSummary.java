package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_InteractiveSummary  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_InteractiveSummary extends InteractiveSummary {
    private final InteractiveSummary.Features features;
    private final Map<String, String> nextSegmentRedirects;

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary
    public InteractiveSummary.Features features() {
        return this.features;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary
    public Map<String, String> nextSegmentRedirects() {
        return this.nextSegmentRedirects;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_InteractiveSummary(InteractiveSummary.Features features, Map<String, String> map) {
        if (features == null) {
            throw new NullPointerException("Null features");
        }
        this.features = features;
        this.nextSegmentRedirects = map;
    }

    public String toString() {
        return "InteractiveSummary{features=" + this.features + ", nextSegmentRedirects=" + this.nextSegmentRedirects + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InteractiveSummary) {
            InteractiveSummary interactiveSummary = (InteractiveSummary) obj;
            if (this.features.equals(interactiveSummary.features())) {
                Map<String, String> map = this.nextSegmentRedirects;
                if (map == null) {
                    if (interactiveSummary.nextSegmentRedirects() == null) {
                        return true;
                    }
                } else if (map.equals(interactiveSummary.nextSegmentRedirects())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.features.hashCode();
        Map<String, String> map = this.nextSegmentRedirects;
        return ((hashCode ^ 1000003) * 1000003) ^ (map == null ? 0 : map.hashCode());
    }
}
