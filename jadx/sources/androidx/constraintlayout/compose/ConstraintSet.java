package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.Measurable;
import java.util.List;

/* loaded from: classes.dex */
public interface ConstraintSet {
    void applyTo(State state, List<? extends Measurable> list);

    boolean isDirty(List<? extends Measurable> list);
}
