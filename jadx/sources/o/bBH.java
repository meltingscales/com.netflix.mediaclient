package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen;
import com.slack.circuit.runtime.screen.Screen;
import o.InterfaceC8498dnv;

/* loaded from: classes4.dex */
public final class bBH implements InterfaceC8498dnv.d {
    @Override // o.InterfaceC8498dnv.d
    public InterfaceC8498dnv<?> a(Screen screen, C8495dns c8495dns) {
        C8632dsu.c((Object) screen, "");
        C8632dsu.c((Object) c8495dns, "");
        if (!(screen instanceof DeviceSheetScreen)) {
            if (screen instanceof ControllerScreen) {
                return new c();
            }
            return null;
        }
        return new e();
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC8498dnv<ControllerScreen.c> {
        @Override // o.InterfaceC8498dnv
        public void a(ControllerScreen.c cVar, Modifier modifier, Composer composer, int i) {
            C8632dsu.c((Object) cVar, "");
            C8632dsu.c((Object) modifier, "");
            composer.startReplaceableGroup(283114834);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(283114834, i, -1, "com.slack.circuit.runtime.ui.ui.<no name provided>.Content (Ui.kt:92)");
            }
            int i2 = (i & 14) | (i & 112);
            bBU.b(cVar, modifier, null, composer, (i2 & 14) | (i2 & 112), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC8498dnv<DeviceSheetScreen.a> {
        @Override // o.InterfaceC8498dnv
        public void a(DeviceSheetScreen.a aVar, Modifier modifier, Composer composer, int i) {
            C8632dsu.c((Object) aVar, "");
            C8632dsu.c((Object) modifier, "");
            composer.startReplaceableGroup(283114834);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(283114834, i, -1, "com.slack.circuit.runtime.ui.ui.<no name provided>.Content (Ui.kt:92)");
            }
            int i2 = (i & 14) | (i & 112);
            bBT.a(aVar, modifier, null, composer, (i2 & 14) | (i2 & 112), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
        }
    }
}
