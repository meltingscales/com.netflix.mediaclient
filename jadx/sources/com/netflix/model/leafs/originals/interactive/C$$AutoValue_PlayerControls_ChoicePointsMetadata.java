package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.PlayerControls;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_PlayerControls_ChoicePointsMetadata  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_PlayerControls_ChoicePointsMetadata extends PlayerControls.ChoicePointsMetadata {
    private final AssetManifest assetManifest;
    private final PlayerControls.ChoicePointsMetadata.Cell cell;
    private final Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> choicePoints;
    private final Map<String, PlayerControls.ChoicePointsMetadata.Choice> choices;
    private final PlayerControls.ChoicePointsMetadata.Container container;

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata
    public AssetManifest assetManifest() {
        return this.assetManifest;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata
    public PlayerControls.ChoicePointsMetadata.Cell cell() {
        return this.cell;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata
    public Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> choicePoints() {
        return this.choicePoints;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata
    public Map<String, PlayerControls.ChoicePointsMetadata.Choice> choices() {
        return this.choices;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata
    public PlayerControls.ChoicePointsMetadata.Container container() {
        return this.container;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_PlayerControls_ChoicePointsMetadata(Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> map, Map<String, PlayerControls.ChoicePointsMetadata.Choice> map2, AssetManifest assetManifest, PlayerControls.ChoicePointsMetadata.Container container, PlayerControls.ChoicePointsMetadata.Cell cell) {
        this.choicePoints = map;
        this.choices = map2;
        this.assetManifest = assetManifest;
        this.container = container;
        this.cell = cell;
    }

    public String toString() {
        return "ChoicePointsMetadata{choicePoints=" + this.choicePoints + ", choices=" + this.choices + ", assetManifest=" + this.assetManifest + ", container=" + this.container + ", cell=" + this.cell + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerControls.ChoicePointsMetadata) {
            PlayerControls.ChoicePointsMetadata choicePointsMetadata = (PlayerControls.ChoicePointsMetadata) obj;
            Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> map = this.choicePoints;
            if (map != null ? map.equals(choicePointsMetadata.choicePoints()) : choicePointsMetadata.choicePoints() == null) {
                Map<String, PlayerControls.ChoicePointsMetadata.Choice> map2 = this.choices;
                if (map2 != null ? map2.equals(choicePointsMetadata.choices()) : choicePointsMetadata.choices() == null) {
                    AssetManifest assetManifest = this.assetManifest;
                    if (assetManifest != null ? assetManifest.equals(choicePointsMetadata.assetManifest()) : choicePointsMetadata.assetManifest() == null) {
                        PlayerControls.ChoicePointsMetadata.Container container = this.container;
                        if (container != null ? container.equals(choicePointsMetadata.container()) : choicePointsMetadata.container() == null) {
                            PlayerControls.ChoicePointsMetadata.Cell cell = this.cell;
                            if (cell == null) {
                                if (choicePointsMetadata.cell() == null) {
                                    return true;
                                }
                            } else if (cell.equals(choicePointsMetadata.cell())) {
                                return true;
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
        Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> map = this.choicePoints;
        int hashCode = map == null ? 0 : map.hashCode();
        Map<String, PlayerControls.ChoicePointsMetadata.Choice> map2 = this.choices;
        int hashCode2 = map2 == null ? 0 : map2.hashCode();
        AssetManifest assetManifest = this.assetManifest;
        int hashCode3 = assetManifest == null ? 0 : assetManifest.hashCode();
        PlayerControls.ChoicePointsMetadata.Container container = this.container;
        int hashCode4 = container == null ? 0 : container.hashCode();
        PlayerControls.ChoicePointsMetadata.Cell cell = this.cell;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (cell != null ? cell.hashCode() : 0);
    }
}
