package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.AutoValue_InteractiveSceneConfig_ChoiceDisplayRule;
import com.netflix.model.leafs.originals.interactive.C$$AutoValue_InteractiveSceneConfig;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_InteractiveSceneConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import o.C8168dfL;

/* loaded from: classes.dex */
public abstract class InteractiveSceneConfig implements Parcelable {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract Builder autoSelectChoiceOnTimeout(Boolean bool);

        public abstract InteractiveSceneConfig build();

        public abstract Builder choiceDisplayRules(List<ChoiceDisplayRule> list);

        public abstract Builder choiceDisplayStrategy(String str);

        public abstract Builder defaultChoiceOverrideChoiceIndex(Integer num);

        public abstract Builder defaultChoiceStrategy(String str);

        public abstract Builder disableToggleDefault(Boolean bool);

        public abstract Builder forceDefaultOnInitialVisit(Boolean bool);

        public abstract Builder hideSubtitlesMenuDuringPlayback(Boolean bool);

        public abstract Builder is4By3(boolean z);

        public abstract Builder isInterstitialPostplay(boolean z);

        public abstract Builder jumpImmediatelyOnTimeout(Boolean bool);

        public abstract Builder pausePlaybackOnEnter(boolean z);

        public abstract Builder prefetch(Prefetch prefetch);

        public abstract Builder queueSelectedChoice(Boolean bool);

        public abstract Builder randomizeDefault(Boolean bool);

        public abstract Builder transitionType(String str);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface DefaultChoiceStrategyType {
        public static final String OVERRIDE_DEFAULT_ON_FIRST_OCCURENCE = "overrideDefaultOnFirstOccurrence";
    }

    public abstract Boolean autoSelectChoiceOnTimeout();

    public abstract List<ChoiceDisplayRule> choiceDisplayRules();

    public abstract String choiceDisplayStrategy();

    public abstract Integer defaultChoiceOverrideChoiceIndex();

    public abstract String defaultChoiceStrategy();

    public abstract Boolean disableToggleDefault();

    public abstract Boolean forceDefaultOnInitialVisit();

    public abstract Boolean hideSubtitlesMenuDuringPlayback();

    public abstract boolean is4By3();

    public abstract boolean isInterstitialPostplay();

    public abstract Boolean jumpImmediatelyOnTimeout();

    public abstract boolean pausePlaybackOnEnter();

    public abstract Prefetch prefetch();

    public abstract Boolean queueSelectedChoice();

    public abstract Boolean randomizeDefault();

    public abstract Builder toBuilder();

    public abstract String transitionType();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InteractiveSceneConfig emptyConfig() {
        return new C$$AutoValue_InteractiveSceneConfig.Builder().is4By3(false).isInterstitialPostplay(false).pausePlaybackOnEnter(false).choiceDisplayRules(Collections.emptyList()).jumpImmediatelyOnTimeout(Boolean.FALSE).build();
    }

    public static TypeAdapter<InteractiveSceneConfig> typeAdapter(Gson gson) {
        return new C$AutoValue_InteractiveSceneConfig.GsonTypeAdapter(gson).setDefaultChoiceDisplayRules(Collections.emptyList()).setDefaultPausePlaybackOnEnter(false).setDefaultIs4By3(false).setDefaultIsInterstitialPostplay(false).setDefaultJumpImmediatelyOnTimeout(Boolean.FALSE);
    }

    /* loaded from: classes.dex */
    public static abstract class ChoiceDisplayRule {
        public abstract List<Choice> choices();

        public abstract String preconditionId();

        public static TypeAdapter<ChoiceDisplayRule> typeAdapter(Gson gson) {
            return new AutoValue_InteractiveSceneConfig_ChoiceDisplayRule.GsonTypeAdapter(gson);
        }
    }

    public List<Choice> preconditionChoice(String str) {
        if (C8168dfL.g(str)) {
            return null;
        }
        for (ChoiceDisplayRule choiceDisplayRule : choiceDisplayRules()) {
            if (C8168dfL.d(choiceDisplayRule.preconditionId(), str)) {
                return choiceDisplayRule.choices();
            }
        }
        return null;
    }
}
