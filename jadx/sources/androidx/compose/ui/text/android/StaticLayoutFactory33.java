package androidx.compose.ui.text.android;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/* loaded from: classes.dex */
final class StaticLayoutFactory33 {
    public static final StaticLayoutFactory33 INSTANCE = new StaticLayoutFactory33();

    private StaticLayoutFactory33() {
    }

    public static final boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    public static final void setLineBreakConfig(StaticLayout.Builder builder, int i, int i2) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        lineBreakStyle = StaticLayoutFactory33$$ExternalSyntheticApiModelOutline5.m().setLineBreakStyle(i);
        lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i2);
        build = lineBreakWordStyle.build();
        builder.setLineBreakConfig(build);
    }
}
