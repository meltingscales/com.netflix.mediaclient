package com.netflix.model.leafs.originals.interactive;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$$AutoValue_SegmentStateItem  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$$AutoValue_SegmentStateItem extends SegmentStateItem {
    private final StateData data;
    private final String preconditionId;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.SegmentStateItem
    public StateData data() {
        return this.data;
    }

    @Override // com.netflix.model.leafs.originals.interactive.SegmentStateItem
    public String preconditionId() {
        return this.preconditionId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$$AutoValue_SegmentStateItem(StateData stateData, String str) {
        if (stateData == null) {
            throw new NullPointerException("Null data");
        }
        this.data = stateData;
        this.preconditionId = str;
    }

    public String toString() {
        return "SegmentStateItem{data=" + this.data + ", preconditionId=" + this.preconditionId + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SegmentStateItem) {
            SegmentStateItem segmentStateItem = (SegmentStateItem) obj;
            if (this.data.equals(segmentStateItem.data())) {
                String str = this.preconditionId;
                if (str == null) {
                    if (segmentStateItem.preconditionId() == null) {
                        return true;
                    }
                } else if (str.equals(segmentStateItem.preconditionId())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.data.hashCode();
        String str = this.preconditionId;
        return ((hashCode ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }
}
