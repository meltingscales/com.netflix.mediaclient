package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8632dsu;

/* renamed from: o.Fs  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0869Fs {
    public static final Modifier c(Modifier modifier) {
        C8632dsu.c((Object) modifier, "");
        return ComposedModifierKt.composed$default(modifier, null, new InterfaceC8612dsa<Modifier, Composer, Integer, Modifier>() { // from class: com.netflix.clcs.extensions.AutoMirrorKt$autoMirror$1
            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return a(modifier2, composer, num.intValue());
            }

            public final Modifier a(Modifier modifier2, Composer composer, int i) {
                Modifier modifier3;
                C8632dsu.c((Object) modifier2, "");
                composer.startReplaceableGroup(1279589744);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1279589744, i, -1, "com.netflix.clcs.extensions.autoMirror.<anonymous> (AutoMirror.kt:12)");
                }
                if (composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    modifier3 = ScaleKt.scale(Modifier.Companion, -1.0f, 1.0f);
                } else {
                    modifier3 = Modifier.Companion;
                }
                Modifier then = modifier2.then(modifier3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return then;
            }
        }, 1, null);
    }
}
