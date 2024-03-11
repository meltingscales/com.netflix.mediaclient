package o;

import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Token;
import o.C9834xU;
import o.LA;
import o.dpR;

/* loaded from: classes4.dex */
public final class cIP {
    public static final cIP b = new cIP();
    public static drX<Composer, Integer, dpR> c = ComposableLambdaKt.composableLambdaInstance(954519630, false, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.ComposableSingletons$PlayPauseButtonKt$lambda-1$1
        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return dpR.c;
        }

        public final void a(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(954519630, i, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.ComposableSingletons$PlayPauseButtonKt.lambda-1.<anonymous> (PlayPauseButton.kt:54)");
                }
                IconKt.m610Iconww6aTOc(PainterResources_androidKt.painterResource(HawkinsIcon.C0312gw.c.e(), composer, 0), StringResources_androidKt.stringResource(C9834xU.h.a, composer, 0), (Modifier) null, LA.c(Token.Color.cW.c, composer, 6), composer, 8, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });
    public static drX<Composer, Integer, dpR> e = ComposableLambdaKt.composableLambdaInstance(1826499056, false, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.ComposableSingletons$PlayPauseButtonKt$lambda-2$1
        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return dpR.c;
        }

        public final void b(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826499056, i, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.ComposableSingletons$PlayPauseButtonKt.lambda-2.<anonymous> (PlayPauseButton.kt:71)");
                }
                IconKt.m610Iconww6aTOc(PainterResources_androidKt.painterResource(HawkinsIcon.gG.e.e(), composer, 0), StringResources_androidKt.stringResource(C9834xU.h.b, composer, 0), (Modifier) null, LA.c(Token.Color.cW.c, composer, 6), composer, 8, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    public final drX<Composer, Integer, dpR> a() {
        return c;
    }

    public final drX<Composer, Integer, dpR> d() {
        return e;
    }
}
