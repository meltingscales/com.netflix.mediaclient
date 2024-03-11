package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.UiDefinition;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_UiDefinition_Config  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_UiDefinition_Config extends UiDefinition.Config {
    private final UiDefinition.Config.Logging logging;
    private final boolean randomizeDefault;

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Config
    public UiDefinition.Config.Logging logging() {
        return this.logging;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Config
    public boolean randomizeDefault() {
        return this.randomizeDefault;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_UiDefinition_Config(boolean z, UiDefinition.Config.Logging logging) {
        this.randomizeDefault = z;
        this.logging = logging;
    }

    public String toString() {
        return "Config{randomizeDefault=" + this.randomizeDefault + ", logging=" + this.logging + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UiDefinition.Config) {
            UiDefinition.Config config = (UiDefinition.Config) obj;
            if (this.randomizeDefault == config.randomizeDefault()) {
                UiDefinition.Config.Logging logging = this.logging;
                if (logging == null) {
                    if (config.logging() == null) {
                        return true;
                    }
                } else if (logging.equals(config.logging())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = this.randomizeDefault ? 1231 : 1237;
        UiDefinition.Config.Logging logging = this.logging;
        return ((i ^ 1000003) * 1000003) ^ (logging == null ? 0 : logging.hashCode());
    }
}
