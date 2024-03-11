package androidx.compose.material.ripple;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import o.drO;

/* loaded from: classes.dex */
public final class RippleThemeKt {
    private static final ProvidableCompositionLocal<RippleTheme> LocalRippleTheme = CompositionLocalKt.staticCompositionLocalOf(new drO<RippleTheme>() { // from class: androidx.compose.material.ripple.RippleThemeKt$LocalRippleTheme$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final RippleTheme invoke() {
            return DebugRippleTheme.INSTANCE;
        }
    });
    private static final RippleAlpha LightThemeHighContrastRippleAlpha = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);
    private static final RippleAlpha LightThemeLowContrastRippleAlpha = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);
    private static final RippleAlpha DarkThemeRippleAlpha = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);

    public static final ProvidableCompositionLocal<RippleTheme> getLocalRippleTheme() {
        return LocalRippleTheme;
    }
}
