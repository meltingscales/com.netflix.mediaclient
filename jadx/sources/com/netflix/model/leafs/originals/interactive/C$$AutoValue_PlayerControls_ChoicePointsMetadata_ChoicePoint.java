package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.PlayerControls;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint extends PlayerControls.ChoicePointsMetadata.ChoicePoint {
    private final List<String> choices;
    private final String description;
    private final ImageAssetId image;
    private final Long startTimeMs;

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.ChoicePoint
    public List<String> choices() {
        return this.choices;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.ChoicePoint
    public String description() {
        return this.description;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.ChoicePoint
    public ImageAssetId image() {
        return this.image;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.ChoicePoint
    public Long startTimeMs() {
        return this.startTimeMs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint(List<String> list, Long l, String str, ImageAssetId imageAssetId) {
        this.choices = list;
        this.startTimeMs = l;
        this.description = str;
        this.image = imageAssetId;
    }

    public String toString() {
        return "ChoicePoint{choices=" + this.choices + ", startTimeMs=" + this.startTimeMs + ", description=" + this.description + ", image=" + this.image + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerControls.ChoicePointsMetadata.ChoicePoint) {
            PlayerControls.ChoicePointsMetadata.ChoicePoint choicePoint = (PlayerControls.ChoicePointsMetadata.ChoicePoint) obj;
            List<String> list = this.choices;
            if (list != null ? list.equals(choicePoint.choices()) : choicePoint.choices() == null) {
                Long l = this.startTimeMs;
                if (l != null ? l.equals(choicePoint.startTimeMs()) : choicePoint.startTimeMs() == null) {
                    String str = this.description;
                    if (str != null ? str.equals(choicePoint.description()) : choicePoint.description() == null) {
                        ImageAssetId imageAssetId = this.image;
                        if (imageAssetId == null) {
                            if (choicePoint.image() == null) {
                                return true;
                            }
                        } else if (imageAssetId.equals(choicePoint.image())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        List<String> list = this.choices;
        int hashCode = list == null ? 0 : list.hashCode();
        Long l = this.startTimeMs;
        int hashCode2 = l == null ? 0 : l.hashCode();
        String str = this.description;
        int hashCode3 = str == null ? 0 : str.hashCode();
        ImageAssetId imageAssetId = this.image;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (imageAssetId != null ? imageAssetId.hashCode() : 0);
    }
}
