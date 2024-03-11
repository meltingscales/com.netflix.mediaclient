package com.netflix.model.leafs.originals.interactive;

import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.PlayerControls;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_PlayerControls_Config  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_PlayerControls_Config extends PlayerControls.Config {
    private final PlayerControls.Config.ImagesConfig images;
    private final String lockStrategy;
    private final int maxSnapshotsToDisplay;
    private final int maxSnapshotsToPersist;
    private final boolean playerControlsSnapshots;
    private final boolean playerControlsTenSecondsControls;
    private final String selectionType;
    private final String textDirectionString;

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.Config
    public PlayerControls.Config.ImagesConfig images() {
        return this.images;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.Config
    public String lockStrategy() {
        return this.lockStrategy;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.Config
    public int maxSnapshotsToDisplay() {
        return this.maxSnapshotsToDisplay;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.Config
    public int maxSnapshotsToPersist() {
        return this.maxSnapshotsToPersist;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.Config
    public boolean playerControlsSnapshots() {
        return this.playerControlsSnapshots;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.Config
    public boolean playerControlsTenSecondsControls() {
        return this.playerControlsTenSecondsControls;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.Config
    public String selectionType() {
        return this.selectionType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.Config
    @SerializedName("textDirection")
    public String textDirectionString() {
        return this.textDirectionString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_PlayerControls_Config(String str, int i, boolean z, int i2, boolean z2, String str2, String str3, PlayerControls.Config.ImagesConfig imagesConfig) {
        if (str == null) {
            throw new NullPointerException("Null lockStrategy");
        }
        this.lockStrategy = str;
        this.maxSnapshotsToDisplay = i;
        this.playerControlsSnapshots = z;
        this.maxSnapshotsToPersist = i2;
        this.playerControlsTenSecondsControls = z2;
        this.textDirectionString = str2;
        this.selectionType = str3;
        this.images = imagesConfig;
    }

    public String toString() {
        return "Config{lockStrategy=" + this.lockStrategy + ", maxSnapshotsToDisplay=" + this.maxSnapshotsToDisplay + ", playerControlsSnapshots=" + this.playerControlsSnapshots + ", maxSnapshotsToPersist=" + this.maxSnapshotsToPersist + ", playerControlsTenSecondsControls=" + this.playerControlsTenSecondsControls + ", textDirectionString=" + this.textDirectionString + ", selectionType=" + this.selectionType + ", images=" + this.images + "}";
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerControls.Config) {
            PlayerControls.Config config = (PlayerControls.Config) obj;
            if (this.lockStrategy.equals(config.lockStrategy()) && this.maxSnapshotsToDisplay == config.maxSnapshotsToDisplay() && this.playerControlsSnapshots == config.playerControlsSnapshots() && this.maxSnapshotsToPersist == config.maxSnapshotsToPersist() && this.playerControlsTenSecondsControls == config.playerControlsTenSecondsControls() && ((str = this.textDirectionString) != null ? str.equals(config.textDirectionString()) : config.textDirectionString() == null) && ((str2 = this.selectionType) != null ? str2.equals(config.selectionType()) : config.selectionType() == null)) {
                PlayerControls.Config.ImagesConfig imagesConfig = this.images;
                if (imagesConfig == null) {
                    if (config.images() == null) {
                        return true;
                    }
                } else if (imagesConfig.equals(config.images())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.lockStrategy.hashCode();
        int i = this.maxSnapshotsToDisplay;
        int i2 = this.playerControlsSnapshots ? 1231 : 1237;
        int i3 = this.maxSnapshotsToPersist;
        int i4 = this.playerControlsTenSecondsControls ? 1231 : 1237;
        String str = this.textDirectionString;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.selectionType;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        PlayerControls.Config.ImagesConfig imagesConfig = this.images;
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (imagesConfig != null ? imagesConfig.hashCode() : 0);
    }
}
