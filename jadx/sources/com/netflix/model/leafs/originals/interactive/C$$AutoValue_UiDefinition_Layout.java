package com.netflix.model.leafs.originals.interactive;

import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.UiDefinition;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import com.netflix.model.leafs.originals.interactive.animations.TransitionDefinitions;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_UiDefinition_Layout  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_UiDefinition_Layout extends UiDefinition.Layout {
    private final AssetManifest assetManifest;
    private final Map<String, UiDefinition.AudioListAsset> audio;
    private final UiDefinition.Layout.Config config;
    private final Map<String, Map<String, List<InteractiveAnimation>>> elementAnimations;
    private final UiDefinition.Layout.Elements elements;
    private final StringsObject interactiveStrings;
    private final Map<String, TransitionDefinitions> visualStateTransitionDefinitions;

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout, com.netflix.model.leafs.originals.interactive.BaseLayout
    public AssetManifest assetManifest() {
        return this.assetManifest;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout
    public Map<String, UiDefinition.AudioListAsset> audio() {
        return this.audio;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout
    public UiDefinition.Layout.Config config() {
        return this.config;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout
    public Map<String, Map<String, List<InteractiveAnimation>>> elementAnimations() {
        return this.elementAnimations;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout
    public UiDefinition.Layout.Elements elements() {
        return this.elements;
    }

    @Override // com.netflix.model.leafs.originals.interactive.BaseLayout
    @SerializedName("strings")
    public StringsObject interactiveStrings() {
        return this.interactiveStrings;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout
    public Map<String, TransitionDefinitions> visualStateTransitionDefinitions() {
        return this.visualStateTransitionDefinitions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_UiDefinition_Layout(StringsObject stringsObject, UiDefinition.Layout.Config config, UiDefinition.Layout.Elements elements, Map<String, TransitionDefinitions> map, Map<String, Map<String, List<InteractiveAnimation>>> map2, Map<String, UiDefinition.AudioListAsset> map3, AssetManifest assetManifest) {
        this.interactiveStrings = stringsObject;
        if (config == null) {
            throw new NullPointerException("Null config");
        }
        this.config = config;
        if (elements == null) {
            throw new NullPointerException("Null elements");
        }
        this.elements = elements;
        this.visualStateTransitionDefinitions = map;
        if (map2 == null) {
            throw new NullPointerException("Null elementAnimations");
        }
        this.elementAnimations = map2;
        this.audio = map3;
        this.assetManifest = assetManifest;
    }

    public String toString() {
        return "Layout{interactiveStrings=" + this.interactiveStrings + ", config=" + this.config + ", elements=" + this.elements + ", visualStateTransitionDefinitions=" + this.visualStateTransitionDefinitions + ", elementAnimations=" + this.elementAnimations + ", audio=" + this.audio + ", assetManifest=" + this.assetManifest + "}";
    }

    public boolean equals(Object obj) {
        Map<String, TransitionDefinitions> map;
        Map<String, UiDefinition.AudioListAsset> map2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof UiDefinition.Layout) {
            UiDefinition.Layout layout = (UiDefinition.Layout) obj;
            StringsObject stringsObject = this.interactiveStrings;
            if (stringsObject != null ? stringsObject.equals(layout.interactiveStrings()) : layout.interactiveStrings() == null) {
                if (this.config.equals(layout.config()) && this.elements.equals(layout.elements()) && ((map = this.visualStateTransitionDefinitions) != null ? map.equals(layout.visualStateTransitionDefinitions()) : layout.visualStateTransitionDefinitions() == null) && this.elementAnimations.equals(layout.elementAnimations()) && ((map2 = this.audio) != null ? map2.equals(layout.audio()) : layout.audio() == null)) {
                    AssetManifest assetManifest = this.assetManifest;
                    if (assetManifest == null) {
                        if (layout.assetManifest() == null) {
                            return true;
                        }
                    } else if (assetManifest.equals(layout.assetManifest())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        StringsObject stringsObject = this.interactiveStrings;
        int hashCode = stringsObject == null ? 0 : stringsObject.hashCode();
        int hashCode2 = this.config.hashCode();
        int hashCode3 = this.elements.hashCode();
        Map<String, TransitionDefinitions> map = this.visualStateTransitionDefinitions;
        int hashCode4 = map == null ? 0 : map.hashCode();
        int hashCode5 = this.elementAnimations.hashCode();
        Map<String, UiDefinition.AudioListAsset> map2 = this.audio;
        int hashCode6 = map2 == null ? 0 : map2.hashCode();
        AssetManifest assetManifest = this.assetManifest;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ (assetManifest != null ? assetManifest.hashCode() : 0);
    }
}
