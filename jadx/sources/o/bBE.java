package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen;
import com.slack.circuit.runtime.screen.Screen;
import o.InterfaceC8496dnt;

/* loaded from: classes4.dex */
public final class bBE implements InterfaceC8496dnt.e {
    private final VE b;
    private final VK c;
    private final VJ d;
    private final VL e;

    public bBE(VE ve, VK vk, VL vl, VJ vj) {
        C8632dsu.c((Object) ve, "");
        C8632dsu.c((Object) vk, "");
        C8632dsu.c((Object) vl, "");
        C8632dsu.c((Object) vj, "");
        this.b = ve;
        this.c = vk;
        this.e = vl;
        this.d = vj;
    }

    @Override // o.InterfaceC8496dnt.e
    public InterfaceC8496dnt<?> e(Screen screen, InterfaceC8499dnw interfaceC8499dnw, C8495dns c8495dns) {
        C8632dsu.c((Object) screen, "");
        C8632dsu.c((Object) interfaceC8499dnw, "");
        C8632dsu.c((Object) c8495dns, "");
        if (!(screen instanceof DeviceSheetScreen)) {
            if (screen instanceof ControllerScreen) {
                return new b(interfaceC8499dnw, this);
            }
            return null;
        }
        return new a(interfaceC8499dnw, this);
    }

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC8496dnt<DeviceSheetScreen.a> {
        final /* synthetic */ InterfaceC8499dnw b;
        final /* synthetic */ bBE e;

        public a(InterfaceC8499dnw interfaceC8499dnw, bBE bbe) {
            this.b = interfaceC8499dnw;
            this.e = bbe;
        }

        @Override // o.InterfaceC8496dnt
        public DeviceSheetScreen.a e(Composer composer, int i) {
            composer.startReplaceableGroup(1566435440);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1566435440, i, -1, "com.slack.circuit.runtime.presenter.presenterOf.<no name provided>.present (Presenter.kt:173)");
            }
            composer.startReplaceableGroup(470504955);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(470504955, 0, -1, "com.netflix.mediaclient.ui.commander.impl.ControllerPresenterFactory.create.<anonymous> (CommanderCircuitFactories.kt:58)");
            }
            DeviceSheetScreen.a b = bBQ.b(this.b, new bBS(this.e.e.a(), this.e.e.b(), this.e.e.d(), this.e.c.d(), this.e.d.e(), this.e.b.c(), this.e.b.b(), this.e.c.a()), this.e.e.c(), composer, 576);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC8496dnt<ControllerScreen.c> {
        final /* synthetic */ bBE a;
        final /* synthetic */ InterfaceC8499dnw d;

        public b(InterfaceC8499dnw interfaceC8499dnw, bBE bbe) {
            this.d = interfaceC8499dnw;
            this.a = bbe;
        }

        @Override // o.InterfaceC8496dnt
        public ControllerScreen.c e(Composer composer, int i) {
            composer.startReplaceableGroup(1566435440);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1566435440, i, -1, "com.slack.circuit.runtime.presenter.presenterOf.<no name provided>.present (Presenter.kt:173)");
            }
            composer.startReplaceableGroup(-235962844);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-235962844, 0, -1, "com.netflix.mediaclient.ui.commander.impl.ControllerPresenterFactory.create.<anonymous> (CommanderCircuitFactories.kt:75)");
            }
            ControllerScreen.c d = bBP.d(this.d, new bBR(this.a.e.b(), this.a.d.e(), this.a.c.b(), this.a.d.b(), this.a.b.b(), this.a.d.a(), this.a.c.a(), this.a.b.c()), composer, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return d;
        }
    }
}
