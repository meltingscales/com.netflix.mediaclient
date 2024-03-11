package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.PlayerControls;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData extends PlayerControls.ChoicePointsMetadata.Container.ContainerData {
    private final int itemSpacing;
    private final double renderHeight;

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.Container.ContainerData
    public int itemSpacing() {
        return this.itemSpacing;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.Container.ContainerData
    public double renderHeight() {
        return this.renderHeight;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData(double d, int i) {
        this.renderHeight = d;
        this.itemSpacing = i;
    }

    public String toString() {
        return "ContainerData{renderHeight=" + this.renderHeight + ", itemSpacing=" + this.itemSpacing + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerControls.ChoicePointsMetadata.Container.ContainerData) {
            PlayerControls.ChoicePointsMetadata.Container.ContainerData containerData = (PlayerControls.ChoicePointsMetadata.Container.ContainerData) obj;
            return Double.doubleToLongBits(this.renderHeight) == Double.doubleToLongBits(containerData.renderHeight()) && this.itemSpacing == containerData.itemSpacing();
        }
        return false;
    }

    public int hashCode() {
        return ((((int) ((Double.doubleToLongBits(this.renderHeight) >>> 32) ^ Double.doubleToLongBits(this.renderHeight))) ^ 1000003) * 1000003) ^ this.itemSpacing;
    }
}
