package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ColorKt;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;

/* loaded from: classes3.dex */
public final class LA {
    public static final long c(Token.Color color, Composer composer, int i) {
        C8632dsu.c((Object) color, "");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-960112803, i, -1, "com.netflix.hawkins.consumer.tokens.compose.composeColor (Colors.kt:16)");
        }
        long d = d(color, (Theme) composer.consume(LC.e()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return d;
    }

    public static final long d(Token.Color color, Theme theme) {
        C8632dsu.c((Object) color, "");
        C8632dsu.c((Object) theme, "");
        Token.Color.iE iEVar = color.b().get(theme);
        if (iEVar != null) {
            return c(iEVar);
        }
        throw new IllegalArgumentException("Could not find " + theme + " color values");
    }

    public static final long e(Token.Color color) {
        C8632dsu.c((Object) color, "");
        return d(color, Theme.b);
    }

    private static final long c(Token.Color.iE iEVar) {
        return ColorKt.Color(iEVar.d(), iEVar.b(), iEVar.a(), iEVar.c());
    }
}
