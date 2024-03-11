package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig;
import java.util.List;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_InteractiveSceneConfig  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_InteractiveSceneConfig extends InteractiveSceneConfig {
    private final Boolean autoSelectChoiceOnTimeout;
    private final List<InteractiveSceneConfig.ChoiceDisplayRule> choiceDisplayRules;
    private final String choiceDisplayStrategy;
    private final Integer defaultChoiceOverrideChoiceIndex;
    private final String defaultChoiceStrategy;
    private final Boolean disableToggleDefault;
    private final Boolean forceDefaultOnInitialVisit;
    private final Boolean hideSubtitlesMenuDuringPlayback;
    private final boolean is4By3;
    private final boolean isInterstitialPostplay;
    private final Boolean jumpImmediatelyOnTimeout;
    private final boolean pausePlaybackOnEnter;
    private final Prefetch prefetch;
    private final Boolean queueSelectedChoice;
    private final Boolean randomizeDefault;
    private final String transitionType;

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig
    public Boolean autoSelectChoiceOnTimeout() {
        return this.autoSelectChoiceOnTimeout;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig
    public List<InteractiveSceneConfig.ChoiceDisplayRule> choiceDisplayRules() {
        return this.choiceDisplayRules;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig
    public String choiceDisplayStrategy() {
        return this.choiceDisplayStrategy;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig
    public Integer defaultChoiceOverrideChoiceIndex() {
        return this.defaultChoiceOverrideChoiceIndex;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig
    public String defaultChoiceStrategy() {
        return this.defaultChoiceStrategy;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig
    public Boolean disableToggleDefault() {
        return this.disableToggleDefault;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig
    public Boolean forceDefaultOnInitialVisit() {
        return this.forceDefaultOnInitialVisit;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig
    public Boolean hideSubtitlesMenuDuringPlayback() {
        return this.hideSubtitlesMenuDuringPlayback;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig
    public boolean is4By3() {
        return this.is4By3;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig
    public boolean isInterstitialPostplay() {
        return this.isInterstitialPostplay;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig
    public Boolean jumpImmediatelyOnTimeout() {
        return this.jumpImmediatelyOnTimeout;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig
    public boolean pausePlaybackOnEnter() {
        return this.pausePlaybackOnEnter;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig
    public Prefetch prefetch() {
        return this.prefetch;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig
    public Boolean queueSelectedChoice() {
        return this.queueSelectedChoice;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig
    public Boolean randomizeDefault() {
        return this.randomizeDefault;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig
    public String transitionType() {
        return this.transitionType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_InteractiveSceneConfig(boolean z, String str, List<InteractiveSceneConfig.ChoiceDisplayRule> list, boolean z2, String str2, Integer num, Boolean bool, Boolean bool2, boolean z3, Boolean bool3, Boolean bool4, Boolean bool5, String str3, Boolean bool6, Boolean bool7, Prefetch prefetch) {
        this.pausePlaybackOnEnter = z;
        this.choiceDisplayStrategy = str;
        if (list == null) {
            throw new NullPointerException("Null choiceDisplayRules");
        }
        this.choiceDisplayRules = list;
        this.isInterstitialPostplay = z2;
        this.defaultChoiceStrategy = str2;
        this.defaultChoiceOverrideChoiceIndex = num;
        this.autoSelectChoiceOnTimeout = bool;
        this.queueSelectedChoice = bool2;
        this.is4By3 = z3;
        this.randomizeDefault = bool3;
        this.forceDefaultOnInitialVisit = bool4;
        this.disableToggleDefault = bool5;
        this.transitionType = str3;
        this.jumpImmediatelyOnTimeout = bool6;
        this.hideSubtitlesMenuDuringPlayback = bool7;
        this.prefetch = prefetch;
    }

    public String toString() {
        return "InteractiveSceneConfig{pausePlaybackOnEnter=" + this.pausePlaybackOnEnter + ", choiceDisplayStrategy=" + this.choiceDisplayStrategy + ", choiceDisplayRules=" + this.choiceDisplayRules + ", isInterstitialPostplay=" + this.isInterstitialPostplay + ", defaultChoiceStrategy=" + this.defaultChoiceStrategy + ", defaultChoiceOverrideChoiceIndex=" + this.defaultChoiceOverrideChoiceIndex + ", autoSelectChoiceOnTimeout=" + this.autoSelectChoiceOnTimeout + ", queueSelectedChoice=" + this.queueSelectedChoice + ", is4By3=" + this.is4By3 + ", randomizeDefault=" + this.randomizeDefault + ", forceDefaultOnInitialVisit=" + this.forceDefaultOnInitialVisit + ", disableToggleDefault=" + this.disableToggleDefault + ", transitionType=" + this.transitionType + ", jumpImmediatelyOnTimeout=" + this.jumpImmediatelyOnTimeout + ", hideSubtitlesMenuDuringPlayback=" + this.hideSubtitlesMenuDuringPlayback + ", prefetch=" + this.prefetch + "}";
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        Integer num;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        String str3;
        Boolean bool6;
        Boolean bool7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InteractiveSceneConfig) {
            InteractiveSceneConfig interactiveSceneConfig = (InteractiveSceneConfig) obj;
            if (this.pausePlaybackOnEnter == interactiveSceneConfig.pausePlaybackOnEnter() && ((str = this.choiceDisplayStrategy) != null ? str.equals(interactiveSceneConfig.choiceDisplayStrategy()) : interactiveSceneConfig.choiceDisplayStrategy() == null) && this.choiceDisplayRules.equals(interactiveSceneConfig.choiceDisplayRules()) && this.isInterstitialPostplay == interactiveSceneConfig.isInterstitialPostplay() && ((str2 = this.defaultChoiceStrategy) != null ? str2.equals(interactiveSceneConfig.defaultChoiceStrategy()) : interactiveSceneConfig.defaultChoiceStrategy() == null) && ((num = this.defaultChoiceOverrideChoiceIndex) != null ? num.equals(interactiveSceneConfig.defaultChoiceOverrideChoiceIndex()) : interactiveSceneConfig.defaultChoiceOverrideChoiceIndex() == null) && ((bool = this.autoSelectChoiceOnTimeout) != null ? bool.equals(interactiveSceneConfig.autoSelectChoiceOnTimeout()) : interactiveSceneConfig.autoSelectChoiceOnTimeout() == null) && ((bool2 = this.queueSelectedChoice) != null ? bool2.equals(interactiveSceneConfig.queueSelectedChoice()) : interactiveSceneConfig.queueSelectedChoice() == null) && this.is4By3 == interactiveSceneConfig.is4By3() && ((bool3 = this.randomizeDefault) != null ? bool3.equals(interactiveSceneConfig.randomizeDefault()) : interactiveSceneConfig.randomizeDefault() == null) && ((bool4 = this.forceDefaultOnInitialVisit) != null ? bool4.equals(interactiveSceneConfig.forceDefaultOnInitialVisit()) : interactiveSceneConfig.forceDefaultOnInitialVisit() == null) && ((bool5 = this.disableToggleDefault) != null ? bool5.equals(interactiveSceneConfig.disableToggleDefault()) : interactiveSceneConfig.disableToggleDefault() == null) && ((str3 = this.transitionType) != null ? str3.equals(interactiveSceneConfig.transitionType()) : interactiveSceneConfig.transitionType() == null) && ((bool6 = this.jumpImmediatelyOnTimeout) != null ? bool6.equals(interactiveSceneConfig.jumpImmediatelyOnTimeout()) : interactiveSceneConfig.jumpImmediatelyOnTimeout() == null) && ((bool7 = this.hideSubtitlesMenuDuringPlayback) != null ? bool7.equals(interactiveSceneConfig.hideSubtitlesMenuDuringPlayback()) : interactiveSceneConfig.hideSubtitlesMenuDuringPlayback() == null)) {
                Prefetch prefetch = this.prefetch;
                if (prefetch == null) {
                    if (interactiveSceneConfig.prefetch() == null) {
                        return true;
                    }
                } else if (prefetch.equals(interactiveSceneConfig.prefetch())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = this.pausePlaybackOnEnter ? 1231 : 1237;
        String str = this.choiceDisplayStrategy;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.choiceDisplayRules.hashCode();
        int i2 = this.isInterstitialPostplay ? 1231 : 1237;
        String str2 = this.defaultChoiceStrategy;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.defaultChoiceOverrideChoiceIndex;
        int hashCode4 = num == null ? 0 : num.hashCode();
        Boolean bool = this.autoSelectChoiceOnTimeout;
        int hashCode5 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.queueSelectedChoice;
        int hashCode6 = bool2 == null ? 0 : bool2.hashCode();
        int i3 = this.is4By3 ? 1231 : 1237;
        Boolean bool3 = this.randomizeDefault;
        int hashCode7 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.forceDefaultOnInitialVisit;
        int hashCode8 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.disableToggleDefault;
        int hashCode9 = bool5 == null ? 0 : bool5.hashCode();
        String str3 = this.transitionType;
        int hashCode10 = str3 == null ? 0 : str3.hashCode();
        Boolean bool6 = this.jumpImmediatelyOnTimeout;
        int hashCode11 = bool6 == null ? 0 : bool6.hashCode();
        Boolean bool7 = this.hideSubtitlesMenuDuringPlayback;
        int hashCode12 = bool7 == null ? 0 : bool7.hashCode();
        Prefetch prefetch = this.prefetch;
        return ((((((((((((((((((((((((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ i2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ i3) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ hashCode11) * 1000003) ^ hashCode12) * 1000003) ^ (prefetch == null ? 0 : prefetch.hashCode());
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig
    public InteractiveSceneConfig.Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_InteractiveSceneConfig$Builder */
    /* loaded from: classes.dex */
    public static final class Builder extends InteractiveSceneConfig.Builder {
        private Boolean autoSelectChoiceOnTimeout;
        private List<InteractiveSceneConfig.ChoiceDisplayRule> choiceDisplayRules;
        private String choiceDisplayStrategy;
        private Integer defaultChoiceOverrideChoiceIndex;
        private String defaultChoiceStrategy;
        private Boolean disableToggleDefault;
        private Boolean forceDefaultOnInitialVisit;
        private Boolean hideSubtitlesMenuDuringPlayback;
        private Boolean is4By3;
        private Boolean isInterstitialPostplay;
        private Boolean jumpImmediatelyOnTimeout;
        private Boolean pausePlaybackOnEnter;
        private Prefetch prefetch;
        private Boolean queueSelectedChoice;
        private Boolean randomizeDefault;
        private String transitionType;

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.Builder
        public InteractiveSceneConfig.Builder autoSelectChoiceOnTimeout(Boolean bool) {
            this.autoSelectChoiceOnTimeout = bool;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.Builder
        public InteractiveSceneConfig.Builder choiceDisplayStrategy(String str) {
            this.choiceDisplayStrategy = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.Builder
        public InteractiveSceneConfig.Builder defaultChoiceOverrideChoiceIndex(Integer num) {
            this.defaultChoiceOverrideChoiceIndex = num;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.Builder
        public InteractiveSceneConfig.Builder defaultChoiceStrategy(String str) {
            this.defaultChoiceStrategy = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.Builder
        public InteractiveSceneConfig.Builder disableToggleDefault(Boolean bool) {
            this.disableToggleDefault = bool;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.Builder
        public InteractiveSceneConfig.Builder forceDefaultOnInitialVisit(Boolean bool) {
            this.forceDefaultOnInitialVisit = bool;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.Builder
        public InteractiveSceneConfig.Builder hideSubtitlesMenuDuringPlayback(Boolean bool) {
            this.hideSubtitlesMenuDuringPlayback = bool;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.Builder
        public InteractiveSceneConfig.Builder jumpImmediatelyOnTimeout(Boolean bool) {
            this.jumpImmediatelyOnTimeout = bool;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.Builder
        public InteractiveSceneConfig.Builder prefetch(Prefetch prefetch) {
            this.prefetch = prefetch;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.Builder
        public InteractiveSceneConfig.Builder queueSelectedChoice(Boolean bool) {
            this.queueSelectedChoice = bool;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.Builder
        public InteractiveSceneConfig.Builder randomizeDefault(Boolean bool) {
            this.randomizeDefault = bool;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.Builder
        public InteractiveSceneConfig.Builder transitionType(String str) {
            this.transitionType = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(InteractiveSceneConfig interactiveSceneConfig) {
            this.pausePlaybackOnEnter = Boolean.valueOf(interactiveSceneConfig.pausePlaybackOnEnter());
            this.choiceDisplayStrategy = interactiveSceneConfig.choiceDisplayStrategy();
            this.choiceDisplayRules = interactiveSceneConfig.choiceDisplayRules();
            this.isInterstitialPostplay = Boolean.valueOf(interactiveSceneConfig.isInterstitialPostplay());
            this.defaultChoiceStrategy = interactiveSceneConfig.defaultChoiceStrategy();
            this.defaultChoiceOverrideChoiceIndex = interactiveSceneConfig.defaultChoiceOverrideChoiceIndex();
            this.autoSelectChoiceOnTimeout = interactiveSceneConfig.autoSelectChoiceOnTimeout();
            this.queueSelectedChoice = interactiveSceneConfig.queueSelectedChoice();
            this.is4By3 = Boolean.valueOf(interactiveSceneConfig.is4By3());
            this.randomizeDefault = interactiveSceneConfig.randomizeDefault();
            this.forceDefaultOnInitialVisit = interactiveSceneConfig.forceDefaultOnInitialVisit();
            this.disableToggleDefault = interactiveSceneConfig.disableToggleDefault();
            this.transitionType = interactiveSceneConfig.transitionType();
            this.jumpImmediatelyOnTimeout = interactiveSceneConfig.jumpImmediatelyOnTimeout();
            this.hideSubtitlesMenuDuringPlayback = interactiveSceneConfig.hideSubtitlesMenuDuringPlayback();
            this.prefetch = interactiveSceneConfig.prefetch();
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.Builder
        public InteractiveSceneConfig.Builder pausePlaybackOnEnter(boolean z) {
            this.pausePlaybackOnEnter = Boolean.valueOf(z);
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.Builder
        public InteractiveSceneConfig.Builder choiceDisplayRules(List<InteractiveSceneConfig.ChoiceDisplayRule> list) {
            if (list != null) {
                this.choiceDisplayRules = list;
                return this;
            }
            throw new NullPointerException("Null choiceDisplayRules");
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.Builder
        public InteractiveSceneConfig.Builder isInterstitialPostplay(boolean z) {
            this.isInterstitialPostplay = Boolean.valueOf(z);
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.Builder
        public InteractiveSceneConfig.Builder is4By3(boolean z) {
            this.is4By3 = Boolean.valueOf(z);
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.Builder
        public InteractiveSceneConfig build() {
            String str = "";
            if (this.pausePlaybackOnEnter == null) {
                str = " pausePlaybackOnEnter";
            }
            if (this.choiceDisplayRules == null) {
                str = str + " choiceDisplayRules";
            }
            if (this.isInterstitialPostplay == null) {
                str = str + " isInterstitialPostplay";
            }
            if (this.is4By3 == null) {
                str = str + " is4By3";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_InteractiveSceneConfig(this.pausePlaybackOnEnter.booleanValue(), this.choiceDisplayStrategy, this.choiceDisplayRules, this.isInterstitialPostplay.booleanValue(), this.defaultChoiceStrategy, this.defaultChoiceOverrideChoiceIndex, this.autoSelectChoiceOnTimeout, this.queueSelectedChoice, this.is4By3.booleanValue(), this.randomizeDefault, this.forceDefaultOnInitialVisit, this.disableToggleDefault, this.transitionType, this.jumpImmediatelyOnTimeout, this.hideSubtitlesMenuDuringPlayback, this.prefetch);
        }
    }
}
