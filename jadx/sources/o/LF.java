package o;

import android.graphics.Color;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;

/* loaded from: classes3.dex */
public final class LF {
    public static final int d(Token.Color.iE iEVar) {
        C8632dsu.c((Object) iEVar, "");
        return Color.argb(iEVar.c(), iEVar.d(), iEVar.b(), iEVar.a());
    }

    public static final int c(Token.Color color) {
        C8632dsu.c((Object) color, "");
        Token.Color.iE iEVar = color.b().get(Theme.b);
        if (iEVar != null) {
            return d(iEVar);
        }
        throw new Throwable("Could not find dark color values");
    }

    public static final int d(Token.Color color, Theme theme) {
        C8632dsu.c((Object) color, "");
        C8632dsu.c((Object) theme, "");
        Token.Color.iE iEVar = color.b().get(theme);
        if (iEVar != null) {
            return d(iEVar);
        }
        throw new Throwable("Could not find " + theme + " color values");
    }
}
