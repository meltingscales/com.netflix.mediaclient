package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;

/* loaded from: classes.dex */
public final class ProgressIndicatorDefaults {
    private static final int CircularDeterminateStrokeCap;
    private static final int CircularIndeterminateStrokeCap;
    private static final int LinearStrokeCap;
    private static final SpringSpec<Float> ProgressAnimationSpec;
    public static final ProgressIndicatorDefaults INSTANCE = new ProgressIndicatorDefaults();
    private static final float CircularStrokeWidth = CircularProgressIndicatorTokens.INSTANCE.m842getActiveIndicatorWidthD9Ej5fM();

    /* renamed from: getCircularDeterminateStrokeCap-KaPHkGw  reason: not valid java name */
    public final int m801getCircularDeterminateStrokeCapKaPHkGw() {
        return CircularDeterminateStrokeCap;
    }

    /* renamed from: getCircularIndeterminateStrokeCap-KaPHkGw  reason: not valid java name */
    public final int m802getCircularIndeterminateStrokeCapKaPHkGw() {
        return CircularIndeterminateStrokeCap;
    }

    /* renamed from: getCircularStrokeWidth-D9Ej5fM  reason: not valid java name */
    public final float m803getCircularStrokeWidthD9Ej5fM() {
        return CircularStrokeWidth;
    }

    /* renamed from: getLinearStrokeCap-KaPHkGw  reason: not valid java name */
    public final int m804getLinearStrokeCapKaPHkGw() {
        return LinearStrokeCap;
    }

    private ProgressIndicatorDefaults() {
    }

    public final long getLinearColor(Composer composer, int i) {
        composer.startReplaceableGroup(-914312983);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-914312983, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:597)");
        }
        long value = ColorSchemeKt.getValue(LinearProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    public final long getCircularColor(Composer composer, int i) {
        composer.startReplaceableGroup(1803349725);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1803349725, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:601)");
        }
        long value = ColorSchemeKt.getValue(CircularProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    public final long getLinearTrackColor(Composer composer, int i) {
        composer.startReplaceableGroup(1677541593);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1677541593, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:605)");
        }
        long value = ColorSchemeKt.getValue(LinearProgressIndicatorTokens.INSTANCE.getTrackColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    public final long getCircularTrackColor(Composer composer, int i) {
        composer.startReplaceableGroup(-404222247);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-404222247, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularTrackColor> (ProgressIndicator.kt:608)");
        }
        long m1308getTransparent0d7_KjU = Color.Companion.m1308getTransparent0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1308getTransparent0d7_KjU;
    }

    static {
        StrokeCap.Companion companion = StrokeCap.Companion;
        LinearStrokeCap = companion.m1448getButtKaPHkGw();
        CircularDeterminateStrokeCap = companion.m1448getButtKaPHkGw();
        CircularIndeterminateStrokeCap = companion.m1450getSquareKaPHkGw();
        ProgressAnimationSpec = new SpringSpec<>(1.0f, 50.0f, Float.valueOf(0.001f));
    }
}
