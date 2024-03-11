package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.netflix.hawkins.consumer.tokens.Theme;
import o.LC;
import o.dpR;

/* loaded from: classes3.dex */
public final class LC {
    private static final ProvidableCompositionLocal<Theme> c = CompositionLocalKt.staticCompositionLocalOf(new drO<Theme>() { // from class: com.netflix.hawkins.consumer.tokens.compose.ThemesKt$LocalTheme$1
        @Override // o.drO
        /* renamed from: e */
        public final Theme invoke() {
            return Theme.b;
        }
    });

    public static final ProvidableCompositionLocal<Theme> e() {
        return c;
    }

    public static final void d(final Theme theme, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i, final int i2) {
        int i3;
        C8632dsu.c((Object) drx, "");
        Composer startRestartGroup = composer.startRestartGroup(2014193489);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(theme) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(drx) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                theme = Theme.b;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2014193489, i3, -1, "com.netflix.hawkins.consumer.tokens.compose.ProvideTheme (Themes.kt:28)");
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{c.provides(theme)}, drx, startRestartGroup, (i3 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.hawkins.consumer.tokens.compose.ThemesKt$ProvideTheme$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void d(Composer composer2, int i5) {
                    LC.d(Theme.this, drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    d(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
