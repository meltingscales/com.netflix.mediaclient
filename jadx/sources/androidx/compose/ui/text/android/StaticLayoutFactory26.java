package androidx.compose.ui.text.android;

import android.text.StaticLayout;

/* loaded from: classes.dex */
final class StaticLayoutFactory26 {
    public static final StaticLayoutFactory26 INSTANCE = new StaticLayoutFactory26();

    private StaticLayoutFactory26() {
    }

    public static final void setJustificationMode(StaticLayout.Builder builder, int i) {
        builder.setJustificationMode(i);
    }
}
