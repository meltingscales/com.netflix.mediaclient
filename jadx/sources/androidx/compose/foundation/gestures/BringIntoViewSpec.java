package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.gestures.BringIntoViewSpec;

/* loaded from: classes.dex */
public interface BringIntoViewSpec {
    public static final Companion Companion = Companion.$$INSTANCE;

    float calculateScrollDistance(float f, float f2, float f3);

    default AnimationSpec<Float> getScrollAnimationSpec() {
        return Companion.getDefaultScrollAnimationSpec();
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final AnimationSpec<Float> DefaultScrollAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        private static final BringIntoViewSpec DefaultBringIntoViewSpec = new BringIntoViewSpec() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec$Companion$DefaultBringIntoViewSpec$1
            private final AnimationSpec<Float> scrollAnimationSpec = BringIntoViewSpec.Companion.$$INSTANCE.getDefaultScrollAnimationSpec();

            @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
            public AnimationSpec<Float> getScrollAnimationSpec() {
                return this.scrollAnimationSpec;
            }

            @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
            public float calculateScrollDistance(float f, float f2, float f3) {
                float f4 = f2 + f;
                if ((f < 0.0f || f4 > f3) && (f >= 0.0f || f4 <= f3)) {
                    float f5 = f4 - f3;
                    return Math.abs(f) < Math.abs(f5) ? f : f5;
                }
                return 0.0f;
            }
        };

        public final BringIntoViewSpec getDefaultBringIntoViewSpec$foundation_release() {
            return DefaultBringIntoViewSpec;
        }

        public final AnimationSpec<Float> getDefaultScrollAnimationSpec() {
            return DefaultScrollAnimationSpec;
        }

        private Companion() {
        }
    }
}
