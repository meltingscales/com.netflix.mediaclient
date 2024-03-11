package androidx.compose.material.ripple;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DebugRippleTheme implements RippleTheme {
    public static final DebugRippleTheme INSTANCE = new DebugRippleTheme();

    private DebugRippleTheme() {
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    /* renamed from: defaultColor-WaAFU9c  reason: not valid java name */
    public long mo701defaultColorWaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(2042140174);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2042140174, i, -1, "androidx.compose.material.ripple.DebugRippleTheme.defaultColor (RippleTheme.kt:214)");
        }
        long m712defaultRippleColor5vOe2sY = RippleTheme.Companion.m712defaultRippleColor5vOe2sY(Color.Companion.m1303getBlack0d7_KjU(), true);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m712defaultRippleColor5vOe2sY;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    public RippleAlpha rippleAlpha(Composer composer, int i) {
        composer.startReplaceableGroup(-1629816343);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1629816343, i, -1, "androidx.compose.material.ripple.DebugRippleTheme.rippleAlpha (RippleTheme.kt:217)");
        }
        RippleAlpha m711defaultRippleAlphaDxMtmZc = RippleTheme.Companion.m711defaultRippleAlphaDxMtmZc(Color.Companion.m1303getBlack0d7_KjU(), true);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m711defaultRippleAlphaDxMtmZc;
    }
}
