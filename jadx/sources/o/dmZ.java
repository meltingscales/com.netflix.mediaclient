package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import o.dmW;

/* loaded from: classes5.dex */
public final class dmZ {
    private static final ProvidableCompositionLocal<dmW> e = CompositionLocalKt.compositionLocalOf$default(null, new drO<dmW>() { // from class: com.slack.circuit.overlay.OverlayKt$LocalOverlayHost$1
        @Override // o.drO
        /* renamed from: d */
        public final dmW invoke() {
            throw new IllegalStateException("No OverlayHost provided".toString());
        }
    }, 1, null);

    public static final ProvidableCompositionLocal<dmW> c() {
        return e;
    }

    public static final dmW d(Composer composer, int i) {
        composer.startReplaceableGroup(1818937971);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1818937971, i, -1, "com.slack.circuit.overlay.rememberOverlayHost (Overlay.kt:73)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new dmU();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        dmU dmu = (dmU) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dmu;
    }
}
