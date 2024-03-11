package o;

import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.slack.circuit.foundation.Navigator_androidKt$backDispatcherRootPop$1;
import com.slack.circuit.foundation.Navigator_androidKt$rememberCircuitNavigator$1$1;
import o.InterfaceC8466dmq;

/* loaded from: classes5.dex */
public final class dmQ {
    public static final InterfaceC8499dnw a(InterfaceC8466dmq<? extends InterfaceC8466dmq.a> interfaceC8466dmq, boolean z, Composer composer, int i, int i2) {
        C8632dsu.c((Object) interfaceC8466dmq, "");
        composer.startReplaceableGroup(-320270904);
        boolean z2 = true;
        if ((i2 & 2) != 0) {
            z = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-320270904, i, -1, "com.slack.circuit.foundation.rememberCircuitNavigator (Navigator.android.kt:24)");
        }
        InterfaceC8499dnw d = dmT.d(interfaceC8466dmq, b(composer, 0), composer, i & 14);
        if (!z || interfaceC8466dmq.c() <= 1) {
            z2 = false;
        }
        composer.startReplaceableGroup(-1642904734);
        boolean changed = composer.changed(d);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Navigator_androidKt$rememberCircuitNavigator$1$1(d);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        BackHandlerKt.BackHandler(z2, (drO) rememberedValue, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return d;
    }

    private static final drO<dpR> b(Composer composer, int i) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        composer.startReplaceableGroup(2022430416);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2022430416, i, -1, "com.slack.circuit.foundation.backDispatcherRootPop (Navigator.android.kt:36)");
        }
        OnBackPressedDispatcherOwner current = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(composer, LocalOnBackPressedDispatcherOwner.$stable);
        if (current == null || (onBackPressedDispatcher = current.getOnBackPressedDispatcher()) == null) {
            throw new IllegalStateException("No OnBackPressedDispatcherOwner found, unable to handle root navigation pops.".toString());
        }
        Navigator_androidKt$backDispatcherRootPop$1 navigator_androidKt$backDispatcherRootPop$1 = new Navigator_androidKt$backDispatcherRootPop$1(onBackPressedDispatcher);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return navigator_androidKt$backDispatcherRootPop$1;
    }
}
