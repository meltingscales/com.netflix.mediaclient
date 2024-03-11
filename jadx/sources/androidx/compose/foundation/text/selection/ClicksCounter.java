package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.ViewConfiguration;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ClicksCounter {
    private int clicks;
    private PointerInputChange prevClick;
    private final ViewConfiguration viewConfiguration;

    public final int getClicks() {
        return this.clicks;
    }

    public ClicksCounter(ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    public final void update(PointerEvent pointerEvent) {
        PointerInputChange pointerInputChange = this.prevClick;
        PointerInputChange pointerInputChange2 = pointerEvent.getChanges().get(0);
        if (pointerInputChange != null && timeIsTolerable(pointerInputChange, pointerInputChange2) && positionIsTolerable(pointerInputChange, pointerInputChange2)) {
            this.clicks++;
        } else {
            this.clicks = 1;
        }
        this.prevClick = pointerInputChange2;
    }

    public final boolean timeIsTolerable(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return pointerInputChange2.getUptimeMillis() - pointerInputChange.getUptimeMillis() < this.viewConfiguration.getDoubleTapTimeoutMillis();
    }

    public final boolean positionIsTolerable(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return ((double) Offset.m1135getDistanceimpl(Offset.m1141minusMKHz9U(pointerInputChange2.m1729getPositionF1C5BW0(), pointerInputChange.m1729getPositionF1C5BW0()))) < 100.0d;
    }
}
