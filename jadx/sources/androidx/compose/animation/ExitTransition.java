package androidx.compose.animation;

import java.util.Map;
import o.C8627dsp;
import o.C8632dsu;
import o.dqE;

/* loaded from: classes.dex */
public abstract class ExitTransition {
    public static final Companion Companion = new Companion(null);
    private static final ExitTransition None = new ExitTransitionImpl(new TransitionData(null, null, null, null, false, null, 63, null));
    private static final ExitTransition KeepUntilTransitionsFinished = new ExitTransitionImpl(new TransitionData(null, null, null, null, true, null, 47, null));

    public /* synthetic */ ExitTransition(C8627dsp c8627dsp) {
        this();
    }

    public abstract TransitionData getData$animation_release();

    private ExitTransition() {
    }

    public final ExitTransition plus(ExitTransition exitTransition) {
        Map e;
        Fade fade = getData$animation_release().getFade();
        if (fade == null) {
            fade = exitTransition.getData$animation_release().getFade();
        }
        Fade fade2 = fade;
        Slide slide = getData$animation_release().getSlide();
        if (slide == null) {
            slide = exitTransition.getData$animation_release().getSlide();
        }
        Slide slide2 = slide;
        ChangeSize changeSize = getData$animation_release().getChangeSize();
        if (changeSize == null) {
            changeSize = exitTransition.getData$animation_release().getChangeSize();
        }
        ChangeSize changeSize2 = changeSize;
        Scale scale = getData$animation_release().getScale();
        if (scale == null) {
            scale = exitTransition.getData$animation_release().getScale();
        }
        Scale scale2 = scale;
        boolean z = getData$animation_release().getHold() || exitTransition.getData$animation_release().getHold();
        e = dqE.e((Map) getData$animation_release().getEffectsMap(), (Map) exitTransition.getData$animation_release().getEffectsMap());
        return new ExitTransitionImpl(new TransitionData(fade2, slide2, changeSize2, scale2, z, e));
    }

    public boolean equals(Object obj) {
        return (obj instanceof ExitTransition) && C8632dsu.c(((ExitTransition) obj).getData$animation_release(), getData$animation_release());
    }

    public String toString() {
        if (C8632dsu.c(this, None)) {
            return "ExitTransition.None";
        }
        if (C8632dsu.c(this, KeepUntilTransitionsFinished)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        TransitionData data$animation_release = getData$animation_release();
        StringBuilder sb = new StringBuilder();
        sb.append("ExitTransition: \nFade - ");
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(data$animation_release.getHold());
        return sb.toString();
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

        public final ExitTransition getNone() {
            return ExitTransition.None;
        }
    }
}
