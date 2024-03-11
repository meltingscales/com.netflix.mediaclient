package com.netflix.model.leafs.originals.interactive;

import com.google.gson.annotations.SerializedName;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_Action  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_Action extends Action {
    private final Float bookmarkPositionMs;
    private final String newSegmentId;
    private final Integer newTimeMs;
    private final String segmentId;
    private final Integer startTimeMs;
    private final String type;

    @Override // com.netflix.model.leafs.originals.interactive.Action
    @SerializedName("bookmarkPosition")
    public Float bookmarkPositionMs() {
        return this.bookmarkPositionMs;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Action
    @Deprecated
    public String newSegmentId() {
        return this.newSegmentId;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Action
    @Deprecated
    public Integer newTimeMs() {
        return this.newTimeMs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Action
    public String segmentId() {
        return this.segmentId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Action
    public Integer startTimeMs() {
        return this.startTimeMs;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Action
    public String type() {
        return this.type;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Action(String str, Integer num, String str2, Integer num2, Float f, String str3) {
        this.type = str;
        this.startTimeMs = num;
        this.segmentId = str2;
        this.newTimeMs = num2;
        this.bookmarkPositionMs = f;
        this.newSegmentId = str3;
    }

    public String toString() {
        return "Action{type=" + this.type + ", startTimeMs=" + this.startTimeMs + ", segmentId=" + this.segmentId + ", newTimeMs=" + this.newTimeMs + ", bookmarkPositionMs=" + this.bookmarkPositionMs + ", newSegmentId=" + this.newSegmentId + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Action) {
            Action action = (Action) obj;
            String str = this.type;
            if (str != null ? str.equals(action.type()) : action.type() == null) {
                Integer num = this.startTimeMs;
                if (num != null ? num.equals(action.startTimeMs()) : action.startTimeMs() == null) {
                    String str2 = this.segmentId;
                    if (str2 != null ? str2.equals(action.segmentId()) : action.segmentId() == null) {
                        Integer num2 = this.newTimeMs;
                        if (num2 != null ? num2.equals(action.newTimeMs()) : action.newTimeMs() == null) {
                            Float f = this.bookmarkPositionMs;
                            if (f != null ? f.equals(action.bookmarkPositionMs()) : action.bookmarkPositionMs() == null) {
                                String str3 = this.newSegmentId;
                                if (str3 == null) {
                                    if (action.newSegmentId() == null) {
                                        return true;
                                    }
                                } else if (str3.equals(action.newSegmentId())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = str == null ? 0 : str.hashCode();
        Integer num = this.startTimeMs;
        int hashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.segmentId;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.newTimeMs;
        int hashCode4 = num2 == null ? 0 : num2.hashCode();
        Float f = this.bookmarkPositionMs;
        int hashCode5 = f == null ? 0 : f.hashCode();
        String str3 = this.newSegmentId;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ (str3 != null ? str3.hashCode() : 0);
    }
}
