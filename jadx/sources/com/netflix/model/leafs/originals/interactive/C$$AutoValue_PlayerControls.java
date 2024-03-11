package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.PlayerControls;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_PlayerControls  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_PlayerControls extends PlayerControls {
    private final PlayerControls.ChoicePointsMetadata choicePointsMetadata;
    private final PlayerControls.Config config;
    private final String headerText;
    private final PlayerControls.StoryLines storylines;

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls
    public PlayerControls.ChoicePointsMetadata choicePointsMetadata() {
        return this.choicePointsMetadata;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls
    public PlayerControls.Config config() {
        return this.config;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls
    public String headerText() {
        return this.headerText;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls
    public PlayerControls.StoryLines storylines() {
        return this.storylines;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_PlayerControls(PlayerControls.Config config, PlayerControls.StoryLines storyLines, PlayerControls.ChoicePointsMetadata choicePointsMetadata, String str) {
        if (config == null) {
            throw new NullPointerException("Null config");
        }
        this.config = config;
        this.storylines = storyLines;
        this.choicePointsMetadata = choicePointsMetadata;
        this.headerText = str;
    }

    public String toString() {
        return "PlayerControls{config=" + this.config + ", storylines=" + this.storylines + ", choicePointsMetadata=" + this.choicePointsMetadata + ", headerText=" + this.headerText + "}";
    }

    public boolean equals(Object obj) {
        PlayerControls.StoryLines storyLines;
        PlayerControls.ChoicePointsMetadata choicePointsMetadata;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerControls) {
            PlayerControls playerControls = (PlayerControls) obj;
            if (this.config.equals(playerControls.config()) && ((storyLines = this.storylines) != null ? storyLines.equals(playerControls.storylines()) : playerControls.storylines() == null) && ((choicePointsMetadata = this.choicePointsMetadata) != null ? choicePointsMetadata.equals(playerControls.choicePointsMetadata()) : playerControls.choicePointsMetadata() == null)) {
                String str = this.headerText;
                if (str == null) {
                    if (playerControls.headerText() == null) {
                        return true;
                    }
                } else if (str.equals(playerControls.headerText())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.config.hashCode();
        PlayerControls.StoryLines storyLines = this.storylines;
        int hashCode2 = storyLines == null ? 0 : storyLines.hashCode();
        PlayerControls.ChoicePointsMetadata choicePointsMetadata = this.choicePointsMetadata;
        int hashCode3 = choicePointsMetadata == null ? 0 : choicePointsMetadata.hashCode();
        String str = this.headerText;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (str != null ? str.hashCode() : 0);
    }
}
