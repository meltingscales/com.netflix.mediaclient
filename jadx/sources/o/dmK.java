package o;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import com.slack.circuit.runtime.screen.Screen;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes5.dex */
public final class dmK {
    public static final dmK b = new dmK();
    public static InterfaceC8613dsb<Screen, Modifier, Composer, Integer, dpR> c = ComposableLambdaKt.composableLambdaInstance(-1518521136, false, new InterfaceC8613dsb<Screen, Modifier, Composer, Integer, dpR>() { // from class: com.slack.circuit.foundation.ComposableSingletons$CircuitKt$lambda-1$1
        @Override // o.InterfaceC8613dsb
        public /* synthetic */ dpR invoke(Screen screen, Modifier modifier, Composer composer, Integer num) {
            c(screen, modifier, composer, num.intValue());
            return dpR.c;
        }

        public final void c(Screen screen, Modifier modifier, Composer composer, int i) {
            int i2;
            C8632dsu.c((Object) screen, "");
            C8632dsu.c((Object) modifier, "");
            if ((i & 14) == 0) {
                i2 = i | (composer.changed(screen) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i & 112) == 0) {
                i2 |= composer.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 731) != 146 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1518521136, i2, -1, "com.slack.circuit.foundation.ComposableSingletons$CircuitKt.lambda-1.<anonymous> (Circuit.kt:185)");
                }
                Color.Companion companion = Color.Companion;
                BasicTextKt.m405BasicTextVhcvRP8("Route not available: " + screen, BackgroundKt.m110backgroundbw27NRU$default(modifier, companion.m1307getRed0d7_KjU(), null, 2, null), new TextStyle(companion.m1311getYellow0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (C8627dsp) null), null, 0, false, 0, 0, null, composer, 384, 504);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    public final InterfaceC8613dsb<Screen, Modifier, Composer, Integer, dpR> c() {
        return c;
    }
}
