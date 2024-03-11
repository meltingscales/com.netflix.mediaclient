package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.List;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$$AutoValue_InteractiveSummary_Features  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$$AutoValue_InteractiveSummary_Features extends InteractiveSummary.Features {
    private final String appUpdateDialogMessage;
    private final Double bookmarkOverrideSeconds;
    private final boolean choicePointDebugMenu;
    private final boolean customBookmark;
    private final boolean fallbackTutorial;
    private final boolean hideDetailedDurations;
    private final boolean hideSubtitlesMenuDuringPlayback;
    private final boolean interactiveAppUpdateDialogue;
    private final boolean interactiveTrailer;
    private final boolean ipp;
    private final boolean playbackGraph;
    private final boolean playerControlsPersistPlayPause;
    private final boolean playerControlsSnapshots;
    private final boolean pollingToggle;
    private final boolean prePlay;
    private final boolean resetUserState;
    private final List<String> supportedErrorDialogs;
    private final boolean videoMoments;

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public String appUpdateDialogMessage() {
        return this.appUpdateDialogMessage;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public Double bookmarkOverrideSeconds() {
        return this.bookmarkOverrideSeconds;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean choicePointDebugMenu() {
        return this.choicePointDebugMenu;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean customBookmark() {
        return this.customBookmark;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean fallbackTutorial() {
        return this.fallbackTutorial;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean hideDetailedDurations() {
        return this.hideDetailedDurations;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean hideSubtitlesMenuDuringPlayback() {
        return this.hideSubtitlesMenuDuringPlayback;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean interactiveAppUpdateDialogue() {
        return this.interactiveAppUpdateDialogue;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean interactiveTrailer() {
        return this.interactiveTrailer;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean ipp() {
        return this.ipp;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean playbackGraph() {
        return this.playbackGraph;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean playerControlsPersistPlayPause() {
        return this.playerControlsPersistPlayPause;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean playerControlsSnapshots() {
        return this.playerControlsSnapshots;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean pollingToggle() {
        return this.pollingToggle;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean prePlay() {
        return this.prePlay;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean resetUserState() {
        return this.resetUserState;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public List<String> supportedErrorDialogs() {
        return this.supportedErrorDialogs;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean videoMoments() {
        return this.videoMoments;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$$AutoValue_InteractiveSummary_Features(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str, List<String> list, boolean z13, Double d, boolean z14, boolean z15) {
        this.playbackGraph = z;
        this.videoMoments = z2;
        this.ipp = z3;
        this.prePlay = z4;
        this.customBookmark = z5;
        this.fallbackTutorial = z6;
        this.interactiveTrailer = z7;
        this.hideDetailedDurations = z8;
        this.interactiveAppUpdateDialogue = z9;
        this.resetUserState = z10;
        this.playerControlsSnapshots = z11;
        this.choicePointDebugMenu = z12;
        this.appUpdateDialogMessage = str;
        if (list == null) {
            throw new NullPointerException("Null supportedErrorDialogs");
        }
        this.supportedErrorDialogs = list;
        this.pollingToggle = z13;
        this.bookmarkOverrideSeconds = d;
        this.hideSubtitlesMenuDuringPlayback = z14;
        this.playerControlsPersistPlayPause = z15;
    }

    public String toString() {
        return "Features{playbackGraph=" + this.playbackGraph + ", videoMoments=" + this.videoMoments + ", ipp=" + this.ipp + ", prePlay=" + this.prePlay + ", customBookmark=" + this.customBookmark + ", fallbackTutorial=" + this.fallbackTutorial + ", interactiveTrailer=" + this.interactiveTrailer + ", hideDetailedDurations=" + this.hideDetailedDurations + ", interactiveAppUpdateDialogue=" + this.interactiveAppUpdateDialogue + ", resetUserState=" + this.resetUserState + ", playerControlsSnapshots=" + this.playerControlsSnapshots + ", choicePointDebugMenu=" + this.choicePointDebugMenu + ", appUpdateDialogMessage=" + this.appUpdateDialogMessage + ", supportedErrorDialogs=" + this.supportedErrorDialogs + ", pollingToggle=" + this.pollingToggle + ", bookmarkOverrideSeconds=" + this.bookmarkOverrideSeconds + ", hideSubtitlesMenuDuringPlayback=" + this.hideSubtitlesMenuDuringPlayback + ", playerControlsPersistPlayPause=" + this.playerControlsPersistPlayPause + "}";
    }

    public boolean equals(Object obj) {
        String str;
        Double d;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InteractiveSummary.Features) {
            InteractiveSummary.Features features = (InteractiveSummary.Features) obj;
            return this.playbackGraph == features.playbackGraph() && this.videoMoments == features.videoMoments() && this.ipp == features.ipp() && this.prePlay == features.prePlay() && this.customBookmark == features.customBookmark() && this.fallbackTutorial == features.fallbackTutorial() && this.interactiveTrailer == features.interactiveTrailer() && this.hideDetailedDurations == features.hideDetailedDurations() && this.interactiveAppUpdateDialogue == features.interactiveAppUpdateDialogue() && this.resetUserState == features.resetUserState() && this.playerControlsSnapshots == features.playerControlsSnapshots() && this.choicePointDebugMenu == features.choicePointDebugMenu() && ((str = this.appUpdateDialogMessage) != null ? str.equals(features.appUpdateDialogMessage()) : features.appUpdateDialogMessage() == null) && this.supportedErrorDialogs.equals(features.supportedErrorDialogs()) && this.pollingToggle == features.pollingToggle() && ((d = this.bookmarkOverrideSeconds) != null ? d.equals(features.bookmarkOverrideSeconds()) : features.bookmarkOverrideSeconds() == null) && this.hideSubtitlesMenuDuringPlayback == features.hideSubtitlesMenuDuringPlayback() && this.playerControlsPersistPlayPause == features.playerControlsPersistPlayPause();
        }
        return false;
    }

    public int hashCode() {
        int i = this.playbackGraph ? 1231 : 1237;
        int i2 = this.videoMoments ? 1231 : 1237;
        int i3 = this.ipp ? 1231 : 1237;
        int i4 = this.prePlay ? 1231 : 1237;
        int i5 = this.customBookmark ? 1231 : 1237;
        int i6 = this.fallbackTutorial ? 1231 : 1237;
        int i7 = this.interactiveTrailer ? 1231 : 1237;
        int i8 = this.hideDetailedDurations ? 1231 : 1237;
        int i9 = this.interactiveAppUpdateDialogue ? 1231 : 1237;
        int i10 = this.resetUserState ? 1231 : 1237;
        int i11 = this.playerControlsSnapshots ? 1231 : 1237;
        int i12 = this.choicePointDebugMenu ? 1231 : 1237;
        String str = this.appUpdateDialogMessage;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.supportedErrorDialogs.hashCode();
        int i13 = this.pollingToggle ? 1231 : 1237;
        Double d = this.bookmarkOverrideSeconds;
        int hashCode3 = d != null ? d.hashCode() : 0;
        return ((((((((((((((((((((((((((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ i7) * 1000003) ^ i8) * 1000003) ^ i9) * 1000003) ^ i10) * 1000003) ^ i11) * 1000003) ^ i12) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ i13) * 1000003) ^ hashCode3) * 1000003) ^ (this.hideSubtitlesMenuDuringPlayback ? 1231 : 1237)) * 1000003) ^ (this.playerControlsPersistPlayPause ? 1231 : 1237);
    }
}
