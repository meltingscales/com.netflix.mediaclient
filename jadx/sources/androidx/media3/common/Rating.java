package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.Bundleable;
import androidx.media3.common.util.Util;

/* loaded from: classes2.dex */
public abstract class Rating implements Bundleable {
    static final String FIELD_RATING_TYPE = Util.intToStringMaxRadix(0);
    public static final Bundleable.Creator<Rating> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.Rating$$ExternalSyntheticLambda0
        @Override // androidx.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            Rating fromBundle;
            fromBundle = Rating.fromBundle(bundle);
            return fromBundle;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static Rating fromBundle(Bundle bundle) {
        int i = bundle.getInt(FIELD_RATING_TYPE, -1);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return ThumbRating.CREATOR.fromBundle(bundle);
                    }
                    throw new IllegalArgumentException("Unknown RatingType: " + i);
                }
                return StarRating.CREATOR.fromBundle(bundle);
            }
            return PercentageRating.CREATOR.fromBundle(bundle);
        }
        return HeartRating.CREATOR.fromBundle(bundle);
    }
}
