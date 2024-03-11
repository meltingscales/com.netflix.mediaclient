package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import o.C1020Ln;
import o.C8632dsu;
import o.bBM;
import o.dpR;
import o.drM;

/* renamed from: o.bDi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3586bDi {
    public static final C3586bDi c = new C3586bDi();
    public static InterfaceC8612dsa<RowScope, Composer, Integer, dpR> a = ComposableLambdaKt.composableLambdaInstance(-1118705987, false, new InterfaceC8612dsa<RowScope, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$ProfileMismatchResolutionSheetKt$lambda-1$1
        @Override // o.InterfaceC8612dsa
        public /* synthetic */ dpR invoke(RowScope rowScope, Composer composer, Integer num) {
            a(rowScope, composer, num.intValue());
            return dpR.c;
        }

        public final void a(RowScope rowScope, Composer composer, int i) {
            C8632dsu.c((Object) rowScope, "");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1118705987, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$ProfileMismatchResolutionSheetKt.lambda-1.<anonymous> (ProfileMismatchResolutionSheet.kt:201)");
                }
                C1020Ln.c(StringResources_androidKt.stringResource(bBM.c.a, composer, 0), (Modifier) null, (Token.Color) Token.Color.cW.c, (Theme) null, (Token.Typography) Token.Typography.C0693f.b, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (drM<? super TextLayoutResult, dpR>) null, composer, 24960, 0, 16362);
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
        return a;
    }
}
