package com.netflix.model.leafs.originals.interactive.animations;

import android.os.Parcelable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.animations.C$AutoValue_Ease;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class Ease implements Parcelable {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ANIMATION_EASE_TYPE {
        public static final String CUBIC_BEZIER = "cubic-bezier";
        public static final String IN_OUT = "ease-in-out-cubic";
        public static final String LINEAR = "linear";
        public static final String PATH = "path";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<String, Float> flags();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String type();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Interpolator getInterpolator() {
        char c;
        String type = type();
        switch (type.hashCode()) {
            case -1102672091:
                if (type.equals(ANIMATION_EASE_TYPE.LINEAR)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -741741342:
                if (type.equals(ANIMATION_EASE_TYPE.IN_OUT)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3433509:
                if (type.equals(ANIMATION_EASE_TYPE.PATH)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2146926274:
                if (type.equals(ANIMATION_EASE_TYPE.CUBIC_BEZIER)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            Map<String, Float> flags = flags();
            if (flags == null) {
                return new LinearInterpolator();
            }
            Float f = flags.get("x1");
            Float f2 = flags.get("y1");
            Float f3 = flags.get("x2");
            Float f4 = flags.get("y2");
            if (flags.size() == 2 && f != null && f2 != null) {
                return new PathInterpolator(f.floatValue(), f2.floatValue());
            }
            if (flags.size() == 4 && f != null && f2 != null && f3 != null && f4 != null) {
                return new PathInterpolator(f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue());
            }
            return new LinearInterpolator();
        }
        if (c == 2) {
            new PathInterpolator(0.25f, 0.25f, 0.75f, 0.75f);
        }
        return new LinearInterpolator();
    }

    public static TypeAdapter<Ease> typeAdapter(Gson gson) {
        return new C$AutoValue_Ease.GsonTypeAdapter(gson);
    }
}
