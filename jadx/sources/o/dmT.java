package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import o.InterfaceC8466dmq;

/* loaded from: classes5.dex */
public final class dmT {
    public static final InterfaceC8499dnw d(InterfaceC8466dmq<? extends InterfaceC8466dmq.a> interfaceC8466dmq, drO<dpR> dro, Composer composer, int i) {
        C8632dsu.c((Object) interfaceC8466dmq, "");
        C8632dsu.c((Object) dro, "");
        composer.startReplaceableGroup(599833337);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(599833337, i, -1, "com.slack.circuit.foundation.rememberCircuitNavigator (NavigatorImpl.kt:25)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new dmP(interfaceC8466dmq, dro);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        dmP dmp = (dmP) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dmp;
    }
}
