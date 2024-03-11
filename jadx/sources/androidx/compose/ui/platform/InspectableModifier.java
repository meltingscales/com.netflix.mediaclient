package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class InspectableModifier extends InspectorValueInfo implements Modifier.Element {
    private final End end;

    public final End getEnd() {
        return this.end;
    }

    /* loaded from: classes.dex */
    public final class End implements Modifier.Element {
        public End() {
        }
    }

    public InspectableModifier(drM<? super InspectorInfo, dpR> drm) {
        super(drm);
        this.end = new End();
    }
}
