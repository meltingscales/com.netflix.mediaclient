package com.netflix.model.leafs.originals.interactive.animations;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.animations.C$$$AutoValue_InteractiveAnimation;
import com.netflix.model.leafs.originals.interactive.animations.C$AutoValue_InteractiveAnimation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class InteractiveAnimation implements Parcelable {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ANIMATION_TYPE {
        @Deprecated
        public static final String ALPHA = "alpha";
        public static final String HEIGHT = "height";
        public static final String OPACITY = "opacity";
        @Deprecated
        public static final String POSITION = "position";
        public static final String POSITION_X = "position.x";
        public static final String POSITION_Y = "position.y";
        public static final String ROTATION = "rotation";
        @Deprecated
        public static final String SCALE = "scale";
        public static final String SCALE_X = "scale.x";
        public static final String SCALE_Y = "scale.y";
        public static final String TRANSFORM_SCALE = "transform.scale";
        @Deprecated
        public static final String TRANSLATION = "translation";
        public static final String WIDTH = "width";
        @Deprecated
        public static final String X = "x";
        @Deprecated
        public static final String Y = "y";
    }

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract InteractiveAnimation build();

        public abstract Builder delay(long j);

        public abstract Builder delta(Float f);

        public abstract Builder duration(long j);

        public abstract Builder ease(Ease ease);

        public abstract Builder fromOrigin(boolean z);

        public abstract Builder fromValue(Float f);

        public abstract Builder pivot(Map<String, Float> map);

        public abstract Builder repeatCount(Integer num);

        public abstract Builder repeatSequenceCount(Integer num);

        public abstract Builder reverse(Boolean bool);

        public abstract Builder shouldBeRelativeToLastValue(boolean z);

        public abstract Builder toValue(Float f);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface States {
        public static final String dismissImmediate = "dismissImmediate";
        public static final String dismissNonFocusedSelectedTimeout = "dismissNonFocusedSelectedTimeout";
        public static final String dismissNonSelectedImmediate = "dismissNonSelectedImmediate";
        public static final String dismissNonSelectedLazy = "dismissNonSelectedLazy";
        public static final String dismissNonSelectedTimeout = "dismissNonSelectedTimeout";
        public static final String dismissNonSelectedTimeoutFallbackTutorial = "dismissNonSelectedTimeoutFallbackTutorial";
        public static final String dismissSelectedImmediate = "dismissSelectedImmediate";
        public static final String dismissSelectedLazy = "dismissSelectedLazy";
        public static final String dismissSelectedTimeout = "dismissSelectedTimeout";
        public static final String dismissTimeout = "dismissTimeout";
        public static final String dismissTimeoutFallbackTutorial = "dismissTimeoutFallbackTutorial";
        public static final String display = "display";
        public static final String displayNonSelectedResultsScaleDown = "displayNonSelectedResultsScaleDown";
        public static final String displayNonSelectedResultsScaleUp = "displayNonSelectedResultsScaleUp";
        public static final String displayResults = "displayResults";
        public static final String displaySameScore = "displaySameScore";
        public static final String displayScoreIncrease = "displayScoreIncrease";
        public static final String displaySelectedResultsScaleDown = "displaySelectedResultsScaleDown";
        public static final String displaySelectedResultsScaleUp = "displaySelectedResultsScaleUp";
        public static final String filterInChoice = "filterInChoice";
        public static final String filterNonSelectedOutChoice = "filterNonSelectedOutChoice";
        public static final String filterSelectedOutChoice = "filterSelectedOutChoice";
        public static final String focused = "focused";
        public static final String hide = "hide";
        public static final String init = "init";
        public static final String initUnfocused = "initUnfocused";
        public static final String selectedLazy = "selectedLazy";
        public static final String showLeftPointsEarned = "showLeftPointsEarned";
        public static final String showRightPointsEarned = "showRightPointsEarned";
        public static final String teardown = "teardown";
        public static final String unfocused = "unfocused";
        public static final String update = "update";
    }

    public abstract long delay();

    public abstract Float delta();

    public abstract long duration();

    public abstract Ease ease();

    public abstract boolean fromOrigin();

    public abstract Float fromValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<String, Float> pivot();

    public abstract Integer repeatCount();

    public abstract Integer repeatSequenceCount();

    public abstract Boolean reverse();

    public abstract boolean shouldBeRelativeToLastValue();

    public abstract Builder toBuilder();

    public abstract Float toValue();

    public float pivotX() {
        Map<String, Float> pivot = pivot();
        Float f = pivot != null ? pivot.get(ANIMATION_TYPE.X) : null;
        if (f == null) {
            return 0.5f;
        }
        return f.floatValue();
    }

    public float pivotY() {
        Map<String, Float> pivot = pivot();
        Float f = pivot != null ? pivot.get(ANIMATION_TYPE.Y) : null;
        if (f == null) {
            return 0.5f;
        }
        return f.floatValue();
    }

    public static TypeAdapter<InteractiveAnimation> typeAdapter(Gson gson) {
        return new C$AutoValue_InteractiveAnimation.GsonTypeAdapter(gson).setDefaultShouldBeRelativeToLastValue(false);
    }

    public static Builder builder() {
        return new C$$$AutoValue_InteractiveAnimation.Builder();
    }
}
