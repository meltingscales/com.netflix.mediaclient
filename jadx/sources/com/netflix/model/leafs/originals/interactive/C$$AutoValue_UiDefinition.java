package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.UiDefinition;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_UiDefinition  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_UiDefinition extends UiDefinition {
    private final UiDefinition.Config config;
    private final Map<String, UiDefinition.Layout> layouts;
    private final Map<String, Style> styles;

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition
    public UiDefinition.Config config() {
        return this.config;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition
    public Map<String, UiDefinition.Layout> layouts() {
        return this.layouts;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition
    public Map<String, Style> styles() {
        return this.styles;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_UiDefinition(Map<String, UiDefinition.Layout> map, Map<String, Style> map2, UiDefinition.Config config) {
        if (map == null) {
            throw new NullPointerException("Null layouts");
        }
        this.layouts = map;
        if (map2 == null) {
            throw new NullPointerException("Null styles");
        }
        this.styles = map2;
        this.config = config;
    }

    public String toString() {
        return "UiDefinition{layouts=" + this.layouts + ", styles=" + this.styles + ", config=" + this.config + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UiDefinition) {
            UiDefinition uiDefinition = (UiDefinition) obj;
            if (this.layouts.equals(uiDefinition.layouts()) && this.styles.equals(uiDefinition.styles())) {
                UiDefinition.Config config = this.config;
                if (config == null) {
                    if (uiDefinition.config() == null) {
                        return true;
                    }
                } else if (config.equals(uiDefinition.config())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.layouts.hashCode();
        int hashCode2 = this.styles.hashCode();
        UiDefinition.Config config = this.config;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ (config == null ? 0 : config.hashCode());
    }
}
