package o;

import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;

/* renamed from: o.bym  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5440bym extends TransitionSet {
    public C5440bym() {
        d();
    }

    private final void d() {
        setOrdering(1);
        addTransition(new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)));
    }
}
