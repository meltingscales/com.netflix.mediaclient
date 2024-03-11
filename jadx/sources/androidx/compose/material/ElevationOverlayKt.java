package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import o.drO;

/* loaded from: classes.dex */
public final class ElevationOverlayKt {
    private static final ProvidableCompositionLocal<ElevationOverlay> LocalElevationOverlay = CompositionLocalKt.staticCompositionLocalOf(new drO<ElevationOverlay>() { // from class: androidx.compose.material.ElevationOverlayKt$LocalElevationOverlay$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final ElevationOverlay invoke() {
            return DefaultElevationOverlay.INSTANCE;
        }
    });
    private static final ProvidableCompositionLocal<Dp> LocalAbsoluteElevation = CompositionLocalKt.compositionLocalOf$default(null, new drO<Dp>() { // from class: androidx.compose.material.ElevationOverlayKt$LocalAbsoluteElevation$1
        @Override // o.drO
        public /* synthetic */ Dp invoke() {
            return Dp.m2490boximpl(m596invokeD9Ej5fM());
        }

        /* renamed from: invoke-D9Ej5fM  reason: not valid java name */
        public final float m596invokeD9Ej5fM() {
            return Dp.m2492constructorimpl(0);
        }
    }, 1, null);

    public static final ProvidableCompositionLocal<Dp> getLocalAbsoluteElevation() {
        return LocalAbsoluteElevation;
    }

    public static final ProvidableCompositionLocal<ElevationOverlay> getLocalElevationOverlay() {
        return LocalElevationOverlay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateForegroundColor-CLU3JFs  reason: not valid java name */
    public static final long m595calculateForegroundColorCLU3JFs(long j, float f, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1613340891, i, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:86)");
        }
        long m1292copywmQWz5c$default = Color.m1292copywmQWz5c$default(ColorsKt.m571contentColorForek8zF_U(j, composer, i & 14), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1292copywmQWz5c$default;
    }
}
