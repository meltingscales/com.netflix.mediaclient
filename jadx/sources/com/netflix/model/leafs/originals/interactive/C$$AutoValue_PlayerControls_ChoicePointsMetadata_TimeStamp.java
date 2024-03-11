package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.PlayerControls;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp extends PlayerControls.ChoicePointsMetadata.TimeStamp {
    private final String description;
    private final String segmentId;
    private final Integer startTimeMs;

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.TimeStamp
    public String description() {
        return this.description;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.TimeStamp
    public String segmentId() {
        return this.segmentId;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.TimeStamp
    public Integer startTimeMs() {
        return this.startTimeMs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp(String str, Integer num, String str2) {
        this.description = str;
        this.startTimeMs = num;
        this.segmentId = str2;
    }

    public String toString() {
        return "TimeStamp{description=" + this.description + ", startTimeMs=" + this.startTimeMs + ", segmentId=" + this.segmentId + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerControls.ChoicePointsMetadata.TimeStamp) {
            PlayerControls.ChoicePointsMetadata.TimeStamp timeStamp = (PlayerControls.ChoicePointsMetadata.TimeStamp) obj;
            String str = this.description;
            if (str != null ? str.equals(timeStamp.description()) : timeStamp.description() == null) {
                Integer num = this.startTimeMs;
                if (num != null ? num.equals(timeStamp.startTimeMs()) : timeStamp.startTimeMs() == null) {
                    String str2 = this.segmentId;
                    if (str2 == null) {
                        if (timeStamp.segmentId() == null) {
                            return true;
                        }
                    } else if (str2.equals(timeStamp.segmentId())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.description;
        int hashCode = str == null ? 0 : str.hashCode();
        Integer num = this.startTimeMs;
        int hashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.segmentId;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }
}
