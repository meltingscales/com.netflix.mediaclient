package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.UiDefinition;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_UiDefinition_Config_Logging_Moment  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_UiDefinition_Config_Logging_Moment extends UiDefinition.Config.Logging.Moment {
    private final TrackingInfo trackingInfo;

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Config.Logging.Moment
    public TrackingInfo trackingInfo() {
        return this.trackingInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_UiDefinition_Config_Logging_Moment(TrackingInfo trackingInfo) {
        this.trackingInfo = trackingInfo;
    }

    public String toString() {
        return "Moment{trackingInfo=" + this.trackingInfo + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UiDefinition.Config.Logging.Moment) {
            TrackingInfo trackingInfo = this.trackingInfo;
            TrackingInfo trackingInfo2 = ((UiDefinition.Config.Logging.Moment) obj).trackingInfo();
            return trackingInfo == null ? trackingInfo2 == null : trackingInfo.equals(trackingInfo2);
        }
        return false;
    }

    public int hashCode() {
        TrackingInfo trackingInfo = this.trackingInfo;
        return (trackingInfo == null ? 0 : trackingInfo.hashCode()) ^ 1000003;
    }
}
