package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.ui.R;
import o.C1020Ln;
import o.C8632dsu;
import o.LA;
import o.cIU;
import o.dpR;

/* loaded from: classes4.dex */
public final class cIV {
    public static final cIV e = new cIV();
    public static InterfaceC8612dsa<RowScope, Composer, Integer, dpR> b = ComposableLambdaKt.composableLambdaInstance(2080562983, false, new InterfaceC8612dsa<RowScope, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.ComposableSingletons$PlayerUnlockControlsButtonKt$lambda-1$1
        @Override // o.InterfaceC8612dsa
        public /* synthetic */ dpR invoke(RowScope rowScope, Composer composer, Integer num) {
            c(rowScope, composer, num.intValue());
            return dpR.c;
        }

        public final void c(RowScope rowScope, Composer composer, int i) {
            C8632dsu.c((Object) rowScope, "");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2080562983, i, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.ComposableSingletons$PlayerUnlockControlsButtonKt.lambda-1.<anonymous> (PlayerUnlockControlsButton.kt:78)");
                }
                Painter painterResource = PainterResources_androidKt.painterResource(HawkinsIcon.jB.b.i(), composer, 0);
                Token.Color.aG aGVar = Token.Color.aG.b;
                long e2 = LA.e(aGVar);
                Modifier.Companion companion = Modifier.Companion;
                IconKt.m610Iconww6aTOc(painterResource, (String) null, SizeKt.m295size3ABfNKs(companion, Dp.m2492constructorimpl(18)), e2, composer, 440, 0);
                SpacerKt.Spacer(SizeKt.m300width3ABfNKs(companion, cIU.d.a()), composer, 6);
                C1020Ln.b(StringResources_androidKt.stringResource(R.o.gP, composer, 0), LA.c(aGVar, composer, 6), companion, Token.Typography.C0694g.e, 0L, null, null, 0L, 0, false, 0, 0, null, composer, 3456, 0, 8176);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    public final InterfaceC8612dsa<RowScope, Composer, Integer, dpR> a() {
        return b;
    }
}
