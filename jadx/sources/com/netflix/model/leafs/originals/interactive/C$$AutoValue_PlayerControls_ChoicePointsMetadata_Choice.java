package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.PlayerControls;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_PlayerControls_ChoicePointsMetadata_Choice  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_PlayerControls_ChoicePointsMetadata_Choice extends PlayerControls.ChoicePointsMetadata.Choice {
    private final String choicePoint;
    private final String description;
    private final ImageAssetId image;
    private final String segmentId;
    private final String startTimeMs;

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.Choice
    public String choicePoint() {
        return this.choicePoint;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.Choice
    public String description() {
        return this.description;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.Choice
    public ImageAssetId image() {
        return this.image;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.Choice
    public String segmentId() {
        return this.segmentId;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.Choice
    public String startTimeMs() {
        return this.startTimeMs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_PlayerControls_ChoicePointsMetadata_Choice(String str, String str2, String str3, String str4, ImageAssetId imageAssetId) {
        this.startTimeMs = str;
        this.choicePoint = str2;
        this.segmentId = str3;
        this.description = str4;
        this.image = imageAssetId;
    }

    public String toString() {
        return "Choice{startTimeMs=" + this.startTimeMs + ", choicePoint=" + this.choicePoint + ", segmentId=" + this.segmentId + ", description=" + this.description + ", image=" + this.image + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerControls.ChoicePointsMetadata.Choice) {
            PlayerControls.ChoicePointsMetadata.Choice choice = (PlayerControls.ChoicePointsMetadata.Choice) obj;
            String str = this.startTimeMs;
            if (str != null ? str.equals(choice.startTimeMs()) : choice.startTimeMs() == null) {
                String str2 = this.choicePoint;
                if (str2 != null ? str2.equals(choice.choicePoint()) : choice.choicePoint() == null) {
                    String str3 = this.segmentId;
                    if (str3 != null ? str3.equals(choice.segmentId()) : choice.segmentId() == null) {
                        String str4 = this.description;
                        if (str4 != null ? str4.equals(choice.description()) : choice.description() == null) {
                            ImageAssetId imageAssetId = this.image;
                            if (imageAssetId == null) {
                                if (choice.image() == null) {
                                    return true;
                                }
                            } else if (imageAssetId.equals(choice.image())) {
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
        String str = this.startTimeMs;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.choicePoint;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.segmentId;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.description;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        ImageAssetId imageAssetId = this.image;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (imageAssetId != null ? imageAssetId.hashCode() : 0);
    }
}
