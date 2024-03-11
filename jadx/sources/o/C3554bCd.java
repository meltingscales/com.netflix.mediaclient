package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.netflix.hawkins.consumer.component.icon.HawkinsIconSize;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Token;
import o.KK;
import o.dpR;

/* renamed from: o.bCd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3554bCd {
    public static final C3554bCd d = new C3554bCd();
    public static drX<Composer, Integer, dpR> b = ComposableLambdaKt.composableLambdaInstance(-1366049865, false, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.components.ComposableSingletons$CondensedPlaybackMinimalKt$lambda-1$1
        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            d(composer, num.intValue());
            return dpR.c;
        }

        public final void d(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1366049865, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.components.ComposableSingletons$CondensedPlaybackMinimalKt.lambda-1.<anonymous> (CondensedPlaybackMinimal.kt:27)");
                }
                KK.c(HawkinsIcon.C0391jv.e, null, null, null, HawkinsIconSize.d, Token.Color.cW.c, composer, 221238, 12);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    public final drX<Composer, Integer, dpR> d() {
        return b;
    }
}
