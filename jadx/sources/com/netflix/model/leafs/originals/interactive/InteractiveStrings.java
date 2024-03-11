package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$$AutoValue_InteractiveStrings;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_InteractiveStrings;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class InteractiveStrings implements Parcelable {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract InteractiveStrings build();

        public abstract Builder category(String str);

        public abstract Builder categoryAccessibilityDescription(String str);

        public abstract Builder currentScore(String str);

        public abstract Builder earned(String str);

        public abstract Builder header(String str);

        public abstract Builder mappings(Map<String, String> map);

        public abstract Builder maxScore(String str);

        public abstract Builder nextPlayerHeader(String str);

        public abstract Builder nextPlayerSubHeader(String str);

        public abstract Builder p1Score(String str);

        public abstract Builder pointsToUnlock(String str);

        public abstract Builder preconditionTokens(Map<String, String> map);

        public abstract Builder question(String str);

        public abstract Builder score(String str);

        public abstract Builder scoreAccessibilityDescription(String str);

        public abstract Builder share(String str);

        public abstract Builder subHeader(String str);

        public abstract Builder targetScore(String str);

        public abstract Builder theme(String str);

        public abstract Builder unlock(String str);

        public abstract Builder unlockAccessibilityDescription(String str);
    }

    public abstract String category();

    public abstract String categoryAccessibilityDescription();

    public abstract String currentScore();

    public abstract String earned();

    public abstract String header();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<String, String> mappings();

    public abstract String maxScore();

    public abstract String nextPlayerHeader();

    public abstract String nextPlayerSubHeader();

    public abstract String p1Score();

    public abstract String pointsToUnlock();

    public abstract Map<String, String> preconditionTokens();

    public abstract String question();

    public abstract String score();

    public abstract String scoreAccessibilityDescription();

    public abstract String share();

    public abstract String subHeader();

    public abstract String targetScore();

    public abstract String theme();

    public abstract Builder toBuilder();

    public abstract String unlock();

    public abstract String unlockAccessibilityDescription();

    public InteractiveStrings merge(InteractiveStrings interactiveStrings) {
        Map<String, String> preconditionTokens;
        Map<String, String> mappings;
        if (interactiveStrings == null) {
            return this;
        }
        String pointsToUnlock = pointsToUnlock();
        String unlock = unlock();
        String earned = earned();
        String score = score();
        String share = share();
        if (interactiveStrings.preconditionTokens() == null) {
            preconditionTokens = preconditionTokens();
        } else {
            preconditionTokens = interactiveStrings.preconditionTokens();
            if (preconditionTokens() != null) {
                preconditionTokens.putAll(preconditionTokens());
            }
        }
        Map<String, String> map = preconditionTokens;
        if (interactiveStrings.mappings() == null) {
            mappings = mappings();
        } else {
            mappings = interactiveStrings.mappings();
            if (mappings() != null) {
                mappings.putAll(mappings());
            }
        }
        Map<String, String> map2 = mappings;
        if (pointsToUnlock == null) {
            pointsToUnlock = interactiveStrings.pointsToUnlock();
        }
        String str = pointsToUnlock;
        String unlock2 = unlock == null ? interactiveStrings.unlock() : unlock();
        if (earned == null) {
            earned = interactiveStrings.earned();
        }
        String str2 = earned;
        if (score == null) {
            score = interactiveStrings.score();
        }
        String str3 = score;
        String maxScore = maxScore() == null ? interactiveStrings.maxScore() : maxScore();
        String question = question() == null ? interactiveStrings.question() : question();
        String category = category() == null ? interactiveStrings.category() : category();
        String scoreAccessibilityDescription = scoreAccessibilityDescription() == null ? interactiveStrings.scoreAccessibilityDescription() : scoreAccessibilityDescription();
        String unlockAccessibilityDescription = unlockAccessibilityDescription() == null ? interactiveStrings.unlockAccessibilityDescription() : unlockAccessibilityDescription();
        String categoryAccessibilityDescription = categoryAccessibilityDescription() == null ? interactiveStrings.categoryAccessibilityDescription() : categoryAccessibilityDescription();
        String theme = theme() == null ? interactiveStrings.theme() : theme();
        if (share == null) {
            share = interactiveStrings.share();
        }
        return new AutoValue_InteractiveStrings(str, unlock2, str2, str3, maxScore, question, category, scoreAccessibilityDescription, unlockAccessibilityDescription, categoryAccessibilityDescription, theme, share, header() == null ? interactiveStrings.header() : header(), targetScore() == null ? interactiveStrings.targetScore() : targetScore(), nextPlayerSubHeader() == null ? interactiveStrings.nextPlayerSubHeader() : nextPlayerSubHeader(), nextPlayerHeader() == null ? interactiveStrings.nextPlayerHeader() : nextPlayerHeader(), subHeader() == null ? interactiveStrings.subHeader() : subHeader(), currentScore() == null ? interactiveStrings.currentScore() : currentScore(), p1Score() == null ? interactiveStrings.p1Score() : p1Score(), map, map2);
    }

    public static Builder builder() {
        return new C$$AutoValue_InteractiveStrings.Builder();
    }

    public static TypeAdapter<InteractiveStrings> typeAdapter(Gson gson) {
        return new C$AutoValue_InteractiveStrings.GsonTypeAdapter(gson);
    }
}
