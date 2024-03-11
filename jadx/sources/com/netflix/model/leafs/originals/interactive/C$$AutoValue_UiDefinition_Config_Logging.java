package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.UiDefinition;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_UiDefinition_Config_Logging  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_UiDefinition_Config_Logging extends UiDefinition.Config.Logging {
    private final UiDefinition.Config.Logging.Moment moment;

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Config.Logging
    public UiDefinition.Config.Logging.Moment moment() {
        return this.moment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_UiDefinition_Config_Logging(UiDefinition.Config.Logging.Moment moment) {
        this.moment = moment;
    }

    public String toString() {
        return "Logging{moment=" + this.moment + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UiDefinition.Config.Logging) {
            UiDefinition.Config.Logging.Moment moment = this.moment;
            UiDefinition.Config.Logging.Moment moment2 = ((UiDefinition.Config.Logging) obj).moment();
            return moment == null ? moment2 == null : moment.equals(moment2);
        }
        return false;
    }

    public int hashCode() {
        UiDefinition.Config.Logging.Moment moment = this.moment;
        return (moment == null ? 0 : moment.hashCode()) ^ 1000003;
    }
}
