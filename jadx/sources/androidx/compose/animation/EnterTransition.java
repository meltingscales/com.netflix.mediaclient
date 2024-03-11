package androidx.compose.animation;

import java.util.Map;
import o.C8627dsp;
import o.C8632dsu;
import o.dqE;

/* loaded from: classes.dex */
public abstract class EnterTransition {
    public static final Companion Companion = new Companion(null);
    private static final EnterTransition None = new EnterTransitionImpl(new TransitionData(null, null, null, null, false, null, 63, null));

    public /* synthetic */ EnterTransition(C8627dsp c8627dsp) {
        this();
    }

    public abstract TransitionData getData$animation_release();

    private EnterTransition() {
    }

    public final EnterTransition plus(EnterTransition enterTransition) {
        Map e;
        Fade fade = getData$animation_release().getFade();
        if (fade == null) {
            fade = enterTransition.getData$animation_release().getFade();
        }
        Fade fade2 = fade;
        Slide slide = getData$animation_release().getSlide();
        if (slide == null) {
            slide = enterTransition.getData$animation_release().getSlide();
        }
        Slide slide2 = slide;
        ChangeSize changeSize = getData$animation_release().getChangeSize();
        if (changeSize == null) {
            changeSize = enterTransition.getData$animation_release().getChangeSize();
        }
        ChangeSize changeSize2 = changeSize;
        Scale scale = getData$animation_release().getScale();
        if (scale == null) {
            scale = enterTransition.getData$animation_release().getScale();
        }
        Scale scale2 = scale;
        e = dqE.e((Map) getData$animation_release().getEffectsMap(), (Map) enterTransition.getData$animation_release().getEffectsMap());
        return new EnterTransitionImpl(new TransitionData(fade2, slide2, changeSize2, scale2, false, e, 16, null));
    }

    public String toString() {
        if (C8632dsu.c(this, None)) {
            return "EnterTransition.None";
        }
        TransitionData data$animation_release = getData$animation_release();
        StringBuilder sb = new StringBuilder();
        sb.append("EnterTransition: \nFade - ");
        Fade fade = data$animation_release.getFade();
        sb.append(fade != null ? fade.toString() : null);
        sb.append(",\nSlide - ");
        Slide slide = data$animation_release.getSlide();
        sb.append(slide != null ? slide.toString() : null);
        sb.append(",\nShrink - ");
        ChangeSize changeSize = data$animation_release.getChangeSize();
        sb.append(changeSize != null ? changeSize.toString() : null);
        sb.append(",\nScale - ");
        Scale scale = data$animation_release.getScale();
        sb.append(scale != null ? scale.toString() : null);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        return (obj instanceof EnterTransition) && C8632dsu.c(((EnterTransition) obj).getData$animation_release(), getData$animation_release());
    }

    public int hashCode() {
        return getData$animation_release().hashCode();
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final EnterTransition getNone() {
            return EnterTransition.None;
        }
    }
}
