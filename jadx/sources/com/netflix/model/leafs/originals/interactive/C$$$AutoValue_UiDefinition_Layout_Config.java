package com.netflix.model.leafs.originals.interactive;

import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.UiDefinition;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$$AutoValue_UiDefinition_Layout_Config  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$$AutoValue_UiDefinition_Layout_Config extends UiDefinition.Layout.Config {
    private final Boolean autoSelectChoiceOnTimeout;
    private final Size canvasSize;
    private final Integer choiceMaxWidth;
    private final Integer choiceMinWidth;
    private final Integer choiceSpacing;
    private final boolean choicesSupportFallbackLabel;
    private final Boolean disableToggleDefault;
    private final boolean enablePrefetchingDuringPlayback;
    private final boolean pauseAnimations;
    private final Boolean queueSelectedChoice;
    private final Integer resultsMaxWidth;
    private final UiDefinition.Layout.Config.SubtitleRect subRect;
    private final UiDefinition.Layout.Config.SubtitleRect subtitleRect;

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Config
    public Boolean autoSelectChoiceOnTimeout() {
        return this.autoSelectChoiceOnTimeout;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Config
    public Size canvasSize() {
        return this.canvasSize;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Config
    public Integer choiceMaxWidth() {
        return this.choiceMaxWidth;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Config
    public Integer choiceMinWidth() {
        return this.choiceMinWidth;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Config
    public Integer choiceSpacing() {
        return this.choiceSpacing;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Config
    public boolean choicesSupportFallbackLabel() {
        return this.choicesSupportFallbackLabel;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Config
    public Boolean disableToggleDefault() {
        return this.disableToggleDefault;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Config
    public boolean enablePrefetchingDuringPlayback() {
        return this.enablePrefetchingDuringPlayback;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Config
    public boolean pauseAnimations() {
        return this.pauseAnimations;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Config
    public Boolean queueSelectedChoice() {
        return this.queueSelectedChoice;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Config
    public Integer resultsMaxWidth() {
        return this.resultsMaxWidth;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Config
    @SerializedName("subtitlesRect")
    public UiDefinition.Layout.Config.SubtitleRect subRect() {
        return this.subRect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Config
    public UiDefinition.Layout.Config.SubtitleRect subtitleRect() {
        return this.subtitleRect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$$AutoValue_UiDefinition_Layout_Config(Size size, UiDefinition.Layout.Config.SubtitleRect subtitleRect, UiDefinition.Layout.Config.SubtitleRect subtitleRect2, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, boolean z, Boolean bool2, Boolean bool3, boolean z2, boolean z3) {
        if (size == null) {
            throw new NullPointerException("Null canvasSize");
        }
        this.canvasSize = size;
        this.subRect = subtitleRect;
        this.subtitleRect = subtitleRect2;
        this.queueSelectedChoice = bool;
        this.choiceMaxWidth = num;
        this.choiceMinWidth = num2;
        this.resultsMaxWidth = num3;
        this.choiceSpacing = num4;
        this.enablePrefetchingDuringPlayback = z;
        this.disableToggleDefault = bool2;
        this.autoSelectChoiceOnTimeout = bool3;
        this.choicesSupportFallbackLabel = z2;
        this.pauseAnimations = z3;
    }

    public String toString() {
        return "Config{canvasSize=" + this.canvasSize + ", subRect=" + this.subRect + ", subtitleRect=" + this.subtitleRect + ", queueSelectedChoice=" + this.queueSelectedChoice + ", choiceMaxWidth=" + this.choiceMaxWidth + ", choiceMinWidth=" + this.choiceMinWidth + ", resultsMaxWidth=" + this.resultsMaxWidth + ", choiceSpacing=" + this.choiceSpacing + ", enablePrefetchingDuringPlayback=" + this.enablePrefetchingDuringPlayback + ", disableToggleDefault=" + this.disableToggleDefault + ", autoSelectChoiceOnTimeout=" + this.autoSelectChoiceOnTimeout + ", choicesSupportFallbackLabel=" + this.choicesSupportFallbackLabel + ", pauseAnimations=" + this.pauseAnimations + "}";
    }

    public boolean equals(Object obj) {
        UiDefinition.Layout.Config.SubtitleRect subtitleRect;
        UiDefinition.Layout.Config.SubtitleRect subtitleRect2;
        Boolean bool;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Boolean bool2;
        Boolean bool3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof UiDefinition.Layout.Config) {
            UiDefinition.Layout.Config config = (UiDefinition.Layout.Config) obj;
            return this.canvasSize.equals(config.canvasSize()) && ((subtitleRect = this.subRect) != null ? subtitleRect.equals(config.subRect()) : config.subRect() == null) && ((subtitleRect2 = this.subtitleRect) != null ? subtitleRect2.equals(config.subtitleRect()) : config.subtitleRect() == null) && ((bool = this.queueSelectedChoice) != null ? bool.equals(config.queueSelectedChoice()) : config.queueSelectedChoice() == null) && ((num = this.choiceMaxWidth) != null ? num.equals(config.choiceMaxWidth()) : config.choiceMaxWidth() == null) && ((num2 = this.choiceMinWidth) != null ? num2.equals(config.choiceMinWidth()) : config.choiceMinWidth() == null) && ((num3 = this.resultsMaxWidth) != null ? num3.equals(config.resultsMaxWidth()) : config.resultsMaxWidth() == null) && ((num4 = this.choiceSpacing) != null ? num4.equals(config.choiceSpacing()) : config.choiceSpacing() == null) && this.enablePrefetchingDuringPlayback == config.enablePrefetchingDuringPlayback() && ((bool2 = this.disableToggleDefault) != null ? bool2.equals(config.disableToggleDefault()) : config.disableToggleDefault() == null) && ((bool3 = this.autoSelectChoiceOnTimeout) != null ? bool3.equals(config.autoSelectChoiceOnTimeout()) : config.autoSelectChoiceOnTimeout() == null) && this.choicesSupportFallbackLabel == config.choicesSupportFallbackLabel() && this.pauseAnimations == config.pauseAnimations();
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.canvasSize.hashCode();
        UiDefinition.Layout.Config.SubtitleRect subtitleRect = this.subRect;
        int hashCode2 = subtitleRect == null ? 0 : subtitleRect.hashCode();
        UiDefinition.Layout.Config.SubtitleRect subtitleRect2 = this.subtitleRect;
        int hashCode3 = subtitleRect2 == null ? 0 : subtitleRect2.hashCode();
        Boolean bool = this.queueSelectedChoice;
        int hashCode4 = bool == null ? 0 : bool.hashCode();
        Integer num = this.choiceMaxWidth;
        int hashCode5 = num == null ? 0 : num.hashCode();
        Integer num2 = this.choiceMinWidth;
        int hashCode6 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.resultsMaxWidth;
        int hashCode7 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.choiceSpacing;
        int hashCode8 = num4 == null ? 0 : num4.hashCode();
        int i = this.enablePrefetchingDuringPlayback ? 1231 : 1237;
        Boolean bool2 = this.disableToggleDefault;
        int hashCode9 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.autoSelectChoiceOnTimeout;
        int hashCode10 = bool3 != null ? bool3.hashCode() : 0;
        return ((((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ i) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ (this.choicesSupportFallbackLabel ? 1231 : 1237)) * 1000003) ^ (this.pauseAnimations ? 1231 : 1237);
    }
}
