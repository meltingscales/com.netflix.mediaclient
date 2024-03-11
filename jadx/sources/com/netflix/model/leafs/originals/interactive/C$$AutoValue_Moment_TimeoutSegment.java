package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.Moment;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_Moment_TimeoutSegment  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_Moment_TimeoutSegment extends Moment.TimeoutSegment {
    private final String segmentId;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Moment.TimeoutSegment
    public String segmentId() {
        return this.segmentId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Moment_TimeoutSegment(String str) {
        this.segmentId = str;
    }

    public String toString() {
        return "TimeoutSegment{segmentId=" + this.segmentId + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Moment.TimeoutSegment) {
            String str = this.segmentId;
            String segmentId = ((Moment.TimeoutSegment) obj).segmentId();
            return str == null ? segmentId == null : str.equals(segmentId);
        }
        return false;
    }

    public int hashCode() {
        String str = this.segmentId;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }
}
