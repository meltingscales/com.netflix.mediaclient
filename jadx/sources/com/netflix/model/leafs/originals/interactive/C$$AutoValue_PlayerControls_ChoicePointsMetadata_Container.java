package com.netflix.model.leafs.originals.interactive;

import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.PlayerControls;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_PlayerControls_ChoicePointsMetadata_Container  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_PlayerControls_ChoicePointsMetadata_Container extends PlayerControls.ChoicePointsMetadata.Container {
    private final PlayerControls.ChoicePointsMetadata.Container.ContainerData defaultData;
    private final PlayerControls.ChoicePointsMetadata.Container.ContainerData zoomed;

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.Container
    @SerializedName("default")
    public PlayerControls.ChoicePointsMetadata.Container.ContainerData defaultData() {
        return this.defaultData;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.Container
    public PlayerControls.ChoicePointsMetadata.Container.ContainerData zoomed() {
        return this.zoomed;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_PlayerControls_ChoicePointsMetadata_Container(PlayerControls.ChoicePointsMetadata.Container.ContainerData containerData, PlayerControls.ChoicePointsMetadata.Container.ContainerData containerData2) {
        if (containerData == null) {
            throw new NullPointerException("Null defaultData");
        }
        this.defaultData = containerData;
        this.zoomed = containerData2;
    }

    public String toString() {
        return "Container{defaultData=" + this.defaultData + ", zoomed=" + this.zoomed + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerControls.ChoicePointsMetadata.Container) {
            PlayerControls.ChoicePointsMetadata.Container container = (PlayerControls.ChoicePointsMetadata.Container) obj;
            if (this.defaultData.equals(container.defaultData())) {
                PlayerControls.ChoicePointsMetadata.Container.ContainerData containerData = this.zoomed;
                if (containerData == null) {
                    if (container.zoomed() == null) {
                        return true;
                    }
                } else if (containerData.equals(container.zoomed())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.defaultData.hashCode();
        PlayerControls.ChoicePointsMetadata.Container.ContainerData containerData = this.zoomed;
        return ((hashCode ^ 1000003) * 1000003) ^ (containerData == null ? 0 : containerData.hashCode());
    }
}
