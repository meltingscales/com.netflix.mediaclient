package o;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;

/* renamed from: o.crK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7176crK {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.String r15, final com.netflix.hawkins.consumer.icons.HawkinsIcon r16, androidx.compose.ui.Modifier r17, com.netflix.hawkins.consumer.tokens.Theme r18, o.drO<o.dpR> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7176crK.b(java.lang.String, com.netflix.hawkins.consumer.icons.HawkinsIcon, androidx.compose.ui.Modifier, com.netflix.hawkins.consumer.tokens.Theme, o.drO, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: o.crK$a */
    /* loaded from: classes4.dex */
    public static final class a implements RippleTheme {
        private final long a;

        a(Token.Color color, Theme theme) {
            this.a = LA.d(color, theme);
        }

        @Override // androidx.compose.material.ripple.RippleTheme
        /* renamed from: defaultColor-WaAFU9c */
        public long mo701defaultColorWaAFU9c(Composer composer, int i) {
            composer.startReplaceableGroup(1480821210);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1480821210, i, -1, "com.netflix.mediaclient.ui.offline.rippleTheme.<no name provided>.defaultColor (ButtonFullForSheet.kt:145)");
            }
            long m1292copywmQWz5c$default = Color.m1292copywmQWz5c$default(this.a, 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return m1292copywmQWz5c$default;
        }

        @Override // androidx.compose.material.ripple.RippleTheme
        public RippleAlpha rippleAlpha(Composer composer, int i) {
            composer.startReplaceableGroup(-1881123297);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1881123297, i, -1, "com.netflix.mediaclient.ui.offline.rippleTheme.<no name provided>.rippleAlpha (ButtonFullForSheet.kt:148)");
            }
            RippleAlpha rippleAlpha = new RippleAlpha(0.16f, Color.m1295getAlphaimpl(this.a), 0.08f, Color.m1295getAlphaimpl(this.a));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return rippleAlpha;
        }
    }

    public static final RippleTheme d(Theme theme, Token.Color color) {
        C8632dsu.c((Object) theme, "");
        C8632dsu.c((Object) color, "");
        return new a(color, theme);
    }
}
