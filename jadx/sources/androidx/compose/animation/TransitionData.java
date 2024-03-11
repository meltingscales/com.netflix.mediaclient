package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import java.util.Map;
import o.C8627dsp;
import o.C8632dsu;
import o.dqE;

/* loaded from: classes.dex */
public final class TransitionData {
    private final ChangeSize changeSize;
    private final Map<Object, ModifierNodeElement<? extends Modifier.Node>> effectsMap;
    private final Fade fade;
    private final boolean hold;
    private final Scale scale;
    private final Slide slide;

    public TransitionData() {
        this(null, null, null, null, false, null, 63, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransitionData) {
            TransitionData transitionData = (TransitionData) obj;
            return C8632dsu.c(this.fade, transitionData.fade) && C8632dsu.c(this.slide, transitionData.slide) && C8632dsu.c(this.changeSize, transitionData.changeSize) && C8632dsu.c(this.scale, transitionData.scale) && this.hold == transitionData.hold && C8632dsu.c(this.effectsMap, transitionData.effectsMap);
        }
        return false;
    }

    public final ChangeSize getChangeSize() {
        return this.changeSize;
    }

    public final Map<Object, ModifierNodeElement<? extends Modifier.Node>> getEffectsMap() {
        return this.effectsMap;
    }

    public final Fade getFade() {
        return this.fade;
    }

    public final boolean getHold() {
        return this.hold;
    }

    public final Scale getScale() {
        return this.scale;
    }

    public final Slide getSlide() {
        return this.slide;
    }

    public int hashCode() {
        Fade fade = this.fade;
        int hashCode = fade == null ? 0 : fade.hashCode();
        Slide slide = this.slide;
        int hashCode2 = slide == null ? 0 : slide.hashCode();
        ChangeSize changeSize = this.changeSize;
        int hashCode3 = changeSize == null ? 0 : changeSize.hashCode();
        Scale scale = this.scale;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (scale != null ? scale.hashCode() : 0)) * 31) + Boolean.hashCode(this.hold)) * 31) + this.effectsMap.hashCode();
    }

    public String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + ", hold=" + this.hold + ", effectsMap=" + this.effectsMap + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z, Map<Object, ? extends ModifierNodeElement<? extends Modifier.Node>> map) {
        this.fade = fade;
        this.slide = slide;
        this.changeSize = changeSize;
        this.scale = scale;
        this.hold = z;
        this.effectsMap = map;
    }

    public /* synthetic */ TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z, Map map, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : fade, (i & 2) != 0 ? null : slide, (i & 4) != 0 ? null : changeSize, (i & 8) == 0 ? scale : null, (i & 16) != 0 ? false : z, (i & 32) != 0 ? dqE.d() : map);
    }
}
