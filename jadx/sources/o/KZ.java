package o;

import androidx.compose.ui.graphics.Color;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;

/* loaded from: classes3.dex */
public final class KZ {
    private final float a;
    private final long c;
    private final long e;

    public final float a() {
        return this.a;
    }

    public final long b() {
        return this.e;
    }

    public KZ(Theme theme, Token.Color color) {
        C8632dsu.c((Object) theme, "");
        C8632dsu.c((Object) color, "");
        long d = LA.d(color, theme);
        this.c = d;
        this.e = Color.m1292copywmQWz5c$default(d, 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
        this.a = Color.m1295getAlphaimpl(d);
    }
}
