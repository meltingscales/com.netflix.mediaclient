package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.CommonMetaData;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_CommonMetaData_Settings  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_CommonMetaData_Settings extends CommonMetaData.Settings {
    private final boolean disableToggleDefault;
    private final boolean randomizeDefault;

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Settings
    public boolean disableToggleDefault() {
        return this.disableToggleDefault;
    }

    public int hashCode() {
        return (((this.randomizeDefault ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.disableToggleDefault ? 1231 : 1237);
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Settings
    public boolean randomizeDefault() {
        return this.randomizeDefault;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_CommonMetaData_Settings(boolean z, boolean z2) {
        this.randomizeDefault = z;
        this.disableToggleDefault = z2;
    }

    public String toString() {
        return "Settings{randomizeDefault=" + this.randomizeDefault + ", disableToggleDefault=" + this.disableToggleDefault + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CommonMetaData.Settings) {
            CommonMetaData.Settings settings = (CommonMetaData.Settings) obj;
            return this.randomizeDefault == settings.randomizeDefault() && this.disableToggleDefault == settings.disableToggleDefault();
        }
        return false;
    }
}
