package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import o.C8054ddD;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class TL {
    public static final Modifier d(Modifier modifier) {
        C8632dsu.c((Object) modifier, "");
        return ComposedModifierKt.composed$default(modifier, null, new InterfaceC8612dsa<Modifier, Composer, Integer, Modifier>() { // from class: com.netflix.mediaclient.android.widget.sheet.NavigationBarUtilsKt$navigationBarsPaddingCompat$1
            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return a(modifier2, composer, num.intValue());
            }

            public final Modifier a(Modifier modifier2, Composer composer, int i) {
                Modifier navigationBarsPadding;
                C8632dsu.c((Object) modifier2, "");
                composer.startReplaceableGroup(1370876109);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1370876109, i, -1, "com.netflix.mediaclient.android.widget.sheet.navigationBarsPaddingCompat.<anonymous> (NavigationBarUtils.kt:19)");
                }
                if (C8054ddD.c() < 30) {
                    Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                    Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    int identifier = resources.getIdentifier(((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1 ? "navigation_bar_height" : "navigation_bar_height_landscape", "dimen", "android");
                    navigationBarsPadding = PaddingKt.m277paddingqDBjuR0$default(modifier2, 0.0f, 0.0f, 0.0f, density.mo190toDpu2uoSUM(identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0), 7, null);
                } else {
                    navigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier2);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return navigationBarsPadding;
            }
        }, 1, null);
    }
}
