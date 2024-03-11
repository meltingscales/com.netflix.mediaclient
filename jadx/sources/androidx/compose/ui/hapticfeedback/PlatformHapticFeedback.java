package androidx.compose.ui.hapticfeedback;

import android.view.View;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;

/* loaded from: classes.dex */
public final class PlatformHapticFeedback implements HapticFeedback {
    private final View view;

    public PlatformHapticFeedback(View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.hapticfeedback.HapticFeedback
    /* renamed from: performHapticFeedback-CdsT49E */
    public void mo1603performHapticFeedbackCdsT49E(int i) {
        HapticFeedbackType.Companion companion = HapticFeedbackType.Companion;
        if (HapticFeedbackType.m1606equalsimpl0(i, companion.m1610getLongPress5zf0vsI())) {
            this.view.performHapticFeedback(0);
        } else if (HapticFeedbackType.m1606equalsimpl0(i, companion.m1611getTextHandleMove5zf0vsI())) {
            this.view.performHapticFeedback(9);
        }
    }
}
