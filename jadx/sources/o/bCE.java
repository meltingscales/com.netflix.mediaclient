package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.netflix.hawkins.consumer.component.icon.HawkinsIconSize;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Token;
import o.KK;
import o.dpR;

/* loaded from: classes4.dex */
public final class bCE {
    public static final bCE c = new bCE();
    public static drX<Composer, Integer, dpR> a = ComposableLambdaKt.composableLambdaInstance(-1491943245, false, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.browse.ComposableSingletons$CondensedBrowseKt$lambda-1$1
        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            d(composer, num.intValue());
            return dpR.c;
        }

        public final void d(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1491943245, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.browse.ComposableSingletons$CondensedBrowseKt.lambda-1.<anonymous> (CondensedBrowse.kt:27)");
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
        return a;
    }
}
